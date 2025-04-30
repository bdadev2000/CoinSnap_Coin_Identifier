package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzayy extends zzazs {
    private final zzayf zzi;

    public zzayy(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, zzayf zzayfVar) {
        super(zzayeVar, "ZdMwT5n8r4APV4u4GhQlb1VCwOIVHkTm7kF7LnArEpyZnsv+C3G3q6fVFgtTcqcc", "O+vmm8flr2e7ZrTWUx/T8ClWwcEwLlJlfjM8sMGjZbg=", zzatpVar, i9, 85);
        this.zzi = zzayfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke(null, Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf()));
        synchronized (this.zze) {
            this.zze.zzx(jArr[0]);
            this.zze.zzw(jArr[1]);
        }
    }
}
