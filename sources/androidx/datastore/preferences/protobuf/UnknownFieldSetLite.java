package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class UnknownFieldSetLite {

    /* renamed from: f, reason: collision with root package name */
    public static final UnknownFieldSetLite f19382f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f19383a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f19384b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f19385c;
    public int d = -1;
    public boolean e;

    public UnknownFieldSetLite(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f19383a = i2;
        this.f19384b = iArr;
        this.f19385c = objArr;
        this.e = z2;
    }

    public static UnknownFieldSetLite b() {
        return new UnknownFieldSetLite(0, new int[8], new Object[8], true);
    }

    public static void d(int i2, Object obj, Writer writer) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            writer.C(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            writer.x(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            writer.k(i3, (ByteString) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            writer.c(i3, ((Integer) obj).intValue());
        } else if (writer.y() == Writer.FieldOrder.f19432a) {
            writer.F(i3);
            ((UnknownFieldSetLite) obj).e(writer);
            writer.J(i3);
        } else {
            writer.J(i3);
            ((UnknownFieldSetLite) obj).e(writer);
            writer.F(i3);
        }
    }

    public final int a() {
        int n02;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f19383a; i4++) {
            int i5 = this.f19384b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                n02 = CodedOutputStream.n0(i6, ((Long) this.f19385c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f19385c[i4]).longValue();
                n02 = CodedOutputStream.X(i6);
            } else if (i7 == 2) {
                n02 = CodedOutputStream.T(i6, (ByteString) this.f19385c[i4]);
            } else if (i7 == 3) {
                i3 = ((UnknownFieldSetLite) this.f19385c[i4]).a() + (CodedOutputStream.k0(i6) * 2) + i3;
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
                ((Integer) this.f19385c[i4]).intValue();
                n02 = CodedOutputStream.W(i6);
            }
            i3 = n02 + i3;
        }
        this.d = i3;
        return i3;
    }

    public final void c(int i2, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f19383a;
        int[] iArr = this.f19384b;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f19384b = Arrays.copyOf(iArr, i4);
            this.f19385c = Arrays.copyOf(this.f19385c, i4);
        }
        int[] iArr2 = this.f19384b;
        int i5 = this.f19383a;
        iArr2[i5] = i2;
        this.f19385c[i5] = obj;
        this.f19383a = i5 + 1;
    }

    public final void e(Writer writer) {
        if (this.f19383a == 0) {
            return;
        }
        if (writer.y() == Writer.FieldOrder.f19432a) {
            for (int i2 = 0; i2 < this.f19383a; i2++) {
                d(this.f19384b[i2], this.f19385c[i2], writer);
            }
            return;
        }
        for (int i3 = this.f19383a - 1; i3 >= 0; i3--) {
            d(this.f19384b[i3], this.f19385c[i3], writer);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = this.f19383a;
        if (i2 == unknownFieldSetLite.f19383a) {
            int[] iArr = this.f19384b;
            int[] iArr2 = unknownFieldSetLite.f19384b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f19385c;
                    Object[] objArr2 = unknownFieldSetLite.f19385c;
                    int i4 = this.f19383a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f19383a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f19384b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f19385c;
        int i8 = this.f19383a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
