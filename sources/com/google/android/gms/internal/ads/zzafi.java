package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzafi implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzafh
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzafi(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzadx zzp;
    private zzafa zzq;
    private zzaet zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i9 = zzgd.zza;
        Charset charset = zzfxs.zzc;
        zzd = "#!AMR\n".getBytes(charset);
        zze = "#!AMR-WB\n".getBytes(charset);
        zzf = iArr[8];
    }

    public zzafi() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: EOFException -> 0x00b1, TryCatch #0 {EOFException -> 0x00b1, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:25:0x0049, B:31:0x0044, B:41:0x0087, B:42:0x009f, B:43:0x00a0, B:44:0x00b0), top: B:12:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[Catch: EOFException -> 0x00b1, TryCatch #0 {EOFException -> 0x00b1, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:25:0x0049, B:31:0x0044, B:41:0x0087, B:42:0x009f, B:43:0x00a0, B:44:0x00b0), top: B:12:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(com.google.android.gms.internal.ads.zzadv r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r13.zzk
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto Lc
            goto L5b
        Lc:
            r14.zzj()     // Catch: java.io.EOFException -> Lb1
            byte[] r2 = r13.zzg     // Catch: java.io.EOFException -> Lb1
            r6 = r14
            com.google.android.gms.internal.ads.zzadi r6 = (com.google.android.gms.internal.ads.zzadi) r6     // Catch: java.io.EOFException -> Lb1
            r6.zzm(r2, r5, r4, r5)     // Catch: java.io.EOFException -> Lb1
            byte[] r2 = r13.zzg     // Catch: java.io.EOFException -> Lb1
            r2 = r2[r5]     // Catch: java.io.EOFException -> Lb1
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto La0
            int r1 = r2 >> 3
            boolean r2 = r13.zzh     // Catch: java.io.EOFException -> Lb1
            r1 = r1 & 15
            if (r2 == 0) goto L31
            r6 = 10
            if (r1 < r6) goto L3c
            r6 = 13
            if (r1 <= r6) goto L31
            goto L3c
        L31:
            if (r2 != 0) goto L80
            r6 = 12
            if (r1 < r6) goto L3c
            r6 = 14
            if (r1 > r6) goto L3c
            goto L80
        L3c:
            if (r2 == 0) goto L44
            int[] r0 = com.google.android.gms.internal.ads.zzafi.zzc     // Catch: java.io.EOFException -> Lb1
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lb1
        L42:
            r2 = r0
            goto L49
        L44:
            int[] r0 = com.google.android.gms.internal.ads.zzafi.zzb     // Catch: java.io.EOFException -> Lb1
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lb1
            goto L42
        L49:
            r13.zzj = r2     // Catch: java.io.EOFException -> Lb1
            r13.zzk = r2
            int r0 = r13.zzm
            if (r0 != r3) goto L54
            r13.zzm = r2
            r0 = r2
        L54:
            if (r0 != r2) goto L5b
            int r0 = r13.zzn
            int r0 = r0 + r4
            r13.zzn = r0
        L5b:
            com.google.android.gms.internal.ads.zzafa r0 = r13.zzq
            int r14 = com.google.android.gms.internal.ads.zzaey.zza(r0, r14, r2, r4)
            if (r14 != r3) goto L64
            return r3
        L64:
            int r0 = r13.zzk
            int r0 = r0 - r14
            r13.zzk = r0
            if (r0 <= 0) goto L6c
            return r5
        L6c:
            com.google.android.gms.internal.ads.zzafa r6 = r13.zzq
            long r7 = r13.zzi
            int r10 = r13.zzj
            r11 = 0
            r12 = 0
            r9 = 1
            r6.zzs(r7, r9, r10, r11, r12)
            long r0 = r13.zzi
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r2
            r13.zzi = r0
            return r5
        L80:
            java.lang.String r14 = "WB"
            java.lang.String r5 = "NB"
            if (r4 == r2) goto L87
            r14 = r5
        L87:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb1
            r2.<init>(r0)     // Catch: java.io.EOFException -> Lb1
            r2.append(r14)     // Catch: java.io.EOFException -> Lb1
            java.lang.String r14 = " frame type "
            r2.append(r14)     // Catch: java.io.EOFException -> Lb1
            r2.append(r1)     // Catch: java.io.EOFException -> Lb1
            java.lang.String r14 = r2.toString()     // Catch: java.io.EOFException -> Lb1
            com.google.android.gms.internal.ads.zzch r14 = com.google.android.gms.internal.ads.zzch.zza(r14, r7)     // Catch: java.io.EOFException -> Lb1
            throw r14     // Catch: java.io.EOFException -> Lb1
        La0:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb1
            r14.<init>(r1)     // Catch: java.io.EOFException -> Lb1
            r14.append(r2)     // Catch: java.io.EOFException -> Lb1
            java.lang.String r14 = r14.toString()     // Catch: java.io.EOFException -> Lb1
            com.google.android.gms.internal.ads.zzch r14 = com.google.android.gms.internal.ads.zzch.zza(r14, r7)     // Catch: java.io.EOFException -> Lb1
            throw r14     // Catch: java.io.EOFException -> Lb1
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafi.zza(com.google.android.gms.internal.ads.zzadv):int");
    }

    private static boolean zzg(zzadv zzadvVar, byte[] bArr) throws IOException {
        zzadvVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzadi) zzadvVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzadv zzadvVar) throws IOException {
        byte[] bArr = zzd;
        if (zzg(zzadvVar, bArr)) {
            this.zzh = false;
            ((zzadi) zzadvVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzg(zzadvVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzadi) zzadvVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        String str;
        int i9;
        zzeq.zzb(this.zzq);
        int i10 = zzgd.zza;
        if (zzadvVar.zzf() == 0 && !zzh(zzadvVar)) {
            throw zzch.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z8 = this.zzh;
            if (true != z8) {
                str = MimeTypes.AUDIO_AMR_NB;
            } else {
                str = MimeTypes.AUDIO_AMR_WB;
            }
            if (true != z8) {
                i9 = 8000;
            } else {
                i9 = 16000;
            }
            zzafa zzafaVar = this.zzq;
            zzal zzalVar = new zzal();
            zzalVar.zzX(str);
            zzalVar.zzP(zzf);
            zzalVar.zzy(1);
            zzalVar.zzY(i9);
            zzafaVar.zzl(zzalVar.zzad());
        }
        int zza2 = zza(zzadvVar);
        if (this.zzl) {
            return zza2;
        }
        zzaes zzaesVar = new zzaes(C.TIME_UNSET, 0L);
        this.zzr = zzaesVar;
        this.zzp.zzO(zzaesVar);
        this.zzl = true;
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzp = zzadxVar;
        this.zzq = zzadxVar.zzw(0, 1);
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return zzh(zzadvVar);
    }

    public zzafi(int i9) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }
}
