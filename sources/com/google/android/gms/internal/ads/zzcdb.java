package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzcdb {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzarf zzarfVar;
        zzare zzareVar;
        long j3 = this.zza;
        if (j3 > 0) {
            return j3;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzara(new zzcda(duplicate), zzcde.zzb).zzd().iterator();
            while (true) {
                zzarfVar = null;
                if (it.hasNext()) {
                    zzarc zzarcVar = (zzarc) it.next();
                    if (zzarcVar instanceof zzare) {
                        zzareVar = (zzare) zzarcVar;
                        break;
                    }
                } else {
                    zzareVar = null;
                    break;
                }
            }
            Iterator it2 = zzareVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzarc zzarcVar2 = (zzarc) it2.next();
                if (zzarcVar2 instanceof zzarf) {
                    zzarfVar = (zzarf) zzarcVar2;
                    break;
                }
            }
            long zzc = (zzarfVar.zzc() * 1000) / zzarfVar.zzd();
            this.zza = zzc;
            return zzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
