package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqx implements zzqb {
    final /* synthetic */ zzrc zza;

    public /* synthetic */ zzqx(zzrc zzrcVar, zzqw zzqwVar) {
        this.zza = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zza(long j2) {
        zzea.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzb(long j2) {
        zzpv zzpvVar;
        zzpv zzpvVar2;
        zzpq zzpqVar;
        zzrc zzrcVar = this.zza;
        zzpvVar = zzrcVar.zzo;
        if (zzpvVar != null) {
            zzpvVar2 = zzrcVar.zzo;
            zzpqVar = ((zzrh) zzpvVar2).zza.zzc;
            zzpqVar.zzv(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzc(long j2, long j3, long j4, long j5) {
        long zzL;
        long zzM;
        zzrc zzrcVar = this.zza;
        zzL = zzrcVar.zzL();
        zzM = zzrcVar.zzM();
        StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Spurious audio timestamp (frame position mismatch): ", j2, ", ");
        r2.append(j3);
        r2.append(", ");
        r2.append(j4);
        r2.append(", ");
        r2.append(j5);
        r2.append(", ");
        r2.append(zzL);
        r2.append(", ");
        r2.append(zzM);
        zzea.zzf("DefaultAudioSink", r2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzd(long j2, long j3, long j4, long j5) {
        long zzL;
        long zzM;
        zzrc zzrcVar = this.zza;
        zzL = zzrcVar.zzL();
        zzM = zzrcVar.zzM();
        StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Spurious audio timestamp (system clock mismatch): ", j2, ", ");
        r2.append(j3);
        r2.append(", ");
        r2.append(j4);
        r2.append(", ");
        r2.append(j5);
        r2.append(", ");
        r2.append(zzL);
        r2.append(", ");
        r2.append(zzM);
        zzea.zzf("DefaultAudioSink", r2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zze(int i2, long j2) {
        zzpv zzpvVar;
        long j3;
        zzpv zzpvVar2;
        zzpq zzpqVar;
        zzrc zzrcVar = this.zza;
        zzpvVar = zzrcVar.zzo;
        if (zzpvVar != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j3 = zzrcVar.zzU;
            zzpvVar2 = this.zza.zzo;
            zzpqVar = ((zzrh) zzpvVar2).zza.zzc;
            zzpqVar.zzx(i2, j2, elapsedRealtime - j3);
        }
    }
}
