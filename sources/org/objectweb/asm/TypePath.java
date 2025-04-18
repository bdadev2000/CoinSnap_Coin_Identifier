package org.objectweb.asm;

import androidx.compose.foundation.text.input.a;

/* loaded from: classes4.dex */
public final class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;
    private final byte[] typePathContainer;
    private final int typePathOffset;

    public TypePath(byte[] bArr, int i2) {
        this.typePathContainer = bArr;
        this.typePathOffset = i2;
    }

    public static TypePath fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        ByteVector byteVector = new ByteVector(length);
        byteVector.putByte(0);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == '[') {
                byteVector.put11(0, 0);
            } else if (charAt == '.') {
                byteVector.put11(1, 0);
            } else if (charAt == '*') {
                byteVector.put11(2, 0);
            } else {
                if (charAt < '0' || charAt > '9') {
                    throw new IllegalArgumentException();
                }
                int i4 = charAt - '0';
                while (i3 < length) {
                    int i5 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    if (charAt2 >= '0' && charAt2 <= '9') {
                        i4 = ((i4 * 10) + charAt2) - 48;
                        i3 = i5;
                    } else {
                        if (charAt2 != ';') {
                            throw new IllegalArgumentException();
                        }
                        i3 = i5;
                        byteVector.put11(3, i4);
                    }
                }
                byteVector.put11(3, i4);
            }
            i2 = i3;
        }
        byte[] bArr = byteVector.data;
        bArr[0] = (byte) (byteVector.length / 2);
        return new TypePath(bArr, 0);
    }

    public static void put(TypePath typePath, ByteVector byteVector) {
        if (typePath == null) {
            byteVector.putByte(0);
            return;
        }
        byte[] bArr = typePath.typePathContainer;
        int i2 = typePath.typePathOffset;
        byteVector.putByteArray(bArr, i2, (bArr[i2] * 2) + 1);
    }

    public int getLength() {
        return this.typePathContainer[this.typePathOffset];
    }

    public int getStep(int i2) {
        return this.typePathContainer[a.a(i2, 2, this.typePathOffset, 1)];
    }

    public int getStepArgument(int i2) {
        return this.typePathContainer[a.a(i2, 2, this.typePathOffset, 2)];
    }

    public String toString() {
        int length = getLength();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i2 = 0; i2 < length; i2++) {
            int step = getStep(i2);
            if (step == 0) {
                sb.append('[');
            } else if (step == 1) {
                sb.append('.');
            } else if (step == 2) {
                sb.append('*');
            } else {
                if (step != 3) {
                    throw new AssertionError();
                }
                sb.append(getStepArgument(i2));
                sb.append(';');
            }
        }
        return sb.toString();
    }
}
