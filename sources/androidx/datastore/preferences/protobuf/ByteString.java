package androidx.datastore.preferences.protobuf;

import android.support.v4.media.d;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final ByteString f19122b = new LiteralByteString(Internal.f19252b);

    /* renamed from: c, reason: collision with root package name */
    public static final ByteArrayCopier f19123c;

    /* renamed from: a, reason: collision with root package name */
    public int f19124a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends AbstractByteIterator {

        /* renamed from: a, reason: collision with root package name */
        public int f19125a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f19126b;

        public AnonymousClass1() {
            this.f19126b = ByteString.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte e() {
            int i2 = this.f19125a;
            if (i2 >= this.f19126b) {
                throw new NoSuchElementException();
            }
            this.f19125a = i2 + 1;
            return ByteString.this.h(i2);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19125a < this.f19126b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ByteString$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class AnonymousClass2 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ByteIterator it = byteString3.iterator();
            ByteIterator it2 = byteString4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(it.e() & UnsignedBytes.MAX_VALUE, it2.e() & UnsignedBytes.MAX_VALUE);
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString3.size(), byteString4.size());
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(e());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(int i2, byte[] bArr, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;

        /* renamed from: f, reason: collision with root package name */
        public final int f19128f;

        /* renamed from: g, reason: collision with root package name */
        public final int f19129g;

        public BoundedByteString(byte[] bArr, int i2, int i3) {
            super(bArr);
            ByteString.d(i2, i2 + i3, bArr.length);
            this.f19128f = i2;
            this.f19129g = i3;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte b(int i2) {
            ByteString.c(i2, this.f19129g);
            return this.d[this.f19128f + i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final void f(int i2, int i3, int i4, byte[] bArr) {
            System.arraycopy(this.d, this.f19128f + i2, bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte h(int i2) {
            return this.d[this.f19128f + i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.f19129g;
        }

        public Object writeReplace() {
            return new LiteralByteString(q());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public final int x() {
            return this.f19128f;
        }
    }

    /* loaded from: classes2.dex */
    public interface ByteArrayCopier {
        byte[] a(int i2, byte[] bArr, int i3);
    }

    /* loaded from: classes2.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte e();
    }

    /* loaded from: classes2.dex */
    public static final class CodedBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f19130a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f19131b;

        public CodedBuilder(int i2) {
            byte[] bArr = new byte[i2];
            this.f19131b = bArr;
            Logger logger = CodedOutputStream.f19161b;
            this.f19130a = new CodedOutputStream.ArrayEncoder(bArr, i2);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class LeafByteString extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int g() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte h(int i2) {
            return b(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new AnonymousClass1();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void u(ByteOutput byteOutput) {
            t(byteOutput);
        }

        public abstract boolean w(ByteString byteString, int i2, int i3);
    }

    /* loaded from: classes2.dex */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] d;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer a() {
            return ByteBuffer.wrap(this.d, x(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte b(int i2) {
            return this.d[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i2 = this.f19124a;
            int i3 = literalByteString.f19124a;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                return w(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void f(int i2, int i3, int i4, byte[] bArr) {
            System.arraycopy(this.d, i2, bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte h(int i2) {
            return this.d[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean j() {
            int x = x();
            return Utf8.f19397a.e(x, this.d, size() + x);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int l(int i2, int i3, int i4) {
            int x = x() + i3;
            Charset charset = Internal.f19251a;
            for (int i5 = x; i5 < x + i4; i5++) {
                i2 = (i2 * 31) + this.d[i5];
            }
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int m(int i2, int i3, int i4) {
            int x = x() + i3;
            return Utf8.f19397a.g(i2, x, i4 + x, this.d);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString p(int i2, int i3) {
            int d = ByteString.d(i2, i3, size());
            if (d == 0) {
                return ByteString.f19122b;
            }
            return new BoundedByteString(this.d, x() + i2, d);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String r(Charset charset) {
            return new String(this.d, x(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.d.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void t(ByteOutput byteOutput) {
            byteOutput.Q(x(), this.d, size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean w(ByteString byteString, int i2, int i3) {
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
            int i4 = i2 + i3;
            if (i4 > byteString.size()) {
                StringBuilder u2 = d.u("Ran off end of other: ", i2, ", ", i3, ", ");
                u2.append(byteString.size());
                throw new IllegalArgumentException(u2.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.p(i2, i4).equals(p(0, i3));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            int x = x() + i3;
            int x2 = x();
            int x3 = literalByteString.x() + i2;
            while (x2 < x) {
                if (this.d[x2] != literalByteString.d[x3]) {
                    return false;
                }
                x2++;
                x3++;
            }
            return true;
        }

        public int x() {
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(int i2, byte[] bArr, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        f19123c = Android.a() ? new Object() : new Object();
    }

    public static void c(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 >= 0) {
                throw new ArrayIndexOutOfBoundsException(d.k("Index > length: ", i2, ", ", i3));
            }
            throw new ArrayIndexOutOfBoundsException(d.i("Index < 0: ", i2));
        }
    }

    public static int d(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(d.j("Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(d.k("Beginning index larger than ending index: ", i2, ", ", i3));
        }
        throw new IndexOutOfBoundsException(d.k("End index: ", i3, " >= ", i4));
    }

    public static ByteString e(int i2, byte[] bArr, int i3) {
        d(i2, i2 + i3, bArr.length);
        return new LiteralByteString(f19123c.a(i2, bArr, i3));
    }

    public abstract ByteBuffer a();

    public abstract byte b(int i2);

    public abstract boolean equals(Object obj);

    public abstract void f(int i2, int i3, int i4, byte[] bArr);

    public abstract int g();

    public abstract byte h(int i2);

    public final int hashCode() {
        int i2 = this.f19124a;
        if (i2 == 0) {
            int size = size();
            i2 = l(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f19124a = i2;
        }
        return i2;
    }

    public abstract boolean j();

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AnonymousClass1();
    }

    public abstract int l(int i2, int i3, int i4);

    public abstract int m(int i2, int i3, int i4);

    public abstract ByteString p(int i2, int i3);

    public final byte[] q() {
        int size = size();
        if (size == 0) {
            return Internal.f19252b;
        }
        byte[] bArr = new byte[size];
        f(0, 0, size, bArr);
        return bArr;
    }

    public abstract String r(Charset charset);

    public abstract int size();

    public abstract void t(ByteOutput byteOutput);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void u(ByteOutput byteOutput);

    /* loaded from: classes2.dex */
    public static final class Output extends OutputStream {
        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, 0);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i2) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }
}
