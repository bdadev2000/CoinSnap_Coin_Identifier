package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhbm extends RuntimeException {
    public zzhbm(zzhai zzhaiVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgzm zza() {
        return new zzgzm(getMessage());
    }
}
