package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.protobuf.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2031x4 extends H {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final H left;
    private final int leftLength;
    private final H right;
    private final int totalLength;
    private final int treeDepth;

    public /* synthetic */ C2031x4(H h6, H h9, C2003t4 c2003t4) {
        this(h6, h9);
    }

    public static H concatenate(H h6, H h9) {
        if (h9.size() == 0) {
            return h6;
        }
        if (h6.size() == 0) {
            return h9;
        }
        int size = h9.size() + h6.size();
        if (size < 128) {
            return concatenateBytes(h6, h9);
        }
        if (h6 instanceof C2031x4) {
            C2031x4 c2031x4 = (C2031x4) h6;
            if (h9.size() + c2031x4.right.size() < 128) {
                return new C2031x4(c2031x4.left, concatenateBytes(c2031x4.right, h9));
            }
            if (c2031x4.left.getTreeDepth() > c2031x4.right.getTreeDepth() && c2031x4.getTreeDepth() > h9.getTreeDepth()) {
                return new C2031x4(c2031x4.left, new C2031x4(c2031x4.right, h9));
            }
        }
        if (size >= minLength(Math.max(h6.getTreeDepth(), h9.getTreeDepth()) + 1)) {
            return new C2031x4(h6, h9);
        }
        return C2010u4.access$100(new C2010u4(null), h6, h9);
    }

    private static H concatenateBytes(H h6, H h9) {
        int size = h6.size();
        int size2 = h9.size();
        byte[] bArr = new byte[size + size2];
        h6.copyTo(bArr, 0, 0, size);
        h9.copyTo(bArr, 0, size, size2);
        return H.wrap(bArr);
    }

    private boolean equalsFragments(H h6) {
        boolean equalsRange;
        C2003t4 c2003t4 = null;
        C2017v4 c2017v4 = new C2017v4(this, c2003t4);
        D d2 = (D) c2017v4.next();
        C2017v4 c2017v42 = new C2017v4(h6, c2003t4);
        D d9 = (D) c2017v42.next();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = d2.size() - i9;
            int size2 = d9.size() - i10;
            int min = Math.min(size, size2);
            if (i9 == 0) {
                equalsRange = d2.equalsRange(d9, i10, min);
            } else {
                equalsRange = d9.equalsRange(d2, i9, min);
            }
            if (!equalsRange) {
                return false;
            }
            i11 += min;
            int i12 = this.totalLength;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i9 = 0;
                d2 = (D) c2017v4.next();
            } else {
                i9 += min;
                d2 = d2;
            }
            if (min == size2) {
                d9 = (D) c2017v42.next();
                i10 = 0;
            } else {
                i10 += min;
            }
        }
    }

    public static int minLength(int i9) {
        int[] iArr = minLengthByDepth;
        if (i9 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i9];
    }

    public static C2031x4 newInstanceForTest(H h6, H h9) {
        return new C2031x4(h6, h9);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.H
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.H
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C2017v4 c2017v4 = new C2017v4(this, null);
        while (c2017v4.hasNext()) {
            arrayList.add(c2017v4.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.H
    public byte byteAt(int i9) {
        H.checkIndex(i9, this.totalLength);
        return internalByteAt(i9);
    }

    @Override // com.google.protobuf.H
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.H
    public void copyToInternal(byte[] bArr, int i9, int i10, int i11) {
        int i12 = i9 + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            this.left.copyToInternal(bArr, i9, i10, i11);
        } else {
            if (i9 >= i13) {
                this.right.copyToInternal(bArr, i9 - i13, i10, i11);
                return;
            }
            int i14 = i13 - i9;
            this.left.copyToInternal(bArr, i9, i10, i14);
            this.right.copyToInternal(bArr, 0, i10 + i14, i11 - i14);
        }
    }

    @Override // com.google.protobuf.H
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h6 = (H) obj;
        if (this.totalLength != h6.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = h6.peekCachedHashCode();
        if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
            return false;
        }
        return equalsFragments(h6);
    }

    @Override // com.google.protobuf.H
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.H
    public byte internalByteAt(int i9) {
        int i10 = this.leftLength;
        if (i9 < i10) {
            return this.left.internalByteAt(i9);
        }
        return this.right.internalByteAt(i9 - i10);
    }

    @Override // com.google.protobuf.H
    public boolean isBalanced() {
        if (this.totalLength >= minLength(this.treeDepth)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        H h6 = this.right;
        if (h6.partialIsValidUtf8(partialIsValidUtf8, 0, h6.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.H
    public S newCodedInput() {
        return S.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.H
    public InputStream newInput() {
        return new C2024w4(this);
    }

    @Override // com.google.protobuf.H
    public int partialHash(int i9, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            return this.left.partialHash(i9, i10, i11);
        }
        if (i10 >= i13) {
            return this.right.partialHash(i9, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.right.partialHash(this.left.partialHash(i9, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.H
    public int partialIsValidUtf8(int i9, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            return this.left.partialIsValidUtf8(i9, i10, i11);
        }
        if (i10 >= i13) {
            return this.right.partialIsValidUtf8(i9, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i9, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.H
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.H
    public H substring(int i9, int i10) {
        int checkRange = H.checkRange(i9, i10, this.totalLength);
        if (checkRange == 0) {
            return H.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i11 = this.leftLength;
        if (i10 <= i11) {
            return this.left.substring(i9, i10);
        }
        if (i9 >= i11) {
            return this.right.substring(i9 - i11, i10 - i11);
        }
        return new C2031x4(this.left.substring(i9), this.right.substring(0, i10 - this.leftLength));
    }

    @Override // com.google.protobuf.H
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return H.wrap(toByteArray());
    }

    @Override // com.google.protobuf.H
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.H
    public void writeToInternal(OutputStream outputStream, int i9, int i10) throws IOException {
        int i11 = i9 + i10;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            this.left.writeToInternal(outputStream, i9, i10);
        } else {
            if (i9 >= i12) {
                this.right.writeToInternal(outputStream, i9 - i12, i10);
                return;
            }
            int i13 = i12 - i9;
            this.left.writeToInternal(outputStream, i9, i13);
            this.right.writeToInternal(outputStream, 0, i10 - i13);
        }
    }

    @Override // com.google.protobuf.H
    public void writeToReverse(AbstractC2005u abstractC2005u) throws IOException {
        this.right.writeToReverse(abstractC2005u);
        this.left.writeToReverse(abstractC2005u);
    }

    private C2031x4(H h6, H h9) {
        this.left = h6;
        this.right = h9;
        int size = h6.size();
        this.leftLength = size;
        this.totalLength = h9.size() + size;
        this.treeDepth = Math.max(h6.getTreeDepth(), h9.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.H, java.lang.Iterable
    public B iterator() {
        return new C2003t4(this);
    }

    @Override // com.google.protobuf.H
    public void writeTo(AbstractC2005u abstractC2005u) throws IOException {
        this.left.writeTo(abstractC2005u);
        this.right.writeTo(abstractC2005u);
    }
}
