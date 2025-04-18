package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzgbe extends zzfyy {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfya zzb;

    public zzgbe(Iterator it, zzfya zzfyaVar) {
        this.zza = it;
        this.zzb = zzfyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfya zzfyaVar = this.zzb;
            Object next = it.next();
            if (zzfyaVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
