package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5183b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5184c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5185d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5186e;

    /* renamed from: f, reason: collision with root package name */
    public final kp f5187f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f5188g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5189h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5190i;

    /* renamed from: j, reason: collision with root package name */
    public final hp f5191j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap f5192k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap f5193l;

    /* renamed from: m, reason: collision with root package name */
    private List f5194m;

    private hp(String str, String str2, long j3, long j10, kp kpVar, String[] strArr, String str3, String str4, hp hpVar) {
        boolean z10;
        this.a = str;
        this.f5183b = str2;
        this.f5190i = str4;
        this.f5187f = kpVar;
        this.f5188g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5184c = z10;
        this.f5185d = j3;
        this.f5186e = j10;
        this.f5189h = (String) a1.a((Object) str3);
        this.f5191j = hpVar;
        this.f5192k = new HashMap();
        this.f5193l = new HashMap();
    }

    public void a(hp hpVar) {
        if (this.f5194m == null) {
            this.f5194m = new ArrayList();
        }
        this.f5194m.add(hpVar);
    }

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] c() {
        return this.f5188g;
    }

    private void a(Map map, z4.b bVar, int i10, int i11, int i12) {
        kp a = jp.a(this.f5187f, this.f5188g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a != null) {
            jp.a(spannableStringBuilder2, i10, i11, a, this.f5191j, map, i12);
            if (TtmlNode.TAG_P.equals(this.a)) {
                if (a.j() != Float.MAX_VALUE) {
                    bVar.c((a.j() * (-90.0f)) / 100.0f);
                }
                if (a.l() != null) {
                    bVar.b(a.l());
                }
                if (a.g() != null) {
                    bVar.a(a.g());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (m6 m6Var : (m6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), m6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(m6Var), spannableStringBuilder.getSpanEnd(m6Var), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public hp a(int i10) {
        List list = this.f5194m;
        if (list != null) {
            return (hp) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List list = this.f5194m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet treeSet, boolean z10) {
        boolean equals = TtmlNode.TAG_P.equals(this.a);
        boolean equals2 = TtmlNode.TAG_DIV.equals(this.a);
        if (z10 || equals || (equals2 && this.f5190i != null)) {
            long j3 = this.f5185d;
            if (j3 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j3));
            }
            long j10 = this.f5186e;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f5194m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f5194m.size(); i10++) {
            ((hp) this.f5194m.get(i10)).a(treeSet, z10 || equals);
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            z4.b bVar = new z4.b();
            bVar.a(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) a1.a(((z4.b) map.get(str)).e());
    }

    public boolean a(long j3) {
        long j10 = this.f5185d;
        return (j10 == C.TIME_UNSET && this.f5186e == C.TIME_UNSET) || (j10 <= j3 && this.f5186e == C.TIME_UNSET) || ((j10 == C.TIME_UNSET && j3 < this.f5186e) || (j10 <= j3 && j3 < this.f5186e));
    }

    private void a(long j3, String str, List list) {
        if (!"".equals(this.f5189h)) {
            str = this.f5189h;
        }
        if (a(j3) && TtmlNode.TAG_DIV.equals(this.a) && this.f5190i != null) {
            list.add(new Pair(str, this.f5190i));
            return;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            a(i10).a(j3, str, list);
        }
    }

    private void a(long j3, Map map, Map map2, String str, Map map3) {
        int i10;
        if (a(j3)) {
            String str2 = "".equals(this.f5189h) ? str : this.f5189h;
            Iterator it = this.f5193l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f5192k.containsKey(str3) ? ((Integer) this.f5192k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    a(map, (z4.b) a1.a((z4.b) map3.get(str3)), intValue, intValue2, ((ip) a1.a((ip) map2.get(str2))).f5373j);
                }
            }
            while (i10 < a()) {
                a(i10).a(j3, map, map2, str2, map3);
                i10++;
            }
        }
    }

    private void a(long j3, boolean z10, String str, Map map) {
        this.f5192k.clear();
        this.f5193l.clear();
        if (TtmlNode.TAG_METADATA.equals(this.a)) {
            return;
        }
        if (!"".equals(this.f5189h)) {
            str = this.f5189h;
        }
        if (this.f5184c && z10) {
            a(str, map).append((CharSequence) a1.a((Object) this.f5183b));
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.a) && z10) {
            a(str, map).append('\n');
            return;
        }
        if (a(j3)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f5192k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) a1.a(((z4.b) entry.getValue()).e())).length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(this.a);
            for (int i10 = 0; i10 < a(); i10++) {
                a(i10).a(j3, z10 || equals, str, map);
            }
            if (equals) {
                jp.a(a(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f5193l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) a1.a(((z4.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public static hp a(String str) {
        return new hp(null, jp.a(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static hp a(String str, long j3, long j10, kp kpVar, String[] strArr, String str2, String str3, hp hpVar) {
        return new hp(str, null, j3, j10, kpVar, strArr, str2, str3, hpVar);
    }

    public List a(long j3, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j3, this.f5189h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j3, false, this.f5189h, (Map) treeMap);
        a(j3, map, map2, this.f5189h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                ip ipVar = (ip) a1.a((ip) map2.get(pair.first));
                arrayList2.add(new z4.b().a(decodeByteArray).b(ipVar.f5365b).b(0).a(ipVar.f5366c, 0).a(ipVar.f5368e).d(ipVar.f5369f).a(ipVar.f5370g).c(ipVar.f5373j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ip ipVar2 = (ip) a1.a((ip) map2.get(entry.getKey()));
            z4.b bVar = (z4.b) entry.getValue();
            a((SpannableStringBuilder) a1.a(bVar.e()));
            bVar.a(ipVar2.f5366c, ipVar2.f5367d);
            bVar.a(ipVar2.f5368e);
            bVar.b(ipVar2.f5365b);
            bVar.d(ipVar2.f5369f);
            bVar.b(ipVar2.f5372i, ipVar2.f5371h);
            bVar.c(ipVar2.f5373j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }
}
