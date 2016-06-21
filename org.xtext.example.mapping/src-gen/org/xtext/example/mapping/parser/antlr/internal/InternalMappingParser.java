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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMappingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMapping.g"; }



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




    // $ANTLR start "entryRuleMapping"
    // InternalMapping.g:64:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMapping.g:64:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMapping.g:65:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMapping.g:71:1: ruleMapping returns [EObject current=null] : ( (lv_definitions_0_0= ruleDefinition ) )* ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:77:2: ( ( (lv_definitions_0_0= ruleDefinition ) )* )
            // InternalMapping.g:78:2: ( (lv_definitions_0_0= ruleDefinition ) )*
            {
            // InternalMapping.g:78:2: ( (lv_definitions_0_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMapping.g:79:3: (lv_definitions_0_0= ruleDefinition )
            	    {
            	    // InternalMapping.g:79:3: (lv_definitions_0_0= ruleDefinition )
            	    // InternalMapping.g:80:4: lv_definitions_0_0= ruleDefinition
            	    {

            	    				newCompositeNode(grammarAccess.getMappingAccess().getDefinitionsDefinitionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_definitions_0_0=ruleDefinition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMappingRule());
            	    				}
            	    				add(
            	    					current,
            	    					"definitions",
            	    					lv_definitions_0_0,
            	    					"org.xtext.example.mapping.Mapping.Definition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleDefinition"
    // InternalMapping.g:100:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMapping.g:100:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMapping.g:101:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMapping.g:107:1: ruleDefinition returns [EObject current=null] : ( ( (lv_formalElement_0_0= ruleFormalElement ) ) otherlv_1= ',' ( (lv_umlElement_2_0= ruleUmlElement ) ) otherlv_3= ',' ( (lv_typeElement_4_0= ruleTypeElement ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_formalElement_0_0 = null;

        EObject lv_umlElement_2_0 = null;

        EObject lv_typeElement_4_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:113:2: ( ( ( (lv_formalElement_0_0= ruleFormalElement ) ) otherlv_1= ',' ( (lv_umlElement_2_0= ruleUmlElement ) ) otherlv_3= ',' ( (lv_typeElement_4_0= ruleTypeElement ) ) ) )
            // InternalMapping.g:114:2: ( ( (lv_formalElement_0_0= ruleFormalElement ) ) otherlv_1= ',' ( (lv_umlElement_2_0= ruleUmlElement ) ) otherlv_3= ',' ( (lv_typeElement_4_0= ruleTypeElement ) ) )
            {
            // InternalMapping.g:114:2: ( ( (lv_formalElement_0_0= ruleFormalElement ) ) otherlv_1= ',' ( (lv_umlElement_2_0= ruleUmlElement ) ) otherlv_3= ',' ( (lv_typeElement_4_0= ruleTypeElement ) ) )
            // InternalMapping.g:115:3: ( (lv_formalElement_0_0= ruleFormalElement ) ) otherlv_1= ',' ( (lv_umlElement_2_0= ruleUmlElement ) ) otherlv_3= ',' ( (lv_typeElement_4_0= ruleTypeElement ) )
            {
            // InternalMapping.g:115:3: ( (lv_formalElement_0_0= ruleFormalElement ) )
            // InternalMapping.g:116:4: (lv_formalElement_0_0= ruleFormalElement )
            {
            // InternalMapping.g:116:4: (lv_formalElement_0_0= ruleFormalElement )
            // InternalMapping.g:117:5: lv_formalElement_0_0= ruleFormalElement
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getFormalElementFormalElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_formalElement_0_0=ruleFormalElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"formalElement",
            						lv_formalElement_0_0,
            						"org.xtext.example.mapping.Mapping.FormalElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getCommaKeyword_1());
            		
            // InternalMapping.g:138:3: ( (lv_umlElement_2_0= ruleUmlElement ) )
            // InternalMapping.g:139:4: (lv_umlElement_2_0= ruleUmlElement )
            {
            // InternalMapping.g:139:4: (lv_umlElement_2_0= ruleUmlElement )
            // InternalMapping.g:140:5: lv_umlElement_2_0= ruleUmlElement
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getUmlElementUmlElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_umlElement_2_0=ruleUmlElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"umlElement",
            						lv_umlElement_2_0,
            						"org.xtext.example.mapping.Mapping.UmlElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getCommaKeyword_3());
            		
            // InternalMapping.g:161:3: ( (lv_typeElement_4_0= ruleTypeElement ) )
            // InternalMapping.g:162:4: (lv_typeElement_4_0= ruleTypeElement )
            {
            // InternalMapping.g:162:4: (lv_typeElement_4_0= ruleTypeElement )
            // InternalMapping.g:163:5: lv_typeElement_4_0= ruleTypeElement
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getTypeElementTypeElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeElement_4_0=ruleTypeElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"typeElement",
            						lv_typeElement_4_0,
            						"org.xtext.example.mapping.Mapping.TypeElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleFormalElement"
    // InternalMapping.g:184:1: entryRuleFormalElement returns [EObject current=null] : iv_ruleFormalElement= ruleFormalElement EOF ;
    public final EObject entryRuleFormalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalElement = null;


        try {
            // InternalMapping.g:184:54: (iv_ruleFormalElement= ruleFormalElement EOF )
            // InternalMapping.g:185:2: iv_ruleFormalElement= ruleFormalElement EOF
            {
             newCompositeNode(grammarAccess.getFormalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormalElement=ruleFormalElement();

            state._fsp--;

             current =iv_ruleFormalElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalElement"


    // $ANTLR start "ruleFormalElement"
    // InternalMapping.g:191:1: ruleFormalElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMapping.g:197:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMapping.g:198:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMapping.g:198:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMapping.g:199:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMapping.g:199:3: (lv_name_0_0= RULE_ID )
            // InternalMapping.g:200:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFormalElementAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFormalElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalElement"


    // $ANTLR start "entryRuleUmlElement"
    // InternalMapping.g:219:1: entryRuleUmlElement returns [EObject current=null] : iv_ruleUmlElement= ruleUmlElement EOF ;
    public final EObject entryRuleUmlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUmlElement = null;


        try {
            // InternalMapping.g:219:51: (iv_ruleUmlElement= ruleUmlElement EOF )
            // InternalMapping.g:220:2: iv_ruleUmlElement= ruleUmlElement EOF
            {
             newCompositeNode(grammarAccess.getUmlElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUmlElement=ruleUmlElement();

            state._fsp--;

             current =iv_ruleUmlElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUmlElement"


    // $ANTLR start "ruleUmlElement"
    // InternalMapping.g:226:1: ruleUmlElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUmlElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMapping.g:232:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMapping.g:233:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMapping.g:233:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMapping.g:234:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMapping.g:234:3: (lv_name_0_0= RULE_ID )
            // InternalMapping.g:235:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUmlElementAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUmlElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUmlElement"


    // $ANTLR start "entryRuleTypeElement"
    // InternalMapping.g:254:1: entryRuleTypeElement returns [EObject current=null] : iv_ruleTypeElement= ruleTypeElement EOF ;
    public final EObject entryRuleTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeElement = null;


        try {
            // InternalMapping.g:254:52: (iv_ruleTypeElement= ruleTypeElement EOF )
            // InternalMapping.g:255:2: iv_ruleTypeElement= ruleTypeElement EOF
            {
             newCompositeNode(grammarAccess.getTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeElement=ruleTypeElement();

            state._fsp--;

             current =iv_ruleTypeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeElement"


    // $ANTLR start "ruleTypeElement"
    // InternalMapping.g:261:1: ruleTypeElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTypeElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMapping.g:267:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMapping.g:268:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMapping.g:268:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMapping.g:269:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMapping.g:269:3: (lv_name_0_0= RULE_ID )
            // InternalMapping.g:270:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeElementAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}