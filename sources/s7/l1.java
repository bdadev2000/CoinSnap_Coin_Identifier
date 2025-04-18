package s7;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.view.MotionEventCompat;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l1 implements i {
    public static final l1 K = new l1(new k1());
    public static final String L = n9.h0.E(0);
    public static final String M = n9.h0.E(1);
    public static final String N = n9.h0.E(2);
    public static final String O = n9.h0.E(3);
    public static final String P = n9.h0.E(4);
    public static final String Q = n9.h0.E(5);
    public static final String R = n9.h0.E(6);
    public static final String S = n9.h0.E(8);
    public static final String T = n9.h0.E(9);
    public static final String U = n9.h0.E(10);
    public static final String V = n9.h0.E(11);
    public static final String W = n9.h0.E(12);
    public static final String X = n9.h0.E(13);
    public static final String Y = n9.h0.E(14);
    public static final String Z = n9.h0.E(15);

    /* renamed from: a0, reason: collision with root package name */
    public static final String f24516a0 = n9.h0.E(16);

    /* renamed from: b0, reason: collision with root package name */
    public static final String f24517b0 = n9.h0.E(17);

    /* renamed from: c0, reason: collision with root package name */
    public static final String f24518c0 = n9.h0.E(18);

    /* renamed from: d0, reason: collision with root package name */
    public static final String f24519d0 = n9.h0.E(19);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f24520e0 = n9.h0.E(20);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f24521f0 = n9.h0.E(21);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f24522g0 = n9.h0.E(22);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f24523h0 = n9.h0.E(23);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f24524i0 = n9.h0.E(24);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f24525j0 = n9.h0.E(25);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f24526k0 = n9.h0.E(26);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f24527l0 = n9.h0.E(27);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f24528m0 = n9.h0.E(28);

    /* renamed from: n0, reason: collision with root package name */
    public static final String f24529n0 = n9.h0.E(29);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f24530o0 = n9.h0.E(30);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f24531p0 = n9.h0.E(31);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f24532q0 = n9.h0.E(32);

    /* renamed from: r0, reason: collision with root package name */
    public static final String f24533r0 = n9.h0.E(1000);

    /* renamed from: s0, reason: collision with root package name */
    public static final nb.a f24534s0 = new nb.a(2);
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final Integer D;
    public final Integer E;
    public final CharSequence F;
    public final CharSequence G;
    public final CharSequence H;
    public final Integer I;
    public final Bundle J;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f24535b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f24536c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f24537d;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f24538f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f24539g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f24540h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f24541i;

    /* renamed from: j, reason: collision with root package name */
    public final m2 f24542j;

    /* renamed from: k, reason: collision with root package name */
    public final m2 f24543k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f24544l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f24545m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f24546n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f24547o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f24548p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f24549q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f24550r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f24551s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f24552t;
    public final Integer u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f24553v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f24554w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f24555x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f24556y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f24557z;

    public l1(k1 k1Var) {
        Boolean bool = k1Var.f24485p;
        Integer num = k1Var.f24484o;
        Integer num2 = k1Var.F;
        int i10 = 1;
        int i11 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case TEMPLATE_HTML_SIZE_VALUE:
                        case 32:
                        case 33:
                        case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case NOTIFICATION_REDIRECT_VALUE:
                        case 30:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i11 = i10;
                }
                num = Integer.valueOf(i11);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                num2 = Integer.valueOf(i11);
            }
        }
        this.f24535b = k1Var.a;
        this.f24536c = k1Var.f24471b;
        this.f24537d = k1Var.f24472c;
        this.f24538f = k1Var.f24473d;
        this.f24539g = k1Var.f24474e;
        this.f24540h = k1Var.f24475f;
        this.f24541i = k1Var.f24476g;
        this.f24542j = k1Var.f24477h;
        this.f24543k = k1Var.f24478i;
        this.f24544l = k1Var.f24479j;
        this.f24545m = k1Var.f24480k;
        this.f24546n = k1Var.f24481l;
        this.f24547o = k1Var.f24482m;
        this.f24548p = k1Var.f24483n;
        this.f24549q = num;
        this.f24550r = bool;
        this.f24551s = k1Var.f24486q;
        Integer num3 = k1Var.f24487r;
        this.f24552t = num3;
        this.u = num3;
        this.f24553v = k1Var.f24488s;
        this.f24554w = k1Var.f24489t;
        this.f24555x = k1Var.u;
        this.f24556y = k1Var.f24490v;
        this.f24557z = k1Var.f24491w;
        this.A = k1Var.f24492x;
        this.B = k1Var.f24493y;
        this.C = k1Var.f24494z;
        this.D = k1Var.A;
        this.E = k1Var.B;
        this.F = k1Var.C;
        this.G = k1Var.D;
        this.H = k1Var.E;
        this.I = num2;
        this.J = k1Var.G;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (n9.h0.a(this.f24535b, l1Var.f24535b) && n9.h0.a(this.f24536c, l1Var.f24536c) && n9.h0.a(this.f24537d, l1Var.f24537d) && n9.h0.a(this.f24538f, l1Var.f24538f) && n9.h0.a(this.f24539g, l1Var.f24539g) && n9.h0.a(this.f24540h, l1Var.f24540h) && n9.h0.a(this.f24541i, l1Var.f24541i) && n9.h0.a(this.f24542j, l1Var.f24542j) && n9.h0.a(this.f24543k, l1Var.f24543k) && Arrays.equals(this.f24544l, l1Var.f24544l) && n9.h0.a(this.f24545m, l1Var.f24545m) && n9.h0.a(this.f24546n, l1Var.f24546n) && n9.h0.a(this.f24547o, l1Var.f24547o) && n9.h0.a(this.f24548p, l1Var.f24548p) && n9.h0.a(this.f24549q, l1Var.f24549q) && n9.h0.a(this.f24550r, l1Var.f24550r) && n9.h0.a(this.f24551s, l1Var.f24551s) && n9.h0.a(this.u, l1Var.u) && n9.h0.a(this.f24553v, l1Var.f24553v) && n9.h0.a(this.f24554w, l1Var.f24554w) && n9.h0.a(this.f24555x, l1Var.f24555x) && n9.h0.a(this.f24556y, l1Var.f24556y) && n9.h0.a(this.f24557z, l1Var.f24557z) && n9.h0.a(this.A, l1Var.A) && n9.h0.a(this.B, l1Var.B) && n9.h0.a(this.C, l1Var.C) && n9.h0.a(this.D, l1Var.D) && n9.h0.a(this.E, l1Var.E) && n9.h0.a(this.F, l1Var.F) && n9.h0.a(this.G, l1Var.G) && n9.h0.a(this.H, l1Var.H) && n9.h0.a(this.I, l1Var.I)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24535b, this.f24536c, this.f24537d, this.f24538f, this.f24539g, this.f24540h, this.f24541i, this.f24542j, this.f24543k, Integer.valueOf(Arrays.hashCode(this.f24544l)), this.f24545m, this.f24546n, this.f24547o, this.f24548p, this.f24549q, this.f24550r, this.f24551s, this.u, this.f24553v, this.f24554w, this.f24555x, this.f24556y, this.f24557z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I});
    }
}
