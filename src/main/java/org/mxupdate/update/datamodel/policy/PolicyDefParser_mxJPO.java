/* Generated By:JavaCC: Do not edit this line. PolicyDefParser.java */
package org.mxupdate.update.datamodel.policy;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.mxupdate.mapping.TypeDef_mxJPO;
import org.mxupdate.update.datamodel.Policy_mxJPO;
import org.mxupdate.update.datamodel.Policy_mxJPO.Access;
import org.mxupdate.update.datamodel.Policy_mxJPO.AccessPrefix;
import org.mxupdate.update.datamodel.Policy_mxJPO.AccessFilter;
import org.mxupdate.update.util.AbstractParser_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;

public class PolicyDefParser_mxJPO
    extends AbstractParser_mxJPO implements PolicyDefParserConstants_mxJPO {

/**
 * Parses one complete policy definition.
 *
 * @param _paramCache   parameter cache
 * @param _typeDef      type definition of the policy (to instantiate the
 *                      policy)
 * @param _mxName       MX name of the policy
 */
  final public Policy_mxJPO policy(final ParameterCache_mxJPO _paramCache,
                    final TypeDef_mxJPO _typeDef,
                    final String _mxName) throws ParseException_mxJPO, SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
    final Policy_mxJPO policy = (Policy_mxJPO) _typeDef.newTypeInstance(_mxName);
    String tmp;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DESCRIPTION:
      case TYPE:
      case FORMAT:
      case STORE:
      case DEFAULTFORMAT:
      case DELIMITER:
      case SEQUENCE:
      case MINORSEQUENCE:
      case MAJORSEQUENCE:
      case HIDDEN:
      case STATE:
      case ALLSTATE:
        ;
        break;
      default:
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DESCRIPTION:
        jj_consume_token(DESCRIPTION);
        tmp = sString();
                                                this.getField(policy, "description").set(tmp);
        break;
      case FORMAT:
        format(policy);
        break;
      case TYPE:
        type(policy);
        break;
      case DEFAULTFORMAT:
        jj_consume_token(DEFAULTFORMAT);
        tmp = sString();
                                                this.getField(policy, "defaultFormat").set(tmp);
        break;
      case DELIMITER:
        jj_consume_token(DELIMITER);
        tmp = sString();
                                                this.getField(policy, "delimiter").set(tmp);
        break;
      case SEQUENCE:
        jj_consume_token(SEQUENCE);
        tmp = sString();
                                                this.getField(policy, "minorsequence").set(tmp);
        break;
      case MINORSEQUENCE:
        jj_consume_token(MINORSEQUENCE);
        tmp = sString();
                                                this.getField(policy, "minorsequence").set(tmp);
        break;
      case MAJORSEQUENCE:
        jj_consume_token(MAJORSEQUENCE);
        tmp = sString();
                                                this.getField(policy, "majorsequence").set(tmp);
        break;
      case STORE:
        jj_consume_token(STORE);
        tmp = sString();
                                                this.getField(policy, "store").set(tmp);
        break;
      case HIDDEN:
        jj_consume_token(HIDDEN);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                this.getField(policy, "hidden").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                this.getField(policy, "hidden").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case ALLSTATE:
        allstate(policy);
        break;
      case STATE:
        state(policy);
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
        this.prepareObject(_paramCache, policy);
        {if (true) return policy;}
    throw new Error("Missing return statement in function");
  }

