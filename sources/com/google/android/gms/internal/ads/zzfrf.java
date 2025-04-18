package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzfrf extends zzfrb {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfrf(String str, boolean z2, boolean z3, zzfre zzfreVar) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrb) {
            zzfrb zzfrbVar = (zzfrb) obj;
            if (this.zza.equals(zzfrbVar.zzb()) && this.zzb == zzfrbVar.zzd() && this.zzc == zzfrbVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    public final boolean zzd() {
        return this.zzb;
    }
}
