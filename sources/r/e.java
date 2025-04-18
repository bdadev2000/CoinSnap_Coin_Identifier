package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class e implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f23932g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f23933b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f23934c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f23935d;

    /* renamed from: f, reason: collision with root package name */
    public int f23936f;

    public e() {
        this(10);
    }

    public final void a() {
        int i10 = this.f23936f;
        Object[] objArr = this.f23935d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f23936f = 0;
        this.f23933b = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f23934c = (long[]) this.f23934c.clone();
            eVar.f23935d = (Object[]) this.f23935d.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i10 = this.f23936f;
        long[] jArr = this.f23934c;
        Object[] objArr = this.f23935d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f23932g) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f23933b = false;
        this.f23936f = i11;
    }

    public final Object d(long j3, Long l10) {
        Object obj;
        int e2 = c6.k.e(this.f23934c, this.f23936f, j3);
        if (e2 >= 0 && (obj = this.f23935d[e2]) != f23932g) {
            return obj;
        }
        return l10;
    }

    public final long e(int i10) {
        if (this.f23933b) {
            c();
        }
        return this.f23934c[i10];
    }

    public final void f(long j3, Object obj) {
        int e2 = c6.k.e(this.f23934c, this.f23936f, j3);
        if (e2 >= 0) {
            this.f23935d[e2] = obj;
            return;
        }
        int i10 = ~e2;
        int i11 = this.f23936f;
        if (i10 < i11) {
            Object[] objArr = this.f23935d;
            if (objArr[i10] == f23932g) {
                this.f23934c[i10] = j3;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f23933b && i11 >= this.f23934c.length) {
            c();
            i10 = ~c6.k.e(this.f23934c, this.f23936f, j3);
        }
        int i12 = this.f23936f;
        if (i12 >= this.f23934c.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f23934c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f23935d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f23934c = jArr;
            this.f23935d = objArr2;
        }
        int i17 = this.f23936f - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f23934c;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f23935d;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f23936f - i10);
        }
        this.f23934c[i10] = j3;
        this.f23935d[i10] = obj;
        this.f23936f++;
    }

    public final void g(long j3) {
        int e2 = c6.k.e(this.f23934c, this.f23936f, j3);
        if (e2 >= 0) {
            Object[] objArr = this.f23935d;
            Object obj = objArr[e2];
            Object obj2 = f23932g;
            if (obj != obj2) {
                objArr[e2] = obj2;
                this.f23933b = true;
            }
        }
    }

    public final int h() {
        if (this.f23933b) {
            c();
        }
        return this.f23936f;
    }

    public final Object i(int i10) {
        if (this.f23933b) {
            c();
        }
        return this.f23935d[i10];
    }

    public final String toString() {
        if (h() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f23936f * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.f23936f; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public e(int i10) {
        this.f23933b = false;
        if (i10 == 0) {
            this.f23934c = c6.k.f2649i;
            this.f23935d = c6.k.f2650j;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f23934c = new long[i14];
        this.f23935d = new Object[i14];
    }
}
