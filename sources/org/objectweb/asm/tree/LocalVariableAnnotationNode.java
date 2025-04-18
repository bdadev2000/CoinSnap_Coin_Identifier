package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;

/* loaded from: classes4.dex */
public class LocalVariableAnnotationNode extends TypeAnnotationNode {
    public List<LabelNode> end;
    public List<Integer> index;
    public List<LabelNode> start;

    public LocalVariableAnnotationNode(int i2, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        this(589824, i2, typePath, labelNodeArr, labelNodeArr2, iArr, str);
    }

    public void accept(MethodVisitor methodVisitor, boolean z2) {
        int size = this.start.size();
        Label[] labelArr = new Label[size];
        Label[] labelArr2 = new Label[this.end.size()];
        int[] iArr = new int[this.index.size()];
        for (int i2 = 0; i2 < size; i2++) {
            labelArr[i2] = this.start.get(i2).getLabel();
            labelArr2[i2] = this.end.get(i2).getLabel();
            iArr[i2] = this.index.get(i2).intValue();
        }
        accept(methodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, labelArr, labelArr2, iArr, this.desc, z2));
    }

    public LocalVariableAnnotationNode(int i2, int i3, TypePath typePath, LabelNode[] labelNodeArr, LabelNode[] labelNodeArr2, int[] iArr, String str) {
        super(i2, i3, typePath, str);
        this.start = Util.asArrayList(labelNodeArr);
        this.end = Util.asArrayList(labelNodeArr2);
        this.index = Util.asArrayList(iArr);
    }
}
