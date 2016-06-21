package org.xtext.example.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.dsl.services.TraceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FormalResults'", "'{'", "','", "'}'", "'TimeNode'", "'FormalElement'", "'Refers to'", "'element'", "'With ID'", "'Belongs to'", "'from'", "'ClassDiagram'", "'SequenceDiagram'", "'StateDiagram'", "'ObjectDiagram'", "'InteractionOverviewDiagram'", "'UMLModel'", "'SysMLModel'", "'BMPNModel'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTraceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTraceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTraceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTrace.g"; }



     	private TraceGrammarAccess grammarAccess;

        public InternalTraceParser(TokenStream input, TraceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FormalResult";
       	}

       	@Override
       	protected TraceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFormalResult"
    // InternalTrace.g:65:1: entryRuleFormalResult returns [EObject current=null] : iv_ruleFormalResult= ruleFormalResult EOF ;
    public final EObject entryRuleFormalResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalResult = null;


        try {
            // InternalTrace.g:65:53: (iv_ruleFormalResult= ruleFormalResult EOF )
            // InternalTrace.g:66:2: iv_ruleFormalResult= ruleFormalResult EOF
            {
             newCompositeNode(grammarAccess.getFormalResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormalResult=ruleFormalResult();

            state._fsp--;

             current =iv_ruleFormalResult; 
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
    // $ANTLR end "entryRuleFormalResult"


    // $ANTLR start "ruleFormalResult"
    // InternalTrace.g:72:1: ruleFormalResult returns [EObject current=null] : (otherlv_0= 'FormalResults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* ) | ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* ) ) otherlv_9= '}' ) ;
    public final EObject ruleFormalResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_timenodes_3_0 = null;

        EObject lv_timenodes_5_0 = null;

        EObject lv_formalElements_6_0 = null;

        EObject lv_formalElements_8_0 = null;



        	enterRule();

        try {
            // InternalTrace.g:78:2: ( (otherlv_0= 'FormalResults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* ) | ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* ) ) otherlv_9= '}' ) )
            // InternalTrace.g:79:2: (otherlv_0= 'FormalResults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* ) | ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* ) ) otherlv_9= '}' )
            {
            // InternalTrace.g:79:2: (otherlv_0= 'FormalResults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* ) | ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* ) ) otherlv_9= '}' )
            // InternalTrace.g:80:3: otherlv_0= 'FormalResults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* ) | ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormalResultAccess().getFormalResultsKeyword_0());
            		
            // InternalTrace.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrace.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrace.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTrace.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFormalResultAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormalResultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFormalResultAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTrace.g:106:3: ( ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* ) | ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTrace.g:107:4: ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* )
                    {
                    // InternalTrace.g:107:4: ( ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )* )
                    // InternalTrace.g:108:5: ( (lv_timenodes_3_0= ruleTimeNode ) ) (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )*
                    {
                    // InternalTrace.g:108:5: ( (lv_timenodes_3_0= ruleTimeNode ) )
                    // InternalTrace.g:109:6: (lv_timenodes_3_0= ruleTimeNode )
                    {
                    // InternalTrace.g:109:6: (lv_timenodes_3_0= ruleTimeNode )
                    // InternalTrace.g:110:7: lv_timenodes_3_0= ruleTimeNode
                    {

                    							newCompositeNode(grammarAccess.getFormalResultAccess().getTimenodesTimeNodeParserRuleCall_3_0_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_timenodes_3_0=ruleTimeNode();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFormalResultRule());
                    							}
                    							add(
                    								current,
                    								"timenodes",
                    								lv_timenodes_3_0,
                    								"org.xtext.example.dsl.Trace.TimeNode");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalTrace.g:127:5: (otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTrace.g:128:6: otherlv_4= ',' ( (lv_timenodes_5_0= ruleTimeNode ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getFormalResultAccess().getCommaKeyword_3_0_1_0());
                    	    					
                    	    // InternalTrace.g:132:6: ( (lv_timenodes_5_0= ruleTimeNode ) )
                    	    // InternalTrace.g:133:7: (lv_timenodes_5_0= ruleTimeNode )
                    	    {
                    	    // InternalTrace.g:133:7: (lv_timenodes_5_0= ruleTimeNode )
                    	    // InternalTrace.g:134:8: lv_timenodes_5_0= ruleTimeNode
                    	    {

                    	    								newCompositeNode(grammarAccess.getFormalResultAccess().getTimenodesTimeNodeParserRuleCall_3_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_timenodes_5_0=ruleTimeNode();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getFormalResultRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"timenodes",
                    	    									lv_timenodes_5_0,
                    	    									"org.xtext.example.dsl.Trace.TimeNode");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:154:4: ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* )
                    {
                    // InternalTrace.g:154:4: ( ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )* )
                    // InternalTrace.g:155:5: ( (lv_formalElements_6_0= ruleFormalElement ) ) (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )*
                    {
                    // InternalTrace.g:155:5: ( (lv_formalElements_6_0= ruleFormalElement ) )
                    // InternalTrace.g:156:6: (lv_formalElements_6_0= ruleFormalElement )
                    {
                    // InternalTrace.g:156:6: (lv_formalElements_6_0= ruleFormalElement )
                    // InternalTrace.g:157:7: lv_formalElements_6_0= ruleFormalElement
                    {

                    							newCompositeNode(grammarAccess.getFormalResultAccess().getFormalElementsFormalElementParserRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_formalElements_6_0=ruleFormalElement();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFormalResultRule());
                    							}
                    							add(
                    								current,
                    								"formalElements",
                    								lv_formalElements_6_0,
                    								"org.xtext.example.dsl.Trace.FormalElement");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalTrace.g:174:5: (otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTrace.g:175:6: otherlv_7= ',' ( (lv_formalElements_8_0= ruleFormalElement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_5); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getFormalResultAccess().getCommaKeyword_3_1_1_0());
                    	    					
                    	    // InternalTrace.g:179:6: ( (lv_formalElements_8_0= ruleFormalElement ) )
                    	    // InternalTrace.g:180:7: (lv_formalElements_8_0= ruleFormalElement )
                    	    {
                    	    // InternalTrace.g:180:7: (lv_formalElements_8_0= ruleFormalElement )
                    	    // InternalTrace.g:181:8: lv_formalElements_8_0= ruleFormalElement
                    	    {

                    	    								newCompositeNode(grammarAccess.getFormalResultAccess().getFormalElementsFormalElementParserRuleCall_3_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_formalElements_8_0=ruleFormalElement();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getFormalResultRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"formalElements",
                    	    									lv_formalElements_8_0,
                    	    									"org.xtext.example.dsl.Trace.FormalElement");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFormalResultAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFormalResult"


    // $ANTLR start "entryRuleTimeNode"
    // InternalTrace.g:209:1: entryRuleTimeNode returns [EObject current=null] : iv_ruleTimeNode= ruleTimeNode EOF ;
    public final EObject entryRuleTimeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeNode = null;


        try {
            // InternalTrace.g:209:49: (iv_ruleTimeNode= ruleTimeNode EOF )
            // InternalTrace.g:210:2: iv_ruleTimeNode= ruleTimeNode EOF
            {
             newCompositeNode(grammarAccess.getTimeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeNode=ruleTimeNode();

            state._fsp--;

             current =iv_ruleTimeNode; 
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
    // $ANTLR end "entryRuleTimeNode"


    // $ANTLR start "ruleTimeNode"
    // InternalTrace.g:216:1: ruleTimeNode returns [EObject current=null] : (otherlv_0= 'TimeNode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formalelement_3_0= ruleFormalElement ) ) (otherlv_4= ',' ( (lv_formalelement_5_0= ruleFormalElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTimeNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_formalelement_3_0 = null;

        EObject lv_formalelement_5_0 = null;



        	enterRule();

        try {
            // InternalTrace.g:222:2: ( (otherlv_0= 'TimeNode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formalelement_3_0= ruleFormalElement ) ) (otherlv_4= ',' ( (lv_formalelement_5_0= ruleFormalElement ) ) )* otherlv_6= '}' ) )
            // InternalTrace.g:223:2: (otherlv_0= 'TimeNode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formalelement_3_0= ruleFormalElement ) ) (otherlv_4= ',' ( (lv_formalelement_5_0= ruleFormalElement ) ) )* otherlv_6= '}' )
            {
            // InternalTrace.g:223:2: (otherlv_0= 'TimeNode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formalelement_3_0= ruleFormalElement ) ) (otherlv_4= ',' ( (lv_formalelement_5_0= ruleFormalElement ) ) )* otherlv_6= '}' )
            // InternalTrace.g:224:3: otherlv_0= 'TimeNode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formalelement_3_0= ruleFormalElement ) ) (otherlv_4= ',' ( (lv_formalelement_5_0= ruleFormalElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeNodeAccess().getTimeNodeKeyword_0());
            		
            // InternalTrace.g:228:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrace.g:229:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrace.g:229:4: (lv_name_1_0= RULE_ID )
            // InternalTrace.g:230:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTimeNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTrace.g:250:3: ( (lv_formalelement_3_0= ruleFormalElement ) )
            // InternalTrace.g:251:4: (lv_formalelement_3_0= ruleFormalElement )
            {
            // InternalTrace.g:251:4: (lv_formalelement_3_0= ruleFormalElement )
            // InternalTrace.g:252:5: lv_formalelement_3_0= ruleFormalElement
            {

            					newCompositeNode(grammarAccess.getTimeNodeAccess().getFormalelementFormalElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_formalelement_3_0=ruleFormalElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeNodeRule());
            					}
            					add(
            						current,
            						"formalelement",
            						lv_formalelement_3_0,
            						"org.xtext.example.dsl.Trace.FormalElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrace.g:269:3: (otherlv_4= ',' ( (lv_formalelement_5_0= ruleFormalElement ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTrace.g:270:4: otherlv_4= ',' ( (lv_formalelement_5_0= ruleFormalElement ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTimeNodeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalTrace.g:274:4: ( (lv_formalelement_5_0= ruleFormalElement ) )
            	    // InternalTrace.g:275:5: (lv_formalelement_5_0= ruleFormalElement )
            	    {
            	    // InternalTrace.g:275:5: (lv_formalelement_5_0= ruleFormalElement )
            	    // InternalTrace.g:276:6: lv_formalelement_5_0= ruleFormalElement
            	    {

            	    						newCompositeNode(grammarAccess.getTimeNodeAccess().getFormalelementFormalElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_formalelement_5_0=ruleFormalElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTimeNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"formalelement",
            	    							lv_formalelement_5_0,
            	    							"org.xtext.example.dsl.Trace.FormalElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTimeNodeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTimeNode"


    // $ANTLR start "entryRuleFormalElement"
    // InternalTrace.g:302:1: entryRuleFormalElement returns [EObject current=null] : iv_ruleFormalElement= ruleFormalElement EOF ;
    public final EObject entryRuleFormalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalElement = null;


        try {
            // InternalTrace.g:302:54: (iv_ruleFormalElement= ruleFormalElement EOF )
            // InternalTrace.g:303:2: iv_ruleFormalElement= ruleFormalElement EOF
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
    // InternalTrace.g:309:1: ruleFormalElement returns [EObject current=null] : (otherlv_0= 'FormalElement' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) ) otherlv_4= '}' ) ;
    public final EObject ruleFormalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalTrace.g:315:2: ( (otherlv_0= 'FormalElement' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) ) otherlv_4= '}' ) )
            // InternalTrace.g:316:2: (otherlv_0= 'FormalElement' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) ) otherlv_4= '}' )
            {
            // InternalTrace.g:316:2: (otherlv_0= 'FormalElement' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) ) otherlv_4= '}' )
            // InternalTrace.g:317:3: otherlv_0= 'FormalElement' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormalElementAccess().getFormalElementKeyword_0());
            		
            // InternalTrace.g:321:3: ( (otherlv_1= RULE_ID ) )
            // InternalTrace.g:322:4: (otherlv_1= RULE_ID )
            {
            // InternalTrace.g:322:4: (otherlv_1= RULE_ID )
            // InternalTrace.g:323:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormalElementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getFormalElementAccess().getFormalElementFormalElementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFormalElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTrace.g:338:3: ( (lv_element_3_0= ruleElement ) )
            // InternalTrace.g:339:4: (lv_element_3_0= ruleElement )
            {
            // InternalTrace.g:339:4: (lv_element_3_0= ruleElement )
            // InternalTrace.g:340:5: lv_element_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getFormalElementAccess().getElementElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_element_3_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormalElementRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_3_0,
            						"org.xtext.example.dsl.Trace.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormalElementAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleElement"
    // InternalTrace.g:365:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalTrace.g:365:48: (iv_ruleElement= ruleElement EOF )
            // InternalTrace.g:366:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTrace.g:372:1: ruleElement returns [EObject current=null] : (otherlv_0= 'Refers to' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'element' otherlv_3= '{' otherlv_4= 'With ID' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Belongs to' ( ( (lv_diagram_7_0= ruleDiagram ) ) | ( (lv_model_8_0= ruleModel ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_diagram_7_0 = null;

        EObject lv_model_8_0 = null;



        	enterRule();

        try {
            // InternalTrace.g:378:2: ( (otherlv_0= 'Refers to' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'element' otherlv_3= '{' otherlv_4= 'With ID' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Belongs to' ( ( (lv_diagram_7_0= ruleDiagram ) ) | ( (lv_model_8_0= ruleModel ) ) ) otherlv_9= '}' ) )
            // InternalTrace.g:379:2: (otherlv_0= 'Refers to' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'element' otherlv_3= '{' otherlv_4= 'With ID' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Belongs to' ( ( (lv_diagram_7_0= ruleDiagram ) ) | ( (lv_model_8_0= ruleModel ) ) ) otherlv_9= '}' )
            {
            // InternalTrace.g:379:2: (otherlv_0= 'Refers to' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'element' otherlv_3= '{' otherlv_4= 'With ID' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Belongs to' ( ( (lv_diagram_7_0= ruleDiagram ) ) | ( (lv_model_8_0= ruleModel ) ) ) otherlv_9= '}' )
            // InternalTrace.g:380:3: otherlv_0= 'Refers to' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'element' otherlv_3= '{' otherlv_4= 'With ID' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Belongs to' ( ( (lv_diagram_7_0= ruleDiagram ) ) | ( (lv_model_8_0= ruleModel ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getRefersToKeyword_0());
            		
            // InternalTrace.g:384:3: ( (otherlv_1= RULE_ID ) )
            // InternalTrace.g:385:4: (otherlv_1= RULE_ID )
            {
            // InternalTrace.g:385:4: (otherlv_1= RULE_ID )
            // InternalTrace.g:386:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getElementAccess().getTypeElementTypeElementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getElementAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getElementAccess().getWithIDKeyword_4());
            		
            // InternalTrace.g:409:3: ( (otherlv_5= RULE_ID ) )
            // InternalTrace.g:410:4: (otherlv_5= RULE_ID )
            {
            // InternalTrace.g:410:4: (otherlv_5= RULE_ID )
            // InternalTrace.g:411:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getElementAccess().getUmlElementUmlElementCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getElementAccess().getBelongsToKeyword_6());
            		
            // InternalTrace.g:426:3: ( ( (lv_diagram_7_0= ruleDiagram ) ) | ( (lv_model_8_0= ruleModel ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=22 && LA5_0<=26)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=27 && LA5_0<=29)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTrace.g:427:4: ( (lv_diagram_7_0= ruleDiagram ) )
                    {
                    // InternalTrace.g:427:4: ( (lv_diagram_7_0= ruleDiagram ) )
                    // InternalTrace.g:428:5: (lv_diagram_7_0= ruleDiagram )
                    {
                    // InternalTrace.g:428:5: (lv_diagram_7_0= ruleDiagram )
                    // InternalTrace.g:429:6: lv_diagram_7_0= ruleDiagram
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getDiagramDiagramParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_diagram_7_0=ruleDiagram();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"diagram",
                    							lv_diagram_7_0,
                    							"org.xtext.example.dsl.Trace.Diagram");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:447:4: ( (lv_model_8_0= ruleModel ) )
                    {
                    // InternalTrace.g:447:4: ( (lv_model_8_0= ruleModel ) )
                    // InternalTrace.g:448:5: (lv_model_8_0= ruleModel )
                    {
                    // InternalTrace.g:448:5: (lv_model_8_0= ruleModel )
                    // InternalTrace.g:449:6: lv_model_8_0= ruleModel
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getModelModelParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_model_8_0=ruleModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_8_0,
                    							"org.xtext.example.dsl.Trace.Model");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDiagram"
    // InternalTrace.g:475:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalTrace.g:475:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalTrace.g:476:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalTrace.g:482:1: ruleDiagram returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDiagramKind ) ) otherlv_1= 'from' ( (lv_model_2_0= ruleModel ) ) ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_model_2_0 = null;



        	enterRule();

        try {
            // InternalTrace.g:488:2: ( ( ( (lv_kind_0_0= ruleDiagramKind ) ) otherlv_1= 'from' ( (lv_model_2_0= ruleModel ) ) ) )
            // InternalTrace.g:489:2: ( ( (lv_kind_0_0= ruleDiagramKind ) ) otherlv_1= 'from' ( (lv_model_2_0= ruleModel ) ) )
            {
            // InternalTrace.g:489:2: ( ( (lv_kind_0_0= ruleDiagramKind ) ) otherlv_1= 'from' ( (lv_model_2_0= ruleModel ) ) )
            // InternalTrace.g:490:3: ( (lv_kind_0_0= ruleDiagramKind ) ) otherlv_1= 'from' ( (lv_model_2_0= ruleModel ) )
            {
            // InternalTrace.g:490:3: ( (lv_kind_0_0= ruleDiagramKind ) )
            // InternalTrace.g:491:4: (lv_kind_0_0= ruleDiagramKind )
            {
            // InternalTrace.g:491:4: (lv_kind_0_0= ruleDiagramKind )
            // InternalTrace.g:492:5: lv_kind_0_0= ruleDiagramKind
            {

            					newCompositeNode(grammarAccess.getDiagramAccess().getKindDiagramKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_kind_0_0=ruleDiagramKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiagramRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"org.xtext.example.dsl.Trace.DiagramKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getFromKeyword_1());
            		
            // InternalTrace.g:513:3: ( (lv_model_2_0= ruleModel ) )
            // InternalTrace.g:514:4: (lv_model_2_0= ruleModel )
            {
            // InternalTrace.g:514:4: (lv_model_2_0= ruleModel )
            // InternalTrace.g:515:5: lv_model_2_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getDiagramAccess().getModelModelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_model_2_0=ruleModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiagramRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_2_0,
            						"org.xtext.example.dsl.Trace.Model");
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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleModel"
    // InternalTrace.g:536:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTrace.g:536:46: (iv_ruleModel= ruleModel EOF )
            // InternalTrace.g:537:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTrace.g:543:1: ruleModel returns [EObject current=null] : ( (lv_kind_0_0= ruleModelKind ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;



        	enterRule();

        try {
            // InternalTrace.g:549:2: ( ( (lv_kind_0_0= ruleModelKind ) ) )
            // InternalTrace.g:550:2: ( (lv_kind_0_0= ruleModelKind ) )
            {
            // InternalTrace.g:550:2: ( (lv_kind_0_0= ruleModelKind ) )
            // InternalTrace.g:551:3: (lv_kind_0_0= ruleModelKind )
            {
            // InternalTrace.g:551:3: (lv_kind_0_0= ruleModelKind )
            // InternalTrace.g:552:4: lv_kind_0_0= ruleModelKind
            {

            				newCompositeNode(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_kind_0_0=ruleModelKind();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"kind",
            					lv_kind_0_0,
            					"org.xtext.example.dsl.Trace.ModelKind");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "ruleDiagramKind"
    // InternalTrace.g:572:1: ruleDiagramKind returns [Enumerator current=null] : ( (enumLiteral_0= 'ClassDiagram' ) | (enumLiteral_1= 'SequenceDiagram' ) | (enumLiteral_2= 'StateDiagram' ) | (enumLiteral_3= 'ObjectDiagram' ) | (enumLiteral_4= 'InteractionOverviewDiagram' ) ) ;
    public final Enumerator ruleDiagramKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTrace.g:578:2: ( ( (enumLiteral_0= 'ClassDiagram' ) | (enumLiteral_1= 'SequenceDiagram' ) | (enumLiteral_2= 'StateDiagram' ) | (enumLiteral_3= 'ObjectDiagram' ) | (enumLiteral_4= 'InteractionOverviewDiagram' ) ) )
            // InternalTrace.g:579:2: ( (enumLiteral_0= 'ClassDiagram' ) | (enumLiteral_1= 'SequenceDiagram' ) | (enumLiteral_2= 'StateDiagram' ) | (enumLiteral_3= 'ObjectDiagram' ) | (enumLiteral_4= 'InteractionOverviewDiagram' ) )
            {
            // InternalTrace.g:579:2: ( (enumLiteral_0= 'ClassDiagram' ) | (enumLiteral_1= 'SequenceDiagram' ) | (enumLiteral_2= 'StateDiagram' ) | (enumLiteral_3= 'ObjectDiagram' ) | (enumLiteral_4= 'InteractionOverviewDiagram' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTrace.g:580:3: (enumLiteral_0= 'ClassDiagram' )
                    {
                    // InternalTrace.g:580:3: (enumLiteral_0= 'ClassDiagram' )
                    // InternalTrace.g:581:4: enumLiteral_0= 'ClassDiagram'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDiagramKindAccess().getCLASSDIAGRAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDiagramKindAccess().getCLASSDIAGRAMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:588:3: (enumLiteral_1= 'SequenceDiagram' )
                    {
                    // InternalTrace.g:588:3: (enumLiteral_1= 'SequenceDiagram' )
                    // InternalTrace.g:589:4: enumLiteral_1= 'SequenceDiagram'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDiagramKindAccess().getSEQUENCEDIAGRAMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDiagramKindAccess().getSEQUENCEDIAGRAMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTrace.g:596:3: (enumLiteral_2= 'StateDiagram' )
                    {
                    // InternalTrace.g:596:3: (enumLiteral_2= 'StateDiagram' )
                    // InternalTrace.g:597:4: enumLiteral_2= 'StateDiagram'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDiagramKindAccess().getSTATEDIAGRAMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDiagramKindAccess().getSTATEDIAGRAMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTrace.g:604:3: (enumLiteral_3= 'ObjectDiagram' )
                    {
                    // InternalTrace.g:604:3: (enumLiteral_3= 'ObjectDiagram' )
                    // InternalTrace.g:605:4: enumLiteral_3= 'ObjectDiagram'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDiagramKindAccess().getOBJECTDIAGRAMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDiagramKindAccess().getOBJECTDIAGRAMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTrace.g:612:3: (enumLiteral_4= 'InteractionOverviewDiagram' )
                    {
                    // InternalTrace.g:612:3: (enumLiteral_4= 'InteractionOverviewDiagram' )
                    // InternalTrace.g:613:4: enumLiteral_4= 'InteractionOverviewDiagram'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDiagramKindAccess().getINTERACTIONOVERVIEWDIAGRAMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDiagramKindAccess().getINTERACTIONOVERVIEWDIAGRAMEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDiagramKind"


    // $ANTLR start "ruleModelKind"
    // InternalTrace.g:623:1: ruleModelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'UMLModel' ) | (enumLiteral_1= 'SysMLModel' ) | (enumLiteral_2= 'BMPNModel' ) ) ;
    public final Enumerator ruleModelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTrace.g:629:2: ( ( (enumLiteral_0= 'UMLModel' ) | (enumLiteral_1= 'SysMLModel' ) | (enumLiteral_2= 'BMPNModel' ) ) )
            // InternalTrace.g:630:2: ( (enumLiteral_0= 'UMLModel' ) | (enumLiteral_1= 'SysMLModel' ) | (enumLiteral_2= 'BMPNModel' ) )
            {
            // InternalTrace.g:630:2: ( (enumLiteral_0= 'UMLModel' ) | (enumLiteral_1= 'SysMLModel' ) | (enumLiteral_2= 'BMPNModel' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTrace.g:631:3: (enumLiteral_0= 'UMLModel' )
                    {
                    // InternalTrace.g:631:3: (enumLiteral_0= 'UMLModel' )
                    // InternalTrace.g:632:4: enumLiteral_0= 'UMLModel'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getUMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModelKindAccess().getUMLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:639:3: (enumLiteral_1= 'SysMLModel' )
                    {
                    // InternalTrace.g:639:3: (enumLiteral_1= 'SysMLModel' )
                    // InternalTrace.g:640:4: enumLiteral_1= 'SysMLModel'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getSysMLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModelKindAccess().getSysMLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTrace.g:647:3: (enumLiteral_2= 'BMPNModel' )
                    {
                    // InternalTrace.g:647:3: (enumLiteral_2= 'BMPNModel' )
                    // InternalTrace.g:648:4: enumLiteral_2= 'BMPNModel'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getModelKindAccess().getBPMNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModelKindAccess().getBPMNEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleModelKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});

}