package w8;

import android.net.Uri;
import java.util.Arrays;
import n0.h;
import n9.h0;
import s7.i;
import v8.u0;

/* loaded from: classes3.dex */
public final class a implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final String f26901k = h0.E(0);

    /* renamed from: l, reason: collision with root package name */
    public static final String f26902l = h0.E(1);

    /* renamed from: m, reason: collision with root package name */
    public static final String f26903m = h0.E(2);

    /* renamed from: n, reason: collision with root package name */
    public static final String f26904n = h0.E(3);

    /* renamed from: o, reason: collision with root package name */
    public static final String f26905o = h0.E(4);

    /* renamed from: p, reason: collision with root package name */
    public static final String f26906p = h0.E(5);

    /* renamed from: q, reason: collision with root package name */
    public static final String f26907q = h0.E(6);

    /* renamed from: r, reason: collision with root package name */
    public static final String f26908r = h0.E(7);

    /* renamed from: s, reason: collision with root package name */
    public static final h f26909s = new h(2);

    /* renamed from: b, reason: collision with root package name */
    public final long f26910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26912d;

    /* renamed from: f, reason: collision with root package name */
    public final Uri[] f26913f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f26914g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f26915h;

    /* renamed from: i, reason: collision with root package name */
    public final long f26916i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f26917j;

    public a(long j3, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j10, boolean z10) {
        boolean z11;
        if (iArr.length == uriArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0.d(z11);
        this.f26910b = j3;
        this.f26911c = i10;
        this.f26912d = i11;
        this.f26914g = iArr;
        this.f26913f = uriArr;
        this.f26915h = jArr;
        this.f26916i = j10;
        this.f26917j = z10;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f26914g;
            if (i12 >= iArr.length || this.f26917j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26910b == aVar.f26910b && this.f26911c == aVar.f26911c && this.f26912d == aVar.f26912d && Arrays.equals(this.f26913f, aVar.f26913f) && Arrays.equals(this.f26914g, aVar.f26914g) && Arrays.equals(this.f26915h, aVar.f26915h) && this.f26916i == aVar.f26916i && this.f26917j == aVar.f26917j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f26911c * 31) + this.f26912d) * 31;
        long j3 = this.f26910b;
        int hashCode = (Arrays.hashCode(this.f26915h) + ((Arrays.hashCode(this.f26914g) + ((((i10 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f26913f)) * 31)) * 31)) * 31;
        long j10 = this.f26916i;
        return ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f26917j ? 1 : 0);
    }
}
