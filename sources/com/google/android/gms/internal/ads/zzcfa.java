package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzcfa {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzasu zzasuVar;
        zzast zzastVar;
        long j7 = this.zza;
        if (j7 > 0) {
            return j7;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzasp(new zzcez(duplicate), zzcfc.zzb).zze().iterator();
            while (true) {
                zzasuVar = null;
                if (it.hasNext()) {
                    zzasr zzasrVar = (zzasr) it.next();
                    if (zzasrVar instanceof zzast) {
                        zzastVar = (zzast) zzasrVar;
                        break;
                    }
                } else {
                    zzastVar = null;
                    break;
                }
            }
            Iterator it2 = zzastVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzasr zzasrVar2 = (zzasr) it2.next();
                if (zzasrVar2 instanceof zzasu) {
                    zzasuVar = (zzasu) zzasrVar2;
                    break;
                }
            }
            long zzd = (zzasuVar.zzd() * 1000) / zzasuVar.zze();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
