package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;

/* loaded from: classes3.dex */
final class zzekm implements zzcxv {
    boolean zza = false;
    final /* synthetic */ zzefe zzb;
    final /* synthetic */ zzcao zzc;

    public zzekm(zzekn zzeknVar, zzefe zzefeVar, zzcao zzcaoVar) {
        this.zzb = zzefeVar;
        this.zzc = zzcaoVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzft)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzeff(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zza(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzekn.zze(this.zzb.zza, i10), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zzc(int i10, @Nullable String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzekn.zze(this.zzb.zza, i10);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxv
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
