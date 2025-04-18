package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzja implements zzjc {
    protected final zzhy zzu;

    public zzja(zzhy zzhyVar) {
        Preconditions.checkNotNull(zzhyVar);
        this.zzu = zzhyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public Context zza() {
        return this.zzu.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public Clock zzb() {
        return this.zzu.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public zzab zzd() {
        return this.zzu.zzd();
    }

    @Pure
    public zzag zze() {
        return this.zzu.zzf();
    }

    @Pure
    public zzaz zzf() {
        return this.zzu.zzg();
    }

    @Pure
    public zzgh zzi() {
        return this.zzu.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public zzgo zzj() {
        return this.zzu.zzj();
    }

    @Pure
    public zzha zzk() {
        return this.zzu.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public zzhv zzl() {
        return this.zzu.zzl();
    }

    @Pure
    public zzos zzq() {
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
