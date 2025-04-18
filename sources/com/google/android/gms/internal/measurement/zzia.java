package com.google.android.gms.internal.measurement;

import a6.k;
import com.google.common.collect.b1;
import com.google.common.collect.c1;
import com.google.common.collect.f1;
import com.google.common.collect.h0;
import com.google.common.collect.i1;
import com.google.common.collect.n0;
import com.google.common.collect.q1;
import com.google.common.collect.r0;
import com.google.common.collect.w;
import com.google.common.collect.y1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import m9.s;
import ra.p;
import ra.q;
import ra.r;
import v8.u0;

/* loaded from: classes3.dex */
public final class zzia {
    public static final p zza;

    static {
        p rVar;
        p pVar = new p() { // from class: com.google.android.gms.internal.measurement.zzhz
            @Override // ra.p
            public final Object get() {
                return zzia.zza();
            }
        };
        if (!(pVar instanceof r) && !(pVar instanceof q)) {
            if (pVar instanceof Serializable) {
                rVar = new q(pVar);
            } else {
                rVar = new r(pVar);
            }
            pVar = rVar;
        }
        zza = pVar;
    }

    public static f1 zza() {
        Collection U;
        AbstractCollection q10;
        Collection U2;
        int i10 = 0;
        c1 c1Var = new c1(0);
        Collection<Map.Entry> entrySet = ((Map) c1Var.f11923b).entrySet();
        Comparator comparator = (Comparator) c1Var.f11924c;
        if (comparator != null) {
            y1 a = y1.a(comparator);
            a.getClass();
            w wVar = new w(q1.f12021b, a);
            n0 n0Var = r0.f12026c;
            Collection collection = entrySet;
            if (collection instanceof Collection) {
                U2 = collection;
            } else {
                U2 = u0.U(collection.iterator());
            }
            Object[] array = U2.toArray();
            u0.h(array.length, array);
            Arrays.sort(array, wVar);
            entrySet = r0.h(array.length, array);
        }
        Comparator comparator2 = (Comparator) c1Var.f11925d;
        if (entrySet.isEmpty()) {
            return h0.f11967i;
        }
        s sVar = new s(entrySet.size());
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator2 == null) {
                q10 = b1.l(collection2);
            } else {
                int i11 = i1.f11973h;
                if (k.A(collection2, comparator2) && (collection2 instanceof i1)) {
                    i1 i1Var = (i1) collection2;
                    if (!i1Var.f()) {
                        q10 = i1Var;
                    }
                }
                Collection collection3 = collection2;
                if (collection3 instanceof Collection) {
                    U = collection3;
                } else {
                    U = u0.U(collection3.iterator());
                }
                Object[] array2 = U.toArray();
                q10 = i1.q(array2.length, comparator2, array2);
            }
            if (!q10.isEmpty()) {
                sVar.c(key, q10);
                i10 += q10.size();
            }
        }
        return new f1(sVar.a(), i10, comparator2);
    }
}
