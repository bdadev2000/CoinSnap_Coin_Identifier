package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhdx extends RuntimeException {
    public zzhdx(zzhcp zzhcpVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhbt zza() {
        return new zzhbt(getMessage());
    }
}
