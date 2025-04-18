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
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
    private static final Pattern f8409t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    private final boolean f8410o;

    /* renamed from: p, reason: collision with root package name */
    private final vk f8411p;

    /* renamed from: q, reason: collision with root package name */
    private Map f8412q;

    /* renamed from: r, reason: collision with root package name */
    private float f8413r;

    /* renamed from: s, reason: collision with root package name */
    private float f8414s;

    public uk(List list) {
        super("SsaDecoder");
        this.f8413r = -3.4028235E38f;
        this.f8414s = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f8410o = true;
            String a = yp.a((byte[]) list.get(0));
            a1.a(a.startsWith("Format:"));
            this.f8411p = (vk) a1.a(vk.a(a));
            a(new yg((byte[]) list.get(1)));
            return;
        }
        this.f8410o = false;
        this.f8411p = null;
    }

    private static int a(long j3, List list, List list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j3) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j3) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j3));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    private static float b(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int c(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                a4.j.u("Unknown alignment: ", i10, "SsaDecoder");
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

    private static int d(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                a4.j.u("Unknown alignment: ", i10, "SsaDecoder");
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

    private static Layout.Alignment e(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                a4.j.u("Unknown alignment: ", i10, "SsaDecoder");
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
            r4.f8414s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f8413r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.uk.b(com.applovin.impl.yg):void");
    }

    private static z4 a(String str, wk wkVar, wk.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        z4.b a = new z4.b().a(spannableString);
        if (wkVar != null) {
            if (wkVar.f8782c != null) {
                spannableString.setSpan(new ForegroundColorSpan(wkVar.f8782c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = wkVar.f8783d;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                a.b(f12 / f11, 1);
            }
            boolean z10 = wkVar.f8784e;
            if (z10 && wkVar.f8785f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (wkVar.f8785f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (wkVar.f8786g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (wkVar.f8787h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.a;
        if (i10 == -1) {
            i10 = wkVar != null ? wkVar.f8781b : -1;
        }
        a.b(e(i10)).b(d(i10)).a(c(i10));
        PointF pointF = bVar.f8800b;
        if (pointF != null && f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
            a.b(pointF.x / f10);
            a.a(bVar.f8800b.y / f11, 0);
        } else {
            a.b(b(a.d()));
            a.a(b(a.c()), 0);
        }
        return a.a();
    }

    private static Map c(yg ygVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wk.a aVar = null;
        while (true) {
            String l10 = ygVar.l();
            if (l10 == null || (ygVar.a() != 0 && ygVar.g() == 91)) {
                break;
            }
            if (l10.startsWith("Format:")) {
                aVar = wk.a.a(l10);
            } else if (l10.startsWith("Style:")) {
                if (aVar == null) {
                    kc.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(l10));
                } else {
                    wk a = wk.a(l10, aVar);
                    if (a != null) {
                        linkedHashMap.put(a.a, a);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yg ygVar = new yg(bArr, i10);
        if (!this.f8410o) {
            a(ygVar);
        }
        a(ygVar, arrayList, arrayList2);
        return new xk(arrayList, arrayList2);
    }

    private void a(String str, vk vkVar, List list, List list2) {
        int i10;
        a1.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", vkVar.f8539e);
        if (split.length != vkVar.f8539e) {
            kc.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long a = a(split[vkVar.a]);
        if (a == C.TIME_UNSET) {
            kc.d("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        long a10 = a(split[vkVar.f8536b]);
        if (a10 == C.TIME_UNSET) {
            kc.d("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        Map map = this.f8412q;
        wk wkVar = (map == null || (i10 = vkVar.f8537c) == -1) ? null : (wk) map.get(split[i10].trim());
        String str2 = split[vkVar.f8538d];
        z4 a11 = a(wk.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), wkVar, wk.b.b(str2), this.f8413r, this.f8414s);
        int a12 = a(a10, list2, list);
        for (int a13 = a(a, list2, list); a13 < a12; a13++) {
            ((List) list.get(a13)).add(a11);
        }
    }

    private void a(yg ygVar, List list, List list2) {
        vk vkVar = this.f8410o ? this.f8411p : null;
        while (true) {
            String l10 = ygVar.l();
            if (l10 == null) {
                return;
            }
            if (l10.startsWith("Format:")) {
                vkVar = vk.a(l10);
            } else if (l10.startsWith("Dialogue:")) {
                if (vkVar == null) {
                    kc.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(l10));
                } else {
                    a(l10, vkVar, list, list2);
                }
            }
        }
    }

    private void a(yg ygVar) {
        while (true) {
            String l10 = ygVar.l();
            if (l10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(l10)) {
                b(ygVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(l10)) {
                this.f8412q = c(ygVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(l10)) {
                kc.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(l10)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = f8409t.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) yp.a((Object) matcher.group(4))) * 10000) + (Long.parseLong((String) yp.a((Object) matcher.group(3))) * 1000000) + (Long.parseLong((String) yp.a((Object) matcher.group(2))) * 60000000) + (Long.parseLong((String) yp.a((Object) matcher.group(1))) * 3600000000L);
    }
}
