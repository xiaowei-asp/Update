/* Generated By:JavaCC: Do not edit this line. PathTypeParserConstants.java */
package org.mxupdate.update.datamodel;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface PathTypeParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SYMBOLICNAME = 5;
  /** RegularExpression Id. */
  int DESCRIPTION = 6;
  /** RegularExpression Id. */
  int DERIVED = 7;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 8;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 9;
  /** RegularExpression Id. */
  int LOCAL = 10;
  /** RegularExpression Id. */
  int ATTRIBUTE = 11;
  /** RegularExpression Id. */
  int STRING = 12;
  /** RegularExpression Id. */
  int SINGLE = 13;
  /** RegularExpression Id. */
  int MULTILINESTRING = 14;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 15;
  /** RegularExpression Id. */
  int FROM = 16;
  /** RegularExpression Id. */
  int TO = 17;
  /** RegularExpression Id. */
  int CARDINALITY_ONE = 18;
  /** RegularExpression Id. */
  int CARDINALITY_MANY = 19;
  /** RegularExpression Id. */
  int TYPE_ALL = 20;
  /** RegularExpression Id. */
  int TYPE = 21;
  /** RegularExpression Id. */
  int RELATIONSHIP_ALL = 22;
  /** RegularExpression Id. */
  int RELATIONSHIP = 23;
  /** RegularExpression Id. */
  int DEFAULTVALUE = 24;
  /** RegularExpression Id. */
  int MULTIVALUE_TRUE = 25;
  /** RegularExpression Id. */
  int MULTIVALUE_FALSE = 26;
  /** RegularExpression Id. */
  int RESETONCLONE_TRUE = 27;
  /** RegularExpression Id. */
  int RESETONCLONE_FALSE = 28;
  /** RegularExpression Id. */
  int RESETONREVISION_TRUE = 29;
  /** RegularExpression Id. */
  int RESETONREVISION_FALSE = 30;
  /** RegularExpression Id. */
  int RANGEVALUE_TRUE = 31;
  /** RegularExpression Id. */
  int RANGEVALUE_FALSE = 32;
  /** RegularExpression Id. */
  int MULTILINE_TRUE = 33;
  /** RegularExpression Id. */
  int MULTILINE_FALSE = 34;
  /** RegularExpression Id. */
  int RULE = 35;
  /** RegularExpression Id. */
  int DIMENSION = 36;
  /** RegularExpression Id. */
  int KIND = 37;
  /** RegularExpression Id. */
  int KIND_BINARY = 38;
  /** RegularExpression Id. */
  int KIND_BOOLEAN = 39;
  /** RegularExpression Id. */
  int KIND_DATE = 40;
  /** RegularExpression Id. */
  int KIND_INTEGER = 41;
  /** RegularExpression Id. */
  int KIND_REAL = 42;
  /** RegularExpression Id. */
  int KIND_STRING = 43;
  /** RegularExpression Id. */
  int MAXLENGTH = 44;
  /** RegularExpression Id. */
  int MAXLENGTH_NUMBER = 45;
  /** RegularExpression Id. */
  int RANGE_EQUAL = 46;
  /** RegularExpression Id. */
  int RANGE_GREATERTHAN = 47;
  /** RegularExpression Id. */
  int RANGE_GREATERTHANEQUAL = 48;
  /** RegularExpression Id. */
  int RANGE_LESSTHAN = 49;
  /** RegularExpression Id. */
  int RANGE_LESSTHANEQUAL = 50;
  /** RegularExpression Id. */
  int RANGE_NOTEQUAL = 51;
  /** RegularExpression Id. */
  int RANGE_MATCH = 52;
  /** RegularExpression Id. */
  int RANGE_NOTMATCH = 53;
  /** RegularExpression Id. */
  int RANGE_SMATCH = 54;
  /** RegularExpression Id. */
  int RANGE_NOTSMATCH = 55;
  /** RegularExpression Id. */
  int RANGE_PROGRAM = 56;
  /** RegularExpression Id. */
  int RANGE_BETWEEN = 57;
  /** RegularExpression Id. */
  int BETW1_STRING = 58;
  /** RegularExpression Id. */
  int BETW1_SINGLE = 59;
  /** RegularExpression Id. */
  int BETW1_APOSTROPHE = 60;
  /** RegularExpression Id. */
  int BETW1_CHAR = 61;
  /** RegularExpression Id. */
  int BETW2_INCLUSIVE = 62;
  /** RegularExpression Id. */
  int BETW2_EXCLUSIVE = 63;
  /** RegularExpression Id. */
  int BETW3_STRING = 64;
  /** RegularExpression Id. */
  int BETW3_SINGLE = 65;
  /** RegularExpression Id. */
  int BETW3_APOSTROPHE = 66;
  /** RegularExpression Id. */
  int BETW3_CHAR = 67;
  /** RegularExpression Id. */
  int BETW4_INCLUSIVE = 68;
  /** RegularExpression Id. */
  int BETW4_EXCLUSIVE = 69;
  /** RegularExpression Id. */
  int TRIGGER = 70;
  /** RegularExpression Id. */
  int INPUT = 71;
  /** RegularExpression Id. */
  int TRIGEVENT = 72;
  /** RegularExpression Id. */
  int ACTION = 73;
  /** RegularExpression Id. */
  int CHECK = 74;
  /** RegularExpression Id. */
  int OVERRIDE = 75;
  /** RegularExpression Id. */
  int PROPERTY = 76;
  /** RegularExpression Id. */
  int PROPERTYTO = 77;
  /** RegularExpression Id. */
  int PROPERTYVAL = 78;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 79;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 80;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int TRIGKIND_EXPECTED = 1;
  /** Lexical state. */
  int TRIGEVENT_EXPECTED = 2;
  /** Lexical state. */
  int BETW4_EXPECTED = 3;
  /** Lexical state. */
  int BETW3_EXPECTED = 4;
  /** Lexical state. */
  int BETW2_EXPECTED = 5;
  /** Lexical state. */
  int BETW1_EXPECTED = 6;
  /** Lexical state. */
  int MAXLENGTH_EXPECTED = 7;
  /** Lexical state. */
  int KIND_EXPECTED = 8;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 9;
  /** Lexical state. */
  int STRING_EXPECTED = 10;
  /** Lexical state. */
  int DEFAULT = 11;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"symbolicname\"",
    "\"description\"",
    "\"derived\"",
    "\"hidden\"",
    "\"!hidden\"",
    "\"local\"",
    "\"attribute\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "<FROM>",
    "<TO>",
    "<CARDINALITY_ONE>",
    "<CARDINALITY_MANY>",
    "<TYPE_ALL>",
    "\"type\"",
    "<RELATIONSHIP_ALL>",
    "\"relationship\"",
    "\"default\"",
    "\"multivalue\"",
    "\"!multivalue\"",
    "\"resetonclone\"",
    "\"!resetonclone\"",
    "\"resetonrevision\"",
    "\"!resetonrevision\"",
    "\"rangevalue\"",
    "\"!rangevalue\"",
    "\"multiline\"",
    "\"!multiline\"",
    "\"rule\"",
    "\"dimension\"",
    "\"kind\"",
    "\"binary\"",
    "\"boolean\"",
    "\"date\"",
    "\"integer\"",
    "\"real\"",
    "\"string\"",
    "\"maxlength\"",
    "<MAXLENGTH_NUMBER>",
    "<RANGE_EQUAL>",
    "<RANGE_GREATERTHAN>",
    "<RANGE_GREATERTHANEQUAL>",
    "<RANGE_LESSTHAN>",
    "<RANGE_LESSTHANEQUAL>",
    "<RANGE_NOTEQUAL>",
    "<RANGE_MATCH>",
    "<RANGE_NOTMATCH>",
    "<RANGE_SMATCH>",
    "<RANGE_NOTSMATCH>",
    "<RANGE_PROGRAM>",
    "<RANGE_BETWEEN>",
    "<BETW1_STRING>",
    "<BETW1_SINGLE>",
    "\"\\\"\"",
    "<BETW1_CHAR>",
    "\"inclusive\"",
    "\"exclusive\"",
    "<BETW3_STRING>",
    "<BETW3_SINGLE>",
    "\"\\\"\"",
    "<BETW3_CHAR>",
    "\"inclusive\"",
    "\"exclusive\"",
    "\"trigger\"",
    "\"input\"",
    "<TRIGEVENT>",
    "\"action\"",
    "\"check\"",
    "\"override\"",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
    "\"}\"",
    "\"{\"",
  };

}