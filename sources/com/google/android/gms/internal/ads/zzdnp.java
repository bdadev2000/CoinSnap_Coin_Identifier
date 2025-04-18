package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class zzdnp implements com.google.android.gms.ads.internal.client.zza, zzbih, com.google.android.gms.ads.internal.overlay.zzr, zzbij, com.google.android.gms.ads.internal.overlay.zzac {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbih zzb;
    private com.google.android.gms.ads.internal.overlay.zzr zzc;
    private zzbij zzd;
    private com.google.android.gms.ads.internal.overlay.zzac zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final synchronized void zza(String str, Bundle bundle) {
        zzbih zzbihVar = this.zzb;
        if (zzbihVar != null) {
            zzbihVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final synchronized void zzb(String str, @Nullable String str2) {
        zzbij zzbijVar = this.zzd;
        if (zzbijVar != null) {
            zzbijVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdH() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdH();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdu(int i10) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdu(i10);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzac
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zze;
        if (zzacVar != null) {
            zzacVar.zzg();
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbij zzbijVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar) {
        this.zza = zzaVar;
        this.zzb = zzbihVar;
        this.zzc = zzrVar;
        this.zzd = zzbijVar;
        this.zze = zzacVar;
    }
}
