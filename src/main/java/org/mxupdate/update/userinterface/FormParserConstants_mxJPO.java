/* Generated By:JavaCC: Do not edit this line. FormParserConstants.java */
package org.mxupdate.update.userinterface;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface FormParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SYMBOLICNAME = 5;
  /** RegularExpression Id. */
  int DESCRIPTION = 6;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 7;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 8;
  /** RegularExpression Id. */
  int STRING = 9;
  /** RegularExpression Id. */
  int SINGLE = 10;
  /** RegularExpression Id. */
  int MULTILINESTRING = 11;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 12;
  /** RegularExpression Id. */
  int FIELD = 13;
  /** RegularExpression Id. */
  int FIELD_OPEN = 14;
  /** RegularExpression Id. */
  int FIELD_CLOSE = 15;
  /** RegularExpression Id. */
  int FIELD_NAME = 16;
  /** RegularExpression Id. */
  int FIELD_LABEL = 17;
  /** RegularExpression Id. */
  int FIELD_SELECT = 18;
  /** RegularExpression Id. */
  int FIELD_BOBJ = 19;
  /** RegularExpression Id. */
  int FIELD_REL = 20;
  /** RegularExpression Id. */
  int FIELD_RANGE = 21;
  /** RegularExpression Id. */
  int FIELD_HREF = 22;
  /** RegularExpression Id. */
  int FIELD_ALT = 23;
  /** RegularExpression Id. */
  int FIELD_USER = 24;
  /** RegularExpression Id. */
  int FIELD_SETTING = 25;
  /** RegularExpression Id. */
  int FIELD_STRING = 26;
  /** RegularExpression Id. */
  int FIELD_SINGLE = 27;
  /** RegularExpression Id. */
  int SETTING_STRING = 28;
  /** RegularExpression Id. */
  int SETTING_SINGLE = 29;
  /** RegularExpression Id. */
  int PROPERTY = 30;
  /** RegularExpression Id. */
  int PROPERTYTO = 31;
  /** RegularExpression Id. */
  int PROPERTYVAL = 32;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 33;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 34;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int SETTING_STRING_EXPECTED = 1;
  /** Lexical state. */
  int FIELD_STRING_EXPECTED = 2;
  /** Lexical state. */
  int FIELD_EXPECTED = 3;
  /** Lexical state. */
  int FIELD_OPENEXPECTED = 4;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 5;
  /** Lexical state. */
  int STRING_EXPECTED = 6;
  /** Lexical state. */
  int DEFAULT = 7;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"symbolicname\"",
    "\"description\"",
    "\"hidden\"",
    "\"!hidden\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "\"field\"",
    "\"{\"",
    "\"}\"",
    "\"name\"",
    "\"label\"",
    "\"select\"",
    "\"businessobject\"",
    "\"relationship\"",
    "\"range\"",
    "\"href\"",
    "\"alt\"",
    "\"user\"",
    "\"setting\"",
    "<FIELD_STRING>",
    "<FIELD_SINGLE>",
    "<SETTING_STRING>",
    "<SETTING_SINGLE>",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
  };

}