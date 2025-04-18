package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaee implements zzacr {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzadx zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacu zzn;
    private zzadx zzo;
    private zzadx zzp;
    private zzadq zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i10 = zzen.zza;
        zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
        zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    }

    public zzaee() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x0088, TryCatch #0 {EOFException -> 0x0088, blocks: (B:13:0x000b, B:15:0x001c, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005e, B:41:0x0076, B:42:0x0077, B:43:0x0087), top: B:12:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x0088, TryCatch #0 {EOFException -> 0x0088, blocks: (B:13:0x000b, B:15:0x001c, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005e, B:41:0x0076, B:42:0x0077, B:43:0x0087), top: B:12:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(com.google.android.gms.internal.ads.zzacs r12) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r11.zzj
            r3 = 0
            r4 = -1
            r5 = 1
            if (r2 != 0) goto L89
            r12.zzj()     // Catch: java.io.EOFException -> L88
            byte[] r2 = r11.zze     // Catch: java.io.EOFException -> L88
            r12.zzh(r2, r3, r5)     // Catch: java.io.EOFException -> L88
            byte[] r2 = r11.zze     // Catch: java.io.EOFException -> L88
            r2 = r2[r3]     // Catch: java.io.EOFException -> L88
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto L77
            int r1 = r2 >> 3
            boolean r2 = r11.zzg     // Catch: java.io.EOFException -> L88
            r1 = r1 & 15
            if (r2 == 0) goto L2d
            r6 = 10
            if (r1 < r6) goto L38
            r6 = 13
            if (r1 <= r6) goto L2d
            goto L38
        L2d:
            if (r2 != 0) goto L57
            r6 = 12
            if (r1 < r6) goto L38
            r6 = 14
            if (r1 > r6) goto L38
            goto L57
        L38:
            if (r2 == 0) goto L3f
            int[] r0 = com.google.android.gms.internal.ads.zzaee.zzb     // Catch: java.io.EOFException -> L88
            r0 = r0[r1]     // Catch: java.io.EOFException -> L88
            goto L43
        L3f:
            int[] r0 = com.google.android.gms.internal.ads.zzaee.zza     // Catch: java.io.EOFException -> L88
            r0 = r0[r1]     // Catch: java.io.EOFException -> L88
        L43:
            r2 = r0
            r11.zzi = r2     // Catch: java.io.EOFException -> L88
            r11.zzj = r2
            int r0 = r11.zzk
            if (r0 != r4) goto L4f
            r11.zzk = r2
            r0 = r2
        L4f:
            if (r0 != r2) goto L89
            int r0 = r11.zzl
            int r0 = r0 + r5
            r11.zzl = r0
            goto L89
        L57:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r5 == r2) goto L5e
            r12 = r3
        L5e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L88
            r2.<init>(r0)     // Catch: java.io.EOFException -> L88
            r2.append(r12)     // Catch: java.io.EOFException -> L88
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> L88
            r2.append(r1)     // Catch: java.io.EOFException -> L88
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> L88
            com.google.android.gms.internal.ads.zzbh r12 = com.google.android.gms.internal.ads.zzbh.zza(r12, r7)     // Catch: java.io.EOFException -> L88
            throw r12     // Catch: java.io.EOFException -> L88
        L77:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L88
            r12.<init>(r1)     // Catch: java.io.EOFException -> L88
            r12.append(r2)     // Catch: java.io.EOFException -> L88
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L88
            com.google.android.gms.internal.ads.zzbh r12 = com.google.android.gms.internal.ads.zzbh.zza(r12, r7)     // Catch: java.io.EOFException -> L88
            throw r12     // Catch: java.io.EOFException -> L88
        L88:
            return r4
        L89:
            com.google.android.gms.internal.ads.zzadx r0 = r11.zzp
            int r12 = r0.zzf(r12, r2, r5)
            if (r12 != r4) goto L92
            return r4
        L92:
            int r0 = r11.zzj
            int r0 = r0 - r12
            r11.zzj = r0
            if (r0 <= 0) goto L9a
            return r3
        L9a:
            com.google.android.gms.internal.ads.zzadx r4 = r11.zzp
            long r5 = r11.zzh
            r7 = 1
            int r8 = r11.zzi
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.zzh
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzh = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaee.zza(com.google.android.gms.internal.ads.zzacs):int");
    }

    private static boolean zzg(zzacs zzacsVar, byte[] bArr) throws IOException {
        zzacsVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacsVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzacs zzacsVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzacsVar, bArr)) {
            this.zzg = false;
            zzacsVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzacsVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacsVar.zzk(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        String str;
        int i10;
        int i11;
        zzdb.zzb(this.zzo);
        int i12 = zzen.zza;
        if (zzacsVar.zzf() == 0 && !zzh(zzacsVar)) {
            throw zzbh.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzg;
            if (true != z10) {
                str = MimeTypes.AUDIO_AMR_NB;
            } else {
                str = MimeTypes.AUDIO_AMR_WB;
            }
            if (true != z10) {
                i10 = 8000;
            } else {
                i10 = 16000;
            }
            if (z10) {
                i11 = zzb[8];
            } else {
                i11 = zza[7];
            }
            zzadx zzadxVar = this.zzp;
            zzab zzabVar = new zzab();
            zzabVar.zzZ(str);
            zzabVar.zzQ(i11);
            zzabVar.zzz(1);
            zzabVar.zzaa(i10);
            zzadxVar.zzl(zzabVar.zzaf());
        }
        int zza2 = zza(zzacsVar);
        if (this.zzq == null) {
            zzadp zzadpVar = new zzadp(C.TIME_UNSET, 0L);
            this.zzq = zzadpVar;
            this.zzn.zzO(zzadpVar);
        }
        if (zza2 == -1) {
            return -1;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzn = zzacuVar;
        zzadx zzw = zzacuVar.zzw(0, 1);
        this.zzo = zzw;
        this.zzp = zzw;
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j10;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return zzh(zzacsVar);
    }

    public zzaee(int i10) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacm zzacmVar = new zzacm();
        this.zzf = zzacmVar;
        this.zzp = zzacmVar;
    }
}
