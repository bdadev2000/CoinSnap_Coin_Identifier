package F1;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a7.b f1104a = a7.b.u("nm", "ind", "refId", "ty", "parent", "sw", com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final a7.b b = a7.b.u("d", "a");

    /* renamed from: c, reason: collision with root package name */
    public static final a7.b f1105c = a7.b.u("ty", "nm");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x005e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r1v64, types: [int[]] */
    /* JADX WARN: Type inference failed for: r27v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v58, types: [F1.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21 */
    public static D1.e a(G1.d dVar, v1.i iVar) {
        ArrayList arrayList;
        String str;
        B1.d dVar2;
        boolean z8;
        boolean z9;
        ?? r13;
        ?? r9;
        ?? r22;
        B1.b bVar;
        B1.b bVar2;
        B1.b bVar3;
        B1.b bVar4;
        ?? r42;
        int i9 = 3;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        dVar.b();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        boolean z10 = false;
        boolean z11 = true;
        String str2 = "UNSET";
        long j7 = 0;
        float f9 = 1.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i13 = 1;
        boolean z14 = true;
        long j9 = -1;
        String str3 = null;
        String str4 = null;
        B1.a aVar = null;
        U4.y yVar = null;
        B1.b bVar5 = null;
        E1.c cVar = null;
        i iVar2 = null;
        B1.d dVar3 = null;
        float f14 = 0.0f;
        int i14 = 0;
        while (dVar.j()) {
            switch (dVar.q(f1104a)) {
                case 0:
                    str2 = dVar.n();
                    z11 = true;
                    break;
                case 1:
                    j7 = dVar.m();
                    z11 = true;
                    break;
                case 2:
                    str4 = dVar.n();
                    z11 = true;
                    break;
                case 3:
                    z8 = z10;
                    int m = dVar.m();
                    i14 = 7;
                    if (m < 6) {
                        i14 = AbstractC2965e.e(7)[m];
                    }
                    z10 = z8;
                    z11 = true;
                    break;
                case 4:
                    j9 = dVar.m();
                    z11 = true;
                    break;
                case 5:
                    z9 = z11;
                    i10 = (int) (H1.i.c() * dVar.m());
                    z11 = z9;
                    break;
                case 6:
                    z9 = z11;
                    i11 = (int) (H1.i.c() * dVar.m());
                    z11 = z9;
                    break;
                case 7:
                    z9 = z11;
                    i12 = Color.parseColor(dVar.n());
                    z11 = z9;
                    break;
                case 8:
                    z9 = z11;
                    dVar3 = AbstractC0205c.a(dVar, iVar);
                    z11 = z9;
                    break;
                case 9:
                    z8 = z10;
                    int m2 = dVar.m();
                    if (m2 >= AbstractC2965e.e(6).length) {
                        iVar.a("Unsupported matte type: " + m2);
                        z10 = z8;
                        z11 = true;
                        break;
                    } else {
                        i13 = AbstractC2965e.e(6)[m2];
                        int d2 = AbstractC2965e.d(i13);
                        if (d2 != 3) {
                            if (d2 == 4) {
                                iVar.a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            iVar.a("Unsupported matte type: Luma");
                        }
                        z9 = true;
                        iVar.f23496p++;
                        z10 = z8;
                        z11 = z9;
                        break;
                    }
                case 10:
                    B1.a aVar2 = null;
                    dVar.a();
                    while (dVar.j()) {
                        dVar.b();
                        B1.a aVar3 = aVar2;
                        B1.a aVar4 = aVar3;
                        boolean z15 = false;
                        int i15 = 0;
                        while (dVar.j()) {
                            String C8 = dVar.C();
                            C8.getClass();
                            switch (C8.hashCode()) {
                                case 111:
                                    if (C8.equals("o")) {
                                        r13 = 0;
                                        break;
                                    }
                                    break;
                                case 3588:
                                    if (C8.equals("pt")) {
                                        r13 = z11;
                                        break;
                                    }
                                    break;
                                case 104433:
                                    if (C8.equals("inv")) {
                                        r13 = 2;
                                        break;
                                    }
                                    break;
                                case 3357091:
                                    if (C8.equals("mode")) {
                                        r13 = 3;
                                        break;
                                    }
                                    break;
                            }
                            r13 = -1;
                            switch (r13) {
                                case 0:
                                    aVar4 = com.facebook.appevents.n.q(dVar, iVar);
                                    break;
                                case 1:
                                    aVar3 = new B1.a(q.a(dVar, iVar, H1.i.c(), y.b, false), 5);
                                    break;
                                case 2:
                                    z15 = dVar.k();
                                    break;
                                case 3:
                                    String n2 = dVar.n();
                                    n2.getClass();
                                    switch (n2.hashCode()) {
                                        case 97:
                                            if (n2.equals("a")) {
                                                r9 = 0;
                                                break;
                                            }
                                            break;
                                        case 105:
                                            if (n2.equals(com.mbridge.msdk.foundation.same.report.i.f15948a)) {
                                                r9 = z11;
                                                break;
                                            }
                                            break;
                                        case 110:
                                            if (n2.equals("n")) {
                                                r9 = 2;
                                                break;
                                            }
                                            break;
                                        case 115:
                                            if (n2.equals("s")) {
                                                r9 = 3;
                                                break;
                                            }
                                            break;
                                    }
                                    r9 = -1;
                                    switch (r9) {
                                        case 0:
                                            break;
                                        case 1:
                                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            r22 = 3;
                                            break;
                                        case 2:
                                            r22 = 4;
                                            break;
                                        case 3:
                                            r22 = 2;
                                            break;
                                        default:
                                            H1.c.b("Unknown mask mode " + C8 + ". Defaulting to Add.");
                                            break;
                                    }
                                    r22 = z11;
                                    i15 = r22;
                                    break;
                                default:
                                    dVar.s();
                                    break;
                            }
                            z11 = true;
                        }
                        dVar.h();
                        arrayList2.add(new C1.f(i15, aVar3, aVar4, z15));
                        aVar2 = null;
                        z11 = true;
                    }
                    z8 = false;
                    iVar.f23496p += arrayList2.size();
                    dVar.c();
                    z10 = z8;
                    z11 = true;
                    break;
                case 11:
                    dVar.a();
                    while (dVar.j()) {
                        C1.b a6 = g.a(dVar, iVar);
                        if (a6 != null) {
                            arrayList3.add(a6);
                        }
                    }
                    dVar.c();
                    z8 = false;
                    z10 = z8;
                    z11 = true;
                    break;
                case 12:
                    dVar.b();
                    while (dVar.j()) {
                        int q9 = dVar.q(b);
                        if (q9 != 0) {
                            if (q9 != z11) {
                                dVar.r();
                                dVar.s();
                            } else {
                                dVar.a();
                                if (dVar.j()) {
                                    a7.b bVar6 = AbstractC0204b.f1072a;
                                    dVar.b();
                                    U4.y yVar2 = null;
                                    while (dVar.j()) {
                                        if (dVar.q(AbstractC0204b.f1072a) != 0) {
                                            dVar.r();
                                            dVar.s();
                                        } else {
                                            dVar.b();
                                            B1.a aVar5 = null;
                                            B1.a aVar6 = null;
                                            B1.b bVar7 = null;
                                            B1.b bVar8 = null;
                                            while (dVar.j()) {
                                                int q10 = dVar.q(AbstractC0204b.b);
                                                if (q10 != 0) {
                                                    if (q10 != z11) {
                                                        if (q10 != 2) {
                                                            if (q10 != 3) {
                                                                dVar.r();
                                                                dVar.s();
                                                            } else {
                                                                bVar8 = com.facebook.appevents.n.o(dVar, iVar, z11);
                                                            }
                                                        } else {
                                                            bVar7 = com.facebook.appevents.n.o(dVar, iVar, z11);
                                                        }
                                                    } else {
                                                        aVar6 = com.facebook.appevents.n.n(dVar, iVar);
                                                    }
                                                } else {
                                                    aVar5 = com.facebook.appevents.n.n(dVar, iVar);
                                                }
                                            }
                                            dVar.h();
                                            yVar2 = new U4.y(aVar5, aVar6, bVar7, bVar8);
                                        }
                                    }
                                    dVar.h();
                                    if (yVar2 == null) {
                                        yVar2 = new U4.y(null, null, null, null);
                                    }
                                    yVar = yVar2;
                                }
                                while (dVar.j()) {
                                    dVar.s();
                                }
                                dVar.c();
                            }
                        } else {
                            aVar = new B1.a(q.a(dVar, iVar, H1.i.c(), h.b, false), 6);
                        }
                    }
                    dVar.h();
                    z10 = false;
                    break;
                case 13:
                    dVar.a();
                    ArrayList arrayList4 = new ArrayList();
                    while (dVar.j()) {
                        dVar.b();
                        while (dVar.j()) {
                            int q11 = dVar.q(f1105c);
                            if (q11 != 0) {
                                if (q11 != z11) {
                                    dVar.r();
                                    dVar.s();
                                } else {
                                    arrayList4.add(dVar.n());
                                }
                            } else {
                                int m6 = dVar.m();
                                if (m6 == 29) {
                                    a7.b bVar9 = AbstractC0206d.f1074a;
                                    cVar = null;
                                    while (dVar.j()) {
                                        if (dVar.q(AbstractC0206d.f1074a) != 0) {
                                            dVar.r();
                                            dVar.s();
                                        } else {
                                            dVar.a();
                                            while (dVar.j()) {
                                                dVar.b();
                                                boolean z16 = z10;
                                                E1.c cVar2 = null;
                                                while (dVar.j()) {
                                                    int q12 = dVar.q(AbstractC0206d.b);
                                                    if (q12 != 0) {
                                                        if (q12 != z11) {
                                                            dVar.r();
                                                            dVar.s();
                                                        } else if (z16) {
                                                            cVar2 = new E1.c(com.facebook.appevents.n.o(dVar, iVar, z11), i9);
                                                        } else {
                                                            dVar.s();
                                                        }
                                                    } else if (dVar.m() == 0) {
                                                        z16 = z11;
                                                    } else {
                                                        z16 = z10;
                                                    }
                                                }
                                                dVar.h();
                                                if (cVar2 != null) {
                                                    cVar = cVar2;
                                                }
                                            }
                                            dVar.c();
                                        }
                                    }
                                } else if (m6 == 25) {
                                    ?? obj = new Object();
                                    while (dVar.j()) {
                                        if (dVar.q(j.f1089f) != 0) {
                                            dVar.r();
                                            dVar.s();
                                        } else {
                                            dVar.a();
                                            while (dVar.j()) {
                                                dVar.b();
                                                String str5 = "";
                                                while (dVar.j()) {
                                                    int q13 = dVar.q(j.f1090g);
                                                    if (q13 != 0) {
                                                        if (q13 != z11) {
                                                            dVar.r();
                                                            dVar.s();
                                                        } else {
                                                            str5.getClass();
                                                            switch (str5.hashCode()) {
                                                                case 353103893:
                                                                    if (str5.equals("Distance")) {
                                                                        r42 = z10;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 397447147:
                                                                    if (str5.equals("Opacity")) {
                                                                        r42 = z11;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1041377119:
                                                                    if (str5.equals("Direction")) {
                                                                        r42 = 2;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1379387491:
                                                                    if (str5.equals("Shadow Color")) {
                                                                        r42 = 3;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1383710113:
                                                                    if (str5.equals("Softness")) {
                                                                        r42 = 4;
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                            r42 = -1;
                                                            switch (r42) {
                                                                case 0:
                                                                    obj.f1093d = com.facebook.appevents.n.o(dVar, iVar, z11);
                                                                    break;
                                                                case 1:
                                                                    obj.b = com.facebook.appevents.n.o(dVar, iVar, z10);
                                                                    break;
                                                                case 2:
                                                                    obj.f1092c = com.facebook.appevents.n.o(dVar, iVar, z10);
                                                                    break;
                                                                case 3:
                                                                    obj.f1091a = com.facebook.appevents.n.n(dVar, iVar);
                                                                    break;
                                                                case 4:
                                                                    obj.f1094e = com.facebook.appevents.n.o(dVar, iVar, z11);
                                                                    break;
                                                                default:
                                                                    dVar.s();
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        str5 = dVar.n();
                                                    }
                                                }
                                                dVar.h();
                                            }
                                            dVar.c();
                                        }
                                    }
                                    B1.a aVar7 = obj.f1091a;
                                    if (aVar7 != null && (bVar = obj.b) != null && (bVar2 = obj.f1092c) != null && (bVar3 = obj.f1093d) != null && (bVar4 = obj.f1094e) != null) {
                                        iVar2 = new i(aVar7, bVar, bVar2, bVar3, bVar4);
                                    } else {
                                        iVar2 = null;
                                    }
                                }
                            }
                            z10 = false;
                        }
                        dVar.h();
                        z10 = false;
                    }
                    dVar.c();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    z10 = false;
                    break;
                case 14:
                    f9 = (float) dVar.l();
                    z14 = z14;
                    break;
                case 15:
                    f10 = (float) dVar.l();
                    z14 = z14;
                    break;
                case 16:
                    f11 = (float) (dVar.l() * H1.i.c());
                    z14 = z14;
                    break;
                case 17:
                    f12 = (float) (dVar.l() * H1.i.c());
                    z14 = z14;
                    break;
                case 18:
                    f14 = (float) dVar.l();
                    z14 = z14;
                    break;
                case 19:
                    f13 = (float) dVar.l();
                    z14 = z14;
                    break;
                case 20:
                    bVar5 = com.facebook.appevents.n.o(dVar, iVar, z10);
                    z14 = z14;
                    break;
                case 21:
                    str3 = dVar.n();
                    z14 = z14;
                    break;
                case 22:
                    z12 = dVar.k();
                    z14 = z14;
                    break;
                case 23:
                    if (dVar.m() == z11) {
                        z13 = z11;
                        z14 = z14;
                    } else {
                        z13 = z10;
                        z14 = z14;
                    }
                    break;
                case 24:
                    int m7 = dVar.m();
                    if (m7 >= AbstractC2965e.e(18).length) {
                        iVar.a("Unsupported Blend Mode: " + m7);
                        z14 = z11;
                    } else {
                        z14 = AbstractC2965e.e(18)[m7];
                    }
                    break;
                default:
                    dVar.r();
                    dVar.s();
                    z8 = z10;
                    z10 = z8;
                    z11 = true;
                    break;
            }
        }
        dVar.h();
        ArrayList arrayList5 = new ArrayList();
        if (f14 > 0.0f) {
            arrayList = arrayList2;
            str = str3;
            arrayList5.add(new I1.a(iVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f14)));
        } else {
            arrayList = arrayList2;
            str = str3;
        }
        if (f13 <= 0.0f) {
            f13 = iVar.m;
        }
        arrayList5.add(new I1.a(iVar, valueOf2, valueOf2, (Interpolator) null, f14, Float.valueOf(f13)));
        arrayList5.add(new I1.a(iVar, valueOf, valueOf, (Interpolator) null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        boolean z17 = z13;
        if (z17) {
            if (dVar3 == null) {
                dVar3 = new B1.d();
            }
            B1.d dVar4 = dVar3;
            dVar4.f272j = z17;
            dVar2 = dVar4;
        } else {
            dVar2 = dVar3;
        }
        return new D1.e(arrayList3, iVar, str2, j7, i14, j9, str4, arrayList, dVar2, i10, i11, i12, f9, f10, f11, f12, aVar, yVar, arrayList5, i13, bVar5, z12, cVar, iVar2, z14);
    }
}
