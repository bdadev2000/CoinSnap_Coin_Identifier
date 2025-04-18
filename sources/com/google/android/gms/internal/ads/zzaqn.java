package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaqn {
    public static final boolean zza = zzaqo.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzaqo.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j2) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzaqm(str, j2, SystemClock.elapsedRealtime()));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    public final synchronized void zzb(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r9.zzc = r0     // Catch: java.lang.Throwable -> L7d
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            r4 = 0
            if (r1 != 0) goto L11
            r7 = r2
            goto L2c
        L11:
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.zzaqm r1 = (com.google.android.gms.internal.ads.zzaqm) r1     // Catch: java.lang.Throwable -> L7d
            long r5 = r1.zzc     // Catch: java.lang.Throwable -> L7d
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7d
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L7d
            int r7 = r7 + (-1)
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.zzaqm r1 = (com.google.android.gms.internal.ads.zzaqm) r1     // Catch: java.lang.Throwable -> L7d
            long r7 = r1.zzc     // Catch: java.lang.Throwable -> L7d
            long r7 = r7 - r5
        L2c:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L31
            goto L7f
        L31:
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.zzaqm r1 = (com.google.android.gms.internal.ads.zzaqm) r1     // Catch: java.lang.Throwable -> L7d
            long r1 = r1.zzc     // Catch: java.lang.Throwable -> L7d
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L7d
            r5[r4] = r6     // Catch: java.lang.Throwable -> L7d
            r5[r0] = r10     // Catch: java.lang.Throwable -> L7d
            java.lang.String r10 = "(%-4d ms) %s"
            com.google.android.gms.internal.ads.zzaqo.zza(r10, r5)     // Catch: java.lang.Throwable -> L7d
            java.util.List r10 = r9.zzb     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L7d
        L51:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.internal.ads.zzaqm r5 = (com.google.android.gms.internal.ads.zzaqm) r5     // Catch: java.lang.Throwable -> L7d
            long r6 = r5.zzc     // Catch: java.lang.Throwable -> L7d
            long r1 = r6 - r1
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7d
            r8[r4] = r1     // Catch: java.lang.Throwable -> L7d
            long r1 = r5.zzb     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7d
            r8[r0] = r1     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r5.zza     // Catch: java.lang.Throwable -> L7d
            r8[r3] = r1     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = "(+%-4d) [%2d] %s"
            com.google.android.gms.internal.ads.zzaqo.zza(r1, r8)     // Catch: java.lang.Throwable -> L7d
            r1 = r6
            goto L51
        L7d:
            r10 = move-exception
            goto L81
        L7f:
            monitor-exit(r9)
            return
        L81:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqn.zzb(java.lang.String):void");
    }
}
