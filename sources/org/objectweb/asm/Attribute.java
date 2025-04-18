package org.objectweb.asm;

/* loaded from: classes3.dex */
public class Attribute {
    private byte[] content;
    Attribute nextAttribute;
    public final String type;

    /* loaded from: classes3.dex */
    public static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private Attribute[] data = new Attribute[6];
        private int size;

        private void add(Attribute attribute) {
            int i2 = this.size;
            Attribute[] attributeArr = this.data;
            if (i2 >= attributeArr.length) {
                Attribute[] attributeArr2 = new Attribute[attributeArr.length + 6];
                System.arraycopy(attributeArr, 0, attributeArr2, 0, i2);
                this.data = attributeArr2;
            }
            Attribute[] attributeArr3 = this.data;
            int i3 = this.size;
            this.size = i3 + 1;
            attributeArr3[i3] = attribute;
        }

        private boolean contains(Attribute attribute) {
            for (int i2 = 0; i2 < this.size; i2++) {
                if (this.data[i2].type.equals(attribute.type)) {
                    return true;
                }
            }
            return false;
        }

        public void addAttributes(Attribute attribute) {
            while (attribute != null) {
                if (!contains(attribute)) {
                    add(attribute);
                }
                attribute = attribute.nextAttribute;
            }
        }

        public Attribute[] toArray() {
            int i2 = this.size;
            Attribute[] attributeArr = new Attribute[i2];
            System.arraycopy(this.data, 0, attributeArr, 0, i2);
            return attributeArr;
        }
    }

    public Attribute(String str) {
        this.type = str;
    }

    public final int computeAttributesSize(SymbolTable symbolTable) {
        return computeAttributesSize(symbolTable, null, 0, -1, -1);
    }

    public final int getAttributeCount() {
        int i2 = 0;
        for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            i2++;
        }
        return i2;
    }

    public Label[] getLabels() {
        return new Label[0];
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    public final void putAttributes(SymbolTable symbolTable, ByteVector byteVector) {
        putAttributes(symbolTable, null, 0, -1, -1, byteVector);
    }

    public Attribute read(ClassReader classReader, int i2, int i3, char[] cArr, int i4, Label[] labelArr) {
        Attribute attribute = new Attribute(this.type);
        byte[] bArr = new byte[i3];
        attribute.content = bArr;
        System.arraycopy(classReader.classFileBuffer, i2, bArr, 0, i3);
        return attribute;
    }

    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i2, int i3, int i4) {
        return new ByteVector(this.content);
    }

    public final int computeAttributesSize(SymbolTable symbolTable, byte[] bArr, int i2, int i3, int i4) {
        ClassWriter classWriter = symbolTable.classWriter;
        int i5 = 0;
        for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            symbolTable.addConstantUtf8(attribute.type);
            i5 += attribute.write(classWriter, bArr, i2, i3, i4).length + 6;
        }
        return i5;
    }

    public final void putAttributes(SymbolTable symbolTable, byte[] bArr, int i2, int i3, int i4, ByteVector byteVector) {
        ClassWriter classWriter = symbolTable.classWriter;
        for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            ByteVector write = attribute.write(classWriter, bArr, i2, i3, i4);
            byteVector.putShort(symbolTable.addConstantUtf8(attribute.type)).putInt(write.length);
            byteVector.putByteArray(write.data, 0, write.length);
        }
    }

    public static int computeAttributesSize(SymbolTable symbolTable, int i2, int i3) {
        int i4;
        if ((i2 & 4096) == 0 || symbolTable.getMajorVersion() >= 49) {
            i4 = 0;
        } else {
            symbolTable.addConstantUtf8("Synthetic");
            i4 = 6;
        }
        if (i3 != 0) {
            symbolTable.addConstantUtf8("Signature");
            i4 += 8;
        }
        if ((i2 & Opcodes.ACC_DEPRECATED) == 0) {
            return i4;
        }
        symbolTable.addConstantUtf8("Deprecated");
        return i4 + 6;
    }

    public static void putAttributes(SymbolTable symbolTable, int i2, int i3, ByteVector byteVector) {
        if ((i2 & 4096) != 0 && symbolTable.getMajorVersion() < 49) {
            byteVector.putShort(symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (i3 != 0) {
            byteVector.putShort(symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(i3);
        }
        if ((i2 & Opcodes.ACC_DEPRECATED) != 0) {
            byteVector.putShort(symbolTable.addConstantUtf8("Deprecated")).putInt(0);
        }
    }
}
