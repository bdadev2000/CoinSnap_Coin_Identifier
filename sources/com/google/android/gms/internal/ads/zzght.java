package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzght extends zzggt {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzghr zzd;

    public /* synthetic */ zzght(int i10, int i11, int i12, zzghr zzghrVar, zzghs zzghsVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzghrVar;
    }

    public static zzghq zzd() {
        return new zzghq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzght)) {
            return false;
        }
        zzght zzghtVar = (zzght) obj;
        return zzghtVar.zza == this.zza && zzghtVar.zzb == this.zzb && zzghtVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzght.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder o10 = j.o("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        o10.append(this.zzb);
        o10.append("-byte IV, 16-byte tag, and ");
        return e.g(o10, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzd != zzghr.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzghr zze() {
        return this.zzd;
    }
}
