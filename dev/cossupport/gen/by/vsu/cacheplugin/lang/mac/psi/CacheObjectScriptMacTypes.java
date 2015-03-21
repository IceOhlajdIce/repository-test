// This is a generated file. Not intended for manual editing.
package by.vsu.cacheplugin.lang.mac.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import by.vsu.cacheplugin.lang.mac.psi.impl.*;

public interface CacheObjectScriptMacTypes {

  IElementType ARG = new CacheObjectScriptMacElementType("ARG");
  IElementType ARGS = new CacheObjectScriptMacElementType("ARGS");
  IElementType COMMAND_STRING = new CacheObjectScriptMacElementType("COMMAND_STRING");
  IElementType OPERAND = new CacheObjectScriptMacElementType("OPERAND");

  IElementType COMMA = new CacheObjectScriptMacTokenType("comma");
  IElementType COMMAND = new CacheObjectScriptMacTokenType("COMMAND");
  IElementType COMMENT = new CacheObjectScriptMacTokenType("COMMENT");
  IElementType CRLF = new CacheObjectScriptMacTokenType("CRLF");
  IElementType GLOBAL = new CacheObjectScriptMacTokenType("global");
  IElementType GLOBALSYS = new CacheObjectScriptMacTokenType("globalsys");
  IElementType LABEL = new CacheObjectScriptMacTokenType("LABEL");
  IElementType LOCAL = new CacheObjectScriptMacTokenType("local");
  IElementType NUMBER = new CacheObjectScriptMacTokenType("number");
  IElementType OPERATION = new CacheObjectScriptMacTokenType("operation");
  IElementType STRING = new CacheObjectScriptMacTokenType("string");
  IElementType SYS = new CacheObjectScriptMacTokenType("sys");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARG) {
        return new CacheObjectScriptMacArgImpl(node);
      }
      else if (type == ARGS) {
        return new CacheObjectScriptMacArgsImpl(node);
      }
      else if (type == COMMAND_STRING) {
        return new CacheObjectScriptMacCommandStringImpl(node);
      }
      else if (type == OPERAND) {
        return new CacheObjectScriptMacOperandImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
