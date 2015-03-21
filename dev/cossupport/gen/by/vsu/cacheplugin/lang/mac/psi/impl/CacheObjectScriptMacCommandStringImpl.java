// This is a generated file. Not intended for manual editing.
package by.vsu.cacheplugin.lang.mac.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static by.vsu.cacheplugin.lang.mac.psi.CacheObjectScriptMacTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import by.vsu.cacheplugin.lang.mac.psi.*;

public class CacheObjectScriptMacCommandStringImpl extends ASTWrapperPsiElement implements CacheObjectScriptMacCommandString {

  public CacheObjectScriptMacCommandStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CacheObjectScriptMacVisitor) ((CacheObjectScriptMacVisitor)visitor).visitCommandString(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CacheObjectScriptMacArgs> getArgsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CacheObjectScriptMacArgs.class);
  }

}