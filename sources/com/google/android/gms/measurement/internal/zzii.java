package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzii extends zzij {
    private boolean zza;

    public zzii(zzhj zzhjVar) {
        super(zzhjVar);
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
            if (!zzo()) {
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
        if (this.zza) {
            return true;
        }
        return false;
    }

    public abstract boolean zzo();
}
