package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzua implements zzvo {
    private final zzadg zza;

    @Nullable
    private zzadb zzb;

    @Nullable
    private zzadc zzc;

    public zzua(zzadg zzadgVar) {
        this.zza = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zza(zzadx zzadxVar) throws IOException {
        zzadb zzadbVar = this.zzb;
        zzadbVar.getClass();
        zzadc zzadcVar = this.zzc;
        zzadcVar.getClass();
        return zzadbVar.zzb(zzadcVar, zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final long zzb() {
        zzadc zzadcVar = this.zzc;
        if (zzadcVar != null) {
            return zzadcVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzc() {
        zzadb zzadbVar = this.zzb;
        if (zzadbVar != null && (zzadbVar instanceof zzaig)) {
            ((zzaig) zzadbVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r6.zzf() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r6.zzf() != r11) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.zzvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzp r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzade r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzacq r6 = new com.google.android.gms.internal.ads.zzacq
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzadb r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzadg r8 = r7.zza
            com.google.android.gms.internal.ads.zzadb[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzgau r13 = com.google.android.gms.internal.ads.zzgax.zzi(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L24
            r8 = r8[r14]
            r7.zzb = r8
            goto L7f
        L24:
            r1 = r14
        L25:
            if (r1 >= r10) goto L7b
            r2 = r8[r1]
            boolean r3 = r2.zzi(r6)     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6b
            if (r3 == 0) goto L3a
            r7.zzb = r2     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6b
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r6.zzj()
            goto L7b
        L38:
            r8 = move-exception
            goto L57
        L3a:
            java.util.List r2 = r2.zzd()     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6b
            r13.zzh(r2)     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6b
            com.google.android.gms.internal.ads.zzadb r2 = r7.zzb
            if (r2 != 0) goto L4d
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L4f
        L4d:
            r2 = r0
            goto L50
        L4f:
            r2 = r14
        L50:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            r6.zzj()
            goto L78
        L57:
            com.google.android.gms.internal.ads.zzadb r9 = r7.zzb
            if (r9 != 0) goto L63
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L64
        L63:
            r14 = r0
        L64:
            com.google.android.gms.internal.ads.zzdi.zzf(r14)
            r6.zzj()
            throw r8
        L6b:
            com.google.android.gms.internal.ads.zzadb r2 = r7.zzb
            if (r2 != 0) goto L4d
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L4f
            goto L4d
        L78:
            int r1 = r1 + 1
            goto L25
        L7b:
            com.google.android.gms.internal.ads.zzadb r10 = r7.zzb
            if (r10 == 0) goto L85
        L7f:
            com.google.android.gms.internal.ads.zzadb r8 = r7.zzb
            r8.zze(r15)
            return
        L85:
            com.google.android.gms.internal.ads.zzwz r10 = new com.google.android.gms.internal.ads.zzwz
            com.google.android.gms.internal.ads.zzgax r8 = com.google.android.gms.internal.ads.zzgax.zzm(r8)
            com.google.android.gms.internal.ads.zztz r11 = new com.google.android.gms.internal.ads.zztz
            r11.<init>()
            java.util.List r8 = com.google.android.gms.internal.ads.zzgbn.zzb(r8, r11)
            java.util.Iterator r8 = r8.iterator()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = ", "
            com.google.android.gms.internal.ads.zzfxr.zzc(r11, r8, r12)
            java.lang.String r8 = r11.toString()
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = androidx.compose.foundation.text.input.a.A(r11, r8, r12)
            com.google.android.gms.internal.ads.zzgax r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzua.zzd(com.google.android.gms.internal.ads.zzp, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzade):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzf(long j2, long j3) {
        zzadb zzadbVar = this.zzb;
        zzadbVar.getClass();
        zzadbVar.zzf(j2, j3);
    }
}
