package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzamh {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzamf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((zzamh) obj).zzb.zzb, ((zzamh) obj2).zzb.zzb);
            return compare;
        }
    };
    private final zzami zzb;
    private final int zzc;

    public /* synthetic */ zzamh(zzami zzamiVar, int i2, zzamg zzamgVar) {
        this.zzb = zzamiVar;
        this.zzc = i2;
    }
}
