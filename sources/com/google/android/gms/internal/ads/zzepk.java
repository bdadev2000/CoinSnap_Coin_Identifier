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
public final class zzepk extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final Context zzb;
    private final zzfew zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzepc zzf;
    private final zzffw zzg;
    private final zzaxd zzh;
    private final zzdvc zzi;

    @Nullable
    private zzdig zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaE)).booleanValue();

    public zzepk(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzfew zzfewVar, zzepc zzepcVar, zzffw zzffwVar, VersionInfoParcel versionInfoParcel, zzaxd zzaxdVar, zzdvc zzdvcVar) {
        this.zza = zzqVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfewVar;
        this.zzf = zzepcVar;
        this.zzg = zzffwVar;
        this.zze = versionInfoParcel;
        this.zzh = zzaxdVar;
        this.zzi = zzdvcVar;
    }

    private final synchronized boolean zze() {
        zzdig zzdigVar = this.zzj;
        if (zzdigVar != null) {
            if (!zzdigVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdig zzdigVar = this.zzj;
        if (zzdigVar != null) {
            zzdigVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzbcj zzbcjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.zzn(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z8) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z8;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbvp zzbvpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z8) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbfk zzbfkVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbfkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzf.zzl(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbvs zzbvsVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbyn zzbynVar) {
        this.zzg.zzm(zzbynVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfiq.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfiq.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0051, B:15:0x0055, B:17:0x005e, B:21:0x0067, B:23:0x006d, B:26:0x0040), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgi.zzi     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzlg     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r0 = 1
            goto L28
        L24:
            r0 = r1
            goto L28
        L26:
            r6 = move-exception
            goto L8e
        L28:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zze     // Catch: java.lang.Throwable -> L26
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzbeg r3 = com.google.android.gms.internal.ads.zzbep.zzlh     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzben r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L26
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L26
            if (r2 < r3) goto L40
            if (r0 != 0) goto L45
        L40:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L26
        L45:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzH(r0)     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r0 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L67
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzepc r6 = r5.zzf     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L8c
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfiq.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.zzdB(r0)     // Catch: java.lang.Throwable -> L26
            goto L8c
        L67:
            boolean r0 = r5.zze()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L8c
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L26
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfil.zza(r0, r1)     // Catch: java.lang.Throwable -> L26
            r5.zzj = r2     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfew r0 = r5.zzc     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.ads.internal.client.zzq r2 = r5.zza     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfep r3 = new com.google.android.gms.internal.ads.zzfep     // Catch: java.lang.Throwable -> L26
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzepj r2 = new com.google.android.gms.internal.ads.zzepj     // Catch: java.lang.Throwable -> L26
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8c:
            monitor-exit(r5)
            return r1
        L8e:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepk.zzab(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        zzdig zzdigVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgW)).booleanValue() && (zzdigVar = this.zzj) != null) {
            return zzdigVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzs() {
        zzdig zzdigVar = this.zzj;
        if (zzdigVar != null && zzdigVar.zzl() != null) {
            return zzdigVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzt() {
        zzdig zzdigVar = this.zzj;
        if (zzdigVar != null && zzdigVar.zzl() != null) {
            return zzdigVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdig zzdigVar = this.zzj;
        if (zzdigVar != null) {
            zzdigVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.zzk(zzbkVar);
        zzab(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdig zzdigVar = this.zzj;
        if (zzdigVar != null) {
            zzdigVar.zzm().zzb(null);
        }
    }
}
