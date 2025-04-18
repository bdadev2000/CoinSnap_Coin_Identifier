package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzjd extends zzja {
    private boolean zza;

    public zzjd(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzu.zzaa();
    }

    public void zzaa() {
    }

    public final void zzac() {
        if (zzaf()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzad() {
        if (!this.zza) {
            if (!zzh()) {
                this.zzu.zzz();
                this.zza = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzae() {
        if (!this.zza) {
            zzaa();
            this.zzu.zzz();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzaf() {
        return this.zza;
    }

    public abstract boolean zzh();
}
