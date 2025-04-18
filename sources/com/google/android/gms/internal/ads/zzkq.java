package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzkq {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkq() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzkq zzd(long j2) {
        boolean z2 = true;
        if (j2 < 0) {
            if (j2 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                z2 = false;
            }
        }
        zzdi.zzd(z2);
        this.zzc = j2;
        return this;
    }

    public final zzkq zze(long j2) {
        this.zza = j2;
        return this;
    }

    public final zzkq zzf(float f2) {
        boolean z2 = true;
        if (f2 <= 0.0f && f2 != -3.4028235E38f) {
            z2 = false;
        }
        zzdi.zzd(z2);
        this.zzb = f2;
        return this;
    }

    public final zzks zzg() {
        return new zzks(this, null);
    }

    public /* synthetic */ zzkq(zzks zzksVar, zzkp zzkpVar) {
        this.zza = zzksVar.zza;
        this.zzb = zzksVar.zzb;
        this.zzc = zzksVar.zzc;
    }
}
