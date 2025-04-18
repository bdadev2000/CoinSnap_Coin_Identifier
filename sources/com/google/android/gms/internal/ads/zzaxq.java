package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxq extends zzayc {
    public zzaxq(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3) {
        super(zzawoVar, "pkxrOWj7zD1ScyeXlo8fp1m52MhBIE9QvURtfE4hxB81XVp6EbBK8CYQjvvhYlf1", "OfZFeGMpPN4nP2QoVlOsW4kmNx194lMXDh8YPc+yAeg=", zzasmVar, i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavu zzavuVar = new zzavu((String) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcL)).booleanValue())));
        synchronized (this.zzd) {
            this.zzd.zzj(zzavuVar.zza);
            this.zzd.zzC(zzavuVar.zzb);
        }
    }
}
