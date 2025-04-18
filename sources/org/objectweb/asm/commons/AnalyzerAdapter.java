package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypeReference;

/* loaded from: classes3.dex */
public class AnalyzerAdapter extends MethodVisitor {
    private List<Label> labels;
    public List<Object> locals;
    private int maxLocals;
    private int maxStack;
    private String owner;
    public List<Object> stack;
    public Map<Object, Object> uninitializedTypes;

    public AnalyzerAdapter(String str, int i2, String str2, String str3, MethodVisitor methodVisitor) {
        this(589824, str, i2, str2, str3, methodVisitor);
        if (getClass() != AnalyzerAdapter.class) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0018. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void execute(int r6, int r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.commons.AnalyzerAdapter.execute(int, int, java.lang.String):void");
    }

    private Object get(int i2) {
        this.maxLocals = Math.max(this.maxLocals, i2 + 1);
        return i2 < this.locals.size() ? this.locals.get(i2) : Opcodes.TOP;
    }

    private Object pop() {
        return this.stack.remove(r0.size() - 1);
    }

    private void push(Object obj) {
        this.stack.add(obj);
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    private void pushDescriptor(String str) {
        if (str.charAt(0) == '(') {
            str = Type.getReturnType(str).getDescriptor();
        }
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            push(Opcodes.FLOAT);
            return;
        }
        if (charAt == 'L') {
            push(str.substring(1, str.length() - 1));
            return;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    push(Opcodes.LONG);
                    push(Opcodes.TOP);
                    return;
                } else if (charAt != 'Z') {
                    if (charAt == '[') {
                        push(str);
                        return;
                    }
                    switch (charAt) {
                        case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                        case TypeReference.INSTANCEOF /* 67 */:
                            break;
                        case TypeReference.NEW /* 68 */:
                            push(Opcodes.DOUBLE);
                            push(Opcodes.TOP);
                            return;
                        default:
                            throw new AssertionError();
                    }
                }
            }
        }
        push(Opcodes.INTEGER);
    }

    private void set(int i2, Object obj) {
        this.maxLocals = Math.max(this.maxLocals, i2 + 1);
        while (i2 >= this.locals.size()) {
            this.locals.add(Opcodes.TOP);
        }
        this.locals.set(i2, obj);
    }

    private static void visitFrameTypes(int i2, Object[] objArr, List<Object> list) {
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            list.add(obj);
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                list.add(Opcodes.TOP);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i2, String str, String str2, String str3) {
        super.visitFieldInsn(i2, str, str2, str3);
        execute(i2, 0, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i2, int i3, Object[] objArr, int i4, Object[] objArr2) {
        if (i2 != -1) {
            throw new IllegalArgumentException("AnalyzerAdapter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        super.visitFrame(i2, i3, objArr, i4, objArr2);
        List<Object> list = this.locals;
        if (list != null) {
            list.clear();
            this.stack.clear();
        } else {
            this.locals = new ArrayList();
            this.stack = new ArrayList();
        }
        visitFrameTypes(i3, objArr, this.locals);
        visitFrameTypes(i4, objArr2, this.stack);
        this.maxLocals = Math.max(this.maxLocals, this.locals.size());
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i2, int i3) {
        super.visitIincInsn(i2, i3);
        this.maxLocals = Math.max(this.maxLocals, i2 + 1);
        execute(Opcodes.IINC, i2, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i2) {
        super.visitInsn(i2);
        execute(i2, 0, null);
        if ((i2 < 172 || i2 > 177) && i2 != 191) {
            return;
        }
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i2, int i3) {
        super.visitIntInsn(i2, i3);
        execute(i2, i3, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str2);
        pushDescriptor(str2);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i2, Label label) {
        super.visitJumpInsn(i2, label);
        execute(i2, 0, null);
        if (i2 == 167) {
            this.locals = null;
            this.stack = null;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        super.visitLabel(label);
        if (this.labels == null) {
            this.labels = new ArrayList(3);
        }
        this.labels.add(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(obj);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        if (obj instanceof Integer) {
            push(Opcodes.INTEGER);
        } else if (obj instanceof Long) {
            push(Opcodes.LONG);
            push(Opcodes.TOP);
        } else if (obj instanceof Float) {
            push(Opcodes.FLOAT);
        } else if (obj instanceof Double) {
            push(Opcodes.DOUBLE);
            push(Opcodes.TOP);
        } else if (obj instanceof String) {
            push("java/lang/String");
        } else if (obj instanceof Type) {
            int sort = ((Type) obj).getSort();
            if (sort == 10 || sort == 9) {
                push("java/lang/Class");
            } else {
                if (sort != 11) {
                    throw new IllegalArgumentException();
                }
                push("java/lang/invoke/MethodType");
            }
        } else if (obj instanceof Handle) {
            push("java/lang/invoke/MethodHandle");
        } else {
            if (!(obj instanceof ConstantDynamic)) {
                throw new IllegalArgumentException();
            }
            pushDescriptor(((ConstantDynamic) obj).getDescriptor());
        }
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i2) {
        char charAt = str2.charAt(0);
        this.maxLocals = Math.max(this.maxLocals, ((charAt == 'J' || charAt == 'D') ? 2 : 1) + i2);
        super.visitLocalVariable(str, str2, str3, label, label2, i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        execute(Opcodes.LOOKUPSWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i2, int i3) {
        if (this.mv != null) {
            this.maxStack = Math.max(this.maxStack, i2);
            int max = Math.max(this.maxLocals, i3);
            this.maxLocals = max;
            this.mv.visitMaxs(this.maxStack, max);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i2, String str, String str2, String str3, boolean z2) {
        if (this.api < 327680 && (i2 & 256) == 0) {
            super.visitMethodInsn(i2, str, str2, str3, z2);
            return;
        }
        super.visitMethodInsn(i2, str, str2, str3, z2);
        int i3 = i2 & (-257);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str3);
        if (i3 != 184) {
            Object pop = pop();
            if (i3 == 183 && str2.equals("<init>")) {
                Object obj = pop == Opcodes.UNINITIALIZED_THIS ? this.owner : this.uninitializedTypes.get(pop);
                for (int i4 = 0; i4 < this.locals.size(); i4++) {
                    if (this.locals.get(i4) == pop) {
                        this.locals.set(i4, obj);
                    }
                }
                for (int i5 = 0; i5 < this.stack.size(); i5++) {
                    if (this.stack.get(i5) == pop) {
                        this.stack.set(i5, obj);
                    }
                }
            }
        }
        pushDescriptor(str3);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i2) {
        super.visitMultiANewArrayInsn(str, i2);
        execute(Opcodes.MULTIANEWARRAY, i2, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i2, int i3, Label label, Label... labelArr) {
        super.visitTableSwitchInsn(i2, i3, label, labelArr);
        execute(Opcodes.TABLESWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i2, String str) {
        if (i2 == 187) {
            if (this.labels == null) {
                Label label = new Label();
                ArrayList arrayList = new ArrayList(3);
                this.labels = arrayList;
                arrayList.add(label);
                MethodVisitor methodVisitor = this.mv;
                if (methodVisitor != null) {
                    methodVisitor.visitLabel(label);
                }
            }
            Iterator<Label> it = this.labels.iterator();
            while (it.hasNext()) {
                this.uninitializedTypes.put(it.next(), str);
            }
        }
        super.visitTypeInsn(i2, str);
        execute(i2, 0, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i2, int i3) {
        super.visitVarInsn(i2, i3);
        this.maxLocals = Math.max(this.maxLocals, (i2 == 22 || i2 == 24 || i2 == 55 || i2 == 57 ? 2 : 1) + i3);
        execute(i2, i3, null);
    }

    private void pop(int i2) {
        int size = this.stack.size();
        int i3 = size - i2;
        for (int i4 = size - 1; i4 >= i3; i4--) {
            this.stack.remove(i4);
        }
    }

    public AnalyzerAdapter(int i2, String str, int i3, String str2, String str3, MethodVisitor methodVisitor) {
        super(i2, methodVisitor);
        this.owner = str;
        this.locals = new ArrayList();
        this.stack = new ArrayList();
        this.uninitializedTypes = new HashMap();
        if ((i3 & 8) == 0) {
            if ("<init>".equals(str2)) {
                this.locals.add(Opcodes.UNINITIALIZED_THIS);
            } else {
                this.locals.add(str);
            }
        }
        for (Type type : Type.getArgumentTypes(str3)) {
            switch (type.getSort()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.locals.add(Opcodes.INTEGER);
                    break;
                case 6:
                    this.locals.add(Opcodes.FLOAT);
                    break;
                case 7:
                    this.locals.add(Opcodes.LONG);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 8:
                    this.locals.add(Opcodes.DOUBLE);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 9:
                    this.locals.add(type.getDescriptor());
                    break;
                case 10:
                    this.locals.add(type.getInternalName());
                    break;
                default:
                    throw new AssertionError();
            }
        }
        this.maxLocals = this.locals.size();
    }

    private void pop(String str) {
        char charAt = str.charAt(0);
        if (charAt != '(') {
            if (charAt != 'J' && charAt != 'D') {
                pop(1);
                return;
            } else {
                pop(2);
                return;
            }
        }
        int i2 = 0;
        for (Type type : Type.getArgumentTypes(str)) {
            i2 += type.getSize();
        }
        pop(i2);
    }
}
