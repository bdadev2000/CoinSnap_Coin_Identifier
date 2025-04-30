package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjj implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zziv zzb;

    public zzjj(zziv zzivVar, boolean z8) {
        this.zza = z8;
        this.zzb = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zzac = this.zzb.zzu.zzac();
        boolean zzab = this.zzb.zzu.zzab();
        this.zzb.zzu.zza(this.zza);
        if (zzab == this.zza) {
            this.zzb.zzu.zzj().zzp().zza("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzu.zzac() == zzac || this.zzb.zzu.zzac() != this.zzb.zzu.zzab()) {
            this.zzb.zzu.zzj().zzv().zza("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zzac));
        }
        this.zzb.zzat();
    }
}
