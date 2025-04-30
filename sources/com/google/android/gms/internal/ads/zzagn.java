package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzagn extends zzaeh {
    private final long zza;

    public zzagn(zzadv zzadvVar, long j7) {
        super(zzadvVar);
        boolean z8;
        if (zzadvVar.zzf() >= j7) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zza = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaeh, com.google.android.gms.internal.ads.zzadv
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeh, com.google.android.gms.internal.ads.zzadv
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeh, com.google.android.gms.internal.ads.zzadv
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
