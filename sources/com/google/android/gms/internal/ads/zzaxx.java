package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxx extends zzayc {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxx(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3) {
        super(zzawoVar, "FIygBXZrpziR+Pp2xmzyZ9k6GUcrj9kWbY5XuUd40ERy2hxHTKqhUwfuGSusXUTd", "t4LignzpQnyAJJAZeU8P3GGD0dgmuTMT4n9grwU+EMc=", zzasmVar, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzV(zzh.longValue());
        }
    }
}
