package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgrf extends RuntimeException {
    public zzgrf(String str) {
        super(str);
    }

    public static Object zza(zzgre zzgreVar) {
        try {
            return zzgreVar.zza();
        } catch (Exception e) {
            throw new zzgrf(e);
        }
    }

    public zzgrf(String str, Throwable th) {
        super(str, th);
    }

    public zzgrf(Throwable th) {
        super(th);
    }
}
