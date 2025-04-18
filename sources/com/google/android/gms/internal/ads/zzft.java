package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class zzft {
    private final zzfr zza;
    private final AtomicLong zzb = new AtomicLong();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;

    public zzft(zzfr zzfrVar) {
        this.zza = zzfrVar;
    }

    private final void zze(int i10) {
        long j3;
        zzed zzedVar;
        while (this.zzd.size() > i10) {
            zzfs zzfsVar = (zzfs) this.zzd.poll();
            int i11 = zzen.zza;
            zzfr zzfrVar = this.zza;
            j3 = zzfsVar.zzb;
            zzedVar = zzfsVar.zza;
            zzfrVar.zza(j3, zzedVar);
            this.zzc.push(zzfsVar);
        }
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r9 < r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(long r9, com.google.android.gms.internal.ads.zzed r11) {
        /*
            r8 = this;
            int r0 = r8.zze
            if (r0 == 0) goto L53
            r1 = -1
            if (r0 == r1) goto L24
            java.util.PriorityQueue r0 = r8.zzd
            int r0 = r0.size()
            int r2 = r8.zze
            if (r0 < r2) goto L24
            java.util.PriorityQueue r0 = r8.zzd
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzfs r0 = (com.google.android.gms.internal.ads.zzfs) r0
            int r2 = com.google.android.gms.internal.ads.zzen.zza
            long r2 = com.google.android.gms.internal.ads.zzfs.zza(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L24
            goto L53
        L24:
            java.util.ArrayDeque r0 = r8.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            r0.<init>()
            goto L3a
        L32:
            java.util.ArrayDeque r0 = r8.zzc
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.zzfs r0 = (com.google.android.gms.internal.ads.zzfs) r0
        L3a:
            java.util.concurrent.atomic.AtomicLong r2 = r8.zzb
            long r5 = r2.getAndIncrement()
            r2 = r0
            r3 = r9
            r7 = r11
            r2.zzc(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.zzd
            r9.add(r0)
            int r9 = r8.zze
            if (r9 == r1) goto L52
            r8.zze(r9)
        L52:
            return
        L53:
            com.google.android.gms.internal.ads.zzfr r0 = r8.zza
            r0.zza(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzft.zzb(long, com.google.android.gms.internal.ads.zzed):void");
    }

    public final void zzc() {
        zze(0);
    }

    public final void zzd(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        this.zze = i10;
        zze(i10);
    }
}
