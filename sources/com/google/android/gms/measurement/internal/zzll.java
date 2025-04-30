package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzll extends zzat {
    private final /* synthetic */ zzkx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzll(zzkx zzkxVar, zzil zzilVar) {
        super(zzilVar);
        this.zza = zzkxVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzat
    public final void zzb() {
        this.zza.zzj().zzu().zza("Tasks have been queued for a long time");
    }
}
