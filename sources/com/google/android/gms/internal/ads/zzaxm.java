package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxm extends zzayc {
    private final zzawg zzh;

    public zzaxm(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, zzawg zzawgVar) {
        super(zzawoVar, "qmKK3b5gFczPFV6EXQK4o/dThX0H+NXEfphwaNTcj5pJFkabLh1X9vORrSfnOkeV", "GajzmnIGCWKypTldGXdzGSwHW6ZZV69Bh6cWfmyAJmA=", zzasmVar, i2, 94);
        this.zzh = zzawgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzae(zzasy.zza(intValue));
        }
    }
}
