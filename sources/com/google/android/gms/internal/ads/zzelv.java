package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;

/* loaded from: classes3.dex */
final class zzelv implements zzczj {
    boolean zza = false;
    final /* synthetic */ zzegn zzb;
    final /* synthetic */ zzcas zzc;

    public zzelv(zzelw zzelwVar, zzegn zzegnVar, zzcas zzcasVar) {
        this.zzb = zzegnVar;
        this.zzc = zzcasVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i2 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfm)).booleanValue()) {
            i2 = 3;
        }
        this.zzc.zzd(new zzego(i2, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zza(int i2) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i2, zzelw.zze(this.zzb.zza, i2), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzc(int i2, @Nullable String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzelw.zze(this.zzb.zza, i2);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i2, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
