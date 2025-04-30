package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzanh {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzanf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((zzanh) obj).zzb.zzb, ((zzanh) obj2).zzb.zzb);
            return compare;
        }
    };
    private final zzani zzb;
    private final int zzc;

    public /* synthetic */ zzanh(zzani zzaniVar, int i9, zzang zzangVar) {
        this.zzb = zzaniVar;
        this.zzc = i9;
    }
}
