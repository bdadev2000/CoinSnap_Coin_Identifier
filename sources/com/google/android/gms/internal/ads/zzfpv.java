package com.google.android.gms.internal.ads;

import a4.j;

/* loaded from: classes3.dex */
final class zzfpv extends zzfpr {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfpv(String str, boolean z10, boolean z11, boolean z12, long j3, boolean z13, long j10, zzfpu zzfpuVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j3;
        this.zze = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfpr) {
            zzfpr zzfprVar = (zzfpr) obj;
            if (this.zza.equals(zzfprVar.zzd()) && this.zzb == zzfprVar.zzh() && this.zzc == zzfprVar.zzg()) {
                zzfprVar.zzf();
                if (this.zzd == zzfprVar.zzb()) {
                    zzfprVar.zze();
                    if (this.zze == zzfprVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdShield2Options{clientVersion=");
        sb2.append(this.zza);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(this.zzb);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(this.zzc);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(this.zzd);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        return j.j(sb2, this.zze, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfpr
    public final boolean zzh() {
        return this.zzb;
    }
}
