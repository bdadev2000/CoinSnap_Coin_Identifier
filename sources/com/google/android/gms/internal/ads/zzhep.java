package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhep extends RuntimeException {
    public zzhep(zzhde zzhdeVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhcd zza() {
        return new zzhcd(getMessage());
    }
}
