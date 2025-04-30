package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzayv extends zzazs {
    private final long zzi;

    public zzayv(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, long j7, int i9, int i10) {
        super(zzayeVar, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", zzatpVar, i9, 25);
        this.zzi = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, null)).longValue();
        synchronized (this.zze) {
            try {
                this.zze.zzv(longValue);
                long j7 = this.zzi;
                if (j7 != 0) {
                    this.zze.zzZ(longValue - j7);
                    this.zze.zzab(this.zzi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
