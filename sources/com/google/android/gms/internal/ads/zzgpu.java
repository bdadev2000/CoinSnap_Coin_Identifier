package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzgpu extends zzgqo {
    private final int zza;
    private final int zzb;
    private final zzgps zzc;

    public /* synthetic */ zzgpu(int i10, int i11, zzgps zzgpsVar, zzgpt zzgptVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgpsVar;
    }

    public static zzgpr zze() {
        return new zzgpr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpu)) {
            return false;
        }
        zzgpu zzgpuVar = (zzgpu) obj;
        if (zzgpuVar.zza != this.zza || zzgpuVar.zzd() != zzd() || zzgpuVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgpu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        StringBuilder o10 = j.o("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        o10.append(this.zzb);
        o10.append("-byte tags, and ");
        return e.g(o10, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzc != zzgps.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgps zzgpsVar = this.zzc;
        if (zzgpsVar == zzgps.zzd) {
            return this.zzb;
        }
        if (zzgpsVar == zzgps.zza || zzgpsVar == zzgps.zzb || zzgpsVar == zzgps.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgps zzf() {
        return this.zzc;
    }
}
