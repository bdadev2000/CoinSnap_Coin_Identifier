package h9;

import a9.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import n9.h0;

/* loaded from: classes3.dex */
public final class g implements h {

    /* renamed from: b, reason: collision with root package name */
    public final d f18977b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f18978c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f18979d;

    /* renamed from: f, reason: collision with root package name */
    public final Map f18980f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f18981g;

    public g(d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f18977b = dVar;
        this.f18980f = hashMap2;
        this.f18981g = hashMap3;
        this.f18979d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f18978c = jArr;
    }

    @Override // a9.h
    public final List getCues(long j3) {
        Map map = this.f18979d;
        Map map2 = this.f18980f;
        d dVar = this.f18977b;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.g(j3, dVar.f18944h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j3, false, dVar.f18944h, treeMap);
        dVar.h(j3, map, map2, dVar.f18944h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.f18981g.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) map2.get(pair.first);
                eVar.getClass();
                a9.a aVar = new a9.a();
                aVar.f343b = decodeByteArray;
                aVar.f349h = eVar.f18950b;
                aVar.f350i = 0;
                aVar.f346e = eVar.f18951c;
                aVar.f347f = 0;
                aVar.f348g = eVar.f18953e;
                aVar.f353l = eVar.f18954f;
                aVar.f354m = eVar.f18955g;
                aVar.f357p = eVar.f18958j;
                arrayList2.add(aVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) map2.get(entry.getKey());
            eVar2.getClass();
            a9.a aVar2 = (a9.a) entry.getValue();
            CharSequence charSequence = aVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar3 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar3), spannableStringBuilder.getSpanEnd(aVar3), (CharSequence) "");
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
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar2.f346e = eVar2.f18951c;
            aVar2.f347f = eVar2.f18952d;
            aVar2.f348g = eVar2.f18953e;
            aVar2.f349h = eVar2.f18950b;
            aVar2.f353l = eVar2.f18954f;
            aVar2.f352k = eVar2.f18957i;
            aVar2.f351j = eVar2.f18956h;
            aVar2.f357p = eVar2.f18958j;
            arrayList2.add(aVar2.a());
        }
        return arrayList2;
    }

    @Override // a9.h
    public final long getEventTime(int i10) {
        return this.f18978c[i10];
    }

    @Override // a9.h
    public final int getEventTimeCount() {
        return this.f18978c.length;
    }

    @Override // a9.h
    public final int getNextEventTimeIndex(long j3) {
        long[] jArr = this.f18978c;
        int b3 = h0.b(jArr, j3, false);
        if (b3 >= jArr.length) {
            return -1;
        }
        return b3;
    }
}
