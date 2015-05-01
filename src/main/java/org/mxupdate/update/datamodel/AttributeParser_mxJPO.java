/* AttributeParser.java */
/* Generated By:JavaCC: Do not edit this line. AttributeParser.java */
package org.mxupdate.update.datamodel;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.mxupdate.update.datamodel.helper.TriggerList_mxJPO.Trigger;
import org.mxupdate.update.datamodel.AttributeCI_mxJPO.Kind;
import org.mxupdate.update.datamodel.AttributeCI_mxJPO.Range;
import org.mxupdate.update.util.AbstractParser_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.ParseException;
import org.mxupdate.update.util.AbstractParser_mxJPO.SimpleCharStream;
import org.mxupdate.update.util.AbstractParser_mxJPO.Token;
import org.mxupdate.update.util.AbstractParser_mxJPO.TokenMgrError;
import org.mxupdate.update.util.AdminPropertyList_mxJPO.AdminProperty;

/**
 * Parses the update format for {@link AttributeCI_mxJPO}.
 */
@SuppressWarnings("unused")
class AttributeParser_mxJPO
    extends AbstractParser_mxJPO implements AttributeParserConstants_mxJPO {

/**************************************************************************** */

/**
 * Parses one complete attribute definition.
 *
 * @param _attribute    target attribute to update with parsed values
 */
  final public void parse(final AttributeCI_mxJPO _attr) throws ParseException, SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {Token tmp;
    Trigger trigger;
    Range range;
    AdminProperty property;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SYMBOLICNAME:
      case DESCRIPTION:
      case DEFAULTVALUE:
      case HIDDEN_TRUE:
      case HIDDEN_FALSE:
      case MULTIVALUE_TRUE:
      case MULTIVALUE_FALSE:
      case RESETONCLONE_TRUE:
      case RESETONCLONE_FALSE:
      case RESETONREVISION_TRUE:
      case RESETONREVISION_FALSE:
      case RANGEVALUE_TRUE:
      case RANGEVALUE_FALSE:
      case MULTILINE_TRUE:
      case MULTILINE_FALSE:
      case MAXLENGTH:
      case RULE:
      case DIMENSION:
      case KIND:
      case TRIGGER:
      case RANGE_EQUAL:
      case RANGE_GREATERTHAN:
      case RANGE_GREATERTHANEQUAL:
      case RANGE_LESSTHAN:
      case RANGE_LESSTHANEQUAL:
      case RANGE_NOTEQUAL:
      case RANGE_MATCH:
      case RANGE_NOTMATCH:
      case RANGE_SMATCH:
      case RANGE_NOTSMATCH:
      case RANGE_PROGRAM:
      case RANGE_BETWEEN:
      case PROPERTY:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case KIND:{
        jj_consume_token(KIND);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case KIND_BINARY:{
          jj_consume_token(KIND_BINARY);
this.setValue(_attr, "kind",                   Kind.Binary);
          break;
          }
        case KIND_BOOLEAN:{
          jj_consume_token(KIND_BOOLEAN);
this.setValue(_attr, "kind",                   Kind.Boolean);
          break;
          }
        case KIND_DATE:{
          jj_consume_token(KIND_DATE);
this.setValue(_attr, "kind",                   Kind.Date);
          break;
          }
        case KIND_INTEGER:{
          jj_consume_token(KIND_INTEGER);
this.setValue(_attr, "kind",                   Kind.Integer);
          break;
          }
        case KIND_REAL:{
          jj_consume_token(KIND_REAL);
this.setValue(_attr, "kind",                   Kind.Real);
          break;
          }
        case KIND_STRING:{
          jj_consume_token(KIND_STRING);
this.setValue(_attr, "kind",                   Kind.String);
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case SYMBOLICNAME:{
        jj_consume_token(SYMBOLICNAME);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.appendValue(_attr, "symbolicNames",       this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.appendValue(_attr, "symbolicNames",       this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case DESCRIPTION:{
        jj_consume_token(DESCRIPTION);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTILINESTRING:{
          tmp = jj_consume_token(MULTILINESTRING);
this.setValue(_attr, "description",            this.getString(tmp.image));
          break;
          }
        case MULTILINESINGLE:{
          tmp = jj_consume_token(MULTILINESINGLE);
this.setValue(_attr, "description",            this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case DEFAULTVALUE:{
        jj_consume_token(DEFAULTVALUE);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTILINESTRING:{
          tmp = jj_consume_token(MULTILINESTRING);
this.setValue(_attr, "defaultValue",           this.getString(tmp.image));
          break;
          }
        case MULTILINESINGLE:{
          tmp = jj_consume_token(MULTILINESINGLE);
this.setValue(_attr, "defaultValue",           this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case HIDDEN_TRUE:{
        jj_consume_token(HIDDEN_TRUE);
this.setValue(_attr, "hidden",                 true);
        break;
        }
      case HIDDEN_FALSE:{
        jj_consume_token(HIDDEN_FALSE);
this.setValue(_attr, "hidden",                 false);
        break;
        }
      case MULTIVALUE_TRUE:{
        jj_consume_token(MULTIVALUE_TRUE);
this.setValue(_attr, "multiValue",             true);
        break;
        }
      case MULTIVALUE_FALSE:{
        jj_consume_token(MULTIVALUE_FALSE);
this.setValue(_attr, "multiValue",             false);
        break;
        }
      case RESETONCLONE_TRUE:{
        jj_consume_token(RESETONCLONE_TRUE);
this.setValue(_attr, "resetOnClone",           true);
        break;
        }
      case RESETONCLONE_FALSE:{
        jj_consume_token(RESETONCLONE_FALSE);
this.setValue(_attr, "resetOnClone",           false);
        break;
        }
      case RESETONREVISION_TRUE:{
        jj_consume_token(RESETONREVISION_TRUE);
this.setValue(_attr, "resetOnRevision",        true);
        break;
        }
      case RESETONREVISION_FALSE:{
        jj_consume_token(RESETONREVISION_FALSE);
this.setValue(_attr, "resetOnRevision",        false);
        break;
        }
      case RANGEVALUE_TRUE:{
        jj_consume_token(RANGEVALUE_TRUE);
this.setValue(_attr, "rangeValue",             true);
        break;
        }
      case RANGEVALUE_FALSE:{
        jj_consume_token(RANGEVALUE_FALSE);
this.setValue(_attr, "rangeValue",             false);
        break;
        }
      case MULTILINE_TRUE:{
        jj_consume_token(MULTILINE_TRUE);
this.setValue(_attr, "multiline",              true);
        break;
        }
      case MULTILINE_FALSE:{
        jj_consume_token(MULTILINE_FALSE);
this.setValue(_attr, "multiline",              false);
        break;
        }
      case MAXLENGTH:{
        jj_consume_token(MAXLENGTH);
        tmp = jj_consume_token(MAXLENGTH_NUMBER);
this.setValue(_attr, "maxLength",              this.getSingle(tmp.image));
        break;
        }
      case RULE:{
        jj_consume_token(RULE);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.appendValue(_attr, "rules",               this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.appendValue(_attr, "rules",               this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case DIMENSION:{
        jj_consume_token(DIMENSION);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(_attr, "dimension",              this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(_attr, "dimension",              this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case TRIGGER:{
        jj_consume_token(TRIGGER);
trigger = new Trigger();this.appendValue(_attr, "triggers", "triggersStack", trigger);
        tmp = jj_consume_token(TRIGEVENT);
this.setValue(trigger, "eventType",            this.getSingle(tmp.image));
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ACTION:{
          jj_consume_token(ACTION);
this.setValue(trigger, "kind",                 "action");
          break;
          }
        case CHECK:{
          jj_consume_token(CHECK);
this.setValue(trigger, "kind",                 "check");
          break;
          }
        case OVERRIDE:{
          jj_consume_token(OVERRIDE);
this.setValue(trigger, "kind",                 "override");
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(trigger, "program",              this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(trigger, "program",              this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INPUT:{
          jj_consume_token(INPUT);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case STRING:{
            tmp = jj_consume_token(STRING);
this.setValue(trigger, "arguments",            this.getString(tmp.image));
            break;
            }
          case SINGLE:{
            tmp = jj_consume_token(SINGLE);
this.setValue(trigger, "arguments",            this.getSingle(tmp.image));
            break;
            }
          default:
            jj_la1[9] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          ;
        }
        break;
        }
      case RANGE_EQUAL:{
        jj_consume_token(RANGE_EQUAL);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "=");      this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "=");      this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_GREATERTHAN:{
        jj_consume_token(RANGE_GREATERTHAN);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", ">");      this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", ">");      this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_GREATERTHANEQUAL:{
        jj_consume_token(RANGE_GREATERTHANEQUAL);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", ">=");     this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", ">=");     this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_LESSTHAN:{
        jj_consume_token(RANGE_LESSTHAN);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "<");      this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "<");      this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_LESSTHANEQUAL:{
        jj_consume_token(RANGE_LESSTHANEQUAL);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "<=");     this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "<=");     this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_NOTEQUAL:{
        jj_consume_token(RANGE_NOTEQUAL);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "!=");     this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "!=");     this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_MATCH:{
        jj_consume_token(RANGE_MATCH);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "match");  this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "match");  this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_NOTMATCH:{
        jj_consume_token(RANGE_NOTMATCH);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "!match"); this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "!match"); this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_SMATCH:{
        jj_consume_token(RANGE_SMATCH);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "smatch"); this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "smatch"); this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[19] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_NOTSMATCH:{
        jj_consume_token(RANGE_NOTSMATCH);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "!smatch");this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "!smatch");this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[20] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case RANGE_PROGRAM:{
        jj_consume_token(RANGE_PROGRAM);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
range = new Range();this.setValue(range, "type", "program");this.setValue(range, "value1", this.getString(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
range = new Range();this.setValue(range, "type", "program");this.setValue(range, "value1", this.getSingle(tmp.image));this.appendValue(_attr, "rangesStack", range);
          break;
          }
        default:
          jj_la1[21] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case INPUT:{
          jj_consume_token(INPUT);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case STRING:{
            tmp = jj_consume_token(STRING);
this.setValue(range, "value2", this.getString(tmp.image));
            break;
            }
          case SINGLE:{
            tmp = jj_consume_token(SINGLE);
this.setValue(range, "value2", this.getSingle(tmp.image));
            break;
            }
          default:
            jj_la1[22] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[23] = jj_gen;
          ;
        }
        break;
        }
      case RANGE_BETWEEN:{
        jj_consume_token(RANGE_BETWEEN);
range = new Range();this.setValue(range, "type", "between");this.appendValue(_attr, "rangesStack", range);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BETW1_STRING:{
          tmp = jj_consume_token(BETW1_STRING);
this.setValue(range, "value1", this.getString(tmp.image));
          break;
          }
        case BETW1_SINGLE:{
          tmp = jj_consume_token(BETW1_SINGLE);
this.setValue(range, "value1", this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[24] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BETW2_INCLUSIVE:{
          jj_consume_token(BETW2_INCLUSIVE);
this.setValue(range, "include1", true);
          break;
          }
        case BETW2_EXCLUSIVE:{
          jj_consume_token(BETW2_EXCLUSIVE);
this.setValue(range, "include1", false);
          break;
          }
        default:
          jj_la1[25] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BETW3_STRING:{
          tmp = jj_consume_token(BETW3_STRING);
this.setValue(range, "value2", this.getString(tmp.image));
          break;
          }
        case BETW3_SINGLE:{
          tmp = jj_consume_token(BETW3_SINGLE);
this.setValue(range, "value2", this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[26] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case BETW4_INCLUSIVE:{
          jj_consume_token(BETW4_INCLUSIVE);
this.setValue(range, "include2", true);
          break;
          }
        case BETW4_EXCLUSIVE:{
          jj_consume_token(BETW4_EXCLUSIVE);
this.setValue(range, "include2", false);
          break;
          }
        default:
          jj_la1[27] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case PROPERTY:{
        jj_consume_token(PROPERTY);
property = new AdminProperty();this.appendValue(this.getValue(_attr, "properties"), "propertiesStack", property);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STRING:{
          tmp = jj_consume_token(STRING);
this.setValue(property, "name", this.getString(tmp.image));
          break;
          }
        case SINGLE:{
          tmp = jj_consume_token(SINGLE);
this.setValue(property, "name", this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[28] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PROPERTYTO:
          case PROPERTYVAL:{
            ;
            break;
            }
          default:
            jj_la1[29] = jj_gen;
            break label_2;
          }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PROPERTYVAL:{
            jj_consume_token(PROPERTYVAL);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case STRING:{
              tmp = jj_consume_token(STRING);
this.setValue(property, "value", this.getString(tmp.image));
              break;
              }
            case SINGLE:{
              tmp = jj_consume_token(SINGLE);
this.setValue(property, "value", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[30] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          case PROPERTYTO:{
            jj_consume_token(PROPERTYTO);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case ADMINTYPE_STRING:{
              tmp = jj_consume_token(ADMINTYPE_STRING);
this.setValue(property, "refAdminType", this.getString(tmp.image));
              break;
              }
            case ADMINTYPE_SINGLE:{
              tmp = jj_consume_token(ADMINTYPE_SINGLE);
this.setValue(property, "refAdminType", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[31] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case STRING:{
              tmp = jj_consume_token(STRING);
this.setValue(property, "refAdminName", this.getString(tmp.image));
              break;
              }
            case SINGLE:{
              tmp = jj_consume_token(SINGLE);
this.setValue(property, "refAdminName", this.getSingle(tmp.image));
              break;
              }
            default:
              jj_la1[32] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
            break;
            }
          default:
            jj_la1[33] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
        break;
        }
      default:
        jj_la1[34] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  /** Generated Token Manager. */
  public AttributeParserTokenManager_mxJPO token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[35];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x107fffe0,0xe0000000,0x3000000,0xc000000,0xc000000,0x3000000,0x3000000,0x0,0x3000000,0x3000000,0x800000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x3000000,0x800000,0x0,0x0,0x0,0x0,0x3000000,0x0,0x3000000,0x0,0x3000000,0x0,0x107fffe0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x1ffe10,0x7,0x0,0x0,0x0,0x0,0x0,0x1c0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x600000,0x6000000,0x18000000,0x80000000,0x0,0x0,0x0,0x0,0x0,0x0,0x1ffe10,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x2,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x0,0xc,0x0,0x30,0x0,0xc,0x2,};
   }

  /** Constructor with InputStream. */
  public AttributeParser_mxJPO(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public AttributeParser_mxJPO(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AttributeParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 35; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 35; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public AttributeParser_mxJPO(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AttributeParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 35; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new AttributeParserTokenManager_mxJPO(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 35; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public AttributeParser_mxJPO(AttributeParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 35; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AttributeParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 35; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[70];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 35; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 70; i++) {
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
