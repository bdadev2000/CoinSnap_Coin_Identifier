package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxw extends zzayc {
    private final zzawv zzh;
    private long zzi;

    public zzaxw(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, zzawv zzawvVar) {
        super(zzawoVar, "fITy8eyNabiNCHuPyNX0x482LGXuzWIuGD/71SlN2nKRI9kSJNQ0LUuMwsl06lrx", "tMANUUGyytjQo/XDHg2IEhabePFT+VIo7wkY/Wjo6Gc=", zzasmVar, i2, 53);
        this.zzh = zzawvVar;
        if (zzawvVar != null) {
            this.zzi = zzawvVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzP(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
