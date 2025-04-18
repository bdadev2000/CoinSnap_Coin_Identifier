package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzgie extends zzggt {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgic zzd;

    public /* synthetic */ zzgie(int i10, int i11, int i12, zzgic zzgicVar, zzgid zzgidVar) {
        this.zza = i10;
        this.zzd = zzgicVar;
    }

    public static zzgib zzc() {
        return new zzgib(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgie)) {
            return false;
        }
        zzgie zzgieVar = (zzgie) obj;
        return zzgieVar.zza == this.zza && zzgieVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgie.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return e.g(j.o("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzd != zzgic.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgic zzd() {
        return this.zzd;
    }
}
