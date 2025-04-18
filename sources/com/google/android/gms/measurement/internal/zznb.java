package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zznb extends zzh {
    protected final zznj zza;
    protected final zznh zzb;
    private Handler zzc;
    private boolean zzd;
    private final zzng zze;

    public zznb(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzd = true;
        this.zza = new zznj(this);
        this.zzb = new zznh(this);
        this.zze = new zzng(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzt();
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.measurement.zzdh(Looper.getMainLooper());
        }
    }

    public final boolean zzaa() {
        zzt();
        return this.zzd;
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    public final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public static /* synthetic */ void zza(zznb zznbVar, long j3) {
        zznbVar.zzt();
        zznbVar.zzab();
        zznbVar.zzj().zzp().zza("Activity paused, time", Long.valueOf(j3));
        zznbVar.zze.zza(j3);
        if (zznbVar.zze().zzw()) {
            zznbVar.zzb.zzb(j3);
        }
    }

    public static /* synthetic */ void zzb(zznb zznbVar, long j3) {
        zznbVar.zzt();
        zznbVar.zzab();
        zznbVar.zzj().zzp().zza("Activity resumed, time", Long.valueOf(j3));
        if (zznbVar.zze().zza(zzbh.zzco)) {
            if (zznbVar.zze().zzw() || zznbVar.zzd) {
                zznbVar.zzb.zzc(j3);
            }
        } else if (zznbVar.zze().zzw() || zznbVar.zzk().zzn.zza()) {
            zznbVar.zzb.zzc(j3);
        }
        zznbVar.zze.zza();
        zznj zznjVar = zznbVar.zza;
        zznjVar.zza.zzt();
        if (zznjVar.zza.zzu.zzac()) {
            zznjVar.zza(zznjVar.zza.zzb().currentTimeMillis(), false);
        }
    }

    public final void zza(boolean z10) {
        zzt();
        this.zzd = z10;
    }

    public final boolean zza(boolean z10, boolean z11, long j3) {
        return this.zzb.zza(z10, z11, j3);
    }
}
