package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzfek extends zzbxb {
    private final zzfeg zza;
    private final zzfdw zzb;
    private final String zzc;
    private final zzffg zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzavc zzg;
    private final zzdsm zzh;

    @Nullable
    private zzdor zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaL)).booleanValue();

    public zzfek(@Nullable String str, zzfeg zzfegVar, Context context, zzfdw zzfdwVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel, zzavc zzavcVar, zzdsm zzdsmVar) {
        this.zzc = str;
        this.zza = zzfegVar;
        this.zzb = zzfdwVar;
        this.zzd = zzffgVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzavcVar;
        this.zzh = zzdsmVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxj zzbxjVar, int i10) throws RemoteException {
        if (!zzmVar.zzb()) {
            boolean z10 = false;
            if (((Boolean) zzbel.zzk.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
                    z10 = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue() || !z10) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        this.zzb.zzk(zzbxjVar);
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zze) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzdB(zzfgq.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzfdy zzfdyVar = new zzfdy(null);
        this.zza.zzj(i10);
        this.zza.zzb(zzmVar, this.zzc, zzfdyVar, new zzfej(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdor zzdorVar = this.zzi;
        if (zzdorVar != null) {
            return zzdorVar.zza();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
        zzdor zzdorVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgD)).booleanValue() && (zzdorVar = this.zzi) != null) {
            return zzdorVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    @Nullable
    public final zzbwz zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdor zzdorVar = this.zzi;
        if (zzdorVar != null) {
            return zzdorVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    @Nullable
    public final synchronized String zze() throws RemoteException {
        zzdor zzdorVar = this.zzi;
        if (zzdorVar != null && zzdorVar.zzm() != null) {
            return zzdorVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxj zzbxjVar) throws RemoteException {
        zzu(zzmVar, zzbxjVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxj zzbxjVar) throws RemoteException {
        zzu(zzmVar, zzbxjVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzh(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
        if (zzdoVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfei(this, zzdoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzb.zzi(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzk(zzbxf zzbxfVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbxfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzl(zzbxq zzbxqVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzffg zzffgVar = this.zzd;
        zzffgVar.zza = zzbxqVar.zza;
        zzffgVar.zzb = zzbxqVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfgq.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z10, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdor zzdorVar = this.zzi;
        if (zzdorVar != null && !zzdorVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzp(zzbxk zzbxkVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbxkVar);
    }
}
