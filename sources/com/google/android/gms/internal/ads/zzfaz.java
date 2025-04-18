package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzfaz extends com.google.android.gms.ads.internal.client.zzbx implements com.google.android.gms.ads.internal.overlay.zzr, zzazz {

    @Nullable
    protected zzcox zza;
    private final zzchk zzb;
    private final Context zzc;
    private final String zze;
    private final zzfat zzf;
    private final zzfar zzg;
    private final VersionInfoParcel zzh;
    private final zzdsm zzi;

    @Nullable
    private zzcok zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfaz(zzchk zzchkVar, Context context, String str, zzfat zzfatVar, zzfar zzfarVar, VersionInfoParcel versionInfoParcel, zzdsm zzdsmVar) {
        this.zzb = zzchkVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfatVar;
        this.zzg = zzfarVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdsmVar;
        zzfarVar.zzm(this);
    }

    private final synchronized void zzq(int i10) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcok zzcokVar = this.zzk;
            if (zzcokVar != null) {
                com.google.android.gms.ads.internal.zzv.zzb().zze(zzcokVar);
            }
            if (this.zza != null) {
                long j3 = -1;
                if (this.zzj != -1) {
                    j3 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(j3, i10);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbai zzbaiVar) {
        this.zzg.zzo(zzbaiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzf.zzl(zzyVar);
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(zzbdi zzbdiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
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
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzazz
    public final void zza() {
        zzq(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        boolean z10;
        if (!zzmVar.zzb()) {
            if (((Boolean) zzbel.zzd.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
                    z10 = true;
                    if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue() || !z10) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z10 = false;
            if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue()) {
            }
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzg.zzdB(zzfgq.zzd(4, null, null));
            return false;
        }
        if (zzZ()) {
            return false;
        }
        this.zzd = new AtomicBoolean();
        return this.zzf.zzb(zzmVar, this.zze, new zzfax(this), new zzfay(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            int zza = this.zza.zza();
            if (zza > 0) {
                zzcok zzcokVar = new zzcok(this.zzb.zzD(), com.google.android.gms.ads.internal.zzv.zzC());
                this.zzk = zzcokVar;
                zzcokVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfaz.this.zzp();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdt() {
        zzcox zzcoxVar = this.zza;
        if (zzcoxVar != null) {
            zzcoxVar.zze(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
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

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // java.lang.Runnable
            public final void run() {
                zzfaz.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcox zzcoxVar = this.zza;
        if (zzcoxVar != null) {
            zzcoxVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
