package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxr extends zzayc {
    public zzaxr(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3) {
        super(zzawoVar, "JZBFNEdYFhTFBTCRgtU3dDnkdlKXmKLHUW9VyRRgLZX35JOvzKEIQuHunyCpcG/w", "nv6PiabX0G4RLHtriKodA9C0rOBToujvB9ySFMp3wxE=", zzasmVar, i2, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i2 = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasm zzasmVar = this.zzd;
            if (true == booleanValue) {
                i2 = 2;
            }
            zzasmVar.zzaf(i2);
        } catch (InvocationTargetException unused) {
            this.zzd.zzaf(3);
        }
    }
}
