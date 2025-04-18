package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzcdf {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzars zzarsVar;
        zzarr zzarrVar;
        long j2 = this.zza;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzarn(new zzcde(duplicate), zzcdi.zzb).zzd().iterator();
            while (true) {
                zzarsVar = null;
                if (!it.hasNext()) {
                    zzarrVar = null;
                    break;
                }
                zzarp zzarpVar = (zzarp) it.next();
                if (zzarpVar instanceof zzarr) {
                    zzarrVar = (zzarr) zzarpVar;
                    break;
                }
            }
            Iterator it2 = zzarrVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzarp zzarpVar2 = (zzarp) it2.next();
                if (zzarpVar2 instanceof zzars) {
                    zzarsVar = (zzars) zzarpVar2;
                    break;
                }
            }
            long zzc = (zzarsVar.zzc() * 1000) / zzarsVar.zzd();
            this.zza = zzc;
            return zzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
