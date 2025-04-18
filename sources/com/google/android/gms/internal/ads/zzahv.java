package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class zzahv {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaic zzc = new zzaic();
    private zzahw zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadc zzadcVar, int i2) throws IOException {
        zzadcVar.zzi(this.zza, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.zza[i3] & UnsignedBytes.MAX_VALUE);
        }
        return j2;
    }

    public final void zza(zzahw zzahwVar) {
        this.zzd = zzahwVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0092, code lost:
    
        if (r0 == 1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadc r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahv.zzc(com.google.android.gms.internal.ads.zzadc):boolean");
    }
}
