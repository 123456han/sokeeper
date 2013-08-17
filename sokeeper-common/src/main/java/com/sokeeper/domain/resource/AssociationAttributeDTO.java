/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package com.sokeeper.domain.resource;

import java.io.Serializable;

/**
 * @author James Fu (fuyinhai@gmail.com)
 */
public class AssociationAttributeDTO implements Serializable {
    private static final long serialVersionUID = -8337103293936131813L;
    private AssociationEntity association;
    private AttributeEntity   attribute;

    public AssociationAttributeDTO() {
        association = new AssociationEntity();
        attribute = new AttributeEntity();
    }

    public AssociationEntity getAssociation() {
        return association;
    }

    public AttributeEntity getAttribute() {
        return attribute;
    }

}
