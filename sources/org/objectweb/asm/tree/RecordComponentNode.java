package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.TypePath;

/* loaded from: classes3.dex */
public class RecordComponentNode extends RecordComponentVisitor {
    public List<Attribute> attrs;
    public String descriptor;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public String name;
    public String signature;
    public List<AnnotationNode> visibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;

    public RecordComponentNode(String str, String str2, String str3) {
        this(589824, str, str2, str3);
        if (getClass() != RecordComponentNode.class) {
            throw new IllegalStateException();
        }
    }

    public void accept(ClassVisitor classVisitor) {
        RecordComponentVisitor visitRecordComponent = classVisitor.visitRecordComponent(this.name, this.descriptor, this.signature);
        if (visitRecordComponent == null) {
            return;
        }
        List<AnnotationNode> list = this.visibleAnnotations;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i2);
                annotationNode.accept(visitRecordComponent.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list2 = this.invisibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i3);
                annotationNode2.accept(visitRecordComponent.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list3 = this.visibleTypeAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i4);
                typeAnnotationNode.accept(visitRecordComponent.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list4 = this.invisibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i5);
                typeAnnotationNode2.accept(visitRecordComponent.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        List<Attribute> list5 = this.attrs;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i6 = 0; i6 < size5; i6++) {
                visitRecordComponent.visitAttribute(this.attrs.get(i6));
            }
        }
        visitRecordComponent.visitEnd();
    }

    public void check(int i2) {
        if (i2 < 524288) {
            throw new UnsupportedClassVersionException();
        }
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z2) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z2) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotationNode);
        } else {
            this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotationNode);
        }
        return annotationNode;
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public void visitEnd() {
    }

    @Override // org.objectweb.asm.RecordComponentVisitor
    public AnnotationVisitor visitTypeAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i2, typePath, str);
        if (z2) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    public RecordComponentNode(int i2, String str, String str2, String str3) {
        super(i2);
        this.name = str;
        this.descriptor = str2;
        this.signature = str3;
    }
}
