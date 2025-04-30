package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hp {

    /* renamed from: a, reason: collision with root package name */
    public final String f8163a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8164c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8165d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8166e;

    /* renamed from: f, reason: collision with root package name */
    public final kp f8167f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f8168g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8169h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8170i;

    /* renamed from: j, reason: collision with root package name */
    public final hp f8171j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap f8172k;
    private final HashMap l;
    private List m;

    private hp(String str, String str2, long j7, long j9, kp kpVar, String[] strArr, String str3, String str4, hp hpVar) {
        boolean z8;
        this.f8163a = str;
        this.b = str2;
        this.f8170i = str4;
        this.f8167f = kpVar;
        this.f8168g = strArr;
        if (str2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8164c = z8;
        this.f8165d = j7;
        this.f8166e = j9;
        this.f8169h = (String) AbstractC0669a1.a((Object) str3);
        this.f8171j = hpVar;
        this.f8172k = new HashMap();
        this.l = new HashMap();
    }

    public void a(hp hpVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(hpVar);
    }

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i9 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        return jArr;
    }

    public String[] c() {
        return this.f8168g;
    }

    private void a(Map map, z4.b bVar, int i9, int i10, int i11) {
        kp a6 = jp.a(this.f8167f, this.f8168g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a6 != null) {
            jp.a(spannableStringBuilder2, i9, i10, a6, this.f8171j, map, i11);
            if (TtmlNode.TAG_P.equals(this.f8163a)) {
                if (a6.j() != Float.MAX_VALUE) {
                    bVar.c((a6.j() * (-90.0f)) / 100.0f);
                }
                if (a6.l() != null) {
                    bVar.b(a6.l());
                }
                if (a6.g() != null) {
                    bVar.a(a6.g());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (m6 m6Var : (m6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), m6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(m6Var), spannableStringBuilder.getSpanEnd(m6Var), "");
        }
        for (int i9 = 0; i9 < spannableStringBuilder.length(); i9++) {
            if (spannableStringBuilder.charAt(i9) == ' ') {
                int i10 = i9 + 1;
                int i11 = i10;
                while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                    i11++;
                }
                int i12 = i11 - i10;
                if (i12 > 0) {
                    spannableStringBuilder.delete(i9, i12 + i9);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == '\n') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == ' ') {
                    spannableStringBuilder.delete(i14, i13 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
            if (spannableStringBuilder.charAt(i15) == ' ') {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i16) == '\n') {
                    spannableStringBuilder.delete(i15, i16);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public hp a(int i9) {
        List list = this.m;
        if (list != null) {
            return (hp) list.get(i9);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet treeSet, boolean z8) {
        boolean equals = TtmlNode.TAG_P.equals(this.f8163a);
        boolean equals2 = TtmlNode.TAG_DIV.equals(this.f8163a);
        if (z8 || equals || (equals2 && this.f8170i != null)) {
            long j7 = this.f8165d;
            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j7));
            }
            long j9 = this.f8166e;
            if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j9));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i9 = 0; i9 < this.m.size(); i9++) {
            ((hp) this.m.get(i9)).a(treeSet, z8 || equals);
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            z4.b bVar = new z4.b();
            bVar.a(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC0669a1.a(((z4.b) map.get(str)).e());
    }

    public boolean a(long j7) {
        long j9 = this.f8165d;
        return (j9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && this.f8166e == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) || (j9 <= j7 && this.f8166e == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) || ((j9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 < this.f8166e) || (j9 <= j7 && j7 < this.f8166e));
    }

    private void a(long j7, String str, List list) {
        if (!"".equals(this.f8169h)) {
            str = this.f8169h;
        }
        if (a(j7) && TtmlNode.TAG_DIV.equals(this.f8163a) && this.f8170i != null) {
            list.add(new Pair(str, this.f8170i));
            return;
        }
        for (int i9 = 0; i9 < a(); i9++) {
            a(i9).a(j7, str, list);
        }
    }

    private void a(long j7, Map map, Map map2, String str, Map map3) {
        int i9;
        if (a(j7)) {
            String str2 = "".equals(this.f8169h) ? str : this.f8169h;
            Iterator it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f8172k.containsKey(str3) ? ((Integer) this.f8172k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    a(map, (z4.b) AbstractC0669a1.a((z4.b) map3.get(str3)), intValue, intValue2, ((ip) AbstractC0669a1.a((ip) map2.get(str2))).f8338j);
                }
            }
            while (i9 < a()) {
                a(i9).a(j7, map, map2, str2, map3);
                i9++;
            }
        }
    }

    private void a(long j7, boolean z8, String str, Map map) {
        this.f8172k.clear();
        this.l.clear();
        if (TtmlNode.TAG_METADATA.equals(this.f8163a)) {
            return;
        }
        if (!"".equals(this.f8169h)) {
            str = this.f8169h;
        }
        if (this.f8164c && z8) {
            a(str, map).append((CharSequence) AbstractC0669a1.a((Object) this.b));
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.f8163a) && z8) {
            a(str, map).append('\n');
            return;
        }
        if (a(j7)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f8172k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC0669a1.a(((z4.b) entry.getValue()).e())).length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(this.f8163a);
            for (int i9 = 0; i9 < a(); i9++) {
                a(i9).a(j7, z8 || equals, str, map);
            }
            if (equals) {
                jp.a(a(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC0669a1.a(((z4.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public static hp a(String str) {
        return new hp(null, jp.a(str), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, null, null, "", null, null);
    }

    public static hp a(String str, long j7, long j9, kp kpVar, String[] strArr, String str2, String str3, hp hpVar) {
        return new hp(str, null, j7, j9, kpVar, strArr, str2, str3, hpVar);
    }

    public List a(long j7, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j7, this.f8169h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j7, false, this.f8169h, (Map) treeMap);
        a(j7, map, map2, this.f8169h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                ip ipVar = (ip) AbstractC0669a1.a((ip) map2.get(pair.first));
                arrayList2.add(new z4.b().a(decodeByteArray).b(ipVar.b).b(0).a(ipVar.f8331c, 0).a(ipVar.f8333e).d(ipVar.f8334f).a(ipVar.f8335g).c(ipVar.f8338j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ip ipVar2 = (ip) AbstractC0669a1.a((ip) map2.get(entry.getKey()));
            z4.b bVar = (z4.b) entry.getValue();
            a((SpannableStringBuilder) AbstractC0669a1.a(bVar.e()));
            bVar.a(ipVar2.f8331c, ipVar2.f8332d);
            bVar.a(ipVar2.f8333e);
            bVar.b(ipVar2.b);
            bVar.d(ipVar2.f8334f);
            bVar.b(ipVar2.f8337i, ipVar2.f8336h);
            bVar.c(ipVar2.f8338j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }
}
