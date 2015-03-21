// This is a generated file. Not intended for manual editing.
package by.vsu.cacheplugin.lang.cls.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static by.vsu.cacheplugin.lang.cls.psi.CacheObjectScriptClsTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CacheObjectScriptClsParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("by.vsu.cacheplugin.lang.cls.parser.CacheObjectScriptClsParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ARG_CLASS) {
      result_ = argClass(builder_, 0);
    }
    else if (root_ == ARG_PARAM) {
      result_ = argParam(builder_, 0);
    }
    else if (root_ == ARG_PARAMS) {
      result_ = argParams(builder_, 0);
    }
    else if (root_ == CLASS_ENTRY) {
      result_ = classEntry(builder_, 0);
    }
    else if (root_ == CLASS_LIST) {
      result_ = classList(builder_, 0);
    }
    else if (root_ == CLASS_NAME_BLOCK) {
      result_ = classNameBlock(builder_, 0);
    }
    else if (root_ == CLASSDEF) {
      result_ = classdef(builder_, 0);
    }
    else if (root_ == DEF_BLOCK) {
      result_ = defBlock(builder_, 0);
    }
    else if (root_ == ELEM) {
      result_ = elem(builder_, 0);
    }
    else if (root_ == EXTEND_BLOCK) {
      result_ = extendBlock(builder_, 0);
    }
    else if (root_ == FILE_LIST) {
      result_ = fileList(builder_, 0);
    }
    else if (root_ == FKEY) {
      result_ = fkey(builder_, 0);
    }
    else if (root_ == FKEY_KEYWORD_BLOCK) {
      result_ = fkeyKeywordBlock(builder_, 0);
    }
    else if (root_ == FKEYWORD_ITEM) {
      result_ = fkeywordItem(builder_, 0);
    }
    else if (root_ == FPROPS) {
      result_ = fprops(builder_, 0);
    }
    else if (root_ == IKEYWORD_ITEM) {
      result_ = ikeywordItem(builder_, 0);
    }
    else if (root_ == IMPORT_BLOCK) {
      result_ = importBlock(builder_, 0);
    }
    else if (root_ == INCLUDE_BLOCK) {
      result_ = includeBlock(builder_, 0);
    }
    else if (root_ == INDEX) {
      result_ = index(builder_, 0);
    }
    else if (root_ == INDEX_BODY) {
      result_ = indexBody(builder_, 0);
    }
    else if (root_ == INDEX_KEYWORD_BLOCK) {
      result_ = indexKeywordBlock(builder_, 0);
    }
    else if (root_ == INDEX_PROPS) {
      result_ = indexProps(builder_, 0);
    }
    else if (root_ == KEYWORD_ITEM) {
      result_ = keywordItem(builder_, 0);
    }
    else if (root_ == KEYWORDS_BLOCK) {
      result_ = keywordsBlock(builder_, 0);
    }
    else if (root_ == METHOD) {
      result_ = method(builder_, 0);
    }
    else if (root_ == METHOD_ARGS) {
      result_ = methodArgs(builder_, 0);
    }
    else if (root_ == METHOD_BODY) {
      result_ = methodBody(builder_, 0);
    }
    else if (root_ == METHOD_KEYWORDS_BLOCK) {
      result_ = methodKeywordsBlock(builder_, 0);
    }
    else if (root_ == MKEYWORD_ITEM) {
      result_ = mkeywordItem(builder_, 0);
    }
    else if (root_ == RET_PARAM) {
      result_ = retParam(builder_, 0);
    }
    else if (root_ == RET_PARAMS) {
      result_ = retParams(builder_, 0);
    }
    else if (root_ == RET_VAL) {
      result_ = retVal(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return cosFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // as className [argParams]
  public static boolean argClass(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argClass")) return false;
    if (!nextTokenIs(builder_, AS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AS, CLASSNAME);
    result_ = result_ && argClass_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARG_CLASS, result_);
    return result_;
  }

  // [argParams]
  private static boolean argClass_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argClass_2")) return false;
    argParams(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // argKeyword [(eq argKeyword) |(eq lpar (argKeyword comma)+ argKeyword rpar)]
  public static boolean argParam(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParam")) return false;
    if (!nextTokenIs(builder_, ARGKEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARGKEYWORD);
    result_ = result_ && argParam_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARG_PARAM, result_);
    return result_;
  }

  // [(eq argKeyword) |(eq lpar (argKeyword comma)+ argKeyword rpar)]
  private static boolean argParam_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParam_1")) return false;
    argParam_1_0(builder_, level_ + 1);
    return true;
  }

  // (eq argKeyword) |(eq lpar (argKeyword comma)+ argKeyword rpar)
  private static boolean argParam_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParam_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = argParam_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = argParam_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq argKeyword
  private static boolean argParam_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParam_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, ARGKEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq lpar (argKeyword comma)+ argKeyword rpar
  private static boolean argParam_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParam_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, LPAR);
    result_ = result_ && argParam_1_0_1_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, ARGKEYWORD, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (argKeyword comma)+
  private static boolean argParam_1_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParam_1_0_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = argParam_1_0_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!argParam_1_0_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "argParam_1_0_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // argKeyword comma
  private static boolean argParam_1_0_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParam_1_0_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ARGKEYWORD, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lpar(argParam comma)* argParam rpar
  public static boolean argParams(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParams")) return false;
    if (!nextTokenIs(builder_, LPAR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAR);
    result_ = result_ && argParams_1(builder_, level_ + 1);
    result_ = result_ && argParam(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAR);
    exit_section_(builder_, marker_, ARG_PARAMS, result_);
    return result_;
  }

  // (argParam comma)*
  private static boolean argParams_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParams_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!argParams_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "argParams_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // argParam comma
  private static boolean argParams_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argParams_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = argParam(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lbrace elem* rbrace
  public static boolean classEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classEntry")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && classEntry_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, CLASS_ENTRY, result_);
    return result_;
  }

  // elem*
  private static boolean classEntry_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classEntry_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!elem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "classEntry_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // className|{lpar (className comma)+ className rpar}
  public static boolean classList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classList")) return false;
    if (!nextTokenIs(builder_, "<class list>", CLASSNAME, LPAR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class list>");
    result_ = consumeToken(builder_, CLASSNAME);
    if (!result_) result_ = classList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_LIST, result_, false, null);
    return result_;
  }

  // lpar (className comma)+ className rpar
  private static boolean classList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classList_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAR);
    result_ = result_ && classList_1_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, CLASSNAME, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (className comma)+
  private static boolean classList_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classList_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = classList_1_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!classList_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "classList_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // className comma
  private static boolean classList_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classList_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CLASSNAME, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // class className
  public static boolean classNameBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classNameBlock")) return false;
    if (!nextTokenIs(builder_, CLASS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CLASS, CLASSNAME);
    exit_section_(builder_, marker_, CLASS_NAME_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // [includeBlock]{DESCRIPTION* COMMENT*}[importBlock] defBlock  classEntry
  public static boolean classdef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classdef")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<classdef>");
    result_ = classdef_0(builder_, level_ + 1);
    result_ = result_ && classdef_1(builder_, level_ + 1);
    result_ = result_ && classdef_2(builder_, level_ + 1);
    result_ = result_ && defBlock(builder_, level_ + 1);
    result_ = result_ && classEntry(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASSDEF, result_, false, null);
    return result_;
  }

  // [includeBlock]
  private static boolean classdef_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classdef_0")) return false;
    includeBlock(builder_, level_ + 1);
    return true;
  }

  // DESCRIPTION* COMMENT*
  private static boolean classdef_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classdef_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = classdef_1_0(builder_, level_ + 1);
    result_ = result_ && classdef_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DESCRIPTION*
  private static boolean classdef_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classdef_1_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, DESCRIPTION)) break;
      if (!empty_element_parsed_guard_(builder_, "classdef_1_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMENT*
  private static boolean classdef_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classdef_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, COMMENT)) break;
      if (!empty_element_parsed_guard_(builder_, "classdef_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // [importBlock]
  private static boolean classdef_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classdef_2")) return false;
    importBlock(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // item_*
  static boolean cosFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cosFile")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!item_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "cosFile", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // classNameBlock [extendBlock] [keywordsBlock]
  public static boolean defBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defBlock")) return false;
    if (!nextTokenIs(builder_, CLASS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = classNameBlock(builder_, level_ + 1);
    result_ = result_ && defBlock_1(builder_, level_ + 1);
    result_ = result_ && defBlock_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, DEF_BLOCK, result_);
    return result_;
  }

  // [extendBlock]
  private static boolean defBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defBlock_1")) return false;
    extendBlock(builder_, level_ + 1);
    return true;
  }

  // [keywordsBlock]
  private static boolean defBlock_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defBlock_2")) return false;
    keywordsBlock(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // fkey| method| property| query| xdata| param| trigger| index| projection| DESCRIPTION| COMMENT
  public static boolean elem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elem")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<elem>");
    result_ = fkey(builder_, level_ + 1);
    if (!result_) result_ = method(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PROPERTY);
    if (!result_) result_ = consumeToken(builder_, QUERY);
    if (!result_) result_ = consumeToken(builder_, XDATA);
    if (!result_) result_ = consumeToken(builder_, PARAM);
    if (!result_) result_ = consumeToken(builder_, TRIGGER);
    if (!result_) result_ = index(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PROJECTION);
    if (!result_) result_ = consumeToken(builder_, DESCRIPTION);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    exit_section_(builder_, level_, marker_, ELEM, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (as className)|(extends classList)
  public static boolean extendBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extendBlock")) return false;
    if (!nextTokenIs(builder_, "<extend block>", AS, EXTENDS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<extend block>");
    result_ = extendBlock_0(builder_, level_ + 1);
    if (!result_) result_ = extendBlock_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXTEND_BLOCK, result_, false, null);
    return result_;
  }

  // as className
  private static boolean extendBlock_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extendBlock_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AS, CLASSNAME);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // extends classList
  private static boolean extendBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extendBlock_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTENDS);
    result_ = result_ && classList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fileName | {lpar (fileName comma)+ fileName rpar}
  public static boolean fileList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fileList")) return false;
    if (!nextTokenIs(builder_, "<file list>", FILENAME, LPAR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<file list>");
    result_ = consumeToken(builder_, FILENAME);
    if (!result_) result_ = fileList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FILE_LIST, result_, false, null);
    return result_;
  }

  // lpar (fileName comma)+ fileName rpar
  private static boolean fileList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fileList_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAR);
    result_ = result_ && fileList_1_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FILENAME, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (fileName comma)+
  private static boolean fileList_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fileList_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fileList_1_1_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!fileList_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "fileList_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // fileName comma
  private static boolean fileList_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fileList_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FILENAME, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fkey_keyWord fkey_Name lpar fprops rpar [fref_Word fref_Class lpar fprops rpar] [fkeyKeywordBlock] semicolon
  public static boolean fkey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkey")) return false;
    if (!nextTokenIs(builder_, FKEY_KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FKEY_KEYWORD, FKEY_NAME, LPAR);
    result_ = result_ && fprops(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAR);
    result_ = result_ && fkey_5(builder_, level_ + 1);
    result_ = result_ && fkey_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, FKEY, result_);
    return result_;
  }

  // [fref_Word fref_Class lpar fprops rpar]
  private static boolean fkey_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkey_5")) return false;
    fkey_5_0(builder_, level_ + 1);
    return true;
  }

  // fref_Word fref_Class lpar fprops rpar
  private static boolean fkey_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkey_5_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FREF_WORD, FREF_CLASS, LPAR);
    result_ = result_ && fprops(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [fkeyKeywordBlock]
  private static boolean fkey_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkey_6")) return false;
    fkeyKeywordBlock(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // lbracket(fkeywordItem comma)* fkeywordItem rbracket
  public static boolean fkeyKeywordBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeyKeywordBlock")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && fkeyKeywordBlock_1(builder_, level_ + 1);
    result_ = result_ && fkeywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, FKEY_KEYWORD_BLOCK, result_);
    return result_;
  }

  // (fkeywordItem comma)*
  private static boolean fkeyKeywordBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeyKeywordBlock_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!fkeyKeywordBlock_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "fkeyKeywordBlock_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // fkeywordItem comma
  private static boolean fkeyKeywordBlock_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeyKeywordBlock_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fkeywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fkeyword [(eq fkeyword) |(eq lpar (fkeyword comma)+ fkeyword rpar)]
  public static boolean fkeywordItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeywordItem")) return false;
    if (!nextTokenIs(builder_, FKEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FKEYWORD);
    result_ = result_ && fkeywordItem_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, FKEYWORD_ITEM, result_);
    return result_;
  }

  // [(eq fkeyword) |(eq lpar (fkeyword comma)+ fkeyword rpar)]
  private static boolean fkeywordItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeywordItem_1")) return false;
    fkeywordItem_1_0(builder_, level_ + 1);
    return true;
  }

  // (eq fkeyword) |(eq lpar (fkeyword comma)+ fkeyword rpar)
  private static boolean fkeywordItem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeywordItem_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fkeywordItem_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = fkeywordItem_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq fkeyword
  private static boolean fkeywordItem_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeywordItem_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, FKEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq lpar (fkeyword comma)+ fkeyword rpar
  private static boolean fkeywordItem_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeywordItem_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, LPAR);
    result_ = result_ && fkeywordItem_1_0_1_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FKEYWORD, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (fkeyword comma)+
  private static boolean fkeywordItem_1_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeywordItem_1_0_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fkeywordItem_1_0_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!fkeywordItem_1_0_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "fkeywordItem_1_0_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // fkeyword comma
  private static boolean fkeywordItem_1_0_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fkeywordItem_1_0_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FKEYWORD, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (fprop comma)* fprop
  public static boolean fprops(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fprops")) return false;
    if (!nextTokenIs(builder_, FPROP)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = fprops_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FPROP);
    exit_section_(builder_, marker_, FPROPS, result_);
    return result_;
  }

  // (fprop comma)*
  private static boolean fprops_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fprops_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!fprops_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "fprops_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // fprop comma
  private static boolean fprops_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fprops_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FPROP, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ikeyword [(eq ikeyword) |(eq lpar (ikeyword comma)+ ikeyword rpar)]
  public static boolean ikeywordItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ikeywordItem")) return false;
    if (!nextTokenIs(builder_, IKEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IKEYWORD);
    result_ = result_ && ikeywordItem_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, IKEYWORD_ITEM, result_);
    return result_;
  }

  // [(eq ikeyword) |(eq lpar (ikeyword comma)+ ikeyword rpar)]
  private static boolean ikeywordItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ikeywordItem_1")) return false;
    ikeywordItem_1_0(builder_, level_ + 1);
    return true;
  }

  // (eq ikeyword) |(eq lpar (ikeyword comma)+ ikeyword rpar)
  private static boolean ikeywordItem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ikeywordItem_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ikeywordItem_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = ikeywordItem_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq ikeyword
  private static boolean ikeywordItem_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ikeywordItem_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, IKEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq lpar (ikeyword comma)+ ikeyword rpar
  private static boolean ikeywordItem_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ikeywordItem_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, LPAR);
    result_ = result_ && ikeywordItem_1_0_1_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, IKEYWORD, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ikeyword comma)+
  private static boolean ikeywordItem_1_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ikeywordItem_1_0_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ikeywordItem_1_0_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!ikeywordItem_1_0_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ikeywordItem_1_0_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ikeyword comma
  private static boolean ikeywordItem_1_0_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ikeywordItem_1_0_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IKEYWORD, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // import classList
  public static boolean importBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importBlock")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPORT);
    result_ = result_ && classList(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPORT_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // include fileList
  public static boolean includeBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "includeBlock")) return false;
    if (!nextTokenIs(builder_, INCLUDE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INCLUDE);
    result_ = result_ && fileList(builder_, level_ + 1);
    exit_section_(builder_, marker_, INCLUDE_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // indexWord indexName on indexProps [indexKeywordBlock] indexBody
  public static boolean index(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "index")) return false;
    if (!nextTokenIs(builder_, INDEXWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, INDEXWORD, INDEXNAME, ON);
    result_ = result_ && indexProps(builder_, level_ + 1);
    result_ = result_ && index_4(builder_, level_ + 1);
    result_ = result_ && indexBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, INDEX, result_);
    return result_;
  }

  // [indexKeywordBlock]
  private static boolean index_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "index_4")) return false;
    indexKeywordBlock(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // semicolon | lbrace rbrace
  public static boolean indexBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexBody")) return false;
    if (!nextTokenIs(builder_, "<index body>", LBRACE, SEMICOLON)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<index body>");
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = parseTokens(builder_, 0, LBRACE, RBRACE);
    exit_section_(builder_, level_, marker_, INDEX_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // lbracket(ikeywordItem comma)* ikeywordItem rbracket
  public static boolean indexKeywordBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexKeywordBlock")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && indexKeywordBlock_1(builder_, level_ + 1);
    result_ = result_ && ikeywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, INDEX_KEYWORD_BLOCK, result_);
    return result_;
  }

  // (ikeywordItem comma)*
  private static boolean indexKeywordBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexKeywordBlock_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!indexKeywordBlock_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "indexKeywordBlock_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ikeywordItem comma
  private static boolean indexKeywordBlock_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexKeywordBlock_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ikeywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // indexProp | lpar((indexProp comma)+ indexProp)rpar
  public static boolean indexProps(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexProps")) return false;
    if (!nextTokenIs(builder_, "<index props>", INDEXPROP, LPAR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<index props>");
    result_ = consumeToken(builder_, INDEXPROP);
    if (!result_) result_ = indexProps_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INDEX_PROPS, result_, false, null);
    return result_;
  }

  // lpar((indexProp comma)+ indexProp)rpar
  private static boolean indexProps_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexProps_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAR);
    result_ = result_ && indexProps_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (indexProp comma)+ indexProp
  private static boolean indexProps_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexProps_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = indexProps_1_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, INDEXPROP);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (indexProp comma)+
  private static boolean indexProps_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexProps_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = indexProps_1_1_0_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!indexProps_1_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "indexProps_1_1_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // indexProp comma
  private static boolean indexProps_1_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexProps_1_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, INDEXPROP, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // classdef|COMMENT|DESCRIPTION
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = classdef(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    if (!result_) result_ = consumeToken(builder_, DESCRIPTION);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // keyword [(eq keyword) |(eq lpar (keyword comma)+ keyword rpar)]
  public static boolean keywordItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordItem")) return false;
    if (!nextTokenIs(builder_, KEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KEYWORD);
    result_ = result_ && keywordItem_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, KEYWORD_ITEM, result_);
    return result_;
  }

  // [(eq keyword) |(eq lpar (keyword comma)+ keyword rpar)]
  private static boolean keywordItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordItem_1")) return false;
    keywordItem_1_0(builder_, level_ + 1);
    return true;
  }

  // (eq keyword) |(eq lpar (keyword comma)+ keyword rpar)
  private static boolean keywordItem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordItem_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = keywordItem_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = keywordItem_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq keyword
  private static boolean keywordItem_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordItem_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq lpar (keyword comma)+ keyword rpar
  private static boolean keywordItem_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordItem_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, LPAR);
    result_ = result_ && keywordItem_1_0_1_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, KEYWORD, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (keyword comma)+
  private static boolean keywordItem_1_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordItem_1_0_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = keywordItem_1_0_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!keywordItem_1_0_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "keywordItem_1_0_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // keyword comma
  private static boolean keywordItem_1_0_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordItem_1_0_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KEYWORD, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lbracket(keywordItem comma)* keywordItem rbracket
  public static boolean keywordsBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordsBlock")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && keywordsBlock_1(builder_, level_ + 1);
    result_ = result_ && keywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, KEYWORDS_BLOCK, result_);
    return result_;
  }

  // (keywordItem comma)*
  private static boolean keywordsBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordsBlock_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!keywordsBlock_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "keywordsBlock_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // keywordItem comma
  private static boolean keywordsBlock_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keywordsBlock_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = keywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // methodWord methodName  methodArgs [retVal] [methodKeywordsBlock] methodBody
  public static boolean method(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method")) return false;
    if (!nextTokenIs(builder_, METHODWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, METHODWORD, METHODNAME);
    result_ = result_ && methodArgs(builder_, level_ + 1);
    result_ = result_ && method_3(builder_, level_ + 1);
    result_ = result_ && method_4(builder_, level_ + 1);
    result_ = result_ && methodBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, METHOD, result_);
    return result_;
  }

  // [retVal]
  private static boolean method_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_3")) return false;
    retVal(builder_, level_ + 1);
    return true;
  }

  // [methodKeywordsBlock]
  private static boolean method_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_4")) return false;
    methodKeywordsBlock(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // lpar ([argModifier] argName argClass [eq argDefault])* rpar
  public static boolean methodArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodArgs")) return false;
    if (!nextTokenIs(builder_, LPAR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAR);
    result_ = result_ && methodArgs_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAR);
    exit_section_(builder_, marker_, METHOD_ARGS, result_);
    return result_;
  }

  // ([argModifier] argName argClass [eq argDefault])*
  private static boolean methodArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodArgs_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!methodArgs_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "methodArgs_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // [argModifier] argName argClass [eq argDefault]
  private static boolean methodArgs_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodArgs_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = methodArgs_1_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ARGNAME);
    result_ = result_ && argClass(builder_, level_ + 1);
    result_ = result_ && methodArgs_1_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [argModifier]
  private static boolean methodArgs_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodArgs_1_0_0")) return false;
    consumeToken(builder_, ARGMODIFIER);
    return true;
  }

  // [eq argDefault]
  private static boolean methodArgs_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodArgs_1_0_3")) return false;
    parseTokens(builder_, 0, EQ, ARGDEFAULT);
    return true;
  }

  /* ********************************************************** */
  // lbrace methodCode* rbrace
  public static boolean methodBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodBody")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && methodBody_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, METHOD_BODY, result_);
    return result_;
  }

  // methodCode*
  private static boolean methodBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodBody_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, METHODCODE)) break;
      if (!empty_element_parsed_guard_(builder_, "methodBody_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // lbracket(mkeywordItem comma)* mkeywordItem rbracket
  public static boolean methodKeywordsBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodKeywordsBlock")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && methodKeywordsBlock_1(builder_, level_ + 1);
    result_ = result_ && mkeywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, METHOD_KEYWORDS_BLOCK, result_);
    return result_;
  }

  // (mkeywordItem comma)*
  private static boolean methodKeywordsBlock_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodKeywordsBlock_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!methodKeywordsBlock_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "methodKeywordsBlock_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // mkeywordItem comma
  private static boolean methodKeywordsBlock_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodKeywordsBlock_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = mkeywordItem(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // mkeyword [(eq mkeyword) |(eq lpar (mkeyword comma)+ mkeyword rpar)]
  public static boolean mkeywordItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mkeywordItem")) return false;
    if (!nextTokenIs(builder_, MKEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MKEYWORD);
    result_ = result_ && mkeywordItem_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MKEYWORD_ITEM, result_);
    return result_;
  }

  // [(eq mkeyword) |(eq lpar (mkeyword comma)+ mkeyword rpar)]
  private static boolean mkeywordItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mkeywordItem_1")) return false;
    mkeywordItem_1_0(builder_, level_ + 1);
    return true;
  }

  // (eq mkeyword) |(eq lpar (mkeyword comma)+ mkeyword rpar)
  private static boolean mkeywordItem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mkeywordItem_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = mkeywordItem_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = mkeywordItem_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq mkeyword
  private static boolean mkeywordItem_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mkeywordItem_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, MKEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq lpar (mkeyword comma)+ mkeyword rpar
  private static boolean mkeywordItem_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mkeywordItem_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, LPAR);
    result_ = result_ && mkeywordItem_1_0_1_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, MKEYWORD, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (mkeyword comma)+
  private static boolean mkeywordItem_1_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mkeywordItem_1_0_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = mkeywordItem_1_0_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!mkeywordItem_1_0_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "mkeywordItem_1_0_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // mkeyword comma
  private static boolean mkeywordItem_1_0_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mkeywordItem_1_0_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, MKEYWORD, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // retKeyword [(eq retKeyword) |(eq lpar (retKeyword comma)+ retKeyword rpar)]
  public static boolean retParam(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParam")) return false;
    if (!nextTokenIs(builder_, RETKEYWORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETKEYWORD);
    result_ = result_ && retParam_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, RET_PARAM, result_);
    return result_;
  }

  // [(eq retKeyword) |(eq lpar (retKeyword comma)+ retKeyword rpar)]
  private static boolean retParam_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParam_1")) return false;
    retParam_1_0(builder_, level_ + 1);
    return true;
  }

  // (eq retKeyword) |(eq lpar (retKeyword comma)+ retKeyword rpar)
  private static boolean retParam_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParam_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = retParam_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = retParam_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq retKeyword
  private static boolean retParam_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParam_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, RETKEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // eq lpar (retKeyword comma)+ retKeyword rpar
  private static boolean retParam_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParam_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EQ, LPAR);
    result_ = result_ && retParam_1_0_1_2(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RETKEYWORD, RPAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (retKeyword comma)+
  private static boolean retParam_1_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParam_1_0_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = retParam_1_0_1_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!retParam_1_0_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "retParam_1_0_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // retKeyword comma
  private static boolean retParam_1_0_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParam_1_0_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, RETKEYWORD, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lpar(retParam comma)* retParam rpar
  public static boolean retParams(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParams")) return false;
    if (!nextTokenIs(builder_, LPAR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAR);
    result_ = result_ && retParams_1(builder_, level_ + 1);
    result_ = result_ && retParam(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAR);
    exit_section_(builder_, marker_, RET_PARAMS, result_);
    return result_;
  }

  // (retParam comma)*
  private static boolean retParams_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParams_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!retParams_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "retParams_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // retParam comma
  private static boolean retParams_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retParams_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = retParam(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // as className [retParams]
  public static boolean retVal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retVal")) return false;
    if (!nextTokenIs(builder_, AS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AS, CLASSNAME);
    result_ = result_ && retVal_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, RET_VAL, result_);
    return result_;
  }

  // [retParams]
  private static boolean retVal_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retVal_2")) return false;
    retParams(builder_, level_ + 1);
    return true;
  }

}
