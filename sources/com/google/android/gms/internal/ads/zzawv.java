package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzawv extends zzaxt {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawv(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "vHxl3/k7agNEaOAb+kiexrLMKd/tl26b7leOgQmEqvHEdvK4RjfXtH7j4TmF8OsM", "1y55K+UUiCchaHGitlZ/bNKURNzH22lnMjmt1W+XJdc=", zzasfVar, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (Long) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzo(zzh.longValue());
        }
    }
}
