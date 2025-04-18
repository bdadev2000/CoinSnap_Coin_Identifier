package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkh implements Handler.Callback, zzuo, zzyi, zzle, zzie, zzlh {
    private static final long zza = zzen.zzv(10000);
    private zzke zzA;
    private boolean zzB;
    private boolean zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzJ;
    private int zzK;

    @Nullable
    private zzkf zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;

    @Nullable
    private zzig zzQ;
    private zziq zzS;
    private final zzjd zzT;
    private final zzia zzU;
    private final zzln[] zzb;
    private final Set zzc;
    private final zzlq[] zzd;
    private final boolean[] zze;
    private final zzyj zzf;
    private final zzyk zzg;
    private final zzkl zzh;
    private final zzyr zzi;
    private final zzdm zzj;

    @Nullable
    private final HandlerThread zzk;
    private final Looper zzl;
    private final zzbu zzm;
    private final zzbt zzn;
    private final long zzo;
    private final zzif zzp;
    private final ArrayList zzq;
    private final zzdc zzr;
    private final zzkt zzs;
    private final zzlf zzt;
    private final long zzu;
    private final zzoj zzv;
    private final zzlw zzw;
    private final zzdm zzx;
    private zzls zzy;
    private zzlg zzz;
    private int zzH = 0;
    private boolean zzI = false;
    private boolean zzC = false;
    private long zzR = C.TIME_UNSET;
    private long zzF = C.TIME_UNSET;

    public zzkh(zzln[] zzlnVarArr, zzyj zzyjVar, zzyk zzykVar, zzkl zzklVar, zzyr zzyrVar, int i10, boolean z10, zzlw zzlwVar, zzls zzlsVar, zzia zziaVar, long j3, boolean z11, boolean z12, Looper looper, zzdc zzdcVar, zzjd zzjdVar, zzoj zzojVar, @Nullable Looper looper2, zziq zziqVar) {
        this.zzT = zzjdVar;
        this.zzb = zzlnVarArr;
        this.zzf = zzyjVar;
        this.zzg = zzykVar;
        this.zzh = zzklVar;
        this.zzi = zzyrVar;
        this.zzy = zzlsVar;
        this.zzU = zziaVar;
        this.zzu = j3;
        this.zzr = zzdcVar;
        this.zzv = zzojVar;
        this.zzS = zziqVar;
        this.zzw = zzlwVar;
        this.zzo = zzklVar.zzb(zzojVar);
        zzklVar.zzg(zzojVar);
        zzbv zzbvVar = zzbv.zza;
        zzlg zzg = zzlg.zzg(zzykVar);
        this.zzz = zzg;
        this.zzA = new zzke(zzg);
        int length = zzlnVarArr.length;
        this.zzd = new zzlq[2];
        this.zze = new boolean[2];
        zzlp zze = zzyjVar.zze();
        for (int i11 = 0; i11 < 2; i11++) {
            zzlnVarArr[i11].zzv(i11, zzojVar, zzdcVar);
            this.zzd[i11] = zzlnVarArr[i11].zzm();
            this.zzd[i11].zzL(zze);
        }
        this.zzp = new zzif(this, zzdcVar);
        this.zzq = new ArrayList();
        this.zzc = Collections.newSetFromMap(new IdentityHashMap());
        this.zzm = new zzbu();
        this.zzn = new zzbt();
        zzyjVar.zzr(this, zzyrVar);
        this.zzP = true;
        zzdm zzd = zzdcVar.zzd(looper, null);
        this.zzx = zzd;
        this.zzs = new zzkt(zzlwVar, zzd, new zzjz(this), zziqVar);
        this.zzt = new zzlf(this, zzlwVar, zzd, zzojVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzk = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzl = looper3;
        this.zzj = zzdcVar.zzd(looper3, this);
    }

    private final void zzA(int i10) throws zzig {
        zzln zzlnVar = this.zzb[i10];
        if (!zzag(zzlnVar)) {
            return;
        }
        zzK(i10, false);
        this.zzp.zzd(zzlnVar);
        zzan(zzlnVar);
        zzlnVar.zzr();
        this.zzK--;
    }

    private final void zzB() throws zzig {
        int length = this.zzb.length;
        zzC(new boolean[2], this.zzs.zzf().zzf());
    }

    private final void zzC(boolean[] zArr, long j3) throws zzig {
        boolean z10;
        boolean z11;
        boolean z12;
        zzkq zzf = this.zzs.zzf();
        zzyk zzi = zzf.zzi();
        int i10 = 0;
        while (true) {
            int length = this.zzb.length;
            if (i10 >= 2) {
                break;
            }
            if (!zzi.zzb(i10) && this.zzc.remove(this.zzb[i10])) {
                this.zzb[i10].zzI();
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            int length2 = this.zzb.length;
            if (i11 < 2) {
                if (zzi.zzb(i11)) {
                    boolean z13 = zArr[i11];
                    zzln zzlnVar = this.zzb[i11];
                    if (!zzag(zzlnVar)) {
                        zzkt zzktVar = this.zzs;
                        zzkq zzf2 = zzktVar.zzf();
                        if (zzf2 == zzktVar.zze()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zzyk zzi2 = zzf2.zzi();
                        zzlr zzlrVar = zzi2.zzb[i11];
                        zzad[] zzal = zzal(zzi2.zzc[i11]);
                        if (zzaj() && this.zzz.zze == 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z13 && z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.zzK++;
                        this.zzc.add(zzlnVar);
                        zzlnVar.zzs(zzlrVar, zzal, zzf2.zzc[i11], this.zzM, z12, z10, j3, zzf2.zze(), zzf2.zzf.zza);
                        zzlnVar.zzu(11, new zzka(this));
                        this.zzp.zze(zzlnVar);
                        if (z11 && z10) {
                            zzlnVar.zzO();
                        }
                    }
                }
                i11++;
            } else {
                zzf.zzg = true;
                return;
            }
        }
    }

    private final void zzD(IOException iOException, int i10) {
        zzkt zzktVar = this.zzs;
        zzig zzc = zzig.zzc(iOException, i10);
        zzkq zze = zzktVar.zze();
        if (zze != null) {
            zzc = zzc.zza(zze.zzf.zza);
        }
        zzdt.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzX(false, false);
        this.zzz = this.zzz.zzd(zzc);
    }

    private final void zzE(boolean z10) {
        zzur zzurVar;
        long zzc;
        zzkq zzd = this.zzs.zzd();
        if (zzd == null) {
            zzurVar = this.zzz.zzb;
        } else {
            zzurVar = zzd.zzf.zza;
        }
        boolean z11 = !this.zzz.zzk.equals(zzurVar);
        if (z11) {
            this.zzz = this.zzz.zza(zzurVar);
        }
        zzlg zzlgVar = this.zzz;
        if (zzd == null) {
            zzc = zzlgVar.zzs;
        } else {
            zzc = zzd.zzc();
        }
        zzlgVar.zzq = zzc;
        this.zzz.zzr = zzt();
        if ((z11 || z10) && zzd != null && zzd.zzd) {
            zzaa(zzd.zzf.zza, zzd.zzh(), zzd.zzi());
        }
    }

    /* JADX WARN: Not initialized variable reg: 19, insn: 0x03a5: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:934), block:B:142:0x03a4 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzF(com.google.android.gms.internal.ads.zzbv r31, boolean r32) throws com.google.android.gms.internal.ads.zzig {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzF(com.google.android.gms.internal.ads.zzbv, boolean):void");
    }

    private final void zzG(zzbj zzbjVar, boolean z10) throws zzig {
        zzH(zzbjVar, zzbjVar.zzb, true, z10);
    }

    private final void zzH(zzbj zzbjVar, float f10, boolean z10, boolean z11) throws zzig {
        int i10;
        zzkh zzkhVar = this;
        if (z10) {
            if (z11) {
                zzkhVar.zzA.zza(1);
            }
            zzlg zzlgVar = zzkhVar.zzz;
            zzkhVar = this;
            zzkhVar.zzz = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, zzlgVar.zzg, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzlgVar.zzn, zzbjVar, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzt, false);
        }
        float f11 = zzbjVar.zzb;
        zzkq zze = zzkhVar.zzs.zze();
        while (true) {
            i10 = 0;
            if (zze == null) {
                break;
            }
            zzyd[] zzydVarArr = zze.zzi().zzc;
            int length = zzydVarArr.length;
            while (i10 < length) {
                zzyd zzydVar = zzydVarArr[i10];
                i10++;
            }
            zze = zze.zzg();
        }
        zzln[] zzlnVarArr = zzkhVar.zzb;
        int length2 = zzlnVarArr.length;
        while (i10 < 2) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzlnVar != null) {
                zzlnVar.zzM(f10, zzbjVar.zzb);
            }
            i10++;
        }
    }

    private final void zzI() {
        long zze;
        long j3;
        long j10;
        boolean z10;
        if (!zzaf()) {
            z10 = false;
        } else {
            zzkq zzd = this.zzs.zzd();
            long zzu = zzu(zzd.zzd());
            if (zzd == this.zzs.zze()) {
                zze = this.zzM;
                j3 = zzd.zze();
            } else {
                zze = this.zzM - zzd.zze();
                j3 = zzd.zzf.zzb;
            }
            long j11 = zze - j3;
            if (zzak(this.zzz.zza, zzd.zzf.zza)) {
                j10 = this.zzU.zzb();
            } else {
                j10 = C.TIME_UNSET;
            }
            zzkk zzkkVar = new zzkk(this.zzv, this.zzz.zza, zzd.zzf.zza, j11, zzu, this.zzp.zzc().zzb, this.zzz.zzl, this.zzE, j10);
            boolean zzh = this.zzh.zzh(zzkkVar);
            zzkq zze2 = this.zzs.zze();
            if (!zzh && zze2.zzd && zzu < 500000 && this.zzo > 0) {
                zze2.zza.zzj(this.zzz.zzs, false);
                z10 = this.zzh.zzh(zzkkVar);
            } else {
                z10 = zzh;
            }
        }
        this.zzG = z10;
        if (z10) {
            this.zzs.zzd().zzk(this.zzM, this.zzp.zzc().zzb, this.zzF);
        }
        zzZ();
    }

    private final void zzJ() {
        boolean z10;
        this.zzA.zzb(this.zzz);
        z10 = this.zzA.zze;
        if (z10) {
            zzjd zzjdVar = this.zzT;
            zzjdVar.zza.zzO(this.zzA);
            this.zzA = new zzke(this.zzz);
        }
    }

    private final void zzK(final int i10, final boolean z10) {
        boolean[] zArr = this.zze;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzx.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                @Override // java.lang.Runnable
                public final void run() {
                    zzkh.this.zzf(i10, z10);
                }
            });
        }
    }

    private final void zzL() throws zzig {
        zzyk zzykVar;
        int i10;
        boolean z10;
        float f10 = this.zzp.zzc().zzb;
        zzkt zzktVar = this.zzs;
        zzkq zze = zzktVar.zze();
        zzkq zzf = zzktVar.zzf();
        zzyk zzykVar2 = null;
        boolean z11 = true;
        while (zze != null && zze.zzd) {
            zzyk zzj = zze.zzj(f10, this.zzz.zza);
            if (zze == this.zzs.zze()) {
                zzykVar = zzj;
            } else {
                zzykVar = zzykVar2;
            }
            zzyk zzi = zze.zzi();
            boolean z12 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i11 = 0; i11 < zzj.zzc.length; i11++) {
                        if (zzj.zza(zzi, i11)) {
                        }
                    }
                    if (zze != zzf) {
                        z12 = true;
                    }
                    z11 &= z12;
                    zze = zze.zzg();
                    zzykVar2 = zzykVar;
                }
            }
            if (z11) {
                zzkt zzktVar2 = this.zzs;
                zzkq zze2 = zzktVar2.zze();
                boolean zzq = zzktVar2.zzq(zze2);
                int length = this.zzb.length;
                boolean[] zArr = new boolean[2];
                zzykVar.getClass();
                long zzb = zze2.zzb(zzykVar, this.zzz.zzs, zzq, zArr);
                zzlg zzlgVar = this.zzz;
                if (zzlgVar.zze != 4 && zzb != zzlgVar.zzs) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzlg zzlgVar2 = this.zzz;
                i10 = 2;
                this.zzz = zzz(zzlgVar2.zzb, zzb, zzlgVar2.zzc, zzlgVar2.zzd, z10, 5);
                if (z10) {
                    zzP(zzb);
                }
                int length2 = this.zzb.length;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    zzln[] zzlnVarArr = this.zzb;
                    int length3 = zzlnVarArr.length;
                    if (i12 >= 2) {
                        break;
                    }
                    zzln zzlnVar = zzlnVarArr[i12];
                    boolean zzag = zzag(zzlnVar);
                    zArr2[i12] = zzag;
                    zzwg zzwgVar = zze2.zzc[i12];
                    if (zzag) {
                        if (zzwgVar != zzlnVar.zzp()) {
                            zzA(i12);
                        } else if (zArr[i12]) {
                            zzlnVar.zzJ(this.zzM);
                        }
                    }
                    i12++;
                }
                zzC(zArr2, this.zzM);
            } else {
                i10 = 2;
                this.zzs.zzq(zze);
                if (zze.zzd) {
                    zze.zza(zzj, Math.max(zze.zzf.zzb, this.zzM - zze.zze()), false);
                }
            }
            zzE(true);
            if (this.zzz.zze != 4) {
                zzI();
                zzab();
                this.zzj.zzi(i10);
                return;
            }
            return;
        }
    }

    private final void zzM() throws zzig {
        zzL();
        zzS(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzN(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzN(boolean, boolean, boolean, boolean):void");
    }

    private final void zzO() {
        zzkq zze = this.zzs.zze();
        boolean z10 = false;
        if (zze != null && zze.zzf.zzh && this.zzC) {
            z10 = true;
        }
        this.zzD = z10;
    }

    private final void zzP(long j3) throws zzig {
        long zze;
        zzkq zze2 = this.zzs.zze();
        if (zze2 == null) {
            zze = 1000000000000L;
        } else {
            zze = zze2.zze();
        }
        long j10 = j3 + zze;
        this.zzM = j10;
        this.zzp.zzf(j10);
        zzln[] zzlnVarArr = this.zzb;
        int length = zzlnVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzag(zzlnVar)) {
                zzlnVar.zzJ(this.zzM);
            }
        }
        for (zzkq zze3 = this.zzs.zze(); zze3 != null; zze3 = zze3.zzg()) {
            for (zzyd zzydVar : zze3.zzi().zzc) {
            }
        }
    }

    private final void zzQ(zzbv zzbvVar, zzbv zzbvVar2) {
        if (zzbvVar.zzo() && zzbvVar2.zzo()) {
            return;
        }
        int size = this.zzq.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzq);
        } else {
            Object obj = ((zzkd) this.zzq.get(size)).zzb;
            int i10 = zzen.zza;
            throw null;
        }
    }

    private final void zzR(long j3) {
        long j10;
        if (this.zzz.zze == 3 && !zzaj()) {
            j10 = 1000;
        } else {
            j10 = zza;
        }
        this.zzj.zzj(2, j3 + j10);
    }

    private final void zzS(boolean z10) throws zzig {
        zzur zzurVar = this.zzs.zze().zzf.zza;
        long zzw = zzw(zzurVar, this.zzz.zzs, true, false);
        if (zzw != this.zzz.zzs) {
            zzlg zzlgVar = this.zzz;
            this.zzz = zzz(zzurVar, zzw, zzlgVar.zzc, zzlgVar.zzd, z10, 5);
        }
    }

    private final void zzT(zzbj zzbjVar) {
        this.zzj.zzf(16);
        this.zzp.zzg(zzbjVar);
    }

    private final void zzU(boolean z10, int i10, boolean z11, int i11) throws zzig {
        this.zzA.zza(z11 ? 1 : 0);
        this.zzz = this.zzz.zzc(z10, i11, i10);
        zzad(false, false);
        for (zzkq zze = this.zzs.zze(); zze != null; zze = zze.zzg()) {
            for (zzyd zzydVar : zze.zzi().zzc) {
            }
        }
        if (!zzaj()) {
            zzY();
            zzab();
            return;
        }
        int i12 = this.zzz.zze;
        if (i12 == 3) {
            this.zzp.zzh();
            zzW();
            this.zzj.zzi(2);
        } else if (i12 == 2) {
            this.zzj.zzi(2);
        }
    }

    private final void zzV(int i10) {
        zzlg zzlgVar = this.zzz;
        if (zzlgVar.zze != i10) {
            if (i10 != 2) {
                this.zzR = C.TIME_UNSET;
            }
            this.zzz = zzlgVar.zze(i10);
        }
    }

    private final void zzW() throws zzig {
        zzkq zze = this.zzs.zze();
        if (zze != null) {
            zzyk zzi = zze.zzi();
            int i10 = 0;
            while (true) {
                int length = this.zzb.length;
                if (i10 < 2) {
                    if (zzi.zzb(i10) && this.zzb[i10].zzcV() == 1) {
                        this.zzb[i10].zzO();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzX(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.zzJ) {
            z12 = false;
        } else {
            z12 = true;
        }
        zzN(z12, false, true, false);
        this.zzA.zza(z11 ? 1 : 0);
        this.zzh.zze(this.zzv);
        zzV(1);
    }

    private final void zzY() throws zzig {
        this.zzp.zzi();
        zzln[] zzlnVarArr = this.zzb;
        int length = zzlnVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzln zzlnVar = zzlnVarArr[i10];
            if (zzag(zzlnVar)) {
                zzan(zzlnVar);
            }
        }
    }

    private final void zzZ() {
        boolean z10;
        zzkq zzd = this.zzs.zzd();
        if (!this.zzG && (zzd == null || !zzd.zza.zzp())) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzlg zzlgVar = this.zzz;
        if (z10 != zzlgVar.zzg) {
            this.zzz = new zzlg(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzd, zzlgVar.zze, zzlgVar.zzf, z10, zzlgVar.zzh, zzlgVar.zzi, zzlgVar.zzj, zzlgVar.zzk, zzlgVar.zzl, zzlgVar.zzm, zzlgVar.zzn, zzlgVar.zzo, zzlgVar.zzq, zzlgVar.zzr, zzlgVar.zzs, zzlgVar.zzt, false);
        }
    }

    private final void zzaa(zzur zzurVar, zzwr zzwrVar, zzyk zzykVar) {
        zzbv zzbvVar = this.zzz.zza;
        zzyd[] zzydVarArr = zzykVar.zzc;
        this.zzh.zzf(this.zzv, zzbvVar, zzurVar, this.zzb, zzwrVar, zzydVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzab() throws com.google.android.gms.internal.ads.zzig {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzab():void");
    }

    private final void zzac(zzbv zzbvVar, zzur zzurVar, zzbv zzbvVar2, zzur zzurVar2, long j3, boolean z10) throws zzig {
        Object obj;
        zzbj zzbjVar;
        if (!zzak(zzbvVar, zzurVar)) {
            if (zzurVar.zzb()) {
                zzbjVar = zzbj.zza;
            } else {
                zzbjVar = this.zzz.zzo;
            }
            if (!this.zzp.zzc().equals(zzbjVar)) {
                zzT(zzbjVar);
                zzH(this.zzz.zzo, zzbjVar.zzb, false, false);
                return;
            }
            return;
        }
        zzbvVar.zze(zzbvVar.zzn(zzurVar.zza, this.zzn).zzc, this.zzm, 0L);
        zzia zziaVar = this.zzU;
        zzaq zzaqVar = this.zzm.zzj;
        int i10 = zzen.zza;
        zziaVar.zzd(zzaqVar);
        if (j3 != C.TIME_UNSET) {
            this.zzU.zze(zzs(zzbvVar, zzurVar.zza, j3));
            return;
        }
        Object obj2 = this.zzm.zzb;
        if (!zzbvVar2.zzo()) {
            obj = zzbvVar2.zze(zzbvVar2.zzn(zzurVar2.zza, this.zzn).zzc, this.zzm, 0L).zzb;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj2) && !z10) {
            return;
        }
        this.zzU.zze(C.TIME_UNSET);
    }

    private final void zzad(boolean z10, boolean z11) {
        this.zzE = z10;
        long j3 = C.TIME_UNSET;
        if (z10 && !z11) {
            j3 = SystemClock.elapsedRealtime();
        }
        this.zzF = j3;
    }

    private final synchronized void zzae(zzfxg zzfxgVar, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j3;
        boolean z10 = false;
        while (!Boolean.valueOf(((zzjw) zzfxgVar).zza.zzB).booleanValue() && j3 > 0) {
            try {
                wait(j3);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j3 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzaf() {
        zzkq zzd = this.zzs.zzd();
        if (zzd != null) {
            try {
                if (!zzd.zzd) {
                    zzd.zza.zzk();
                } else {
                    zzwg[] zzwgVarArr = zzd.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzwg zzwgVar = zzwgVarArr[i10];
                        if (zzwgVar != null) {
                            zzwgVar.zzd();
                        }
                    }
                }
                if (zzd.zzd() == Long.MIN_VALUE) {
                    return false;
                }
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static boolean zzag(zzln zzlnVar) {
        return zzlnVar.zzcV() != 0;
    }

    private final boolean zzah() {
        zzkq zze = this.zzs.zze();
        long j3 = zze.zzf.zze;
        if (!zze.zzd) {
            return false;
        }
        if (j3 == C.TIME_UNSET || this.zzz.zzs < j3) {
            return true;
        }
        if (zzaj()) {
            return false;
        }
        return true;
    }

    private static boolean zzai(zzlg zzlgVar, zzbt zzbtVar) {
        zzur zzurVar = zzlgVar.zzb;
        zzbv zzbvVar = zzlgVar.zza;
        if (!zzbvVar.zzo() && !zzbvVar.zzn(zzurVar.zza, zzbtVar).zzf) {
            return false;
        }
        return true;
    }

    private final boolean zzaj() {
        zzlg zzlgVar = this.zzz;
        return zzlgVar.zzl && zzlgVar.zzn == 0;
    }

    private final boolean zzak(zzbv zzbvVar, zzur zzurVar) {
        if (!zzurVar.zzb() && !zzbvVar.zzo()) {
            zzbvVar.zze(zzbvVar.zzn(zzurVar.zza, this.zzn).zzc, this.zzm, 0L);
            if (this.zzm.zzb()) {
                zzbu zzbuVar = this.zzm;
                if (zzbuVar.zzi && zzbuVar.zzf != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzad[] zzal(zzyd zzydVar) {
        int zzc = zzydVar != null ? zzydVar.zzc() : 0;
        zzad[] zzadVarArr = new zzad[zzc];
        for (int i10 = 0; i10 < zzc; i10++) {
            zzadVarArr[i10] = zzydVar.zzd(i10);
        }
        return zzadVarArr;
    }

    private static final void zzam(zzlj zzljVar) throws zzig {
        zzljVar.zzj();
        try {
            zzljVar.zzc().zzu(zzljVar.zza(), zzljVar.zzg());
        } finally {
            zzljVar.zzh(true);
        }
    }

    private static final void zzan(zzln zzlnVar) {
        if (zzlnVar.zzcV() == 2) {
            zzlnVar.zzP();
        }
    }

    private static final void zzao(zzln zzlnVar, long j3) {
        zzlnVar.zzK();
        if (!(zzlnVar instanceof zzwv)) {
            return;
        }
        throw null;
    }

    public static int zzb(zzbu zzbuVar, zzbt zzbtVar, int i10, boolean z10, Object obj, zzbv zzbvVar, zzbv zzbvVar2) {
        Object obj2 = zzbvVar.zze(zzbvVar.zzn(obj, zzbtVar).zzc, zzbuVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbvVar2.zzc(); i11++) {
            if (zzbvVar2.zze(i11, zzbuVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int zza2 = zzbvVar.zza(obj);
        int zzb = zzbvVar.zzb();
        int i12 = zza2;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            if (i13 >= zzb || i14 != -1) {
                break;
            }
            i12 = zzbvVar.zzi(i12, zzbtVar, zzbuVar, i10, z10);
            if (i12 == -1) {
                i14 = -1;
                break;
            }
            i14 = zzbvVar2.zza(zzbvVar.zzf(i12));
            i13++;
        }
        if (i14 == -1) {
            return -1;
        }
        return zzbvVar2.zzd(i14, zzbtVar, false).zzc;
    }

    public static /* synthetic */ zzkq zzd(zzkh zzkhVar, zzkr zzkrVar, long j3) {
        zzkl zzklVar = zzkhVar.zzh;
        zzyj zzyjVar = zzkhVar.zzf;
        zzys zzj = zzklVar.zzj();
        zzyk zzykVar = zzkhVar.zzg;
        return new zzkq(zzkhVar.zzd, j3, zzyjVar, zzj, zzkhVar.zzt, zzkrVar, zzykVar);
    }

    public static final /* synthetic */ void zzr(zzlj zzljVar) {
        try {
            zzam(zzljVar);
        } catch (zzig e2) {
            zzdt.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private final long zzs(zzbv zzbvVar, Object obj, long j3) {
        long elapsedRealtime;
        zzbvVar.zze(zzbvVar.zzn(obj, this.zzn).zzc, this.zzm, 0L);
        zzbu zzbuVar = this.zzm;
        if (zzbuVar.zzf != C.TIME_UNSET && zzbuVar.zzb()) {
            zzbu zzbuVar2 = this.zzm;
            if (zzbuVar2.zzi) {
                long j10 = zzbuVar2.zzg;
                if (j10 == C.TIME_UNSET) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j10 + SystemClock.elapsedRealtime();
                }
                return zzen.zzs(elapsedRealtime - this.zzm.zzf) - j3;
            }
        }
        return C.TIME_UNSET;
    }

    private final long zzt() {
        return zzu(this.zzz.zzq);
    }

    private final long zzu(long j3) {
        zzkq zzd = this.zzs.zzd();
        if (zzd == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.zzM - zzd.zze()));
    }

    private final long zzv(zzur zzurVar, long j3, boolean z10) throws zzig {
        boolean z11;
        zzkt zzktVar = this.zzs;
        if (zzktVar.zze() != zzktVar.zzf()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return zzw(zzurVar, j3, z11, z10);
    }

    private final long zzw(zzur zzurVar, long j3, boolean z10, boolean z11) throws zzig {
        zzY();
        zzad(false, true);
        if (z11 || this.zzz.zze == 3) {
            zzV(2);
        }
        zzkq zze = this.zzs.zze();
        zzkq zzkqVar = zze;
        while (zzkqVar != null && !zzurVar.equals(zzkqVar.zzf.zza)) {
            zzkqVar = zzkqVar.zzg();
        }
        if (z10 || zze != zzkqVar || (zzkqVar != null && zzkqVar.zze() + j3 < 0)) {
            int i10 = 0;
            while (true) {
                int length = this.zzb.length;
                if (i10 >= 2) {
                    break;
                }
                zzA(i10);
                i10++;
            }
            if (zzkqVar != null) {
                while (this.zzs.zze() != zzkqVar) {
                    this.zzs.zza();
                }
                this.zzs.zzq(zzkqVar);
                zzkqVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzkqVar != null) {
            this.zzs.zzq(zzkqVar);
            if (!zzkqVar.zzd) {
                zzkqVar.zzf = zzkqVar.zzf.zzb(j3);
            } else if (zzkqVar.zze) {
                j3 = zzkqVar.zza.zze(j3);
                zzkqVar.zza.zzj(j3 - this.zzo, false);
            }
            zzP(j3);
            zzI();
        } else {
            this.zzs.zzj();
            zzP(j3);
        }
        zzE(false);
        this.zzj.zzi(2);
        return j3;
    }

    private final Pair zzx(zzbv zzbvVar) {
        long j3 = 0;
        if (zzbvVar.zzo()) {
            return Pair.create(zzlg.zzh(), 0L);
        }
        Pair zzl = zzbvVar.zzl(this.zzm, this.zzn, zzbvVar.zzg(this.zzI), C.TIME_UNSET);
        zzur zzi = this.zzs.zzi(zzbvVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzi.zzb()) {
            zzbvVar.zzn(zzi.zza, this.zzn);
            if (zzi.zzc == this.zzn.zze(zzi.zzb)) {
                this.zzn.zzh();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(zzi, Long.valueOf(j3));
    }

    @Nullable
    private static Pair zzy(zzbv zzbvVar, zzkf zzkfVar, boolean z10, int i10, boolean z11, zzbu zzbuVar, zzbt zzbtVar) {
        zzbv zzbvVar2;
        Pair zzl;
        zzbv zzbvVar3 = zzkfVar.zza;
        if (zzbvVar.zzo()) {
            return null;
        }
        if (true == zzbvVar3.zzo()) {
            zzbvVar2 = zzbvVar;
        } else {
            zzbvVar2 = zzbvVar3;
        }
        try {
            zzl = zzbvVar2.zzl(zzbuVar, zzbtVar, zzkfVar.zzb, zzkfVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbvVar.equals(zzbvVar2)) {
            return zzl;
        }
        if (zzbvVar.zza(zzl.first) != -1) {
            if (zzbvVar2.zzn(zzl.first, zzbtVar).zzf && zzbvVar2.zze(zzbtVar.zzc, zzbuVar, 0L).zzn == zzbvVar2.zza(zzl.first)) {
                return zzbvVar.zzl(zzbuVar, zzbtVar, zzbvVar.zzn(zzl.first, zzbtVar).zzc, zzkfVar.zzc);
            }
            return zzl;
        }
        int zzb = zzb(zzbuVar, zzbtVar, i10, z11, zzl.first, zzbvVar2, zzbvVar);
        if (zzb != -1) {
            return zzbvVar.zzl(zzbuVar, zzbtVar, zzb, C.TIME_UNSET);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    @androidx.annotation.CheckResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzlg zzz(com.google.android.gms.internal.ads.zzur r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzz(com.google.android.gms.internal.ads.zzur, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzlg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:489:0x0846, code lost:
    
        if (zzah() != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x090a, code lost:
    
        if (r4 == false) goto L460;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:211:0x064b A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06c6 A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06e4 A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0726 A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x073a A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x07f2 A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x09b8 A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x09ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08eb A[Catch: RuntimeException -> 0x09f1, IOException -> 0x0a1b, zztr -> 0x0a23, zzge -> 0x0a2b, zzbh -> 0x0a33, zzri -> 0x0a4a, zzig -> 0x0a54, TryCatch #8 {zzbh -> 0x0a33, zzge -> 0x0a2b, zzig -> 0x0a54, zzri -> 0x0a4a, zztr -> 0x0a23, IOException -> 0x0a1b, RuntimeException -> 0x09f1, blocks: (B:3:0x0006, B:4:0x0013, B:8:0x0018, B:11:0x0034, B:16:0x0049, B:17:0x005a, B:18:0x0072, B:19:0x0077, B:20:0x007c, B:23:0x0083, B:25:0x008c, B:27:0x009a, B:29:0x00a2, B:30:0x00ad, B:31:0x00c1, B:32:0x00d9, B:33:0x00ef, B:35:0x00fe, B:36:0x0102, B:37:0x0113, B:39:0x0122, B:40:0x013e, B:41:0x0151, B:42:0x015a, B:44:0x016c, B:45:0x0178, B:46:0x0188, B:48:0x0194, B:51:0x019f, B:52:0x01a6, B:53:0x01b1, B:56:0x01b8, B:58:0x01c0, B:60:0x01c4, B:62:0x01ca, B:64:0x01d2, B:66:0x01da, B:68:0x01dd, B:73:0x01e2, B:82:0x01ef, B:84:0x01f0, B:87:0x01f7, B:89:0x0205, B:90:0x0208, B:92:0x020d, B:94:0x021d, B:95:0x0220, B:96:0x0225, B:97:0x022a, B:99:0x0236, B:100:0x0242, B:102:0x024e, B:104:0x027a, B:105:0x029a, B:552:0x02c2, B:554:0x02c6, B:555:0x02c9, B:564:0x02d4, B:106:0x02ea, B:107:0x02f0, B:108:0x02f7, B:109:0x0308, B:111:0x032f, B:118:0x0442, B:119:0x040f, B:143:0x040b, B:158:0x0450, B:159:0x045e, B:166:0x0351, B:169:0x0364, B:171:0x0374, B:173:0x038b, B:175:0x0394, B:182:0x045f, B:184:0x0474, B:187:0x047e, B:189:0x048d, B:191:0x0499, B:193:0x04ae, B:194:0x04b3, B:195:0x04b7, B:197:0x04bb, B:198:0x04c8, B:201:0x0624, B:203:0x062c, B:205:0x0634, B:208:0x0639, B:209:0x0645, B:211:0x064b, B:213:0x0653, B:218:0x0663, B:220:0x0669, B:222:0x0687, B:224:0x068d, B:217:0x0692, B:231:0x0697, B:233:0x069b, B:276:0x0752, B:235:0x06a4, B:237:0x06a8, B:239:0x06b0, B:241:0x06b6, B:243:0x06c0, B:246:0x06c6, B:247:0x06c9, B:249:0x06d2, B:251:0x06e4, B:253:0x06ed, B:255:0x06f5, B:258:0x06ff, B:260:0x0726, B:261:0x0729, B:262:0x0734, B:264:0x073a, B:266:0x0740, B:268:0x0747, B:282:0x04d7, B:284:0x04dd, B:287:0x04e3, B:290:0x04ee, B:292:0x04f3, B:295:0x0501, B:298:0x0507, B:300:0x050f, B:304:0x0512, B:306:0x051a, B:308:0x0528, B:310:0x0564, B:312:0x056e, B:315:0x0579, B:317:0x0581, B:319:0x0584, B:322:0x0587, B:324:0x058d, B:326:0x059c, B:328:0x05a2, B:330:0x05ae, B:332:0x05b8, B:334:0x05c9, B:338:0x05cf, B:337:0x05da, B:343:0x05df, B:345:0x05ea, B:348:0x05ef, B:350:0x05f5, B:352:0x05fd, B:354:0x0603, B:356:0x0609, B:360:0x0617, B:361:0x061e, B:363:0x0621, B:369:0x04c5, B:370:0x0756, B:375:0x0762, B:377:0x076a, B:378:0x076f, B:380:0x077b, B:381:0x0795, B:383:0x079b, B:385:0x07a3, B:387:0x07f5, B:388:0x07a8, B:390:0x07b1, B:393:0x07ba, B:397:0x07c9, B:402:0x07d6, B:404:0x07dc, B:408:0x07e6, B:413:0x07f2, B:422:0x07ff, B:424:0x0805, B:428:0x0812, B:430:0x081a, B:432:0x081e, B:433:0x0829, B:435:0x082f, B:436:0x0940, B:439:0x0948, B:441:0x094d, B:443:0x0955, B:445:0x0963, B:447:0x096a, B:451:0x096e, B:453:0x0974, B:455:0x097d, B:457:0x0983, B:459:0x098e, B:460:0x09b2, B:462:0x09b8, B:465:0x09c2, B:468:0x09da, B:474:0x09d3, B:476:0x09d7, B:478:0x0995, B:481:0x09a3, B:482:0x09aa, B:483:0x09ab, B:484:0x0837, B:486:0x083e, B:488:0x0842, B:491:0x08df, B:493:0x08eb, B:496:0x084f, B:498:0x0853, B:500:0x0867, B:501:0x0875, B:503:0x0881, B:506:0x088a, B:508:0x0894, B:513:0x089f, B:519:0x08f8, B:521:0x08ff, B:523:0x0903, B:526:0x090c, B:528:0x091c, B:530:0x0924, B:532:0x092e, B:534:0x0933, B:536:0x0938, B:537:0x093d, B:539:0x07f8, B:540:0x09df, B:543:0x09e6, B:567:0x02d6, B:569:0x02db, B:570:0x02de, B:574:0x02e5, B:579:0x02e9), top: B:2:0x0006 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r39) {
        /*
            Method dump skipped, instructions count: 2880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zza(zzbj zzbjVar) {
        this.zzj.zzc(16, zzbjVar).zza();
    }

    public final Looper zzc() {
        return this.zzl;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzB);
    }

    public final /* synthetic */ void zzf(int i10, boolean z10) {
        this.zzw.zzI(i10, this.zzb[i10].zzb(), z10);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        this.zzj.zzc(9, (zzup) zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public final void zzh() {
        this.zzj.zzf(2);
        this.zzj.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        this.zzj.zzc(8, zzupVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyi
    public final void zzj() {
        this.zzj.zzi(10);
    }

    public final void zzk() {
        this.zzj.zzb(29).zza();
    }

    public final void zzl(zzbv zzbvVar, int i10, long j3) {
        this.zzj.zzc(3, new zzkf(zzbvVar, i10, j3)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final synchronized void zzm(zzlj zzljVar) {
        if (!this.zzB && this.zzl.getThread().isAlive()) {
            this.zzj.zzc(14, zzljVar).zza();
            return;
        }
        zzdt.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzljVar.zzh(false);
    }

    public final void zzn(boolean z10, int i10, int i11) {
        this.zzj.zzd(1, z10 ? 1 : 0, i10 | (i11 << 4)).zza();
    }

    public final void zzo() {
        this.zzj.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzB && this.zzl.getThread().isAlive()) {
            this.zzj.zzi(7);
            zzae(new zzjw(this), this.zzu);
            return this.zzB;
        }
        return true;
    }

    public final void zzq(List list, int i10, long j3, zzwj zzwjVar) {
        this.zzj.zzc(17, new zzkb(list, zzwjVar, i10, j3, null)).zza();
    }
}
