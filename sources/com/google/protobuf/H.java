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
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class H implements Iterable, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final H EMPTY = new E(C1898e3.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<H> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final A byteArrayCopier;
    private int hash = 0;

    static {
        A c2033y;
        C2012v c2012v = null;
        if (C1901f.isOnAndroidDevice()) {
            c2033y = new G(c2012v);
        } else {
            c2033y = new C2033y(c2012v);
        }
        byteArrayCopier = c2033y;
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new C2019w();
    }

    private static H balancedConcat(Iterator<H> it, int i9) {
        if (i9 >= 1) {
            if (i9 == 1) {
                return it.next();
            }
            int i10 = i9 >>> 1;
            return balancedConcat(it, i10).concat(balancedConcat(it, i9 - i10));
        }
        throw new IllegalArgumentException(Q7.n0.f(i9, "length (", ") must be >= 1"));
    }

    public static void checkIndex(int i9, int i10) {
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(com.mbridge.msdk.foundation.entity.o.h(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(Q7.n0.e(i9, i10, "Index > length: ", ", "));
        }
    }

    public static int checkRange(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) < 0) {
            if (i9 >= 0) {
                if (i10 < i9) {
                    throw new IndexOutOfBoundsException(Q7.n0.e(i9, i10, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(Q7.n0.e(i10, i11, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(Q7.n0.f(i9, "Beginning index: ", " < 0"));
        }
        return i12;
    }

    public static H copyFrom(byte[] bArr, int i9, int i10) {
        checkRange(i9, i9 + i10, bArr.length);
        return new E(byteArrayCopier.copyFrom(bArr, i9, i10));
    }

    public static H copyFromUtf8(String str) {
        return new E(str.getBytes(C1898e3.UTF_8));
    }

    public static final H empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i9) {
        int hexDigit = hexDigit(str.charAt(i9));
        if (hexDigit != -1) {
            return hexDigit;
        }
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        n2.append(str.charAt(i9));
        n2.append(" at index ");
        n2.append(i9);
        throw new NumberFormatException(n2.toString());
    }

    public static H fromHex(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = i9 * 2;
                bArr[i9] = (byte) (extractHexDigit(str, i10 + 1) | (extractHexDigit(str, i10) << 4));
            }
            return new E(bArr);
        }
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Invalid hexString ", str, " of length ");
        n2.append(str.length());
        n2.append(" must be even.");
        throw new NumberFormatException(n2.toString());
    }

    private static int hexDigit(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'A' && c9 <= 'F') {
            return c9 - '7';
        }
        if (c9 < 'a' || c9 > 'f') {
            return -1;
        }
        return c9 - 'W';
    }

    public static C newCodedBuilder(int i9) {
        return new C(i9, null);
    }

    public static F newOutput(int i9) {
        return new F(i9);
    }

    private static H readChunk(InputStream inputStream, int i9) throws IOException {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i10, i9 - i10);
            if (read == -1) {
                break;
            }
            i10 += read;
        }
        if (i10 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i10);
    }

    public static H readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b) {
        return b & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return C1893d5.escapeBytes(this);
        }
        return C1893d5.escapeBytes(substring(0, 47)) + "...";
    }

    public static Comparator<H> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static H wrap(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        }
        return new C1892d4(byteBuffer);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i9);

    public final H concat(H h6) {
        if (Integer.MAX_VALUE - size() >= h6.size()) {
            return C2031x4.concatenate(this, h6);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + h6.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i9) {
        copyTo(bArr, 0, i9, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i9, int i10, int i11);

    public final boolean endsWith(H h6) {
        if (size() >= h6.size() && substring(size() - h6.size()).equals(h6)) {
            return true;
        }
        return false;
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i9 = this.hash;
        if (i9 == 0) {
            int size = size();
            i9 = partialHash(size, 0, size);
            if (i9 == 0) {
                i9 = 1;
            }
            this.hash = i9;
        }
        return i9;
    }

    public abstract byte internalByteAt(int i9);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidUtf8();

    public abstract S newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i9, int i10, int i11);

    public abstract int partialIsValidUtf8(int i9, int i10, int i11);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(H h6) {
        if (size() < h6.size() || !substring(0, h6.size()).equals(h6)) {
            return false;
        }
        return true;
    }

    public final H substring(int i9) {
        return substring(i9, size());
    }

    public abstract H substring(int i9, int i10);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C1898e3.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e4) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e4);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(C1898e3.UTF_8);
    }

    public abstract void writeTo(AbstractC2005u abstractC2005u) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i9, int i10) throws IOException {
        checkRange(i9, i9 + i10, size());
        if (i10 > 0) {
            writeToInternal(outputStream, i9, i10);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i9, int i10) throws IOException;

    public abstract void writeToReverse(AbstractC2005u abstractC2005u) throws IOException;

    public static F newOutput() {
        return new F(128);
    }

    public static H readFrom(InputStream inputStream, int i9) throws IOException {
        return readFrom(inputStream, i9, i9);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i9, int i10, int i11) {
        checkRange(i9, i9 + i11, size());
        checkRange(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            copyToInternal(bArr, i9, i10, i11);
        }
    }

    @Override // java.lang.Iterable
    public B iterator() {
        return new C2012v(this);
    }

    public static H copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static H readFrom(InputStream inputStream, int i9, int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            H readChunk = readChunk(inputStream, i9);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i9 = Math.min(i9 * 2, i10);
        }
    }

    public static H copyFrom(ByteBuffer byteBuffer, int i9) {
        checkRange(0, i9, byteBuffer.remaining());
        byte[] bArr = new byte[i9];
        byteBuffer.get(bArr);
        return new E(bArr);
    }

    public static H wrap(byte[] bArr) {
        return new E(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static H wrap(byte[] bArr, int i9, int i10) {
        return new C2040z(bArr, i9, i10);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String truncateAndEscapeForDisplay = truncateAndEscapeForDisplay();
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC2914a.h(sb, truncateAndEscapeForDisplay, "\">");
    }

    public static H copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static H copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new E(str.getBytes(str2));
    }

    public static H copyFrom(String str, Charset charset) {
        return new E(str.getBytes(charset));
    }

    public static H copyFrom(Iterable<H> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<H> it = iterable.iterator();
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
