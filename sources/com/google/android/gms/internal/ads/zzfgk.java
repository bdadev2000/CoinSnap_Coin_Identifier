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

/* loaded from: classes2.dex */
public final class zzfgk extends zzbyz {
    private final zzfgg zza;
    private final zzffw zzb;
    private final String zzc;
    private final zzfhg zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzaxd zzg;
    private final zzdvc zzh;

    @Nullable
    private zzdrh zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaE)).booleanValue();

    public zzfgk(@Nullable String str, zzfgg zzfggVar, Context context, zzffw zzffwVar, zzfhg zzfhgVar, VersionInfoParcel versionInfoParcel, zzaxd zzaxdVar, zzdvc zzdvcVar) {
        this.zzc = str;
        this.zza = zzfggVar;
        this.zzb = zzffwVar;
        this.zzd = zzfhgVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzaxdVar;
        this.zzh = zzdvcVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzh zzbzhVar, int i9) throws RemoteException {
        try {
            boolean z8 = false;
            if (((Boolean) zzbgi.zzl.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlg)).booleanValue()) {
                    z8 = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlh)).intValue() || !z8) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
            this.zzb.zzk(zzbzhVar);
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zze) && zzlVar.zzs == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zzdB(zzfiq.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzffy zzffyVar = new zzffy(null);
            this.zza.zzj(i9);
            this.zza.zzb(zzlVar, this.zzc, zzffyVar, new zzfgj(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrh zzdrhVar = this.zzi;
        if (zzdrhVar != null) {
            return zzdrhVar.zza();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdrh zzdrhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgW)).booleanValue() && (zzdrhVar = this.zzi) != null) {
            return zzdrhVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    @Nullable
    public final zzbyx zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrh zzdrhVar = this.zzi;
        if (zzdrhVar != null) {
            return zzdrhVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    @Nullable
    public final synchronized String zze() throws RemoteException {
        zzdrh zzdrhVar = this.zzi;
        if (zzdrhVar != null && zzdrhVar.zzl() != null) {
            return zzdrhVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzh zzbzhVar) throws RemoteException {
        zzu(zzlVar, zzbzhVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzh zzbzhVar) throws RemoteException {
        zzu(zzlVar, zzbzhVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final synchronized void zzh(boolean z8) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfgi(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzb.zzi(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzk(zzbzd zzbzdVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final synchronized void zzl(zzbzo zzbzoVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfhg zzfhgVar = this.zzd;
        zzfhgVar.zza = zzbzoVar.zza;
        zzfhgVar.zzb = zzbzoVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z8) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfiq.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z8, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrh zzdrhVar = this.zzi;
        if (zzdrhVar != null && !zzdrhVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzp(zzbzi zzbziVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbziVar);
    }
}
