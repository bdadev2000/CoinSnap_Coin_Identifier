package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/* loaded from: classes3.dex */
public class TryCatchBlockNode {
    public LabelNode end;
    public LabelNode handler;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public LabelNode start;
    public String type;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public TryCatchBlockNode(LabelNode labelNode, LabelNode labelNode2, LabelNode labelNode3, String str) {
        this.start = labelNode;
        this.end = labelNode2;
        this.handler = labelNode3;
        this.type = str;
    }

    public void accept(MethodVisitor methodVisitor) {
        Label label = this.start.getLabel();
        Label label2 = this.end.getLabel();
        LabelNode labelNode = this.handler;
        methodVisitor.visitTryCatchBlock(label, label2, labelNode == null ? null : labelNode.getLabel(), this.type);
        List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i2);
                typeAnnotationNode.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i3);
                typeAnnotationNode2.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
    }

    public void updateIndex(int i2) {
        int i3 = (i2 << 8) | 1107296256;
        List<TypeAnnotationNode> list = this.visibleTypeAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.visibleTypeAnnotations.get(i4).typeRef = i3;
            }
        }
        List<TypeAnnotationNode> list2 = this.invisibleTypeAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                this.invisibleTypeAnnotations.get(i5).typeRef = i3;
            }
        }
    }
}
