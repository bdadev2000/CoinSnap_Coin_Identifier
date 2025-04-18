package org.objectweb.asm;

import okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
public class TypeReference {
    public static final int CAST = 71;
    public static final int CLASS_EXTENDS = 16;
    public static final int CLASS_TYPE_PARAMETER = 0;
    public static final int CLASS_TYPE_PARAMETER_BOUND = 17;
    public static final int CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT = 72;
    public static final int CONSTRUCTOR_REFERENCE = 69;
    public static final int CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT = 74;
    public static final int EXCEPTION_PARAMETER = 66;
    public static final int FIELD = 19;
    public static final int INSTANCEOF = 67;
    public static final int LOCAL_VARIABLE = 64;
    public static final int METHOD_FORMAL_PARAMETER = 22;
    public static final int METHOD_INVOCATION_TYPE_ARGUMENT = 73;
    public static final int METHOD_RECEIVER = 21;
    public static final int METHOD_REFERENCE = 70;
    public static final int METHOD_REFERENCE_TYPE_ARGUMENT = 75;
    public static final int METHOD_RETURN = 20;
    public static final int METHOD_TYPE_PARAMETER = 1;
    public static final int METHOD_TYPE_PARAMETER_BOUND = 18;
    public static final int NEW = 68;
    public static final int RESOURCE_VARIABLE = 65;
    public static final int THROWS = 23;
    private final int targetTypeAndInfo;

    public TypeReference(int i2) {
        this.targetTypeAndInfo = i2;
    }

    public static TypeReference newExceptionReference(int i2) {
        return new TypeReference((i2 << 8) | 385875968);
    }

    public static TypeReference newFormalParameterReference(int i2) {
        return new TypeReference((i2 << 16) | 369098752);
    }

    public static TypeReference newSuperTypeReference(int i2) {
        return new TypeReference(((i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 8) | 268435456);
    }

    public static TypeReference newTryCatchReference(int i2) {
        return new TypeReference((i2 << 8) | 1107296256);
    }

    public static TypeReference newTypeArgumentReference(int i2, int i3) {
        return new TypeReference((i2 << 24) | i3);
    }

    public static TypeReference newTypeParameterBoundReference(int i2, int i3, int i4) {
        return new TypeReference((i2 << 24) | (i3 << 16) | (i4 << 8));
    }

    public static TypeReference newTypeParameterReference(int i2, int i3) {
        return new TypeReference((i2 << 24) | (i3 << 16));
    }

    public static TypeReference newTypeReference(int i2) {
        return new TypeReference(i2 << 24);
    }

    public static void putTarget(int i2, ByteVector byteVector) {
        int i3 = i2 >>> 24;
        if (i3 != 0 && i3 != 1) {
            switch (i3) {
                case 16:
                case 17:
                case 18:
                case 23:
                    break;
                case 19:
                case 20:
                case 21:
                    byteVector.putByte(i3);
                    return;
                case 22:
                    break;
                default:
                    switch (i3) {
                        case EXCEPTION_PARAMETER /* 66 */:
                        case INSTANCEOF /* 67 */:
                        case NEW /* 68 */:
                        case CONSTRUCTOR_REFERENCE /* 69 */:
                        case METHOD_REFERENCE /* 70 */:
                            break;
                        case CAST /* 71 */:
                        case CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                        case METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                        case CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                        case METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                            byteVector.putInt(i2);
                            return;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
            byteVector.put12(i3, (i2 & 16776960) >> 8);
            return;
        }
        byteVector.putShort(i2 >>> 16);
    }

    public int getExceptionIndex() {
        return (this.targetTypeAndInfo & 16776960) >> 8;
    }

    public int getFormalParameterIndex() {
        return (this.targetTypeAndInfo & 16711680) >> 16;
    }

    public int getSort() {
        return this.targetTypeAndInfo >>> 24;
    }

    public int getSuperTypeIndex() {
        return (short) ((this.targetTypeAndInfo & 16776960) >> 8);
    }

    public int getTryCatchBlockIndex() {
        return (this.targetTypeAndInfo & 16776960) >> 8;
    }

    public int getTypeArgumentIndex() {
        return this.targetTypeAndInfo & 255;
    }

    public int getTypeParameterBoundIndex() {
        return (this.targetTypeAndInfo & 65280) >> 8;
    }

    public int getTypeParameterIndex() {
        return (this.targetTypeAndInfo & 16711680) >> 16;
    }

    public int getValue() {
        return this.targetTypeAndInfo;
    }
}
