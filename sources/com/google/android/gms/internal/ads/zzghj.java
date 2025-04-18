package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzghj extends zzggt {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzghh zze;
    private final zzghg zzf;

    public /* synthetic */ zzghj(int i10, int i11, int i12, int i13, zzghh zzghhVar, zzghg zzghgVar, zzghi zzghiVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzghhVar;
        this.zzf = zzghgVar;
    }

    public static zzghf zzf() {
        return new zzghf(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghj)) {
            return false;
        }
        zzghj zzghjVar = (zzghj) obj;
        return zzghjVar.zza == this.zza && zzghjVar.zzb == this.zzb && zzghjVar.zzc == this.zzc && zzghjVar.zzd == this.zzd && zzghjVar.zze == this.zze && zzghjVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzghj.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder p10 = j.p("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        p10.append(this.zzc);
        p10.append("-byte IV, and ");
        p10.append(this.zzd);
        p10.append("-byte tags, and ");
        p10.append(this.zza);
        p10.append("-byte AES key, and ");
        return e.g(p10, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zze != zzghh.zzc;
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

    public final zzghg zzg() {
        return this.zzf;
    }

    public final zzghh zzh() {
        return this.zze;
    }
}
