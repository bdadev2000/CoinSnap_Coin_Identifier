package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zznr extends zzns {
    private boolean zza;

    public zznr(zznv zznvVar) {
        super(zznvVar);
        this.zzg.zzu();
    }

    public final void zzal() {
        if (zzan()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzam() {
        if (!this.zza) {
            zzc();
            this.zzg.zzt();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzan() {
        return this.zza;
    }

    public abstract boolean zzc();
}
