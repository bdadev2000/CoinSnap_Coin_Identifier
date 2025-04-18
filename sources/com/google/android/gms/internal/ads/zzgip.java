package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzgip extends zzggt {
    private final int zza;
    private final zzgin zzb;

    public /* synthetic */ zzgip(int i10, zzgin zzginVar, zzgio zzgioVar) {
        this.zza = i10;
        this.zzb = zzginVar;
    }

    public static zzgim zzc() {
        return new zzgim(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgip)) {
            return false;
        }
        zzgip zzgipVar = (zzgip) obj;
        return zzgipVar.zza == this.zza && zzgipVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgip.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return e.g(j.o("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzb != zzgin.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgin zzd() {
        return this.zzb;
    }
}
