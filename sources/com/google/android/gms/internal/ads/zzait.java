package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzait implements zzacr {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzad zzb;
    private long zzA;

    @Nullable
    private zzais zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzacu zzH;
    private zzadx[] zzI;
    private zzadx[] zzJ;
    private boolean zzK;
    private final zzakg zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzed zzg;
    private final zzed zzh;
    private final zzed zzi;
    private final byte[] zzj;
    private final zzed zzk;
    private final zzafp zzl;
    private final zzed zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzft zzp;
    private zzfzo zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;

    @Nullable
    private zzed zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzZ(MimeTypes.APPLICATION_EMSG);
        zzb = zzabVar.zzaf();
    }

    @Deprecated
    public zzait() {
        this(zzakg.zza, 32, null, null, zzfzo.zzn(), null);
    }

    private static int zzg(int i10) throws zzbh {
        if (i10 >= 0) {
            return i10;
        }
        throw zzbh.zza("Unexpected negative value: " + i10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzw zzh(java.util.List r17) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzait.zzh(java.util.List):com.google.android.gms.internal.ads.zzw");
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzed zzedVar, int i10, zzajg zzajgVar) throws zzbh {
        boolean z10;
        zzedVar.zzL(i10 + 8);
        int zzg = zzedVar.zzg();
        int i11 = zzain.zza;
        int i12 = zzg & ViewCompat.MEASURED_SIZE_MASK;
        if ((i12 & 1) == 0) {
            if ((i12 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int zzp = zzedVar.zzp();
            if (zzp == 0) {
                Arrays.fill(zzajgVar.zzl, 0, zzajgVar.zze, false);
                return;
            }
            int i13 = zzajgVar.zze;
            if (zzp == i13) {
                Arrays.fill(zzajgVar.zzl, 0, zzp, z10);
                zzajgVar.zza(zzedVar.zzb());
                zzed zzedVar2 = zzajgVar.zzn;
                zzedVar.zzH(zzedVar2.zzN(), 0, zzedVar2.zze());
                zzajgVar.zzn.zzL(0);
                zzajgVar.zzo = false;
                return;
            }
            throw zzbh.zza("Senc sample count " + zzp + " is different from fragment sample count" + i13, null);
        }
        throw zzbh.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x032d, code lost:
    
        if (r0 < r5.zze) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r51) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzait.zzl(long):void");
    }

    private static final zzaio zzm(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaio) sparseArray.valueAt(0);
        }
        zzaio zzaioVar = (zzaio) sparseArray.get(i10);
        zzaioVar.getClass();
        return zzaioVar;
    }

    public final /* synthetic */ void zza(long j3, zzed zzedVar) {
        zzacd.zza(j3, zzedVar, this.zzJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:308:0x0090, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0093, code lost:
    
        if (r26.zzr != 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0095, code lost:
    
        r3 = r2.zzb();
        r26.zzC = r3;
        r26.zzF = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00a1, code lost:
    
        if (r2.zzf >= r2.zzi) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00a3, code lost:
    
        r27.zzk(r3);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00aa, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00ad, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00b3, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00b5, code lost:
    
        r3.zzM(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00c0, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00c2, code lost:
    
        r3.zzM(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00ce, code lost:
    
        if (r2.zzk() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d0, code lost:
    
        r26.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x02bf, code lost:
    
        r26.zzr = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x02c2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00da, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00dc, code lost:
    
        r26.zzC = r3 - 8;
        r27.zzk(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00f1, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzo) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00f3, code lost:
    
        r26.zzD = r2.zzc(r26.zzC, 7);
        com.google.android.gms.internal.ads.zzabu.zzb(r26.zzC, r26.zzk);
        r2.zza.zzq(r26.zzk, 7);
        r3 = r26.zzD + 7;
        r26.zzD = r3;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x011a, code lost:
    
        r26.zzC += r3;
        r26.zzr = 4;
        r26.zzE = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0111, code lost:
    
        r5 = 0;
        r3 = r2.zzc(r26.zzC, 0);
        r26.zzD = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0124, code lost:
    
        r3 = r2.zzd.zza;
        r9 = r2.zza;
        r5 = r2.zze();
        r7 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0130, code lost:
    
        if (r7 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0132, code lost:
    
        r3 = r26.zzD;
        r4 = r26.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0136, code lost:
    
        if (r3 >= r4) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0138, code lost:
    
        r26.zzD += r9.zzf(r27, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0266, code lost:
    
        r12 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x026e, code lost:
    
        if (r1 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0270, code lost:
    
        r1 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0274, code lost:
    
        r9.zzs(r5, r12, r26.zzC, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0282, code lost:
    
        if (r26.zzo.isEmpty() != false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0284, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzair) r26.zzo.removeFirst();
        r26.zzx -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0297, code lost:
    
        if (r1.zzb == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0299, code lost:
    
        r3 = r3 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x029a, code lost:
    
        r14 = r26.zzI;
        r15 = r14.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x029f, code lost:
    
        if (r13 >= r15) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x02a1, code lost:
    
        r14[r13].zzs(r3, 1, r1.zzc, r26.zzx, null);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x02b9, code lost:
    
        if (r2.zzk() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x02bb, code lost:
    
        r26.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x02be, code lost:
    
        r11 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0273, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0144, code lost:
    
        r10 = 0;
        r11 = r26.zzh.zzN();
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r12 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x015a, code lost:
    
        if (r26.zzD >= r26.zzC) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x015c, code lost:
    
        r13 = r26.zzE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0160, code lost:
    
        if (r13 != 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0162, code lost:
    
        r27.zzi(r11, r7, r12);
        r26.zzh.zzL(r10);
        r13 = r26.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0170, code lost:
    
        if (r13 <= 0) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0172, code lost:
    
        r26.zzE = r13 - 1;
        r26.zzg.zzL(r10);
        r9.zzq(r26.zzg, 4);
        r9.zzq(r26.zzh, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x018b, code lost:
    
        if (r26.zzJ.length <= 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x018d, code lost:
    
        r10 = r3.zzf.zzo;
        r13 = r11[4];
        r16 = com.google.android.gms.internal.ads.zzfp.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0199, code lost:
    
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H264.equals(r10) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x019d, code lost:
    
        if ((r13 & 31) == r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01ad, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01b0, code lost:
    
        r26.zzG = r10;
        r26.zzD += 5;
        r26.zzC += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01bf, code lost:
    
        if (r26.zzF != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01cd, code lost:
    
        if (java.util.Objects.equals(r2.zzd.zza.zzf.zzo, com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H264) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01d6, code lost:
    
        if (com.google.android.gms.internal.ads.zzfp.zzi(r11[4]) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01d8, code lost:
    
        r8 = 1;
        r26.zzF = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0263, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x01dd, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01a3, code lost:
    
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r10) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01ab, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01af, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01e7, code lost:
    
        throw com.google.android.gms.internal.ads.zzbh.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01ea, code lost:
    
        if (r26.zzG == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01ec, code lost:
    
        r26.zzi.zzI(r13);
        r27.zzi(r26.zzi.zzN(), 0, r26.zzE);
        r9.zzq(r26.zzi, r26.zzE);
        r4 = r26.zzE;
        r10 = r26.zzi;
        r10 = com.google.android.gms.internal.ads.zzfp.zzb(r10.zzN(), r10.zze());
        r26.zzi.zzL(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r3.zzf.zzo) ? 1 : 0);
        r26.zzi.zzK(r10);
        r10 = r3.zzf.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x022b, code lost:
    
        if (r10 == (-1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0233, code lost:
    
        if (r10 == r26.zzp.zza()) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0235, code lost:
    
        r26.zzp.zzd(r3.zzf.zzq);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x023e, code lost:
    
        r26.zzp.zzb(r5, r26.zzi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x024b, code lost:
    
        if ((r2.zza() & 5) == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x024d, code lost:
    
        r26.zzp.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0258, code lost:
    
        r26.zzD += r4;
        r26.zzE -= r4;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0253, code lost:
    
        r4 = r9.zzf(r27, r13, false);
     */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r27, com.google.android.gms.internal.ads.zzadn r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzait.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        int i10;
        if ((this.zzd & 32) == 0) {
            zzacuVar = new zzakj(zzacuVar, this.zzc);
        }
        this.zzH = zzacuVar;
        zzj();
        zzadx[] zzadxVarArr = new zzadx[2];
        this.zzI = zzadxVarArr;
        int i11 = 100;
        int i12 = 0;
        if ((this.zzd & 4) != 0) {
            zzadxVarArr[0] = this.zzH.zzw(100, 5);
            i10 = 1;
            i11 = 101;
        } else {
            i10 = 0;
        }
        zzadx[] zzadxVarArr2 = (zzadx[]) zzen.zzO(this.zzI, i10);
        this.zzI = zzadxVarArr2;
        for (zzadx zzadxVar : zzadxVarArr2) {
            zzadxVar.zzl(zzb);
        }
        this.zzJ = new zzadx[this.zze.size()];
        while (i12 < this.zzJ.length) {
            zzadx zzw = this.zzH.zzw(i11, 3);
            zzw.zzl((zzad) this.zze.get(i12));
            this.zzJ[i12] = zzw;
            i12++;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        int size = this.zzf.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzais) this.zzf.valueAt(i10)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j10;
        this.zzn.clear();
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzfzo zzn;
        zzadu zza2 = zzajd.zza(zzacsVar);
        if (zza2 != null) {
            zzn = zzfzo.zzo(zza2);
        } else {
            zzn = zzfzo.zzn();
        }
        this.zzq = zzn;
        if (zza2 == null) {
            return true;
        }
        return false;
    }

    public zzait(zzakg zzakgVar, int i10, @Nullable zzek zzekVar, @Nullable zzaje zzajeVar, List list, @Nullable zzadx zzadxVar) {
        this.zzc = zzakgVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafp();
        this.zzm = new zzed(16);
        this.zzg = new zzed(zzfp.zza);
        this.zzh = new zzed(5);
        this.zzi = new zzed();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzed(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzfzo.zzn();
        this.zzz = C.TIME_UNSET;
        this.zzy = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzH = zzacu.zza;
        this.zzI = new zzadx[0];
        this.zzJ = new zzadx[0];
        this.zzp = new zzft(new zzfr() { // from class: com.google.android.gms.internal.ads.zzaiq
            @Override // com.google.android.gms.internal.ads.zzfr
            public final void zza(long j3, zzed zzedVar) {
                zzait.this.zza(j3, zzedVar);
            }
        });
    }
}
