package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RopeByteString extends ByteString {
    private static final long serialVersionUID = 1;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final ByteString f19333f;

    /* renamed from: g, reason: collision with root package name */
    public final ByteString f19334g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19335h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19336i;

    /* renamed from: androidx.datastore.preferences.protobuf.RopeByteString$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends ByteString.AbstractByteIterator {

        /* renamed from: a, reason: collision with root package name */
        public final PieceIterator f19337a;

        /* renamed from: b, reason: collision with root package name */
        public ByteString.ByteIterator f19338b = a();

        public AnonymousClass1(RopeByteString ropeByteString) {
            this.f19337a = new PieceIterator(ropeByteString);
        }

        public final ByteString.ByteIterator a() {
            PieceIterator pieceIterator = this.f19337a;
            if (!pieceIterator.hasNext()) {
                return null;
            }
            ByteString.LeafByteString next = pieceIterator.next();
            next.getClass();
            return new ByteString.AnonymousClass1();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte e() {
            ByteString.ByteIterator byteIterator = this.f19338b;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte e = byteIterator.e();
            if (!this.f19338b.hasNext()) {
                this.f19338b = a();
            }
            return e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19338b != null;
        }
    }

    /* loaded from: classes2.dex */
    public static class Balancer {
    }

    /* loaded from: classes2.dex */
    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f19339a;

        /* renamed from: b, reason: collision with root package name */
        public ByteString.LeafByteString f19340b;

        public PieceIterator(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f19339a = null;
                this.f19340b = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.f19336i);
            this.f19339a = arrayDeque;
            arrayDeque.push(ropeByteString);
            ByteString byteString2 = ropeByteString.f19333f;
            while (byteString2 instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                this.f19339a.push(ropeByteString2);
                byteString2 = ropeByteString2.f19333f;
            }
            this.f19340b = (ByteString.LeafByteString) byteString2;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.f19340b;
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque arrayDeque = this.f19339a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString = ((RopeByteString) arrayDeque.pop()).f19334g;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    arrayDeque.push(ropeByteString);
                    byteString = ropeByteString.f19333f;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            } while (leafByteString.size() == 0);
            this.f19340b = leafByteString;
            return leafByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19340b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f19333f = byteString;
        this.f19334g = byteString2;
        int size = byteString.size();
        this.f19335h = size;
        this.d = byteString2.size() + size;
        this.f19336i = Math.max(byteString.g(), byteString2.g()) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer a() {
        return ByteBuffer.wrap(q()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte b(int i2) {
        ByteString.c(i2, this.d);
        return h(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        int size = byteString.size();
        int i2 = this.d;
        if (i2 != size) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        int i3 = this.f19124a;
        int i4 = byteString.f19124a;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        PieceIterator pieceIterator = new PieceIterator(this);
        ByteString.LeafByteString next = pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString);
        ByteString.LeafByteString next2 = pieceIterator2.next();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int size2 = next.size() - i5;
            int size3 = next2.size() - i6;
            int min = Math.min(size2, size3);
            if (!(i5 == 0 ? next.w(next2, i6, min) : next2.w(next, i5, min))) {
                return false;
            }
            i7 += min;
            if (i7 >= i2) {
                if (i7 == i2) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size2) {
                i5 = 0;
                next = pieceIterator.next();
            } else {
                i5 += min;
                next = next;
            }
            if (min == size3) {
                next2 = pieceIterator2.next();
                i6 = 0;
            } else {
                i6 += min;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void f(int i2, int i3, int i4, byte[] bArr) {
        int i5 = i2 + i4;
        ByteString byteString = this.f19333f;
        int i6 = this.f19335h;
        if (i5 <= i6) {
            byteString.f(i2, i3, i4, bArr);
            return;
        }
        ByteString byteString2 = this.f19334g;
        if (i2 >= i6) {
            byteString2.f(i2 - i6, i3, i4, bArr);
            return;
        }
        int i7 = i6 - i2;
        byteString.f(i2, i3, i7, bArr);
        byteString2.f(0, i3 + i7, i4 - i7, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int g() {
        return this.f19336i;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte h(int i2) {
        int i3 = this.f19335h;
        return i2 < i3 ? this.f19333f.h(i2) : this.f19334g.h(i2 - i3);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean j() {
        int m2 = this.f19333f.m(0, 0, this.f19335h);
        ByteString byteString = this.f19334g;
        return byteString.m(m2, 0, byteString.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* renamed from: k */
    public final ByteString.ByteIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int l(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        ByteString byteString = this.f19333f;
        int i6 = this.f19335h;
        if (i5 <= i6) {
            return byteString.l(i2, i3, i4);
        }
        ByteString byteString2 = this.f19334g;
        if (i3 >= i6) {
            return byteString2.l(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return byteString2.l(byteString.l(i2, i3, i7), 0, i4 - i7);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int m(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        ByteString byteString = this.f19333f;
        int i6 = this.f19335h;
        if (i5 <= i6) {
            return byteString.m(i2, i3, i4);
        }
        ByteString byteString2 = this.f19334g;
        if (i3 >= i6) {
            return byteString2.m(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return byteString2.m(byteString.m(i2, i3, i7), 0, i4 - i7);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString p(int i2, int i3) {
        int i4 = this.d;
        int d = ByteString.d(i2, i3, i4);
        if (d == 0) {
            return ByteString.f19122b;
        }
        if (d == i4) {
            return this;
        }
        ByteString byteString = this.f19333f;
        int i5 = this.f19335h;
        if (i3 <= i5) {
            return byteString.p(i2, i3);
        }
        ByteString byteString2 = this.f19334g;
        return i2 >= i5 ? byteString2.p(i2 - i5, i3 - i5) : new RopeByteString(byteString.p(i2, byteString.size()), byteString2.p(0, i3 - i5));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final String r(Charset charset) {
        return new String(q(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.d;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void t(ByteOutput byteOutput) {
        this.f19333f.t(byteOutput);
        this.f19334g.t(byteOutput);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void u(ByteOutput byteOutput) {
        this.f19334g.u(byteOutput);
        this.f19333f.u(byteOutput);
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(q());
    }

    /* loaded from: classes2.dex */
    public class RopeInputStream extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public PieceIterator f19341a;

        /* renamed from: b, reason: collision with root package name */
        public ByteString.LeafByteString f19342b;

        /* renamed from: c, reason: collision with root package name */
        public int f19343c;
        public int d;

        /* renamed from: f, reason: collision with root package name */
        public int f19344f;

        /* renamed from: g, reason: collision with root package name */
        public int f19345g;

        public final void a() {
            if (this.f19342b != null) {
                int i2 = this.d;
                int i3 = this.f19343c;
                if (i2 == i3) {
                    this.f19344f += i3;
                    this.d = 0;
                    if (!this.f19341a.hasNext()) {
                        this.f19342b = null;
                        this.f19343c = 0;
                    } else {
                        ByteString.LeafByteString next = this.f19341a.next();
                        this.f19342b = next;
                        this.f19343c = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        public final int c(int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                a();
                if (this.f19342b != null) {
                    int min = Math.min(this.f19343c - this.d, i4);
                    if (bArr != null) {
                        ByteString.LeafByteString leafByteString = this.f19342b;
                        int i5 = this.d;
                        ByteString.d(i5, i5 + min, leafByteString.size());
                        int i6 = i2 + min;
                        ByteString.d(i2, i6, bArr.length);
                        if (min > 0) {
                            leafByteString.f(i5, i2, min, bArr);
                        }
                        i2 = i6;
                    }
                    this.d += min;
                    i4 -= min;
                } else if (i4 == i3) {
                    return -1;
                }
            }
            return i3 - i4;
        }

        @Override // java.io.InputStream
        public final void mark(int i2) {
            this.f19345g = this.f19344f + this.d;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            bArr.getClass();
            if (i2 >= 0 && i3 >= 0 && i3 <= bArr.length - i2) {
                return c(i2, bArr, i3);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
            this.f19341a = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.f19342b = next;
            this.f19343c = next.size();
            this.d = 0;
            this.f19344f = 0;
            c(0, null, this.f19345g);
        }

        @Override // java.io.InputStream
        public final long skip(long j2) {
            if (j2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j2 > 2147483647L) {
                j2 = 2147483647L;
            }
            return c(0, null, (int) j2);
        }

        @Override // java.io.InputStream
        public final int read() {
            a();
            ByteString.LeafByteString leafByteString = this.f19342b;
            if (leafByteString == null) {
                return -1;
            }
            int i2 = this.d;
            this.d = i2 + 1;
            return leafByteString.b(i2) & UnsignedBytes.MAX_VALUE;
        }
    }
}
