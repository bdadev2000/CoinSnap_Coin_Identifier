package org.objectweb.asm;

import com.google.android.gms.common.api.Api;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SymbolTable {
    private int bootstrapMethodCount;
    private ByteVector bootstrapMethods;
    private String className;
    final ClassWriter classWriter;
    private ByteVector constantPool;
    private int constantPoolCount;
    private Entry[] entries;
    private int entryCount;
    private int majorVersion;
    private final ClassReader sourceClassReader;
    private int typeCount;
    private Entry[] typeTable;

    /* loaded from: classes3.dex */
    public static class Entry extends Symbol {
        final int hashCode;
        Entry next;

        public Entry(int i2, int i3, String str, String str2, String str3, long j2, int i4) {
            super(i2, i3, str, str2, str3, j2);
            this.hashCode = i4;
        }

        public Entry(int i2, int i3, String str, int i4) {
            super(i2, i3, null, null, str, 0L);
            this.hashCode = i4;
        }

        public Entry(int i2, int i3, String str, long j2, int i4) {
            super(i2, i3, null, null, str, j2);
            this.hashCode = i4;
        }

        public Entry(int i2, int i3, String str, String str2, int i4) {
            super(i2, i3, null, str, str2, 0L);
            this.hashCode = i4;
        }

        public Entry(int i2, int i3, long j2, int i4) {
            super(i2, i3, null, null, null, j2);
            this.hashCode = i4;
        }
    }

    public SymbolTable(ClassWriter classWriter) {
        this.classWriter = classWriter;
        this.sourceClassReader = null;
        this.entries = new Entry[256];
        this.constantPoolCount = 1;
        this.constantPool = new ByteVector();
    }

    private void add(Entry entry) {
        this.entryCount++;
        int i2 = entry.hashCode;
        Entry[] entryArr = this.entries;
        int length = i2 % entryArr.length;
        entry.next = entryArr[length];
        entryArr[length] = entry;
    }

    private Symbol addConstantDynamicOrInvokeDynamicReference(int i2, String str, String str2, int i3) {
        int hash = hash(i2, str, str2, i3);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == i2 && entry.hashCode == hash && entry.data == i3 && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry;
            }
        }
        this.constantPool.put122(i2, i3, addConstantNameAndType(str, str2));
        int i4 = this.constantPoolCount;
        this.constantPoolCount = i4 + 1;
        return put(new Entry(i4, i2, null, str, str2, i3, hash));
    }

    private Symbol addConstantIntegerOrFloat(int i2, int i3) {
        int hash = hash(i2, i3);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == i2 && entry.hashCode == hash && entry.data == i3) {
                return entry;
            }
        }
        this.constantPool.putByte(i2).putInt(i3);
        int i4 = this.constantPoolCount;
        this.constantPoolCount = i4 + 1;
        return put(new Entry(i4, i2, i3, hash));
    }

    private Symbol addConstantLongOrDouble(int i2, long j2) {
        int hash = hash(i2, j2);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == i2 && entry.hashCode == hash && entry.data == j2) {
                return entry;
            }
        }
        int i3 = this.constantPoolCount;
        this.constantPool.putByte(i2).putLong(j2);
        this.constantPoolCount += 2;
        return put(new Entry(i3, i2, j2, hash));
    }

    private Entry addConstantMemberReference(int i2, String str, String str2, String str3) {
        int hash = hash(i2, str, str2, str3);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == i2 && entry.hashCode == hash && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        this.constantPool.put122(i2, addConstantClass(str).index, addConstantNameAndType(str2, str3));
        int i3 = this.constantPoolCount;
        this.constantPoolCount = i3 + 1;
        return put(new Entry(i3, i2, str, str2, str3, 0L, hash));
    }

    private Symbol addConstantUtf8Reference(int i2, String str) {
        int hash = hash(i2, str);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == i2 && entry.hashCode == hash && entry.value.equals(str)) {
                return entry;
            }
        }
        this.constantPool.put12(i2, addConstantUtf8(str));
        int i3 = this.constantPoolCount;
        this.constantPoolCount = i3 + 1;
        return put(new Entry(i3, i2, str, hash));
    }

    private int addTypeInternal(Entry entry) {
        if (this.typeTable == null) {
            this.typeTable = new Entry[16];
        }
        int i2 = this.typeCount;
        Entry[] entryArr = this.typeTable;
        if (i2 == entryArr.length) {
            Entry[] entryArr2 = new Entry[entryArr.length * 2];
            System.arraycopy(entryArr, 0, entryArr2, 0, entryArr.length);
            this.typeTable = entryArr2;
        }
        Entry[] entryArr3 = this.typeTable;
        int i3 = this.typeCount;
        this.typeCount = i3 + 1;
        entryArr3[i3] = entry;
        return put(entry).index;
    }

    private void copyBootstrapMethods(ClassReader classReader, char[] cArr) {
        byte[] bArr = classReader.classFileBuffer;
        int firstAttributeOffset = classReader.getFirstAttributeOffset();
        int readUnsignedShort = classReader.readUnsignedShort(firstAttributeOffset - 2);
        while (true) {
            if (readUnsignedShort <= 0) {
                break;
            }
            if ("BootstrapMethods".equals(classReader.readUTF8(firstAttributeOffset, cArr))) {
                this.bootstrapMethodCount = classReader.readUnsignedShort(firstAttributeOffset + 6);
                break;
            } else {
                firstAttributeOffset += classReader.readInt(firstAttributeOffset + 2) + 6;
                readUnsignedShort--;
            }
        }
        if (this.bootstrapMethodCount > 0) {
            int i2 = firstAttributeOffset + 8;
            int readInt = classReader.readInt(firstAttributeOffset + 2) - 2;
            ByteVector byteVector = new ByteVector(readInt);
            this.bootstrapMethods = byteVector;
            byteVector.putByteArray(bArr, i2, readInt);
            int i3 = i2;
            for (int i4 = 0; i4 < this.bootstrapMethodCount; i4++) {
                int i5 = i3 - i2;
                int readUnsignedShort2 = classReader.readUnsignedShort(i3);
                int readUnsignedShort3 = classReader.readUnsignedShort(i3 + 2);
                i3 += 4;
                int hashCode = classReader.readConst(readUnsignedShort2, cArr).hashCode();
                while (true) {
                    int i6 = readUnsignedShort3 - 1;
                    if (readUnsignedShort3 > 0) {
                        int readUnsignedShort4 = classReader.readUnsignedShort(i3);
                        i3 += 2;
                        hashCode ^= classReader.readConst(readUnsignedShort4, cArr).hashCode();
                        readUnsignedShort3 = i6;
                    }
                }
                add(new Entry(i4, 64, i5, hashCode & Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
        }
    }

    private Entry get(int i2) {
        Entry[] entryArr = this.entries;
        return entryArr[i2 % entryArr.length];
    }

    private static int hash(int i2, int i3) {
        return (i2 + i3) & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private Entry put(Entry entry) {
        int i2 = this.entryCount;
        Entry[] entryArr = this.entries;
        if (i2 > (entryArr.length * 3) / 4) {
            int length = entryArr.length;
            int i3 = (length * 2) + 1;
            Entry[] entryArr2 = new Entry[i3];
            for (int i4 = length - 1; i4 >= 0; i4--) {
                Entry entry2 = this.entries[i4];
                while (entry2 != null) {
                    int i5 = entry2.hashCode % i3;
                    Entry entry3 = entry2.next;
                    entry2.next = entryArr2[i5];
                    entryArr2[i5] = entry2;
                    entry2 = entry3;
                }
            }
            this.entries = entryArr2;
        }
        this.entryCount++;
        int i6 = entry.hashCode;
        Entry[] entryArr3 = this.entries;
        int length2 = i6 % entryArr3.length;
        entry.next = entryArr3[length2];
        entryArr3[length2] = entry;
        return entry;
    }

    public Symbol addBootstrapMethod(Handle handle, Object... objArr) {
        ByteVector byteVector = this.bootstrapMethods;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.bootstrapMethods = byteVector;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = addConstant(objArr[i2]).index;
        }
        int i3 = byteVector.length;
        byteVector.putShort(addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface()).index);
        byteVector.putShort(length);
        for (int i4 = 0; i4 < length; i4++) {
            byteVector.putShort(iArr[i4]);
        }
        int i5 = byteVector.length - i3;
        int hashCode = handle.hashCode();
        for (Object obj : objArr) {
            hashCode ^= obj.hashCode();
        }
        return addBootstrapMethod(i3, i5, hashCode & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public Symbol addConstant(Object obj) {
        if (obj instanceof Integer) {
            return addConstantInteger(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return addConstantInteger(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return addConstantInteger(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return addConstantInteger(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return addConstantInteger(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return addConstantFloat(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return addConstantLong(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return addConstantDouble(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return addConstantString((String) obj);
        }
        if (obj instanceof Type) {
            Type type = (Type) obj;
            int sort = type.getSort();
            return sort == 10 ? addConstantClass(type.getInternalName()) : sort == 11 ? addConstantMethodType(type.getDescriptor()) : addConstantClass(type.getDescriptor());
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface());
        }
        if (obj instanceof ConstantDynamic) {
            ConstantDynamic constantDynamic = (ConstantDynamic) obj;
            return addConstantDynamic(constantDynamic.getName(), constantDynamic.getDescriptor(), constantDynamic.getBootstrapMethod(), constantDynamic.getBootstrapMethodArgumentsUnsafe());
        }
        throw new IllegalArgumentException("value " + obj);
    }

    public Symbol addConstantClass(String str) {
        return addConstantUtf8Reference(7, str);
    }

    public Symbol addConstantDouble(double d) {
        return addConstantLongOrDouble(6, Double.doubleToRawLongBits(d));
    }

    public Symbol addConstantDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(17, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    public Symbol addConstantFieldref(String str, String str2, String str3) {
        return addConstantMemberReference(9, str, str2, str3);
    }

    public Symbol addConstantFloat(float f2) {
        return addConstantIntegerOrFloat(4, Float.floatToRawIntBits(f2));
    }

    public Symbol addConstantInteger(int i2) {
        return addConstantIntegerOrFloat(3, i2);
    }

    public Symbol addConstantInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(18, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    public Symbol addConstantLong(long j2) {
        return addConstantLongOrDouble(5, j2);
    }

    public Symbol addConstantMethodHandle(int i2, String str, String str2, String str3, boolean z2) {
        int hash = hash(15, str, str2, str3, i2);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == 15 && entry.hashCode == hash && entry.data == i2 && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        if (i2 <= 4) {
            this.constantPool.put112(15, i2, addConstantFieldref(str, str2, str3).index);
        } else {
            this.constantPool.put112(15, i2, addConstantMethodref(str, str2, str3, z2).index);
        }
        int i3 = this.constantPoolCount;
        this.constantPoolCount = i3 + 1;
        return put(new Entry(i3, 15, str, str2, str3, i2, hash));
    }

    public Symbol addConstantMethodType(String str) {
        return addConstantUtf8Reference(16, str);
    }

    public Symbol addConstantMethodref(String str, String str2, String str3, boolean z2) {
        return addConstantMemberReference(z2 ? 11 : 10, str, str2, str3);
    }

    public Symbol addConstantModule(String str) {
        return addConstantUtf8Reference(19, str);
    }

    public int addConstantNameAndType(String str, String str2) {
        int hash = hash(12, str, str2);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == 12 && entry.hashCode == hash && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry.index;
            }
        }
        this.constantPool.put122(12, addConstantUtf8(str), addConstantUtf8(str2));
        int i2 = this.constantPoolCount;
        this.constantPoolCount = i2 + 1;
        return put(new Entry(i2, 12, str, str2, hash)).index;
    }

    public Symbol addConstantPackage(String str) {
        return addConstantUtf8Reference(20, str);
    }

    public Symbol addConstantString(String str) {
        return addConstantUtf8Reference(8, str);
    }

    public int addConstantUtf8(String str) {
        int hash = hash(1, str);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == 1 && entry.hashCode == hash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        this.constantPool.putByte(1).putUTF8(str);
        int i2 = this.constantPoolCount;
        this.constantPoolCount = i2 + 1;
        return put(new Entry(i2, 1, str, hash)).index;
    }

    public int addMergedType(int i2, int i3) {
        long j2;
        long j3;
        if (i2 < i3) {
            j2 = i2;
            j3 = i3;
        } else {
            j2 = i3;
            j3 = i2;
        }
        long j4 = j2 | (j3 << 32);
        int hash = hash(130, i2 + i3);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == 130 && entry.hashCode == hash && entry.data == j4) {
                return entry.info;
            }
        }
        Entry[] entryArr = this.typeTable;
        int addType = addType(this.classWriter.getCommonSuperClass(entryArr[i2].value, entryArr[i3].value));
        put(new Entry(this.typeCount, 130, j4, hash)).info = addType;
        return addType;
    }

    public int addType(String str) {
        int hash = hash(128, str);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == 128 && entry.hashCode == hash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addTypeInternal(new Entry(this.typeCount, 128, str, hash));
    }

    public int addUninitializedType(String str, int i2) {
        int hash = hash(Opcodes.LOR, str, i2);
        for (Entry entry = get(hash); entry != null; entry = entry.next) {
            if (entry.tag == 129 && entry.hashCode == hash && entry.data == i2 && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addTypeInternal(new Entry(this.typeCount, Opcodes.LOR, str, i2, hash));
    }

    public int computeBootstrapMethodsSize() {
        if (this.bootstrapMethods == null) {
            return 0;
        }
        addConstantUtf8("BootstrapMethods");
        return this.bootstrapMethods.length + 8;
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }

    public int getConstantPoolLength() {
        return this.constantPool.length;
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public ClassReader getSource() {
        return this.sourceClassReader;
    }

    public Symbol getType(int i2) {
        return this.typeTable[i2];
    }

    public void putBootstrapMethods(ByteVector byteVector) {
        if (this.bootstrapMethods != null) {
            ByteVector putShort = byteVector.putShort(addConstantUtf8("BootstrapMethods")).putInt(this.bootstrapMethods.length + 2).putShort(this.bootstrapMethodCount);
            ByteVector byteVector2 = this.bootstrapMethods;
            putShort.putByteArray(byteVector2.data, 0, byteVector2.length);
        }
    }

    public void putConstantPool(ByteVector byteVector) {
        ByteVector putShort = byteVector.putShort(this.constantPoolCount);
        ByteVector byteVector2 = this.constantPool;
        putShort.putByteArray(byteVector2.data, 0, byteVector2.length);
    }

    public int setMajorVersionAndClassName(int i2, String str) {
        this.majorVersion = i2;
        this.className = str;
        return addConstantClass(str).index;
    }

    private static int hash(int i2, long j2) {
        return (i2 + ((int) j2) + ((int) (j2 >>> 32))) & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public SymbolTable(ClassWriter classWriter, ClassReader classReader) {
        this.classWriter = classWriter;
        this.sourceClassReader = classReader;
        byte[] bArr = classReader.classFileBuffer;
        int item = classReader.getItem(1) - 1;
        int i2 = classReader.header - item;
        this.constantPoolCount = classReader.getItemCount();
        ByteVector byteVector = new ByteVector(i2);
        this.constantPool = byteVector;
        byteVector.putByteArray(bArr, item, i2);
        this.entries = new Entry[this.constantPoolCount * 2];
        char[] cArr = new char[classReader.getMaxStringLength()];
        boolean z2 = false;
        int i3 = 1;
        while (i3 < this.constantPoolCount) {
            int item2 = classReader.getItem(i3);
            byte b2 = bArr[item2 - 1];
            switch (b2) {
                case 1:
                    addConstantUtf8(i3, classReader.readUtf(i3, cArr));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    addConstantIntegerOrFloat(i3, b2, classReader.readInt(item2));
                    break;
                case 5:
                case 6:
                    addConstantLongOrDouble(i3, b2, classReader.readLong(item2));
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    addConstantUtf8Reference(i3, b2, classReader.readUTF8(item2, cArr));
                    break;
                case 9:
                case 10:
                case 11:
                    int item3 = classReader.getItem(classReader.readUnsignedShort(item2 + 2));
                    addConstantMemberReference(i3, b2, classReader.readClass(item2, cArr), classReader.readUTF8(item3, cArr), classReader.readUTF8(item3 + 2, cArr));
                    break;
                case 12:
                    addConstantNameAndType(i3, classReader.readUTF8(item2, cArr), classReader.readUTF8(item2 + 2, cArr));
                    break;
                case 15:
                    int item4 = classReader.getItem(classReader.readUnsignedShort(item2 + 1));
                    int item5 = classReader.getItem(classReader.readUnsignedShort(item4 + 2));
                    addConstantMethodHandle(i3, classReader.readByte(item2), classReader.readClass(item4, cArr), classReader.readUTF8(item5, cArr), classReader.readUTF8(item5 + 2, cArr));
                    break;
                case 17:
                case 18:
                    int item6 = classReader.getItem(classReader.readUnsignedShort(item2 + 2));
                    addConstantDynamicOrInvokeDynamicReference(b2, i3, classReader.readUTF8(item6, cArr), classReader.readUTF8(item6 + 2, cArr), classReader.readUnsignedShort(item2));
                    z2 = true;
                    break;
            }
            i3 += (b2 == 5 || b2 == 6) ? 2 : 1;
        }
        if (z2) {
            copyBootstrapMethods(classReader, cArr);
        }
    }

    private static int hash(int i2, String str) {
        return Integer.MAX_VALUE & (str.hashCode() + i2);
    }

    private static int hash(int i2, String str, int i3) {
        return Integer.MAX_VALUE & (str.hashCode() + i2 + i3);
    }

    private static int hash(int i2, String str, String str2) {
        return Integer.MAX_VALUE & ((str2.hashCode() * str.hashCode()) + i2);
    }

    private static int hash(int i2, String str, String str2, int i3) {
        return Integer.MAX_VALUE & (((i3 + 1) * str2.hashCode() * str.hashCode()) + i2);
    }

    private void addConstantIntegerOrFloat(int i2, int i3, int i4) {
        add(new Entry(i2, i3, i4, hash(i3, i4)));
    }

    private void addConstantLongOrDouble(int i2, int i3, long j2) {
        add(new Entry(i2, i3, j2, hash(i3, j2)));
    }

    private void addConstantUtf8Reference(int i2, int i3, String str) {
        add(new Entry(i2, i3, str, hash(i3, str)));
    }

    private static int hash(int i2, String str, String str2, String str3) {
        return Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i2);
    }

    private static int hash(int i2, String str, String str2, String str3, int i3) {
        return Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode() * i3) + i2);
    }

    private void addConstantDynamicOrInvokeDynamicReference(int i2, int i3, String str, String str2, int i4) {
        add(new Entry(i3, i2, null, str, str2, i4, hash(i2, str, str2, i4)));
    }

    private void addConstantUtf8(int i2, String str) {
        add(new Entry(i2, 1, str, hash(1, str)));
    }

    private void addConstantNameAndType(int i2, String str, String str2) {
        add(new Entry(i2, 12, str, str2, hash(12, str, str2)));
    }

    private void addConstantMemberReference(int i2, int i3, String str, String str2, String str3) {
        add(new Entry(i2, i3, str, str2, str3, 0L, hash(i3, str, str2, str3)));
    }

    private void addConstantMethodHandle(int i2, int i3, String str, String str2, String str3) {
        add(new Entry(i2, 15, str, str2, str3, i3, hash(15, str, str2, str3, i3)));
    }

    private Symbol addBootstrapMethod(int i2, int i3, int i4) {
        byte[] bArr = this.bootstrapMethods.data;
        for (Entry entry = get(i4); entry != null; entry = entry.next) {
            if (entry.tag == 64 && entry.hashCode == i4) {
                int i5 = (int) entry.data;
                for (int i6 = 0; i6 < i3; i6++) {
                    if (bArr[i2 + i6] != bArr[i5 + i6]) {
                        break;
                    }
                }
                this.bootstrapMethods.length = i2;
                return entry;
            }
        }
        int i7 = this.bootstrapMethodCount;
        this.bootstrapMethodCount = i7 + 1;
        return put(new Entry(i7, 64, i2, i4));
    }
}
