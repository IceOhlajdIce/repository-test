// This is a generated file. Not intended for manual editing.
package by.vsu.cacheplugin.lang.mac.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static by.vsu.cacheplugin.lang.mac.psi.CacheObjectScriptMacTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CacheObjectScriptMacParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("by.vsu.cacheplugin.lang.mac.parser.CacheObjectScriptMacParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ARG) {
      result_ = arg(builder_, 0);
    }
    else if (root_ == ARGS) {
      result_ = args(builder_, 0);
    }
    else if (root_ == COMMAND_STRING) {
      result_ = commandString(builder_, 0);
    }
    else if (root_ == OPERAND) {
      result_ = operand(builder_, 0);
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
  // operand | operation | comma
  public static boolean arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<arg>");
    result_ = operand(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, OPERATION);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    exit_section_(builder_, level_, marker_, ARG, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // arg [{ arg }]
  public static boolean args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "args")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<args>");
    result_ = arg(builder_, level_ + 1);
    result_ = result_ && args_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARGS, result_, false, null);
    return result_;
  }

  // [{ arg }]
  private static boolean args_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "args_1")) return false;
    args_1_0(builder_, level_ + 1);
    return true;
  }

  // { arg }
  private static boolean args_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "args_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = arg(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (LABEL COMMAND args* CRLF)|( COMMAND args* CRLF)|(LABEL? COMMAND CRLF)
  public static boolean commandString(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commandString")) return false;
    if (!nextTokenIs(builder_, "<command string>", COMMAND, LABEL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<command string>");
    result_ = commandString_0(builder_, level_ + 1);
    if (!result_) result_ = commandString_1(builder_, level_ + 1);
    if (!result_) result_ = commandString_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMMAND_STRING, result_, false, null);
    return result_;
  }

  // LABEL COMMAND args* CRLF
  private static boolean commandString_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commandString_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LABEL, COMMAND);
    result_ = result_ && commandString_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CRLF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // args*
  private static boolean commandString_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commandString_0_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!args(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "commandString_0_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMAND args* CRLF
  private static boolean commandString_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commandString_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMAND);
    result_ = result_ && commandString_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CRLF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // args*
  private static boolean commandString_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commandString_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!args(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "commandString_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // LABEL? COMMAND CRLF
  private static boolean commandString_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commandString_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = commandString_2_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMAND, CRLF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LABEL?
  private static boolean commandString_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commandString_2_0")) return false;
    consumeToken(builder_, LABEL);
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
  // commandString|COMMENT|CRLF
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = commandString(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    if (!result_) result_ = consumeToken(builder_, CRLF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // local | global | sys | globalsys | number | string
  public static boolean operand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<operand>");
    result_ = consumeToken(builder_, LOCAL);
    if (!result_) result_ = consumeToken(builder_, GLOBAL);
    if (!result_) result_ = consumeToken(builder_, SYS);
    if (!result_) result_ = consumeToken(builder_, GLOBALSYS);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, level_, marker_, OPERAND, result_, false, null);
    return result_;
  }

}
