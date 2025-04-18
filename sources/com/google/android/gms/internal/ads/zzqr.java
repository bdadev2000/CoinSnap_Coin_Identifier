package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqr implements zzpx {
    final /* synthetic */ zzqw zza;

    public /* synthetic */ zzqr(zzqw zzqwVar, zzqv zzqvVar) {
        this.zza = zzqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zza(long j3) {
        zzdt.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzb(long j3) {
        zzpr zzprVar;
        zzpr zzprVar2;
        zzpm zzpmVar;
        zzqw zzqwVar = this.zza;
        zzprVar = zzqwVar.zzo;
        if (zzprVar != null) {
            zzprVar2 = zzqwVar.zzo;
            zzpmVar = ((zzra) zzprVar2).zza.zzc;
            zzpmVar.zzv(j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzc(long j3, long j10, long j11, long j12) {
        long zzL;
        long zzM;
        zzqw zzqwVar = this.zza;
        zzL = zzqwVar.zzL();
        zzM = zzqwVar.zzM();
        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Spurious audio timestamp (frame position mismatch): ", j3, ", ");
        o10.append(j10);
        o10.append(", ");
        o10.append(j11);
        o10.append(", ");
        o10.append(j12);
        o10.append(", ");
        o10.append(zzL);
        o10.append(", ");
        o10.append(zzM);
        zzdt.zzf("DefaultAudioSink", o10.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zzd(long j3, long j10, long j11, long j12) {
        long zzL;
        long zzM;
        zzqw zzqwVar = this.zza;
        zzL = zzqwVar.zzL();
        zzM = zzqwVar.zzM();
        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Spurious audio timestamp (system clock mismatch): ", j3, ", ");
        o10.append(j10);
        o10.append(", ");
        o10.append(j11);
        o10.append(", ");
        o10.append(j12);
        o10.append(", ");
        o10.append(zzL);
        o10.append(", ");
        o10.append(zzM);
        zzdt.zzf("DefaultAudioSink", o10.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zze(int i10, long j3) {
        zzpr zzprVar;
        long j10;
        zzpr zzprVar2;
        zzpm zzpmVar;
        zzqw zzqwVar = this.zza;
        zzprVar = zzqwVar.zzo;
        if (zzprVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j10 = zzqwVar.zzU;
            zzprVar2 = this.zza.zzo;
            zzpmVar = ((zzra) zzprVar2).zza.zzc;
            zzpmVar.zzx(i10, j3, elapsedRealtime - j10);
        }
    }
}
