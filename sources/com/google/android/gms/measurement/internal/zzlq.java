package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlq implements Runnable {
    private final /* synthetic */ zzlk zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzlj zzc;

    public zzlq(zzlj zzljVar, zzlk zzlkVar, long j3) {
        this.zza = zzlkVar;
        this.zzb = j3;
        this.zzc = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        zzlj zzljVar = this.zzc;
        zzljVar.zza = null;
        zzljVar.zzo().zza((zzlk) null);
    }
}
