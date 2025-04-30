package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzij implements zzil {
    protected final zzhj zzu;

    public zzij(zzhj zzhjVar) {
        Preconditions.checkNotNull(zzhjVar);
        this.zzu = zzhjVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public Context zza() {
        return this.zzu.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public Clock zzb() {
        return this.zzu.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public zzab zzd() {
        return this.zzu.zzd();
    }

    public zzag zze() {
        return this.zzu.zzf();
    }

    public zzax zzf() {
        return this.zzu.zzg();
    }

    public zzfr zzi() {
        return this.zzu.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public zzfw zzj() {
        return this.zzu.zzj();
    }

    public zzgh zzk() {
        return this.zzu.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public zzhc zzl() {
        return this.zzu.zzl();
    }

    public zznp zzq() {
        return this.zzu.zzt();
    }

    public void zzr() {
        this.zzu.zzl().zzr();
    }

    public void zzs() {
        this.zzu.zzy();
    }

    public void zzt() {
        this.zzu.zzl().zzt();
    }
}
