package by.vsu.cacheplugin.action;

import by.vsu.cacheplugin.service.ClassFile;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intersys.objects.CacheDatabase;
import com.intersys.objects.CacheException;
import com.intersys.objects.Database;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by kos on 21.11.2014.
 */
public class CacheServerCompile extends AnAction {
    private static Database db;

    public static Database createConnection() throws CacheException {
        String url="jdbc:Cache://localhost:1972/CACHE_REST";
        String username="";
        String pwd="";
        Database db = CacheDatabase.getDatabase(url, username, pwd);
        return db;
    }
    @Override
    public void actionPerformed(AnActionEvent event) {
        final Project project= DataKeys.PROJECT.getData(event.getDataContext());
        if (project == null) {
            return;
        }
        final VirtualFile[] selectedFiles=FileEditorManager.getInstance(project).getSelectedFiles();
        if (selectedFiles != null || selectedFiles.length != 0) {
            for (final VirtualFile file : selectedFiles) {
               try {
                  db = createConnection();
                  String fileName = file.getPath();
                  fileName = fileName.substring(fileName.indexOf("classes") + 8, fileName.length() - 4).replace("/",".");
                  ClassFile clsFile = new ClassFile(db, fileName);
                  clsFile.save(file.contentsToByteArray());
               } catch (CacheException ex) {
                   System.out.println("CompileException: " + ex.getLocalizedMessage());
                   ex.printStackTrace();
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               }
            }
        }
    }
}
