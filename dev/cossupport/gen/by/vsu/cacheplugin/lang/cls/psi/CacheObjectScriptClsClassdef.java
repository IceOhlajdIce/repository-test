// This is a generated file. Not intended for manual editing.
package by.vsu.cacheplugin.lang.cls.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CacheObjectScriptClsClassdef extends PsiElement {

  @NotNull
  CacheObjectScriptClsClassEntry getClassEntry();

  @NotNull
  CacheObjectScriptClsDefBlock getDefBlock();

  @Nullable
  CacheObjectScriptClsImportBlock getImportBlock();

  @Nullable
  CacheObjectScriptClsIncludeBlock getIncludeBlock();

}
