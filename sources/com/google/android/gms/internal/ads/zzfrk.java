package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfrk extends zzfrg {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfrk(String str, boolean z8, boolean z9, zzfrj zzfrjVar) {
        this.zza = str;
        this.zzb = z8;
        this.zzc = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrg) {
            zzfrg zzfrgVar = (zzfrg) obj;
            if (this.zza.equals(zzfrgVar.zzb()) && this.zzb == zzfrgVar.zzd() && this.zzc == zzfrgVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.zza.hashCode() ^ 1000003;
        int i10 = 1231;
        if (true != this.zzb) {
            i9 = 1237;
        } else {
            i9 = 1231;
        }
        int i11 = ((hashCode * 1000003) ^ i9) * 1000003;
        if (true != this.zzc) {
            i10 = 1237;
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final boolean zzd() {
        return this.zzb;
    }
}
