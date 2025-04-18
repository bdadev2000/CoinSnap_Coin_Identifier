package h9;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18938b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18939c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18940d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18941e;

    /* renamed from: f, reason: collision with root package name */
    public final f f18942f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f18943g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18944h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18945i;

    /* renamed from: j, reason: collision with root package name */
    public final d f18946j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f18947k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f18948l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f18949m;

    public d(String str, String str2, long j3, long j10, f fVar, String[] strArr, String str3, String str4, d dVar) {
        boolean z10;
        this.a = str;
        this.f18938b = str2;
        this.f18945i = str4;
        this.f18942f = fVar;
        this.f18943g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18939c = z10;
        this.f18940d = j3;
        this.f18941e = j10;
        str3.getClass();
        this.f18944h = str3;
        this.f18946j = dVar;
        this.f18947k = new HashMap();
        this.f18948l = new HashMap();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a9.a aVar = new a9.a();
            aVar.a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((a9.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i10) {
        ArrayList arrayList = this.f18949m;
        if (arrayList != null) {
            return (d) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f18949m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.a;
        boolean equals = TtmlNode.TAG_P.equals(str);
        boolean equals2 = TtmlNode.TAG_DIV.equals(str);
        if (z10 || equals || (equals2 && this.f18945i != null)) {
            long j3 = this.f18940d;
            if (j3 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j3));
            }
            long j10 = this.f18941e;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f18949m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f18949m.size(); i10++) {
            d dVar = (d) this.f18949m.get(i10);
            if (!z10 && !equals) {
                z11 = false;
            } else {
                z11 = true;
            }
            dVar.d(treeSet, z11);
        }
    }

    public final boolean f(long j3) {
        long j10 = this.f18940d;
        long j11 = this.f18941e;
        return (j10 == C.TIME_UNSET && j11 == C.TIME_UNSET) || (j10 <= j3 && j11 == C.TIME_UNSET) || ((j10 == C.TIME_UNSET && j3 < j11) || (j10 <= j3 && j3 < j11));
    }

    public final void g(long j3, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f18944h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j3) && TtmlNode.TAG_DIV.equals(this.a) && (str2 = this.f18945i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j3, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.d.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j3, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap hashMap = this.f18947k;
        hashMap.clear();
        HashMap hashMap2 = this.f18948l;
        hashMap2.clear();
        String str3 = this.a;
        if (TtmlNode.TAG_METADATA.equals(str3)) {
            return;
        }
        String str4 = this.f18944h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f18939c && z10) {
            SpannableStringBuilder e2 = e(str2, treeMap);
            String str5 = this.f18938b;
            str5.getClass();
            e2.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str3) && z10) {
            e(str2, treeMap).append('\n');
            return;
        }
        if (f(j3)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((a9.a) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(str3);
            for (int i10 = 0; i10 < c(); i10++) {
                d b3 = b(i10);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b3.i(j3, z11, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e10 = e(str2, treeMap);
                int length = e10.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (e10.charAt(length) == ' ');
                if (length >= 0 && e10.charAt(length) != '\n') {
                    e10.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((a9.a) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
