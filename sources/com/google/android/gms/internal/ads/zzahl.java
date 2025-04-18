package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzahl {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahs zzc = new zzahs();
    private zzahm zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzacs zzacsVar, int i10) throws IOException {
        zzacsVar.zzi(this.zza, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (this.zza[i11] & UByte.MAX_VALUE);
        }
        return j3;
    }

    public final void zza(zzahm zzahmVar) {
        this.zzd = zzahmVar;
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
    public final boolean zzc(com.google.android.gms.internal.ads.zzacs r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahl.zzc(com.google.android.gms.internal.ads.zzacs):boolean");
    }
}
