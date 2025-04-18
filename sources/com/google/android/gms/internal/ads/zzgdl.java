package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
final class zzgdl extends zzgdj {
    private zzgdl() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final int zza(zzgdn zzgdnVar) {
        int i10;
        int i11;
        synchronized (zzgdnVar) {
            i10 = zzgdnVar.remaining;
            i11 = i10 - 1;
            zzgdnVar.remaining = i11;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzb(zzgdn zzgdnVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgdnVar) {
            set3 = zzgdnVar.seenExceptions;
            if (set3 == null) {
                zzgdnVar.seenExceptions = set2;
            }
        }
    }

    public /* synthetic */ zzgdl(zzgdm zzgdmVar) {
        super(null);
    }
}
