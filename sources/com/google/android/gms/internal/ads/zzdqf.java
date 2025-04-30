package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class zzdqf implements com.google.android.gms.ads.internal.client.zza, zzbkf, com.google.android.gms.ads.internal.overlay.zzp, zzbkh, com.google.android.gms.ads.internal.overlay.zzaa {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbkf zzb;
    private com.google.android.gms.ads.internal.overlay.zzp zzc;
    private zzbkh zzd;
    private com.google.android.gms.ads.internal.overlay.zzaa zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final synchronized void zza(String str, Bundle bundle) {
        zzbkf zzbkfVar = this.zzb;
        if (zzbkfVar != null) {
            zzbkfVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkh
    public final synchronized void zzb(String str, @Nullable String str2) {
        zzbkh zzbkhVar = this.zzd;
        if (zzbkhVar != null) {
            zzbkhVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdH();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdq() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdu(int i9) {
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzc;
        if (zzpVar != null) {
            zzpVar.zzdu(i9);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zze;
        if (zzaaVar != null) {
            zzaaVar.zzg();
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbkf zzbkfVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbkh zzbkhVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar) {
        this.zza = zzaVar;
        this.zzb = zzbkfVar;
        this.zzc = zzpVar;
        this.zzd = zzbkhVar;
        this.zze = zzaaVar;
    }
}
