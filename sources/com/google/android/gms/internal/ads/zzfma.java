package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzfma extends com.google.android.gms.ads.internal.client.zzch {
    private final zzfmg zza;

    public zzfma(zzfmg zzfmgVar) {
        this.zza = zzfmgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbaf zze(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.ads.internal.client.zzby zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbxc zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(zzbpg zzbpgVar) {
        this.zza.zze(zzbpgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final synchronized void zzi(List list, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzf(list, zzcfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) {
        return this.zza.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) {
        return this.zza.zzh(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) {
        return this.zza.zzi(str);
    }
}
