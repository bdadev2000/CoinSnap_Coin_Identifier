package com.google.android.gms.internal.ads;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfyl extends zzfyb {
    private final Object zza;

    public zzfyl(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyl) {
            return this.zza.equals(((zzfyl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return AbstractC2914a.e("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final zzfyb zza(zzfxu zzfxuVar) {
        Object apply = zzfxuVar.apply(this.zza);
        zzfyg.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfyl(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
