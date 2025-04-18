package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzcoy extends zzbae {
    private final zzcox zza;
    private final com.google.android.gms.ads.internal.client.zzby zzb;
    private final zzfar zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaO)).booleanValue();
    private final zzdsm zze;

    public zzcoy(zzcox zzcoxVar, com.google.android.gms.ads.internal.client.zzby zzbyVar, zzfar zzfarVar, zzdsm zzdsmVar) {
        this.zza = zzcoxVar;
        this.zzb = zzbyVar;
        this.zzc = zzfarVar;
        this.zze = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final com.google.android.gms.ads.internal.client.zzby zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdy zzf() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgD)).booleanValue()) {
            return null;
        }
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e2);
            }
            this.zzc.zzn(zzdrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzi(IObjectWrapper iObjectWrapper, zzbam zzbamVar) {
        try {
            this.zzc.zzp(zzbamVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbamVar, this.zzd);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }
}
