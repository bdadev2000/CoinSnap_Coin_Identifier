package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzdel;

/* loaded from: classes3.dex */
public final class zzab extends zzbtf {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzab(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (!this.zzd) {
            zzr zzrVar = this.zza.zzc;
            if (zzrVar != null) {
                zzrVar.zzdu(4);
            }
            this.zzd = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final boolean zzH() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzh(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzl(@Nullable Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzix)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z10) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdel zzdelVar = this.zza.zzu;
            if (zzdelVar != null) {
                zzdelVar.zzdG();
            }
            if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = this.zza.zzc) != null) {
                zzrVar.zzdr();
            }
        }
        Activity activity = this.zzb;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
        com.google.android.gms.ads.internal.zzv.zzi();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (!zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzm() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzo() throws RemoteException {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdk();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzr() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzu() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzv() throws RemoteException {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzx() throws RemoteException {
        this.zze = true;
    }
}
