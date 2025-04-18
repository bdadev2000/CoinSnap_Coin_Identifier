package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgpi extends RuntimeException {
    public zzgpi(String str) {
        super(str);
    }

    public static Object zza(zzgph zzgphVar) {
        try {
            return zzgphVar.zza();
        } catch (Exception e2) {
            throw new zzgpi(e2);
        }
    }

    public zzgpi(String str, Throwable th2) {
        super(str, th2);
    }

    public zzgpi(Throwable th2) {
        super(th2);
    }
}
