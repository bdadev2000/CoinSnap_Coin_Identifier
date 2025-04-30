package com.google.android.gms.internal.measurement;

import R2.b;
import c4.e;

/* loaded from: classes2.dex */
public final class zzhm {
    public static final e zza = b.t(new e() { // from class: com.google.android.gms.internal.measurement.zzho
        @Override // c4.e
        public final Object get() {
            return zzhm.zza();
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.f() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d4.w zza() {
        /*
            d4.f r0 = d4.C2178f.a()
            java.util.Set r0 = r0.entrySet()
            r1 = r0
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            d4.g r0 = d4.C2179g.f19867d
            goto L74
        L14:
            D0.l r1 = new D0.l
            d4.c r0 = (d4.C2175c) r0
            java.util.AbstractMap r2 = r0.f19856c
            d4.f r2 = (d4.C2178f) r2
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L28:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            int r5 = d4.u.f19883d
            boolean r5 = r3 instanceof d4.u
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof java.util.SortedSet
            if (r5 != 0) goto L52
            r5 = r3
            d4.u r5 = (d4.u) r5
            boolean r6 = r5.f()
            if (r6 != 0) goto L52
            goto L5b
        L52:
            java.lang.Object[] r3 = r3.toArray()
            int r5 = r3.length
            d4.u r5 = d4.u.j(r5, r3)
        L5b:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L28
            r1.h(r4, r5)
            int r3 = r5.size()
            int r3 = r3 + r2
            r2 = r3
            goto L28
        L6b:
            d4.w r0 = new d4.w
            d4.J r1 = r1.b()
            r0.<init>(r1, r2)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhm.zza():d4.w");
    }
}
