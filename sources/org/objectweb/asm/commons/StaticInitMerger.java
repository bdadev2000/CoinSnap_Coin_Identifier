package org.objectweb.asm.commons;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class StaticInitMerger extends ClassVisitor {
    private MethodVisitor mergedClinitVisitor;
    private int numClinitMethods;
    private String owner;
    private final String renamedClinitMethodPrefix;

    public StaticInitMerger(String str, ClassVisitor classVisitor) {
        this(589824, str, classVisitor);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i2, int i3, String str, String str2, String str3, String[] strArr) {
        super.visit(i2, i3, str, str2, str3, strArr);
        this.owner = str;
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        MethodVisitor methodVisitor = this.mergedClinitVisitor;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(Opcodes.RETURN);
            this.mergedClinitVisitor.visitMaxs(0, 0);
        }
        super.visitEnd();
    }

    @Override // org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i2, String str, String str2, String str3, String[] strArr) {
        if (!"<clinit>".equals(str)) {
            return super.visitMethod(i2, str, str2, str3, strArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.renamedClinitMethodPrefix);
        int i3 = this.numClinitMethods;
        this.numClinitMethods = i3 + 1;
        sb.append(i3);
        String sb2 = sb.toString();
        MethodVisitor visitMethod = super.visitMethod(10, sb2, str2, str3, strArr);
        if (this.mergedClinitVisitor == null) {
            this.mergedClinitVisitor = super.visitMethod(10, str, str2, null, null);
        }
        this.mergedClinitVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.owner, sb2, str2, false);
        return visitMethod;
    }

    public StaticInitMerger(int i2, String str, ClassVisitor classVisitor) {
        super(i2, classVisitor);
        this.renamedClinitMethodPrefix = str;
    }
}
