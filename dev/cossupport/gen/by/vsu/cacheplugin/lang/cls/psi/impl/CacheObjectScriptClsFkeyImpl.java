// This is a generated file. Not intended for manual editing.
package by.vsu.cacheplugin.lang.cls.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static by.vsu.cacheplugin.lang.cls.psi.CacheObjectScriptClsTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import by.vsu.cacheplugin.lang.cls.psi.*;

public class CacheObjectScriptClsFkeyImpl extends ASTWrapperPsiElement implements CacheObjectScriptClsFkey {

  public CacheObjectScriptClsFkeyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CacheObjectScriptClsVisitor) ((CacheObjectScriptClsVisitor)visitor).visitFkey(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CacheObjectScriptClsFkeyKeywordBlock getFkeyKeywordBlock() {
    return findChildByClass(CacheObjectScriptClsFkeyKeywordBlock.class);
  }

  @Override
  @NotNull
  public List<CacheObjectScriptClsFprops> getFpropsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CacheObjectScriptClsFprops.class);
  }

}
