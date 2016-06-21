/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.dsl.trace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.dsl.trace.TracePackage
 * @generated
 */
public interface TraceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TraceFactory eINSTANCE = org.xtext.example.dsl.trace.impl.TraceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Formal Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Result</em>'.
   * @generated
   */
  FormalResult createFormalResult();

  /**
   * Returns a new object of class '<em>Time Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Node</em>'.
   * @generated
   */
  TimeNode createTimeNode();

  /**
   * Returns a new object of class '<em>Formal Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Element</em>'.
   * @generated
   */
  FormalElement createFormalElement();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram</em>'.
   * @generated
   */
  Diagram createDiagram();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TracePackage getTracePackage();

} //TraceFactory
