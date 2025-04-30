package x;

import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes.dex */
public final class m implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f24087f = new Object();
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f24088c;

    /* renamed from: d, reason: collision with root package name */
    public int f24089d;

    public m() {
        int i9;
        int i10 = 4;
        while (true) {
            i9 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 4;
        this.b = new int[i12];
        this.f24088c = new Object[i12];
    }

    public final void a(int i9, Object obj) {
        int i10 = this.f24089d;
        if (i10 != 0 && i9 <= this.b[i10 - 1]) {
            d(i9, obj);
            return;
        }
        if (i10 >= this.b.length) {
            int i11 = (i10 + 1) * 4;
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
            int i14 = i11 / 4;
            int[] iArr = new int[i14];
            Object[] objArr = new Object[i14];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f24088c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = iArr;
            this.f24088c = objArr;
        }
        this.b[i10] = i9;
        this.f24088c[i10] = obj;
        this.f24089d = i10 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.b = (int[]) this.b.clone();
            mVar.f24088c = (Object[]) this.f24088c.clone();
            return mVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final Object c(int i9, Integer num) {
        Object obj;
        int a6 = e.a(this.f24089d, i9, this.b);
        if (a6 >= 0 && (obj = this.f24088c[a6]) != f24087f) {
            return obj;
        }
        return num;
    }

    public final void d(int i9, Object obj) {
        int a6 = e.a(this.f24089d, i9, this.b);
        if (a6 >= 0) {
            this.f24088c[a6] = obj;
            return;
        }
        int i10 = ~a6;
        int i11 = this.f24089d;
        if (i10 < i11) {
            Object[] objArr = this.f24088c;
            if (objArr[i10] == f24087f) {
                this.b[i10] = i9;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.b.length) {
            int i12 = (i11 + 1) * 4;
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
            int i15 = i12 / 4;
            int[] iArr = new int[i15];
            Object[] objArr2 = new Object[i15];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f24088c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = iArr;
            this.f24088c = objArr2;
        }
        int i16 = this.f24089d - i10;
        if (i16 != 0) {
            int[] iArr3 = this.b;
            int i17 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i17, i16);
            Object[] objArr4 = this.f24088c;
            System.arraycopy(objArr4, i10, objArr4, i17, this.f24089d - i10);
        }
        this.b[i10] = i9;
        this.f24088c[i10] = obj;
        this.f24089d++;
    }

    public final String toString() {
        int i9 = this.f24089d;
        if (i9 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(i9 * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f24089d; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(this.b[i10]);
            sb.append('=');
            Object obj = this.f24088c[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
