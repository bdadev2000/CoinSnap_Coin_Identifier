package F1;

import android.graphics.Rect;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a7.b f1106a = a7.b.u("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final a7.b b = a7.b.u("id", "layers", "w", "h", TtmlNode.TAG_P, "u");

    /* renamed from: c, reason: collision with root package name */
    public static final a7.b f1107c = a7.b.u("list");

    /* renamed from: d, reason: collision with root package name */
    public static final a7.b f1108d = a7.b.u("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static v1.i a(G1.d dVar) {
        float f9;
        ArrayList arrayList;
        float f10;
        int i9;
        float f11;
        int i10;
        float f12;
        int i11;
        float f13;
        int i12;
        ArrayList arrayList2;
        float f14;
        float c9 = H1.i.c();
        x.f fVar = new x.f();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        x.m mVar = new x.m();
        v1.i iVar = new v1.i();
        dVar.b();
        float f15 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (dVar.j()) {
            switch (dVar.q(f1106a)) {
                case 0:
                    arrayList2 = arrayList4;
                    i13 = dVar.m();
                    arrayList4 = arrayList2;
                    break;
                case 1:
                    arrayList2 = arrayList4;
                    i14 = dVar.m();
                    arrayList4 = arrayList2;
                    break;
                case 2:
                    f14 = c9;
                    arrayList2 = arrayList4;
                    f16 = (float) dVar.l();
                    c9 = f14;
                    arrayList4 = arrayList2;
                    break;
                case 3:
                    f14 = c9;
                    arrayList2 = arrayList4;
                    f15 = ((float) dVar.l()) - 0.01f;
                    c9 = f14;
                    arrayList4 = arrayList2;
                    break;
                case 4:
                    f14 = c9;
                    arrayList2 = arrayList4;
                    f17 = (float) dVar.l();
                    c9 = f14;
                    arrayList4 = arrayList2;
                    break;
                case 5:
                    f9 = c9;
                    arrayList = arrayList4;
                    f10 = f15;
                    i9 = i14;
                    f11 = f16;
                    String[] split = dVar.n().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    c9 = f9;
                    f16 = f11;
                    arrayList4 = arrayList;
                    f15 = f10;
                    i14 = i9;
                    break;
                case 6:
                    f9 = c9;
                    arrayList = arrayList4;
                    f10 = f15;
                    i9 = i14;
                    f11 = f16;
                    dVar.a();
                    int i15 = 0;
                    while (dVar.j()) {
                        D1.e a6 = r.a(dVar, iVar);
                        if (a6.f680e == 3) {
                            i15++;
                        }
                        arrayList3.add(a6);
                        fVar.f(a6.f679d, a6);
                        if (i15 > 4) {
                            H1.c.b("You have " + i15 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    dVar.c();
                    c9 = f9;
                    f16 = f11;
                    arrayList4 = arrayList;
                    f15 = f10;
                    i14 = i9;
                    break;
                case 7:
                    arrayList = arrayList4;
                    f10 = f15;
                    int i16 = i14;
                    f11 = f16;
                    dVar.a();
                    while (dVar.j()) {
                        ArrayList arrayList5 = new ArrayList();
                        x.f fVar2 = new x.f();
                        dVar.b();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (dVar.j()) {
                            int q9 = dVar.q(b);
                            if (q9 != 0) {
                                if (q9 != 1) {
                                    if (q9 != 2) {
                                        if (q9 != 3) {
                                            if (q9 != 4) {
                                                if (q9 != 5) {
                                                    dVar.r();
                                                    dVar.s();
                                                    i10 = i16;
                                                    f12 = c9;
                                                } else {
                                                    str3 = dVar.n();
                                                }
                                            } else {
                                                str2 = dVar.n();
                                            }
                                        } else {
                                            i18 = dVar.m();
                                        }
                                    } else {
                                        i17 = dVar.m();
                                    }
                                } else {
                                    dVar.a();
                                    while (dVar.j()) {
                                        D1.e a9 = r.a(dVar, iVar);
                                        fVar2.f(a9.f679d, a9);
                                        arrayList5.add(a9);
                                        c9 = c9;
                                        i16 = i16;
                                    }
                                    i10 = i16;
                                    f12 = c9;
                                    dVar.c();
                                }
                                c9 = f12;
                                i16 = i10;
                            } else {
                                str = dVar.n();
                            }
                        }
                        int i19 = i16;
                        float f18 = c9;
                        dVar.h();
                        if (str2 != null) {
                            hashMap2.put(str, new v1.w(i17, i18, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList5);
                        }
                        c9 = f18;
                        i16 = i19;
                    }
                    i9 = i16;
                    f9 = c9;
                    dVar.c();
                    c9 = f9;
                    f16 = f11;
                    arrayList4 = arrayList;
                    f15 = f10;
                    i14 = i9;
                    break;
                case 8:
                    f10 = f15;
                    int i20 = i14;
                    f11 = f16;
                    dVar.b();
                    while (dVar.j()) {
                        if (dVar.q(f1107c) != 0) {
                            dVar.r();
                            dVar.s();
                        } else {
                            dVar.a();
                            while (dVar.j()) {
                                a7.b bVar = l.f1096a;
                                dVar.b();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (dVar.j()) {
                                    int q10 = dVar.q(l.f1096a);
                                    if (q10 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (q10 != 1) {
                                            if (q10 != 2) {
                                                if (q10 != 3) {
                                                    dVar.r();
                                                    dVar.s();
                                                } else {
                                                    dVar.l();
                                                }
                                            } else {
                                                str6 = dVar.n();
                                            }
                                        } else {
                                            str5 = dVar.n();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        str4 = dVar.n();
                                    }
                                }
                                dVar.h();
                                hashMap3.put(str5, new A1.c(str4, str5, str6));
                                arrayList4 = arrayList4;
                            }
                            dVar.c();
                        }
                    }
                    arrayList = arrayList4;
                    dVar.h();
                    i9 = i20;
                    f9 = c9;
                    c9 = f9;
                    f16 = f11;
                    arrayList4 = arrayList;
                    f15 = f10;
                    i14 = i9;
                    break;
                case 9:
                    f10 = f15;
                    i11 = i14;
                    f11 = f16;
                    dVar.a();
                    while (dVar.j()) {
                        a7.b bVar2 = k.f1095a;
                        ArrayList arrayList7 = new ArrayList();
                        dVar.b();
                        double d2 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c10 = 0;
                        while (dVar.j()) {
                            int q11 = dVar.q(k.f1095a);
                            if (q11 != 0) {
                                if (q11 != 1) {
                                    if (q11 != 2) {
                                        if (q11 != 3) {
                                            if (q11 != 4) {
                                                if (q11 != 5) {
                                                    dVar.r();
                                                    dVar.s();
                                                } else {
                                                    dVar.b();
                                                    while (dVar.j()) {
                                                        if (dVar.q(k.b) != 0) {
                                                            dVar.r();
                                                            dVar.s();
                                                        } else {
                                                            dVar.a();
                                                            while (dVar.j()) {
                                                                arrayList7.add((C1.m) g.a(dVar, iVar));
                                                            }
                                                            dVar.c();
                                                        }
                                                    }
                                                    dVar.h();
                                                }
                                            } else {
                                                str8 = dVar.n();
                                            }
                                        } else {
                                            str7 = dVar.n();
                                        }
                                    } else {
                                        d2 = dVar.l();
                                    }
                                } else {
                                    dVar.l();
                                }
                            } else {
                                c10 = dVar.n().charAt(0);
                            }
                        }
                        dVar.h();
                        A1.d dVar2 = new A1.d(arrayList7, c10, d2, str7, str8);
                        mVar.d(dVar2.hashCode(), dVar2);
                    }
                    dVar.c();
                    i9 = i11;
                    f9 = c9;
                    arrayList = arrayList4;
                    c9 = f9;
                    f16 = f11;
                    arrayList4 = arrayList;
                    f15 = f10;
                    i14 = i9;
                    break;
                case 10:
                    dVar.a();
                    while (dVar.j()) {
                        dVar.b();
                        String str9 = null;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (dVar.j()) {
                            int q12 = dVar.q(f1108d);
                            if (q12 != 0) {
                                f13 = f15;
                                if (q12 != 1) {
                                    if (q12 != 2) {
                                        dVar.r();
                                        dVar.s();
                                    } else {
                                        i12 = i14;
                                        f16 = f16;
                                        f20 = (float) dVar.l();
                                    }
                                } else {
                                    i12 = i14;
                                    f16 = f16;
                                    f19 = (float) dVar.l();
                                }
                                f15 = f13;
                                i14 = i12;
                            } else {
                                f13 = f15;
                                str9 = dVar.n();
                            }
                            f15 = f13;
                        }
                        dVar.h();
                        arrayList4.add(new A1.h(str9, f19, f20));
                        i14 = i14;
                        f16 = f16;
                        f15 = f15;
                    }
                    f10 = f15;
                    i11 = i14;
                    f11 = f16;
                    dVar.c();
                    i9 = i11;
                    f9 = c9;
                    arrayList = arrayList4;
                    c9 = f9;
                    f16 = f11;
                    arrayList4 = arrayList;
                    f15 = f10;
                    i14 = i9;
                    break;
                default:
                    dVar.r();
                    dVar.s();
                    f9 = c9;
                    arrayList = arrayList4;
                    f10 = f15;
                    i9 = i14;
                    f11 = f16;
                    c9 = f9;
                    f16 = f11;
                    arrayList4 = arrayList;
                    f15 = f10;
                    i14 = i9;
                    break;
            }
        }
        float f21 = c9;
        Rect rect = new Rect(0, 0, (int) (i13 * f21), (int) (i14 * f21));
        float c11 = H1.i.c();
        iVar.f23493k = rect;
        iVar.l = f16;
        iVar.m = f15;
        iVar.f23494n = f17;
        iVar.f23492j = arrayList3;
        iVar.f23491i = fVar;
        iVar.f23485c = hashMap;
        iVar.f23486d = hashMap2;
        iVar.f23487e = c11;
        iVar.f23490h = mVar;
        iVar.f23488f = hashMap3;
        iVar.f23489g = arrayList4;
        return iVar;
    }
}
