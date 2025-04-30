package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazj extends zzazs {
    private final boolean zzi;

    public zzazj(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "vvYcBqgI4aoC3GZZ7n1bdLp71k52s6EJLh0/nA6ME39LmvOZf3TBZ+H4xg1YfQXg", "6jGSPrUM0+2YrTO2vsTOKq3+XL/IfUFs5oxZaSEvsQg=", zzatpVar, i9, 61);
        this.zzi = zzayeVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzK(longValue);
        }
    }
}
