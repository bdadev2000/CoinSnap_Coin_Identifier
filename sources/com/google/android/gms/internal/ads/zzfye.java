package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfye extends zzfxx {
    private final Object zza;

    public zzfye(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfye) {
            return this.zza.equals(((zzfye) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.A("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final zzfxx zza(zzfxq zzfxqVar) {
        Object apply = zzfxqVar.apply(this.zza);
        zzfxz.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfye(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
