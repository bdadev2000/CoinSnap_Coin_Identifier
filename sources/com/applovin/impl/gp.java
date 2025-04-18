package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.b5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class gp {

    /* renamed from: a, reason: collision with root package name */
    public final String f24152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24153b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24154c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final jp f24155f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f24156g;

    /* renamed from: h, reason: collision with root package name */
    public final String f24157h;

    /* renamed from: i, reason: collision with root package name */
    public final String f24158i;

    /* renamed from: j, reason: collision with root package name */
    public final gp f24159j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap f24160k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap f24161l;

    /* renamed from: m, reason: collision with root package name */
    private List f24162m;

    private gp(String str, String str2, long j2, long j3, jp jpVar, String[] strArr, String str3, String str4, gp gpVar) {
        this.f24152a = str;
        this.f24153b = str2;
        this.f24158i = str4;
        this.f24155f = jpVar;
        this.f24156g = strArr;
        this.f24154c = str2 != null;
        this.d = j2;
        this.e = j3;
        this.f24157h = (String) b1.a((Object) str3);
        this.f24159j = gpVar;
        this.f24160k = new HashMap();
        this.f24161l = new HashMap();
    }

    public boolean a(long j2) {
        long j3 = this.d;
        return (j3 == -9223372036854775807L && this.e == -9223372036854775807L) || (j3 <= j2 && this.e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.e) || (j3 <= j2 && j2 < this.e));
    }

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public String[] c() {
        return this.f24156g;
    }

    public void a(gp gpVar) {
        if (this.f24162m == null) {
            this.f24162m = new ArrayList();
        }
        this.f24162m.add(gpVar);
    }

    private void a(Map map, b5.b bVar, int i2, int i3, int i4) {
        jp a2 = ip.a(this.f24155f, this.f24156g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a2 != null) {
            ip.a(spannableStringBuilder2, i2, i3, a2, this.f24159j, map, i4);
            if ("p".equals(this.f24152a)) {
                if (a2.j() != Float.MAX_VALUE) {
                    bVar.c((a2.j() * (-90.0f)) / 100.0f);
                }
                if (a2.l() != null) {
                    bVar.b(a2.l());
                }
                if (a2.g() != null) {
                    bVar.a(a2.g());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (o6 o6Var : (o6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(o6Var), spannableStringBuilder.getSpanEnd(o6Var), "");
        }
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                int i3 = i2 + 1;
                int i4 = i3;
                while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                    i4++;
                }
                int i5 = i4 - i3;
                if (i5 > 0) {
                    spannableStringBuilder.delete(i2, i5 + i2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
            if (spannableStringBuilder.charAt(i6) == '\n') {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
            if (spannableStringBuilder.charAt(i8) == ' ') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public gp a(int i2) {
        List list = this.f24162m;
        if (list != null) {
            return (gp) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List list = this.f24162m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet treeSet, boolean z2) {
        boolean equals = "p".equals(this.f24152a);
        boolean equals2 = "div".equals(this.f24152a);
        if (z2 || equals || (equals2 && this.f24158i != null)) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f24162m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f24162m.size(); i2++) {
            ((gp) this.f24162m.get(i2)).a(treeSet, z2 || equals);
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            b5.b bVar = new b5.b();
            bVar.a(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) b1.a(((b5.b) map.get(str)).e());
    }

    private void a(long j2, String str, List list) {
        if (!"".equals(this.f24157h)) {
            str = this.f24157h;
        }
        if (a(j2) && "div".equals(this.f24152a) && this.f24158i != null) {
            list.add(new Pair(str, this.f24158i));
            return;
        }
        for (int i2 = 0; i2 < a(); i2++) {
            a(i2).a(j2, str, list);
        }
    }

    private void a(long j2, Map map, Map map2, String str, Map map3) {
        int i2;
        if (a(j2)) {
            String str2 = "".equals(this.f24157h) ? str : this.f24157h;
            Iterator it = this.f24161l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f24160k.containsKey(str3) ? ((Integer) this.f24160k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    a(map, (b5.b) b1.a((b5.b) map3.get(str3)), intValue, intValue2, ((hp) b1.a((hp) map2.get(str2))).f24349j);
                }
            }
            while (i2 < a()) {
                a(i2).a(j2, map, map2, str2, map3);
                i2++;
            }
        }
    }

    private void a(long j2, boolean z2, String str, Map map) {
        this.f24160k.clear();
        this.f24161l.clear();
        if ("metadata".equals(this.f24152a)) {
            return;
        }
        if (!"".equals(this.f24157h)) {
            str = this.f24157h;
        }
        if (this.f24154c && z2) {
            a(str, map).append((CharSequence) b1.a((Object) this.f24153b));
            return;
        }
        if ("br".equals(this.f24152a) && z2) {
            a(str, map).append('\n');
            return;
        }
        if (a(j2)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f24160k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) b1.a(((b5.b) entry.getValue()).e())).length()));
            }
            boolean equals = "p".equals(this.f24152a);
            for (int i2 = 0; i2 < a(); i2++) {
                a(i2).a(j2, z2 || equals, str, map);
            }
            if (equals) {
                ip.a(a(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f24161l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) b1.a(((b5.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public static gp a(String str) {
        return new gp(null, ip.a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static gp a(String str, long j2, long j3, jp jpVar, String[] strArr, String str2, String str3, gp gpVar) {
        return new gp(str, null, j2, j3, jpVar, strArr, str2, str3, gpVar);
    }

    public List a(long j2, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j2, this.f24157h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j2, false, this.f24157h, (Map) treeMap);
        a(j2, map, map2, this.f24157h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                hp hpVar = (hp) b1.a((hp) map2.get(pair.first));
                arrayList2.add(new b5.b().a(decodeByteArray).b(hpVar.f24343b).b(0).a(hpVar.f24344c, 0).a(hpVar.e).d(hpVar.f24345f).a(hpVar.f24346g).c(hpVar.f24349j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            hp hpVar2 = (hp) b1.a((hp) map2.get(entry.getKey()));
            b5.b bVar = (b5.b) entry.getValue();
            a((SpannableStringBuilder) b1.a(bVar.e()));
            bVar.a(hpVar2.f24344c, hpVar2.d);
            bVar.a(hpVar2.e);
            bVar.b(hpVar2.f24343b);
            bVar.d(hpVar2.f24345f);
            bVar.b(hpVar2.f24348i, hpVar2.f24347h);
            bVar.c(hpVar2.f24349j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }
}
