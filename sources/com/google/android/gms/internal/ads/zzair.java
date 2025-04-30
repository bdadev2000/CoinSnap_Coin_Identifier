package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
final class zzair implements zzait {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaja zzc = new zzaja();
    private zzais zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadv zzadvVar, int i9) throws IOException {
        ((zzadi) zzadvVar).zzn(this.zza, 0, i9, false);
        long j7 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j7 = (j7 << 8) | (this.zza[i10] & 255);
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zza(zzais zzaisVar) {
        this.zzd = zzaisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0095, code lost:
    
        if (r0 == 1) goto L34;
     */
    @Override // com.google.android.gms.internal.ads.zzait
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadv r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzair.zzc(com.google.android.gms.internal.ads.zzadv):boolean");
    }
}
