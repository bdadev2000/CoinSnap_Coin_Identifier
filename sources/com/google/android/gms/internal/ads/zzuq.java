package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzuq implements zzwg {
    private final zzaea zza;

    @Nullable
    private zzadu zzb;

    @Nullable
    private zzadv zzc;

    public zzuq(zzaea zzaeaVar) {
        this.zza = zzaeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzaeq zzaeqVar) throws IOException {
        zzadu zzaduVar = this.zzb;
        zzaduVar.getClass();
        zzadv zzadvVar = this.zzc;
        zzadvVar.getClass();
        return zzaduVar.zzb(zzadvVar, zzaeqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final long zzb() {
        zzadv zzadvVar = this.zzc;
        if (zzadvVar != null) {
            return zzadvVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzc() {
        zzadu zzaduVar = this.zzb;
        if (zzaduVar != null && (zzaduVar instanceof zzajg)) {
            ((zzajg) zzaduVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (r6.zzf() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
    
        if (r6.zzf() != r11) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.zzwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzu r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzadx r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzadi r6 = new com.google.android.gms.internal.ads.zzadi
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzadu r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzaea r8 = r7.zza
            com.google.android.gms.internal.ads.zzadu[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzgaz r13 = com.google.android.gms.internal.ads.zzgbc.zzi(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L25
            r8 = r8[r14]
            r7.zzb = r8
            goto Lb7
        L25:
            r1 = r14
        L26:
            if (r1 >= r10) goto L7c
            r2 = r8[r1]
            boolean r3 = r2.zzf(r6)     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L6c
            if (r3 == 0) goto L3b
            r7.zzb = r2     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L6c
            com.google.android.gms.internal.ads.zzeq.zzf(r0)
            r6.zzj()
            goto L7c
        L39:
            r8 = move-exception
            goto L58
        L3b:
            java.util.List r2 = r2.zzc()     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L6c
            r13.zzh(r2)     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L6c
            com.google.android.gms.internal.ads.zzadu r2 = r7.zzb
            if (r2 != 0) goto L4e
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
        L4e:
            r2 = r0
            goto L51
        L50:
            r2 = r14
        L51:
            com.google.android.gms.internal.ads.zzeq.zzf(r2)
            r6.zzj()
            goto L79
        L58:
            com.google.android.gms.internal.ads.zzadu r9 = r7.zzb
            if (r9 != 0) goto L64
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L65
        L64:
            r14 = r0
        L65:
            com.google.android.gms.internal.ads.zzeq.zzf(r14)
            r6.zzj()
            throw r8
        L6c:
            com.google.android.gms.internal.ads.zzadu r2 = r7.zzb
            if (r2 != 0) goto L4e
            long r2 = r6.zzf()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L4e
        L79:
            int r1 = r1 + 1
            goto L26
        L7c:
            com.google.android.gms.internal.ads.zzadu r10 = r7.zzb
            if (r10 != 0) goto Lb7
            com.google.android.gms.internal.ads.zzxs r10 = new com.google.android.gms.internal.ads.zzxs
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L87:
            int r12 = r8.length
            if (r14 >= r12) goto La3
            r15 = r8[r14]
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getSimpleName()
            r11.append(r15)
            int r12 = r12 + (-1)
            if (r14 >= r12) goto La0
            java.lang.String r12 = ", "
            r11.append(r12)
        La0:
            int r14 = r14 + 1
            goto L87
        La3:
            java.lang.String r8 = r11.toString()
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = x0.AbstractC2914a.e(r11, r8, r12)
            com.google.android.gms.internal.ads.zzgbc r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        Lb7:
            com.google.android.gms.internal.ads.zzadu r8 = r7.zzb
            r8.zzd(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuq.zzd(com.google.android.gms.internal.ads.zzu, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzadx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzf(long j7, long j9) {
        zzadu zzaduVar = this.zzb;
        zzaduVar.getClass();
        zzaduVar.zze(j7, j9);
    }
}
