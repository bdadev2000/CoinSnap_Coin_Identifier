package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzmh extends zze {
    protected final zzmp zza;
    protected final zzmn zzb;
    private Handler zzc;
    private boolean zzd;
    private final zzmm zze;

    public zzmh(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzd = true;
        this.zza = new zzmp(this);
        this.zzb = new zzmn(this);
        this.zze = new zzmm(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzt();
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.measurement.zzcz(Looper.getMainLooper());
        }
    }

    public final boolean zzaa() {
        zzt();
        return this.zzd;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfp zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziv zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmh zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public static /* synthetic */ void zza(zzmh zzmhVar, long j7) {
        zzmhVar.zzt();
        zzmhVar.zzab();
        zzmhVar.zzj().zzp().zza("Activity paused, time", Long.valueOf(j7));
        zzmhVar.zze.zza(j7);
        if (zzmhVar.zze().zzv()) {
            zzmhVar.zzb.zzb(j7);
        }
    }

    public static /* synthetic */ void zzb(zzmh zzmhVar, long j7) {
        zzmhVar.zzt();
        zzmhVar.zzab();
        zzmhVar.zzj().zzp().zza("Activity resumed, time", Long.valueOf(j7));
        if (zzmhVar.zze().zza(zzbf.zzcg)) {
            if (zzmhVar.zze().zzv() || zzmhVar.zzd) {
                zzmhVar.zzb.zzc(j7);
            }
        } else if (zzmhVar.zze().zzv() || zzmhVar.zzk().zzn.zza()) {
            zzmhVar.zzb.zzc(j7);
        }
        zzmhVar.zze.zza();
        zzmp zzmpVar = zzmhVar.zza;
        zzmpVar.zza.zzt();
        if (zzmpVar.zza.zzu.zzac()) {
            zzmpVar.zza(zzmpVar.zza.zzb().currentTimeMillis(), false);
        }
    }

    public final void zza(boolean z8) {
        zzt();
        this.zzd = z8;
    }

    public final boolean zza(boolean z8, boolean z9, long j7) {
        return this.zzb.zza(z8, z9, j7);
    }
}
