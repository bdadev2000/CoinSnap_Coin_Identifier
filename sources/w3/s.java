package w3;

import android.graphics.Rect;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class s {
    public static final d3.g a = d3.g.z("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final d3.g f26719b = d3.g.z("id", "layers", "w", "h", TtmlNode.TAG_P, "u");

    /* renamed from: c, reason: collision with root package name */
    public static final d3.g f26720c = d3.g.z("list");

    /* renamed from: d, reason: collision with root package name */
    public static final d3.g f26721d = d3.g.z("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0046. Please report as an issue. */
    public static m3.j a(x3.c cVar) {
        ArrayList arrayList;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        ArrayList arrayList2;
        float f14;
        float f15;
        float c10 = y3.h.c();
        r.e eVar = new r.e();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        r.l lVar = new r.l();
        m3.j jVar = new m3.j();
        cVar.g();
        int i12 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        int i13 = 0;
        while (cVar.p()) {
            float f19 = f16;
            switch (cVar.w(a)) {
                case 0:
                    arrayList2 = arrayList4;
                    f14 = f17;
                    f15 = f18;
                    i13 = cVar.s();
                    f16 = f19;
                    f17 = f14;
                    arrayList4 = arrayList2;
                    f18 = f15;
                    break;
                case 1:
                    arrayList2 = arrayList4;
                    f14 = f17;
                    f15 = f18;
                    i12 = cVar.s();
                    f16 = f19;
                    f17 = f14;
                    arrayList4 = arrayList2;
                    f18 = f15;
                    break;
                case 2:
                    arrayList = arrayList4;
                    i10 = i13;
                    f17 = (float) cVar.r();
                    f16 = f19;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 3:
                    arrayList = arrayList4;
                    i10 = i13;
                    f18 = ((float) cVar.r()) - 0.01f;
                    f16 = f19;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 4:
                    arrayList = arrayList4;
                    i10 = i13;
                    f16 = (float) cVar.r();
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 5:
                    arrayList = arrayList4;
                    f10 = f17;
                    f11 = f18;
                    i10 = i13;
                    String[] split = cVar.t().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    boolean z10 = true;
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        z10 = false;
                    }
                    if (!z10) {
                        jVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f16 = f19;
                    f17 = f10;
                    f18 = f11;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 6:
                    arrayList = arrayList4;
                    f10 = f17;
                    f11 = f18;
                    i10 = i13;
                    cVar.d();
                    int i14 = 0;
                    while (cVar.p()) {
                        u3.e a10 = r.a(cVar, jVar);
                        if (a10.f25506e == 3) {
                            i14++;
                        }
                        arrayList3.add(a10);
                        eVar.f(a10.f25505d, a10);
                        if (i14 > 4) {
                            y3.b.b("You have " + i14 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    cVar.j();
                    f16 = f19;
                    f17 = f10;
                    f18 = f11;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 7:
                    arrayList = arrayList4;
                    f10 = f17;
                    f11 = f18;
                    cVar.d();
                    while (cVar.p()) {
                        ArrayList arrayList5 = new ArrayList();
                        r.e eVar2 = new r.e();
                        cVar.g();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (cVar.p()) {
                            int w10 = cVar.w(f26719b);
                            if (w10 != 0) {
                                if (w10 != 1) {
                                    if (w10 != 2) {
                                        if (w10 != 3) {
                                            if (w10 != 4) {
                                                if (w10 != 5) {
                                                    cVar.x();
                                                    cVar.T();
                                                    i11 = i13;
                                                } else {
                                                    str3 = cVar.t();
                                                }
                                            } else {
                                                str2 = cVar.t();
                                            }
                                        } else {
                                            i16 = cVar.s();
                                        }
                                    } else {
                                        i15 = cVar.s();
                                    }
                                } else {
                                    cVar.d();
                                    while (cVar.p()) {
                                        u3.e a11 = r.a(cVar, jVar);
                                        eVar2.f(a11.f25505d, a11);
                                        arrayList5.add(a11);
                                        i13 = i13;
                                    }
                                    i11 = i13;
                                    cVar.j();
                                }
                                i13 = i11;
                            } else {
                                str = cVar.t();
                            }
                        }
                        int i17 = i13;
                        cVar.k();
                        if (str2 != null) {
                            hashMap2.put(str, new m3.y(i15, i16, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList5);
                        }
                        i13 = i17;
                    }
                    i10 = i13;
                    cVar.j();
                    f16 = f19;
                    f17 = f10;
                    f18 = f11;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 8:
                    f10 = f17;
                    f11 = f18;
                    cVar.g();
                    while (cVar.p()) {
                        if (cVar.w(f26720c) != 0) {
                            cVar.x();
                            cVar.T();
                        } else {
                            cVar.d();
                            while (cVar.p()) {
                                d3.g gVar = k.a;
                                cVar.g();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (cVar.p()) {
                                    int w11 = cVar.w(k.a);
                                    if (w11 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (w11 != 1) {
                                            if (w11 != 2) {
                                                if (w11 != 3) {
                                                    cVar.x();
                                                    cVar.T();
                                                } else {
                                                    cVar.r();
                                                }
                                            } else {
                                                str6 = cVar.t();
                                            }
                                        } else {
                                            str5 = cVar.t();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        str4 = cVar.t();
                                    }
                                }
                                cVar.k();
                                hashMap3.put(str5, new r3.c(str4, str5, str6));
                                arrayList4 = arrayList4;
                            }
                            cVar.j();
                        }
                    }
                    arrayList = arrayList4;
                    cVar.k();
                    i10 = i13;
                    f16 = f19;
                    f17 = f10;
                    f18 = f11;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 9:
                    f10 = f17;
                    f11 = f18;
                    cVar.d();
                    while (cVar.p()) {
                        d3.g gVar2 = j.a;
                        ArrayList arrayList7 = new ArrayList();
                        cVar.g();
                        double d10 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c11 = 0;
                        while (cVar.p()) {
                            int w12 = cVar.w(j.a);
                            if (w12 != 0) {
                                if (w12 != 1) {
                                    if (w12 != 2) {
                                        if (w12 != 3) {
                                            if (w12 != 4) {
                                                if (w12 != 5) {
                                                    cVar.x();
                                                    cVar.T();
                                                } else {
                                                    cVar.g();
                                                    while (cVar.p()) {
                                                        if (cVar.w(j.f26709b) != 0) {
                                                            cVar.x();
                                                            cVar.T();
                                                        } else {
                                                            cVar.d();
                                                            while (cVar.p()) {
                                                                arrayList7.add((t3.m) f.a(cVar, jVar));
                                                            }
                                                            cVar.j();
                                                        }
                                                    }
                                                    cVar.k();
                                                }
                                            } else {
                                                str8 = cVar.t();
                                            }
                                        } else {
                                            str7 = cVar.t();
                                        }
                                    } else {
                                        d10 = cVar.r();
                                    }
                                } else {
                                    cVar.r();
                                }
                            } else {
                                c11 = cVar.t().charAt(0);
                            }
                        }
                        cVar.k();
                        r3.d dVar = new r3.d(arrayList7, c11, d10, str7, str8);
                        lVar.d(dVar.hashCode(), dVar);
                    }
                    cVar.j();
                    arrayList = arrayList4;
                    i10 = i13;
                    f16 = f19;
                    f17 = f10;
                    f18 = f11;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                case 10:
                    cVar.d();
                    while (cVar.p()) {
                        cVar.g();
                        String str9 = null;
                        float f20 = 0.0f;
                        float f21 = 0.0f;
                        while (cVar.p()) {
                            int w13 = cVar.w(f26721d);
                            if (w13 != 0) {
                                f12 = f18;
                                if (w13 != 1) {
                                    if (w13 != 2) {
                                        cVar.x();
                                        cVar.T();
                                    } else {
                                        f13 = f17;
                                        f21 = (float) cVar.r();
                                    }
                                } else {
                                    f13 = f17;
                                    f20 = (float) cVar.r();
                                }
                                f17 = f13;
                            } else {
                                f12 = f18;
                                str9 = cVar.t();
                            }
                            f18 = f12;
                        }
                        cVar.k();
                        arrayList4.add(new r3.h(str9, f20, f21));
                        f17 = f17;
                        f18 = f18;
                    }
                    f10 = f17;
                    f11 = f18;
                    cVar.j();
                    arrayList = arrayList4;
                    i10 = i13;
                    f16 = f19;
                    f17 = f10;
                    f18 = f11;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
                default:
                    arrayList = arrayList4;
                    f10 = f17;
                    f11 = f18;
                    i10 = i13;
                    cVar.x();
                    cVar.T();
                    f16 = f19;
                    f17 = f10;
                    f18 = f11;
                    i13 = i10;
                    arrayList4 = arrayList;
                    break;
            }
        }
        ArrayList arrayList8 = arrayList4;
        Rect rect = new Rect(0, 0, (int) (i13 * c10), (int) (i12 * c10));
        float c12 = y3.h.c();
        jVar.f21560k = rect;
        jVar.f21561l = f17;
        jVar.f21562m = f18;
        jVar.f21563n = f16;
        jVar.f21559j = arrayList3;
        jVar.f21558i = eVar;
        jVar.f21552c = hashMap;
        jVar.f21553d = hashMap2;
        jVar.f21554e = c12;
        jVar.f21557h = lVar;
        jVar.f21555f = hashMap3;
        jVar.f21556g = arrayList8;
        return jVar;
    }
}
