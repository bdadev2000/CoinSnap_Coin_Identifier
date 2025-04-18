package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxf extends zzayc {
    private final long zzh;

    public zzaxf(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, long j2, int i2, int i3) {
        super(zzawoVar, "MyezUX/G4B4IwyhTDkP3w1lDN+jx4NQ6UyU5K5beVZyubOhn8Q7qD9UAXT+3eaCC", "vDxCHtRyDtZtywG/lqG2i2wEAK0QRlsYMxcEu2Y9QxY=", zzasmVar, i2, 25);
        this.zzh = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        synchronized (this.zzd) {
            try {
                this.zzd.zzt(longValue);
                long j2 = this.zzh;
                if (j2 != 0) {
                    this.zzd.zzT(longValue - j2);
                    this.zzd.zzU(this.zzh);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