/**
 * Format of a policy definition.
 *
 * @param _policy   current parsed policy
 */
  final public void format(final Policy_mxJPO _policy) throws ParseException_mxJPO {
    Set<String> set;
    jj_consume_token(FORMAT);
    if (jj_2_1(2)) {
      jj_consume_token(LALL_ALL);
                      set = new HashSet<String>();set.add("all");
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LALL_CURLY_BRACKET_OPEN:
      case L_CURLY_BRACKET_OPEN:
        set = lList();
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
        this.getField(_policy, "formats").set(set);
  }

/**
 * Format of a type definition.
 *
 * @param _policy   current parsed policy
 */
  final public void type(final Policy_mxJPO _policy) throws ParseException_mxJPO {
    Set<String> set;
    jj_consume_token(TYPE);
    if (jj_2_2(2)) {
      jj_consume_token(LALL_ALL);
                      set = new HashSet<String>();set.add("all");
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LALL_CURLY_BRACKET_OPEN:
      case L_CURLY_BRACKET_OPEN:
        set = lList();
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
        this.getField(_policy, "types").set(set);
  }

/**
 * Parses the all state definition.
 *
 * @param _policy   policy for which the all state definition is parsed
 */
  final public void allstate(final Policy_mxJPO _policy) throws ParseException_mxJPO {
    final Policy_mxJPO.Access access = this.getField(_policy, "allStateAccess").<Policy_mxJPO.Access>get();
    jj_consume_token(ALLSTATE);
    jj_consume_token(108);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case REVOKE:
      case LOGIN:
      case OWNER:
      case PUBLIC:
      case USER:
        ;
        break;
      default:
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OWNER:
        stateOwnerAccess(AccessPrefix.All, access);
        break;
      case PUBLIC:
        statePublicAccess(AccessPrefix.All, access);
        break;
      case USER:
        stateUserAccess(AccessPrefix.All, access);
        break;
      case REVOKE:
        jj_consume_token(REVOKE);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OWNER:
          stateOwnerAccess(AccessPrefix.Revoke, access);
          break;
        case PUBLIC:
          statePublicAccess(AccessPrefix.Revoke, access);
          break;
        case USER:
          stateUserAccess(AccessPrefix.Revoke, access);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case LOGIN:
        jj_consume_token(LOGIN);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OWNER:
          stateOwnerAccess(AccessPrefix.Login,  access);
          break;
        case PUBLIC:
          statePublicAccess(AccessPrefix.Login,  access);
          break;
        case USER:
          stateUserAccess(AccessPrefix.Login,  access);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
    jj_consume_token(109);
        this.getField(_policy, "allState").set(true);
  }

/**
 * Parses one state definition.
 *
 * @param _policy   policy for which the all state definition is parsed
 */
  final public void state(final Policy_mxJPO _policy) throws ParseException_mxJPO {
    final Policy_mxJPO.State state = new Policy_mxJPO.State();
    String tmpStr;
    Set<String> tmpSet;
    jj_consume_token(STATE);
    tmpStr = sString();
                                this.getField(state, "name").set(tmpStr);
    jj_consume_token(108);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case REGISTEREDNAME:
      case REVISION:
      case MINORREVISION:
      case MAJORREVISION:
      case VERSION:
      case PROMOTE:
      case CHECKOUTHISTORY:
      case PUBLISHED:
      case REVOKE:
      case LOGIN:
      case OWNER:
      case PUBLIC:
      case USER:
      case ACTION:
      case CHECK:
      case TRIGGER:
      case SIGNATURE:
      case ROUTE:
        ;
        break;
      default:
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case REGISTEREDNAME:
        jj_consume_token(REGISTEREDNAME);
        tmpStr = sString();
                                                     this.appendValue(state, "symbolicNames", tmpStr);
        break;
      case REVISION:
        jj_consume_token(REVISION);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                     this.getField(state, "minorrevisionable").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                     this.getField(state, "minorrevisionable").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case MINORREVISION:
        jj_consume_token(MINORREVISION);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                     this.getField(state, "minorrevisionable").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                     this.getField(state, "minorrevisionable").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case MAJORREVISION:
        jj_consume_token(MAJORREVISION);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                     this.getField(state, "majorrevisionable").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                     this.getField(state, "majorrevisionable").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case VERSION:
        jj_consume_token(VERSION);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                     this.getField(state, "versionable").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                     this.getField(state, "versionable").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case PROMOTE:
        jj_consume_token(PROMOTE);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                     this.getField(state, "autoPromotion").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                     this.getField(state, "autoPromotion").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case CHECKOUTHISTORY:
        jj_consume_token(CHECKOUTHISTORY);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                     this.getField(state, "checkoutHistory").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                     this.getField(state, "checkoutHistory").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case PUBLISHED:
        jj_consume_token(PUBLISHED);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case BOOLEAN_TRUE:
          jj_consume_token(BOOLEAN_TRUE);
                                                     this.getField(state, "published").set(true);
          break;
        case BOOLEAN_FALSE:
          jj_consume_token(BOOLEAN_FALSE);
                                                     this.getField(state, "published").set(false);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case OWNER:
        stateOwnerAccess(AccessPrefix.All, state);
        break;
      case PUBLIC:
        statePublicAccess(AccessPrefix.All, state);
        break;
      case USER:
        stateUserAccess(AccessPrefix.All, state);
        break;
      case REVOKE:
        jj_consume_token(REVOKE);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OWNER:
          stateOwnerAccess(AccessPrefix.Revoke, state);
          break;
        case PUBLIC:
          statePublicAccess(AccessPrefix.Revoke, state);
          break;
        case USER:
          stateUserAccess(AccessPrefix.Revoke, state);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case LOGIN:
        jj_consume_token(LOGIN);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OWNER:
          stateOwnerAccess(AccessPrefix.Login,  state);
          break;
        case PUBLIC:
          statePublicAccess(AccessPrefix.Login,  state);
          break;
        case USER:
          stateUserAccess(AccessPrefix.Login,  state);
          break;
        default:
          jj_consume_token(-1);
          throw new ParseException_mxJPO();
        }
        break;
      case ACTION:
        jj_consume_token(ACTION);
        tmpStr = sString();
                                                     this.getField(state, "actionProgram").set(tmpStr);
        jj_consume_token(INPUT);
        tmpStr = sString();
                                                     this.getField(state, "actionInput").set(tmpStr);
        break;
      case CHECK:
        jj_consume_token(CHECK);
        tmpStr = sString();
                                                     this.getField(state, "checkProgram").set(tmpStr);
        jj_consume_token(INPUT);
        tmpStr = sString();
                                                     this.getField(state, "checkInput").set(tmpStr);
        break;
      case ROUTE:
        jj_consume_token(ROUTE);
        tmpSet = lsList();
                                                     this.getField(state, "routeUsers").set(tmpSet);
        tmpStr = sString();
                                                     this.getField(state, "routeMessage").set(tmpStr);
        break;
      case TRIGGER:
        stateTrigger(state);
        break;
      case SIGNATURE:
        stateSignature(state);
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
    jj_consume_token(109);
        this.appendValue(_policy, "states", state);
  }

/**
 * Parses the access and filter expression for the owner definition.
 *
 * @param _prefix   access filter prefix
 * @param _access   current parsed access definition of the policy
 */
  final public void stateOwnerAccess(final AccessPrefix _prefix, final Access _access) throws ParseException_mxJPO {
    final AccessFilter accessFilter = new AccessFilter();
    jj_consume_token(OWNER);
    stateAccessDef(accessFilter);
        this.getField(accessFilter, "prefix").set(_prefix);
        this.getField(accessFilter, "kind").set("owner");
        ((Map<AccessPrefix,Set<AccessFilter>>)(this.getValue(_access, "ownerAccess"))).get(_prefix).add(accessFilter);
  }

/**
 * Parses the access and filter expression for the public definition.
 *
 * @param _prefix   access filter prefix
 * @param _access   current parsed access definition of the policy
 */
  final public void statePublicAccess(final AccessPrefix _prefix, final Access _access) throws ParseException_mxJPO {
    final AccessFilter accessFilter = new AccessFilter();
    jj_consume_token(PUBLIC);
    stateAccessDef(accessFilter);
        this.getField(accessFilter, "prefix").set(_prefix);
        this.getField(accessFilter, "kind").set("public");
        ((Map<AccessPrefix,Set<AccessFilter>>)(this.getValue(_access, "publicAccess"))).get(_prefix).add(accessFilter);
  }

/**
 * Parses the access and filter expression for a user definition.
 *
 * @param _prefix   access filter prefix
 * @param _access   current parsed access definition of the policy
 */
  final public void stateUserAccess(final AccessPrefix _prefix, final Access _access) throws ParseException_mxJPO {
    final AccessFilter accessFilter = new AccessFilter();
    String user;
    jj_consume_token(USER);
    user = sString();
    stateAccessDef(accessFilter);
        this.getField(accessFilter, "prefix").set(_prefix);
        this.getField(accessFilter, "kind").set("user");
        this.getField(accessFilter, "userRef").set(user);
        ((Map<AccessPrefix,Set<AccessFilter>>)(this.getValue(_access, "userAccess"))).get(_prefix).add(accessFilter);
  }

  final public void stateAccessDef(final AccessFilter _accessFilter) throws ParseException_mxJPO {
    String key = null, filter = null;
    Token_mxJPO access = null;
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KEY:
      case FILTER:
      case ACCESS:
        ;
        break;
      default:
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KEY:
        jj_consume_token(KEY);
        key = sString();
        break;
      case FILTER:
        jj_consume_token(FILTER);
        filter = sString();
        break;
      case ACCESS:
        access = jj_consume_token(ACCESS);
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
        this.getField(_accessFilter, "key").set(key);
        this.getField(_accessFilter, "filter").set(filter);

        if (access == null)  {
            this.getField(_accessFilter, "access").set(new HashSet<String>());
        } else  {
            final String tmp = access.image
                    .replaceFirst("^\u005c\u005c{", "").replaceFirst("\u005c\u005c}$", "")  // remove {}
                    .replaceAll("(\u005ct)|(\u005cn)", " ")                       // replace tabs, new lines
                    .replaceAll("( )+", " ")                            // multiple spaces => one space
                    .trim();                                            // remove trailing spaces
            this.getField(_accessFilter, "access").set(new HashSet<String>(java.util.Arrays.asList(tmp.split(" "))));
        }
  }

  final public void stateTrigger(final Policy_mxJPO.State _state) throws ParseException_mxJPO {
    final Policy_mxJPO.Trigger trigger = new Policy_mxJPO.Trigger();
    String tmp;
    jj_consume_token(TRIGGER);
    tmp = sString();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ACTION:
      jj_consume_token(ACTION);
                             this.getField(trigger, "name").set(tmp + "Action");
      break;
    case CHECK:
      jj_consume_token(CHECK);
                             this.getField(trigger, "name").set(tmp + "Check");
      break;
    case OVERRIDE:
      jj_consume_token(OVERRIDE);
                             this.getField(trigger, "name").set(tmp + "Override");
      break;
    default:
      jj_consume_token(-1);
      throw new ParseException_mxJPO();
    }
    tmp = sString();
                             this.getField(trigger, "program").set(tmp);
    jj_consume_token(INPUT);
    tmp = sString();
                                     this.getField(trigger, "arguments").set(tmp);
        this.appendValue(_state, "triggersStack", trigger);
  }

  final public void stateSignature(final Policy_mxJPO.State _state) throws ParseException_mxJPO {
    final Policy_mxJPO.Signature signature = new Policy_mxJPO.Signature();
    String tmpStr;
    Set<String> tmpSet;
    jj_consume_token(SIGNATURE);
    tmpStr = sString();
                                    this.getField(signature, "name").set(tmpStr);
    jj_consume_token(108);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FILTER:
      case APPROVE:
      case IGNORE:
      case REJECT:
      case BRANCH:
        ;
        break;
      default:
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BRANCH:
        jj_consume_token(BRANCH);
        tmpStr = sString();
                                         this.getField(signature, "branch").set(tmpStr);
        break;
      case APPROVE:
        jj_consume_token(APPROVE);
        tmpSet = lList();
                                         this.getField(signature, "approverUsers").set(tmpSet);
        break;
      case IGNORE:
        jj_consume_token(IGNORE);
        tmpSet = lList();
                                         this.getField(signature, "ignoreUsers").set(tmpSet);
        break;
      case REJECT:
        jj_consume_token(REJECT);
        tmpSet = lList();
                                         this.getField(signature, "rejectUsers").set(tmpSet);
        break;
      case FILTER:
        jj_consume_token(FILTER);
        tmpStr = sString();
                                         this.getField(signature, "filter").set(tmpStr);
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
    jj_consume_token(109);
        this.appendValue(_state, "signatures", signature);
  }

  final public Set<String> lsList() throws ParseException_mxJPO {
    Token_mxJPO tmp;
    Set<String> ret = new HashSet<String>();
    jj_consume_token(LS_CURLY_BRACKET_OPEN);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LS_STRING:
      case LS_SINGLE_STRING:
        ;
        break;
      default:
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LS_STRING:
        tmp = jj_consume_token(LS_STRING);
                                             ret.add(this.getString(tmp.image));
        break;
      case LS_SINGLE_STRING:
        tmp = jj_consume_token(LS_SINGLE_STRING);
                                             ret.add(this.getSingle(tmp.image));
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
    jj_consume_token(LS_CURLY_BRACKET_CLOSE);
        {if (true) return ret;}
    throw new Error("Missing return statement in function");
  }

  final public Set<String> lList() throws ParseException_mxJPO {
    Token_mxJPO tmp;
    Set<String> ret = new HashSet<String>();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case L_CURLY_BRACKET_OPEN:
      jj_consume_token(L_CURLY_BRACKET_OPEN);
      break;
    case LALL_CURLY_BRACKET_OPEN:
      jj_consume_token(LALL_CURLY_BRACKET_OPEN);
      break;
    default:
      jj_consume_token(-1);
      throw new ParseException_mxJPO();
    }
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case L_STRING:
      case L_SINGLE_STRING:
      case L2_CURLY_BRACKET_OPEN:
        ;
        break;
      default:
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case L_STRING:
        tmp = jj_consume_token(L_STRING);
                                    ret.add(this.getString(tmp.image));
        break;
      case L_SINGLE_STRING:
        tmp = jj_consume_token(L_SINGLE_STRING);
                                           ret.add(this.getSingle(tmp.image));
        break;
      case L2_CURLY_BRACKET_OPEN:
        jj_consume_token(L2_CURLY_BRACKET_OPEN);
        tmp = jj_consume_token(L3_BRACE_STRING);
                     ret.add(tmp.image);
        jj_consume_token(L4_CURLY_BRACKET_CLOSE);
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException_mxJPO();
      }
    }
    jj_consume_token(L_CURLY_BRACKET_CLOSE);
        {if (true) return ret;}
    throw new Error("Missing return statement in function");
  }

