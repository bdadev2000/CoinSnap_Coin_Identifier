package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzaxb extends zzayc {
    private static final zzayd zzh = new zzayd();
    private final Context zzi;

    public zzaxb(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, Context context) {
        super(zzawoVar, "5UR6HKB81c0cBAmhqUCkwnSn0PivsbvOC36lSRnvbJazdJtsmM3DNCGH8hJ11MS9", "UrsneQ7OIRNo8EjOO9YdieQqewqlcsXgRCgjv7EyHmQ=", zzasmVar, i2, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzn("E");
        AtomicReference zza = zzh.zza(this.zzi.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zze.invoke(null, this.zzi));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zzd) {
            this.zzd.zzn(zzatx.zza(str.getBytes(), true));
        }
    }
}
