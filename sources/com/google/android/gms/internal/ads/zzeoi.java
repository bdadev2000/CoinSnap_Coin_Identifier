package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzeoi extends com.google.android.gms.ads.internal.client.zzbt implements zzdcb {
    private final Context zza;
    private final zzfdf zzb;
    private final String zzc;
    private final zzepc zzd;
    private com.google.android.gms.ads.internal.client.zzq zze;
    private final zzfhm zzf;
    private final VersionInfoParcel zzg;
    private final zzdvc zzh;

    @Nullable
    private zzcsf zzi;

    public zzeoi(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzfdf zzfdfVar, zzepc zzepcVar, VersionInfoParcel versionInfoParcel, zzdvc zzdvcVar) {
        this.zza = context;
        this.zzb = zzfdfVar;
        this.zze = zzqVar;
        this.zzc = str;
        this.zzd = zzepcVar;
        this.zzf = zzfdfVar.zzi();
        this.zzg = versionInfoParcel;
        this.zzh = zzdvcVar;
        zzfdfVar.zzp(this);
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzf.zzs(zzqVar);
        this.zzf.zzy(this.zze.zzn);
    }

    private final synchronized boolean zzf(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        try {
            if (zzh()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zza) && zzlVar.zzs == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
                zzepc zzepcVar = this.zzd;
                if (zzepcVar != null) {
                    zzepcVar.zzdB(zzfiq.zzd(4, null, null));
                }
                return false;
            }
            zzfil.zza(this.zza, zzlVar.zzf);
            return this.zzb.zzb(zzlVar, this.zzc, null, new zzeoh(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzh() {
        boolean z8;
        if (((Boolean) zzbgi.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlg)).booleanValue()) {
                z8 = true;
                if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlh)).intValue() || !z8) {
                    return true;
                }
                return false;
            }
        }
        z8 = false;
        if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlh)).intValue()) {
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcsf zzcsfVar = this.zzi;
        if (zzcsfVar != null) {
            zzcsfVar.zzg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgi.zzh     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzlc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzli     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzcsf r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzdak r0 = r0.zzm()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeoi.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzqVar);
        this.zze = zzqVar;
        zzcsf zzcsfVar = this.zzi;
        if (zzcsfVar != null) {
            zzcsfVar.zzh(this.zzb.zzd(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzbcj zzbcjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z8) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbvp zzbvpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z8) {
        try {
            if (zzh()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzB(z8);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbfk zzbfkVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbfkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzd.zzl(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbvs zzbvsVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbyn zzbynVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        try {
            if (zzh()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzI(zzfkVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        zzcsf zzcsfVar = this.zzi;
        if (zzcsfVar != null) {
            if (zzcsfVar.zzr()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdcb
    public final synchronized void zza() {
        try {
            if (this.zzb.zzr()) {
                com.google.android.gms.ads.internal.client.zzq zzh = this.zzf.zzh();
                zzcsf zzcsfVar = this.zzi;
                if (zzcsfVar != null && zzcsfVar.zzf() != null && this.zzf.zzS()) {
                    zzh = zzfhu.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
                }
                zze(zzh);
                this.zzf.zzx(true);
                try {
                    zzf(this.zzf.zzf());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to refresh the banner ad.");
                }
                this.zzf.zzx(false);
                return;
            }
            this.zzb.zzn();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        zze(this.zze);
        return zzf(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzU(zzcfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcsf zzcsfVar = this.zzi;
        if (zzcsfVar != null) {
            return zzfhu.zza(this.zza, Collections.singletonList(zzcsfVar.zze()));
        }
        return this.zzf.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        zzcsf zzcsfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgW)).booleanValue() && (zzcsfVar = this.zzi) != null) {
            return zzcsfVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcsf zzcsfVar = this.zzi;
        if (zzcsfVar != null) {
            return zzcsfVar.zzd();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzs() {
        zzcsf zzcsfVar = this.zzi;
        if (zzcsfVar != null && zzcsfVar.zzl() != null) {
            return zzcsfVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzt() {
        zzcsf zzcsfVar = this.zzi;
        if (zzcsfVar != null && zzcsfVar.zzl() != null) {
            return zzcsfVar.zzl().zzg();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgi.zze     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzld     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzli     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzcsf r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.zzb()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeoi.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgi.zzg     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzle     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzli     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzcsf r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzdak r0 = r0.zzm()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeoi.zzz():void");
    }
}
