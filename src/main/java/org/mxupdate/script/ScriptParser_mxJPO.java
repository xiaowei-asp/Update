/* ScriptParser.java */
/* Generated By:JavaCC: Do not edit this line. ScriptParser.java */
/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.script;

import java.lang.reflect.InvocationTargetException;
import java.io.IOException;

import org.mxupdate.script.statement.MxUpdateStatement_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.SimpleCharStream;
import org.mxupdate.update.util.AbstractParser_mxJPO.Token;
import org.mxupdate.update.util.AbstractParser_mxJPO.TokenMgrError;

/**
 * Parser for the MxUpdate script.
 *
 * @author The MxUpdate Team
 */
@SuppressWarnings("unused")
class ScriptParser_mxJPO
    extends AbstractParser_mxJPO implements ScriptParserConstants_mxJPO {

/******************************************************************************/
  final public 
void parse(final ScriptHandler_mxJPO _script) throws ParseException, SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {Token tmp;
    MxUpdateStatement_mxJPO mxUpdateStmt;
    StringBuilder code;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MXUPDATE:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(MXUPDATE);
mxUpdateStmt = new MxUpdateStatement_mxJPO();_script.addStatement(mxUpdateStmt);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MXUPDATE_STRING:{
        tmp = jj_consume_token(MXUPDATE_STRING);
mxUpdateStmt.setMxUpdateType(this.getString(tmp.image));
        break;
        }
      case MXUPDATE_SINGLE:{
        tmp = jj_consume_token(MXUPDATE_SINGLE);
mxUpdateStmt.setMxUpdateType(this.getSingle(tmp.image));
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MXUPDATE_STRING:{
        tmp = jj_consume_token(MXUPDATE_STRING);
mxUpdateStmt.setName(this.getString(tmp.image));
        break;
        }
      case MXUPDATE_SINGLE:{
        tmp = jj_consume_token(MXUPDATE_SINGLE);
mxUpdateStmt.setName(this.getSingle(tmp.image));
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MXUPDATE_STRING:
      case MXUPDATE_SINGLE:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MXUPDATE_STRING:{
          tmp = jj_consume_token(MXUPDATE_STRING);
mxUpdateStmt.setRevision(this.getString(tmp.image));
          break;
          }
        case MXUPDATE_SINGLE:{
          tmp = jj_consume_token(MXUPDATE_SINGLE);
mxUpdateStmt.setRevision(this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      jj_consume_token(MXUPDATE_CODE_START);
code = new StringBuilder();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MXUPDATE_CODE_BRACE_START:
        case MXUPDATE_CODE_BRACE_END:
        case MXUPDATE_CODE_TEXT:
        case MXUPDATE_CODE_STRING:{
          ;
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          break label_2;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MXUPDATE_CODE_BRACE_START:{
          tmp = jj_consume_token(MXUPDATE_CODE_BRACE_START);
code.append(tmp.image);
          break;
          }
        case MXUPDATE_CODE_BRACE_END:{
          tmp = jj_consume_token(MXUPDATE_CODE_BRACE_END);
code.append(tmp.image);
          break;
          }
        case MXUPDATE_CODE_TEXT:{
          tmp = jj_consume_token(MXUPDATE_CODE_TEXT);
code.append(tmp.image);
          break;
          }
        case MXUPDATE_CODE_STRING:{
          tmp = jj_consume_token(MXUPDATE_CODE_STRING);
code.append(tmp.image);
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
code.setLength(code.length() - 1);mxUpdateStmt.setCode(code.toString());
    }
  }

  /** Generated Token Manager. */
  public ScriptParserTokenManager_mxJPO token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x80,0x300,0x300,0x300,0x300,0x7800,0x7800,};
   }

  /** Constructor with InputStream. */
  public ScriptParser_mxJPO(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ScriptParser_mxJPO(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ScriptParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ScriptParser_mxJPO(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ScriptParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new ScriptParserTokenManager_mxJPO(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ScriptParser_mxJPO(ScriptParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ScriptParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[15];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 7; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 15; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
