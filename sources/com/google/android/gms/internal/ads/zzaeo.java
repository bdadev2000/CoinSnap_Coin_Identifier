package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaeo implements zzadb {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzade zzn;
    private zzaeh zzo;
    private zzaea zzp;
    private boolean zzq;

    static {
        int i2 = zzeu.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaeo() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x0089, TryCatch #0 {EOFException -> 0x0089, blocks: (B:13:0x000b, B:15:0x001c, B:23:0x003a, B:25:0x0045, B:31:0x0040, B:41:0x005f, B:42:0x0077, B:43:0x0078, B:44:0x0088), top: B:12:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040 A[Catch: EOFException -> 0x0089, TryCatch #0 {EOFException -> 0x0089, blocks: (B:13:0x000b, B:15:0x001c, B:23:0x003a, B:25:0x0045, B:31:0x0040, B:41:0x005f, B:42:0x0077, B:43:0x0078, B:44:0x0088), top: B:12:0x000b }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(com.google.android.gms.internal.ads.zzadc r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r13.zzi
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L8a
            r14.zzj()     // Catch: java.io.EOFException -> L89
            byte[] r2 = r13.zze     // Catch: java.io.EOFException -> L89
            r14.zzh(r2, r5, r4)     // Catch: java.io.EOFException -> L89
            byte[] r2 = r13.zze     // Catch: java.io.EOFException -> L89
            r2 = r2[r5]     // Catch: java.io.EOFException -> L89
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto L78
            int r1 = r2 >> 3
            boolean r2 = r13.zzf     // Catch: java.io.EOFException -> L89
            r1 = r1 & 15
            if (r2 == 0) goto L2d
            r6 = 10
            if (r1 < r6) goto L38
            r6 = 13
            if (r1 <= r6) goto L2d
            goto L38
        L2d:
            if (r2 != 0) goto L58
            r6 = 12
            if (r1 < r6) goto L38
            r6 = 14
            if (r1 > r6) goto L38
            goto L58
        L38:
            if (r2 == 0) goto L40
            int[] r0 = com.google.android.gms.internal.ads.zzaeo.zzb     // Catch: java.io.EOFException -> L89
            r0 = r0[r1]     // Catch: java.io.EOFException -> L89
        L3e:
            r2 = r0
            goto L45
        L40:
            int[] r0 = com.google.android.gms.internal.ads.zzaeo.zza     // Catch: java.io.EOFException -> L89
            r0 = r0[r1]     // Catch: java.io.EOFException -> L89
            goto L3e
        L45:
            r13.zzh = r2     // Catch: java.io.EOFException -> L89
            r13.zzi = r2
            int r0 = r13.zzk
            if (r0 != r3) goto L50
            r13.zzk = r2
            r0 = r2
        L50:
            if (r0 != r2) goto L8a
            int r0 = r13.zzl
            int r0 = r0 + r4
            r13.zzl = r0
            goto L8a
        L58:
            java.lang.String r14 = "WB"
            java.lang.String r5 = "NB"
            if (r4 == r2) goto L5f
            r14 = r5
        L5f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L89
            r2.<init>(r0)     // Catch: java.io.EOFException -> L89
            r2.append(r14)     // Catch: java.io.EOFException -> L89
            java.lang.String r14 = " frame type "
            r2.append(r14)     // Catch: java.io.EOFException -> L89
            r2.append(r1)     // Catch: java.io.EOFException -> L89
            java.lang.String r14 = r2.toString()     // Catch: java.io.EOFException -> L89
            com.google.android.gms.internal.ads.zzbo r14 = com.google.android.gms.internal.ads.zzbo.zza(r14, r7)     // Catch: java.io.EOFException -> L89
            throw r14     // Catch: java.io.EOFException -> L89
        L78:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L89
            r14.<init>(r1)     // Catch: java.io.EOFException -> L89
            r14.append(r2)     // Catch: java.io.EOFException -> L89
            java.lang.String r14 = r14.toString()     // Catch: java.io.EOFException -> L89
            com.google.android.gms.internal.ads.zzbo r14 = com.google.android.gms.internal.ads.zzbo.zza(r14, r7)     // Catch: java.io.EOFException -> L89
            throw r14     // Catch: java.io.EOFException -> L89
        L89:
            return r3
        L8a:
            com.google.android.gms.internal.ads.zzaeh r0 = r13.zzo
            int r14 = r0.zzf(r14, r2, r4)
            if (r14 != r3) goto L93
            return r3
        L93:
            int r0 = r13.zzi
            int r0 = r0 - r14
            r13.zzi = r0
            if (r0 <= 0) goto L9b
            return r5
        L9b:
            com.google.android.gms.internal.ads.zzaeh r6 = r13.zzo
            long r7 = r13.zzg
            r9 = 1
            int r10 = r13.zzh
            r11 = 0
            r12 = 0
            r6.zzs(r7, r9, r10, r11, r12)
            long r0 = r13.zzg
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r2
            r13.zzg = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeo.zza(com.google.android.gms.internal.ads.zzadc):int");
    }

    private static boolean zzg(zzadc zzadcVar, byte[] bArr) throws IOException {
        zzadcVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzadcVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzadc zzadcVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzadcVar, bArr)) {
            this.zzf = false;
            zzadcVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzadcVar, bArr2)) {
            return false;
        }
        this.zzf = true;
        zzadcVar.zzk(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        zzdi.zzb(this.zzo);
        int i2 = zzeu.zza;
        if (zzadcVar.zzf() == 0 && !zzh(zzadcVar)) {
            throw zzbo.zza("Could not find AMR header.", null);
        }
        if (!this.zzq) {
            this.zzq = true;
            boolean z2 = this.zzf;
            String str = true != z2 ? "audio/3gpp" : "audio/amr-wb";
            int i3 = true != z2 ? 8000 : 16000;
            int i4 = z2 ? zzb[8] : zza[7];
            zzaeh zzaehVar = this.zzo;
            zzad zzadVar = new zzad();
            zzadVar.zzZ(str);
            zzadVar.zzQ(i4);
            zzadVar.zzz(1);
            zzadVar.zzaa(i3);
            zzaehVar.zzl(zzadVar.zzaf());
        }
        int zza2 = zza(zzadcVar);
        if (this.zzj) {
            return zza2;
        }
        zzadz zzadzVar = new zzadz(-9223372036854775807L, 0L);
        this.zzp = zzadzVar;
        this.zzn.zzO(zzadzVar);
        this.zzj = true;
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return zzgax.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        this.zzn = zzadeVar;
        this.zzo = zzadeVar.zzw(0, 1);
        zzadeVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzg = 0L;
        this.zzh = 0;
        this.zzi = 0;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        return zzh(zzadcVar);
    }

    public zzaeo(int i2) {
        this.zze = new byte[1];
        this.zzk = -1;
    }
}
