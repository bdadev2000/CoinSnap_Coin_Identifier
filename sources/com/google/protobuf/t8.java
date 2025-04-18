package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class t8 {
    private static final t8 DEFAULT_INSTANCE = new t8(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private t8() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i10) {
        int[] iArr = this.tags;
        if (i10 > iArr.length) {
            int i11 = this.count;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i10);
            this.objects = Arrays.copyOf(this.objects, i10);
        }
    }

    public static t8 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private t8 mergeFrom(r0 r0Var) throws IOException {
        int readTag;
        do {
            readTag = r0Var.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, r0Var));
        return this;
    }

    public static t8 mutableCopyOf(t8 t8Var, t8 t8Var2) {
        int i10 = t8Var.count + t8Var2.count;
        int[] copyOf = Arrays.copyOf(t8Var.tags, i10);
        System.arraycopy(t8Var2.tags, 0, copyOf, t8Var.count, t8Var2.count);
        Object[] copyOf2 = Arrays.copyOf(t8Var.objects, i10);
        System.arraycopy(t8Var2.objects, 0, copyOf2, t8Var.count, t8Var2.count);
        return new t8(i10, copyOf, copyOf2, true);
    }

    public static t8 newInstance() {
        return new t8();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i10, Object obj, ba baVar) throws IOException {
        int tagFieldNumber = z9.getTagFieldNumber(i10);
        int tagWireType = z9.getTagWireType(i10);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            ((f1) baVar).writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(h4.invalidWireType());
                    }
                    f1 f1Var = (f1) baVar;
                    if (f1Var.fieldOrder() == aa.ASCENDING) {
                        f1Var.writeStartGroup(tagFieldNumber);
                        ((t8) obj).writeTo(f1Var);
                        f1Var.writeEndGroup(tagFieldNumber);
                        return;
                    } else {
                        f1Var.writeEndGroup(tagFieldNumber);
                        ((t8) obj).writeTo(f1Var);
                        f1Var.writeStartGroup(tagFieldNumber);
                        return;
                    }
                }
                ((f1) baVar).writeBytes(tagFieldNumber, (h0) obj);
                return;
            }
            ((f1) baVar).writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        ((f1) baVar).writeInt64(tagFieldNumber, ((Long) obj).longValue());
    }

    public void checkMutable() {
        if (this.isMutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        int i10 = this.count;
        if (i10 == t8Var.count && tagsEquals(this.tags, t8Var.tags, i10) && objectsEquals(this.objects, t8Var.objects, this.count)) {
            return true;
        }
        return false;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i10 = this.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.count; i12++) {
            int i13 = this.tags[i12];
            int tagFieldNumber = z9.getTagFieldNumber(i13);
            int tagWireType = z9.getTagWireType(i13);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = d1.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i12]).intValue());
                            } else {
                                throw new IllegalStateException(h4.invalidWireType());
                            }
                        } else {
                            i11 = ((t8) this.objects[i12]).getSerializedSize() + (d1.computeTagSize(tagFieldNumber) * 2) + i11;
                        }
                    } else {
                        computeUInt64Size = d1.computeBytesSize(tagFieldNumber, (h0) this.objects[i12]);
                    }
                } else {
                    computeUInt64Size = d1.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i12]).longValue());
                }
            } else {
                computeUInt64Size = d1.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i12]).longValue());
            }
            i11 = computeUInt64Size + i11;
        }
        this.memoizedSerializedSize = i11;
        return i11;
    }

    public int getSerializedSizeAsMessageSet() {
        int i10 = this.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.count; i12++) {
            i11 += d1.computeRawMessageSetExtensionSize(z9.getTagFieldNumber(this.tags[i12]), (h0) this.objects[i12]);
        }
        this.memoizedSerializedSize = i11;
        return i11;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean mergeFieldFrom(int i10, r0 r0Var) throws IOException {
        checkMutable();
        int tagFieldNumber = z9.getTagFieldNumber(i10);
        int tagWireType = z9.getTagWireType(i10);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                storeField(i10, Integer.valueOf(r0Var.readFixed32()));
                                return true;
                            }
                            throw h4.invalidWireType();
                        }
                        return false;
                    }
                    t8 t8Var = new t8();
                    t8Var.mergeFrom(r0Var);
                    r0Var.checkLastTagWas(z9.makeTag(tagFieldNumber, 4));
                    storeField(i10, t8Var);
                    return true;
                }
                storeField(i10, r0Var.readBytes());
                return true;
            }
            storeField(i10, Long.valueOf(r0Var.readFixed64()));
            return true;
        }
        storeField(i10, Long.valueOf(r0Var.readInt64()));
        return true;
    }

    public t8 mergeLengthDelimitedField(int i10, h0 h0Var) {
        checkMutable();
        if (i10 != 0) {
            storeField(z9.makeTag(i10, 2), h0Var);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public t8 mergeVarintField(int i10, int i11) {
        checkMutable();
        if (i10 != 0) {
            storeField(z9.makeTag(i10, 0), Long.valueOf(i11));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void printWithIndent(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.count; i11++) {
            q5.printField(sb2, i10, String.valueOf(z9.getTagFieldNumber(this.tags[i11])), this.objects[i11]);
        }
    }

    public void storeField(int i10, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i11 = this.count;
        iArr[i11] = i10;
        this.objects[i11] = obj;
        this.count = i11 + 1;
    }

    public void writeAsMessageSetTo(d1 d1Var) throws IOException {
        for (int i10 = 0; i10 < this.count; i10++) {
            d1Var.writeRawMessageSetExtension(z9.getTagFieldNumber(this.tags[i10]), (h0) this.objects[i10]);
        }
    }

    public void writeTo(d1 d1Var) throws IOException {
        for (int i10 = 0; i10 < this.count; i10++) {
            int i11 = this.tags[i10];
            int tagFieldNumber = z9.getTagFieldNumber(i11);
            int tagWireType = z9.getTagWireType(i11);
            if (tagWireType == 0) {
                d1Var.writeUInt64(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 1) {
                d1Var.writeFixed64(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 2) {
                d1Var.writeBytes(tagFieldNumber, (h0) this.objects[i10]);
            } else if (tagWireType == 3) {
                d1Var.writeTag(tagFieldNumber, 3);
                ((t8) this.objects[i10]).writeTo(d1Var);
                d1Var.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                d1Var.writeFixed32(tagFieldNumber, ((Integer) this.objects[i10]).intValue());
            } else {
                throw h4.invalidWireType();
            }
        }
    }

    private t8(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.memoizedSerializedSize = -1;
        this.count = i10;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z10;
    }

    private static int hashCode(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    public int hashCode() {
        int i10 = this.count;
        return ((((527 + i10) * 31) + hashCode(this.tags, i10)) * 31) + hashCode(this.objects, this.count);
    }

    public t8 mergeFrom(t8 t8Var) {
        if (t8Var.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i10 = this.count + t8Var.count;
        ensureCapacity(i10);
        System.arraycopy(t8Var.tags, 0, this.tags, this.count, t8Var.count);
        System.arraycopy(t8Var.objects, 0, this.objects, this.count, t8Var.count);
        this.count = i10;
        return this;
    }

    public void writeAsMessageSetTo(ba baVar) throws IOException {
        f1 f1Var = (f1) baVar;
        if (f1Var.fieldOrder() == aa.DESCENDING) {
            for (int i10 = this.count - 1; i10 >= 0; i10--) {
                f1Var.writeMessageSetItem(z9.getTagFieldNumber(this.tags[i10]), this.objects[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.count; i11++) {
            f1Var.writeMessageSetItem(z9.getTagFieldNumber(this.tags[i11]), this.objects[i11]);
        }
    }

    public void writeTo(ba baVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        f1 f1Var = (f1) baVar;
        if (f1Var.fieldOrder() == aa.ASCENDING) {
            for (int i10 = 0; i10 < this.count; i10++) {
                writeField(this.tags[i10], this.objects[i10], f1Var);
            }
            return;
        }
        for (int i11 = this.count - 1; i11 >= 0; i11--) {
            writeField(this.tags[i11], this.objects[i11], f1Var);
        }
    }
}
