package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class k implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final j f1389c = new j(h0.f1371b);

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.work.p f1390d;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1391b = 0;

    static {
        androidx.work.p pVar;
        int i10 = 0;
        if (d.a()) {
            pVar = new androidx.work.p(1, i10);
        } else {
            pVar = new androidx.work.p(i10, i10);
        }
        f1390d = pVar;
    }

    public static int b(int i10, int i11, int i12) {
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

    public static j c(int i10, int i11, byte[] bArr) {
        byte[] bArr2;
        int i12 = i10 + i11;
        b(i10, i12, bArr.length);
        switch (f1390d.f2227b) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i10, i12);
                break;
            default:
                byte[] bArr3 = new byte[i11];
                System.arraycopy(bArr, i10, bArr3, 0, i11);
                bArr2 = bArr3;
                break;
        }
        return new j(bArr2);
    }

    public abstract byte a(int i10);

    public abstract void d(byte[] bArr, int i10);

    public abstract byte e(int i10);

    public final String f() {
        Charset charset = h0.a;
        if (size() == 0) {
            return "";
        }
        j jVar = (j) this;
        return new String(jVar.f1377f, jVar.g(), jVar.size(), charset);
    }

    public final int hashCode() {
        int i10 = this.f1391b;
        if (i10 == 0) {
            int size = size();
            j jVar = (j) this;
            int g10 = jVar.g() + 0;
            int i11 = size;
            for (int i12 = g10; i12 < g10 + size; i12++) {
                i11 = (i11 * 31) + jVar.f1377f[i12];
            }
            if (i11 == 0) {
                i10 = 1;
            } else {
                i10 = i11;
            }
            this.f1391b = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this);
    }

    public abstract int size();

    public final String toString() {
        j hVar;
        String sb2;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            sb2 = com.facebook.appevents.g.h(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            j jVar = (j) this;
            int b3 = b(0, 47, jVar.size());
            if (b3 == 0) {
                hVar = f1389c;
            } else {
                hVar = new h(jVar.f1377f, jVar.g() + 0, b3);
            }
            sb3.append(com.facebook.appevents.g.h(hVar));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        objArr[2] = sb2;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
