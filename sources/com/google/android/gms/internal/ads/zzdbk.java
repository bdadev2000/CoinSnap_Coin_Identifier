package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdbk implements zzczj {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbn)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmz)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzdo(zzfff zzfffVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbo)).booleanValue()) {
            try {
                zzfew zzfewVar = zzfffVar.zzb.zzb;
                this.zza = zzfewVar.zzc;
                this.zzb = zzfewVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
