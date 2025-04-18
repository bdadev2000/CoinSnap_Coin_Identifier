package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaww extends zzaxt {
    private final long zzh;

    public zzaww(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, long j3, int i10, int i11) {
        super(zzawfVar, "TJ62ujRRBjJb9/NqrT2Pn0c6KFZY0SF6EjGcQMXtIVccZGktu9G9qu0AxWBd9HPE", "SO84xWj1xZpVST0NHeOw+QMypPAPo6e/MVLMJbQH2M4=", zzasfVar, i10, 25);
        this.zzh = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        synchronized (this.zzd) {
            this.zzd.zzt(longValue);
            long j3 = this.zzh;
            if (j3 != 0) {
                this.zzd.zzT(longValue - j3);
                this.zzd.zzU(this.zzh);
            }
        }
    }
}
