package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcsa extends zzbcf {
    private final zzcrz zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzfcr zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaH)).booleanValue();
    private final zzdvc zze;

    public zzcsa(zzcrz zzcrzVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfcr zzfcrVar, zzdvc zzdvcVar) {
        this.zza = zzcrzVar;
        this.zzb = zzbuVar;
        this.zzc = zzfcrVar;
        this.zze = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgW)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzg(boolean z8) {
        this.zzd = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e4);
            }
            this.zzc.zzn(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzi(IObjectWrapper iObjectWrapper, zzbcn zzbcnVar) {
        try {
            this.zzc.zzp(zzbcnVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbcnVar, this.zzd);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }
}
