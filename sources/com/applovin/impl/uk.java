package com.applovin.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.wk;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class uk extends bk {

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f11624t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    private final boolean f11625o;

    /* renamed from: p, reason: collision with root package name */
    private final vk f11626p;

    /* renamed from: q, reason: collision with root package name */
    private Map f11627q;

    /* renamed from: r, reason: collision with root package name */
    private float f11628r;

    /* renamed from: s, reason: collision with root package name */
    private float f11629s;

    public uk(List list) {
        super("SsaDecoder");
        this.f11628r = -3.4028235E38f;
        this.f11629s = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f11625o = true;
            String a6 = yp.a((byte[]) list.get(0));
            AbstractC0669a1.a(a6.startsWith("Format:"));
            this.f11626p = (vk) AbstractC0669a1.a(vk.a(a6));
            a(new yg((byte[]) list.get(1)));
            return;
        }
        this.f11625o = false;
        this.f11626p = null;
    }

    private static int a(long j7, List list, List list2) {
        int i9;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i9 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j7) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j7) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        list.add(i9, Long.valueOf(j7));
        list2.add(i9, i9 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i9 - 1)));
        return i9;
    }

    private static float b(int i9) {
        if (i9 == 0) {
            return 0.05f;
        }
        if (i9 != 1) {
            return i9 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int c(int i9) {
        switch (i9) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                L.p(i9, "Unknown alignment: ", "SsaDecoder");
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int d(int i9) {
        switch (i9) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                L.p(i9, "Unknown alignment: ", "SsaDecoder");
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment e(int i9) {
        switch (i9) {
            case -1:
                return null;
            case 0:
            default:
                L.p(i9, "Unknown alignment: ", "SsaDecoder");
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.applovin.impl.yg r5) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.l()
            if (r0 == 0) goto L59
            int r1 = r5.a()
            if (r1 == 0) goto L14
            int r1 = r5.g()
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(r1)
            r1.getClass()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f11629s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f11628r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.uk.b(com.applovin.impl.yg):void");
    }

    private static z4 a(String str, wk wkVar, wk.b bVar, float f9, float f10) {
        SpannableString spannableString = new SpannableString(str);
        z4.b a6 = new z4.b().a(spannableString);
        if (wkVar != null) {
            if (wkVar.f11995c != null) {
                spannableString.setSpan(new ForegroundColorSpan(wkVar.f11995c.intValue()), 0, spannableString.length(), 33);
            }
            float f11 = wkVar.f11996d;
            if (f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
                a6.b(f11 / f10, 1);
            }
            boolean z8 = wkVar.f11997e;
            if (z8 && wkVar.f11998f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z8) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (wkVar.f11998f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (wkVar.f11999g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (wkVar.f12000h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i9 = bVar.f12013a;
        if (i9 == -1) {
            i9 = wkVar != null ? wkVar.b : -1;
        }
        a6.b(e(i9)).b(d(i9)).a(c(i9));
        PointF pointF = bVar.b;
        if (pointF != null && f10 != -3.4028235E38f && f9 != -3.4028235E38f) {
            a6.b(pointF.x / f9);
            a6.a(bVar.b.y / f10, 0);
        } else {
            a6.b(b(a6.d()));
            a6.a(b(a6.c()), 0);
        }
        return a6.a();
    }

    private static Map c(yg ygVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wk.a aVar = null;
        while (true) {
            String l = ygVar.l();
            if (l == null || (ygVar.a() != 0 && ygVar.g() == 91)) {
                break;
            }
            if (l.startsWith("Format:")) {
                aVar = wk.a.a(l);
            } else if (l.startsWith("Style:")) {
                if (aVar == null) {
                    kc.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(l));
                } else {
                    wk a6 = wk.a(l, aVar);
                    if (a6 != null) {
                        linkedHashMap.put(a6.f11994a, a6);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yg ygVar = new yg(bArr, i9);
        if (!this.f11625o) {
            a(ygVar);
        }
        a(ygVar, arrayList, arrayList2);
        return new xk(arrayList, arrayList2);
    }

    private void a(String str, vk vkVar, List list, List list2) {
        int i9;
        AbstractC0669a1.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", vkVar.f11761e);
        if (split.length != vkVar.f11761e) {
            kc.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long a6 = a(split[vkVar.f11758a]);
        if (a6 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            kc.d("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        long a9 = a(split[vkVar.b]);
        if (a9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            kc.d("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        Map map = this.f11627q;
        wk wkVar = (map == null || (i9 = vkVar.f11759c) == -1) ? null : (wk) map.get(split[i9].trim());
        String str2 = split[vkVar.f11760d];
        z4 a10 = a(wk.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), wkVar, wk.b.b(str2), this.f11628r, this.f11629s);
        int a11 = a(a9, list2, list);
        for (int a12 = a(a6, list2, list); a12 < a11; a12++) {
            ((List) list.get(a12)).add(a10);
        }
    }

    private void a(yg ygVar, List list, List list2) {
        vk vkVar = this.f11625o ? this.f11626p : null;
        while (true) {
            String l = ygVar.l();
            if (l == null) {
                return;
            }
            if (l.startsWith("Format:")) {
                vkVar = vk.a(l);
            } else if (l.startsWith("Dialogue:")) {
                if (vkVar == null) {
                    kc.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(l));
                } else {
                    a(l, vkVar, list, list2);
                }
            }
        }
    }

    private void a(yg ygVar) {
        while (true) {
            String l = ygVar.l();
            if (l == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(l)) {
                b(ygVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(l)) {
                this.f11627q = c(ygVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(l)) {
                kc.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(l)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = f11624t.matcher(str.trim());
        if (!matcher.matches()) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return (Long.parseLong((String) yp.a((Object) matcher.group(4))) * 10000) + (Long.parseLong((String) yp.a((Object) matcher.group(3))) * 1000000) + (Long.parseLong((String) yp.a((Object) matcher.group(2))) * 60000000) + (Long.parseLong((String) yp.a((Object) matcher.group(1))) * 3600000000L);
    }
}
