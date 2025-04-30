package com.google.android.gms.internal.ads;

import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class zzgnl {
    public static final /* synthetic */ int zza = 0;
    private static final ThreadLocal zzb = new zzgnk();

    public static Cipher zza() {
        return (Cipher) zzb.get();
    }
}
