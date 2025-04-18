package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxe extends zzayc {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxe(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3) {
        super(zzawoVar, "CyzY1Dq9Z94V5QdB/DvLAvp7GpoAO1TL85fhRTvPR0h7u5BGepLTIyh10t/XTOrZ", "skGQhdInPY4sBMicxMlDA8FpM67X6t386GsGM5hjG6o=", zzasmVar, i2, 44);
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
            this.zzd.zzo(zzh.longValue());
        }
    }
}
