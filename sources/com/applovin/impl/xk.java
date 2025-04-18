package com.applovin.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.b5;
import com.applovin.impl.zk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class xk extends ek {

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f27931t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    private final boolean f27932o;

    /* renamed from: p, reason: collision with root package name */
    private final yk f27933p;

    /* renamed from: q, reason: collision with root package name */
    private Map f27934q;

    /* renamed from: r, reason: collision with root package name */
    private float f27935r;

    /* renamed from: s, reason: collision with root package name */
    private float f27936s;

    public xk(List list) {
        super("SsaDecoder");
        this.f27935r = -3.4028235E38f;
        this.f27936s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f27932o = false;
            this.f27933p = null;
            return;
        }
        this.f27932o = true;
        String a2 = xp.a((byte[]) list.get(0));
        b1.a(a2.startsWith("Format:"));
        this.f27933p = (yk) b1.a(yk.a(a2));
        a(new bh((byte[]) list.get(1)));
    }

    private static int a(long j2, List list, List list2) {
        int i2;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j2) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j2) {
                i2 = size + 1;
                break;
            }
            size--;
        }
        list.add(i2, Long.valueOf(j2));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i2 - 1)));
        return i2;
    }

    private static float b(int i2) {
        if (i2 == 0) {
            return 0.05f;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int c(int i2) {
        switch (i2) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                com.applovin.impl.adview.t.u("Unknown alignment: ", i2, "SsaDecoder");
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

    private static int d(int i2) {
        switch (i2) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                com.applovin.impl.adview.t.u("Unknown alignment: ", i2, "SsaDecoder");
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

    private static Layout.Alignment e(int i2) {
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                com.applovin.impl.adview.t.u("Unknown alignment: ", i2, "SsaDecoder");
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
    private void b(com.applovin.impl.bh r5) {
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
            r4.f27936s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f27935r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xk.b(com.applovin.impl.bh):void");
    }

    private static b5 a(String str, zk zkVar, zk.b bVar, float f2, float f3) {
        SpannableString spannableString = new SpannableString(str);
        b5.b a2 = new b5.b().a(spannableString);
        if (zkVar != null) {
            if (zkVar.f28353c != null) {
                spannableString.setSpan(new ForegroundColorSpan(zkVar.f28353c.intValue()), 0, spannableString.length(), 33);
            }
            float f4 = zkVar.d;
            if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                a2.b(f4 / f3, 1);
            }
            boolean z2 = zkVar.e;
            if (z2 && zkVar.f28354f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z2) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (zkVar.f28354f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (zkVar.f28355g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (zkVar.f28356h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = bVar.f28366a;
        if (i2 == -1) {
            i2 = zkVar != null ? zkVar.f28352b : -1;
        }
        a2.b(e(i2)).b(d(i2)).a(c(i2));
        PointF pointF = bVar.f28367b;
        if (pointF != null && f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
            a2.b(pointF.x / f2);
            a2.a(bVar.f28367b.y / f3, 0);
        } else {
            a2.b(b(a2.d()));
            a2.a(b(a2.c()), 0);
        }
        return a2.a();
    }

    private static Map c(bh bhVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zk.a aVar = null;
        while (true) {
            String l2 = bhVar.l();
            if (l2 == null || (bhVar.a() != 0 && bhVar.g() == 91)) {
                break;
            }
            if (l2.startsWith("Format:")) {
                aVar = zk.a.a(l2);
            } else if (l2.startsWith("Style:")) {
                if (aVar == null) {
                    pc.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(l2));
                } else {
                    zk a2 = zk.a(l2, aVar);
                    if (a2 != null) {
                        linkedHashMap.put(a2.f28351a, a2);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bh bhVar = new bh(bArr, i2);
        if (!this.f27932o) {
            a(bhVar);
        }
        a(bhVar, arrayList, arrayList2);
        return new al(arrayList, arrayList2);
    }

    private void a(String str, yk ykVar, List list, List list2) {
        int i2;
        b1.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", ykVar.e);
        if (split.length != ykVar.e) {
            pc.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long a2 = a(split[ykVar.f28213a]);
        if (a2 == -9223372036854775807L) {
            pc.d("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        long a3 = a(split[ykVar.f28214b]);
        if (a3 == -9223372036854775807L) {
            pc.d("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        Map map = this.f27934q;
        zk zkVar = (map == null || (i2 = ykVar.f28215c) == -1) ? null : (zk) map.get(split[i2].trim());
        String str2 = split[ykVar.d];
        b5 a4 = a(zk.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), zkVar, zk.b.b(str2), this.f27935r, this.f27936s);
        int a5 = a(a3, list2, list);
        for (int a6 = a(a2, list2, list); a6 < a5; a6++) {
            ((List) list.get(a6)).add(a4);
        }
    }

    private void a(bh bhVar, List list, List list2) {
        yk ykVar = this.f27932o ? this.f27933p : null;
        while (true) {
            String l2 = bhVar.l();
            if (l2 == null) {
                return;
            }
            if (l2.startsWith("Format:")) {
                ykVar = yk.a(l2);
            } else if (l2.startsWith("Dialogue:")) {
                if (ykVar == null) {
                    pc.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(l2));
                } else {
                    a(l2, ykVar, list, list2);
                }
            }
        }
    }

    private void a(bh bhVar) {
        while (true) {
            String l2 = bhVar.l();
            if (l2 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(l2)) {
                b(bhVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(l2)) {
                this.f27934q = c(bhVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(l2)) {
                pc.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(l2)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = f27931t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) xp.a((Object) matcher.group(4))) * 10000) + (Long.parseLong((String) xp.a((Object) matcher.group(3))) * 1000000) + (Long.parseLong((String) xp.a((Object) matcher.group(2))) * 60000000) + (Long.parseLong((String) xp.a((Object) matcher.group(1))) * 3600000000L);
    }
}
