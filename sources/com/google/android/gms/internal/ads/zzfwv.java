package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;

/* loaded from: classes3.dex */
final class zzfwv extends zzfwo {
    private final Object zza;

    public zzfwv(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfwv) {
            return this.zza.equals(((zzfwv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return e.f("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zza(zzfwh zzfwhVar) {
        Object apply = zzfwhVar.apply(this.zza);
        zzfwq.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfwv(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
