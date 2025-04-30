package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmv extends zzat {
    private final /* synthetic */ zzmw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmv(zzmw zzmwVar, zzil zzilVar) {
        super(zzilVar);
        this.zza = zzmwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzat
    public final void zzb() {
        this.zza.zzu();
        this.zza.zzj().zzp().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzw();
    }
}
