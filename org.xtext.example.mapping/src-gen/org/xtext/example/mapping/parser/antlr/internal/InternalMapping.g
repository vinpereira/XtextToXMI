/*
 * generated by Xtext 2.9.1
 */
grammar InternalMapping;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mapping.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mapping.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mapping.services.MappingGrammarAccess;

}

@parser::members {

 	private MappingGrammarAccess grammarAccess;

    public InternalMappingParser(TokenStream input, MappingGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Mapping";
   	}

   	@Override
   	protected MappingGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMapping
entryRuleMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMappingRule()); }
	iv_ruleMapping=ruleMapping
	{ $current=$iv_ruleMapping.current; }
	EOF;

// Rule Mapping
ruleMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMappingAccess().getDefinitionsDefinitionParserRuleCall_0());
			}
			lv_definitions_0_0=ruleDefinition
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMappingRule());
				}
				add(
					$current,
					"definitions",
					lv_definitions_0_0,
					"org.xtext.example.mapping.Mapping.Definition");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getFormalElementFormalElementParserRuleCall_0_0());
				}
				lv_formalElement_0_0=ruleFormalElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"formalElement",
						lv_formalElement_0_0,
						"org.xtext.example.mapping.Mapping.FormalElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=','
		{
			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getCommaKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getUmlElementUmlElementParserRuleCall_2_0());
				}
				lv_umlElement_2_0=ruleUmlElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"umlElement",
						lv_umlElement_2_0,
						"org.xtext.example.mapping.Mapping.UmlElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getTypeElementTypeElementParserRuleCall_4_0());
				}
				lv_typeElement_4_0=ruleTypeElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"typeElement",
						lv_typeElement_4_0,
						"org.xtext.example.mapping.Mapping.TypeElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFormalElement
entryRuleFormalElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFormalElementRule()); }
	iv_ruleFormalElement=ruleFormalElement
	{ $current=$iv_ruleFormalElement.current; }
	EOF;

// Rule FormalElement
ruleFormalElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getFormalElementAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFormalElementRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleUmlElement
entryRuleUmlElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUmlElementRule()); }
	iv_ruleUmlElement=ruleUmlElement
	{ $current=$iv_ruleUmlElement.current; }
	EOF;

// Rule UmlElement
ruleUmlElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getUmlElementAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getUmlElementRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleTypeElement
entryRuleTypeElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeElementRule()); }
	iv_ruleTypeElement=ruleTypeElement
	{ $current=$iv_ruleTypeElement.current; }
	EOF;

// Rule TypeElement
ruleTypeElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTypeElementAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeElementRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
