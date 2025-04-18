package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* loaded from: classes2.dex */
public class MethodNode extends MethodVisitor {
    public int access;
    public Object annotationDefault;
    public List<Attribute> attrs;
    public String desc;
    public List<String> exceptions;
    public InsnList instructions;
    public int invisibleAnnotableParameterCount;
    public List<AnnotationNode> invisibleAnnotations;
    public List<LocalVariableAnnotationNode> invisibleLocalVariableAnnotations;
    public List<AnnotationNode>[] invisibleParameterAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<LocalVariableNode> localVariables;
    public int maxLocals;
    public int maxStack;
    public String name;
    public List<ParameterNode> parameters;
    public String signature;
    public List<TryCatchBlockNode> tryCatchBlocks;
    public int visibleAnnotableParameterCount;
    public List<AnnotationNode> visibleAnnotations;
    public List<LocalVariableAnnotationNode> visibleLocalVariableAnnotations;
    public List<AnnotationNode>[] visibleParameterAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    private boolean visited;

    public MethodNode() {
        this(589824);
        if (getClass() != MethodNode.class) {
            throw new IllegalStateException();
        }
    }

    private LabelNode[] getLabelNodes(Label[] labelArr) {
        LabelNode[] labelNodeArr = new LabelNode[labelArr.length];
        int length = labelArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            labelNodeArr[i2] = getLabelNode(labelArr[i2]);
        }
        return labelNodeArr;
    }

    public void accept(ClassVisitor classVisitor) {
        List<String> list = this.exceptions;
        MethodVisitor visitMethod = classVisitor.visitMethod(this.access, this.name, this.desc, this.signature, list == null ? null : (String[]) list.toArray(new String[0]));
        if (visitMethod != null) {
            accept(visitMethod);
        }
    }

    public void check(int i2) {
        if (i2 == 262144) {
            List<ParameterNode> list = this.parameters;
            if (list != null && !list.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TypeAnnotationNode> list2 = this.visibleTypeAnnotations;
            if (list2 != null && !list2.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TypeAnnotationNode> list3 = this.invisibleTypeAnnotations;
            if (list3 != null && !list3.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<TryCatchBlockNode> list4 = this.tryCatchBlocks;
            if (list4 != null) {
                for (int size = list4.size() - 1; size >= 0; size--) {
                    TryCatchBlockNode tryCatchBlockNode = this.tryCatchBlocks.get(size);
                    List<TypeAnnotationNode> list5 = tryCatchBlockNode.visibleTypeAnnotations;
                    if (list5 != null && !list5.isEmpty()) {
                        throw new UnsupportedClassVersionException();
                    }
                    List<TypeAnnotationNode> list6 = tryCatchBlockNode.invisibleTypeAnnotations;
                    if (list6 != null && !list6.isEmpty()) {
                        throw new UnsupportedClassVersionException();
                    }
                }
            }
            for (int size2 = this.instructions.size() - 1; size2 >= 0; size2--) {
                AbstractInsnNode abstractInsnNode = this.instructions.get(size2);
                List<TypeAnnotationNode> list7 = abstractInsnNode.visibleTypeAnnotations;
                if (list7 != null && !list7.isEmpty()) {
                    throw new UnsupportedClassVersionException();
                }
                List<TypeAnnotationNode> list8 = abstractInsnNode.invisibleTypeAnnotations;
                if (list8 != null && !list8.isEmpty()) {
                    throw new UnsupportedClassVersionException();
                }
                if (abstractInsnNode instanceof MethodInsnNode) {
                    if (((MethodInsnNode) abstractInsnNode).itf != (abstractInsnNode.opcode == 185)) {
                        throw new UnsupportedClassVersionException();
                    }
                } else if (abstractInsnNode instanceof LdcInsnNode) {
                    Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                    if ((obj instanceof Handle) || ((obj instanceof Type) && ((Type) obj).getSort() == 11)) {
                        throw new UnsupportedClassVersionException();
                    }
                } else {
                    continue;
                }
            }
            List<LocalVariableAnnotationNode> list9 = this.visibleLocalVariableAnnotations;
            if (list9 != null && !list9.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            List<LocalVariableAnnotationNode> list10 = this.invisibleLocalVariableAnnotations;
            if (list10 != null && !list10.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
        if (i2 < 458752) {
            for (int size3 = this.instructions.size() - 1; size3 >= 0; size3--) {
                AbstractInsnNode abstractInsnNode2 = this.instructions.get(size3);
                if ((abstractInsnNode2 instanceof LdcInsnNode) && (((LdcInsnNode) abstractInsnNode2).cst instanceof ConstantDynamic)) {
                    throw new UnsupportedClassVersionException();
                }
            }
        }
    }

    public LabelNode getLabelNode(Label label) {
        if (!(label.info instanceof LabelNode)) {
            label.info = new LabelNode();
        }
        return (LabelNode) label.info;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAnnotableParameterCount(int i2, boolean z2) {
        if (z2) {
            this.visibleAnnotableParameterCount = i2;
        } else {
            this.invisibleAnnotableParameterCount = i2;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z2) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z2) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotationNode);
        } else {
            this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotationNode);
        }
        return annotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        return new AnnotationNode(new ArrayList<Object>(0) { // from class: org.objectweb.asm.tree.MethodNode.1
            @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean add(Object obj) {
                MethodNode.this.annotationDefault = obj;
                return super.add(obj);
            }
        });
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i2, String str, String str2, String str3) {
        this.instructions.add(new FieldInsnNode(i2, str, str2, str3));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        this.instructions.add(new FrameNode(i2, i3, objArr == null ? null : getLabelNodes(objArr), i4, objArr2 == null ? null : getLabelNodes(objArr2)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i2, int i3) {
        this.instructions.add(new IincInsnNode(i2, i3));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i2) {
        this.instructions.add(new InsnNode(i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        AbstractInsnNode last = this.instructions.getLast();
        while (last.getOpcode() == -1) {
            last = last.getPrevious();
        }
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i2, typePath, str);
        if (z2) {
            last.visibleTypeAnnotations = Util.add(last.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            last.invisibleTypeAnnotations = Util.add(last.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i2, int i3) {
        this.instructions.add(new IntInsnNode(i2, i3));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.instructions.add(new InvokeDynamicInsnNode(str, str2, handle, objArr));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i2, Label label) {
        this.instructions.add(new JumpInsnNode(i2, getLabelNode(label)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        this.instructions.add(getLabelNode(label));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.instructions.add(new LdcInsnNode(obj));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i2, Label label) {
        this.instructions.add(new LineNumberNode(i2, getLabelNode(label)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i2) {
        this.localVariables = Util.add(this.localVariables, new LocalVariableNode(str, str2, str3, getLabelNode(label), getLabelNode(label2), i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i2, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z2) {
        LocalVariableAnnotationNode localVariableAnnotationNode = new LocalVariableAnnotationNode(i2, typePath, getLabelNodes(labelArr), getLabelNodes(labelArr2), iArr, str);
        if (z2) {
            this.visibleLocalVariableAnnotations = Util.add(this.visibleLocalVariableAnnotations, localVariableAnnotationNode);
        } else {
            this.invisibleLocalVariableAnnotations = Util.add(this.invisibleLocalVariableAnnotations, localVariableAnnotationNode);
        }
        return localVariableAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        this.instructions.add(new LookupSwitchInsnNode(getLabelNode(label), iArr, getLabelNodes(labelArr)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i2, int i3) {
        this.maxStack = i2;
        this.maxLocals = i3;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i2, String str, String str2, String str3, boolean z2) {
        if (this.api < 327680 && (i2 & 256) == 0) {
            super.visitMethodInsn(i2, str, str2, str3, z2);
        } else {
            this.instructions.add(new MethodInsnNode(i2 & (-257), str, str2, str3, z2));
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i2) {
        this.instructions.add(new MultiANewArrayInsnNode(str, i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(String str, int i2) {
        if (this.parameters == null) {
            this.parameters = new ArrayList(5);
        }
        this.parameters.add(new ParameterNode(str, i2));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i2, String str, boolean z2) {
        AnnotationNode annotationNode = new AnnotationNode(str);
        if (z2) {
            if (this.visibleParameterAnnotations == null) {
                this.visibleParameterAnnotations = new List[Type.getArgumentTypes(this.desc).length];
            }
            List<AnnotationNode>[] listArr = this.visibleParameterAnnotations;
            listArr[i2] = Util.add(listArr[i2], annotationNode);
        } else {
            if (this.invisibleParameterAnnotations == null) {
                this.invisibleParameterAnnotations = new List[Type.getArgumentTypes(this.desc).length];
            }
            List<AnnotationNode>[] listArr2 = this.invisibleParameterAnnotations;
            listArr2[i2] = Util.add(listArr2[i2], annotationNode);
        }
        return annotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i2, int i3, Label label, Label... labelArr) {
        this.instructions.add(new TableSwitchInsnNode(i2, i3, getLabelNode(label), getLabelNodes(labelArr)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        TryCatchBlockNode tryCatchBlockNode = this.tryCatchBlocks.get((16776960 & i2) >> 8);
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i2, typePath, str);
        if (z2) {
            tryCatchBlockNode.visibleTypeAnnotations = Util.add(tryCatchBlockNode.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            tryCatchBlockNode.invisibleTypeAnnotations = Util.add(tryCatchBlockNode.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.tryCatchBlocks = Util.add(this.tryCatchBlocks, new TryCatchBlockNode(getLabelNode(label), getLabelNode(label2), getLabelNode(label3), str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i2, TypePath typePath, String str, boolean z2) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(i2, typePath, str);
        if (z2) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotationNode);
        } else {
            this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i2, String str) {
        this.instructions.add(new TypeInsnNode(i2, str));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i2, int i3) {
        this.instructions.add(new VarInsnNode(i2, i3));
    }

    public MethodNode(int i2) {
        super(i2);
        this.instructions = new InsnList();
    }

    private Object[] getLabelNodes(Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length];
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof Label) {
                obj = getLabelNode((Label) obj);
            }
            objArr2[i2] = obj;
        }
        return objArr2;
    }

    public void accept(MethodVisitor methodVisitor) {
        List<ParameterNode> list = this.parameters;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.parameters.get(i2).accept(methodVisitor);
            }
        }
        if (this.annotationDefault != null) {
            AnnotationVisitor visitAnnotationDefault = methodVisitor.visitAnnotationDefault();
            AnnotationNode.accept(visitAnnotationDefault, null, this.annotationDefault);
            if (visitAnnotationDefault != null) {
                visitAnnotationDefault.visitEnd();
            }
        }
        List<AnnotationNode> list2 = this.visibleAnnotations;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotationNode annotationNode = this.visibleAnnotations.get(i3);
                annotationNode.accept(methodVisitor.visitAnnotation(annotationNode.desc, true));
            }
        }
        List<AnnotationNode> list3 = this.invisibleAnnotations;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AnnotationNode annotationNode2 = this.invisibleAnnotations.get(i4);
                annotationNode2.accept(methodVisitor.visitAnnotation(annotationNode2.desc, false));
            }
        }
        List<TypeAnnotationNode> list4 = this.visibleTypeAnnotations;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(i5);
                typeAnnotationNode.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
            }
        }
        List<TypeAnnotationNode> list5 = this.invisibleTypeAnnotations;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i6 = 0; i6 < size5; i6++) {
                TypeAnnotationNode typeAnnotationNode2 = this.invisibleTypeAnnotations.get(i6);
                typeAnnotationNode2.accept(methodVisitor.visitTypeAnnotation(typeAnnotationNode2.typeRef, typeAnnotationNode2.typePath, typeAnnotationNode2.desc, false));
            }
        }
        int i7 = this.visibleAnnotableParameterCount;
        if (i7 > 0) {
            methodVisitor.visitAnnotableParameterCount(i7, true);
        }
        List<AnnotationNode>[] listArr = this.visibleParameterAnnotations;
        if (listArr != null) {
            int length = listArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                List<AnnotationNode> list6 = this.visibleParameterAnnotations[i8];
                if (list6 != null) {
                    int size6 = list6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        AnnotationNode annotationNode3 = list6.get(i9);
                        annotationNode3.accept(methodVisitor.visitParameterAnnotation(i8, annotationNode3.desc, true));
                    }
                }
            }
        }
        int i10 = this.invisibleAnnotableParameterCount;
        if (i10 > 0) {
            methodVisitor.visitAnnotableParameterCount(i10, false);
        }
        List<AnnotationNode>[] listArr2 = this.invisibleParameterAnnotations;
        if (listArr2 != null) {
            int length2 = listArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                List<AnnotationNode> list7 = this.invisibleParameterAnnotations[i11];
                if (list7 != null) {
                    int size7 = list7.size();
                    for (int i12 = 0; i12 < size7; i12++) {
                        AnnotationNode annotationNode4 = list7.get(i12);
                        annotationNode4.accept(methodVisitor.visitParameterAnnotation(i11, annotationNode4.desc, false));
                    }
                }
            }
        }
        if (this.visited) {
            this.instructions.resetLabels();
        }
        List<Attribute> list8 = this.attrs;
        if (list8 != null) {
            int size8 = list8.size();
            for (int i13 = 0; i13 < size8; i13++) {
                methodVisitor.visitAttribute(this.attrs.get(i13));
            }
        }
        if (this.instructions.size() > 0) {
            methodVisitor.visitCode();
            List<TryCatchBlockNode> list9 = this.tryCatchBlocks;
            if (list9 != null) {
                int size9 = list9.size();
                for (int i14 = 0; i14 < size9; i14++) {
                    this.tryCatchBlocks.get(i14).updateIndex(i14);
                    this.tryCatchBlocks.get(i14).accept(methodVisitor);
                }
            }
            this.instructions.accept(methodVisitor);
            List<LocalVariableNode> list10 = this.localVariables;
            if (list10 != null) {
                int size10 = list10.size();
                for (int i15 = 0; i15 < size10; i15++) {
                    this.localVariables.get(i15).accept(methodVisitor);
                }
            }
            List<LocalVariableAnnotationNode> list11 = this.visibleLocalVariableAnnotations;
            if (list11 != null) {
                int size11 = list11.size();
                for (int i16 = 0; i16 < size11; i16++) {
                    this.visibleLocalVariableAnnotations.get(i16).accept(methodVisitor, true);
                }
            }
            List<LocalVariableAnnotationNode> list12 = this.invisibleLocalVariableAnnotations;
            if (list12 != null) {
                int size12 = list12.size();
                for (int i17 = 0; i17 < size12; i17++) {
                    this.invisibleLocalVariableAnnotations.get(i17).accept(methodVisitor, false);
                }
            }
            methodVisitor.visitMaxs(this.maxStack, this.maxLocals);
            this.visited = true;
        }
        methodVisitor.visitEnd();
    }

    public MethodNode(int i2, String str, String str2, String str3, String[] strArr) {
        this(589824, i2, str, str2, str3, strArr);
        if (getClass() != MethodNode.class) {
            throw new IllegalStateException();
        }
    }

    public MethodNode(int i2, int i3, String str, String str2, String str3, String[] strArr) {
        super(i2);
        this.access = i3;
        this.name = str;
        this.desc = str2;
        this.signature = str3;
        this.exceptions = Util.asArrayList(strArr);
        if ((i3 & 1024) == 0) {
            this.localVariables = new ArrayList(5);
        }
        this.tryCatchBlocks = new ArrayList();
        this.instructions = new InsnList();
    }
}
