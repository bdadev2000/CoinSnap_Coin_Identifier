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
public final class zzena extends com.google.android.gms.ads.internal.client.zzbx {
    private final com.google.android.gms.ads.internal.client.zzs zza;
    private final Context zzb;
    private final zzfcw zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzems zzf;
    private final zzfdw zzg;
    private final zzavc zzh;
    private final zzdsm zzi;

    @Nullable
    private zzdfj zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaL)).booleanValue();

    public zzena(Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzfcw zzfcwVar, zzems zzemsVar, zzfdw zzfdwVar, VersionInfoParcel versionInfoParcel, zzavc zzavcVar, zzdsm zzdsmVar) {
        this.zza = zzsVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfcwVar;
        this.zzf = zzemsVar;
        this.zzg = zzfdwVar;
        this.zze = versionInfoParcel;
        this.zzh = zzavcVar;
        this.zzi = zzdsmVar;
    }

    private final synchronized boolean zze() {
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null) {
            if (!zzdfjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null) {
            zzdfjVar.zzn().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbai zzbaiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
        this.zzf.zzn(zzctVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzL(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtp zzbtpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(zzbdi zzbdiVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbdiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzf.zzl(zzdrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbts zzbtsVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwp zzbwpVar) {
        this.zzg.zzm(zzbwpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfgq.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfgq.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzaa() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z10;
        if (!zzmVar.zzb()) {
            if (((Boolean) zzbel.zzi.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
                    z10 = true;
                    if (this.zze.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue() || !z10) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z10 = false;
            if (this.zze.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue()) {
            }
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            zzems zzemsVar = this.zzf;
            if (zzemsVar != null) {
                zzemsVar.zzdB(zzfgq.zzd(4, null, null));
            }
        } else if (!zze()) {
            zzfgl.zza(this.zzb, zzmVar.zzf);
            this.zzj = null;
            return this.zzc.zzb(zzmVar, this.zzd, new zzfcp(this.zza), new zzemz(this));
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        zzdfj zzdfjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgD)).booleanValue() && (zzdfjVar = this.zzj) != null) {
            return zzdfjVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized String zzs() {
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null && zzdfjVar.zzm() != null) {
            return zzdfjVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized String zzt() {
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null && zzdfjVar.zzm() != null) {
            return zzdfjVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null) {
            zzdfjVar.zzn().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
        this.zzf.zzk(zzboVar);
        zzab(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdfj zzdfjVar = this.zzj;
        if (zzdfjVar != null) {
            zzdfjVar.zzn().zzb(null);
        }
    }
}
