package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzmg extends zzav {
    private final /* synthetic */ zzls zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmg(zzls zzlsVar, zzjc zzjcVar) {
        super(zzjcVar);
        this.zza = zzlsVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzav
    public final void zzb() {
        this.zza.zzj().zzu().zza("Tasks have been queued for a long time");
    }
}
