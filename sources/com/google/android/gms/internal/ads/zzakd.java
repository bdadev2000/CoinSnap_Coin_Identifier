package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzakd implements zzadu {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzajz
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzakd(zzalt.zza, 32)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzan zzc;

    @Nullable
    private zzakc zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private zzadx zzF;
    private zzafa[] zzG;
    private zzafa[] zzH;
    private boolean zzI;
    private final zzalt zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzfu zzg;
    private final zzfu zzh;
    private final zzfu zzi;
    private final byte[] zzj;
    private final zzfu zzk;
    private final zzagu zzl;
    private final zzfu zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private zzgbc zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private int zzt;

    @Nullable
    private zzfu zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzal zzalVar = new zzal();
        zzalVar.zzX(MimeTypes.APPLICATION_EMSG);
        zzc = zzalVar.zzad();
    }

    @Deprecated
    public zzakd() {
        this(zzalt.zza, 32, null, null, zzgbc.zzm(), null);
    }

    private static int zza(int i9) throws zzch {
        if (i9 >= 0) {
            return i9;
        }
        throw zzch.zza("Unexpected negative value: " + i9, null);
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
    private static com.google.android.gms.internal.ads.zzae zzg(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakd.zzg(java.util.List):com.google.android.gms.internal.ads.zzae");
    }

    private final void zzh() {
        this.zzq = 0;
        this.zzt = 0;
    }

    private static void zzi(zzfu zzfuVar, int i9, zzakr zzakrVar) throws zzch {
        boolean z8;
        zzfuVar.zzK(i9 + 8);
        int zzg = zzfuVar.zzg();
        if ((zzg & 1) == 0) {
            if ((zzg & 2) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int zzp = zzfuVar.zzp();
            if (zzp == 0) {
                Arrays.fill(zzakrVar.zzl, 0, zzakrVar.zze, false);
                return;
            }
            int i10 = zzakrVar.zze;
            if (zzp == i10) {
                Arrays.fill(zzakrVar.zzl, 0, zzp, z8);
                zzakrVar.zza(zzfuVar.zzb());
                zzfu zzfuVar2 = zzakrVar.zzn;
                zzfuVar.zzG(zzfuVar2.zzM(), 0, zzfuVar2.zze());
                zzakrVar.zzn.zzK(0);
                zzakrVar.zzo = false;
                return;
            }
            throw zzch.zza("Senc sample count " + zzp + " is different from fragment sample count" + i10, null);
        }
        throw zzch.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x032f, code lost:
    
        if (r1 < r6.zze) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(long r47) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakd.zzj(long):void");
    }

    private static final zzajy zzk(SparseArray sparseArray, int i9) {
        if (sparseArray.size() == 1) {
            return (zzajy) sparseArray.valueAt(0);
        }
        zzajy zzajyVar = (zzajy) sparseArray.get(i9);
        zzajyVar.getClass();
        return zzajyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:308:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009c, code lost:
    
        if (r33.zzq != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzadi) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00be, code lost:
    
        r3.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00cb, code lost:
    
        r3.zzL(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00d7, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d9, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00db, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0293, code lost:
    
        r33.zzq = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0296, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e4, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00e6, code lost:
    
        r33.zzB = r3 - 8;
        ((com.google.android.gms.internal.ads.zzadi) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0100, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzn) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0102, code lost:
    
        r33.zzC = r2.zzc(r33.zzB, 7);
        com.google.android.gms.internal.ads.zzacw.zzb(r33.zzB, r33.zzk);
        r2.zza.zzq(r33.zzk, 7);
        r3 = r33.zzC + 7;
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0127, code lost:
    
        r33.zzB += r3;
        r33.zzq = 4;
        r33.zzD = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x011f, code lost:
    
        r3 = r2.zzc(r33.zzB, 0);
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0131, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x013d, code lost:
    
        if (r6 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x013f, code lost:
    
        r3 = r33.zzC;
        r4 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0143, code lost:
    
        if (r3 >= r4) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0145, code lost:
    
        r33.zzC += r5.zzf(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0231, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0239, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x023b, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0242, code lost:
    
        r5.zzs(r10, r20, r33.zzB, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0255, code lost:
    
        if (r33.zzo.isEmpty() != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0257, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakb) r33.zzo.removeFirst();
        r33.zzw -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x026a, code lost:
    
        if (r1.zzb == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x026c, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x026d, code lost:
    
        r5 = r33.zzG;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0271, code lost:
    
        if (r8 >= r6) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0273, code lost:
    
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzw, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x028e, code lost:
    
        if (r2.zzk() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0290, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0292, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0240, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0150, code lost:
    
        r13 = r33.zzh.zzM();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0166, code lost:
    
        if (r33.zzC >= r33.zzB) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0168, code lost:
    
        r12 = r33.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x016c, code lost:
    
        if (r12 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x016e, code lost:
    
        ((com.google.android.gms.internal.ads.zzadi) r34).zzn(r13, r6, r14, r9);
        r33.zzh.zzK(r9);
        r12 = r33.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x017f, code lost:
    
        if (r12 <= 0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0181, code lost:
    
        r33.zzD = r12 - 1;
        r33.zzg.zzK(r9);
        r5.zzq(r33.zzg, 4);
        r5.zzq(r33.zzh, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0198, code lost:
    
        if (r33.zzH.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x019a, code lost:
    
        r12 = r3.zzf.zzn;
        r17 = r13[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01a6, code lost:
    
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H264.equals(r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01aa, code lost:
    
        if ((r17 & 31) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01ad, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01be, code lost:
    
        r33.zzE = r9;
        r33.zzC += 5;
        r33.zzB += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01cb, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01b3, code lost:
    
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01ba, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01bd, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x01d4, code lost:
    
        throw com.google.android.gms.internal.ads.zzch.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01d7, code lost:
    
        if (r33.zzE == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01d9, code lost:
    
        r33.zzi.zzH(r12);
        ((com.google.android.gms.internal.ads.zzadi) r34).zzn(r33.zzi.zzM(), 0, r33.zzD, false);
        r5.zzq(r33.zzi, r33.zzD);
        r4 = r33.zzD;
        r8 = r33.zzi;
        r8 = com.google.android.gms.internal.ads.zzgr.zzb(r8.zzM(), r8.zze());
        r33.zzi.zzK(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r3.zzf.zzn) ? 1 : 0);
        r33.zzi.zzJ(r8);
        com.google.android.gms.internal.ads.zzadf.zza(r10, r33.zzi, r33.zzH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0224, code lost:
    
        r33.zzC += r4;
        r33.zzD -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x021e, code lost:
    
        r4 = r5.zzf(r34, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadv r34, com.google.android.gms.internal.ads.zzaeq r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakd.zzb(com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzaeq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzF = zzadxVar;
        zzh();
        zzafa[] zzafaVarArr = new zzafa[2];
        this.zzG = zzafaVarArr;
        int i9 = 0;
        zzafa[] zzafaVarArr2 = (zzafa[]) zzgd.zzP(zzafaVarArr, 0);
        this.zzG = zzafaVarArr2;
        for (zzafa zzafaVar : zzafaVarArr2) {
            zzafaVar.zzl(zzc);
        }
        this.zzH = new zzafa[this.zze.size()];
        int i10 = 100;
        while (i9 < this.zzH.length) {
            int i11 = i10 + 1;
            zzafa zzw = this.zzF.zzw(i10, 3);
            zzw.zzl((zzan) this.zze.get(i9));
            this.zzH[i9] = zzw;
            i9++;
            i10 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        int size = this.zzf.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((zzakc) this.zzf.valueAt(i9)).zzi();
        }
        this.zzo.clear();
        this.zzw = 0;
        this.zzx = j9;
        this.zzn.clear();
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzgbc zzm;
        zzaex zza2 = zzako.zza(zzadvVar);
        if (zza2 != null) {
            zzm = zzgbc.zzn(zza2);
        } else {
            zzm = zzgbc.zzm();
        }
        this.zzp = zzm;
        if (zza2 == null) {
            return true;
        }
        return false;
    }

    public zzakd(zzalt zzaltVar, int i9) {
        this(zzaltVar, 32, null, null, zzgbc.zzm(), null);
    }

    public zzakd(zzalt zzaltVar, int i9, @Nullable zzgb zzgbVar, @Nullable zzakp zzakpVar, List list, @Nullable zzafa zzafaVar) {
        this.zzd = zzaltVar;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzagu();
        this.zzm = new zzfu(16);
        this.zzg = new zzfu(zzgr.zza);
        this.zzh = new zzfu(5);
        this.zzi = new zzfu();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzfu(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzp = zzgbc.zzm();
        this.zzy = C.TIME_UNSET;
        this.zzx = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
        this.zzF = zzadx.zza;
        this.zzG = new zzafa[0];
        this.zzH = new zzafa[0];
    }
}
