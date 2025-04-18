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
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class zzely extends com.google.android.gms.ads.internal.client.zzbx implements zzcyy {
    private final Context zza;
    private final zzfbf zzb;
    private final String zzc;
    private final zzems zzd;
    private com.google.android.gms.ads.internal.client.zzs zze;
    private final zzffm zzf;
    private final VersionInfoParcel zzg;
    private final zzdsm zzh;

    @Nullable
    private zzcpd zzi;

    public zzely(Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzfbf zzfbfVar, zzems zzemsVar, VersionInfoParcel versionInfoParcel, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzfbfVar;
        this.zze = zzsVar;
        this.zzc = str;
        this.zzd = zzemsVar;
        this.zzf = zzfbfVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdsmVar;
        zzfbfVar.zzp(this);
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzf.zzs(zzsVar);
        this.zzf.zzy(this.zze.zzn);
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        if (zzm()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zza) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            zzems zzemsVar = this.zzd;
            if (zzemsVar != null) {
                zzemsVar.zzdB(zzfgq.zzd(4, null, null));
            }
            return false;
        }
        zzfgl.zza(this.zza, zzmVar.zzf);
        return this.zzb.zzb(zzmVar, this.zzc, null, new zzelx(this));
    }

    private final boolean zzm() {
        boolean z10;
        if (((Boolean) zzbel.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
                z10 = true;
                if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue() || !z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue()) {
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            zzcpdVar.zzh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzkR)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.internal.ads.zzbel.zzh     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzkL     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbce r1 = com.google.android.gms.internal.ads.zzbcn.zzkR     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbcl r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcpd r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcxl r0 = r0.zzn()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzely.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzsVar);
        this.zze = zzsVar;
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            zzcpdVar.zzi(this.zzb.zzc(), zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbai zzbaiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtp zzbtpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean z10) {
        if (zzm()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzB(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(zzbdi zzbdiVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbdiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdrVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzd.zzl(zzdrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbts zzbtsVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwp zzbwpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzI(zzgaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            if (zzcpdVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final synchronized void zza() {
        if (this.zzb.zzt()) {
            com.google.android.gms.ads.internal.client.zzs zzh = this.zzf.zzh();
            zzcpd zzcpdVar = this.zzi;
            if (zzcpdVar != null && zzcpdVar.zzg() != null && this.zzf.zzT()) {
                zzh = zzffu.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
            }
            zzf(zzh);
            this.zzf.zzx(true);
            try {
                zzh(this.zzf.zzf());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to refresh the banner ad.");
            }
            this.zzf.zzx(false);
            return;
        }
        this.zzb.zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzf(this.zze);
        return zzh(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(zzcqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        if (this.zzb.zzt()) {
            this.zzb.zzr();
        } else {
            this.zzb.zzn();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            return zzffu.zza(this.zza, Collections.singletonList(zzcpdVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        zzcpd zzcpdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgD)).booleanValue() && (zzcpdVar = this.zzi) != null) {
            return zzcpdVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            return zzcpdVar.zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        if (zzm()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzc());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized String zzs() {
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null && zzcpdVar.zzm() != null) {
            return zzcpdVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized String zzt() {
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null && zzcpdVar.zzm() != null) {
            return zzcpdVar.zzm().zzg();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzkR)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.internal.ads.zzbel.zze     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzkM     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L47
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbce r1 = com.google.android.gms.internal.ads.zzbcn.zzkR     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbcl r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.google.android.gms.internal.ads.zzcpd r0 = r3.zzi     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.zzb()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzely.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzkR)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.internal.ads.zzbel.zzg     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzkN     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.clientJarVersion     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbce r1 = com.google.android.gms.internal.ads.zzbcn.zzkR     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbcl r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcpd r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcxl r0 = r0.zzn()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzely.zzz():void");
    }
}