/**
 * Evaluates a simple string where a list must follow.
 *
 * @return evaluated simple string
 */
  final public String slString() throws ParseException_mxJPO {
    Token_mxJPO tmp;
    String ret;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SL_STRING:
      tmp = jj_consume_token(SL_STRING);
                                     ret = this.getString(tmp.image);
      break;
    case SL_SINGLE_STRING:
      tmp = jj_consume_token(SL_SINGLE_STRING);
                                     ret = this.getSingle(tmp.image);
      break;
    default:
      jj_consume_token(-1);
      throw new ParseException_mxJPO();
    }
        {if (true) return ret;}
    throw new Error("Missing return statement in function");
  }

/**
 * Evaluates a simple string.
 *
 * @return evaluated simple string
 */
  final public String sString() throws ParseException_mxJPO {
    Token_mxJPO tmp;
    String ret;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case S_STRING:
      tmp = jj_consume_token(S_STRING);
                                       ret = this.getString(tmp.image);
      break;
    case S_SINGLE_STRING:
      tmp = jj_consume_token(S_SINGLE_STRING);
                                       ret = this.getSingle(tmp.image);
      break;
    case DELIMITER_CHAR:
      tmp = jj_consume_token(DELIMITER_CHAR);
                                       ret = this.getSingle(tmp.image);
      break;
    default:
      jj_consume_token(-1);
      throw new ParseException_mxJPO();
    }
        {if (true) return ret;}
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  private boolean jj_3_1() {
    if (jj_scan_token(LALL_ALL)) return true;
    return false;
  }

  private boolean jj_3_2() {
    if (jj_scan_token(LALL_ALL)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public PolicyDefParserTokenManager_mxJPO token_source;
  SimpleCharStream_mxJPO jj_input_stream;
  /** Current token. */
  public Token_mxJPO token;
  /** Next token. */
  public Token_mxJPO jj_nt;
  private int jj_ntk;
  private Token_mxJPO jj_scanpos, jj_lastpos;
  private int jj_la;

  /** Constructor with InputStream. */
  public PolicyDefParser_mxJPO(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public PolicyDefParser_mxJPO(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream_mxJPO(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new PolicyDefParserTokenManager_mxJPO(jj_input_stream);
    token = new Token_mxJPO();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token_mxJPO();
    jj_ntk = -1;
  }

  /** Constructor. */
  public PolicyDefParser_mxJPO(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream_mxJPO(stream, 1, 1);
    token_source = new PolicyDefParserTokenManager_mxJPO(jj_input_stream);
    token = new Token_mxJPO();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token_mxJPO();
    jj_ntk = -1;
  }

  /** Constructor with generated Token Manager. */
  public PolicyDefParser_mxJPO(PolicyDefParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token_mxJPO();
    jj_ntk = -1;
  }

  /** Reinitialise. */
  public void ReInit(PolicyDefParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token_mxJPO();
    jj_ntk = -1;
  }

  private Token_mxJPO jj_consume_token(int kind) throws ParseException_mxJPO {
    Token_mxJPO oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      return token;
    }
    token = oldToken;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token_mxJPO getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    return token;
  }

/** Get the specific Token. */
  final public Token_mxJPO getToken(int index) {
    Token_mxJPO t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  /** Generate ParseException. */
  public ParseException_mxJPO generateParseException() {
    Token_mxJPO errortok = token.next;
    int line = errortok.beginLine, column = errortok.beginColumn;
    String mess = (errortok.kind == 0) ? tokenImage[0] : errortok.image;
    return new ParseException_mxJPO("Parse error at line " + line + ", column " + column + ".  Encountered: " + mess);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
