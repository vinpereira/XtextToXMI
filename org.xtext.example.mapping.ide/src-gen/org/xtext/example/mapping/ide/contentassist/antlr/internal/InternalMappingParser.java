package org.xtext.example.mapping.ide.contentassist.antlr.internal;

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
import org.xtext.example.mapping.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MappingGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMapping"
    // InternalMapping.g:53:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMapping.g:54:1: ( ruleMapping EOF )
            // InternalMapping.g:55:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMapping.g:62:1: ruleMapping : ( ( rule__Mapping__DefinitionsAssignment )* ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:66:2: ( ( ( rule__Mapping__DefinitionsAssignment )* ) )
            // InternalMapping.g:67:2: ( ( rule__Mapping__DefinitionsAssignment )* )
            {
            // InternalMapping.g:67:2: ( ( rule__Mapping__DefinitionsAssignment )* )
            // InternalMapping.g:68:3: ( rule__Mapping__DefinitionsAssignment )*
            {
             before(grammarAccess.getMappingAccess().getDefinitionsAssignment()); 
            // InternalMapping.g:69:3: ( rule__Mapping__DefinitionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMapping.g:69:4: rule__Mapping__DefinitionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Mapping__DefinitionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getDefinitionsAssignment()); 

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleDefinition"
    // InternalMapping.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalMapping.g:79:1: ( ruleDefinition EOF )
            // InternalMapping.g:80:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMapping.g:87:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:91:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalMapping.g:92:2: ( ( rule__Definition__Group__0 ) )
            {
            // InternalMapping.g:92:2: ( ( rule__Definition__Group__0 ) )
            // InternalMapping.g:93:3: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalMapping.g:94:3: ( rule__Definition__Group__0 )
            // InternalMapping.g:94:4: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleFormalElement"
    // InternalMapping.g:103:1: entryRuleFormalElement : ruleFormalElement EOF ;
    public final void entryRuleFormalElement() throws RecognitionException {
        try {
            // InternalMapping.g:104:1: ( ruleFormalElement EOF )
            // InternalMapping.g:105:1: ruleFormalElement EOF
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
    // InternalMapping.g:112:1: ruleFormalElement : ( ( rule__FormalElement__NameAssignment ) ) ;
    public final void ruleFormalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:116:2: ( ( ( rule__FormalElement__NameAssignment ) ) )
            // InternalMapping.g:117:2: ( ( rule__FormalElement__NameAssignment ) )
            {
            // InternalMapping.g:117:2: ( ( rule__FormalElement__NameAssignment ) )
            // InternalMapping.g:118:3: ( rule__FormalElement__NameAssignment )
            {
             before(grammarAccess.getFormalElementAccess().getNameAssignment()); 
            // InternalMapping.g:119:3: ( rule__FormalElement__NameAssignment )
            // InternalMapping.g:119:4: rule__FormalElement__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FormalElement__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFormalElementAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRuleUmlElement"
    // InternalMapping.g:128:1: entryRuleUmlElement : ruleUmlElement EOF ;
    public final void entryRuleUmlElement() throws RecognitionException {
        try {
            // InternalMapping.g:129:1: ( ruleUmlElement EOF )
            // InternalMapping.g:130:1: ruleUmlElement EOF
            {
             before(grammarAccess.getUmlElementRule()); 
            pushFollow(FOLLOW_1);
            ruleUmlElement();

            state._fsp--;

             after(grammarAccess.getUmlElementRule()); 
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
    // $ANTLR end "entryRuleUmlElement"


    // $ANTLR start "ruleUmlElement"
    // InternalMapping.g:137:1: ruleUmlElement : ( ( rule__UmlElement__NameAssignment ) ) ;
    public final void ruleUmlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:141:2: ( ( ( rule__UmlElement__NameAssignment ) ) )
            // InternalMapping.g:142:2: ( ( rule__UmlElement__NameAssignment ) )
            {
            // InternalMapping.g:142:2: ( ( rule__UmlElement__NameAssignment ) )
            // InternalMapping.g:143:3: ( rule__UmlElement__NameAssignment )
            {
             before(grammarAccess.getUmlElementAccess().getNameAssignment()); 
            // InternalMapping.g:144:3: ( rule__UmlElement__NameAssignment )
            // InternalMapping.g:144:4: rule__UmlElement__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UmlElement__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUmlElementAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleUmlElement"


    // $ANTLR start "entryRuleTypeElement"
    // InternalMapping.g:153:1: entryRuleTypeElement : ruleTypeElement EOF ;
    public final void entryRuleTypeElement() throws RecognitionException {
        try {
            // InternalMapping.g:154:1: ( ruleTypeElement EOF )
            // InternalMapping.g:155:1: ruleTypeElement EOF
            {
             before(grammarAccess.getTypeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeElement();

            state._fsp--;

             after(grammarAccess.getTypeElementRule()); 
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
    // $ANTLR end "entryRuleTypeElement"


    // $ANTLR start "ruleTypeElement"
    // InternalMapping.g:162:1: ruleTypeElement : ( ( rule__TypeElement__NameAssignment ) ) ;
    public final void ruleTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:166:2: ( ( ( rule__TypeElement__NameAssignment ) ) )
            // InternalMapping.g:167:2: ( ( rule__TypeElement__NameAssignment ) )
            {
            // InternalMapping.g:167:2: ( ( rule__TypeElement__NameAssignment ) )
            // InternalMapping.g:168:3: ( rule__TypeElement__NameAssignment )
            {
             before(grammarAccess.getTypeElementAccess().getNameAssignment()); 
            // InternalMapping.g:169:3: ( rule__TypeElement__NameAssignment )
            // InternalMapping.g:169:4: rule__TypeElement__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeElement__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeElementAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleTypeElement"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalMapping.g:177:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:181:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalMapping.g:182:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

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
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalMapping.g:189:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__FormalElementAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:193:1: ( ( ( rule__Definition__FormalElementAssignment_0 ) ) )
            // InternalMapping.g:194:1: ( ( rule__Definition__FormalElementAssignment_0 ) )
            {
            // InternalMapping.g:194:1: ( ( rule__Definition__FormalElementAssignment_0 ) )
            // InternalMapping.g:195:2: ( rule__Definition__FormalElementAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getFormalElementAssignment_0()); 
            // InternalMapping.g:196:2: ( rule__Definition__FormalElementAssignment_0 )
            // InternalMapping.g:196:3: rule__Definition__FormalElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__FormalElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getFormalElementAssignment_0()); 

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
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalMapping.g:204:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:208:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalMapping.g:209:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__2();

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
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalMapping.g:216:1: rule__Definition__Group__1__Impl : ( ',' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:220:1: ( ( ',' ) )
            // InternalMapping.g:221:1: ( ',' )
            {
            // InternalMapping.g:221:1: ( ',' )
            // InternalMapping.g:222:2: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // InternalMapping.g:231:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:235:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // InternalMapping.g:236:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__3();

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
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // InternalMapping.g:243:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__UmlElementAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:247:1: ( ( ( rule__Definition__UmlElementAssignment_2 ) ) )
            // InternalMapping.g:248:1: ( ( rule__Definition__UmlElementAssignment_2 ) )
            {
            // InternalMapping.g:248:1: ( ( rule__Definition__UmlElementAssignment_2 ) )
            // InternalMapping.g:249:2: ( rule__Definition__UmlElementAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getUmlElementAssignment_2()); 
            // InternalMapping.g:250:2: ( rule__Definition__UmlElementAssignment_2 )
            // InternalMapping.g:250:3: rule__Definition__UmlElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__UmlElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getUmlElementAssignment_2()); 

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
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // InternalMapping.g:258:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:262:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // InternalMapping.g:263:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__4();

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
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // InternalMapping.g:270:1: rule__Definition__Group__3__Impl : ( ',' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:274:1: ( ( ',' ) )
            // InternalMapping.g:275:1: ( ',' )
            {
            // InternalMapping.g:275:1: ( ',' )
            // InternalMapping.g:276:2: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // InternalMapping.g:285:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:289:1: ( rule__Definition__Group__4__Impl )
            // InternalMapping.g:290:2: rule__Definition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__4__Impl();

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
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // InternalMapping.g:296:1: rule__Definition__Group__4__Impl : ( ( rule__Definition__TypeElementAssignment_4 ) ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:300:1: ( ( ( rule__Definition__TypeElementAssignment_4 ) ) )
            // InternalMapping.g:301:1: ( ( rule__Definition__TypeElementAssignment_4 ) )
            {
            // InternalMapping.g:301:1: ( ( rule__Definition__TypeElementAssignment_4 ) )
            // InternalMapping.g:302:2: ( rule__Definition__TypeElementAssignment_4 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeElementAssignment_4()); 
            // InternalMapping.g:303:2: ( rule__Definition__TypeElementAssignment_4 )
            // InternalMapping.g:303:3: rule__Definition__TypeElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__TypeElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeElementAssignment_4()); 

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
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Mapping__DefinitionsAssignment"
    // InternalMapping.g:312:1: rule__Mapping__DefinitionsAssignment : ( ruleDefinition ) ;
    public final void rule__Mapping__DefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:316:1: ( ( ruleDefinition ) )
            // InternalMapping.g:317:2: ( ruleDefinition )
            {
            // InternalMapping.g:317:2: ( ruleDefinition )
            // InternalMapping.g:318:3: ruleDefinition
            {
             before(grammarAccess.getMappingAccess().getDefinitionsDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getDefinitionsDefinitionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Mapping__DefinitionsAssignment"


    // $ANTLR start "rule__Definition__FormalElementAssignment_0"
    // InternalMapping.g:327:1: rule__Definition__FormalElementAssignment_0 : ( ruleFormalElement ) ;
    public final void rule__Definition__FormalElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:331:1: ( ( ruleFormalElement ) )
            // InternalMapping.g:332:2: ( ruleFormalElement )
            {
            // InternalMapping.g:332:2: ( ruleFormalElement )
            // InternalMapping.g:333:3: ruleFormalElement
            {
             before(grammarAccess.getDefinitionAccess().getFormalElementFormalElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalElement();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getFormalElementFormalElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Definition__FormalElementAssignment_0"


    // $ANTLR start "rule__Definition__UmlElementAssignment_2"
    // InternalMapping.g:342:1: rule__Definition__UmlElementAssignment_2 : ( ruleUmlElement ) ;
    public final void rule__Definition__UmlElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:346:1: ( ( ruleUmlElement ) )
            // InternalMapping.g:347:2: ( ruleUmlElement )
            {
            // InternalMapping.g:347:2: ( ruleUmlElement )
            // InternalMapping.g:348:3: ruleUmlElement
            {
             before(grammarAccess.getDefinitionAccess().getUmlElementUmlElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUmlElement();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getUmlElementUmlElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Definition__UmlElementAssignment_2"


    // $ANTLR start "rule__Definition__TypeElementAssignment_4"
    // InternalMapping.g:357:1: rule__Definition__TypeElementAssignment_4 : ( ruleTypeElement ) ;
    public final void rule__Definition__TypeElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:361:1: ( ( ruleTypeElement ) )
            // InternalMapping.g:362:2: ( ruleTypeElement )
            {
            // InternalMapping.g:362:2: ( ruleTypeElement )
            // InternalMapping.g:363:3: ruleTypeElement
            {
             before(grammarAccess.getDefinitionAccess().getTypeElementTypeElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeElement();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getTypeElementTypeElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Definition__TypeElementAssignment_4"


    // $ANTLR start "rule__FormalElement__NameAssignment"
    // InternalMapping.g:372:1: rule__FormalElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__FormalElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:376:1: ( ( RULE_ID ) )
            // InternalMapping.g:377:2: ( RULE_ID )
            {
            // InternalMapping.g:377:2: ( RULE_ID )
            // InternalMapping.g:378:3: RULE_ID
            {
             before(grammarAccess.getFormalElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormalElementAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FormalElement__NameAssignment"


    // $ANTLR start "rule__UmlElement__NameAssignment"
    // InternalMapping.g:387:1: rule__UmlElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__UmlElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:391:1: ( ( RULE_ID ) )
            // InternalMapping.g:392:2: ( RULE_ID )
            {
            // InternalMapping.g:392:2: ( RULE_ID )
            // InternalMapping.g:393:3: RULE_ID
            {
             before(grammarAccess.getUmlElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUmlElementAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__UmlElement__NameAssignment"


    // $ANTLR start "rule__TypeElement__NameAssignment"
    // InternalMapping.g:402:1: rule__TypeElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__TypeElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:406:1: ( ( RULE_ID ) )
            // InternalMapping.g:407:2: ( RULE_ID )
            {
            // InternalMapping.g:407:2: ( RULE_ID )
            // InternalMapping.g:408:3: RULE_ID
            {
             before(grammarAccess.getTypeElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeElementAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__TypeElement__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}