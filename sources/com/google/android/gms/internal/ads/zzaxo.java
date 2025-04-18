package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxo extends zzaxt {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxo(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "Gni4qgp+h6AcoKfZop5I8lc+tIkw2ZH05xPrrmCfcSRn195BLh5fanbj8t/tK60H", "w5p59RLEy51WEx7/xjLAr1+9bhgJEvrJ/0voomQz2z8=", zzasfVar, i10, 33);
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
            this.zzd.zzV(zzh.longValue());
        }
    }
}
