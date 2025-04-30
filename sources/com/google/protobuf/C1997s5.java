package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1997s5 {
    private static final C1997s5 DEFAULT_INSTANCE = new C1997s5(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private C1997s5() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i9) {
        int[] iArr = this.tags;
        if (i9 > iArr.length) {
            int i10 = this.count;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i9);
            this.objects = Arrays.copyOf(this.objects, i9);
        }
    }

    public static C1997s5 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i9) {
        int i10 = 17;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        return i10;
    }

    private C1997s5 mergeFrom(S s5) throws IOException {
        int readTag;
        do {
            readTag = s5.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, s5));
        return this;
    }

    public static C1997s5 mutableCopyOf(C1997s5 c1997s5, C1997s5 c1997s52) {
        int i9 = c1997s5.count + c1997s52.count;
        int[] copyOf = Arrays.copyOf(c1997s5.tags, i9);
        System.arraycopy(c1997s52.tags, 0, copyOf, c1997s5.count, c1997s52.count);
        Object[] copyOf2 = Arrays.copyOf(c1997s5.objects, i9);
        System.arraycopy(c1997s52.objects, 0, copyOf2, c1997s5.count, c1997s52.count);
        return new C1997s5(i9, copyOf, copyOf2, true);
    }

    public static C1997s5 newInstance() {
        return new C1997s5();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (!objArr[i10].equals(objArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i9, Object obj, a6 a6Var) throws IOException {
        int tagFieldNumber = Y5.getTagFieldNumber(i9);
        int tagWireType = Y5.getTagWireType(i9);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            ((C1909g0) a6Var).writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(C1912g3.invalidWireType());
                    }
                    C1909g0 c1909g0 = (C1909g0) a6Var;
                    if (c1909g0.fieldOrder() == Z5.ASCENDING) {
                        c1909g0.writeStartGroup(tagFieldNumber);
                        ((C1997s5) obj).writeTo(c1909g0);
                        c1909g0.writeEndGroup(tagFieldNumber);
                        return;
                    } else {
                        c1909g0.writeEndGroup(tagFieldNumber);
                        ((C1997s5) obj).writeTo(c1909g0);
                        c1909g0.writeStartGroup(tagFieldNumber);
                        return;
                    }
                }
                ((C1909g0) a6Var).writeBytes(tagFieldNumber, (H) obj);
                return;
            }
            ((C1909g0) a6Var).writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        ((C1909g0) a6Var).writeInt64(tagFieldNumber, ((Long) obj).longValue());
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
        if (obj == null || !(obj instanceof C1997s5)) {
            return false;
        }
        C1997s5 c1997s5 = (C1997s5) obj;
        int i9 = this.count;
        if (i9 == c1997s5.count && tagsEquals(this.tags, c1997s5.tags, i9) && objectsEquals(this.objects, c1997s5.objects, this.count)) {
            return true;
        }
        return false;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i9 = this.memoizedSerializedSize;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            int i12 = this.tags[i11];
            int tagFieldNumber = Y5.getTagFieldNumber(i12);
            int tagWireType = Y5.getTagWireType(i12);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = AbstractC1895e0.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i11]).intValue());
                            } else {
                                throw new IllegalStateException(C1912g3.invalidWireType());
                            }
                        } else {
                            i10 = ((C1997s5) this.objects[i11]).getSerializedSize() + (AbstractC1895e0.computeTagSize(tagFieldNumber) * 2) + i10;
                        }
                    } else {
                        computeUInt64Size = AbstractC1895e0.computeBytesSize(tagFieldNumber, (H) this.objects[i11]);
                    }
                } else {
                    computeUInt64Size = AbstractC1895e0.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i11]).longValue());
                }
            } else {
                computeUInt64Size = AbstractC1895e0.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i11]).longValue());
            }
            i10 = computeUInt64Size + i10;
        }
        this.memoizedSerializedSize = i10;
        return i10;
    }

    public int getSerializedSizeAsMessageSet() {
        int i9 = this.memoizedSerializedSize;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            i10 += AbstractC1895e0.computeRawMessageSetExtensionSize(Y5.getTagFieldNumber(this.tags[i11]), (H) this.objects[i11]);
        }
        this.memoizedSerializedSize = i10;
        return i10;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean mergeFieldFrom(int i9, S s5) throws IOException {
        checkMutable();
        int tagFieldNumber = Y5.getTagFieldNumber(i9);
        int tagWireType = Y5.getTagWireType(i9);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                storeField(i9, Integer.valueOf(s5.readFixed32()));
                                return true;
                            }
                            throw C1912g3.invalidWireType();
                        }
                        return false;
                    }
                    C1997s5 c1997s5 = new C1997s5();
                    c1997s5.mergeFrom(s5);
                    s5.checkLastTagWas(Y5.makeTag(tagFieldNumber, 4));
                    storeField(i9, c1997s5);
                    return true;
                }
                storeField(i9, s5.readBytes());
                return true;
            }
            storeField(i9, Long.valueOf(s5.readFixed64()));
            return true;
        }
        storeField(i9, Long.valueOf(s5.readInt64()));
        return true;
    }

    public C1997s5 mergeLengthDelimitedField(int i9, H h6) {
        checkMutable();
        if (i9 != 0) {
            storeField(Y5.makeTag(i9, 2), h6);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public C1997s5 mergeVarintField(int i9, int i10) {
        checkMutable();
        if (i9 != 0) {
            storeField(Y5.makeTag(i9, 0), Long.valueOf(i10));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void printWithIndent(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < this.count; i10++) {
            P3.printField(sb, i9, String.valueOf(Y5.getTagFieldNumber(this.tags[i10])), this.objects[i10]);
        }
    }

    public void storeField(int i9, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i10 = this.count;
        iArr[i10] = i9;
        this.objects[i10] = obj;
        this.count = i10 + 1;
    }

    public void writeAsMessageSetTo(AbstractC1895e0 abstractC1895e0) throws IOException {
        for (int i9 = 0; i9 < this.count; i9++) {
            abstractC1895e0.writeRawMessageSetExtension(Y5.getTagFieldNumber(this.tags[i9]), (H) this.objects[i9]);
        }
    }

    public void writeTo(AbstractC1895e0 abstractC1895e0) throws IOException {
        for (int i9 = 0; i9 < this.count; i9++) {
            int i10 = this.tags[i9];
            int tagFieldNumber = Y5.getTagFieldNumber(i10);
            int tagWireType = Y5.getTagWireType(i10);
            if (tagWireType == 0) {
                abstractC1895e0.writeUInt64(tagFieldNumber, ((Long) this.objects[i9]).longValue());
            } else if (tagWireType == 1) {
                abstractC1895e0.writeFixed64(tagFieldNumber, ((Long) this.objects[i9]).longValue());
            } else if (tagWireType == 2) {
                abstractC1895e0.writeBytes(tagFieldNumber, (H) this.objects[i9]);
            } else if (tagWireType == 3) {
                abstractC1895e0.writeTag(tagFieldNumber, 3);
                ((C1997s5) this.objects[i9]).writeTo(abstractC1895e0);
                abstractC1895e0.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                abstractC1895e0.writeFixed32(tagFieldNumber, ((Integer) this.objects[i9]).intValue());
            } else {
                throw C1912g3.invalidWireType();
            }
        }
    }

    private C1997s5(int i9, int[] iArr, Object[] objArr, boolean z8) {
        this.memoizedSerializedSize = -1;
        this.count = i9;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z8;
    }

    private static int hashCode(Object[] objArr, int i9) {
        int i10 = 17;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 = (i10 * 31) + objArr[i11].hashCode();
        }
        return i10;
    }

    public int hashCode() {
        int i9 = this.count;
        return ((((527 + i9) * 31) + hashCode(this.tags, i9)) * 31) + hashCode(this.objects, this.count);
    }

    public C1997s5 mergeFrom(C1997s5 c1997s5) {
        if (c1997s5.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i9 = this.count + c1997s5.count;
        ensureCapacity(i9);
        System.arraycopy(c1997s5.tags, 0, this.tags, this.count, c1997s5.count);
        System.arraycopy(c1997s5.objects, 0, this.objects, this.count, c1997s5.count);
        this.count = i9;
        return this;
    }

    public void writeAsMessageSetTo(a6 a6Var) throws IOException {
        C1909g0 c1909g0 = (C1909g0) a6Var;
        if (c1909g0.fieldOrder() == Z5.DESCENDING) {
            for (int i9 = this.count - 1; i9 >= 0; i9--) {
                c1909g0.writeMessageSetItem(Y5.getTagFieldNumber(this.tags[i9]), this.objects[i9]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.count; i10++) {
            c1909g0.writeMessageSetItem(Y5.getTagFieldNumber(this.tags[i10]), this.objects[i10]);
        }
    }

    public void writeTo(a6 a6Var) throws IOException {
        if (this.count == 0) {
            return;
        }
        C1909g0 c1909g0 = (C1909g0) a6Var;
        if (c1909g0.fieldOrder() == Z5.ASCENDING) {
            for (int i9 = 0; i9 < this.count; i9++) {
                writeField(this.tags[i9], this.objects[i9], c1909g0);
            }
            return;
        }
        for (int i10 = this.count - 1; i10 >= 0; i10--) {
            writeField(this.tags[i10], this.objects[i10], c1909g0);
        }
    }
}
