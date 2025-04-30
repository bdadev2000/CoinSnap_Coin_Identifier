package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzfcz extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzp, zzbca {

    @Nullable
    protected zzcrz zza;
    private final zzcjd zzb;
    private final Context zzc;
    private final String zze;
    private final zzfct zzf;
    private final zzfcr zzg;
    private final VersionInfoParcel zzh;
    private final zzdvc zzi;

    @Nullable
    private zzcrm zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfcz(zzcjd zzcjdVar, Context context, String str, zzfct zzfctVar, zzfcr zzfcrVar, VersionInfoParcel versionInfoParcel, zzdvc zzdvcVar) {
        this.zzb = zzcjdVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfctVar;
        this.zzg = zzfcrVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdvcVar;
        zzfcrVar.zzm(this);
    }

    private final synchronized void zzq(int i9) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzj();
                zzcrm zzcrmVar = this.zzk;
                if (zzcrmVar != null) {
                    com.google.android.gms.ads.internal.zzu.zzb().zze(zzcrmVar);
                }
                if (this.zza != null) {
                    long j7 = -1;
                    if (this.zzj != -1) {
                        j7 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(j7, i9);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzbcj zzbcjVar) {
        this.zzg.zzo(zzbcjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzf.zzl(zzwVar);
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbfk zzbfkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final void zza() {
        zzq(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: all -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0050, B:16:0x0055, B:20:0x0067, B:24:0x006f, B:27:0x0040), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzl r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgi.zzd     // Catch: java.lang.Throwable -> L26
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
            goto L8a
        L28:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zzh     // Catch: java.lang.Throwable -> L26
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
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzH(r0)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L55
            goto L67
        L55:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfcr r6 = r5.zzg     // Catch: java.lang.Throwable -> L26
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfiq.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.zzdB(r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r1
        L67:
            boolean r0 = r5.zzZ()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L6f
            monitor-exit(r5)
            return r1
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            r5.zzd = r0     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfcx r0 = new com.google.android.gms.internal.ads.zzfcx     // Catch: java.lang.Throwable -> L26
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfct r1 = r5.zzf     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r5.zze     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzfcy r3 = new com.google.android.gms.internal.ads.zzfcy     // Catch: java.lang.Throwable -> L26
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8a:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcz.zzab(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            int zza = this.zza.zza();
            if (zza > 0) {
                zzcrm zzcrmVar = new zzcrm(this.zzb.zzC(), com.google.android.gms.ads.internal.zzu.zzB());
                this.zzk = zzcrmVar;
                zzcrmVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfcz.this.zzp();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        zzcrz zzcrzVar = this.zza;
        if (zzcrzVar != null) {
            zzcrzVar.zze(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i9) {
        if (i9 != 0) {
            int i10 = i9 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        zzq(6);
                        return;
                    } else {
                        zzq(3);
                        return;
                    }
                }
                zzq(4);
                return;
            }
            zzq(2);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // java.lang.Runnable
            public final void run() {
                zzfcz.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcrz zzcrzVar = this.zza;
        if (zzcrzVar != null) {
            zzcrzVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
