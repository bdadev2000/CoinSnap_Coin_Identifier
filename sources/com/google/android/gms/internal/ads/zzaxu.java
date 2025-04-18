package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxu extends zzayc {
    private final StackTraceElement[] zzh;

    public zzaxu(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzawoVar, "qb9dl/IB08b/6izFoDp5ONFGusaE64enfOjVCLWlhNF7+NrRoaDnYUmwC44nswXK", "+1rx5i0z5L53m4fOjp1rgOA40SLCpA1mGw0uq9igoow=", zzasmVar, i2, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzawf zzawfVar = new zzawf((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                try {
                    this.zzd.zzF(zzawfVar.zza.longValue());
                    if (zzawfVar.zzb.booleanValue()) {
                        this.zzd.zzac(true != zzawfVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        this.zzd.zzac(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
