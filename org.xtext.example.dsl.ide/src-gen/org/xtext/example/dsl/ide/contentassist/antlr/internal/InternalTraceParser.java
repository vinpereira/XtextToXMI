package org.xtext.example.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.dsl.services.TraceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ClassDiagram'", "'SequenceDiagram'", "'StateDiagram'", "'ObjectDiagram'", "'InteractionOverviewDiagram'", "'UMLModel'", "'SysMLModel'", "'BMPNModel'", "'FormalResults'", "'{'", "'}'", "','", "'TimeNode'", "'FormalElement'", "'Refers to'", "'element'", "'With ID'", "'Belongs to'", "'from'"
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

    	public void setGrammarAccess(TraceGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFormalResult"
    // InternalTrace.g:53:1: entryRuleFormalResult : ruleFormalResult EOF ;
    public final void entryRuleFormalResult() throws RecognitionException {
        try {
            // InternalTrace.g:54:1: ( ruleFormalResult EOF )
            // InternalTrace.g:55:1: ruleFormalResult EOF
            {
             before(grammarAccess.getFormalResultRule()); 
            pushFollow(FOLLOW_1);
            ruleFormalResult();

            state._fsp--;

             after(grammarAccess.getFormalResultRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormalResult"


    // $ANTLR start "ruleFormalResult"
    // InternalTrace.g:62:1: ruleFormalResult : ( ( rule__FormalResult__Group__0 ) ) ;
    public final void ruleFormalResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:66:2: ( ( ( rule__FormalResult__Group__0 ) ) )
            // InternalTrace.g:67:2: ( ( rule__FormalResult__Group__0 ) )
            {
            // InternalTrace.g:67:2: ( ( rule__FormalResult__Group__0 ) )
            // InternalTrace.g:68:3: ( rule__FormalResult__Group__0 )
            {
             before(grammarAccess.getFormalResultAccess().getGroup()); 
            // InternalTrace.g:69:3: ( rule__FormalResult__Group__0 )
            // InternalTrace.g:69:4: rule__FormalResult__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormalResultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormalResult"


    // $ANTLR start "entryRuleTimeNode"
    // InternalTrace.g:78:1: entryRuleTimeNode : ruleTimeNode EOF ;
    public final void entryRuleTimeNode() throws RecognitionException {
        try {
            // InternalTrace.g:79:1: ( ruleTimeNode EOF )
            // InternalTrace.g:80:1: ruleTimeNode EOF
            {
             before(grammarAccess.getTimeNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeNode();

            state._fsp--;

             after(grammarAccess.getTimeNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeNode"


    // $ANTLR start "ruleTimeNode"
    // InternalTrace.g:87:1: ruleTimeNode : ( ( rule__TimeNode__Group__0 ) ) ;
    public final void ruleTimeNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:91:2: ( ( ( rule__TimeNode__Group__0 ) ) )
            // InternalTrace.g:92:2: ( ( rule__TimeNode__Group__0 ) )
            {
            // InternalTrace.g:92:2: ( ( rule__TimeNode__Group__0 ) )
            // InternalTrace.g:93:3: ( rule__TimeNode__Group__0 )
            {
             before(grammarAccess.getTimeNodeAccess().getGroup()); 
            // InternalTrace.g:94:3: ( rule__TimeNode__Group__0 )
            // InternalTrace.g:94:4: rule__TimeNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeNode"


    // $ANTLR start "entryRuleFormalElement"
    // InternalTrace.g:103:1: entryRuleFormalElement : ruleFormalElement EOF ;
    public final void entryRuleFormalElement() throws RecognitionException {
        try {
            // InternalTrace.g:104:1: ( ruleFormalElement EOF )
            // InternalTrace.g:105:1: ruleFormalElement EOF
            {
             before(grammarAccess.getFormalElementRule()); 
            pushFollow(FOLLOW_1);
            ruleFormalElement();

            state._fsp--;

             after(grammarAccess.getFormalElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormalElement"


    // $ANTLR start "ruleFormalElement"
    // InternalTrace.g:112:1: ruleFormalElement : ( ( rule__FormalElement__Group__0 ) ) ;
    public final void ruleFormalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:116:2: ( ( ( rule__FormalElement__Group__0 ) ) )
            // InternalTrace.g:117:2: ( ( rule__FormalElement__Group__0 ) )
            {
            // InternalTrace.g:117:2: ( ( rule__FormalElement__Group__0 ) )
            // InternalTrace.g:118:3: ( rule__FormalElement__Group__0 )
            {
             before(grammarAccess.getFormalElementAccess().getGroup()); 
            // InternalTrace.g:119:3: ( rule__FormalElement__Group__0 )
            // InternalTrace.g:119:4: rule__FormalElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormalElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormalElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormalElement"


    // $ANTLR start "entryRuleElement"
    // InternalTrace.g:128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalTrace.g:129:1: ( ruleElement EOF )
            // InternalTrace.g:130:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTrace.g:137:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:141:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalTrace.g:142:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalTrace.g:142:2: ( ( rule__Element__Group__0 ) )
            // InternalTrace.g:143:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalTrace.g:144:3: ( rule__Element__Group__0 )
            // InternalTrace.g:144:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDiagram"
    // InternalTrace.g:153:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // InternalTrace.g:154:1: ( ruleDiagram EOF )
            // InternalTrace.g:155:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalTrace.g:162:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:166:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // InternalTrace.g:167:2: ( ( rule__Diagram__Group__0 ) )
            {
            // InternalTrace.g:167:2: ( ( rule__Diagram__Group__0 ) )
            // InternalTrace.g:168:3: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // InternalTrace.g:169:3: ( rule__Diagram__Group__0 )
            // InternalTrace.g:169:4: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleModel"
    // InternalTrace.g:178:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTrace.g:179:1: ( ruleModel EOF )
            // InternalTrace.g:180:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTrace.g:187:1: ruleModel : ( ( rule__Model__KindAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:191:2: ( ( ( rule__Model__KindAssignment ) ) )
            // InternalTrace.g:192:2: ( ( rule__Model__KindAssignment ) )
            {
            // InternalTrace.g:192:2: ( ( rule__Model__KindAssignment ) )
            // InternalTrace.g:193:3: ( rule__Model__KindAssignment )
            {
             before(grammarAccess.getModelAccess().getKindAssignment()); 
            // InternalTrace.g:194:3: ( rule__Model__KindAssignment )
            // InternalTrace.g:194:4: rule__Model__KindAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__KindAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getKindAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "ruleDiagramKind"
    // InternalTrace.g:203:1: ruleDiagramKind : ( ( rule__DiagramKind__Alternatives ) ) ;
    public final void ruleDiagramKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:207:1: ( ( ( rule__DiagramKind__Alternatives ) ) )
            // InternalTrace.g:208:2: ( ( rule__DiagramKind__Alternatives ) )
            {
            // InternalTrace.g:208:2: ( ( rule__DiagramKind__Alternatives ) )
            // InternalTrace.g:209:3: ( rule__DiagramKind__Alternatives )
            {
             before(grammarAccess.getDiagramKindAccess().getAlternatives()); 
            // InternalTrace.g:210:3: ( rule__DiagramKind__Alternatives )
            // InternalTrace.g:210:4: rule__DiagramKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DiagramKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDiagramKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagramKind"


    // $ANTLR start "ruleModelKind"
    // InternalTrace.g:219:1: ruleModelKind : ( ( rule__ModelKind__Alternatives ) ) ;
    public final void ruleModelKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:223:1: ( ( ( rule__ModelKind__Alternatives ) ) )
            // InternalTrace.g:224:2: ( ( rule__ModelKind__Alternatives ) )
            {
            // InternalTrace.g:224:2: ( ( rule__ModelKind__Alternatives ) )
            // InternalTrace.g:225:3: ( rule__ModelKind__Alternatives )
            {
             before(grammarAccess.getModelKindAccess().getAlternatives()); 
            // InternalTrace.g:226:3: ( rule__ModelKind__Alternatives )
            // InternalTrace.g:226:4: rule__ModelKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelKind"


    // $ANTLR start "rule__FormalResult__Alternatives_3"
    // InternalTrace.g:234:1: rule__FormalResult__Alternatives_3 : ( ( ( rule__FormalResult__Group_3_0__0 ) ) | ( ( rule__FormalResult__Group_3_1__0 ) ) );
    public final void rule__FormalResult__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:238:1: ( ( ( rule__FormalResult__Group_3_0__0 ) ) | ( ( rule__FormalResult__Group_3_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTrace.g:239:2: ( ( rule__FormalResult__Group_3_0__0 ) )
                    {
                    // InternalTrace.g:239:2: ( ( rule__FormalResult__Group_3_0__0 ) )
                    // InternalTrace.g:240:3: ( rule__FormalResult__Group_3_0__0 )
                    {
                     before(grammarAccess.getFormalResultAccess().getGroup_3_0()); 
                    // InternalTrace.g:241:3: ( rule__FormalResult__Group_3_0__0 )
                    // InternalTrace.g:241:4: rule__FormalResult__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormalResult__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormalResultAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:245:2: ( ( rule__FormalResult__Group_3_1__0 ) )
                    {
                    // InternalTrace.g:245:2: ( ( rule__FormalResult__Group_3_1__0 ) )
                    // InternalTrace.g:246:3: ( rule__FormalResult__Group_3_1__0 )
                    {
                     before(grammarAccess.getFormalResultAccess().getGroup_3_1()); 
                    // InternalTrace.g:247:3: ( rule__FormalResult__Group_3_1__0 )
                    // InternalTrace.g:247:4: rule__FormalResult__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormalResult__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormalResultAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Alternatives_3"


    // $ANTLR start "rule__Element__Alternatives_7"
    // InternalTrace.g:255:1: rule__Element__Alternatives_7 : ( ( ( rule__Element__DiagramAssignment_7_0 ) ) | ( ( rule__Element__ModelAssignment_7_1 ) ) );
    public final void rule__Element__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:259:1: ( ( ( rule__Element__DiagramAssignment_7_0 ) ) | ( ( rule__Element__ModelAssignment_7_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTrace.g:260:2: ( ( rule__Element__DiagramAssignment_7_0 ) )
                    {
                    // InternalTrace.g:260:2: ( ( rule__Element__DiagramAssignment_7_0 ) )
                    // InternalTrace.g:261:3: ( rule__Element__DiagramAssignment_7_0 )
                    {
                     before(grammarAccess.getElementAccess().getDiagramAssignment_7_0()); 
                    // InternalTrace.g:262:3: ( rule__Element__DiagramAssignment_7_0 )
                    // InternalTrace.g:262:4: rule__Element__DiagramAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__DiagramAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getDiagramAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:266:2: ( ( rule__Element__ModelAssignment_7_1 ) )
                    {
                    // InternalTrace.g:266:2: ( ( rule__Element__ModelAssignment_7_1 ) )
                    // InternalTrace.g:267:3: ( rule__Element__ModelAssignment_7_1 )
                    {
                     before(grammarAccess.getElementAccess().getModelAssignment_7_1()); 
                    // InternalTrace.g:268:3: ( rule__Element__ModelAssignment_7_1 )
                    // InternalTrace.g:268:4: rule__Element__ModelAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__ModelAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getModelAssignment_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives_7"


    // $ANTLR start "rule__DiagramKind__Alternatives"
    // InternalTrace.g:276:1: rule__DiagramKind__Alternatives : ( ( ( 'ClassDiagram' ) ) | ( ( 'SequenceDiagram' ) ) | ( ( 'StateDiagram' ) ) | ( ( 'ObjectDiagram' ) ) | ( ( 'InteractionOverviewDiagram' ) ) );
    public final void rule__DiagramKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:280:1: ( ( ( 'ClassDiagram' ) ) | ( ( 'SequenceDiagram' ) ) | ( ( 'StateDiagram' ) ) | ( ( 'ObjectDiagram' ) ) | ( ( 'InteractionOverviewDiagram' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTrace.g:281:2: ( ( 'ClassDiagram' ) )
                    {
                    // InternalTrace.g:281:2: ( ( 'ClassDiagram' ) )
                    // InternalTrace.g:282:3: ( 'ClassDiagram' )
                    {
                     before(grammarAccess.getDiagramKindAccess().getCLASSDIAGRAMEnumLiteralDeclaration_0()); 
                    // InternalTrace.g:283:3: ( 'ClassDiagram' )
                    // InternalTrace.g:283:4: 'ClassDiagram'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDiagramKindAccess().getCLASSDIAGRAMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:287:2: ( ( 'SequenceDiagram' ) )
                    {
                    // InternalTrace.g:287:2: ( ( 'SequenceDiagram' ) )
                    // InternalTrace.g:288:3: ( 'SequenceDiagram' )
                    {
                     before(grammarAccess.getDiagramKindAccess().getSEQUENCEDIAGRAMEnumLiteralDeclaration_1()); 
                    // InternalTrace.g:289:3: ( 'SequenceDiagram' )
                    // InternalTrace.g:289:4: 'SequenceDiagram'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDiagramKindAccess().getSEQUENCEDIAGRAMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrace.g:293:2: ( ( 'StateDiagram' ) )
                    {
                    // InternalTrace.g:293:2: ( ( 'StateDiagram' ) )
                    // InternalTrace.g:294:3: ( 'StateDiagram' )
                    {
                     before(grammarAccess.getDiagramKindAccess().getSTATEDIAGRAMEnumLiteralDeclaration_2()); 
                    // InternalTrace.g:295:3: ( 'StateDiagram' )
                    // InternalTrace.g:295:4: 'StateDiagram'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDiagramKindAccess().getSTATEDIAGRAMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTrace.g:299:2: ( ( 'ObjectDiagram' ) )
                    {
                    // InternalTrace.g:299:2: ( ( 'ObjectDiagram' ) )
                    // InternalTrace.g:300:3: ( 'ObjectDiagram' )
                    {
                     before(grammarAccess.getDiagramKindAccess().getOBJECTDIAGRAMEnumLiteralDeclaration_3()); 
                    // InternalTrace.g:301:3: ( 'ObjectDiagram' )
                    // InternalTrace.g:301:4: 'ObjectDiagram'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDiagramKindAccess().getOBJECTDIAGRAMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTrace.g:305:2: ( ( 'InteractionOverviewDiagram' ) )
                    {
                    // InternalTrace.g:305:2: ( ( 'InteractionOverviewDiagram' ) )
                    // InternalTrace.g:306:3: ( 'InteractionOverviewDiagram' )
                    {
                     before(grammarAccess.getDiagramKindAccess().getINTERACTIONOVERVIEWDIAGRAMEnumLiteralDeclaration_4()); 
                    // InternalTrace.g:307:3: ( 'InteractionOverviewDiagram' )
                    // InternalTrace.g:307:4: 'InteractionOverviewDiagram'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDiagramKindAccess().getINTERACTIONOVERVIEWDIAGRAMEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramKind__Alternatives"


    // $ANTLR start "rule__ModelKind__Alternatives"
    // InternalTrace.g:315:1: rule__ModelKind__Alternatives : ( ( ( 'UMLModel' ) ) | ( ( 'SysMLModel' ) ) | ( ( 'BMPNModel' ) ) );
    public final void rule__ModelKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:319:1: ( ( ( 'UMLModel' ) ) | ( ( 'SysMLModel' ) ) | ( ( 'BMPNModel' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTrace.g:320:2: ( ( 'UMLModel' ) )
                    {
                    // InternalTrace.g:320:2: ( ( 'UMLModel' ) )
                    // InternalTrace.g:321:3: ( 'UMLModel' )
                    {
                     before(grammarAccess.getModelKindAccess().getUMLEnumLiteralDeclaration_0()); 
                    // InternalTrace.g:322:3: ( 'UMLModel' )
                    // InternalTrace.g:322:4: 'UMLModel'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getUMLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTrace.g:326:2: ( ( 'SysMLModel' ) )
                    {
                    // InternalTrace.g:326:2: ( ( 'SysMLModel' ) )
                    // InternalTrace.g:327:3: ( 'SysMLModel' )
                    {
                     before(grammarAccess.getModelKindAccess().getSysMLEnumLiteralDeclaration_1()); 
                    // InternalTrace.g:328:3: ( 'SysMLModel' )
                    // InternalTrace.g:328:4: 'SysMLModel'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getSysMLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTrace.g:332:2: ( ( 'BMPNModel' ) )
                    {
                    // InternalTrace.g:332:2: ( ( 'BMPNModel' ) )
                    // InternalTrace.g:333:3: ( 'BMPNModel' )
                    {
                     before(grammarAccess.getModelKindAccess().getBPMNEnumLiteralDeclaration_2()); 
                    // InternalTrace.g:334:3: ( 'BMPNModel' )
                    // InternalTrace.g:334:4: 'BMPNModel'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getModelKindAccess().getBPMNEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelKind__Alternatives"


    // $ANTLR start "rule__FormalResult__Group__0"
    // InternalTrace.g:342:1: rule__FormalResult__Group__0 : rule__FormalResult__Group__0__Impl rule__FormalResult__Group__1 ;
    public final void rule__FormalResult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:346:1: ( rule__FormalResult__Group__0__Impl rule__FormalResult__Group__1 )
            // InternalTrace.g:347:2: rule__FormalResult__Group__0__Impl rule__FormalResult__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FormalResult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__0"


    // $ANTLR start "rule__FormalResult__Group__0__Impl"
    // InternalTrace.g:354:1: rule__FormalResult__Group__0__Impl : ( 'FormalResults' ) ;
    public final void rule__FormalResult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:358:1: ( ( 'FormalResults' ) )
            // InternalTrace.g:359:1: ( 'FormalResults' )
            {
            // InternalTrace.g:359:1: ( 'FormalResults' )
            // InternalTrace.g:360:2: 'FormalResults'
            {
             before(grammarAccess.getFormalResultAccess().getFormalResultsKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFormalResultAccess().getFormalResultsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__0__Impl"


    // $ANTLR start "rule__FormalResult__Group__1"
    // InternalTrace.g:369:1: rule__FormalResult__Group__1 : rule__FormalResult__Group__1__Impl rule__FormalResult__Group__2 ;
    public final void rule__FormalResult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:373:1: ( rule__FormalResult__Group__1__Impl rule__FormalResult__Group__2 )
            // InternalTrace.g:374:2: rule__FormalResult__Group__1__Impl rule__FormalResult__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FormalResult__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__1"


    // $ANTLR start "rule__FormalResult__Group__1__Impl"
    // InternalTrace.g:381:1: rule__FormalResult__Group__1__Impl : ( ( rule__FormalResult__NameAssignment_1 ) ) ;
    public final void rule__FormalResult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:385:1: ( ( ( rule__FormalResult__NameAssignment_1 ) ) )
            // InternalTrace.g:386:1: ( ( rule__FormalResult__NameAssignment_1 ) )
            {
            // InternalTrace.g:386:1: ( ( rule__FormalResult__NameAssignment_1 ) )
            // InternalTrace.g:387:2: ( rule__FormalResult__NameAssignment_1 )
            {
             before(grammarAccess.getFormalResultAccess().getNameAssignment_1()); 
            // InternalTrace.g:388:2: ( rule__FormalResult__NameAssignment_1 )
            // InternalTrace.g:388:3: rule__FormalResult__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormalResultAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__1__Impl"


    // $ANTLR start "rule__FormalResult__Group__2"
    // InternalTrace.g:396:1: rule__FormalResult__Group__2 : rule__FormalResult__Group__2__Impl rule__FormalResult__Group__3 ;
    public final void rule__FormalResult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:400:1: ( rule__FormalResult__Group__2__Impl rule__FormalResult__Group__3 )
            // InternalTrace.g:401:2: rule__FormalResult__Group__2__Impl rule__FormalResult__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FormalResult__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__2"


    // $ANTLR start "rule__FormalResult__Group__2__Impl"
    // InternalTrace.g:408:1: rule__FormalResult__Group__2__Impl : ( '{' ) ;
    public final void rule__FormalResult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:412:1: ( ( '{' ) )
            // InternalTrace.g:413:1: ( '{' )
            {
            // InternalTrace.g:413:1: ( '{' )
            // InternalTrace.g:414:2: '{'
            {
             before(grammarAccess.getFormalResultAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFormalResultAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__2__Impl"


    // $ANTLR start "rule__FormalResult__Group__3"
    // InternalTrace.g:423:1: rule__FormalResult__Group__3 : rule__FormalResult__Group__3__Impl rule__FormalResult__Group__4 ;
    public final void rule__FormalResult__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:427:1: ( rule__FormalResult__Group__3__Impl rule__FormalResult__Group__4 )
            // InternalTrace.g:428:2: rule__FormalResult__Group__3__Impl rule__FormalResult__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__FormalResult__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__3"


    // $ANTLR start "rule__FormalResult__Group__3__Impl"
    // InternalTrace.g:435:1: rule__FormalResult__Group__3__Impl : ( ( rule__FormalResult__Alternatives_3 ) ) ;
    public final void rule__FormalResult__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:439:1: ( ( ( rule__FormalResult__Alternatives_3 ) ) )
            // InternalTrace.g:440:1: ( ( rule__FormalResult__Alternatives_3 ) )
            {
            // InternalTrace.g:440:1: ( ( rule__FormalResult__Alternatives_3 ) )
            // InternalTrace.g:441:2: ( rule__FormalResult__Alternatives_3 )
            {
             before(grammarAccess.getFormalResultAccess().getAlternatives_3()); 
            // InternalTrace.g:442:2: ( rule__FormalResult__Alternatives_3 )
            // InternalTrace.g:442:3: rule__FormalResult__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFormalResultAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__3__Impl"


    // $ANTLR start "rule__FormalResult__Group__4"
    // InternalTrace.g:450:1: rule__FormalResult__Group__4 : rule__FormalResult__Group__4__Impl ;
    public final void rule__FormalResult__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:454:1: ( rule__FormalResult__Group__4__Impl )
            // InternalTrace.g:455:2: rule__FormalResult__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__4"


    // $ANTLR start "rule__FormalResult__Group__4__Impl"
    // InternalTrace.g:461:1: rule__FormalResult__Group__4__Impl : ( '}' ) ;
    public final void rule__FormalResult__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:465:1: ( ( '}' ) )
            // InternalTrace.g:466:1: ( '}' )
            {
            // InternalTrace.g:466:1: ( '}' )
            // InternalTrace.g:467:2: '}'
            {
             before(grammarAccess.getFormalResultAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFormalResultAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group__4__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_0__0"
    // InternalTrace.g:477:1: rule__FormalResult__Group_3_0__0 : rule__FormalResult__Group_3_0__0__Impl rule__FormalResult__Group_3_0__1 ;
    public final void rule__FormalResult__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:481:1: ( rule__FormalResult__Group_3_0__0__Impl rule__FormalResult__Group_3_0__1 )
            // InternalTrace.g:482:2: rule__FormalResult__Group_3_0__0__Impl rule__FormalResult__Group_3_0__1
            {
            pushFollow(FOLLOW_7);
            rule__FormalResult__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0__0"


    // $ANTLR start "rule__FormalResult__Group_3_0__0__Impl"
    // InternalTrace.g:489:1: rule__FormalResult__Group_3_0__0__Impl : ( ( rule__FormalResult__TimenodesAssignment_3_0_0 ) ) ;
    public final void rule__FormalResult__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:493:1: ( ( ( rule__FormalResult__TimenodesAssignment_3_0_0 ) ) )
            // InternalTrace.g:494:1: ( ( rule__FormalResult__TimenodesAssignment_3_0_0 ) )
            {
            // InternalTrace.g:494:1: ( ( rule__FormalResult__TimenodesAssignment_3_0_0 ) )
            // InternalTrace.g:495:2: ( rule__FormalResult__TimenodesAssignment_3_0_0 )
            {
             before(grammarAccess.getFormalResultAccess().getTimenodesAssignment_3_0_0()); 
            // InternalTrace.g:496:2: ( rule__FormalResult__TimenodesAssignment_3_0_0 )
            // InternalTrace.g:496:3: rule__FormalResult__TimenodesAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__TimenodesAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFormalResultAccess().getTimenodesAssignment_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0__0__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_0__1"
    // InternalTrace.g:504:1: rule__FormalResult__Group_3_0__1 : rule__FormalResult__Group_3_0__1__Impl ;
    public final void rule__FormalResult__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:508:1: ( rule__FormalResult__Group_3_0__1__Impl )
            // InternalTrace.g:509:2: rule__FormalResult__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0__1"


    // $ANTLR start "rule__FormalResult__Group_3_0__1__Impl"
    // InternalTrace.g:515:1: rule__FormalResult__Group_3_0__1__Impl : ( ( rule__FormalResult__Group_3_0_1__0 )* ) ;
    public final void rule__FormalResult__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:519:1: ( ( ( rule__FormalResult__Group_3_0_1__0 )* ) )
            // InternalTrace.g:520:1: ( ( rule__FormalResult__Group_3_0_1__0 )* )
            {
            // InternalTrace.g:520:1: ( ( rule__FormalResult__Group_3_0_1__0 )* )
            // InternalTrace.g:521:2: ( rule__FormalResult__Group_3_0_1__0 )*
            {
             before(grammarAccess.getFormalResultAccess().getGroup_3_0_1()); 
            // InternalTrace.g:522:2: ( rule__FormalResult__Group_3_0_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTrace.g:522:3: rule__FormalResult__Group_3_0_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__FormalResult__Group_3_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFormalResultAccess().getGroup_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0__1__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_0_1__0"
    // InternalTrace.g:531:1: rule__FormalResult__Group_3_0_1__0 : rule__FormalResult__Group_3_0_1__0__Impl rule__FormalResult__Group_3_0_1__1 ;
    public final void rule__FormalResult__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:535:1: ( rule__FormalResult__Group_3_0_1__0__Impl rule__FormalResult__Group_3_0_1__1 )
            // InternalTrace.g:536:2: rule__FormalResult__Group_3_0_1__0__Impl rule__FormalResult__Group_3_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__FormalResult__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0_1__0"


    // $ANTLR start "rule__FormalResult__Group_3_0_1__0__Impl"
    // InternalTrace.g:543:1: rule__FormalResult__Group_3_0_1__0__Impl : ( ',' ) ;
    public final void rule__FormalResult__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:547:1: ( ( ',' ) )
            // InternalTrace.g:548:1: ( ',' )
            {
            // InternalTrace.g:548:1: ( ',' )
            // InternalTrace.g:549:2: ','
            {
             before(grammarAccess.getFormalResultAccess().getCommaKeyword_3_0_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormalResultAccess().getCommaKeyword_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_0_1__1"
    // InternalTrace.g:558:1: rule__FormalResult__Group_3_0_1__1 : rule__FormalResult__Group_3_0_1__1__Impl ;
    public final void rule__FormalResult__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:562:1: ( rule__FormalResult__Group_3_0_1__1__Impl )
            // InternalTrace.g:563:2: rule__FormalResult__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0_1__1"


    // $ANTLR start "rule__FormalResult__Group_3_0_1__1__Impl"
    // InternalTrace.g:569:1: rule__FormalResult__Group_3_0_1__1__Impl : ( ( rule__FormalResult__TimenodesAssignment_3_0_1_1 ) ) ;
    public final void rule__FormalResult__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:573:1: ( ( ( rule__FormalResult__TimenodesAssignment_3_0_1_1 ) ) )
            // InternalTrace.g:574:1: ( ( rule__FormalResult__TimenodesAssignment_3_0_1_1 ) )
            {
            // InternalTrace.g:574:1: ( ( rule__FormalResult__TimenodesAssignment_3_0_1_1 ) )
            // InternalTrace.g:575:2: ( rule__FormalResult__TimenodesAssignment_3_0_1_1 )
            {
             before(grammarAccess.getFormalResultAccess().getTimenodesAssignment_3_0_1_1()); 
            // InternalTrace.g:576:2: ( rule__FormalResult__TimenodesAssignment_3_0_1_1 )
            // InternalTrace.g:576:3: rule__FormalResult__TimenodesAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__TimenodesAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormalResultAccess().getTimenodesAssignment_3_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_1__0"
    // InternalTrace.g:585:1: rule__FormalResult__Group_3_1__0 : rule__FormalResult__Group_3_1__0__Impl rule__FormalResult__Group_3_1__1 ;
    public final void rule__FormalResult__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:589:1: ( rule__FormalResult__Group_3_1__0__Impl rule__FormalResult__Group_3_1__1 )
            // InternalTrace.g:590:2: rule__FormalResult__Group_3_1__0__Impl rule__FormalResult__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__FormalResult__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1__0"


    // $ANTLR start "rule__FormalResult__Group_3_1__0__Impl"
    // InternalTrace.g:597:1: rule__FormalResult__Group_3_1__0__Impl : ( ( rule__FormalResult__FormalElementsAssignment_3_1_0 ) ) ;
    public final void rule__FormalResult__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:601:1: ( ( ( rule__FormalResult__FormalElementsAssignment_3_1_0 ) ) )
            // InternalTrace.g:602:1: ( ( rule__FormalResult__FormalElementsAssignment_3_1_0 ) )
            {
            // InternalTrace.g:602:1: ( ( rule__FormalResult__FormalElementsAssignment_3_1_0 ) )
            // InternalTrace.g:603:2: ( rule__FormalResult__FormalElementsAssignment_3_1_0 )
            {
             before(grammarAccess.getFormalResultAccess().getFormalElementsAssignment_3_1_0()); 
            // InternalTrace.g:604:2: ( rule__FormalResult__FormalElementsAssignment_3_1_0 )
            // InternalTrace.g:604:3: rule__FormalResult__FormalElementsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__FormalElementsAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFormalResultAccess().getFormalElementsAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1__0__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_1__1"
    // InternalTrace.g:612:1: rule__FormalResult__Group_3_1__1 : rule__FormalResult__Group_3_1__1__Impl ;
    public final void rule__FormalResult__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:616:1: ( rule__FormalResult__Group_3_1__1__Impl )
            // InternalTrace.g:617:2: rule__FormalResult__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1__1"


    // $ANTLR start "rule__FormalResult__Group_3_1__1__Impl"
    // InternalTrace.g:623:1: rule__FormalResult__Group_3_1__1__Impl : ( ( rule__FormalResult__Group_3_1_1__0 )* ) ;
    public final void rule__FormalResult__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:627:1: ( ( ( rule__FormalResult__Group_3_1_1__0 )* ) )
            // InternalTrace.g:628:1: ( ( rule__FormalResult__Group_3_1_1__0 )* )
            {
            // InternalTrace.g:628:1: ( ( rule__FormalResult__Group_3_1_1__0 )* )
            // InternalTrace.g:629:2: ( rule__FormalResult__Group_3_1_1__0 )*
            {
             before(grammarAccess.getFormalResultAccess().getGroup_3_1_1()); 
            // InternalTrace.g:630:2: ( rule__FormalResult__Group_3_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTrace.g:630:3: rule__FormalResult__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__FormalResult__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFormalResultAccess().getGroup_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1__1__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_1_1__0"
    // InternalTrace.g:639:1: rule__FormalResult__Group_3_1_1__0 : rule__FormalResult__Group_3_1_1__0__Impl rule__FormalResult__Group_3_1_1__1 ;
    public final void rule__FormalResult__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:643:1: ( rule__FormalResult__Group_3_1_1__0__Impl rule__FormalResult__Group_3_1_1__1 )
            // InternalTrace.g:644:2: rule__FormalResult__Group_3_1_1__0__Impl rule__FormalResult__Group_3_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__FormalResult__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1_1__0"


    // $ANTLR start "rule__FormalResult__Group_3_1_1__0__Impl"
    // InternalTrace.g:651:1: rule__FormalResult__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__FormalResult__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:655:1: ( ( ',' ) )
            // InternalTrace.g:656:1: ( ',' )
            {
            // InternalTrace.g:656:1: ( ',' )
            // InternalTrace.g:657:2: ','
            {
             before(grammarAccess.getFormalResultAccess().getCommaKeyword_3_1_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFormalResultAccess().getCommaKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__FormalResult__Group_3_1_1__1"
    // InternalTrace.g:666:1: rule__FormalResult__Group_3_1_1__1 : rule__FormalResult__Group_3_1_1__1__Impl ;
    public final void rule__FormalResult__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:670:1: ( rule__FormalResult__Group_3_1_1__1__Impl )
            // InternalTrace.g:671:2: rule__FormalResult__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__Group_3_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1_1__1"


    // $ANTLR start "rule__FormalResult__Group_3_1_1__1__Impl"
    // InternalTrace.g:677:1: rule__FormalResult__Group_3_1_1__1__Impl : ( ( rule__FormalResult__FormalElementsAssignment_3_1_1_1 ) ) ;
    public final void rule__FormalResult__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:681:1: ( ( ( rule__FormalResult__FormalElementsAssignment_3_1_1_1 ) ) )
            // InternalTrace.g:682:1: ( ( rule__FormalResult__FormalElementsAssignment_3_1_1_1 ) )
            {
            // InternalTrace.g:682:1: ( ( rule__FormalResult__FormalElementsAssignment_3_1_1_1 ) )
            // InternalTrace.g:683:2: ( rule__FormalResult__FormalElementsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getFormalResultAccess().getFormalElementsAssignment_3_1_1_1()); 
            // InternalTrace.g:684:2: ( rule__FormalResult__FormalElementsAssignment_3_1_1_1 )
            // InternalTrace.g:684:3: rule__FormalResult__FormalElementsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FormalResult__FormalElementsAssignment_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormalResultAccess().getFormalElementsAssignment_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__TimeNode__Group__0"
    // InternalTrace.g:693:1: rule__TimeNode__Group__0 : rule__TimeNode__Group__0__Impl rule__TimeNode__Group__1 ;
    public final void rule__TimeNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:697:1: ( rule__TimeNode__Group__0__Impl rule__TimeNode__Group__1 )
            // InternalTrace.g:698:2: rule__TimeNode__Group__0__Impl rule__TimeNode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TimeNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__0"


    // $ANTLR start "rule__TimeNode__Group__0__Impl"
    // InternalTrace.g:705:1: rule__TimeNode__Group__0__Impl : ( 'TimeNode' ) ;
    public final void rule__TimeNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:709:1: ( ( 'TimeNode' ) )
            // InternalTrace.g:710:1: ( 'TimeNode' )
            {
            // InternalTrace.g:710:1: ( 'TimeNode' )
            // InternalTrace.g:711:2: 'TimeNode'
            {
             before(grammarAccess.getTimeNodeAccess().getTimeNodeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTimeNodeAccess().getTimeNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__0__Impl"


    // $ANTLR start "rule__TimeNode__Group__1"
    // InternalTrace.g:720:1: rule__TimeNode__Group__1 : rule__TimeNode__Group__1__Impl rule__TimeNode__Group__2 ;
    public final void rule__TimeNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:724:1: ( rule__TimeNode__Group__1__Impl rule__TimeNode__Group__2 )
            // InternalTrace.g:725:2: rule__TimeNode__Group__1__Impl rule__TimeNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TimeNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__1"


    // $ANTLR start "rule__TimeNode__Group__1__Impl"
    // InternalTrace.g:732:1: rule__TimeNode__Group__1__Impl : ( ( rule__TimeNode__NameAssignment_1 ) ) ;
    public final void rule__TimeNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:736:1: ( ( ( rule__TimeNode__NameAssignment_1 ) ) )
            // InternalTrace.g:737:1: ( ( rule__TimeNode__NameAssignment_1 ) )
            {
            // InternalTrace.g:737:1: ( ( rule__TimeNode__NameAssignment_1 ) )
            // InternalTrace.g:738:2: ( rule__TimeNode__NameAssignment_1 )
            {
             before(grammarAccess.getTimeNodeAccess().getNameAssignment_1()); 
            // InternalTrace.g:739:2: ( rule__TimeNode__NameAssignment_1 )
            // InternalTrace.g:739:3: rule__TimeNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__1__Impl"


    // $ANTLR start "rule__TimeNode__Group__2"
    // InternalTrace.g:747:1: rule__TimeNode__Group__2 : rule__TimeNode__Group__2__Impl rule__TimeNode__Group__3 ;
    public final void rule__TimeNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:751:1: ( rule__TimeNode__Group__2__Impl rule__TimeNode__Group__3 )
            // InternalTrace.g:752:2: rule__TimeNode__Group__2__Impl rule__TimeNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TimeNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__2"


    // $ANTLR start "rule__TimeNode__Group__2__Impl"
    // InternalTrace.g:759:1: rule__TimeNode__Group__2__Impl : ( '{' ) ;
    public final void rule__TimeNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:763:1: ( ( '{' ) )
            // InternalTrace.g:764:1: ( '{' )
            {
            // InternalTrace.g:764:1: ( '{' )
            // InternalTrace.g:765:2: '{'
            {
             before(grammarAccess.getTimeNodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTimeNodeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__2__Impl"


    // $ANTLR start "rule__TimeNode__Group__3"
    // InternalTrace.g:774:1: rule__TimeNode__Group__3 : rule__TimeNode__Group__3__Impl rule__TimeNode__Group__4 ;
    public final void rule__TimeNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:778:1: ( rule__TimeNode__Group__3__Impl rule__TimeNode__Group__4 )
            // InternalTrace.g:779:2: rule__TimeNode__Group__3__Impl rule__TimeNode__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__TimeNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__3"


    // $ANTLR start "rule__TimeNode__Group__3__Impl"
    // InternalTrace.g:786:1: rule__TimeNode__Group__3__Impl : ( ( rule__TimeNode__FormalelementAssignment_3 ) ) ;
    public final void rule__TimeNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:790:1: ( ( ( rule__TimeNode__FormalelementAssignment_3 ) ) )
            // InternalTrace.g:791:1: ( ( rule__TimeNode__FormalelementAssignment_3 ) )
            {
            // InternalTrace.g:791:1: ( ( rule__TimeNode__FormalelementAssignment_3 ) )
            // InternalTrace.g:792:2: ( rule__TimeNode__FormalelementAssignment_3 )
            {
             before(grammarAccess.getTimeNodeAccess().getFormalelementAssignment_3()); 
            // InternalTrace.g:793:2: ( rule__TimeNode__FormalelementAssignment_3 )
            // InternalTrace.g:793:3: rule__TimeNode__FormalelementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TimeNode__FormalelementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeNodeAccess().getFormalelementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__3__Impl"


    // $ANTLR start "rule__TimeNode__Group__4"
    // InternalTrace.g:801:1: rule__TimeNode__Group__4 : rule__TimeNode__Group__4__Impl rule__TimeNode__Group__5 ;
    public final void rule__TimeNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:805:1: ( rule__TimeNode__Group__4__Impl rule__TimeNode__Group__5 )
            // InternalTrace.g:806:2: rule__TimeNode__Group__4__Impl rule__TimeNode__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__TimeNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__4"


    // $ANTLR start "rule__TimeNode__Group__4__Impl"
    // InternalTrace.g:813:1: rule__TimeNode__Group__4__Impl : ( ( rule__TimeNode__Group_4__0 )* ) ;
    public final void rule__TimeNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:817:1: ( ( ( rule__TimeNode__Group_4__0 )* ) )
            // InternalTrace.g:818:1: ( ( rule__TimeNode__Group_4__0 )* )
            {
            // InternalTrace.g:818:1: ( ( rule__TimeNode__Group_4__0 )* )
            // InternalTrace.g:819:2: ( rule__TimeNode__Group_4__0 )*
            {
             before(grammarAccess.getTimeNodeAccess().getGroup_4()); 
            // InternalTrace.g:820:2: ( rule__TimeNode__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTrace.g:820:3: rule__TimeNode__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TimeNode__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTimeNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__4__Impl"


    // $ANTLR start "rule__TimeNode__Group__5"
    // InternalTrace.g:828:1: rule__TimeNode__Group__5 : rule__TimeNode__Group__5__Impl ;
    public final void rule__TimeNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:832:1: ( rule__TimeNode__Group__5__Impl )
            // InternalTrace.g:833:2: rule__TimeNode__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeNode__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__5"


    // $ANTLR start "rule__TimeNode__Group__5__Impl"
    // InternalTrace.g:839:1: rule__TimeNode__Group__5__Impl : ( '}' ) ;
    public final void rule__TimeNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:843:1: ( ( '}' ) )
            // InternalTrace.g:844:1: ( '}' )
            {
            // InternalTrace.g:844:1: ( '}' )
            // InternalTrace.g:845:2: '}'
            {
             before(grammarAccess.getTimeNodeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTimeNodeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group__5__Impl"


    // $ANTLR start "rule__TimeNode__Group_4__0"
    // InternalTrace.g:855:1: rule__TimeNode__Group_4__0 : rule__TimeNode__Group_4__0__Impl rule__TimeNode__Group_4__1 ;
    public final void rule__TimeNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:859:1: ( rule__TimeNode__Group_4__0__Impl rule__TimeNode__Group_4__1 )
            // InternalTrace.g:860:2: rule__TimeNode__Group_4__0__Impl rule__TimeNode__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__TimeNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group_4__0"


    // $ANTLR start "rule__TimeNode__Group_4__0__Impl"
    // InternalTrace.g:867:1: rule__TimeNode__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TimeNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:871:1: ( ( ',' ) )
            // InternalTrace.g:872:1: ( ',' )
            {
            // InternalTrace.g:872:1: ( ',' )
            // InternalTrace.g:873:2: ','
            {
             before(grammarAccess.getTimeNodeAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTimeNodeAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group_4__0__Impl"


    // $ANTLR start "rule__TimeNode__Group_4__1"
    // InternalTrace.g:882:1: rule__TimeNode__Group_4__1 : rule__TimeNode__Group_4__1__Impl ;
    public final void rule__TimeNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:886:1: ( rule__TimeNode__Group_4__1__Impl )
            // InternalTrace.g:887:2: rule__TimeNode__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeNode__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group_4__1"


    // $ANTLR start "rule__TimeNode__Group_4__1__Impl"
    // InternalTrace.g:893:1: rule__TimeNode__Group_4__1__Impl : ( ( rule__TimeNode__FormalelementAssignment_4_1 ) ) ;
    public final void rule__TimeNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:897:1: ( ( ( rule__TimeNode__FormalelementAssignment_4_1 ) ) )
            // InternalTrace.g:898:1: ( ( rule__TimeNode__FormalelementAssignment_4_1 ) )
            {
            // InternalTrace.g:898:1: ( ( rule__TimeNode__FormalelementAssignment_4_1 ) )
            // InternalTrace.g:899:2: ( rule__TimeNode__FormalelementAssignment_4_1 )
            {
             before(grammarAccess.getTimeNodeAccess().getFormalelementAssignment_4_1()); 
            // InternalTrace.g:900:2: ( rule__TimeNode__FormalelementAssignment_4_1 )
            // InternalTrace.g:900:3: rule__TimeNode__FormalelementAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeNode__FormalelementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeNodeAccess().getFormalelementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__Group_4__1__Impl"


    // $ANTLR start "rule__FormalElement__Group__0"
    // InternalTrace.g:909:1: rule__FormalElement__Group__0 : rule__FormalElement__Group__0__Impl rule__FormalElement__Group__1 ;
    public final void rule__FormalElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:913:1: ( rule__FormalElement__Group__0__Impl rule__FormalElement__Group__1 )
            // InternalTrace.g:914:2: rule__FormalElement__Group__0__Impl rule__FormalElement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FormalElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__0"


    // $ANTLR start "rule__FormalElement__Group__0__Impl"
    // InternalTrace.g:921:1: rule__FormalElement__Group__0__Impl : ( 'FormalElement' ) ;
    public final void rule__FormalElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:925:1: ( ( 'FormalElement' ) )
            // InternalTrace.g:926:1: ( 'FormalElement' )
            {
            // InternalTrace.g:926:1: ( 'FormalElement' )
            // InternalTrace.g:927:2: 'FormalElement'
            {
             before(grammarAccess.getFormalElementAccess().getFormalElementKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFormalElementAccess().getFormalElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__0__Impl"


    // $ANTLR start "rule__FormalElement__Group__1"
    // InternalTrace.g:936:1: rule__FormalElement__Group__1 : rule__FormalElement__Group__1__Impl rule__FormalElement__Group__2 ;
    public final void rule__FormalElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:940:1: ( rule__FormalElement__Group__1__Impl rule__FormalElement__Group__2 )
            // InternalTrace.g:941:2: rule__FormalElement__Group__1__Impl rule__FormalElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FormalElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__1"


    // $ANTLR start "rule__FormalElement__Group__1__Impl"
    // InternalTrace.g:948:1: rule__FormalElement__Group__1__Impl : ( ( rule__FormalElement__FormalElementAssignment_1 ) ) ;
    public final void rule__FormalElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:952:1: ( ( ( rule__FormalElement__FormalElementAssignment_1 ) ) )
            // InternalTrace.g:953:1: ( ( rule__FormalElement__FormalElementAssignment_1 ) )
            {
            // InternalTrace.g:953:1: ( ( rule__FormalElement__FormalElementAssignment_1 ) )
            // InternalTrace.g:954:2: ( rule__FormalElement__FormalElementAssignment_1 )
            {
             before(grammarAccess.getFormalElementAccess().getFormalElementAssignment_1()); 
            // InternalTrace.g:955:2: ( rule__FormalElement__FormalElementAssignment_1 )
            // InternalTrace.g:955:3: rule__FormalElement__FormalElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FormalElement__FormalElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormalElementAccess().getFormalElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__1__Impl"


    // $ANTLR start "rule__FormalElement__Group__2"
    // InternalTrace.g:963:1: rule__FormalElement__Group__2 : rule__FormalElement__Group__2__Impl rule__FormalElement__Group__3 ;
    public final void rule__FormalElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:967:1: ( rule__FormalElement__Group__2__Impl rule__FormalElement__Group__3 )
            // InternalTrace.g:968:2: rule__FormalElement__Group__2__Impl rule__FormalElement__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FormalElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__2"


    // $ANTLR start "rule__FormalElement__Group__2__Impl"
    // InternalTrace.g:975:1: rule__FormalElement__Group__2__Impl : ( '{' ) ;
    public final void rule__FormalElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:979:1: ( ( '{' ) )
            // InternalTrace.g:980:1: ( '{' )
            {
            // InternalTrace.g:980:1: ( '{' )
            // InternalTrace.g:981:2: '{'
            {
             before(grammarAccess.getFormalElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFormalElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__2__Impl"


    // $ANTLR start "rule__FormalElement__Group__3"
    // InternalTrace.g:990:1: rule__FormalElement__Group__3 : rule__FormalElement__Group__3__Impl rule__FormalElement__Group__4 ;
    public final void rule__FormalElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:994:1: ( rule__FormalElement__Group__3__Impl rule__FormalElement__Group__4 )
            // InternalTrace.g:995:2: rule__FormalElement__Group__3__Impl rule__FormalElement__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__FormalElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__3"


    // $ANTLR start "rule__FormalElement__Group__3__Impl"
    // InternalTrace.g:1002:1: rule__FormalElement__Group__3__Impl : ( ( rule__FormalElement__ElementAssignment_3 ) ) ;
    public final void rule__FormalElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1006:1: ( ( ( rule__FormalElement__ElementAssignment_3 ) ) )
            // InternalTrace.g:1007:1: ( ( rule__FormalElement__ElementAssignment_3 ) )
            {
            // InternalTrace.g:1007:1: ( ( rule__FormalElement__ElementAssignment_3 ) )
            // InternalTrace.g:1008:2: ( rule__FormalElement__ElementAssignment_3 )
            {
             before(grammarAccess.getFormalElementAccess().getElementAssignment_3()); 
            // InternalTrace.g:1009:2: ( rule__FormalElement__ElementAssignment_3 )
            // InternalTrace.g:1009:3: rule__FormalElement__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FormalElement__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFormalElementAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__3__Impl"


    // $ANTLR start "rule__FormalElement__Group__4"
    // InternalTrace.g:1017:1: rule__FormalElement__Group__4 : rule__FormalElement__Group__4__Impl ;
    public final void rule__FormalElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1021:1: ( rule__FormalElement__Group__4__Impl )
            // InternalTrace.g:1022:2: rule__FormalElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__4"


    // $ANTLR start "rule__FormalElement__Group__4__Impl"
    // InternalTrace.g:1028:1: rule__FormalElement__Group__4__Impl : ( '}' ) ;
    public final void rule__FormalElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1032:1: ( ( '}' ) )
            // InternalTrace.g:1033:1: ( '}' )
            {
            // InternalTrace.g:1033:1: ( '}' )
            // InternalTrace.g:1034:2: '}'
            {
             before(grammarAccess.getFormalElementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFormalElementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__Group__4__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalTrace.g:1044:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1048:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalTrace.g:1049:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalTrace.g:1056:1: rule__Element__Group__0__Impl : ( 'Refers to' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1060:1: ( ( 'Refers to' ) )
            // InternalTrace.g:1061:1: ( 'Refers to' )
            {
            // InternalTrace.g:1061:1: ( 'Refers to' )
            // InternalTrace.g:1062:2: 'Refers to'
            {
             before(grammarAccess.getElementAccess().getRefersToKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRefersToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalTrace.g:1071:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1075:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalTrace.g:1076:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalTrace.g:1083:1: rule__Element__Group__1__Impl : ( ( rule__Element__TypeElementAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1087:1: ( ( ( rule__Element__TypeElementAssignment_1 ) ) )
            // InternalTrace.g:1088:1: ( ( rule__Element__TypeElementAssignment_1 ) )
            {
            // InternalTrace.g:1088:1: ( ( rule__Element__TypeElementAssignment_1 ) )
            // InternalTrace.g:1089:2: ( rule__Element__TypeElementAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getTypeElementAssignment_1()); 
            // InternalTrace.g:1090:2: ( rule__Element__TypeElementAssignment_1 )
            // InternalTrace.g:1090:3: rule__Element__TypeElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__TypeElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getTypeElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // InternalTrace.g:1098:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1102:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalTrace.g:1103:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Element__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // InternalTrace.g:1110:1: rule__Element__Group__2__Impl : ( 'element' ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1114:1: ( ( 'element' ) )
            // InternalTrace.g:1115:1: ( 'element' )
            {
            // InternalTrace.g:1115:1: ( 'element' )
            // InternalTrace.g:1116:2: 'element'
            {
             before(grammarAccess.getElementAccess().getElementKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElementKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__3"
    // InternalTrace.g:1125:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1129:1: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
            // InternalTrace.g:1130:2: rule__Element__Group__3__Impl rule__Element__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Element__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__3"


    // $ANTLR start "rule__Element__Group__3__Impl"
    // InternalTrace.g:1137:1: rule__Element__Group__3__Impl : ( '{' ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1141:1: ( ( '{' ) )
            // InternalTrace.g:1142:1: ( '{' )
            {
            // InternalTrace.g:1142:1: ( '{' )
            // InternalTrace.g:1143:2: '{'
            {
             before(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__3__Impl"


    // $ANTLR start "rule__Element__Group__4"
    // InternalTrace.g:1152:1: rule__Element__Group__4 : rule__Element__Group__4__Impl rule__Element__Group__5 ;
    public final void rule__Element__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1156:1: ( rule__Element__Group__4__Impl rule__Element__Group__5 )
            // InternalTrace.g:1157:2: rule__Element__Group__4__Impl rule__Element__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Element__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4"


    // $ANTLR start "rule__Element__Group__4__Impl"
    // InternalTrace.g:1164:1: rule__Element__Group__4__Impl : ( 'With ID' ) ;
    public final void rule__Element__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1168:1: ( ( 'With ID' ) )
            // InternalTrace.g:1169:1: ( 'With ID' )
            {
            // InternalTrace.g:1169:1: ( 'With ID' )
            // InternalTrace.g:1170:2: 'With ID'
            {
             before(grammarAccess.getElementAccess().getWithIDKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getWithIDKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4__Impl"


    // $ANTLR start "rule__Element__Group__5"
    // InternalTrace.g:1179:1: rule__Element__Group__5 : rule__Element__Group__5__Impl rule__Element__Group__6 ;
    public final void rule__Element__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1183:1: ( rule__Element__Group__5__Impl rule__Element__Group__6 )
            // InternalTrace.g:1184:2: rule__Element__Group__5__Impl rule__Element__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Element__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__5"


    // $ANTLR start "rule__Element__Group__5__Impl"
    // InternalTrace.g:1191:1: rule__Element__Group__5__Impl : ( ( rule__Element__UmlElementAssignment_5 ) ) ;
    public final void rule__Element__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1195:1: ( ( ( rule__Element__UmlElementAssignment_5 ) ) )
            // InternalTrace.g:1196:1: ( ( rule__Element__UmlElementAssignment_5 ) )
            {
            // InternalTrace.g:1196:1: ( ( rule__Element__UmlElementAssignment_5 ) )
            // InternalTrace.g:1197:2: ( rule__Element__UmlElementAssignment_5 )
            {
             before(grammarAccess.getElementAccess().getUmlElementAssignment_5()); 
            // InternalTrace.g:1198:2: ( rule__Element__UmlElementAssignment_5 )
            // InternalTrace.g:1198:3: rule__Element__UmlElementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Element__UmlElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getUmlElementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__5__Impl"


    // $ANTLR start "rule__Element__Group__6"
    // InternalTrace.g:1206:1: rule__Element__Group__6 : rule__Element__Group__6__Impl rule__Element__Group__7 ;
    public final void rule__Element__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1210:1: ( rule__Element__Group__6__Impl rule__Element__Group__7 )
            // InternalTrace.g:1211:2: rule__Element__Group__6__Impl rule__Element__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Element__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__6"


    // $ANTLR start "rule__Element__Group__6__Impl"
    // InternalTrace.g:1218:1: rule__Element__Group__6__Impl : ( 'Belongs to' ) ;
    public final void rule__Element__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1222:1: ( ( 'Belongs to' ) )
            // InternalTrace.g:1223:1: ( 'Belongs to' )
            {
            // InternalTrace.g:1223:1: ( 'Belongs to' )
            // InternalTrace.g:1224:2: 'Belongs to'
            {
             before(grammarAccess.getElementAccess().getBelongsToKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getBelongsToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__6__Impl"


    // $ANTLR start "rule__Element__Group__7"
    // InternalTrace.g:1233:1: rule__Element__Group__7 : rule__Element__Group__7__Impl rule__Element__Group__8 ;
    public final void rule__Element__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1237:1: ( rule__Element__Group__7__Impl rule__Element__Group__8 )
            // InternalTrace.g:1238:2: rule__Element__Group__7__Impl rule__Element__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Element__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__7"


    // $ANTLR start "rule__Element__Group__7__Impl"
    // InternalTrace.g:1245:1: rule__Element__Group__7__Impl : ( ( rule__Element__Alternatives_7 ) ) ;
    public final void rule__Element__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1249:1: ( ( ( rule__Element__Alternatives_7 ) ) )
            // InternalTrace.g:1250:1: ( ( rule__Element__Alternatives_7 ) )
            {
            // InternalTrace.g:1250:1: ( ( rule__Element__Alternatives_7 ) )
            // InternalTrace.g:1251:2: ( rule__Element__Alternatives_7 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_7()); 
            // InternalTrace.g:1252:2: ( rule__Element__Alternatives_7 )
            // InternalTrace.g:1252:3: rule__Element__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__7__Impl"


    // $ANTLR start "rule__Element__Group__8"
    // InternalTrace.g:1260:1: rule__Element__Group__8 : rule__Element__Group__8__Impl ;
    public final void rule__Element__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1264:1: ( rule__Element__Group__8__Impl )
            // InternalTrace.g:1265:2: rule__Element__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__8"


    // $ANTLR start "rule__Element__Group__8__Impl"
    // InternalTrace.g:1271:1: rule__Element__Group__8__Impl : ( '}' ) ;
    public final void rule__Element__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1275:1: ( ( '}' ) )
            // InternalTrace.g:1276:1: ( '}' )
            {
            // InternalTrace.g:1276:1: ( '}' )
            // InternalTrace.g:1277:2: '}'
            {
             before(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__8__Impl"


    // $ANTLR start "rule__Diagram__Group__0"
    // InternalTrace.g:1287:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1291:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // InternalTrace.g:1292:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // InternalTrace.g:1299:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__KindAssignment_0 ) ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1303:1: ( ( ( rule__Diagram__KindAssignment_0 ) ) )
            // InternalTrace.g:1304:1: ( ( rule__Diagram__KindAssignment_0 ) )
            {
            // InternalTrace.g:1304:1: ( ( rule__Diagram__KindAssignment_0 ) )
            // InternalTrace.g:1305:2: ( rule__Diagram__KindAssignment_0 )
            {
             before(grammarAccess.getDiagramAccess().getKindAssignment_0()); 
            // InternalTrace.g:1306:2: ( rule__Diagram__KindAssignment_0 )
            // InternalTrace.g:1306:3: rule__Diagram__KindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // InternalTrace.g:1314:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1318:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // InternalTrace.g:1319:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // InternalTrace.g:1326:1: rule__Diagram__Group__1__Impl : ( 'from' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1330:1: ( ( 'from' ) )
            // InternalTrace.g:1331:1: ( 'from' )
            {
            // InternalTrace.g:1331:1: ( 'from' )
            // InternalTrace.g:1332:2: 'from'
            {
             before(grammarAccess.getDiagramAccess().getFromKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // InternalTrace.g:1341:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1345:1: ( rule__Diagram__Group__2__Impl )
            // InternalTrace.g:1346:2: rule__Diagram__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // InternalTrace.g:1352:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__ModelAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1356:1: ( ( ( rule__Diagram__ModelAssignment_2 ) ) )
            // InternalTrace.g:1357:1: ( ( rule__Diagram__ModelAssignment_2 ) )
            {
            // InternalTrace.g:1357:1: ( ( rule__Diagram__ModelAssignment_2 ) )
            // InternalTrace.g:1358:2: ( rule__Diagram__ModelAssignment_2 )
            {
             before(grammarAccess.getDiagramAccess().getModelAssignment_2()); 
            // InternalTrace.g:1359:2: ( rule__Diagram__ModelAssignment_2 )
            // InternalTrace.g:1359:3: rule__Diagram__ModelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__ModelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getModelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__FormalResult__NameAssignment_1"
    // InternalTrace.g:1368:1: rule__FormalResult__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FormalResult__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1372:1: ( ( RULE_ID ) )
            // InternalTrace.g:1373:2: ( RULE_ID )
            {
            // InternalTrace.g:1373:2: ( RULE_ID )
            // InternalTrace.g:1374:3: RULE_ID
            {
             before(grammarAccess.getFormalResultAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormalResultAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__NameAssignment_1"


    // $ANTLR start "rule__FormalResult__TimenodesAssignment_3_0_0"
    // InternalTrace.g:1383:1: rule__FormalResult__TimenodesAssignment_3_0_0 : ( ruleTimeNode ) ;
    public final void rule__FormalResult__TimenodesAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1387:1: ( ( ruleTimeNode ) )
            // InternalTrace.g:1388:2: ( ruleTimeNode )
            {
            // InternalTrace.g:1388:2: ( ruleTimeNode )
            // InternalTrace.g:1389:3: ruleTimeNode
            {
             before(grammarAccess.getFormalResultAccess().getTimenodesTimeNodeParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeNode();

            state._fsp--;

             after(grammarAccess.getFormalResultAccess().getTimenodesTimeNodeParserRuleCall_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__TimenodesAssignment_3_0_0"


    // $ANTLR start "rule__FormalResult__TimenodesAssignment_3_0_1_1"
    // InternalTrace.g:1398:1: rule__FormalResult__TimenodesAssignment_3_0_1_1 : ( ruleTimeNode ) ;
    public final void rule__FormalResult__TimenodesAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1402:1: ( ( ruleTimeNode ) )
            // InternalTrace.g:1403:2: ( ruleTimeNode )
            {
            // InternalTrace.g:1403:2: ( ruleTimeNode )
            // InternalTrace.g:1404:3: ruleTimeNode
            {
             before(grammarAccess.getFormalResultAccess().getTimenodesTimeNodeParserRuleCall_3_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeNode();

            state._fsp--;

             after(grammarAccess.getFormalResultAccess().getTimenodesTimeNodeParserRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__TimenodesAssignment_3_0_1_1"


    // $ANTLR start "rule__FormalResult__FormalElementsAssignment_3_1_0"
    // InternalTrace.g:1413:1: rule__FormalResult__FormalElementsAssignment_3_1_0 : ( ruleFormalElement ) ;
    public final void rule__FormalResult__FormalElementsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1417:1: ( ( ruleFormalElement ) )
            // InternalTrace.g:1418:2: ( ruleFormalElement )
            {
            // InternalTrace.g:1418:2: ( ruleFormalElement )
            // InternalTrace.g:1419:3: ruleFormalElement
            {
             before(grammarAccess.getFormalResultAccess().getFormalElementsFormalElementParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalElement();

            state._fsp--;

             after(grammarAccess.getFormalResultAccess().getFormalElementsFormalElementParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__FormalElementsAssignment_3_1_0"


    // $ANTLR start "rule__FormalResult__FormalElementsAssignment_3_1_1_1"
    // InternalTrace.g:1428:1: rule__FormalResult__FormalElementsAssignment_3_1_1_1 : ( ruleFormalElement ) ;
    public final void rule__FormalResult__FormalElementsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1432:1: ( ( ruleFormalElement ) )
            // InternalTrace.g:1433:2: ( ruleFormalElement )
            {
            // InternalTrace.g:1433:2: ( ruleFormalElement )
            // InternalTrace.g:1434:3: ruleFormalElement
            {
             before(grammarAccess.getFormalResultAccess().getFormalElementsFormalElementParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalElement();

            state._fsp--;

             after(grammarAccess.getFormalResultAccess().getFormalElementsFormalElementParserRuleCall_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalResult__FormalElementsAssignment_3_1_1_1"


    // $ANTLR start "rule__TimeNode__NameAssignment_1"
    // InternalTrace.g:1443:1: rule__TimeNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TimeNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1447:1: ( ( RULE_ID ) )
            // InternalTrace.g:1448:2: ( RULE_ID )
            {
            // InternalTrace.g:1448:2: ( RULE_ID )
            // InternalTrace.g:1449:3: RULE_ID
            {
             before(grammarAccess.getTimeNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTimeNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__NameAssignment_1"


    // $ANTLR start "rule__TimeNode__FormalelementAssignment_3"
    // InternalTrace.g:1458:1: rule__TimeNode__FormalelementAssignment_3 : ( ruleFormalElement ) ;
    public final void rule__TimeNode__FormalelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1462:1: ( ( ruleFormalElement ) )
            // InternalTrace.g:1463:2: ( ruleFormalElement )
            {
            // InternalTrace.g:1463:2: ( ruleFormalElement )
            // InternalTrace.g:1464:3: ruleFormalElement
            {
             before(grammarAccess.getTimeNodeAccess().getFormalelementFormalElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalElement();

            state._fsp--;

             after(grammarAccess.getTimeNodeAccess().getFormalelementFormalElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__FormalelementAssignment_3"


    // $ANTLR start "rule__TimeNode__FormalelementAssignment_4_1"
    // InternalTrace.g:1473:1: rule__TimeNode__FormalelementAssignment_4_1 : ( ruleFormalElement ) ;
    public final void rule__TimeNode__FormalelementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1477:1: ( ( ruleFormalElement ) )
            // InternalTrace.g:1478:2: ( ruleFormalElement )
            {
            // InternalTrace.g:1478:2: ( ruleFormalElement )
            // InternalTrace.g:1479:3: ruleFormalElement
            {
             before(grammarAccess.getTimeNodeAccess().getFormalelementFormalElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalElement();

            state._fsp--;

             after(grammarAccess.getTimeNodeAccess().getFormalelementFormalElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeNode__FormalelementAssignment_4_1"


    // $ANTLR start "rule__FormalElement__FormalElementAssignment_1"
    // InternalTrace.g:1488:1: rule__FormalElement__FormalElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FormalElement__FormalElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1492:1: ( ( ( RULE_ID ) ) )
            // InternalTrace.g:1493:2: ( ( RULE_ID ) )
            {
            // InternalTrace.g:1493:2: ( ( RULE_ID ) )
            // InternalTrace.g:1494:3: ( RULE_ID )
            {
             before(grammarAccess.getFormalElementAccess().getFormalElementFormalElementCrossReference_1_0()); 
            // InternalTrace.g:1495:3: ( RULE_ID )
            // InternalTrace.g:1496:4: RULE_ID
            {
             before(grammarAccess.getFormalElementAccess().getFormalElementFormalElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormalElementAccess().getFormalElementFormalElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFormalElementAccess().getFormalElementFormalElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__FormalElementAssignment_1"


    // $ANTLR start "rule__FormalElement__ElementAssignment_3"
    // InternalTrace.g:1507:1: rule__FormalElement__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__FormalElement__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1511:1: ( ( ruleElement ) )
            // InternalTrace.g:1512:2: ( ruleElement )
            {
            // InternalTrace.g:1512:2: ( ruleElement )
            // InternalTrace.g:1513:3: ruleElement
            {
             before(grammarAccess.getFormalElementAccess().getElementElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getFormalElementAccess().getElementElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalElement__ElementAssignment_3"


    // $ANTLR start "rule__Element__TypeElementAssignment_1"
    // InternalTrace.g:1522:1: rule__Element__TypeElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Element__TypeElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1526:1: ( ( ( RULE_ID ) ) )
            // InternalTrace.g:1527:2: ( ( RULE_ID ) )
            {
            // InternalTrace.g:1527:2: ( ( RULE_ID ) )
            // InternalTrace.g:1528:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getTypeElementTypeElementCrossReference_1_0()); 
            // InternalTrace.g:1529:3: ( RULE_ID )
            // InternalTrace.g:1530:4: RULE_ID
            {
             before(grammarAccess.getElementAccess().getTypeElementTypeElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getTypeElementTypeElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getElementAccess().getTypeElementTypeElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TypeElementAssignment_1"


    // $ANTLR start "rule__Element__UmlElementAssignment_5"
    // InternalTrace.g:1541:1: rule__Element__UmlElementAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Element__UmlElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1545:1: ( ( ( RULE_ID ) ) )
            // InternalTrace.g:1546:2: ( ( RULE_ID ) )
            {
            // InternalTrace.g:1546:2: ( ( RULE_ID ) )
            // InternalTrace.g:1547:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getUmlElementUmlElementCrossReference_5_0()); 
            // InternalTrace.g:1548:3: ( RULE_ID )
            // InternalTrace.g:1549:4: RULE_ID
            {
             before(grammarAccess.getElementAccess().getUmlElementUmlElementIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getUmlElementUmlElementIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getElementAccess().getUmlElementUmlElementCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__UmlElementAssignment_5"


    // $ANTLR start "rule__Element__DiagramAssignment_7_0"
    // InternalTrace.g:1560:1: rule__Element__DiagramAssignment_7_0 : ( ruleDiagram ) ;
    public final void rule__Element__DiagramAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1564:1: ( ( ruleDiagram ) )
            // InternalTrace.g:1565:2: ( ruleDiagram )
            {
            // InternalTrace.g:1565:2: ( ruleDiagram )
            // InternalTrace.g:1566:3: ruleDiagram
            {
             before(grammarAccess.getElementAccess().getDiagramDiagramParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getElementAccess().getDiagramDiagramParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__DiagramAssignment_7_0"


    // $ANTLR start "rule__Element__ModelAssignment_7_1"
    // InternalTrace.g:1575:1: rule__Element__ModelAssignment_7_1 : ( ruleModel ) ;
    public final void rule__Element__ModelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1579:1: ( ( ruleModel ) )
            // InternalTrace.g:1580:2: ( ruleModel )
            {
            // InternalTrace.g:1580:2: ( ruleModel )
            // InternalTrace.g:1581:3: ruleModel
            {
             before(grammarAccess.getElementAccess().getModelModelParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getElementAccess().getModelModelParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ModelAssignment_7_1"


    // $ANTLR start "rule__Diagram__KindAssignment_0"
    // InternalTrace.g:1590:1: rule__Diagram__KindAssignment_0 : ( ruleDiagramKind ) ;
    public final void rule__Diagram__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1594:1: ( ( ruleDiagramKind ) )
            // InternalTrace.g:1595:2: ( ruleDiagramKind )
            {
            // InternalTrace.g:1595:2: ( ruleDiagramKind )
            // InternalTrace.g:1596:3: ruleDiagramKind
            {
             before(grammarAccess.getDiagramAccess().getKindDiagramKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDiagramKind();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getKindDiagramKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__KindAssignment_0"


    // $ANTLR start "rule__Diagram__ModelAssignment_2"
    // InternalTrace.g:1605:1: rule__Diagram__ModelAssignment_2 : ( ruleModel ) ;
    public final void rule__Diagram__ModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1609:1: ( ( ruleModel ) )
            // InternalTrace.g:1610:2: ( ruleModel )
            {
            // InternalTrace.g:1610:2: ( ruleModel )
            // InternalTrace.g:1611:3: ruleModel
            {
             before(grammarAccess.getDiagramAccess().getModelModelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getModelModelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__ModelAssignment_2"


    // $ANTLR start "rule__Model__KindAssignment"
    // InternalTrace.g:1620:1: rule__Model__KindAssignment : ( ruleModelKind ) ;
    public final void rule__Model__KindAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTrace.g:1624:1: ( ( ruleModelKind ) )
            // InternalTrace.g:1625:2: ( ruleModelKind )
            {
            // InternalTrace.g:1625:2: ( ruleModelKind )
            // InternalTrace.g:1626:3: ruleModelKind
            {
             before(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModelKind();

            state._fsp--;

             after(grammarAccess.getModelAccess().getKindModelKindEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__KindAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});

}