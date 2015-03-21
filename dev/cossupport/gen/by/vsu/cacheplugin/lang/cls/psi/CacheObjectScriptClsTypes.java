// This is a generated file. Not intended for manual editing.
package by.vsu.cacheplugin.lang.cls.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import by.vsu.cacheplugin.lang.cls.psi.impl.*;

public interface CacheObjectScriptClsTypes {

  IElementType ARG_CLASS = new CacheObjectScriptClsElementType("ARG_CLASS");
  IElementType ARG_PARAM = new CacheObjectScriptClsElementType("ARG_PARAM");
  IElementType ARG_PARAMS = new CacheObjectScriptClsElementType("ARG_PARAMS");
  IElementType CLASSDEF = new CacheObjectScriptClsElementType("CLASSDEF");
  IElementType CLASS_ENTRY = new CacheObjectScriptClsElementType("CLASS_ENTRY");
  IElementType CLASS_LIST = new CacheObjectScriptClsElementType("CLASS_LIST");
  IElementType CLASS_NAME_BLOCK = new CacheObjectScriptClsElementType("CLASS_NAME_BLOCK");
  IElementType DEF_BLOCK = new CacheObjectScriptClsElementType("DEF_BLOCK");
  IElementType ELEM = new CacheObjectScriptClsElementType("ELEM");
  IElementType EXTEND_BLOCK = new CacheObjectScriptClsElementType("EXTEND_BLOCK");
  IElementType FILE_LIST = new CacheObjectScriptClsElementType("FILE_LIST");
  IElementType FKEY = new CacheObjectScriptClsElementType("FKEY");
  IElementType FKEYWORD_ITEM = new CacheObjectScriptClsElementType("FKEYWORD_ITEM");
  IElementType FKEY_KEYWORD_BLOCK = new CacheObjectScriptClsElementType("FKEY_KEYWORD_BLOCK");
  IElementType FPROPS = new CacheObjectScriptClsElementType("FPROPS");
  IElementType IKEYWORD_ITEM = new CacheObjectScriptClsElementType("IKEYWORD_ITEM");
  IElementType IMPORT_BLOCK = new CacheObjectScriptClsElementType("IMPORT_BLOCK");
  IElementType INCLUDE_BLOCK = new CacheObjectScriptClsElementType("INCLUDE_BLOCK");
  IElementType INDEX = new CacheObjectScriptClsElementType("INDEX");
  IElementType INDEX_BODY = new CacheObjectScriptClsElementType("INDEX_BODY");
  IElementType INDEX_KEYWORD_BLOCK = new CacheObjectScriptClsElementType("INDEX_KEYWORD_BLOCK");
  IElementType INDEX_PROPS = new CacheObjectScriptClsElementType("INDEX_PROPS");
  IElementType KEYWORDS_BLOCK = new CacheObjectScriptClsElementType("KEYWORDS_BLOCK");
  IElementType KEYWORD_ITEM = new CacheObjectScriptClsElementType("KEYWORD_ITEM");
  IElementType METHOD = new CacheObjectScriptClsElementType("METHOD");
  IElementType METHOD_ARGS = new CacheObjectScriptClsElementType("METHOD_ARGS");
  IElementType METHOD_BODY = new CacheObjectScriptClsElementType("METHOD_BODY");
  IElementType METHOD_KEYWORDS_BLOCK = new CacheObjectScriptClsElementType("METHOD_KEYWORDS_BLOCK");
  IElementType MKEYWORD_ITEM = new CacheObjectScriptClsElementType("MKEYWORD_ITEM");
  IElementType RET_PARAM = new CacheObjectScriptClsElementType("RET_PARAM");
  IElementType RET_PARAMS = new CacheObjectScriptClsElementType("RET_PARAMS");
  IElementType RET_VAL = new CacheObjectScriptClsElementType("RET_VAL");

