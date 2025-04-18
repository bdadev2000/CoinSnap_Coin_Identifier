package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxk extends zzaxt {
    private final boolean zzh;

    public zzaxk(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "XUlbwsRmHSawbobvdBjnb2xctdVbPfXMEVEnXNMe2hHlLaCP55dgLdHMQ+hYM/7L", "7XeVq1bS2Nfqusn9ZkJuz3JHMvM2X4C8Onql6XjPnDI=", zzasfVar, i10, 61);
        this.zzh = zzawfVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        synchronized (this.zzd) {
            this.zzd.zzE(longValue);
        }
    }
}
