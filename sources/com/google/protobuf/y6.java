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

/* loaded from: classes4.dex */
public final class y6 extends h0 {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final h0 left;
    private final int leftLength;
    private final h0 right;
    private final int totalLength;
    private final int treeDepth;

    public /* synthetic */ y6(h0 h0Var, h0 h0Var2, u6 u6Var) {
        this(h0Var, h0Var2);
    }

    public static h0 concatenate(h0 h0Var, h0 h0Var2) {
        if (h0Var2.size() == 0) {
            return h0Var;
        }
        if (h0Var.size() == 0) {
            return h0Var2;
        }
        int size = h0Var2.size() + h0Var.size();
        if (size < 128) {
            return concatenateBytes(h0Var, h0Var2);
        }
        if (h0Var instanceof y6) {
            y6 y6Var = (y6) h0Var;
            if (h0Var2.size() + y6Var.right.size() < 128) {
                return new y6(y6Var.left, concatenateBytes(y6Var.right, h0Var2));
            }
            if (y6Var.left.getTreeDepth() > y6Var.right.getTreeDepth() && y6Var.getTreeDepth() > h0Var2.getTreeDepth()) {
                return new y6(y6Var.left, new y6(y6Var.right, h0Var2));
            }
        }
        if (size >= minLength(Math.max(h0Var.getTreeDepth(), h0Var2.getTreeDepth()) + 1)) {
            return new y6(h0Var, h0Var2);
        }
        return v6.access$100(new v6(null), h0Var, h0Var2);
    }

    private static h0 concatenateBytes(h0 h0Var, h0 h0Var2) {
        int size = h0Var.size();
        int size2 = h0Var2.size();
        byte[] bArr = new byte[size + size2];
        h0Var.copyTo(bArr, 0, 0, size);
        h0Var2.copyTo(bArr, 0, size, size2);
        return h0.wrap(bArr);
    }

    private boolean equalsFragments(h0 h0Var) {
        boolean equalsRange;
        u6 u6Var = null;
        w6 w6Var = new w6(this, u6Var);
        d0 d0Var = (d0) w6Var.next();
        w6 w6Var2 = new w6(h0Var, u6Var);
        d0 d0Var2 = (d0) w6Var2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = d0Var.size() - i10;
            int size2 = d0Var2.size() - i11;
            int min = Math.min(size, size2);
            if (i10 == 0) {
                equalsRange = d0Var.equalsRange(d0Var2, i11, min);
            } else {
                equalsRange = d0Var2.equalsRange(d0Var, i10, min);
            }
            if (!equalsRange) {
                return false;
            }
            i12 += min;
            int i13 = this.totalLength;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i10 = 0;
                d0Var = (d0) w6Var.next();
            } else {
                i10 += min;
                d0Var = d0Var;
            }
            if (min == size2) {
                d0Var2 = (d0) w6Var2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    public static int minLength(int i10) {
        int[] iArr = minLengthByDepth;
        if (i10 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    public static y6 newInstanceForTest(h0 h0Var, h0 h0Var2) {
        return new y6(h0Var, h0Var2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.h0
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.h0
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, null);
        while (w6Var.hasNext()) {
            arrayList.add(w6Var.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.h0
    public byte byteAt(int i10) {
        h0.checkIndex(i10, this.totalLength);
        return internalByteAt(i10);
    }

    @Override // com.google.protobuf.h0
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.h0
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.leftLength;
        if (i13 <= i14) {
            this.left.copyToInternal(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.right.copyToInternal(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.left.copyToInternal(bArr, i10, i11, i15);
            this.right.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.protobuf.h0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.totalLength != h0Var.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = h0Var.peekCachedHashCode();
        if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
            return false;
        }
        return equalsFragments(h0Var);
    }

    @Override // com.google.protobuf.h0
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.h0
    public byte internalByteAt(int i10) {
        int i11 = this.leftLength;
        if (i10 < i11) {
            return this.left.internalByteAt(i10);
        }
        return this.right.internalByteAt(i10 - i11);
    }

    @Override // com.google.protobuf.h0
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.h0
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        h0 h0Var = this.right;
        if (h0Var.partialIsValidUtf8(partialIsValidUtf8, 0, h0Var.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.h0
    public r0 newCodedInput() {
        return r0.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.h0
    public InputStream newInput() {
        return new x6(this);
    }

    @Override // com.google.protobuf.h0
    public int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.leftLength;
        if (i13 <= i14) {
            return this.left.partialHash(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.right.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.right.partialHash(this.left.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.h0
    public int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.leftLength;
        if (i13 <= i14) {
            return this.left.partialIsValidUtf8(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.right.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.h0
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.h0
    public h0 substring(int i10, int i11) {
        int checkRange = h0.checkRange(i10, i11, this.totalLength);
        if (checkRange == 0) {
            return h0.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i12 = this.leftLength;
        if (i11 <= i12) {
            return this.left.substring(i10, i11);
        }
        if (i10 >= i12) {
            return this.right.substring(i10 - i12, i11 - i12);
        }
        return new y6(this.left.substring(i10), this.right.substring(0, i11 - this.leftLength));
    }

    @Override // com.google.protobuf.h0
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return h0.wrap(toByteArray());
    }

    @Override // com.google.protobuf.h0
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.h0
    public void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            this.left.writeToInternal(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.right.writeToInternal(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.left.writeToInternal(outputStream, i10, i14);
            this.right.writeToInternal(outputStream, 0, i11 - i14);
        }
    }

    @Override // com.google.protobuf.h0
    public void writeToReverse(u uVar) throws IOException {
        this.right.writeToReverse(uVar);
        this.left.writeToReverse(uVar);
    }

    private y6(h0 h0Var, h0 h0Var2) {
        this.left = h0Var;
        this.right = h0Var2;
        int size = h0Var.size();
        this.leftLength = size;
        this.totalLength = h0Var2.size() + size;
        this.treeDepth = Math.max(h0Var.getTreeDepth(), h0Var2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.h0, java.lang.Iterable
    public b0 iterator() {
        return new u6(this);
    }

    @Override // com.google.protobuf.h0
    public void writeTo(u uVar) throws IOException {
        this.left.writeTo(uVar);
        this.right.writeTo(uVar);
    }
}