  IElementType ARGDEFAULT = new CacheObjectScriptClsTokenType("argDefault");
  IElementType ARGKEYWORD = new CacheObjectScriptClsTokenType("argKeyword");
  IElementType ARGMODIFIER = new CacheObjectScriptClsTokenType("argModifier");
  IElementType ARGNAME = new CacheObjectScriptClsTokenType("argName");
  IElementType AS = new CacheObjectScriptClsTokenType("as");
  IElementType CLASS = new CacheObjectScriptClsTokenType("class");
  IElementType CLASSNAME = new CacheObjectScriptClsTokenType("className");
  IElementType COMMA = new CacheObjectScriptClsTokenType("comma");
  IElementType COMMENT = new CacheObjectScriptClsTokenType("COMMENT");
  IElementType DESCRIPTION = new CacheObjectScriptClsTokenType("DESCRIPTION");
  IElementType EQ = new CacheObjectScriptClsTokenType("eq");
  IElementType EXTENDS = new CacheObjectScriptClsTokenType("extends");
  IElementType FILENAME = new CacheObjectScriptClsTokenType("fileName");
  IElementType FKEYWORD = new CacheObjectScriptClsTokenType("fkeyword");
  IElementType FKEY_KEYWORD = new CacheObjectScriptClsTokenType("fkey_keyWord");
  IElementType FKEY_NAME = new CacheObjectScriptClsTokenType("fkey_Name");
  IElementType FPROP = new CacheObjectScriptClsTokenType("fprop");
  IElementType FREF_CLASS = new CacheObjectScriptClsTokenType("fref_Class");
  IElementType FREF_WORD = new CacheObjectScriptClsTokenType("fref_Word");
  IElementType IKEYWORD = new CacheObjectScriptClsTokenType("ikeyword");
  IElementType IMPORT = new CacheObjectScriptClsTokenType("import");
  IElementType INCLUDE = new CacheObjectScriptClsTokenType("include");
  IElementType INDEXNAME = new CacheObjectScriptClsTokenType("indexName");
  IElementType INDEXPROP = new CacheObjectScriptClsTokenType("indexProp");
  IElementType INDEXWORD = new CacheObjectScriptClsTokenType("indexWord");
  IElementType KEYWORD = new CacheObjectScriptClsTokenType("keyword");
  IElementType LBRACE = new CacheObjectScriptClsTokenType("lbrace");
  IElementType LBRACKET = new CacheObjectScriptClsTokenType("lbracket");
  IElementType LPAR = new CacheObjectScriptClsTokenType("lpar");
  IElementType METHODCODE = new CacheObjectScriptClsTokenType("methodCode");
  IElementType METHODNAME = new CacheObjectScriptClsTokenType("methodName");
  IElementType METHODWORD = new CacheObjectScriptClsTokenType("methodWord");
  IElementType MKEYWORD = new CacheObjectScriptClsTokenType("mkeyword");
  IElementType ON = new CacheObjectScriptClsTokenType("on");
  IElementType PARAM = new CacheObjectScriptClsTokenType("param");
  IElementType PROJECTION = new CacheObjectScriptClsTokenType("projection");
  IElementType PROPERTY = new CacheObjectScriptClsTokenType("property");
  IElementType QUERY = new CacheObjectScriptClsTokenType("query");
  IElementType RBRACE = new CacheObjectScriptClsTokenType("rbrace");
  IElementType RBRACKET = new CacheObjectScriptClsTokenType("rbracket");
  IElementType RETKEYWORD = new CacheObjectScriptClsTokenType("retKeyword");
  IElementType RPAR = new CacheObjectScriptClsTokenType("rpar");
  IElementType SEMICOLON = new CacheObjectScriptClsTokenType("semicolon");
  IElementType TRIGGER = new CacheObjectScriptClsTokenType("trigger");
  IElementType XDATA = new CacheObjectScriptClsTokenType("xdata");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARG_CLASS) {
        return new CacheObjectScriptClsArgClassImpl(node);
      }
      else if (type == ARG_PARAM) {
        return new CacheObjectScriptClsArgParamImpl(node);
      }
      else if (type == ARG_PARAMS) {
        return new CacheObjectScriptClsArgParamsImpl(node);
      }
      else if (type == CLASSDEF) {
        return new CacheObjectScriptClsClassdefImpl(node);
      }
      else if (type == CLASS_ENTRY) {
        return new CacheObjectScriptClsClassEntryImpl(node);
      }
      else if (type == CLASS_LIST) {
        return new CacheObjectScriptClsClassListImpl(node);
      }
      else if (type == CLASS_NAME_BLOCK) {
        return new CacheObjectScriptClsClassNameBlockImpl(node);
      }
      else if (type == DEF_BLOCK) {
        return new CacheObjectScriptClsDefBlockImpl(node);
      }
      else if (type == ELEM) {
        return new CacheObjectScriptClsElemImpl(node);
      }
      else if (type == EXTEND_BLOCK) {
        return new CacheObjectScriptClsExtendBlockImpl(node);
      }
      else if (type == FILE_LIST) {
        return new CacheObjectScriptClsFileListImpl(node);
      }
      else if (type == FKEY) {
        return new CacheObjectScriptClsFkeyImpl(node);
      }
      else if (type == FKEYWORD_ITEM) {
        return new CacheObjectScriptClsFkeywordItemImpl(node);
      }
      else if (type == FKEY_KEYWORD_BLOCK) {
        return new CacheObjectScriptClsFkeyKeywordBlockImpl(node);
      }
      else if (type == FPROPS) {
        return new CacheObjectScriptClsFpropsImpl(node);
      }
      else if (type == IKEYWORD_ITEM) {
        return new CacheObjectScriptClsIkeywordItemImpl(node);
      }
      else if (type == IMPORT_BLOCK) {
        return new CacheObjectScriptClsImportBlockImpl(node);
      }
      else if (type == INCLUDE_BLOCK) {
        return new CacheObjectScriptClsIncludeBlockImpl(node);
      }
      else if (type == INDEX) {
        return new CacheObjectScriptClsIndexImpl(node);
      }
      else if (type == INDEX_BODY) {
        return new CacheObjectScriptClsIndexBodyImpl(node);
      }
      else if (type == INDEX_KEYWORD_BLOCK) {
        return new CacheObjectScriptClsIndexKeywordBlockImpl(node);
      }
      else if (type == INDEX_PROPS) {
        return new CacheObjectScriptClsIndexPropsImpl(node);
      }
      else if (type == KEYWORDS_BLOCK) {
        return new CacheObjectScriptClsKeywordsBlockImpl(node);
      }
      else if (type == KEYWORD_ITEM) {
        return new CacheObjectScriptClsKeywordItemImpl(node);
      }
      else if (type == METHOD) {
        return new CacheObjectScriptClsMethodImpl(node);
      }
      else if (type == METHOD_ARGS) {
        return new CacheObjectScriptClsMethodArgsImpl(node);
      }
      else if (type == METHOD_BODY) {
        return new CacheObjectScriptClsMethodBodyImpl(node);
      }
      else if (type == METHOD_KEYWORDS_BLOCK) {
        return new CacheObjectScriptClsMethodKeywordsBlockImpl(node);
      }
      else if (type == MKEYWORD_ITEM) {
        return new CacheObjectScriptClsMkeywordItemImpl(node);
      }
      else if (type == RET_PARAM) {
        return new CacheObjectScriptClsRetParamImpl(node);
      }
      else if (type == RET_PARAMS) {
        return new CacheObjectScriptClsRetParamsImpl(node);
      }
      else if (type == RET_VAL) {
        return new CacheObjectScriptClsRetValImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
