package w8;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import n0.h;
import n9.h0;
import s7.i;

/* loaded from: classes3.dex */
public final class b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final b f26918i = new b(null, new a[0], 0, C.TIME_UNSET, 0);

    /* renamed from: j, reason: collision with root package name */
    public static final a f26919j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f26920k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f26921l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f26922m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f26923n;

    /* renamed from: o, reason: collision with root package name */
    public static final h f26924o;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26926c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26927d;

    /* renamed from: f, reason: collision with root package name */
    public final long f26928f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26929g;

    /* renamed from: h, reason: collision with root package name */
    public final a[] f26930h;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f26914g;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f26915h;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, C.TIME_UNSET);
        f26919j = new a(aVar.f26910b, 0, aVar.f26912d, copyOf, (Uri[]) Arrays.copyOf(aVar.f26913f, 0), copyOf2, aVar.f26916i, aVar.f26917j);
        f26920k = h0.E(1);
        f26921l = h0.E(2);
        f26922m = h0.E(3);
        f26923n = h0.E(4);
        f26924o = new h(1);
    }

    public b(Object obj, a[] aVarArr, long j3, long j10, int i10) {
        this.f26925b = obj;
        this.f26927d = j3;
        this.f26928f = j10;
        this.f26926c = aVarArr.length + i10;
        this.f26930h = aVarArr;
        this.f26929g = i10;
    }

    public final a a(int i10) {
        int i11 = this.f26929g;
        if (i10 < i11) {
            return f26919j;
        }
        return this.f26930h[i10 - i11];
    }

    public final boolean b(int i10) {
        boolean z10;
        if (i10 == this.f26926c - 1) {
            a a = a(i10);
            if (a.f26917j && a.f26910b == Long.MIN_VALUE && a.f26911c == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (h0.a(this.f26925b, bVar.f26925b) && this.f26926c == bVar.f26926c && this.f26927d == bVar.f26927d && this.f26928f == bVar.f26928f && this.f26929g == bVar.f26929g && Arrays.equals(this.f26930h, bVar.f26930h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f26926c * 31;
        Object obj = this.f26925b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i10 + hashCode) * 31) + ((int) this.f26927d)) * 31) + ((int) this.f26928f)) * 31) + this.f26929g) * 31) + Arrays.hashCode(this.f26930h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f26925b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f26927d);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f26930h;
            if (i10 < aVarArr.length) {
                sb2.append("adGroup(timeUs=");
                sb2.append(aVarArr[i10].f26910b);
                sb2.append(", ads=[");
                for (int i11 = 0; i11 < aVarArr[i10].f26914g.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = aVarArr[i10].f26914g[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(aVarArr[i10].f26915h[i11]);
                    sb2.append(')');
                    if (i11 < aVarArr[i10].f26914g.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i10 < aVarArr.length - 1) {
                    sb2.append(", ");
                }
                i10++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
