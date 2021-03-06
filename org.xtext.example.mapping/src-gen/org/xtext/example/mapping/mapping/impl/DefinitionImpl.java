/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mapping.mapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mapping.mapping.Definition;
import org.xtext.example.mapping.mapping.FormalElement;
import org.xtext.example.mapping.mapping.MappingPackage;
import org.xtext.example.mapping.mapping.TypeElement;
import org.xtext.example.mapping.mapping.UmlElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mapping.mapping.impl.DefinitionImpl#getFormalElement <em>Formal Element</em>}</li>
 *   <li>{@link org.xtext.example.mapping.mapping.impl.DefinitionImpl#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link org.xtext.example.mapping.mapping.impl.DefinitionImpl#getTypeElement <em>Type Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getFormalElement() <em>Formal Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalElement()
   * @generated
   * @ordered
   */
  protected FormalElement formalElement;

  /**
   * The cached value of the '{@link #getUmlElement() <em>Uml Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUmlElement()
   * @generated
   * @ordered
   */
  protected UmlElement umlElement;

  /**
   * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeElement()
   * @generated
   * @ordered
   */
  protected TypeElement typeElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MappingPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalElement getFormalElement()
  {
    return formalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalElement(FormalElement newFormalElement, NotificationChain msgs)
  {
    FormalElement oldFormalElement = formalElement;
    formalElement = newFormalElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.DEFINITION__FORMAL_ELEMENT, oldFormalElement, newFormalElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalElement(FormalElement newFormalElement)
  {
    if (newFormalElement != formalElement)
    {
      NotificationChain msgs = null;
      if (formalElement != null)
        msgs = ((InternalEObject)formalElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.DEFINITION__FORMAL_ELEMENT, null, msgs);
      if (newFormalElement != null)
        msgs = ((InternalEObject)newFormalElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.DEFINITION__FORMAL_ELEMENT, null, msgs);
      msgs = basicSetFormalElement(newFormalElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.DEFINITION__FORMAL_ELEMENT, newFormalElement, newFormalElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlElement getUmlElement()
  {
    return umlElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUmlElement(UmlElement newUmlElement, NotificationChain msgs)
  {
    UmlElement oldUmlElement = umlElement;
    umlElement = newUmlElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.DEFINITION__UML_ELEMENT, oldUmlElement, newUmlElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUmlElement(UmlElement newUmlElement)
  {
    if (newUmlElement != umlElement)
    {
      NotificationChain msgs = null;
      if (umlElement != null)
        msgs = ((InternalEObject)umlElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.DEFINITION__UML_ELEMENT, null, msgs);
      if (newUmlElement != null)
        msgs = ((InternalEObject)newUmlElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.DEFINITION__UML_ELEMENT, null, msgs);
      msgs = basicSetUmlElement(newUmlElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.DEFINITION__UML_ELEMENT, newUmlElement, newUmlElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeElement getTypeElement()
  {
    return typeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeElement(TypeElement newTypeElement, NotificationChain msgs)
  {
    TypeElement oldTypeElement = typeElement;
    typeElement = newTypeElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.DEFINITION__TYPE_ELEMENT, oldTypeElement, newTypeElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeElement(TypeElement newTypeElement)
  {
    if (newTypeElement != typeElement)
    {
      NotificationChain msgs = null;
      if (typeElement != null)
        msgs = ((InternalEObject)typeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.DEFINITION__TYPE_ELEMENT, null, msgs);
      if (newTypeElement != null)
        msgs = ((InternalEObject)newTypeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.DEFINITION__TYPE_ELEMENT, null, msgs);
      msgs = basicSetTypeElement(newTypeElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.DEFINITION__TYPE_ELEMENT, newTypeElement, newTypeElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MappingPackage.DEFINITION__FORMAL_ELEMENT:
        return basicSetFormalElement(null, msgs);
      case MappingPackage.DEFINITION__UML_ELEMENT:
        return basicSetUmlElement(null, msgs);
      case MappingPackage.DEFINITION__TYPE_ELEMENT:
        return basicSetTypeElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MappingPackage.DEFINITION__FORMAL_ELEMENT:
        return getFormalElement();
      case MappingPackage.DEFINITION__UML_ELEMENT:
        return getUmlElement();
      case MappingPackage.DEFINITION__TYPE_ELEMENT:
        return getTypeElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingPackage.DEFINITION__FORMAL_ELEMENT:
        setFormalElement((FormalElement)newValue);
        return;
      case MappingPackage.DEFINITION__UML_ELEMENT:
        setUmlElement((UmlElement)newValue);
        return;
      case MappingPackage.DEFINITION__TYPE_ELEMENT:
        setTypeElement((TypeElement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.DEFINITION__FORMAL_ELEMENT:
        setFormalElement((FormalElement)null);
        return;
      case MappingPackage.DEFINITION__UML_ELEMENT:
        setUmlElement((UmlElement)null);
        return;
      case MappingPackage.DEFINITION__TYPE_ELEMENT:
        setTypeElement((TypeElement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.DEFINITION__FORMAL_ELEMENT:
        return formalElement != null;
      case MappingPackage.DEFINITION__UML_ELEMENT:
        return umlElement != null;
      case MappingPackage.DEFINITION__TYPE_ELEMENT:
        return typeElement != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
