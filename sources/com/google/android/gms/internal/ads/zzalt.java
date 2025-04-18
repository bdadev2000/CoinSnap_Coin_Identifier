package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzalt {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzals
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((zzalt) obj).zzb.zzb, ((zzalt) obj2).zzb.zzb);
            return compare;
        }
    };
    private final zzalu zzb;
    private final int zzc;

    public /* synthetic */ zzalt(zzalu zzaluVar, int i10, zzalx zzalxVar) {
        this.zzb = zzaluVar;
        this.zzc = i10;
    }
}
