package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgkf extends zzggt {
    private final zzgke zza;

    private zzgkf(zzgke zzgkeVar, int i10) {
        this.zza = zzgkeVar;
    }

    public static zzgkf zzb(zzgke zzgkeVar, int i10) throws GeneralSecurityException {
        return new zzgkf(zzgkeVar, 8);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgkf) && ((zzgkf) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgkf.class, this.zza, 8);
    }

    public final String toString() {
        return e.f("X-AES-GCM Parameters (variant: ", this.zza.toString(), "salt_size_bytes: 8)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgke.zza;
    }
}
