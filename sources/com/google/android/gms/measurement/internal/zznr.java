package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class zznr extends zzns {
    private boolean zza;

    public zznr(zznv zznvVar) {
        super(zznvVar);
        this.zzg.zzu();
    }

    public final void zzal() {
        if (!zzan()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzam() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzc();
        this.zzg.zzt();
        this.zza = true;
    }

    public final boolean zzan() {
        return this.zza;
    }

    public abstract boolean zzc();
}
