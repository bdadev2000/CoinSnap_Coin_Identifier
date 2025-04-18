package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgoy {
    private final zzghf zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgoy(zzghf zzghfVar, int i2, String str, String str2, zzgox zzgoxVar) {
        this.zza = zzghfVar;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoy)) {
            return false;
        }
        zzgoy zzgoyVar = (zzgoy) obj;
        return this.zza == zzgoyVar.zza && this.zzb == zzgoyVar.zzb && this.zzc.equals(zzgoyVar.zzc) && this.zzd.equals(zzgoyVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
