package x;

import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes.dex */
public final class f implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f24069g = new Object();
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f24070c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f24071d;

    /* renamed from: f, reason: collision with root package name */
    public int f24072f;

    public f() {
        this(10);
    }

    public final void a() {
        int i9 = this.f24072f;
        Object[] objArr = this.f24071d;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.f24072f = 0;
        this.b = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            f fVar = (f) super.clone();
            fVar.f24070c = (long[]) this.f24070c.clone();
            fVar.f24071d = (Object[]) this.f24071d.clone();
            return fVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void c() {
        int i9 = this.f24072f;
        long[] jArr = this.f24070c;
        Object[] objArr = this.f24071d;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (obj != f24069g) {
                if (i11 != i10) {
                    jArr[i10] = jArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.b = false;
        this.f24072f = i10;
    }

    public final Object d(Long l, long j7) {
        Object obj;
        int b = e.b(this.f24070c, this.f24072f, j7);
        if (b >= 0 && (obj = this.f24071d[b]) != f24069g) {
            return obj;
        }
        return l;
    }

    public final long e(int i9) {
        if (this.b) {
            c();
        }
        return this.f24070c[i9];
    }

    public final void f(long j7, Object obj) {
        int b = e.b(this.f24070c, this.f24072f, j7);
        if (b >= 0) {
            this.f24071d[b] = obj;
            return;
        }
        int i9 = ~b;
        int i10 = this.f24072f;
        if (i9 < i10) {
            Object[] objArr = this.f24071d;
            if (objArr[i9] == f24069g) {
                this.f24070c[i9] = j7;
                objArr[i9] = obj;
                return;
            }
        }
        if (this.b && i10 >= this.f24070c.length) {
            c();
            i9 = ~e.b(this.f24070c, this.f24072f, j7);
        }
        int i11 = this.f24072f;
        if (i11 >= this.f24070c.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr2 = new Object[i15];
            long[] jArr2 = this.f24070c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f24071d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f24070c = jArr;
            this.f24071d = objArr2;
        }
        int i16 = this.f24072f - i9;
        if (i16 != 0) {
            long[] jArr3 = this.f24070c;
            int i17 = i9 + 1;
            System.arraycopy(jArr3, i9, jArr3, i17, i16);
            Object[] objArr4 = this.f24071d;
            System.arraycopy(objArr4, i9, objArr4, i17, this.f24072f - i9);
        }
        this.f24070c[i9] = j7;
        this.f24071d[i9] = obj;
        this.f24072f++;
    }

    public final void g(long j7) {
        int b = e.b(this.f24070c, this.f24072f, j7);
        if (b >= 0) {
            Object[] objArr = this.f24071d;
            Object obj = objArr[b];
            Object obj2 = f24069g;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.b = true;
            }
        }
    }

    public final int h() {
        if (this.b) {
            c();
        }
        return this.f24072f;
    }

    public final Object i(int i9) {
        if (this.b) {
            c();
        }
        return this.f24071d[i9];
    }

    public final String toString() {
        if (h() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f24072f * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.f24072f; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(e(i9));
            sb.append('=');
            Object i10 = i(i9);
            if (i10 != this) {
                sb.append(i10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public f(int i9) {
        this.b = false;
        if (i9 == 0) {
            this.f24070c = e.b;
            this.f24071d = e.f24068c;
            return;
        }
        int i10 = i9 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f24070c = new long[i13];
        this.f24071d = new Object[i13];
    }
}
