package org.xtext.example.plugin.popup.actions;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import org.xtext.example.dsl.TraceStandaloneSetup;
import org.xtext.example.dsl.trace.FormalResult;

public class DSLReader {
	
	public static void transformXTextToXMI (String catalogueRefactoringDslFileToBeRead, String applicationDslFileToBeRead, Shell shell) {
		
		Injector injector = new TraceStandaloneSetup().createInjectorAndDoEMFRegistration();
			
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource xtextResource = resourceSet.getResource(URI.createURI("platform:/resource/DSLExample/sample.trace"), true);
		
		EcoreUtil.resolveAll(xtextResource);
		
		Resource xmiResource = resourceSet.createResource(URI.createURI("platform:/resource/DSLExample/application.xmi"));
		
		//FormalResult model = (FormalResult) xtextResource.getContents().get(0);
		
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}