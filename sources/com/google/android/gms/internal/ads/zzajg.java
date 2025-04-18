package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzajg implements zzadb {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzaf zzb;
    private long zzA;

    @Nullable
    private zzajf zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzade zzH;
    private zzaeh[] zzI;
    private zzaeh[] zzJ;
    private boolean zzK;
    private final zzakt zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzek zzg;
    private final zzek zzh;
    private final zzek zzi;
    private final byte[] zzj;
    private final zzek zzk;
    private final zzafz zzl;
    private final zzek zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfw zzp;
    private zzgax zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;

    @Nullable
    private zzek zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzZ("application/x-emsg");
        zzb = zzadVar.zzaf();
    }

    @Deprecated
    public zzajg() {
        this(zzakt.zza, 32, null, null, zzgax.zzn(), null);
    }

    private static int zzg(int i2) throws zzbo {
        if (i2 >= 0) {
            return i2;
        }
        throw zzbo.zza("Unexpected negative value: " + i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzy zzh(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajg.zzh(java.util.List):com.google.android.gms.internal.ads.zzy");
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzek zzekVar, int i2, zzajt zzajtVar) throws zzbo {
        zzekVar.zzL(i2 + 8);
        int zzg = zzekVar.zzg();
        if ((zzg & 1) != 0) {
            throw zzbo.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (zzg & 2) != 0;
        int zzp = zzekVar.zzp();
        if (zzp == 0) {
            Arrays.fill(zzajtVar.zzl, 0, zzajtVar.zze, false);
            return;
        }
        int i3 = zzajtVar.zze;
        if (zzp != i3) {
            throw zzbo.zza("Senc sample count " + zzp + " is different from fragment sample count" + i3, null);
        }
        Arrays.fill(zzajtVar.zzl, 0, zzp, z2);
        zzajtVar.zza(zzekVar.zzb());
        zzek zzekVar2 = zzajtVar.zzn;
        zzekVar.zzH(zzekVar2.zzN(), 0, zzekVar2.zze());
        zzajtVar.zzn.zzL(0);
        zzajtVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0337, code lost:
    
        if (r0 < r5.zze) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r50) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajg.zzl(long):void");
    }

    private static final zzajb zzm(SparseArray sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (zzajb) sparseArray.valueAt(0);
        }
        zzajb zzajbVar = (zzajb) sparseArray.get(i2);
        zzajbVar.getClass();
        return zzajbVar;
    }

    public final /* synthetic */ void zza(long j2, zzek zzekVar) {
        zzacn.zza(j2, zzekVar, this.zzJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x0095, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0098, code lost:
    
        if (r37.zzr != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x009a, code lost:
    
        r3 = r2.zzb();
        r37.zzC = r3;
        r37.zzF = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00a6, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00a8, code lost:
    
        r38.zzk(r3);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00af, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00b2, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00b8, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00ba, code lost:
    
        r3.zzM(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00c5, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00c7, code lost:
    
        r3.zzM(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d3, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00d5, code lost:
    
        r37.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00d7, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x02c8, code lost:
    
        r37.zzr = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x02cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00e0, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00e2, code lost:
    
        r37.zzC = r3 - 8;
        r38.zzk(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00f7, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzn) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x00f9, code lost:
    
        r37.zzD = r2.zzc(r37.zzC, 7);
        com.google.android.gms.internal.ads.zzace.zzb(r37.zzC, r37.zzk);
        r2.zza.zzq(r37.zzk, 7);
        r3 = r37.zzD + 7;
        r37.zzD = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x011e, code lost:
    
        r37.zzC += r3;
        r37.zzr = 4;
        r37.zzE = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0116, code lost:
    
        r3 = r2.zzc(r37.zzC, 0);
        r37.zzD = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0128, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r6 = r2.zze();
        r11 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0134, code lost:
    
        if (r11 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0136, code lost:
    
        r3 = r37.zzD;
        r4 = r37.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x013a, code lost:
    
        if (r3 >= r4) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x013c, code lost:
    
        r37.zzD += r5.zzf(r38, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0268, code lost:
    
        r22 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0270, code lost:
    
        if (r1 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0272, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0279, code lost:
    
        r5.zzs(r6, r22, r37.zzC, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x028c, code lost:
    
        if (r37.zzo.isEmpty() != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x028e, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaje) r37.zzo.removeFirst();
        r37.zzx -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x02a1, code lost:
    
        if (r1.zzb == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x02a3, code lost:
    
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x02a4, code lost:
    
        r5 = r37.zzI;
        r15 = r5.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x02a8, code lost:
    
        if (r14 >= r15) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x02aa, code lost:
    
        r5[r14].zzs(r3, 1, r1.zzc, r37.zzx, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x02c2, code lost:
    
        if (r2.zzk() != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x02c4, code lost:
    
        r37.zzB = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x02c7, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0277, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0147, code lost:
    
        r12 = r37.zzh.zzN();
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x015d, code lost:
    
        if (r37.zzD >= r37.zzC) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x015f, code lost:
    
        r13 = r37.zzE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0163, code lost:
    
        if (r13 != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0165, code lost:
    
        r38.zzi(r12, r11, r14);
        r37.zzh.zzL(r10);
        r13 = r37.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0173, code lost:
    
        if (r13 <= 0) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0175, code lost:
    
        r37.zzE = r13 - 1;
        r37.zzg.zzL(r10);
        r5.zzq(r37.zzg, 4);
        r5.zzq(r37.zzh, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x018e, code lost:
    
        if (r37.zzJ.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0190, code lost:
    
        r13 = r3.zzf.zzn;
        r17 = r12[4];
        r10 = com.google.android.gms.internal.ads.zzfs.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x019c, code lost:
    
        if ("video/avc".equals(r13) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01a0, code lost:
    
        if ((r17 & 31) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01a3, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x01b4, code lost:
    
        r37.zzG = r10;
        r37.zzD += 5;
        r37.zzC += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01c3, code lost:
    
        if (r37.zzF != false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01d1, code lost:
    
        if (java.util.Objects.equals(r2.zzd.zza.zzf.zzn, "video/avc") == false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01da, code lost:
    
        if (com.google.android.gms.internal.ads.zzfs.zzi(r12[4]) == false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01dc, code lost:
    
        r37.zzF = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x01de, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01a9, code lost:
    
        if ("video/hevc".equals(r13) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01b0, code lost:
    
        if (((r17 & 126) >> 1) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01b3, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01ea, code lost:
    
        throw com.google.android.gms.internal.ads.zzbo.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01ed, code lost:
    
        if (r37.zzG == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01ef, code lost:
    
        r37.zzi.zzI(r13);
        r38.zzi(r37.zzi.zzN(), 0, r37.zzE);
        r5.zzq(r37.zzi, r37.zzE);
        r8 = r37.zzE;
        r10 = r37.zzi;
        r10 = com.google.android.gms.internal.ads.zzfs.zzb(r10.zzN(), r10.zze());
        r37.zzi.zzL("video/hevc".equals(r3.zzf.zzn) ? 1 : 0);
        r37.zzi.zzK(r10);
        r4 = r3.zzf.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x022e, code lost:
    
        if (r4 == (-1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0236, code lost:
    
        if (r4 == r37.zzp.zza()) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0238, code lost:
    
        r37.zzp.zzd(r3.zzf.zzp);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0241, code lost:
    
        r37.zzp.zzb(r6, r37.zzi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x024e, code lost:
    
        if ((r2.zza() & 5) == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0250, code lost:
    
        r37.zzp.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x025b, code lost:
    
        r37.zzD += r8;
        r37.zzE -= r8;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0256, code lost:
    
        r8 = r5.zzf(r38, r13, false);
     */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadc r38, com.google.android.gms.internal.ads.zzadx r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajg.zzb(com.google.android.gms.internal.ads.zzadc, com.google.android.gms.internal.ads.zzadx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        int i2;
        if ((this.zzd & 32) == 0) {
            zzadeVar = new zzakw(zzadeVar, this.zzc);
        }
        this.zzH = zzadeVar;
        zzj();
        zzaeh[] zzaehVarArr = new zzaeh[2];
        this.zzI = zzaehVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((this.zzd & 4) != 0) {
            zzaehVarArr[0] = this.zzH.zzw(100, 5);
            i2 = 1;
            i3 = 101;
        } else {
            i2 = 0;
        }
        zzaeh[] zzaehVarArr2 = (zzaeh[]) zzeu.zzN(this.zzI, i2);
        this.zzI = zzaehVarArr2;
        for (zzaeh zzaehVar : zzaehVarArr2) {
            zzaehVar.zzl(zzb);
        }
        this.zzJ = new zzaeh[this.zze.size()];
        while (i4 < this.zzJ.length) {
            zzaeh zzw = this.zzH.zzw(i3, 3);
            zzw.zzl((zzaf) this.zze.get(i4));
            this.zzJ[i4] = zzw;
            i4++;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        int size = this.zzf.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzajf) this.zzf.valueAt(i2)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j3;
        this.zzn.clear();
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        zzaee zza2 = zzajq.zza(zzadcVar);
        this.zzq = zza2 != null ? zzgax.zzo(zza2) : zzgax.zzn();
        return zza2 == null;
    }

    public zzajg(zzakt zzaktVar, int i2, @Nullable zzer zzerVar, @Nullable zzajr zzajrVar, List list, @Nullable zzaeh zzaehVar) {
        this.zzc = zzaktVar;
        this.zzd = i2;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafz();
        this.zzm = new zzek(16);
        this.zzg = new zzek(zzfs.zza);
        this.zzh = new zzek(5);
        this.zzi = new zzek();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzek(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzgax.zzn();
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = zzade.zza;
        this.zzI = new zzaeh[0];
        this.zzJ = new zzaeh[0];
        this.zzp = new zzfw(new zzfu() { // from class: com.google.android.gms.internal.ads.zzajd
            @Override // com.google.android.gms.internal.ads.zzfu
            public final void zza(long j2, zzek zzekVar) {
                zzajg.this.zza(j2, zzekVar);
            }
        });
    }
}
