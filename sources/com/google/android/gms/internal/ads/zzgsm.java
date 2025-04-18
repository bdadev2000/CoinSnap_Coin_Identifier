package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgsm extends zzgsp {
    private final int zza;
    private final int zzb;
    private final zzgsk zzc;
    private final zzgsj zzd;

    public /* synthetic */ zzgsm(int i2, int i3, zzgsk zzgskVar, zzgsj zzgsjVar, zzgsl zzgslVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzgskVar;
        this.zzd = zzgsjVar;
    }

    public static zzgsi zze() {
        return new zzgsi(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsm)) {
            return false;
        }
        zzgsm zzgsmVar = (zzgsm) obj;
        return zzgsmVar.zza == this.zza && zzgsmVar.zzd() == zzd() && zzgsmVar.zzc == this.zzc && zzgsmVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgsm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        t2.append(this.zzb);
        t2.append("-byte tags, and ");
        return androidx.compose.foundation.text.input.a.n(t2, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
        return this.zzc != zzgsk.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgsk zzgskVar = this.zzc;
        if (zzgskVar == zzgsk.zzd) {
            return this.zzb;
        }
        if (zzgskVar == zzgsk.zza || zzgskVar == zzgsk.zzb || zzgskVar == zzgsk.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgsj zzf() {
        return this.zzd;
    }

    public final zzgsk zzg() {
        return this.zzc;
    }
}
