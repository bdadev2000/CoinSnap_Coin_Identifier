package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes4.dex */
public final class zzdo implements zzdn {
    private final Object zza;

    private zzdo(Object obj) {
        this.zza = obj;
    }

    public static zzdn zzb(Object obj) {
        if (obj != null) {
            return new zzdo(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zza;
    }
}
