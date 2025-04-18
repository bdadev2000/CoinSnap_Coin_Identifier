package org.objectweb.asm.tree.analysis;

import android.support.v4.media.d;
import java.util.List;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

/* loaded from: classes3.dex */
public class BasicVerifier extends BasicInterpreter {
    public BasicVerifier() {
        super(589824);
        if (getClass() != BasicVerifier.class) {
            throw new IllegalStateException();
        }
    }

    public BasicValue getElementValue(BasicValue basicValue) throws AnalyzerException {
        return BasicValue.REFERENCE_VALUE;
    }

    public boolean isArrayValue(BasicValue basicValue) {
        return basicValue.isReference();
    }

    public boolean isSubTypeOf(BasicValue basicValue, BasicValue basicValue2) {
        return basicValue.equals(basicValue2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.BasicValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.analysis.BasicValue r6, org.objectweb.asm.tree.analysis.BasicValue r7) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.BasicVerifier.binaryOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue, org.objectweb.asm.tree.analysis.BasicValue):org.objectweb.asm.tree.analysis.BasicValue");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.BasicValue copyOperation(org.objectweb.asm.tree.AbstractInsnNode r4, org.objectweb.asm.tree.analysis.BasicValue r5) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            r3 = this;
            int r0 = r4.getOpcode()
            r1 = 0
            switch(r0) {
                case 21: goto L3c;
                case 22: goto L39;
                case 23: goto L36;
                case 24: goto L33;
                case 25: goto L24;
                default: goto L8;
            }
        L8:
            switch(r0) {
                case 54: goto L3c;
                case 55: goto L39;
                case 56: goto L36;
                case 57: goto L33;
                case 58: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r5
        Lc:
            boolean r0 = r5.isReference()
            if (r0 != 0) goto L23
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.RETURNADDRESS_VALUE
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L1b
            goto L23
        L1b:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            java.lang.String r2 = "an object reference or a return address"
            r0.<init>(r4, r1, r2, r5)
            throw r0
        L23:
            return r5
        L24:
            boolean r0 = r5.isReference()
            if (r0 == 0) goto L2b
            return r5
        L2b:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            java.lang.String r2 = "an object reference"
            r0.<init>(r4, r1, r2, r5)
            throw r0
        L33:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            goto L3e
        L36:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            goto L3e
        L39:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            goto L3e
        L3c:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
        L3e:
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L45
            return r5
        L45:
            org.objectweb.asm.tree.analysis.AnalyzerException r2 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r2.<init>(r4, r1, r0, r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.BasicVerifier.copyOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue):org.objectweb.asm.tree.analysis.BasicValue");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends BasicValue> list) throws AnalyzerException {
        int i2;
        String str;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            for (BasicValue basicValue : list) {
                BasicValue basicValue2 = BasicValue.INT_VALUE;
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
            }
        } else {
            int i3 = 0;
            if (opcode == 184 || opcode == 186) {
                i2 = 0;
            } else {
                Type objectType = Type.getObjectType(((MethodInsnNode) abstractInsnNode).owner);
                if (!isSubTypeOf(list.get(0), newValue(objectType))) {
                    throw new AnalyzerException(abstractInsnNode, "Method owner", newValue(objectType), list.get(0));
                }
                i2 = 1;
            }
            if (opcode == 186) {
                str = ((InvokeDynamicInsnNode) abstractInsnNode).desc;
            } else {
                str = ((MethodInsnNode) abstractInsnNode).desc;
            }
            Type[] argumentTypes = Type.getArgumentTypes(str);
            while (i2 < list.size()) {
                int i4 = i3 + 1;
                BasicValue newValue = newValue(argumentTypes[i3]);
                int i5 = i2 + 1;
                BasicValue basicValue3 = list.get(i2);
                if (!isSubTypeOf(basicValue3, newValue)) {
                    throw new AnalyzerException(abstractInsnNode, d.i("Argument ", i4), newValue, basicValue3);
                }
                i3 = i4;
                i2 = i5;
            }
        }
        return super.naryOperation(abstractInsnNode, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        if (!isSubTypeOf(basicValue, basicValue2)) {
            throw new AnalyzerException(abstractInsnNode, "Incompatible return type", basicValue2, basicValue);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        BasicValue newValue;
        BasicValue basicValue4;
        switch (abstractInsnNode.getOpcode()) {
            case Opcodes.IASTORE /* 79 */:
                newValue = newValue(Type.getType("[I"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case Opcodes.LASTORE /* 80 */:
                newValue = newValue(Type.getType("[J"));
                basicValue4 = BasicValue.LONG_VALUE;
                break;
            case Opcodes.FASTORE /* 81 */:
                newValue = newValue(Type.getType("[F"));
                basicValue4 = BasicValue.FLOAT_VALUE;
                break;
            case Opcodes.DASTORE /* 82 */:
                newValue = newValue(Type.getType("[D"));
                basicValue4 = BasicValue.DOUBLE_VALUE;
                break;
            case Opcodes.AASTORE /* 83 */:
                basicValue4 = BasicValue.REFERENCE_VALUE;
                newValue = basicValue;
                break;
            case Opcodes.BASTORE /* 84 */:
                if (isSubTypeOf(basicValue, newValue(Type.getType(InstrSupport.DATAFIELD_DESC)))) {
                    newValue = newValue(Type.getType(InstrSupport.DATAFIELD_DESC));
                } else {
                    newValue = newValue(Type.getType("[B"));
                }
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case Opcodes.CASTORE /* 85 */:
                newValue = newValue(Type.getType("[C"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case Opcodes.SASTORE /* 86 */:
                newValue = newValue(Type.getType("[S"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            default:
                throw new AssertionError();
        }
        if (isSubTypeOf(basicValue, newValue)) {
            BasicValue basicValue5 = BasicValue.INT_VALUE;
            if (basicValue5.equals(basicValue2)) {
                if (isSubTypeOf(basicValue3, basicValue4)) {
                    return null;
                }
                throw new AnalyzerException(abstractInsnNode, "Third argument", basicValue4, basicValue3);
            }
            throw new AnalyzerException(abstractInsnNode, "Second argument", basicValue5, basicValue2);
        }
        throw new AnalyzerException(abstractInsnNode, "First argument", "a " + newValue + " array reference", basicValue);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0018. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046 A[FALL_THROUGH] */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.objectweb.asm.tree.analysis.BasicValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r4, org.objectweb.asm.tree.analysis.BasicValue r5) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            r3 = this;
            int r0 = r4.getOpcode()
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 0
            if (r0 == r1) goto L6a
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 == r1) goto L5c
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 == r1) goto L49
            r1 = 199(0xc7, float:2.79E-43)
            if (r0 == r1) goto L49
            switch(r0) {
                case 116: goto L46;
                case 117: goto L43;
                case 118: goto L40;
                case 119: goto L3d;
                default: goto L18;
            }
        L18:
            switch(r0) {
                case 132: goto L46;
                case 133: goto L46;
                case 134: goto L46;
                case 135: goto L46;
                case 136: goto L43;
                case 137: goto L43;
                case 138: goto L43;
                case 139: goto L40;
                case 140: goto L40;
                case 141: goto L40;
                case 142: goto L3d;
                case 143: goto L3d;
                case 144: goto L3d;
                case 145: goto L46;
                case 146: goto L46;
                case 147: goto L46;
                default: goto L1b;
            }
        L1b:
            switch(r0) {
                case 153: goto L46;
                case 154: goto L46;
                case 155: goto L46;
                case 156: goto L46;
                case 157: goto L46;
                case 158: goto L46;
                default: goto L1e;
            }
        L1e:
            switch(r0) {
                case 170: goto L46;
                case 171: goto L46;
                case 172: goto L46;
                case 173: goto L43;
                case 174: goto L40;
                case 175: goto L3d;
                case 176: goto L49;
                default: goto L21;
            }
        L21:
            switch(r0) {
                case 188: goto L46;
                case 189: goto L46;
                case 190: goto L2a;
                case 191: goto L49;
                case 192: goto L49;
                case 193: goto L49;
                case 194: goto L49;
                case 195: goto L49;
                default: goto L24;
            }
        L24:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L2a:
            boolean r0 = r3.isArrayValue(r5)
            if (r0 == 0) goto L35
            org.objectweb.asm.tree.analysis.BasicValue r4 = super.unaryOperation(r4, r5)
            return r4
        L35:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            java.lang.String r1 = "an array reference"
            r0.<init>(r4, r2, r1, r5)
            throw r0
        L3d:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            goto L77
        L40:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            goto L77
        L43:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            goto L77
        L46:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            goto L77
        L49:
            boolean r0 = r5.isReference()
            if (r0 == 0) goto L54
            org.objectweb.asm.tree.analysis.BasicValue r4 = super.unaryOperation(r4, r5)
            return r4
        L54:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            java.lang.String r1 = "an object reference"
            r0.<init>(r4, r2, r1, r5)
            throw r0
        L5c:
            r0 = r4
            org.objectweb.asm.tree.FieldInsnNode r0 = (org.objectweb.asm.tree.FieldInsnNode) r0
            java.lang.String r0 = r0.owner
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r3.newValue(r0)
            goto L77
        L6a:
            r0 = r4
            org.objectweb.asm.tree.FieldInsnNode r0 = (org.objectweb.asm.tree.FieldInsnNode) r0
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r3.newValue(r0)
        L77:
            boolean r1 = r3.isSubTypeOf(r5, r0)
            if (r1 == 0) goto L82
            org.objectweb.asm.tree.analysis.BasicValue r4 = super.unaryOperation(r4, r5)
            return r4
        L82:
            org.objectweb.asm.tree.analysis.AnalyzerException r1 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1.<init>(r4, r2, r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.BasicVerifier.unaryOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue):org.objectweb.asm.tree.analysis.BasicValue");
    }

    public BasicVerifier(int i2) {
        super(i2);
    }
}
