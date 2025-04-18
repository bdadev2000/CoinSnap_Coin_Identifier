package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

/* loaded from: classes3.dex */
public final class ModuleHashesAttribute extends Attribute {
    public String algorithm;
    public List<byte[]> hashes;
    public List<String> modules;

    public ModuleHashesAttribute(String str, List<String> list, List<byte[]> list2) {
        super("ModuleHashes");
        this.algorithm = str;
        this.modules = list;
        this.hashes = list2;
    }

    @Override // org.objectweb.asm.Attribute
    public Attribute read(ClassReader classReader, int i2, int i3, char[] cArr, int i4, Label[] labelArr) {
        String readUTF8 = classReader.readUTF8(i2, cArr);
        int readUnsignedShort = classReader.readUnsignedShort(i2 + 2);
        int i5 = i2 + 4;
        ArrayList arrayList = new ArrayList(readUnsignedShort);
        ArrayList arrayList2 = new ArrayList(readUnsignedShort);
        for (int i6 = 0; i6 < readUnsignedShort; i6++) {
            arrayList.add(classReader.readModule(i5, cArr));
            int readUnsignedShort2 = classReader.readUnsignedShort(i5 + 2);
            i5 += 4;
            byte[] bArr = new byte[readUnsignedShort2];
            for (int i7 = 0; i7 < readUnsignedShort2; i7++) {
                bArr[i7] = (byte) classReader.readByte(i5);
                i5++;
            }
            arrayList2.add(bArr);
        }
        return new ModuleHashesAttribute(readUTF8, arrayList, arrayList2);
    }

    @Override // org.objectweb.asm.Attribute
    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i2, int i3, int i4) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(classWriter.newUTF8(this.algorithm));
        List<String> list = this.modules;
        if (list == null) {
            byteVector.putShort(0);
        } else {
            int size = list.size();
            byteVector.putShort(size);
            for (int i5 = 0; i5 < size; i5++) {
                String str = this.modules.get(i5);
                byte[] bArr2 = this.hashes.get(i5);
                byteVector.putShort(classWriter.newModule(str)).putShort(bArr2.length).putByteArray(bArr2, 0, bArr2.length);
            }
        }
        return byteVector;
    }

    public ModuleHashesAttribute() {
        this(null, null, null);
    }
}
