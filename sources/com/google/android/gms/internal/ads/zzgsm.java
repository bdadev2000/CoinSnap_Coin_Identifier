package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgsm implements zzghw {
    private final zzgqk zza;
    private final zzgtl zzb;
    private final zzgtl zzc;

    public /* synthetic */ zzgsm(zzgqk zzgqkVar, zzgsl zzgslVar) {
        zzgtl zzgtlVar;
        this.zza = zzgqkVar;
        if (zzgqkVar.zzg()) {
            zzgtm zzb = zzgpg.zza().zzb();
            zzgtr zza = zzgoy.zza(zzgqkVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzgtlVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzgtlVar = zzgoy.zza;
            this.zzb = zzgtlVar;
        }
        this.zzc = zzgtlVar;
    }
}
