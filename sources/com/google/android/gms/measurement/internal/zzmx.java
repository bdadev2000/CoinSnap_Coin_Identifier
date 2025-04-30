package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzmx extends zzmy {
    private boolean zza;

    public zzmx(zznc zzncVar) {
        super(zzncVar);
        this.zzf.zzu();
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
            this.zzf.zzt();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzan() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    public abstract boolean zzc();
}
