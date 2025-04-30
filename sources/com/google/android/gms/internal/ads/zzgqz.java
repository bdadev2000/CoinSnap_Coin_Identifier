package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgqz extends RuntimeException {
    public zzgqz(String str) {
        super(str);
    }

    public static Object zza(zzgqy zzgqyVar) {
        try {
            return zzgqyVar.zza();
        } catch (Exception e4) {
            throw new zzgqz(e4);
        }
    }

    public zzgqz(String str, Throwable th) {
        super(str, th);
    }

    public zzgqz(Throwable th) {
        super(th);
    }
}
