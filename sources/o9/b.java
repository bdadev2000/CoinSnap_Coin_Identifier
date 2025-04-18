package o9;

import java.util.Arrays;
import n9.h0;
import y7.c0;

/* loaded from: classes3.dex */
public final class b implements s7.i {

    /* renamed from: h, reason: collision with root package name */
    public static final b f23179h = new b(1, 2, 3, null);

    /* renamed from: i, reason: collision with root package name */
    public static final String f23180i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f23181j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f23182k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f23183l;

    /* renamed from: m, reason: collision with root package name */
    public static final n0.h f23184m;

    /* renamed from: b, reason: collision with root package name */
    public final int f23185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23186c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23187d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f23188f;

    /* renamed from: g, reason: collision with root package name */
    public int f23189g;

    static {
        c0 c0Var = new c0(4);
        c0Var.f27956b = 1;
        c0Var.f27957c = 1;
        c0Var.f27959e = 2;
        f23180i = h0.E(0);
        f23181j = h0.E(1);
        f23182k = h0.E(2);
        f23183l = h0.E(3);
        f23184m = new n0.h(11);
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f23185b = i10;
        this.f23186c = i11;
        this.f23187d = i12;
        this.f23188f = bArr;
    }

    public static String a(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f23185b == bVar.f23185b && this.f23186c == bVar.f23186c && this.f23187d == bVar.f23187d && Arrays.equals(this.f23188f, bVar.f23188f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f23189g == 0) {
            this.f23189g = Arrays.hashCode(this.f23188f) + ((((((527 + this.f23185b) * 31) + this.f23186c) * 31) + this.f23187d) * 31);
        }
        return this.f23189g;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        boolean z10 = true;
        int i10 = this.f23185b;
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f23186c;
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(a(this.f23187d));
        sb2.append(", ");
        if (this.f23188f == null) {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
