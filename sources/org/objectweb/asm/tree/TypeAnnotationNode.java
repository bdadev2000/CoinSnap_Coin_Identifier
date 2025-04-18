package org.objectweb.asm.tree;

import org.objectweb.asm.TypePath;

/* loaded from: classes3.dex */
public class TypeAnnotationNode extends AnnotationNode {
    public TypePath typePath;
    public int typeRef;

    public TypeAnnotationNode(int i2, TypePath typePath, String str) {
        this(589824, i2, typePath, str);
        if (getClass() != TypeAnnotationNode.class) {
            throw new IllegalStateException();
        }
    }

    public TypeAnnotationNode(int i2, int i3, TypePath typePath, String str) {
        super(i2, str);
        this.typeRef = i3;
        this.typePath = typePath;
    }
}
