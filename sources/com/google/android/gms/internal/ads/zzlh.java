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
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlh implements Handler.Callback, zzvl, zzzl, zzme, zzje, zzmh {
    private boolean zzA;
    private boolean zzC;
    private boolean zzF;
    private int zzG;

    @Nullable
    private zzlg zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;

    @Nullable
    private zzjh zzL;
    private final zzjs zzN;
    private final zzja zzO;
    private final zzmn[] zza;
    private final Set zzb;
    private final zzmp[] zzc;
    private final zzzm zzd;
    private final zzzn zze;
    private final zzlk zzf;
    private final zzzu zzg;
    private final zzfb zzh;

    @Nullable
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzdb zzk;
    private final zzcz zzl;
    private final long zzm;
    private final zzjf zzn;
    private final ArrayList zzo;
    private final zzer zzp;
    private final zzlt zzq;
    private final zzmf zzr;
    private final long zzs;
    private final zzpj zzt;
    private zzmr zzu;
    private zzmg zzv;
    private zzlf zzw;
    private boolean zzx;
    private boolean zzz;
    private int zzD = 0;
    private boolean zzE = false;
    private boolean zzy = false;
    private long zzM = C.TIME_UNSET;
    private long zzB = C.TIME_UNSET;

    public zzlh(zzmn[] zzmnVarArr, zzzm zzzmVar, zzzn zzznVar, zzlk zzlkVar, zzzu zzzuVar, int i9, boolean z8, zzmx zzmxVar, zzmr zzmrVar, zzja zzjaVar, long j7, boolean z9, Looper looper, zzer zzerVar, zzjs zzjsVar, zzpj zzpjVar, Looper looper2) {
        this.zzN = zzjsVar;
        this.zza = zzmnVarArr;
        this.zzd = zzzmVar;
        this.zze = zzznVar;
        this.zzf = zzlkVar;
        this.zzg = zzzuVar;
        this.zzu = zzmrVar;
        this.zzO = zzjaVar;
        this.zzs = j7;
        this.zzp = zzerVar;
        this.zzt = zzpjVar;
        this.zzm = zzlkVar.zzb(zzpjVar);
        zzlkVar.zzg(zzpjVar);
        zzmg zzg = zzmg.zzg(zzznVar);
        this.zzv = zzg;
        this.zzw = new zzlf(zzg);
        int length = zzmnVarArr.length;
        this.zzc = new zzmp[2];
        zzmo zze = zzzmVar.zze();
        for (int i10 = 0; i10 < 2; i10++) {
            zzmnVarArr[i10].zzu(i10, zzpjVar, zzerVar);
            this.zzc[i10] = zzmnVarArr[i10].zzl();
            this.zzc[i10].zzL(zze);
        }
        this.zzn = new zzjf(this, zzerVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzdb();
        this.zzl = new zzcz();
        zzzmVar.zzs(this, zzzuVar);
        this.zzK = true;
        zzfb zzb = zzerVar.zzb(looper, null);
        this.zzq = new zzlt(zzmxVar, zzb, new zzkz(this));
        this.zzr = new zzmf(this, zzmxVar, zzb, zzpjVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzj = looper3;
        this.zzh = zzerVar.zzb(looper3, this);
    }

    private final void zzA(zzmn zzmnVar) throws zzjh {
        if (!zzaf(zzmnVar)) {
            return;
        }
        this.zzn.zzd(zzmnVar);
        zzam(zzmnVar);
        zzmnVar.zzq();
        this.zzG--;
    }

    private final void zzB() throws zzjh {
        int length = this.zza.length;
        zzC(new boolean[2], this.zzq.zzf().zzf());
    }

    private final void zzC(boolean[] zArr, long j7) throws zzjh {
        boolean z8;
        boolean z9;
        boolean z10;
        zzlq zzf = this.zzq.zzf();
        zzzn zzi = zzf.zzi();
        int i9 = 0;
        while (true) {
            int length = this.zza.length;
            if (i9 >= 2) {
                break;
            }
            if (!zzi.zzb(i9) && this.zzb.remove(this.zza[i9])) {
                this.zza[i9].zzI();
            }
            i9++;
        }
        int i10 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i10 < 2) {
                if (zzi.zzb(i10)) {
                    boolean z11 = zArr[i10];
                    zzmn zzmnVar = this.zza[i10];
                    if (!zzaf(zzmnVar)) {
                        zzlt zzltVar = this.zzq;
                        zzlq zzf2 = zzltVar.zzf();
                        if (zzf2 == zzltVar.zze()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        zzzn zzi2 = zzf2.zzi();
                        zzmq zzmqVar = zzi2.zzb[i10];
                        zzan[] zzak = zzak(zzi2.zzc[i10]);
                        if (zzai() && this.zzv.zze == 3) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z11 && z9) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zzG++;
                        this.zzb.add(zzmnVar);
                        zzmnVar.zzr(zzmqVar, zzak, zzf2.zzc[i10], this.zzI, z10, z8, j7, zzf2.zze(), zzf2.zzf.zza);
                        zzmnVar.zzt(11, new zzla(this));
                        this.zzn.zze(zzmnVar);
                        if (z9 && z8) {
                            zzmnVar.zzO();
                        }
                    }
                }
                i10++;
            } else {
                zzf.zzg = true;
                return;
            }
        }
    }

    private final void zzD(IOException iOException, int i9) {
        zzlt zzltVar = this.zzq;
        zzjh zzc = zzjh.zzc(iOException, i9);
        zzlq zze = zzltVar.zze();
        if (zze != null) {
            zzc = zzc.zza(zze.zzf.zza);
        }
        zzfk.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzW(false, false);
        this.zzv = this.zzv.zzd(zzc);
    }

    private final void zzE(boolean z8) {
        zzvo zzvoVar;
        long zzc;
        zzlq zzd = this.zzq.zzd();
        if (zzd == null) {
            zzvoVar = this.zzv.zzb;
        } else {
            zzvoVar = zzd.zzf.zza;
        }
        boolean z9 = !this.zzv.zzk.equals(zzvoVar);
        if (z9) {
            this.zzv = this.zzv.zza(zzvoVar);
        }
        zzmg zzmgVar = this.zzv;
        if (zzd == null) {
            zzc = zzmgVar.zzr;
        } else {
            zzc = zzd.zzc();
        }
        zzmgVar.zzp = zzc;
        this.zzv.zzq = zzt();
        if ((z9 || z8) && zzd != null && zzd.zzd) {
            zzZ(zzd.zzf.zza, zzd.zzh(), zzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ab  */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77, types: [int] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.zzdc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzF(com.google.android.gms.internal.ads.zzdc r31, boolean r32) throws com.google.android.gms.internal.ads.zzjh {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlh.zzF(com.google.android.gms.internal.ads.zzdc, boolean):void");
    }

    private final void zzG(zzcl zzclVar, boolean z8) throws zzjh {
        zzH(zzclVar, zzclVar.zzc, true, z8);
    }

    private final void zzH(zzcl zzclVar, float f9, boolean z8, boolean z9) throws zzjh {
        int i9;
        zzlh zzlhVar = this;
        if (z8) {
            if (z9) {
                zzlhVar.zzw.zza(1);
            }
            zzmg zzmgVar = zzlhVar.zzv;
            zzlhVar = this;
            zzlhVar.zzv = new zzmg(zzmgVar.zza, zzmgVar.zzb, zzmgVar.zzc, zzmgVar.zzd, zzmgVar.zze, zzmgVar.zzf, zzmgVar.zzg, zzmgVar.zzh, zzmgVar.zzi, zzmgVar.zzj, zzmgVar.zzk, zzmgVar.zzl, zzmgVar.zzm, zzclVar, zzmgVar.zzp, zzmgVar.zzq, zzmgVar.zzr, zzmgVar.zzs, false);
        }
        float f10 = zzclVar.zzc;
        zzlq zze = zzlhVar.zzq.zze();
        while (true) {
            i9 = 0;
            if (zze == null) {
                break;
            }
            zzzg[] zzzgVarArr = zze.zzi().zzc;
            int length = zzzgVarArr.length;
            while (i9 < length) {
                zzzg zzzgVar = zzzgVarArr[i9];
                i9++;
            }
            zze = zze.zzg();
        }
        zzmn[] zzmnVarArr = zzlhVar.zza;
        int length2 = zzmnVarArr.length;
        while (i9 < 2) {
            zzmn zzmnVar = zzmnVarArr[i9];
            if (zzmnVar != null) {
                zzmnVar.zzM(f9, zzclVar.zzc);
            }
            i9++;
        }
    }

    private final void zzI() {
        long zze;
        long j7;
        boolean z8 = false;
        if (zzae()) {
            zzlq zzd = this.zzq.zzd();
            long zzu = zzu(zzd.zzd());
            if (zzd == this.zzq.zze()) {
                zze = this.zzI;
                j7 = zzd.zze();
            } else {
                zze = this.zzI - zzd.zze();
                j7 = zzd.zzf.zzb;
            }
            long j9 = zze - j7;
            boolean zzh = this.zzf.zzh(this.zzt, this.zzv.zza, zzd.zzf.zza, j9, zzu, this.zzn.zzc().zzc);
            if (!zzh && zzu < 500000 && this.zzm > 0) {
                this.zzq.zze().zza.zzj(this.zzv.zzr, false);
                z8 = this.zzf.zzh(this.zzt, this.zzv.zza, zzd.zzf.zza, j9, zzu, this.zzn.zzc().zzc);
            } else {
                z8 = zzh;
            }
        }
        this.zzC = z8;
        if (z8) {
            this.zzq.zzd().zzk(this.zzI, this.zzn.zzc().zzc, this.zzB);
        }
        zzY();
    }

    private final void zzJ() {
        boolean z8;
        this.zzw.zzc(this.zzv);
        z8 = this.zzw.zzg;
        if (z8) {
            zzjs zzjsVar = this.zzN;
            zzjsVar.zza.zzT(this.zzw);
            this.zzw = new zzlf(this.zzv);
        }
    }

    private final void zzK() throws zzjh {
        zzzn zzznVar;
        int i9;
        boolean z8;
        float f9 = this.zzn.zzc().zzc;
        zzlt zzltVar = this.zzq;
        zzlq zze = zzltVar.zze();
        zzlq zzf = zzltVar.zzf();
        zzzn zzznVar2 = null;
        boolean z9 = true;
        while (zze != null && zze.zzd) {
            zzzn zzj = zze.zzj(f9, this.zzv.zza);
            if (zze == this.zzq.zze()) {
                zzznVar = zzj;
            } else {
                zzznVar = zzznVar2;
            }
            zzzn zzi = zze.zzi();
            boolean z10 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i10 = 0; i10 < zzj.zzc.length; i10++) {
                        if (zzj.zza(zzi, i10)) {
                        }
                    }
                    if (zze != zzf) {
                        z10 = true;
                    }
                    z9 &= z10;
                    zze = zze.zzg();
                    zzznVar2 = zzznVar;
                }
            }
            if (z9) {
                zzlt zzltVar2 = this.zzq;
                zzlq zze2 = zzltVar2.zze();
                boolean zzn = zzltVar2.zzn(zze2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                zzznVar.getClass();
                long zzb = zze2.zzb(zzznVar, this.zzv.zzr, zzn, zArr);
                zzmg zzmgVar = this.zzv;
                if (zzmgVar.zze != 4 && zzb != zzmgVar.zzr) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzmg zzmgVar2 = this.zzv;
                i9 = 2;
                this.zzv = zzz(zzmgVar2.zzb, zzb, zzmgVar2.zzc, zzmgVar2.zzd, z8, 5);
                if (z8) {
                    zzO(zzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i11 = 0;
                while (true) {
                    zzmn[] zzmnVarArr = this.zza;
                    int length3 = zzmnVarArr.length;
                    if (i11 >= 2) {
                        break;
                    }
                    zzmn zzmnVar = zzmnVarArr[i11];
                    boolean zzaf = zzaf(zzmnVar);
                    zArr2[i11] = zzaf;
                    zzxf zzxfVar = zze2.zzc[i11];
                    if (zzaf) {
                        if (zzxfVar != zzmnVar.zzo()) {
                            zzA(zzmnVar);
                        } else if (zArr[i11]) {
                            zzmnVar.zzJ(this.zzI);
                        }
                    }
                    i11++;
                }
                zzC(zArr2, this.zzI);
            } else {
                i9 = 2;
                this.zzq.zzn(zze);
                if (zze.zzd) {
                    zze.zza(zzj, Math.max(zze.zzf.zzb, this.zzI - zze.zze()), false);
                }
            }
            zzE(true);
            if (this.zzv.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i9);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zzjh {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzM(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlh.zzM(boolean, boolean, boolean, boolean):void");
    }

    private final void zzN() {
        zzlq zze = this.zzq.zze();
        boolean z8 = false;
        if (zze != null && zze.zzf.zzh && this.zzy) {
            z8 = true;
        }
        this.zzz = z8;
    }

    private final void zzO(long j7) throws zzjh {
        long zze;
        zzlq zze2 = this.zzq.zze();
        if (zze2 == null) {
            zze = 1000000000000L;
        } else {
            zze = zze2.zze();
        }
        long j9 = j7 + zze;
        this.zzI = j9;
        this.zzn.zzf(j9);
        zzmn[] zzmnVarArr = this.zza;
        int length = zzmnVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            zzmn zzmnVar = zzmnVarArr[i9];
            if (zzaf(zzmnVar)) {
                zzmnVar.zzJ(this.zzI);
            }
        }
        for (zzlq zze3 = this.zzq.zze(); zze3 != null; zze3 = zze3.zzg()) {
            for (zzzg zzzgVar : zze3.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzdc zzdcVar, zzdc zzdcVar2) {
        if (zzdcVar.zzo() && zzdcVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
        } else {
            Object obj = ((zzle) this.zzo.get(size)).zzb;
            int i9 = zzgd.zza;
            throw null;
        }
    }

    private final void zzQ(long j7, long j9) {
        this.zzh.zzj(2, j7 + j9);
    }

    private final void zzR(boolean z8) throws zzjh {
        zzvo zzvoVar = this.zzq.zze().zzf.zza;
        long zzw = zzw(zzvoVar, this.zzv.zzr, true, false);
        if (zzw != this.zzv.zzr) {
            zzmg zzmgVar = this.zzv;
            this.zzv = zzz(zzvoVar, zzw, zzmgVar.zzc, zzmgVar.zzd, z8, 5);
        }
    }

    private final void zzS(zzcl zzclVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzclVar);
    }

    private final void zzT(boolean z8, int i9, boolean z9, int i10) throws zzjh {
        this.zzw.zza(z9 ? 1 : 0);
        this.zzw.zzb(i10);
        this.zzv = this.zzv.zzc(z8, i9);
        zzac(false, false);
        for (zzlq zze = this.zzq.zze(); zze != null; zze = zze.zzg()) {
            for (zzzg zzzgVar : zze.zzi().zzc) {
            }
        }
        if (!zzai()) {
            zzX();
            zzaa();
            return;
        }
        int i11 = this.zzv.zze;
        if (i11 == 3) {
            zzac(false, false);
            this.zzn.zzh();
            zzV();
            this.zzh.zzi(2);
            return;
        }
        if (i11 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i9) {
        zzmg zzmgVar = this.zzv;
        if (zzmgVar.zze != i9) {
            if (i9 != 2) {
                this.zzM = C.TIME_UNSET;
            }
            this.zzv = zzmgVar.zze(i9);
        }
    }

    private final void zzV() throws zzjh {
        zzlq zze = this.zzq.zze();
        if (zze != null) {
            zzzn zzi = zze.zzi();
            int i9 = 0;
            while (true) {
                int length = this.zza.length;
                if (i9 < 2) {
                    if (zzi.zzb(i9) && this.zza[i9].zzcU() == 1) {
                        this.zza[i9].zzO();
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzW(boolean z8, boolean z9) {
        boolean z10;
        if (z8 || !this.zzF) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzM(z10, false, true, false);
        this.zzw.zza(z9 ? 1 : 0);
        this.zzf.zze(this.zzt);
        zzU(1);
    }

    private final void zzX() throws zzjh {
        this.zzn.zzi();
        zzmn[] zzmnVarArr = this.zza;
        int length = zzmnVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            zzmn zzmnVar = zzmnVarArr[i9];
            if (zzaf(zzmnVar)) {
                zzam(zzmnVar);
            }
        }
    }

    private final void zzY() {
        boolean z8;
        zzlq zzd = this.zzq.zzd();
        if (this.zzC || (zzd != null && zzd.zza.zzp())) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzmg zzmgVar = this.zzv;
        if (z8 != zzmgVar.zzg) {
            this.zzv = new zzmg(zzmgVar.zza, zzmgVar.zzb, zzmgVar.zzc, zzmgVar.zzd, zzmgVar.zze, zzmgVar.zzf, z8, zzmgVar.zzh, zzmgVar.zzi, zzmgVar.zzj, zzmgVar.zzk, zzmgVar.zzl, zzmgVar.zzm, zzmgVar.zzn, zzmgVar.zzp, zzmgVar.zzq, zzmgVar.zzr, zzmgVar.zzs, false);
        }
    }

    private final void zzZ(zzvo zzvoVar, zzxr zzxrVar, zzzn zzznVar) {
        zzdc zzdcVar = this.zzv.zza;
        zzzg[] zzzgVarArr = zzznVar.zzc;
        this.zzf.zzf(this.zzt, zzdcVar, zzvoVar, this.zza, zzxrVar, zzzgVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaa() throws com.google.android.gms.internal.ads.zzjh {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlh.zzaa():void");
    }

    private final void zzab(zzdc zzdcVar, zzvo zzvoVar, zzdc zzdcVar2, zzvo zzvoVar2, long j7, boolean z8) throws zzjh {
        Object obj;
        zzcl zzclVar;
        if (!zzaj(zzdcVar, zzvoVar)) {
            if (zzvoVar.zzb()) {
                zzclVar = zzcl.zza;
            } else {
                zzclVar = this.zzv.zzn;
            }
            if (!this.zzn.zzc().equals(zzclVar)) {
                zzS(zzclVar);
                zzH(this.zzv.zzn, zzclVar.zzc, false, false);
                return;
            }
            return;
        }
        zzdcVar.zze(zzdcVar.zzn(zzvoVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzja zzjaVar = this.zzO;
        zzbk zzbkVar = this.zzk.zzl;
        int i9 = zzgd.zza;
        zzjaVar.zzd(zzbkVar);
        if (j7 != C.TIME_UNSET) {
            this.zzO.zze(zzs(zzdcVar, zzvoVar.zza, j7));
            return;
        }
        Object obj2 = this.zzk.zzc;
        if (!zzdcVar2.zzo()) {
            obj = zzdcVar2.zze(zzdcVar2.zzn(zzvoVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc;
        } else {
            obj = null;
        }
        if (zzgd.zzG(obj, obj2) && !z8) {
            return;
        }
        this.zzO.zze(C.TIME_UNSET);
    }

    private final void zzac(boolean z8, boolean z9) {
        long elapsedRealtime;
        this.zzA = z8;
        if (z9) {
            elapsedRealtime = C.TIME_UNSET;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzB = elapsedRealtime;
    }

    private final synchronized void zzad(zzfyw zzfywVar, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
        boolean z8 = false;
        while (!((zzkx) zzfywVar).zza.zzx && j7 > 0) {
            try {
                wait(j7);
            } catch (InterruptedException unused) {
                z8 = true;
            }
            j7 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzae() {
        zzlq zzd = this.zzq.zzd();
        if (zzd == null || zzd.zzd() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private static boolean zzaf(zzmn zzmnVar) {
        if (zzmnVar.zzcU() != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzag() {
        zzlq zze = this.zzq.zze();
        long j7 = zze.zzf.zze;
        if (!zze.zzd) {
            return false;
        }
        if (j7 == C.TIME_UNSET || this.zzv.zzr < j7) {
            return true;
        }
        if (zzai()) {
            return false;
        }
        return true;
    }

    private static boolean zzah(zzmg zzmgVar, zzcz zzczVar) {
        zzvo zzvoVar = zzmgVar.zzb;
        zzdc zzdcVar = zzmgVar.zza;
        if (!zzdcVar.zzo() && !zzdcVar.zzn(zzvoVar.zza, zzczVar).zzg) {
            return false;
        }
        return true;
    }

    private final boolean zzai() {
        zzmg zzmgVar = this.zzv;
        if (zzmgVar.zzl && zzmgVar.zzm == 0) {
            return true;
        }
        return false;
    }

    private final boolean zzaj(zzdc zzdcVar, zzvo zzvoVar) {
        if (!zzvoVar.zzb() && !zzdcVar.zzo()) {
            zzdcVar.zze(zzdcVar.zzn(zzvoVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzdb zzdbVar = this.zzk;
                if (zzdbVar.zzj && zzdbVar.zzg != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzan[] zzak(zzzg zzzgVar) {
        int i9;
        if (zzzgVar != null) {
            i9 = zzzgVar.zzc();
        } else {
            i9 = 0;
        }
        zzan[] zzanVarArr = new zzan[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            zzanVarArr[i10] = zzzgVar.zzd(i10);
        }
        return zzanVarArr;
    }

    private static final void zzal(zzmj zzmjVar) throws zzjh {
        zzmjVar.zzj();
        try {
            zzmjVar.zzc().zzt(zzmjVar.zza(), zzmjVar.zzg());
        } finally {
            zzmjVar.zzh(true);
        }
    }

    private static final void zzam(zzmn zzmnVar) {
        if (zzmnVar.zzcU() == 2) {
            zzmnVar.zzP();
        }
    }

    private static final void zzan(zzmn zzmnVar, long j7) {
        zzmnVar.zzK();
        if (!(zzmnVar instanceof zzxv)) {
            return;
        }
        throw null;
    }

    public static /* synthetic */ zzlq zzd(zzlh zzlhVar, zzlr zzlrVar, long j7) {
        zzlk zzlkVar = zzlhVar.zzf;
        zzzm zzzmVar = zzlhVar.zzd;
        zzzv zzj = zzlkVar.zzj();
        zzzn zzznVar = zzlhVar.zze;
        return new zzlq(zzlhVar.zzc, j7, zzzmVar, zzj, zzlhVar.zzr, zzlrVar, zzznVar);
    }

    @Nullable
    public static Object zzf(zzdb zzdbVar, zzcz zzczVar, int i9, boolean z8, Object obj, zzdc zzdcVar, zzdc zzdcVar2) {
        int zza = zzdcVar.zza(obj);
        int zzb = zzdcVar.zzb();
        int i10 = 0;
        int i11 = zza;
        int i12 = -1;
        while (true) {
            if (i10 >= zzb || i12 != -1) {
                break;
            }
            i11 = zzdcVar.zzi(i11, zzczVar, zzdbVar, i9, z8);
            if (i11 == -1) {
                i12 = -1;
                break;
            }
            i12 = zzdcVar2.zza(zzdcVar.zzf(i11));
            i10++;
        }
        if (i12 == -1) {
            return null;
        }
        return zzdcVar2.zzf(i12);
    }

    public static final /* synthetic */ void zzr(zzmj zzmjVar) {
        try {
            zzal(zzmjVar);
        } catch (zzjh e4) {
            zzfk.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
            throw new RuntimeException(e4);
        }
    }

    private final long zzs(zzdc zzdcVar, Object obj, long j7) {
        long elapsedRealtime;
        zzdcVar.zze(zzdcVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzdb zzdbVar = this.zzk;
        if (zzdbVar.zzg != C.TIME_UNSET && zzdbVar.zzb()) {
            zzdb zzdbVar2 = this.zzk;
            if (zzdbVar2.zzj) {
                long j9 = zzdbVar2.zzh;
                if (j9 == C.TIME_UNSET) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j9 + SystemClock.elapsedRealtime();
                }
                return zzgd.zzr(elapsedRealtime - this.zzk.zzg) - j7;
            }
        }
        return C.TIME_UNSET;
    }

    private final long zzt() {
        return zzu(this.zzv.zzp);
    }

    private final long zzu(long j7) {
        zzlq zzd = this.zzq.zzd();
        if (zzd == null) {
            return 0L;
        }
        return Math.max(0L, j7 - (this.zzI - zzd.zze()));
    }

    private final long zzv(zzvo zzvoVar, long j7, boolean z8) throws zzjh {
        boolean z9;
        zzlt zzltVar = this.zzq;
        if (zzltVar.zze() != zzltVar.zzf()) {
            z9 = true;
        } else {
            z9 = false;
        }
        return zzw(zzvoVar, j7, z9, z8);
    }

    private final long zzw(zzvo zzvoVar, long j7, boolean z8, boolean z9) throws zzjh {
        zzX();
        zzac(false, true);
        if (z9 || this.zzv.zze == 3) {
            zzU(2);
        }
        zzlq zze = this.zzq.zze();
        zzlq zzlqVar = zze;
        while (zzlqVar != null && !zzvoVar.equals(zzlqVar.zzf.zza)) {
            zzlqVar = zzlqVar.zzg();
        }
        if (z8 || zze != zzlqVar || (zzlqVar != null && zzlqVar.zze() + j7 < 0)) {
            zzmn[] zzmnVarArr = this.zza;
            int length = zzmnVarArr.length;
            for (int i9 = 0; i9 < 2; i9++) {
                zzA(zzmnVarArr[i9]);
            }
            if (zzlqVar != null) {
                while (this.zzq.zze() != zzlqVar) {
                    this.zzq.zza();
                }
                this.zzq.zzn(zzlqVar);
                zzlqVar.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzlqVar != null) {
            this.zzq.zzn(zzlqVar);
            if (!zzlqVar.zzd) {
                zzlqVar.zzf = zzlqVar.zzf.zzb(j7);
            } else if (zzlqVar.zze) {
                j7 = zzlqVar.zza.zze(j7);
                zzlqVar.zza.zzj(j7 - this.zzm, false);
            }
            zzO(j7);
            zzI();
        } else {
            this.zzq.zzj();
            zzO(j7);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j7;
    }

    private final Pair zzx(zzdc zzdcVar) {
        long j7 = 0;
        if (zzdcVar.zzo()) {
            return Pair.create(zzmg.zzh(), 0L);
        }
        Pair zzl = zzdcVar.zzl(this.zzk, this.zzl, zzdcVar.zzg(this.zzE), C.TIME_UNSET);
        zzvo zzi = this.zzq.zzi(zzdcVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzi.zzb()) {
            zzdcVar.zzn(zzi.zza, this.zzl);
            if (zzi.zzc == this.zzl.zze(zzi.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j7 = longValue;
        }
        return Pair.create(zzi, Long.valueOf(j7));
    }

    @Nullable
    private static Pair zzy(zzdc zzdcVar, zzlg zzlgVar, boolean z8, int i9, boolean z9, zzdb zzdbVar, zzcz zzczVar) {
        zzdc zzdcVar2;
        Pair zzl;
        zzdc zzdcVar3 = zzlgVar.zza;
        if (zzdcVar.zzo()) {
            return null;
        }
        if (true == zzdcVar3.zzo()) {
            zzdcVar2 = zzdcVar;
        } else {
            zzdcVar2 = zzdcVar3;
        }
        try {
            zzl = zzdcVar2.zzl(zzdbVar, zzczVar, zzlgVar.zzb, zzlgVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzdcVar.equals(zzdcVar2)) {
            return zzl;
        }
        if (zzdcVar.zza(zzl.first) != -1) {
            if (zzdcVar2.zzn(zzl.first, zzczVar).zzg && zzdcVar2.zze(zzczVar.zzd, zzdbVar, 0L).zzp == zzdcVar2.zza(zzl.first)) {
                return zzdcVar.zzl(zzdbVar, zzczVar, zzdcVar.zzn(zzl.first, zzczVar).zzd, zzlgVar.zzc);
            }
            return zzl;
        }
        Object zzf = zzf(zzdbVar, zzczVar, i9, z9, zzl.first, zzdcVar2, zzdcVar);
        if (zzf != null) {
            return zzdcVar.zzl(zzdbVar, zzczVar, zzdcVar.zzn(zzf, zzczVar).zzd, C.TIME_UNSET);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    @androidx.annotation.CheckResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzmg zzz(com.google.android.gms.internal.ads.zzvo r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlh.zzz(com.google.android.gms.internal.ads.zzvo, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzmg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:419:0x089b, code lost:
    
        if (r35.zzf.zzi(r35.zzt, r35.zzv.zza, r3.zzf.zza, zzt(), r35.zzn.zzc().zzc, r35.zzA, r33) == false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x08c7, code lost:
    
        if (r4 == false) goto L470;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x062a A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zzup -> 0x0036, zzhc -> 0x003a, zzch -> 0x003e, zzsm -> 0x0042, zzjh -> 0x0046, TryCatch #10 {zzch -> 0x003e, zzhc -> 0x003a, zzjh -> 0x0046, zzsm -> 0x0042, zzup -> 0x0036, IOException -> 0x0032, RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00c1, B:28:0x00d0, B:29:0x00d4, B:30:0x00e5, B:32:0x00f4, B:33:0x0110, B:34:0x0123, B:35:0x012c, B:37:0x013e, B:38:0x014a, B:39:0x015a, B:41:0x0166, B:44:0x0171, B:45:0x0178, B:46:0x0185, B:49:0x018c, B:51:0x0194, B:53:0x0198, B:55:0x019e, B:57:0x01a6, B:59:0x01ae, B:61:0x01b1, B:66:0x01b6, B:75:0x01c3, B:77:0x01c4, B:80:0x01cb, B:82:0x01d9, B:83:0x01dc, B:85:0x01e1, B:87:0x01f1, B:88:0x01f4, B:89:0x01f9, B:90:0x01fe, B:92:0x020a, B:93:0x0216, B:95:0x0222, B:97:0x024e, B:98:0x026e, B:556:0x029a, B:558:0x029e, B:559:0x02a1, B:568:0x02ac, B:99:0x02c0, B:100:0x02c5, B:101:0x02cd, B:102:0x02df, B:104:0x0306, B:112:0x0424, B:113:0x03ea, B:140:0x03e6, B:155:0x0430, B:156:0x043d, B:169:0x0328, B:172:0x033b, B:174:0x034b, B:176:0x0362, B:178:0x036c, B:185:0x043e, B:187:0x0452, B:189:0x045d, B:191:0x046c, B:193:0x0478, B:195:0x048d, B:196:0x0492, B:197:0x0496, B:199:0x049a, B:200:0x04a7, B:203:0x0603, B:205:0x060b, B:207:0x0613, B:210:0x0618, B:211:0x0624, B:213:0x062a, B:215:0x0632, B:220:0x0642, B:222:0x0648, B:224:0x0668, B:226:0x066e, B:219:0x0673, B:233:0x0678, B:235:0x067c, B:237:0x0682, B:239:0x0686, B:241:0x068e, B:243:0x0694, B:245:0x069e, B:248:0x06a4, B:249:0x06a7, B:251:0x06b0, B:253:0x06c2, B:255:0x06cb, B:257:0x06d3, B:260:0x06df, B:262:0x0707, B:263:0x070a, B:264:0x0715, B:266:0x071b, B:268:0x0721, B:270:0x0728, B:278:0x0735, B:282:0x0740, B:284:0x074a, B:285:0x074f, B:287:0x075b, B:288:0x0773, B:290:0x0779, B:292:0x0781, B:294:0x0788, B:297:0x0791, B:301:0x07a0, B:306:0x07ad, B:308:0x07b3, B:315:0x07c5, B:317:0x07c8, B:326:0x07d2, B:328:0x07d8, B:332:0x07e5, B:334:0x07ed, B:336:0x07f1, B:337:0x07fc, B:339:0x0802, B:340:0x08fd, B:343:0x0905, B:345:0x090a, B:347:0x0912, B:349:0x0920, B:351:0x0927, B:355:0x092b, B:357:0x0931, B:359:0x093a, B:361:0x0940, B:363:0x094b, B:364:0x096f, B:366:0x0975, B:369:0x097e, B:372:0x099e, B:377:0x0991, B:379:0x0995, B:381:0x099b, B:383:0x0952, B:386:0x0960, B:387:0x0967, B:388:0x0968, B:389:0x080a, B:391:0x0811, B:393:0x0815, B:396:0x089d, B:398:0x08a9, B:401:0x0821, B:403:0x0825, B:405:0x0839, B:406:0x0847, B:408:0x0853, B:411:0x085c, B:413:0x0866, B:418:0x0871, B:423:0x08b6, B:425:0x08bc, B:427:0x08c0, B:430:0x08c9, B:432:0x08d9, B:434:0x08e1, B:436:0x08eb, B:438:0x08f0, B:440:0x08f5, B:441:0x08fa, B:443:0x07cb, B:450:0x04b6, B:452:0x04bc, B:454:0x04c7, B:457:0x04d2, B:459:0x04d7, B:462:0x04e5, B:465:0x04eb, B:467:0x04f3, B:471:0x04f6, B:473:0x04fe, B:475:0x050c, B:477:0x0548, B:479:0x0552, B:482:0x055d, B:484:0x0565, B:486:0x0568, B:489:0x056b, B:491:0x0571, B:493:0x0580, B:495:0x0586, B:497:0x0592, B:499:0x059c, B:501:0x05ad, B:505:0x05b3, B:504:0x05be, B:511:0x05c3, B:513:0x05c9, B:516:0x05ce, B:518:0x05d4, B:520:0x05dc, B:522:0x05e2, B:524:0x05e8, B:528:0x05f6, B:529:0x05fd, B:531:0x0600, B:537:0x04a4, B:539:0x09a6, B:542:0x09ad, B:544:0x09b5, B:547:0x09d5, B:572:0x02ad, B:574:0x02b1, B:575:0x02b4, B:579:0x02bb, B:584:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06a4 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zzup -> 0x0036, zzhc -> 0x003a, zzch -> 0x003e, zzsm -> 0x0042, zzjh -> 0x0046, TryCatch #10 {zzch -> 0x003e, zzhc -> 0x003a, zzjh -> 0x0046, zzsm -> 0x0042, zzup -> 0x0036, IOException -> 0x0032, RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00c1, B:28:0x00d0, B:29:0x00d4, B:30:0x00e5, B:32:0x00f4, B:33:0x0110, B:34:0x0123, B:35:0x012c, B:37:0x013e, B:38:0x014a, B:39:0x015a, B:41:0x0166, B:44:0x0171, B:45:0x0178, B:46:0x0185, B:49:0x018c, B:51:0x0194, B:53:0x0198, B:55:0x019e, B:57:0x01a6, B:59:0x01ae, B:61:0x01b1, B:66:0x01b6, B:75:0x01c3, B:77:0x01c4, B:80:0x01cb, B:82:0x01d9, B:83:0x01dc, B:85:0x01e1, B:87:0x01f1, B:88:0x01f4, B:89:0x01f9, B:90:0x01fe, B:92:0x020a, B:93:0x0216, B:95:0x0222, B:97:0x024e, B:98:0x026e, B:556:0x029a, B:558:0x029e, B:559:0x02a1, B:568:0x02ac, B:99:0x02c0, B:100:0x02c5, B:101:0x02cd, B:102:0x02df, B:104:0x0306, B:112:0x0424, B:113:0x03ea, B:140:0x03e6, B:155:0x0430, B:156:0x043d, B:169:0x0328, B:172:0x033b, B:174:0x034b, B:176:0x0362, B:178:0x036c, B:185:0x043e, B:187:0x0452, B:189:0x045d, B:191:0x046c, B:193:0x0478, B:195:0x048d, B:196:0x0492, B:197:0x0496, B:199:0x049a, B:200:0x04a7, B:203:0x0603, B:205:0x060b, B:207:0x0613, B:210:0x0618, B:211:0x0624, B:213:0x062a, B:215:0x0632, B:220:0x0642, B:222:0x0648, B:224:0x0668, B:226:0x066e, B:219:0x0673, B:233:0x0678, B:235:0x067c, B:237:0x0682, B:239:0x0686, B:241:0x068e, B:243:0x0694, B:245:0x069e, B:248:0x06a4, B:249:0x06a7, B:251:0x06b0, B:253:0x06c2, B:255:0x06cb, B:257:0x06d3, B:260:0x06df, B:262:0x0707, B:263:0x070a, B:264:0x0715, B:266:0x071b, B:268:0x0721, B:270:0x0728, B:278:0x0735, B:282:0x0740, B:284:0x074a, B:285:0x074f, B:287:0x075b, B:288:0x0773, B:290:0x0779, B:292:0x0781, B:294:0x0788, B:297:0x0791, B:301:0x07a0, B:306:0x07ad, B:308:0x07b3, B:315:0x07c5, B:317:0x07c8, B:326:0x07d2, B:328:0x07d8, B:332:0x07e5, B:334:0x07ed, B:336:0x07f1, B:337:0x07fc, B:339:0x0802, B:340:0x08fd, B:343:0x0905, B:345:0x090a, B:347:0x0912, B:349:0x0920, B:351:0x0927, B:355:0x092b, B:357:0x0931, B:359:0x093a, B:361:0x0940, B:363:0x094b, B:364:0x096f, B:366:0x0975, B:369:0x097e, B:372:0x099e, B:377:0x0991, B:379:0x0995, B:381:0x099b, B:383:0x0952, B:386:0x0960, B:387:0x0967, B:388:0x0968, B:389:0x080a, B:391:0x0811, B:393:0x0815, B:396:0x089d, B:398:0x08a9, B:401:0x0821, B:403:0x0825, B:405:0x0839, B:406:0x0847, B:408:0x0853, B:411:0x085c, B:413:0x0866, B:418:0x0871, B:423:0x08b6, B:425:0x08bc, B:427:0x08c0, B:430:0x08c9, B:432:0x08d9, B:434:0x08e1, B:436:0x08eb, B:438:0x08f0, B:440:0x08f5, B:441:0x08fa, B:443:0x07cb, B:450:0x04b6, B:452:0x04bc, B:454:0x04c7, B:457:0x04d2, B:459:0x04d7, B:462:0x04e5, B:465:0x04eb, B:467:0x04f3, B:471:0x04f6, B:473:0x04fe, B:475:0x050c, B:477:0x0548, B:479:0x0552, B:482:0x055d, B:484:0x0565, B:486:0x0568, B:489:0x056b, B:491:0x0571, B:493:0x0580, B:495:0x0586, B:497:0x0592, B:499:0x059c, B:501:0x05ad, B:505:0x05b3, B:504:0x05be, B:511:0x05c3, B:513:0x05c9, B:516:0x05ce, B:518:0x05d4, B:520:0x05dc, B:522:0x05e2, B:524:0x05e8, B:528:0x05f6, B:529:0x05fd, B:531:0x0600, B:537:0x04a4, B:539:0x09a6, B:542:0x09ad, B:544:0x09b5, B:547:0x09d5, B:572:0x02ad, B:574:0x02b1, B:575:0x02b4, B:579:0x02bb, B:584:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06c2 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zzup -> 0x0036, zzhc -> 0x003a, zzch -> 0x003e, zzsm -> 0x0042, zzjh -> 0x0046, TryCatch #10 {zzch -> 0x003e, zzhc -> 0x003a, zzjh -> 0x0046, zzsm -> 0x0042, zzup -> 0x0036, IOException -> 0x0032, RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00c1, B:28:0x00d0, B:29:0x00d4, B:30:0x00e5, B:32:0x00f4, B:33:0x0110, B:34:0x0123, B:35:0x012c, B:37:0x013e, B:38:0x014a, B:39:0x015a, B:41:0x0166, B:44:0x0171, B:45:0x0178, B:46:0x0185, B:49:0x018c, B:51:0x0194, B:53:0x0198, B:55:0x019e, B:57:0x01a6, B:59:0x01ae, B:61:0x01b1, B:66:0x01b6, B:75:0x01c3, B:77:0x01c4, B:80:0x01cb, B:82:0x01d9, B:83:0x01dc, B:85:0x01e1, B:87:0x01f1, B:88:0x01f4, B:89:0x01f9, B:90:0x01fe, B:92:0x020a, B:93:0x0216, B:95:0x0222, B:97:0x024e, B:98:0x026e, B:556:0x029a, B:558:0x029e, B:559:0x02a1, B:568:0x02ac, B:99:0x02c0, B:100:0x02c5, B:101:0x02cd, B:102:0x02df, B:104:0x0306, B:112:0x0424, B:113:0x03ea, B:140:0x03e6, B:155:0x0430, B:156:0x043d, B:169:0x0328, B:172:0x033b, B:174:0x034b, B:176:0x0362, B:178:0x036c, B:185:0x043e, B:187:0x0452, B:189:0x045d, B:191:0x046c, B:193:0x0478, B:195:0x048d, B:196:0x0492, B:197:0x0496, B:199:0x049a, B:200:0x04a7, B:203:0x0603, B:205:0x060b, B:207:0x0613, B:210:0x0618, B:211:0x0624, B:213:0x062a, B:215:0x0632, B:220:0x0642, B:222:0x0648, B:224:0x0668, B:226:0x066e, B:219:0x0673, B:233:0x0678, B:235:0x067c, B:237:0x0682, B:239:0x0686, B:241:0x068e, B:243:0x0694, B:245:0x069e, B:248:0x06a4, B:249:0x06a7, B:251:0x06b0, B:253:0x06c2, B:255:0x06cb, B:257:0x06d3, B:260:0x06df, B:262:0x0707, B:263:0x070a, B:264:0x0715, B:266:0x071b, B:268:0x0721, B:270:0x0728, B:278:0x0735, B:282:0x0740, B:284:0x074a, B:285:0x074f, B:287:0x075b, B:288:0x0773, B:290:0x0779, B:292:0x0781, B:294:0x0788, B:297:0x0791, B:301:0x07a0, B:306:0x07ad, B:308:0x07b3, B:315:0x07c5, B:317:0x07c8, B:326:0x07d2, B:328:0x07d8, B:332:0x07e5, B:334:0x07ed, B:336:0x07f1, B:337:0x07fc, B:339:0x0802, B:340:0x08fd, B:343:0x0905, B:345:0x090a, B:347:0x0912, B:349:0x0920, B:351:0x0927, B:355:0x092b, B:357:0x0931, B:359:0x093a, B:361:0x0940, B:363:0x094b, B:364:0x096f, B:366:0x0975, B:369:0x097e, B:372:0x099e, B:377:0x0991, B:379:0x0995, B:381:0x099b, B:383:0x0952, B:386:0x0960, B:387:0x0967, B:388:0x0968, B:389:0x080a, B:391:0x0811, B:393:0x0815, B:396:0x089d, B:398:0x08a9, B:401:0x0821, B:403:0x0825, B:405:0x0839, B:406:0x0847, B:408:0x0853, B:411:0x085c, B:413:0x0866, B:418:0x0871, B:423:0x08b6, B:425:0x08bc, B:427:0x08c0, B:430:0x08c9, B:432:0x08d9, B:434:0x08e1, B:436:0x08eb, B:438:0x08f0, B:440:0x08f5, B:441:0x08fa, B:443:0x07cb, B:450:0x04b6, B:452:0x04bc, B:454:0x04c7, B:457:0x04d2, B:459:0x04d7, B:462:0x04e5, B:465:0x04eb, B:467:0x04f3, B:471:0x04f6, B:473:0x04fe, B:475:0x050c, B:477:0x0548, B:479:0x0552, B:482:0x055d, B:484:0x0565, B:486:0x0568, B:489:0x056b, B:491:0x0571, B:493:0x0580, B:495:0x0586, B:497:0x0592, B:499:0x059c, B:501:0x05ad, B:505:0x05b3, B:504:0x05be, B:511:0x05c3, B:513:0x05c9, B:516:0x05ce, B:518:0x05d4, B:520:0x05dc, B:522:0x05e2, B:524:0x05e8, B:528:0x05f6, B:529:0x05fd, B:531:0x0600, B:537:0x04a4, B:539:0x09a6, B:542:0x09ad, B:544:0x09b5, B:547:0x09d5, B:572:0x02ad, B:574:0x02b1, B:575:0x02b4, B:579:0x02bb, B:584:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0707 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zzup -> 0x0036, zzhc -> 0x003a, zzch -> 0x003e, zzsm -> 0x0042, zzjh -> 0x0046, TryCatch #10 {zzch -> 0x003e, zzhc -> 0x003a, zzjh -> 0x0046, zzsm -> 0x0042, zzup -> 0x0036, IOException -> 0x0032, RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00c1, B:28:0x00d0, B:29:0x00d4, B:30:0x00e5, B:32:0x00f4, B:33:0x0110, B:34:0x0123, B:35:0x012c, B:37:0x013e, B:38:0x014a, B:39:0x015a, B:41:0x0166, B:44:0x0171, B:45:0x0178, B:46:0x0185, B:49:0x018c, B:51:0x0194, B:53:0x0198, B:55:0x019e, B:57:0x01a6, B:59:0x01ae, B:61:0x01b1, B:66:0x01b6, B:75:0x01c3, B:77:0x01c4, B:80:0x01cb, B:82:0x01d9, B:83:0x01dc, B:85:0x01e1, B:87:0x01f1, B:88:0x01f4, B:89:0x01f9, B:90:0x01fe, B:92:0x020a, B:93:0x0216, B:95:0x0222, B:97:0x024e, B:98:0x026e, B:556:0x029a, B:558:0x029e, B:559:0x02a1, B:568:0x02ac, B:99:0x02c0, B:100:0x02c5, B:101:0x02cd, B:102:0x02df, B:104:0x0306, B:112:0x0424, B:113:0x03ea, B:140:0x03e6, B:155:0x0430, B:156:0x043d, B:169:0x0328, B:172:0x033b, B:174:0x034b, B:176:0x0362, B:178:0x036c, B:185:0x043e, B:187:0x0452, B:189:0x045d, B:191:0x046c, B:193:0x0478, B:195:0x048d, B:196:0x0492, B:197:0x0496, B:199:0x049a, B:200:0x04a7, B:203:0x0603, B:205:0x060b, B:207:0x0613, B:210:0x0618, B:211:0x0624, B:213:0x062a, B:215:0x0632, B:220:0x0642, B:222:0x0648, B:224:0x0668, B:226:0x066e, B:219:0x0673, B:233:0x0678, B:235:0x067c, B:237:0x0682, B:239:0x0686, B:241:0x068e, B:243:0x0694, B:245:0x069e, B:248:0x06a4, B:249:0x06a7, B:251:0x06b0, B:253:0x06c2, B:255:0x06cb, B:257:0x06d3, B:260:0x06df, B:262:0x0707, B:263:0x070a, B:264:0x0715, B:266:0x071b, B:268:0x0721, B:270:0x0728, B:278:0x0735, B:282:0x0740, B:284:0x074a, B:285:0x074f, B:287:0x075b, B:288:0x0773, B:290:0x0779, B:292:0x0781, B:294:0x0788, B:297:0x0791, B:301:0x07a0, B:306:0x07ad, B:308:0x07b3, B:315:0x07c5, B:317:0x07c8, B:326:0x07d2, B:328:0x07d8, B:332:0x07e5, B:334:0x07ed, B:336:0x07f1, B:337:0x07fc, B:339:0x0802, B:340:0x08fd, B:343:0x0905, B:345:0x090a, B:347:0x0912, B:349:0x0920, B:351:0x0927, B:355:0x092b, B:357:0x0931, B:359:0x093a, B:361:0x0940, B:363:0x094b, B:364:0x096f, B:366:0x0975, B:369:0x097e, B:372:0x099e, B:377:0x0991, B:379:0x0995, B:381:0x099b, B:383:0x0952, B:386:0x0960, B:387:0x0967, B:388:0x0968, B:389:0x080a, B:391:0x0811, B:393:0x0815, B:396:0x089d, B:398:0x08a9, B:401:0x0821, B:403:0x0825, B:405:0x0839, B:406:0x0847, B:408:0x0853, B:411:0x085c, B:413:0x0866, B:418:0x0871, B:423:0x08b6, B:425:0x08bc, B:427:0x08c0, B:430:0x08c9, B:432:0x08d9, B:434:0x08e1, B:436:0x08eb, B:438:0x08f0, B:440:0x08f5, B:441:0x08fa, B:443:0x07cb, B:450:0x04b6, B:452:0x04bc, B:454:0x04c7, B:457:0x04d2, B:459:0x04d7, B:462:0x04e5, B:465:0x04eb, B:467:0x04f3, B:471:0x04f6, B:473:0x04fe, B:475:0x050c, B:477:0x0548, B:479:0x0552, B:482:0x055d, B:484:0x0565, B:486:0x0568, B:489:0x056b, B:491:0x0571, B:493:0x0580, B:495:0x0586, B:497:0x0592, B:499:0x059c, B:501:0x05ad, B:505:0x05b3, B:504:0x05be, B:511:0x05c3, B:513:0x05c9, B:516:0x05ce, B:518:0x05d4, B:520:0x05dc, B:522:0x05e2, B:524:0x05e8, B:528:0x05f6, B:529:0x05fd, B:531:0x0600, B:537:0x04a4, B:539:0x09a6, B:542:0x09ad, B:544:0x09b5, B:547:0x09d5, B:572:0x02ad, B:574:0x02b1, B:575:0x02b4, B:579:0x02bb, B:584:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x071b A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zzup -> 0x0036, zzhc -> 0x003a, zzch -> 0x003e, zzsm -> 0x0042, zzjh -> 0x0046, TryCatch #10 {zzch -> 0x003e, zzhc -> 0x003a, zzjh -> 0x0046, zzsm -> 0x0042, zzup -> 0x0036, IOException -> 0x0032, RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00c1, B:28:0x00d0, B:29:0x00d4, B:30:0x00e5, B:32:0x00f4, B:33:0x0110, B:34:0x0123, B:35:0x012c, B:37:0x013e, B:38:0x014a, B:39:0x015a, B:41:0x0166, B:44:0x0171, B:45:0x0178, B:46:0x0185, B:49:0x018c, B:51:0x0194, B:53:0x0198, B:55:0x019e, B:57:0x01a6, B:59:0x01ae, B:61:0x01b1, B:66:0x01b6, B:75:0x01c3, B:77:0x01c4, B:80:0x01cb, B:82:0x01d9, B:83:0x01dc, B:85:0x01e1, B:87:0x01f1, B:88:0x01f4, B:89:0x01f9, B:90:0x01fe, B:92:0x020a, B:93:0x0216, B:95:0x0222, B:97:0x024e, B:98:0x026e, B:556:0x029a, B:558:0x029e, B:559:0x02a1, B:568:0x02ac, B:99:0x02c0, B:100:0x02c5, B:101:0x02cd, B:102:0x02df, B:104:0x0306, B:112:0x0424, B:113:0x03ea, B:140:0x03e6, B:155:0x0430, B:156:0x043d, B:169:0x0328, B:172:0x033b, B:174:0x034b, B:176:0x0362, B:178:0x036c, B:185:0x043e, B:187:0x0452, B:189:0x045d, B:191:0x046c, B:193:0x0478, B:195:0x048d, B:196:0x0492, B:197:0x0496, B:199:0x049a, B:200:0x04a7, B:203:0x0603, B:205:0x060b, B:207:0x0613, B:210:0x0618, B:211:0x0624, B:213:0x062a, B:215:0x0632, B:220:0x0642, B:222:0x0648, B:224:0x0668, B:226:0x066e, B:219:0x0673, B:233:0x0678, B:235:0x067c, B:237:0x0682, B:239:0x0686, B:241:0x068e, B:243:0x0694, B:245:0x069e, B:248:0x06a4, B:249:0x06a7, B:251:0x06b0, B:253:0x06c2, B:255:0x06cb, B:257:0x06d3, B:260:0x06df, B:262:0x0707, B:263:0x070a, B:264:0x0715, B:266:0x071b, B:268:0x0721, B:270:0x0728, B:278:0x0735, B:282:0x0740, B:284:0x074a, B:285:0x074f, B:287:0x075b, B:288:0x0773, B:290:0x0779, B:292:0x0781, B:294:0x0788, B:297:0x0791, B:301:0x07a0, B:306:0x07ad, B:308:0x07b3, B:315:0x07c5, B:317:0x07c8, B:326:0x07d2, B:328:0x07d8, B:332:0x07e5, B:334:0x07ed, B:336:0x07f1, B:337:0x07fc, B:339:0x0802, B:340:0x08fd, B:343:0x0905, B:345:0x090a, B:347:0x0912, B:349:0x0920, B:351:0x0927, B:355:0x092b, B:357:0x0931, B:359:0x093a, B:361:0x0940, B:363:0x094b, B:364:0x096f, B:366:0x0975, B:369:0x097e, B:372:0x099e, B:377:0x0991, B:379:0x0995, B:381:0x099b, B:383:0x0952, B:386:0x0960, B:387:0x0967, B:388:0x0968, B:389:0x080a, B:391:0x0811, B:393:0x0815, B:396:0x089d, B:398:0x08a9, B:401:0x0821, B:403:0x0825, B:405:0x0839, B:406:0x0847, B:408:0x0853, B:411:0x085c, B:413:0x0866, B:418:0x0871, B:423:0x08b6, B:425:0x08bc, B:427:0x08c0, B:430:0x08c9, B:432:0x08d9, B:434:0x08e1, B:436:0x08eb, B:438:0x08f0, B:440:0x08f5, B:441:0x08fa, B:443:0x07cb, B:450:0x04b6, B:452:0x04bc, B:454:0x04c7, B:457:0x04d2, B:459:0x04d7, B:462:0x04e5, B:465:0x04eb, B:467:0x04f3, B:471:0x04f6, B:473:0x04fe, B:475:0x050c, B:477:0x0548, B:479:0x0552, B:482:0x055d, B:484:0x0565, B:486:0x0568, B:489:0x056b, B:491:0x0571, B:493:0x0580, B:495:0x0586, B:497:0x0592, B:499:0x059c, B:501:0x05ad, B:505:0x05b3, B:504:0x05be, B:511:0x05c3, B:513:0x05c9, B:516:0x05ce, B:518:0x05d4, B:520:0x05dc, B:522:0x05e2, B:524:0x05e8, B:528:0x05f6, B:529:0x05fd, B:531:0x0600, B:537:0x04a4, B:539:0x09a6, B:542:0x09ad, B:544:0x09b5, B:547:0x09d5, B:572:0x02ad, B:574:0x02b1, B:575:0x02b4, B:579:0x02bb, B:584:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0975 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zzup -> 0x0036, zzhc -> 0x003a, zzch -> 0x003e, zzsm -> 0x0042, zzjh -> 0x0046, TryCatch #10 {zzch -> 0x003e, zzhc -> 0x003a, zzjh -> 0x0046, zzsm -> 0x0042, zzup -> 0x0036, IOException -> 0x0032, RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00c1, B:28:0x00d0, B:29:0x00d4, B:30:0x00e5, B:32:0x00f4, B:33:0x0110, B:34:0x0123, B:35:0x012c, B:37:0x013e, B:38:0x014a, B:39:0x015a, B:41:0x0166, B:44:0x0171, B:45:0x0178, B:46:0x0185, B:49:0x018c, B:51:0x0194, B:53:0x0198, B:55:0x019e, B:57:0x01a6, B:59:0x01ae, B:61:0x01b1, B:66:0x01b6, B:75:0x01c3, B:77:0x01c4, B:80:0x01cb, B:82:0x01d9, B:83:0x01dc, B:85:0x01e1, B:87:0x01f1, B:88:0x01f4, B:89:0x01f9, B:90:0x01fe, B:92:0x020a, B:93:0x0216, B:95:0x0222, B:97:0x024e, B:98:0x026e, B:556:0x029a, B:558:0x029e, B:559:0x02a1, B:568:0x02ac, B:99:0x02c0, B:100:0x02c5, B:101:0x02cd, B:102:0x02df, B:104:0x0306, B:112:0x0424, B:113:0x03ea, B:140:0x03e6, B:155:0x0430, B:156:0x043d, B:169:0x0328, B:172:0x033b, B:174:0x034b, B:176:0x0362, B:178:0x036c, B:185:0x043e, B:187:0x0452, B:189:0x045d, B:191:0x046c, B:193:0x0478, B:195:0x048d, B:196:0x0492, B:197:0x0496, B:199:0x049a, B:200:0x04a7, B:203:0x0603, B:205:0x060b, B:207:0x0613, B:210:0x0618, B:211:0x0624, B:213:0x062a, B:215:0x0632, B:220:0x0642, B:222:0x0648, B:224:0x0668, B:226:0x066e, B:219:0x0673, B:233:0x0678, B:235:0x067c, B:237:0x0682, B:239:0x0686, B:241:0x068e, B:243:0x0694, B:245:0x069e, B:248:0x06a4, B:249:0x06a7, B:251:0x06b0, B:253:0x06c2, B:255:0x06cb, B:257:0x06d3, B:260:0x06df, B:262:0x0707, B:263:0x070a, B:264:0x0715, B:266:0x071b, B:268:0x0721, B:270:0x0728, B:278:0x0735, B:282:0x0740, B:284:0x074a, B:285:0x074f, B:287:0x075b, B:288:0x0773, B:290:0x0779, B:292:0x0781, B:294:0x0788, B:297:0x0791, B:301:0x07a0, B:306:0x07ad, B:308:0x07b3, B:315:0x07c5, B:317:0x07c8, B:326:0x07d2, B:328:0x07d8, B:332:0x07e5, B:334:0x07ed, B:336:0x07f1, B:337:0x07fc, B:339:0x0802, B:340:0x08fd, B:343:0x0905, B:345:0x090a, B:347:0x0912, B:349:0x0920, B:351:0x0927, B:355:0x092b, B:357:0x0931, B:359:0x093a, B:361:0x0940, B:363:0x094b, B:364:0x096f, B:366:0x0975, B:369:0x097e, B:372:0x099e, B:377:0x0991, B:379:0x0995, B:381:0x099b, B:383:0x0952, B:386:0x0960, B:387:0x0967, B:388:0x0968, B:389:0x080a, B:391:0x0811, B:393:0x0815, B:396:0x089d, B:398:0x08a9, B:401:0x0821, B:403:0x0825, B:405:0x0839, B:406:0x0847, B:408:0x0853, B:411:0x085c, B:413:0x0866, B:418:0x0871, B:423:0x08b6, B:425:0x08bc, B:427:0x08c0, B:430:0x08c9, B:432:0x08d9, B:434:0x08e1, B:436:0x08eb, B:438:0x08f0, B:440:0x08f5, B:441:0x08fa, B:443:0x07cb, B:450:0x04b6, B:452:0x04bc, B:454:0x04c7, B:457:0x04d2, B:459:0x04d7, B:462:0x04e5, B:465:0x04eb, B:467:0x04f3, B:471:0x04f6, B:473:0x04fe, B:475:0x050c, B:477:0x0548, B:479:0x0552, B:482:0x055d, B:484:0x0565, B:486:0x0568, B:489:0x056b, B:491:0x0571, B:493:0x0580, B:495:0x0586, B:497:0x0592, B:499:0x059c, B:501:0x05ad, B:505:0x05b3, B:504:0x05be, B:511:0x05c3, B:513:0x05c9, B:516:0x05ce, B:518:0x05d4, B:520:0x05dc, B:522:0x05e2, B:524:0x05e8, B:528:0x05f6, B:529:0x05fd, B:531:0x0600, B:537:0x04a4, B:539:0x09a6, B:542:0x09ad, B:544:0x09b5, B:547:0x09d5, B:572:0x02ad, B:574:0x02b1, B:575:0x02b4, B:579:0x02bb, B:584:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08a9 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, zzup -> 0x0036, zzhc -> 0x003a, zzch -> 0x003e, zzsm -> 0x0042, zzjh -> 0x0046, TryCatch #10 {zzch -> 0x003e, zzhc -> 0x003a, zzjh -> 0x0046, zzsm -> 0x0042, zzup -> 0x0036, IOException -> 0x0032, RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0015, B:11:0x004a, B:12:0x004e, B:13:0x0052, B:16:0x0059, B:18:0x0062, B:20:0x0070, B:22:0x0077, B:23:0x0081, B:24:0x0094, B:25:0x00ab, B:26:0x00c1, B:28:0x00d0, B:29:0x00d4, B:30:0x00e5, B:32:0x00f4, B:33:0x0110, B:34:0x0123, B:35:0x012c, B:37:0x013e, B:38:0x014a, B:39:0x015a, B:41:0x0166, B:44:0x0171, B:45:0x0178, B:46:0x0185, B:49:0x018c, B:51:0x0194, B:53:0x0198, B:55:0x019e, B:57:0x01a6, B:59:0x01ae, B:61:0x01b1, B:66:0x01b6, B:75:0x01c3, B:77:0x01c4, B:80:0x01cb, B:82:0x01d9, B:83:0x01dc, B:85:0x01e1, B:87:0x01f1, B:88:0x01f4, B:89:0x01f9, B:90:0x01fe, B:92:0x020a, B:93:0x0216, B:95:0x0222, B:97:0x024e, B:98:0x026e, B:556:0x029a, B:558:0x029e, B:559:0x02a1, B:568:0x02ac, B:99:0x02c0, B:100:0x02c5, B:101:0x02cd, B:102:0x02df, B:104:0x0306, B:112:0x0424, B:113:0x03ea, B:140:0x03e6, B:155:0x0430, B:156:0x043d, B:169:0x0328, B:172:0x033b, B:174:0x034b, B:176:0x0362, B:178:0x036c, B:185:0x043e, B:187:0x0452, B:189:0x045d, B:191:0x046c, B:193:0x0478, B:195:0x048d, B:196:0x0492, B:197:0x0496, B:199:0x049a, B:200:0x04a7, B:203:0x0603, B:205:0x060b, B:207:0x0613, B:210:0x0618, B:211:0x0624, B:213:0x062a, B:215:0x0632, B:220:0x0642, B:222:0x0648, B:224:0x0668, B:226:0x066e, B:219:0x0673, B:233:0x0678, B:235:0x067c, B:237:0x0682, B:239:0x0686, B:241:0x068e, B:243:0x0694, B:245:0x069e, B:248:0x06a4, B:249:0x06a7, B:251:0x06b0, B:253:0x06c2, B:255:0x06cb, B:257:0x06d3, B:260:0x06df, B:262:0x0707, B:263:0x070a, B:264:0x0715, B:266:0x071b, B:268:0x0721, B:270:0x0728, B:278:0x0735, B:282:0x0740, B:284:0x074a, B:285:0x074f, B:287:0x075b, B:288:0x0773, B:290:0x0779, B:292:0x0781, B:294:0x0788, B:297:0x0791, B:301:0x07a0, B:306:0x07ad, B:308:0x07b3, B:315:0x07c5, B:317:0x07c8, B:326:0x07d2, B:328:0x07d8, B:332:0x07e5, B:334:0x07ed, B:336:0x07f1, B:337:0x07fc, B:339:0x0802, B:340:0x08fd, B:343:0x0905, B:345:0x090a, B:347:0x0912, B:349:0x0920, B:351:0x0927, B:355:0x092b, B:357:0x0931, B:359:0x093a, B:361:0x0940, B:363:0x094b, B:364:0x096f, B:366:0x0975, B:369:0x097e, B:372:0x099e, B:377:0x0991, B:379:0x0995, B:381:0x099b, B:383:0x0952, B:386:0x0960, B:387:0x0967, B:388:0x0968, B:389:0x080a, B:391:0x0811, B:393:0x0815, B:396:0x089d, B:398:0x08a9, B:401:0x0821, B:403:0x0825, B:405:0x0839, B:406:0x0847, B:408:0x0853, B:411:0x085c, B:413:0x0866, B:418:0x0871, B:423:0x08b6, B:425:0x08bc, B:427:0x08c0, B:430:0x08c9, B:432:0x08d9, B:434:0x08e1, B:436:0x08eb, B:438:0x08f0, B:440:0x08f5, B:441:0x08fa, B:443:0x07cb, B:450:0x04b6, B:452:0x04bc, B:454:0x04c7, B:457:0x04d2, B:459:0x04d7, B:462:0x04e5, B:465:0x04eb, B:467:0x04f3, B:471:0x04f6, B:473:0x04fe, B:475:0x050c, B:477:0x0548, B:479:0x0552, B:482:0x055d, B:484:0x0565, B:486:0x0568, B:489:0x056b, B:491:0x0571, B:493:0x0580, B:495:0x0586, B:497:0x0592, B:499:0x059c, B:501:0x05ad, B:505:0x05b3, B:504:0x05be, B:511:0x05c3, B:513:0x05c9, B:516:0x05ce, B:518:0x05d4, B:520:0x05dc, B:522:0x05e2, B:524:0x05e8, B:528:0x05f6, B:529:0x05fd, B:531:0x0600, B:537:0x04a4, B:539:0x09a6, B:542:0x09ad, B:544:0x09b5, B:547:0x09d5, B:572:0x02ad, B:574:0x02b1, B:575:0x02b4, B:579:0x02bb, B:584:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.zzzu, com.google.android.gms.internal.ads.zzie] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r36) {
        /*
            Method dump skipped, instructions count: 2856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlh.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zza(zzcl zzclVar) {
        this.zzh.zzc(16, zzclVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        this.zzh.zzc(9, (zzvm) zzxhVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        this.zzh.zzc(8, zzvmVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzdc zzdcVar, int i9, long j7) {
        this.zzh.zzc(3, new zzlg(zzdcVar, i9, j7)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final synchronized void zzm(zzmj zzmjVar) {
        if (!this.zzx && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzmjVar).zza();
            return;
        }
        zzfk.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzmjVar.zzh(false);
    }

    public final void zzn(boolean z8, int i9) {
        this.zzh.zzd(1, z8 ? 1 : 0, i9).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzx && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzad(new zzkx(this), this.zzs);
            return this.zzx;
        }
        return true;
    }

    public final void zzq(List list, int i9, long j7, zzxi zzxiVar) {
        this.zzh.zzc(17, new zzlc(list, zzxiVar, i9, j7, null)).zza();
    }
}
