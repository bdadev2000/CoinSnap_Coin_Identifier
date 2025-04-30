package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgja extends zzgii {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgiy zze;
    private final zzgix zzf;

    public /* synthetic */ zzgja(int i9, int i10, int i11, int i12, zzgiy zzgiyVar, zzgix zzgixVar, zzgiz zzgizVar) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzgiyVar;
        this.zzf = zzgixVar;
    }

    public static zzgiw zzf() {
        return new zzgiw(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgja)) {
            return false;
        }
        zzgja zzgjaVar = (zzgja) obj;
        if (zzgjaVar.zza != this.zza || zzgjaVar.zzb != this.zzb || zzgjaVar.zzc != this.zzc || zzgjaVar.zzd != this.zzd || zzgjaVar.zze != this.zze || zzgjaVar.zzf != this.zzf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgja.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder o3 = o.o("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        o3.append(this.zzc);
        o3.append("-byte IV, and ");
        o3.append(this.zzd);
        o3.append("-byte tags, and ");
        o3.append(this.zza);
        o3.append("-byte AES key, and ");
        return AbstractC2914a.g(o3, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zze != zzgiy.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgix zzg() {
        return this.zzf;
    }

    public final zzgiy zzh() {
        return this.zze;
    }
}
