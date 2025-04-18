package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzawz extends zzayc {
    public zzawz(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3) {
        super(zzawoVar, "HKR8yJb1bSJu8LVlqpKC/lk4sWm3Ji10GkyhxRQoJd2Yb8vz2/7ATJhGRkBQpjA8", "3Dv+WIEpWKEbBzcuP3SgLUV0aXQTnDSdpPKu/RzIzoY=", zzasmVar, i2, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zze.invoke(null, new Object[0]);
        synchronized (this.zzd) {
            this.zzd.zzg(str);
        }
    }
}
