package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;

/* loaded from: classes2.dex */
final class zzemw implements zzdau {
    boolean zza = false;
    final /* synthetic */ zzeho zzb;
    final /* synthetic */ zzccn zzc;
    final /* synthetic */ zzemx zzd;

    public zzemw(zzemx zzemxVar, zzeho zzehoVar, zzccn zzccnVar) {
        this.zzb = zzehoVar;
        this.zzc = zzccnVar;
        this.zzd = zzemxVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i9 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfA)).booleanValue()) {
            i9 = 3;
        }
        this.zzc.zzd(new zzehp(i9, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zza(int i9) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i9, zzemx.zze(this.zzb.zza, i9), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zzc(int i9, @Nullable String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzemx.zze(this.zzb.zza, i9);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i9, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
