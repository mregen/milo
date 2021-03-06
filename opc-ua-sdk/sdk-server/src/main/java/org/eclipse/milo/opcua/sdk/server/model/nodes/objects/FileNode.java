/*
 * Copyright (c) 2017 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.server.model.nodes.objects;

import java.util.Optional;

import org.eclipse.milo.opcua.sdk.server.api.ServerNodeMap;
import org.eclipse.milo.opcua.sdk.server.api.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.nodes.variables.PropertyNode;
import org.eclipse.milo.opcua.sdk.server.model.types.objects.FileType;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.ULong;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;

public class FileNode extends BaseObjectNode implements FileType {
    public FileNode(ServerNodeMap nodeMap, NodeId nodeId, QualifiedName browseName,
                    LocalizedText displayName, LocalizedText description, UInteger writeMask,
                    UInteger userWriteMask) {
        super(nodeMap, nodeId, browseName, displayName, description, writeMask, userWriteMask);
    }

    public FileNode(ServerNodeMap nodeMap, NodeId nodeId, QualifiedName browseName,
                    LocalizedText displayName, LocalizedText description, UInteger writeMask,
                    UInteger userWriteMask, UByte eventNotifier) {
        super(nodeMap, nodeId, browseName, displayName, description, writeMask, userWriteMask, eventNotifier);
    }

    public PropertyNode getSizeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(FileType.SIZE);
        return (PropertyNode) propertyNode.orElse(null);
    }

    public ULong getSize() {
        Optional<ULong> propertyValue = getProperty(FileType.SIZE);
        return propertyValue.orElse(null);
    }

    public void setSize(ULong value) {
        setProperty(FileType.SIZE, value);
    }

    public PropertyNode getWritableNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(FileType.WRITABLE);
        return (PropertyNode) propertyNode.orElse(null);
    }

    public Boolean getWritable() {
        Optional<Boolean> propertyValue = getProperty(FileType.WRITABLE);
        return propertyValue.orElse(null);
    }

    public void setWritable(Boolean value) {
        setProperty(FileType.WRITABLE, value);
    }

    public PropertyNode getUserWritableNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(FileType.USER_WRITABLE);
        return (PropertyNode) propertyNode.orElse(null);
    }

    public Boolean getUserWritable() {
        Optional<Boolean> propertyValue = getProperty(FileType.USER_WRITABLE);
        return propertyValue.orElse(null);
    }

    public void setUserWritable(Boolean value) {
        setProperty(FileType.USER_WRITABLE, value);
    }

    public PropertyNode getOpenCountNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(FileType.OPEN_COUNT);
        return (PropertyNode) propertyNode.orElse(null);
    }

    public UShort getOpenCount() {
        Optional<UShort> propertyValue = getProperty(FileType.OPEN_COUNT);
        return propertyValue.orElse(null);
    }

    public void setOpenCount(UShort value) {
        setProperty(FileType.OPEN_COUNT, value);
    }

    public PropertyNode getMimeTypeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(FileType.MIME_TYPE);
        return (PropertyNode) propertyNode.orElse(null);
    }

    public String getMimeType() {
        Optional<String> propertyValue = getProperty(FileType.MIME_TYPE);
        return propertyValue.orElse(null);
    }

    public void setMimeType(String value) {
        setProperty(FileType.MIME_TYPE, value);
    }
}
