package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxb extends zzaxt {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxb(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "pqNjV8dx1XFj9T4LMPQEa0a19I+nsD8Qxz2fQuehDPd98Kfq+TQkVREvoUEgFPtf", "v02B7neKpYyNwQtluXNrII6UZlY2WS0o0AnaqwUmhpo=", zzasfVar, i10, 22);
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
            this.zzd.zzy(zzh.longValue());
        }
    }
}
