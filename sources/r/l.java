package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f23956f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public int[] f23957b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f23958c;

    /* renamed from: d, reason: collision with root package name */
    public int f23959d;

    public l() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f23957b = new int[i13];
        this.f23958c = new Object[i13];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f23959d;
        if (i11 != 0 && i10 <= this.f23957b[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f23957b.length) {
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
            Object[] objArr = new Object[i15];
            int[] iArr2 = this.f23957b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f23958c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f23957b = iArr;
            this.f23958c = objArr;
        }
        this.f23957b[i11] = i10;
        this.f23958c[i11] = obj;
        this.f23959d = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f23957b = (int[]) this.f23957b.clone();
            lVar.f23958c = (Object[]) this.f23958c.clone();
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object c(int i10, Integer num) {
        Object obj;
        int d10 = c6.k.d(this.f23959d, i10, this.f23957b);
        if (d10 >= 0 && (obj = this.f23958c[d10]) != f23956f) {
            return obj;
        }
        return num;
    }

    public final void d(int i10, Object obj) {
        int d10 = c6.k.d(this.f23959d, i10, this.f23957b);
        if (d10 >= 0) {
            this.f23958c[d10] = obj;
            return;
        }
        int i11 = ~d10;
        int i12 = this.f23959d;
        if (i11 < i12) {
            Object[] objArr = this.f23958c;
            if (objArr[i11] == f23956f) {
                this.f23957b[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f23957b.length) {
            int i13 = (i12 + 1) * 4;
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
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f23957b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f23958c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f23957b = iArr;
            this.f23958c = objArr2;
        }
        int i17 = this.f23959d - i11;
        if (i17 != 0) {
            int[] iArr3 = this.f23957b;
            int i18 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i18, i17);
            Object[] objArr4 = this.f23958c;
            System.arraycopy(objArr4, i11, objArr4, i18, this.f23959d - i11);
        }
        this.f23957b[i11] = i10;
        this.f23958c[i11] = obj;
        this.f23959d++;
    }

    public final String toString() {
        int i10 = this.f23959d;
        if (i10 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i11 = 0; i11 < this.f23959d; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f23957b[i11]);
            sb2.append('=');
            Object obj = this.f23958c[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
