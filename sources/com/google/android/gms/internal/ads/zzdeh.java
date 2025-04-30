package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdeh implements zzdcg {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbh)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final synchronized void zzdo(zzfhf zzfhfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbi)).booleanValue()) {
            try {
                this.zza = zzfhfVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }
}
