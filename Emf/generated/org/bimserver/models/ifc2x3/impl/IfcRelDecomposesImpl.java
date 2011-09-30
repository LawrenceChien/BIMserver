/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcObjectDefinition;
import org.bimserver.models.ifc2x3.IfcRelDecomposes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Decomposes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcRelDecomposesImpl#getRelatingObject <em>Relating Object</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcRelDecomposesImpl#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelDecomposesImpl extends IfcRelationshipImpl implements IfcRelDecomposes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDecomposesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcRelDecomposes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectDefinition getRelatingObject() {
		return (IfcObjectDefinition) eGet(Ifc2x3Package.eINSTANCE.getIfcRelDecomposes_RelatingObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingObject(IfcObjectDefinition newRelatingObject) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelDecomposes_RelatingObject(), newRelatingObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcObjectDefinition> getRelatedObjects() {
		return (EList<IfcObjectDefinition>) eGet(Ifc2x3Package.eINSTANCE.getIfcRelDecomposes_RelatedObjects(), true);
	}

} //IfcRelDecomposesImpl