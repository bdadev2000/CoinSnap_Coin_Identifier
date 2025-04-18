package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.UByte;

/* loaded from: classes4.dex */
public abstract class h0 implements Iterable, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final h0 EMPTY = new e0(f4.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<h0> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final a0 byteArrayCopier;
    private int hash = 0;

    static {
        a0 yVar;
        v vVar = null;
        if (f.isOnAndroidDevice()) {
            yVar = new g0(vVar);
        } else {
            yVar = new y(vVar);
        }
        byteArrayCopier = yVar;
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new w();
    }

    private static h0 balancedConcat(Iterator<h0> it, int i10) {
        if (i10 >= 1) {
            if (i10 == 1) {
                return it.next();
            }
            int i11 = i10 >>> 1;
            return balancedConcat(it, i11).concat(balancedConcat(it, i10 - i11));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    public static void checkIndex(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(eb.j.i("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(a4.j.e("Index > length: ", i10, ", ", i11));
        }
    }

    public static int checkRange(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(a4.j.e("Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(a4.j.e("End index: ", i11, " >= ", i12));
            }
            throw new IndexOutOfBoundsException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Beginning index: ", i10, " < 0"));
        }
        return i13;
    }

    public static h0 copyFrom(byte[] bArr, int i10, int i11) {
        checkRange(i10, i10 + i11, bArr.length);
        return new e0(byteArrayCopier.copyFrom(bArr, i10, i11));
    }

    public static h0 copyFromUtf8(String str) {
        return new e0(str.getBytes(f4.UTF_8));
    }

    public static final h0 empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i10) {
        int hexDigit = hexDigit(str.charAt(i10));
        if (hexDigit != -1) {
            return hexDigit;
        }
        StringBuilder o10 = a4.j.o("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        o10.append(str.charAt(i10));
        o10.append(" at index ");
        o10.append(i10);
        throw new NumberFormatException(o10.toString());
    }

    public static h0 fromHex(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (extractHexDigit(str, i11 + 1) | (extractHexDigit(str, i11) << 4));
            }
            return new e0(bArr);
        }
        StringBuilder o10 = a4.j.o("Invalid hexString ", str, " of length ");
        o10.append(str.length());
        o10.append(" must be even.");
        throw new NumberFormatException(o10.toString());
    }

    private static int hexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'A';
        if (c10 < 'A' || c10 > 'F') {
            c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static c0 newCodedBuilder(int i10) {
        return new c0(i10, null);
    }

    public static f0 newOutput(int i10) {
        return new f0(i10);
    }

    private static h0 readChunk(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read == -1) {
                break;
            }
            i11 += read;
        }
        if (i11 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i11);
    }

    public static h0 readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b3) {
        return b3 & UByte.MAX_VALUE;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return e8.escapeBytes(this);
        }
        return e8.escapeBytes(substring(0, 47)) + "...";
    }

    public static Comparator<h0> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static h0 wrap(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        }
        return new e6(byteBuffer);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i10);

    public final h0 concat(h0 h0Var) {
        if (Integer.MAX_VALUE - size() >= h0Var.size()) {
            return y6.concatenate(this, h0Var);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + h0Var.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i10) {
        copyTo(bArr, 0, i10, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public final boolean endsWith(h0 h0Var) {
        return size() >= h0Var.size() && substring(size() - h0Var.size()).equals(h0Var);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i10 = this.hash;
        if (i10 == 0) {
            int size = size();
            i10 = partialHash(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.hash = i10;
        }
        return i10;
    }

    public abstract byte internalByteAt(int i10);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract r0 newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i10, int i11, int i12);

    public abstract int partialIsValidUtf8(int i10, int i11, int i12);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(h0 h0Var) {
        return size() >= h0Var.size() && substring(0, h0Var.size()).equals(h0Var);
    }

    public final h0 substring(int i10) {
        return substring(i10, size());
    }

    public abstract h0 substring(int i10, int i11);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return f4.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e2) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e2);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(f4.UTF_8);
    }

    public abstract void writeTo(u uVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i10, int i11) throws IOException {
        checkRange(i10, i10 + i11, size());
        if (i11 > 0) {
            writeToInternal(outputStream, i10, i11);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException;

    public abstract void writeToReverse(u uVar) throws IOException;

    public static f0 newOutput() {
        return new f0(128);
    }

    public static h0 readFrom(InputStream inputStream, int i10) throws IOException {
        return readFrom(inputStream, i10, i10);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i10, int i11, int i12) {
        checkRange(i10, i10 + i12, size());
        checkRange(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            copyToInternal(bArr, i10, i11, i12);
        }
    }

    @Override // java.lang.Iterable
    public b0 iterator() {
        return new v(this);
    }

    public static h0 copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static h0 readFrom(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            h0 readChunk = readChunk(inputStream, i10);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    public static h0 copyFrom(ByteBuffer byteBuffer, int i10) {
        checkRange(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new e0(bArr);
    }

    public static h0 wrap(byte[] bArr) {
        return new e0(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static h0 wrap(byte[] bArr, int i10, int i11) {
        return new z(bArr, i10, i11);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static h0 copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static h0 copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new e0(str.getBytes(str2));
    }

    public static h0 copyFrom(String str, Charset charset) {
        return new e0(str.getBytes(charset));
    }

    public static h0 copyFrom(Iterable<h0> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<h0> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
