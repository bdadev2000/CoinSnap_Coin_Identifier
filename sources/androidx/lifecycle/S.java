package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import g4.AbstractC2292b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import t7.C2720i;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f4861f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4862a;
    public final LinkedHashMap b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4863c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4864d;

    /* renamed from: e, reason: collision with root package name */
    public final G0.d f4865e;

    public S(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4862a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.f4863c = new LinkedHashMap();
        this.f4864d = new LinkedHashMap();
        this.f4865e = new androidx.fragment.app.H(this, 2);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(S s5) {
        C c9;
        G7.j.e(s5, "this$0");
        Iterator it = AbstractC2829t.c0(s5.b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = s5.f4862a;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object a6 = ((G0.d) entry.getValue()).a();
                G7.j.e(str, "key");
                if (a6 != null) {
                    Class[] clsArr = f4861f;
                    for (int i9 = 0; i9 < 29; i9++) {
                        Class cls = clsArr[i9];
                        G7.j.b(cls);
                        if (!cls.isInstance(a6)) {
                        }
                    }
                    throw new IllegalArgumentException("Can't put value with type " + a6.getClass() + " into saved state");
                }
                Object obj = s5.f4863c.get(str);
                if (obj instanceof C) {
                    c9 = (C) obj;
                } else {
                    c9 = null;
                }
                if (c9 != null) {
                    c9.d(a6);
                } else {
                    linkedHashMap.put(str, a6);
                }
                T7.o oVar = (T7.o) s5.f4864d.get(str);
                if (oVar != null) {
                    T7.r rVar = (T7.r) oVar;
                    if (a6 == null) {
                        a6 = U7.p.f3378a;
                    }
                    rVar.c(null, a6);
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : keySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap.get(str2));
                }
                return AbstractC2292b.b(new C2720i("keys", arrayList), new C2720i("values", arrayList2));
            }
        }
    }

    public S() {
        this.f4862a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.f4863c = new LinkedHashMap();
        this.f4864d = new LinkedHashMap();
        this.f4865e = new androidx.fragment.app.H(this, 2);
    }
}
