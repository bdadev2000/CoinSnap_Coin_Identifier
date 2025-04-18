package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zztt implements zzvh {
    private final zzacw zza;

    @Nullable
    private zzacr zzb;

    @Nullable
    private zzacs zzc;

    public zztt(zzacw zzacwVar) {
        this.zza = zzacwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final int zza(zzadn zzadnVar) throws IOException {
        zzacr zzacrVar = this.zzb;
        zzacrVar.getClass();
        zzacs zzacsVar = this.zzc;
        zzacsVar.getClass();
        return zzacrVar.zzb(zzacsVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        zzacs zzacsVar = this.zzc;
        if (zzacsVar != null) {
            return zzacsVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzc() {
        zzacr zzacrVar = this.zzb;
        if (zzacrVar != null && (zzacrVar instanceof zzahw)) {
            ((zzahw) zzacrVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r6.zzf() != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        if (r6.zzf() != r11) goto L34;
     */
    @Override // com.google.android.gms.internal.ads.zzvh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzn r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzacu r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzacg r6 = new com.google.android.gms.internal.ads.zzacg
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzacr r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzacw r8 = r7.zza
            com.google.android.gms.internal.ads.zzacr[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzfzl r13 = com.google.android.gms.internal.ads.zzfzo.zzi(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L24
            r8 = r8[r14]
            r7.zzb = r8
            goto L7e
        L24:
            r1 = r14
        L25:
            if (r1 >= r10) goto L7a
            r2 = r8[r1]
            boolean r3 = r2.zzi(r6)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r3 == 0) goto L38
            r7.zzb = r2     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzdb.zzf(r0)
            r6.zzj()
            goto L7a
        L38:
            java.util.List r2 = r2.zzd()     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            r13.zzh(r2)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzacr r2 = r7.zzb
            if (r2 != 0) goto L70
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L6e
            goto L70
        L4c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzacr r9 = r7.zzb
            if (r9 != 0) goto L59
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L5a
        L59:
            r14 = r0
        L5a:
            com.google.android.gms.internal.ads.zzdb.zzf(r14)
            r6.zzj()
            throw r8
        L61:
            com.google.android.gms.internal.ads.zzacr r2 = r7.zzb
            if (r2 != 0) goto L70
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L6e
            goto L70
        L6e:
            r2 = r14
            goto L71
        L70:
            r2 = r0
        L71:
            com.google.android.gms.internal.ads.zzdb.zzf(r2)
            r6.zzj()
            int r1 = r1 + 1
            goto L25
        L7a:
            com.google.android.gms.internal.ads.zzacr r10 = r7.zzb
            if (r10 == 0) goto L84
        L7e:
            com.google.android.gms.internal.ads.zzacr r8 = r7.zzb
            r8.zze(r15)
            return
        L84:
            com.google.android.gms.internal.ads.zzws r10 = new com.google.android.gms.internal.ads.zzws
            com.google.android.gms.internal.ads.zzfzo r8 = com.google.android.gms.internal.ads.zzfzo.zzm(r8)
            com.google.android.gms.internal.ads.zzts r11 = new com.google.android.gms.internal.ads.zzts
            r11.<init>()
            java.util.List r8 = com.google.android.gms.internal.ads.zzgae.zzb(r8, r11)
            java.util.Iterator r8 = r8.iterator()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = ", "
            com.google.android.gms.internal.ads.zzfwi.zzc(r11, r8, r12)
            java.lang.String r8 = r11.toString()
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = com.applovin.impl.mediation.ads.e.f(r11, r8, r12)
            com.google.android.gms.internal.ads.zzfzo r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztt.zzd(com.google.android.gms.internal.ads.zzn, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzacu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final void zzf(long j3, long j10) {
        zzacr zzacrVar = this.zzb;
        zzacrVar.getClass();
        zzacrVar.zzf(j3, j10);
    }
}
