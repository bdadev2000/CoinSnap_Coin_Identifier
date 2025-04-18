package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkk implements Handler.Callback, zzuv, zzyq, zzli, zzih, zzll {
    private static final long zza = zzeu.zzu(10000);
    private boolean zzA;
    private boolean zzB;
    private boolean zzD;
    private boolean zzG;
    private int zzH;

    @Nullable
    private zzkj zzI;
    private long zzJ;
    private long zzK;
    private int zzL;
    private boolean zzM;

    @Nullable
    private zzij zzN;
    private zzit zzP;
    private final zzjg zzQ;
    private final zzid zzR;
    private final zzlr[] zzb;
    private final Set zzc;
    private final zzlu[] zzd;
    private final zzyr zze;
    private final zzys zzf;
    private final zzko zzg;
    private final zzyz zzh;
    private final zzdt zzi;

    @Nullable
    private final HandlerThread zzj;
    private final Looper zzk;
    private final zzcb zzl;
    private final zzca zzm;
    private final long zzn;
    private final zzii zzo;
    private final ArrayList zzp;
    private final zzdj zzq;
    private final zzkx zzr;
    private final zzlj zzs;
    private final long zzt;
    private final zzom zzu;
    private zzlw zzv;
    private zzlk zzw;
    private zzki zzx;
    private boolean zzy;
    private int zzE = 0;
    private boolean zzF = false;
    private boolean zzz = false;
    private long zzO = -9223372036854775807L;
    private long zzC = -9223372036854775807L;

    public zzkk(zzlr[] zzlrVarArr, zzyr zzyrVar, zzys zzysVar, zzko zzkoVar, zzyz zzyzVar, int i2, boolean z2, zzma zzmaVar, zzlw zzlwVar, zzid zzidVar, long j2, boolean z3, boolean z4, Looper looper, zzdj zzdjVar, zzjg zzjgVar, zzom zzomVar, Looper looper2, zzit zzitVar) {
        this.zzQ = zzjgVar;
        this.zzb = zzlrVarArr;
        this.zze = zzyrVar;
        this.zzf = zzysVar;
        this.zzg = zzkoVar;
        this.zzh = zzyzVar;
        this.zzv = zzlwVar;
        this.zzR = zzidVar;
        this.zzt = j2;
        this.zzq = zzdjVar;
        this.zzu = zzomVar;
        this.zzP = zzitVar;
        this.zzn = zzkoVar.zzb(zzomVar);
        zzkoVar.zzg(zzomVar);
        zzcc zzccVar = zzcc.zza;
        zzlk zzg = zzlk.zzg(zzysVar);
        this.zzw = zzg;
        this.zzx = new zzki(zzg);
        int length = zzlrVarArr.length;
        this.zzd = new zzlu[2];
        zzlt zze = zzyrVar.zze();
        for (int i3 = 0; i3 < 2; i3++) {
            zzlrVarArr[i3].zzv(i3, zzomVar, zzdjVar);
            this.zzd[i3] = zzlrVarArr[i3].zzm();
            this.zzd[i3].zzL(zze);
        }
        this.zzo = new zzii(this, zzdjVar);
        this.zzp = new ArrayList();
        this.zzc = Collections.newSetFromMap(new IdentityHashMap());
        this.zzl = new zzcb();
        this.zzm = new zzca();
        zzyrVar.zzr(this, zzyzVar);
        this.zzM = true;
        zzdt zzd = zzdjVar.zzd(looper, null);
        this.zzr = new zzkx(zzmaVar, zzd, new zzkc(this), zzitVar);
        this.zzs = new zzlj(this, zzmaVar, zzd, zzomVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzj = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzk = looper3;
        this.zzi = zzdjVar.zzd(looper3, this);
    }

    private final void zzA() throws zzij {
        int length = this.zzb.length;
        zzB(new boolean[2], this.zzr.zzf().zzf());
    }

    private final void zzB(boolean[] zArr, long j2) throws zzij {
        zzku zzf = this.zzr.zzf();
        zzys zzi = zzf.zzi();
        int i2 = 0;
        while (true) {
            int length = this.zzb.length;
            if (i2 >= 2) {
                break;
            }
            if (!zzi.zzb(i2) && this.zzc.remove(this.zzb[i2])) {
                this.zzb[i2].zzI();
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length2 = this.zzb.length;
            if (i3 >= 2) {
                zzf.zzg = true;
                return;
            }
            if (zzi.zzb(i3)) {
                boolean z2 = zArr[i3];
                zzlr zzlrVar = this.zzb[i3];
                if (!zzae(zzlrVar)) {
                    zzkx zzkxVar = this.zzr;
                    zzku zzf2 = zzkxVar.zzf();
                    boolean z3 = zzf2 == zzkxVar.zze();
                    zzys zzi2 = zzf2.zzi();
                    zzlv zzlvVar = zzi2.zzb[i3];
                    zzaf[] zzaj = zzaj(zzi2.zzc[i3]);
                    boolean z4 = zzah() && this.zzw.zze == 3;
                    boolean z5 = !z2 && z4;
                    this.zzH++;
                    this.zzc.add(zzlrVar);
                    zzlrVar.zzs(zzlvVar, zzaj, zzf2.zzc[i3], this.zzJ, z5, z3, j2, zzf2.zze(), zzf2.zzf.zza);
                    zzlrVar.zzu(11, new zzkd(this));
                    this.zzo.zze(zzlrVar);
                    if (z4 && z3) {
                        zzlrVar.zzO();
                    }
                }
            }
            i3++;
        }
    }

    private final void zzC(IOException iOException, int i2) {
        zzkx zzkxVar = this.zzr;
        zzij zzc = zzij.zzc(iOException, i2);
        zzku zze = zzkxVar.zze();
        if (zze != null) {
            zzc = zzc.zza(zze.zzf.zza);
        }
        zzea.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzV(false, false);
        this.zzw = this.zzw.zzd(zzc);
    }

    private final void zzD(boolean z2) {
        zzku zzd = this.zzr.zzd();
        zzuy zzuyVar = zzd == null ? this.zzw.zzb : zzd.zzf.zza;
        boolean z3 = !this.zzw.zzk.equals(zzuyVar);
        if (z3) {
            this.zzw = this.zzw.zza(zzuyVar);
        }
        zzlk zzlkVar = this.zzw;
        zzlkVar.zzq = zzd == null ? zzlkVar.zzs : zzd.zzc();
        this.zzw.zzr = zzs();
        if ((z3 || z2) && zzd != null && zzd.zzd) {
            zzY(zzd.zzf.zza, zzd.zzh(), zzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03bf  */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.zzcc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzE(com.google.android.gms.internal.ads.zzcc r31, boolean r32) throws com.google.android.gms.internal.ads.zzij {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkk.zzE(com.google.android.gms.internal.ads.zzcc, boolean):void");
    }

    private final void zzF(zzbq zzbqVar, boolean z2) throws zzij {
        zzG(zzbqVar, zzbqVar.zzb, true, z2);
    }

    private final void zzG(zzbq zzbqVar, float f2, boolean z2, boolean z3) throws zzij {
        int i2;
        zzkk zzkkVar = this;
        if (z2) {
            if (z3) {
                zzkkVar.zzx.zza(1);
            }
            zzlk zzlkVar = zzkkVar.zzw;
            zzkkVar = this;
            zzkkVar.zzw = new zzlk(zzlkVar.zza, zzlkVar.zzb, zzlkVar.zzc, zzlkVar.zzd, zzlkVar.zze, zzlkVar.zzf, zzlkVar.zzg, zzlkVar.zzh, zzlkVar.zzi, zzlkVar.zzj, zzlkVar.zzk, zzlkVar.zzl, zzlkVar.zzm, zzlkVar.zzn, zzbqVar, zzlkVar.zzq, zzlkVar.zzr, zzlkVar.zzs, zzlkVar.zzt, false);
        }
        float f3 = zzbqVar.zzb;
        zzku zze = zzkkVar.zzr.zze();
        while (true) {
            i2 = 0;
            if (zze == null) {
                break;
            }
            zzyl[] zzylVarArr = zze.zzi().zzc;
            int length = zzylVarArr.length;
            while (i2 < length) {
                zzyl zzylVar = zzylVarArr[i2];
                i2++;
            }
            zze = zze.zzg();
        }
        zzlr[] zzlrVarArr = zzkkVar.zzb;
        int length2 = zzlrVarArr.length;
        while (i2 < 2) {
            zzlr zzlrVar = zzlrVarArr[i2];
            if (zzlrVar != null) {
                zzlrVar.zzM(f2, zzbqVar.zzb);
            }
            i2++;
        }
    }

    private final void zzH() {
        long zze;
        long j2;
        boolean z2;
        if (zzad()) {
            zzku zzd = this.zzr.zzd();
            long zzt = zzt(zzd.zzd());
            if (zzd == this.zzr.zze()) {
                zze = this.zzJ;
                j2 = zzd.zze();
            } else {
                zze = this.zzJ - zzd.zze();
                j2 = zzd.zzf.zzb;
            }
            zzkn zzknVar = new zzkn(this.zzu, this.zzw.zza, zzd.zzf.zza, zze - j2, zzt, this.zzo.zzc().zzb, this.zzw.zzl, this.zzB, zzai(this.zzw.zza, zzd.zzf.zza) ? this.zzR.zzb() : -9223372036854775807L);
            boolean zzh = this.zzg.zzh(zzknVar);
            zzku zze2 = this.zzr.zze();
            if (zzh || !zze2.zzd || zzt >= 500000 || this.zzn <= 0) {
                z2 = zzh;
            } else {
                zze2.zza.zzj(this.zzw.zzs, false);
                z2 = this.zzg.zzh(zzknVar);
            }
        } else {
            z2 = false;
        }
        this.zzD = z2;
        if (z2) {
            this.zzr.zzd().zzk(this.zzJ, this.zzo.zzc().zzb, this.zzC);
        }
        zzX();
    }

    private final void zzI() {
        boolean z2;
        this.zzx.zzb(this.zzw);
        z2 = this.zzx.zze;
        if (z2) {
            zzjg zzjgVar = this.zzQ;
            zzjgVar.zza.zzO(this.zzx);
            this.zzx = new zzki(this.zzw);
        }
    }

    private final void zzJ() throws zzij {
        int i2;
        float f2 = this.zzo.zzc().zzb;
        zzkx zzkxVar = this.zzr;
        zzku zze = zzkxVar.zze();
        zzku zzf = zzkxVar.zzf();
        zzys zzysVar = null;
        boolean z2 = true;
        while (zze != null && zze.zzd) {
            zzys zzj = zze.zzj(f2, this.zzw.zza);
            zzys zzysVar2 = zze == this.zzr.zze() ? zzj : zzysVar;
            zzys zzi = zze.zzi();
            boolean z3 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i3 = 0; i3 < zzj.zzc.length; i3++) {
                        if (zzj.zza(zzi, i3)) {
                        }
                    }
                    if (zze != zzf) {
                        z3 = true;
                    }
                    z2 &= z3;
                    zze = zze.zzg();
                    zzysVar = zzysVar2;
                }
            }
            if (z2) {
                zzkx zzkxVar2 = this.zzr;
                zzku zze2 = zzkxVar2.zze();
                boolean zzq = zzkxVar2.zzq(zze2);
                int length = this.zzb.length;
                boolean[] zArr = new boolean[2];
                zzysVar2.getClass();
                long zzb = zze2.zzb(zzysVar2, this.zzw.zzs, zzq, zArr);
                zzlk zzlkVar = this.zzw;
                boolean z4 = (zzlkVar.zze == 4 || zzb == zzlkVar.zzs) ? false : true;
                zzlk zzlkVar2 = this.zzw;
                i2 = 2;
                this.zzw = zzy(zzlkVar2.zzb, zzb, zzlkVar2.zzc, zzlkVar2.zzd, z4, 5);
                if (z4) {
                    zzN(zzb);
                }
                int length2 = this.zzb.length;
                boolean[] zArr2 = new boolean[2];
                int i4 = 0;
                while (true) {
                    zzlr[] zzlrVarArr = this.zzb;
                    int length3 = zzlrVarArr.length;
                    if (i4 >= 2) {
                        break;
                    }
                    zzlr zzlrVar = zzlrVarArr[i4];
                    boolean zzae = zzae(zzlrVar);
                    zArr2[i4] = zzae;
                    zzwn zzwnVar = zze2.zzc[i4];
                    if (zzae) {
                        if (zzwnVar != zzlrVar.zzp()) {
                            zzz(zzlrVar);
                        } else if (zArr[i4]) {
                            zzlrVar.zzJ(this.zzJ);
                        }
                    }
                    i4++;
                }
                zzB(zArr2, this.zzJ);
            } else {
                i2 = 2;
                this.zzr.zzq(zze);
                if (zze.zzd) {
                    zze.zza(zzj, Math.max(zze.zzf.zzb, this.zzJ - zze.zze()), false);
                }
            }
            zzD(true);
            if (this.zzw.zze != 4) {
                zzH();
                zzZ();
                this.zzi.zzi(i2);
                return;
            }
            return;
        }
    }

    private final void zzK() throws zzij {
        zzJ();
        zzQ(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r2.equals(r33.zzw.zzb) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkk.zzL(boolean, boolean, boolean, boolean):void");
    }

    private final void zzM() {
        zzku zze = this.zzr.zze();
        boolean z2 = false;
        if (zze != null && zze.zzf.zzh && this.zzz) {
            z2 = true;
        }
        this.zzA = z2;
    }

    private final void zzN(long j2) throws zzij {
        zzku zze = this.zzr.zze();
        long zze2 = j2 + (zze == null ? 1000000000000L : zze.zze());
        this.zzJ = zze2;
        this.zzo.zzf(zze2);
        zzlr[] zzlrVarArr = this.zzb;
        int length = zzlrVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            zzlr zzlrVar = zzlrVarArr[i2];
            if (zzae(zzlrVar)) {
                zzlrVar.zzJ(this.zzJ);
            }
        }
        for (zzku zze3 = this.zzr.zze(); zze3 != null; zze3 = zze3.zzg()) {
            for (zzyl zzylVar : zze3.zzi().zzc) {
            }
        }
    }

    private final void zzO(zzcc zzccVar, zzcc zzccVar2) {
        if (zzccVar.zzo() && zzccVar2.zzo()) {
            return;
        }
        int size = this.zzp.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzp);
        } else {
            Object obj = ((zzkh) this.zzp.get(size)).zzb;
            int i2 = zzeu.zza;
            throw null;
        }
    }

    private final void zzP(long j2) {
        this.zzi.zzj(2, j2 + ((this.zzw.zze != 3 || zzah()) ? zza : 1000L));
    }

    private final void zzQ(boolean z2) throws zzij {
        zzuy zzuyVar = this.zzr.zze().zzf.zza;
        long zzv = zzv(zzuyVar, this.zzw.zzs, true, false);
        if (zzv != this.zzw.zzs) {
            zzlk zzlkVar = this.zzw;
            this.zzw = zzy(zzuyVar, zzv, zzlkVar.zzc, zzlkVar.zzd, z2, 5);
        }
    }

    private final void zzR(zzbq zzbqVar) {
        this.zzi.zzf(16);
        this.zzo.zzg(zzbqVar);
    }

    private final void zzS(boolean z2, int i2, boolean z3, int i3) throws zzij {
        this.zzx.zza(z3 ? 1 : 0);
        this.zzw = this.zzw.zzc(z2, i3, i2);
        zzab(false, false);
        for (zzku zze = this.zzr.zze(); zze != null; zze = zze.zzg()) {
            for (zzyl zzylVar : zze.zzi().zzc) {
            }
        }
        if (!zzah()) {
            zzW();
            zzZ();
            return;
        }
        int i4 = this.zzw.zze;
        if (i4 == 3) {
            this.zzo.zzh();
            zzU();
            this.zzi.zzi(2);
        } else if (i4 == 2) {
            this.zzi.zzi(2);
        }
    }

    private final void zzT(int i2) {
        zzlk zzlkVar = this.zzw;
        if (zzlkVar.zze != i2) {
            if (i2 != 2) {
                this.zzO = -9223372036854775807L;
            }
            this.zzw = zzlkVar.zze(i2);
        }
    }

    private final void zzU() throws zzij {
        zzku zze = this.zzr.zze();
        if (zze == null) {
            return;
        }
        zzys zzi = zze.zzi();
        int i2 = 0;
        while (true) {
            int length = this.zzb.length;
            if (i2 >= 2) {
                return;
            }
            if (zzi.zzb(i2) && this.zzb[i2].zzcV() == 1) {
                this.zzb[i2].zzO();
            }
            i2++;
        }
    }

    private final void zzV(boolean z2, boolean z3) {
        zzL(z2 || !this.zzG, false, true, false);
        this.zzx.zza(z3 ? 1 : 0);
        this.zzg.zze(this.zzu);
        zzT(1);
    }

    private final void zzW() throws zzij {
        this.zzo.zzi();
        zzlr[] zzlrVarArr = this.zzb;
        int length = zzlrVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            zzlr zzlrVar = zzlrVarArr[i2];
            if (zzae(zzlrVar)) {
                zzal(zzlrVar);
            }
        }
    }

    private final void zzX() {
        zzku zzd = this.zzr.zzd();
        boolean z2 = this.zzD || (zzd != null && zzd.zza.zzp());
        zzlk zzlkVar = this.zzw;
        if (z2 != zzlkVar.zzg) {
            this.zzw = new zzlk(zzlkVar.zza, zzlkVar.zzb, zzlkVar.zzc, zzlkVar.zzd, zzlkVar.zze, zzlkVar.zzf, z2, zzlkVar.zzh, zzlkVar.zzi, zzlkVar.zzj, zzlkVar.zzk, zzlkVar.zzl, zzlkVar.zzm, zzlkVar.zzn, zzlkVar.zzo, zzlkVar.zzq, zzlkVar.zzr, zzlkVar.zzs, zzlkVar.zzt, false);
        }
    }

    private final void zzY(zzuy zzuyVar, zzwy zzwyVar, zzys zzysVar) {
        zzcc zzccVar = this.zzw.zza;
        zzyl[] zzylVarArr = zzysVar.zzc;
        this.zzg.zzf(this.zzu, zzccVar, zzuyVar, this.zzb, zzwyVar, zzylVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ae, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzZ() throws com.google.android.gms.internal.ads.zzij {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkk.zzZ():void");
    }

    private final void zzaa(zzcc zzccVar, zzuy zzuyVar, zzcc zzccVar2, zzuy zzuyVar2, long j2, boolean z2) throws zzij {
        if (!zzai(zzccVar, zzuyVar)) {
            zzbq zzbqVar = zzuyVar.zzb() ? zzbq.zza : this.zzw.zzo;
            if (this.zzo.zzc().equals(zzbqVar)) {
                return;
            }
            zzR(zzbqVar);
            zzG(this.zzw.zzo, zzbqVar.zzb, false, false);
            return;
        }
        zzccVar.zze(zzccVar.zzn(zzuyVar.zza, this.zzm).zzc, this.zzl, 0L);
        zzid zzidVar = this.zzR;
        zzav zzavVar = this.zzl.zzj;
        int i2 = zzeu.zza;
        zzidVar.zzd(zzavVar);
        if (j2 != -9223372036854775807L) {
            this.zzR.zze(zzr(zzccVar, zzuyVar.zza, j2));
            return;
        }
        if (!Objects.equals(!zzccVar2.zzo() ? zzccVar2.zze(zzccVar2.zzn(zzuyVar2.zza, this.zzm).zzc, this.zzl, 0L).zzb : null, this.zzl.zzb) || z2) {
            this.zzR.zze(-9223372036854775807L);
        }
    }

    private final void zzab(boolean z2, boolean z3) {
        this.zzB = z2;
        long j2 = -9223372036854775807L;
        if (z2 && !z3) {
            j2 = SystemClock.elapsedRealtime();
        }
        this.zzC = j2;
    }

    private final synchronized void zzac(zzfyp zzfypVar, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
        boolean z2 = false;
        while (!Boolean.valueOf(((zzka) zzfypVar).zza.zzy).booleanValue() && j2 > 0) {
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            j2 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzad() {
        zzku zzd = this.zzr.zzd();
        return (zzd == null || zzd.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzae(zzlr zzlrVar) {
        return zzlrVar.zzcV() != 0;
    }

    private final boolean zzaf() {
        zzku zze = this.zzr.zze();
        long j2 = zze.zzf.zze;
        if (!zze.zzd) {
            return false;
        }
        if (j2 == -9223372036854775807L || this.zzw.zzs < j2) {
            return true;
        }
        return !zzah();
    }

    private static boolean zzag(zzlk zzlkVar, zzca zzcaVar) {
        zzuy zzuyVar = zzlkVar.zzb;
        zzcc zzccVar = zzlkVar.zza;
        return zzccVar.zzo() || zzccVar.zzn(zzuyVar.zza, zzcaVar).zzf;
    }

    private final boolean zzah() {
        zzlk zzlkVar = this.zzw;
        return zzlkVar.zzl && zzlkVar.zzn == 0;
    }

    private final boolean zzai(zzcc zzccVar, zzuy zzuyVar) {
        if (!zzuyVar.zzb() && !zzccVar.zzo()) {
            zzccVar.zze(zzccVar.zzn(zzuyVar.zza, this.zzm).zzc, this.zzl, 0L);
            if (this.zzl.zzb()) {
                zzcb zzcbVar = this.zzl;
                if (zzcbVar.zzi && zzcbVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzaf[] zzaj(zzyl zzylVar) {
        int zzc = zzylVar != null ? zzylVar.zzc() : 0;
        zzaf[] zzafVarArr = new zzaf[zzc];
        for (int i2 = 0; i2 < zzc; i2++) {
            zzafVarArr[i2] = zzylVar.zzd(i2);
        }
        return zzafVarArr;
    }

    private static final void zzak(zzln zzlnVar) throws zzij {
        zzlnVar.zzj();
        try {
            zzlnVar.zzc().zzu(zzlnVar.zza(), zzlnVar.zzg());
        } finally {
            zzlnVar.zzh(true);
        }
    }

    private static final void zzal(zzlr zzlrVar) {
        if (zzlrVar.zzcV() == 2) {
            zzlrVar.zzP();
        }
    }

    private static final void zzam(zzlr zzlrVar, long j2) {
        zzlrVar.zzK();
        if (zzlrVar instanceof zzxc) {
            throw null;
        }
    }

    public static int zzb(zzcb zzcbVar, zzca zzcaVar, int i2, boolean z2, Object obj, zzcc zzccVar, zzcc zzccVar2) {
        Object obj2 = zzccVar.zze(zzccVar.zzn(obj, zzcaVar).zzc, zzcbVar, 0L).zzb;
        for (int i3 = 0; i3 < zzccVar2.zzc(); i3++) {
            if (zzccVar2.zze(i3, zzcbVar, 0L).zzb.equals(obj2)) {
                return i3;
            }
        }
        int zza2 = zzccVar.zza(obj);
        int zzb = zzccVar.zzb();
        int i4 = zza2;
        int i5 = 0;
        int i6 = -1;
        while (true) {
            if (i5 >= zzb || i6 != -1) {
                break;
            }
            i4 = zzccVar.zzi(i4, zzcaVar, zzcbVar, i2, z2);
            if (i4 == -1) {
                i6 = -1;
                break;
            }
            i6 = zzccVar2.zza(zzccVar.zzf(i4));
            i5++;
        }
        if (i6 == -1) {
            return -1;
        }
        return zzccVar2.zzd(i6, zzcaVar, false).zzc;
    }

    public static /* synthetic */ zzku zzd(zzkk zzkkVar, zzkv zzkvVar, long j2) {
        zzko zzkoVar = zzkkVar.zzg;
        zzyr zzyrVar = zzkkVar.zze;
        zzza zzj = zzkoVar.zzj();
        zzys zzysVar = zzkkVar.zzf;
        return new zzku(zzkkVar.zzd, j2, zzyrVar, zzj, zzkkVar.zzs, zzkvVar, zzysVar);
    }

    public static final /* synthetic */ void zzq(zzln zzlnVar) {
        try {
            zzak(zzlnVar);
        } catch (zzij e) {
            zzea.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzr(zzcc zzccVar, Object obj, long j2) {
        zzccVar.zze(zzccVar.zzn(obj, this.zzm).zzc, this.zzl, 0L);
        zzcb zzcbVar = this.zzl;
        if (zzcbVar.zzf != -9223372036854775807L && zzcbVar.zzb()) {
            zzcb zzcbVar2 = this.zzl;
            if (zzcbVar2.zzi) {
                long j3 = zzcbVar2.zzg;
                return zzeu.zzr((j3 == -9223372036854775807L ? System.currentTimeMillis() : j3 + SystemClock.elapsedRealtime()) - this.zzl.zzf) - j2;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzs() {
        return zzt(this.zzw.zzq);
    }

    private final long zzt(long j2) {
        zzku zzd = this.zzr.zzd();
        if (zzd == null) {
            return 0L;
        }
        return Math.max(0L, j2 - (this.zzJ - zzd.zze()));
    }

    private final long zzu(zzuy zzuyVar, long j2, boolean z2) throws zzij {
        zzkx zzkxVar = this.zzr;
        return zzv(zzuyVar, j2, zzkxVar.zze() != zzkxVar.zzf(), z2);
    }

    private final long zzv(zzuy zzuyVar, long j2, boolean z2, boolean z3) throws zzij {
        zzW();
        zzab(false, true);
        if (z3 || this.zzw.zze == 3) {
            zzT(2);
        }
        zzku zze = this.zzr.zze();
        zzku zzkuVar = zze;
        while (zzkuVar != null && !zzuyVar.equals(zzkuVar.zzf.zza)) {
            zzkuVar = zzkuVar.zzg();
        }
        if (z2 || zze != zzkuVar || (zzkuVar != null && zzkuVar.zze() + j2 < 0)) {
            zzlr[] zzlrVarArr = this.zzb;
            int length = zzlrVarArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzz(zzlrVarArr[i2]);
            }
            if (zzkuVar != null) {
                while (this.zzr.zze() != zzkuVar) {
                    this.zzr.zza();
                }
                this.zzr.zzq(zzkuVar);
                zzkuVar.zzp(1000000000000L);
                zzA();
            }
        }
        if (zzkuVar != null) {
            this.zzr.zzq(zzkuVar);
            if (!zzkuVar.zzd) {
                zzkuVar.zzf = zzkuVar.zzf.zzb(j2);
            } else if (zzkuVar.zze) {
                j2 = zzkuVar.zza.zze(j2);
                zzkuVar.zza.zzj(j2 - this.zzn, false);
            }
            zzN(j2);
            zzH();
        } else {
            this.zzr.zzj();
            zzN(j2);
        }
        zzD(false);
        this.zzi.zzi(2);
        return j2;
    }

    private final Pair zzw(zzcc zzccVar) {
        long j2 = 0;
        if (zzccVar.zzo()) {
            return Pair.create(zzlk.zzh(), 0L);
        }
        Pair zzl = zzccVar.zzl(this.zzl, this.zzm, zzccVar.zzg(this.zzF), -9223372036854775807L);
        zzuy zzi = this.zzr.zzi(zzccVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzi.zzb()) {
            zzccVar.zzn(zzi.zza, this.zzm);
            if (zzi.zzc == this.zzm.zze(zzi.zzb)) {
                this.zzm.zzh();
            }
        } else {
            j2 = longValue;
        }
        return Pair.create(zzi, Long.valueOf(j2));
    }

    @Nullable
    private static Pair zzx(zzcc zzccVar, zzkj zzkjVar, boolean z2, int i2, boolean z3, zzcb zzcbVar, zzca zzcaVar) {
        Pair zzl;
        zzcc zzccVar2 = zzkjVar.zza;
        if (zzccVar.zzo()) {
            return null;
        }
        zzcc zzccVar3 = true == zzccVar2.zzo() ? zzccVar : zzccVar2;
        try {
            zzl = zzccVar3.zzl(zzcbVar, zzcaVar, zzkjVar.zzb, zzkjVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzccVar.equals(zzccVar3)) {
            return zzl;
        }
        if (zzccVar.zza(zzl.first) != -1) {
            return (zzccVar3.zzn(zzl.first, zzcaVar).zzf && zzccVar3.zze(zzcaVar.zzc, zzcbVar, 0L).zzn == zzccVar3.zza(zzl.first)) ? zzccVar.zzl(zzcbVar, zzcaVar, zzccVar.zzn(zzl.first, zzcaVar).zzc, zzkjVar.zzc) : zzl;
        }
        int zzb = zzb(zzcbVar, zzcaVar, i2, z3, zzl.first, zzccVar3, zzccVar);
        if (zzb != -1) {
            return zzccVar.zzl(zzcbVar, zzcaVar, zzb, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    @androidx.annotation.CheckResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzlk zzy(com.google.android.gms.internal.ads.zzuy r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkk.zzy(com.google.android.gms.internal.ads.zzuy, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzlk");
    }

    private final void zzz(zzlr zzlrVar) throws zzij {
        if (zzae(zzlrVar)) {
            this.zzo.zzd(zzlrVar);
            zzal(zzlrVar);
            zzlrVar.zzr();
            this.zzH--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:486:0x085d, code lost:
    
        if (zzaf() != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0921, code lost:
    
        if (r4 == false) goto L472;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0667 A[Catch: RuntimeException -> 0x0049, IOException -> 0x004d, zzty -> 0x0051, zzgh -> 0x0055, zzbo -> 0x0059, zzro -> 0x005d, zzij -> 0x0061, TryCatch #8 {zzbo -> 0x0059, zzgh -> 0x0055, zzij -> 0x0061, zzro -> 0x005d, zzty -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049, blocks: (B:3:0x0006, B:4:0x0013, B:7:0x0017, B:10:0x0033, B:15:0x0065, B:16:0x0075, B:17:0x008c, B:18:0x0090, B:19:0x0094, B:22:0x009b, B:24:0x00a4, B:26:0x00b2, B:28:0x00b9, B:29:0x00c3, B:30:0x00d7, B:31:0x00ef, B:32:0x0105, B:34:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0138, B:39:0x0154, B:40:0x0167, B:41:0x0170, B:43:0x0182, B:44:0x018e, B:45:0x019e, B:47:0x01aa, B:50:0x01b5, B:51:0x01bc, B:52:0x01c7, B:55:0x01ce, B:57:0x01d6, B:59:0x01da, B:61:0x01e0, B:63:0x01e8, B:65:0x01f0, B:67:0x01f3, B:72:0x01f8, B:81:0x0205, B:83:0x0206, B:86:0x020d, B:88:0x021b, B:89:0x021e, B:91:0x0223, B:93:0x0233, B:94:0x0236, B:95:0x023b, B:96:0x0240, B:98:0x024c, B:99:0x0258, B:101:0x0264, B:103:0x0290, B:104:0x02b0, B:549:0x02dc, B:551:0x02e0, B:552:0x02e3, B:561:0x02ee, B:105:0x0302, B:106:0x0307, B:107:0x030f, B:108:0x0321, B:110:0x0348, B:117:0x0460, B:118:0x042c, B:142:0x0428, B:157:0x046c, B:158:0x047a, B:166:0x036a, B:169:0x037d, B:171:0x038d, B:173:0x03a4, B:175:0x03ad, B:182:0x047b, B:184:0x0490, B:187:0x049a, B:189:0x04a9, B:191:0x04b5, B:193:0x04ca, B:194:0x04cf, B:195:0x04d3, B:197:0x04d7, B:198:0x04e4, B:201:0x0640, B:203:0x0648, B:205:0x0650, B:208:0x0655, B:209:0x0661, B:211:0x0667, B:213:0x066f, B:218:0x067f, B:220:0x0685, B:222:0x06a5, B:224:0x06ab, B:217:0x06b0, B:231:0x06b5, B:233:0x06b9, B:276:0x0772, B:235:0x06c2, B:237:0x06c6, B:239:0x06ce, B:241:0x06d4, B:243:0x06de, B:246:0x06e4, B:247:0x06e7, B:249:0x06f0, B:251:0x0702, B:253:0x070b, B:255:0x0713, B:258:0x071f, B:260:0x0746, B:261:0x0749, B:262:0x0754, B:264:0x075a, B:266:0x0760, B:268:0x0767, B:282:0x04f3, B:284:0x04f9, B:286:0x0504, B:289:0x050f, B:291:0x0514, B:294:0x0522, B:297:0x0528, B:299:0x0530, B:303:0x0533, B:305:0x053b, B:307:0x0549, B:309:0x0585, B:311:0x058f, B:314:0x059a, B:316:0x05a2, B:318:0x05a5, B:321:0x05a8, B:323:0x05ae, B:325:0x05bd, B:327:0x05c3, B:329:0x05cf, B:331:0x05d9, B:333:0x05ea, B:337:0x05f0, B:336:0x05fb, B:343:0x0600, B:345:0x0606, B:348:0x060b, B:350:0x0611, B:352:0x0619, B:354:0x061f, B:356:0x0625, B:360:0x0633, B:361:0x063a, B:363:0x063d, B:369:0x04e1, B:370:0x0776, B:375:0x0782, B:377:0x078a, B:378:0x078f, B:380:0x079b, B:381:0x07b5, B:383:0x07bb, B:385:0x07c3, B:387:0x07cc, B:390:0x07d5, B:394:0x07e4, B:399:0x07f1, B:401:0x07f7, B:408:0x0809, B:410:0x080c, B:419:0x0816, B:421:0x081c, B:425:0x0829, B:427:0x0831, B:429:0x0835, B:430:0x0840, B:432:0x0846, B:433:0x0957, B:436:0x095f, B:438:0x0964, B:440:0x096c, B:442:0x097a, B:444:0x0981, B:448:0x0985, B:450:0x098b, B:452:0x0994, B:454:0x099a, B:456:0x09a5, B:457:0x09c9, B:459:0x09cf, B:462:0x09d9, B:465:0x09f1, B:471:0x09ea, B:473:0x09ee, B:475:0x09ac, B:478:0x09ba, B:479:0x09c1, B:480:0x09c2, B:481:0x084e, B:483:0x0855, B:485:0x0859, B:488:0x08f6, B:490:0x0902, B:493:0x0866, B:495:0x086a, B:497:0x087e, B:498:0x088c, B:500:0x0898, B:503:0x08a1, B:505:0x08ab, B:510:0x08b6, B:516:0x090f, B:518:0x0916, B:520:0x091a, B:523:0x0923, B:525:0x0933, B:527:0x093b, B:529:0x0945, B:531:0x094a, B:533:0x094f, B:534:0x0954, B:536:0x080f, B:537:0x09f6, B:540:0x09fd, B:565:0x02ef, B:567:0x02f3, B:568:0x02f6, B:572:0x02fd, B:577:0x0301), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06e4 A[Catch: RuntimeException -> 0x0049, IOException -> 0x004d, zzty -> 0x0051, zzgh -> 0x0055, zzbo -> 0x0059, zzro -> 0x005d, zzij -> 0x0061, TryCatch #8 {zzbo -> 0x0059, zzgh -> 0x0055, zzij -> 0x0061, zzro -> 0x005d, zzty -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049, blocks: (B:3:0x0006, B:4:0x0013, B:7:0x0017, B:10:0x0033, B:15:0x0065, B:16:0x0075, B:17:0x008c, B:18:0x0090, B:19:0x0094, B:22:0x009b, B:24:0x00a4, B:26:0x00b2, B:28:0x00b9, B:29:0x00c3, B:30:0x00d7, B:31:0x00ef, B:32:0x0105, B:34:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0138, B:39:0x0154, B:40:0x0167, B:41:0x0170, B:43:0x0182, B:44:0x018e, B:45:0x019e, B:47:0x01aa, B:50:0x01b5, B:51:0x01bc, B:52:0x01c7, B:55:0x01ce, B:57:0x01d6, B:59:0x01da, B:61:0x01e0, B:63:0x01e8, B:65:0x01f0, B:67:0x01f3, B:72:0x01f8, B:81:0x0205, B:83:0x0206, B:86:0x020d, B:88:0x021b, B:89:0x021e, B:91:0x0223, B:93:0x0233, B:94:0x0236, B:95:0x023b, B:96:0x0240, B:98:0x024c, B:99:0x0258, B:101:0x0264, B:103:0x0290, B:104:0x02b0, B:549:0x02dc, B:551:0x02e0, B:552:0x02e3, B:561:0x02ee, B:105:0x0302, B:106:0x0307, B:107:0x030f, B:108:0x0321, B:110:0x0348, B:117:0x0460, B:118:0x042c, B:142:0x0428, B:157:0x046c, B:158:0x047a, B:166:0x036a, B:169:0x037d, B:171:0x038d, B:173:0x03a4, B:175:0x03ad, B:182:0x047b, B:184:0x0490, B:187:0x049a, B:189:0x04a9, B:191:0x04b5, B:193:0x04ca, B:194:0x04cf, B:195:0x04d3, B:197:0x04d7, B:198:0x04e4, B:201:0x0640, B:203:0x0648, B:205:0x0650, B:208:0x0655, B:209:0x0661, B:211:0x0667, B:213:0x066f, B:218:0x067f, B:220:0x0685, B:222:0x06a5, B:224:0x06ab, B:217:0x06b0, B:231:0x06b5, B:233:0x06b9, B:276:0x0772, B:235:0x06c2, B:237:0x06c6, B:239:0x06ce, B:241:0x06d4, B:243:0x06de, B:246:0x06e4, B:247:0x06e7, B:249:0x06f0, B:251:0x0702, B:253:0x070b, B:255:0x0713, B:258:0x071f, B:260:0x0746, B:261:0x0749, B:262:0x0754, B:264:0x075a, B:266:0x0760, B:268:0x0767, B:282:0x04f3, B:284:0x04f9, B:286:0x0504, B:289:0x050f, B:291:0x0514, B:294:0x0522, B:297:0x0528, B:299:0x0530, B:303:0x0533, B:305:0x053b, B:307:0x0549, B:309:0x0585, B:311:0x058f, B:314:0x059a, B:316:0x05a2, B:318:0x05a5, B:321:0x05a8, B:323:0x05ae, B:325:0x05bd, B:327:0x05c3, B:329:0x05cf, B:331:0x05d9, B:333:0x05ea, B:337:0x05f0, B:336:0x05fb, B:343:0x0600, B:345:0x0606, B:348:0x060b, B:350:0x0611, B:352:0x0619, B:354:0x061f, B:356:0x0625, B:360:0x0633, B:361:0x063a, B:363:0x063d, B:369:0x04e1, B:370:0x0776, B:375:0x0782, B:377:0x078a, B:378:0x078f, B:380:0x079b, B:381:0x07b5, B:383:0x07bb, B:385:0x07c3, B:387:0x07cc, B:390:0x07d5, B:394:0x07e4, B:399:0x07f1, B:401:0x07f7, B:408:0x0809, B:410:0x080c, B:419:0x0816, B:421:0x081c, B:425:0x0829, B:427:0x0831, B:429:0x0835, B:430:0x0840, B:432:0x0846, B:433:0x0957, B:436:0x095f, B:438:0x0964, B:440:0x096c, B:442:0x097a, B:444:0x0981, B:448:0x0985, B:450:0x098b, B:452:0x0994, B:454:0x099a, B:456:0x09a5, B:457:0x09c9, B:459:0x09cf, B:462:0x09d9, B:465:0x09f1, B:471:0x09ea, B:473:0x09ee, B:475:0x09ac, B:478:0x09ba, B:479:0x09c1, B:480:0x09c2, B:481:0x084e, B:483:0x0855, B:485:0x0859, B:488:0x08f6, B:490:0x0902, B:493:0x0866, B:495:0x086a, B:497:0x087e, B:498:0x088c, B:500:0x0898, B:503:0x08a1, B:505:0x08ab, B:510:0x08b6, B:516:0x090f, B:518:0x0916, B:520:0x091a, B:523:0x0923, B:525:0x0933, B:527:0x093b, B:529:0x0945, B:531:0x094a, B:533:0x094f, B:534:0x0954, B:536:0x080f, B:537:0x09f6, B:540:0x09fd, B:565:0x02ef, B:567:0x02f3, B:568:0x02f6, B:572:0x02fd, B:577:0x0301), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0702 A[Catch: RuntimeException -> 0x0049, IOException -> 0x004d, zzty -> 0x0051, zzgh -> 0x0055, zzbo -> 0x0059, zzro -> 0x005d, zzij -> 0x0061, TryCatch #8 {zzbo -> 0x0059, zzgh -> 0x0055, zzij -> 0x0061, zzro -> 0x005d, zzty -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049, blocks: (B:3:0x0006, B:4:0x0013, B:7:0x0017, B:10:0x0033, B:15:0x0065, B:16:0x0075, B:17:0x008c, B:18:0x0090, B:19:0x0094, B:22:0x009b, B:24:0x00a4, B:26:0x00b2, B:28:0x00b9, B:29:0x00c3, B:30:0x00d7, B:31:0x00ef, B:32:0x0105, B:34:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0138, B:39:0x0154, B:40:0x0167, B:41:0x0170, B:43:0x0182, B:44:0x018e, B:45:0x019e, B:47:0x01aa, B:50:0x01b5, B:51:0x01bc, B:52:0x01c7, B:55:0x01ce, B:57:0x01d6, B:59:0x01da, B:61:0x01e0, B:63:0x01e8, B:65:0x01f0, B:67:0x01f3, B:72:0x01f8, B:81:0x0205, B:83:0x0206, B:86:0x020d, B:88:0x021b, B:89:0x021e, B:91:0x0223, B:93:0x0233, B:94:0x0236, B:95:0x023b, B:96:0x0240, B:98:0x024c, B:99:0x0258, B:101:0x0264, B:103:0x0290, B:104:0x02b0, B:549:0x02dc, B:551:0x02e0, B:552:0x02e3, B:561:0x02ee, B:105:0x0302, B:106:0x0307, B:107:0x030f, B:108:0x0321, B:110:0x0348, B:117:0x0460, B:118:0x042c, B:142:0x0428, B:157:0x046c, B:158:0x047a, B:166:0x036a, B:169:0x037d, B:171:0x038d, B:173:0x03a4, B:175:0x03ad, B:182:0x047b, B:184:0x0490, B:187:0x049a, B:189:0x04a9, B:191:0x04b5, B:193:0x04ca, B:194:0x04cf, B:195:0x04d3, B:197:0x04d7, B:198:0x04e4, B:201:0x0640, B:203:0x0648, B:205:0x0650, B:208:0x0655, B:209:0x0661, B:211:0x0667, B:213:0x066f, B:218:0x067f, B:220:0x0685, B:222:0x06a5, B:224:0x06ab, B:217:0x06b0, B:231:0x06b5, B:233:0x06b9, B:276:0x0772, B:235:0x06c2, B:237:0x06c6, B:239:0x06ce, B:241:0x06d4, B:243:0x06de, B:246:0x06e4, B:247:0x06e7, B:249:0x06f0, B:251:0x0702, B:253:0x070b, B:255:0x0713, B:258:0x071f, B:260:0x0746, B:261:0x0749, B:262:0x0754, B:264:0x075a, B:266:0x0760, B:268:0x0767, B:282:0x04f3, B:284:0x04f9, B:286:0x0504, B:289:0x050f, B:291:0x0514, B:294:0x0522, B:297:0x0528, B:299:0x0530, B:303:0x0533, B:305:0x053b, B:307:0x0549, B:309:0x0585, B:311:0x058f, B:314:0x059a, B:316:0x05a2, B:318:0x05a5, B:321:0x05a8, B:323:0x05ae, B:325:0x05bd, B:327:0x05c3, B:329:0x05cf, B:331:0x05d9, B:333:0x05ea, B:337:0x05f0, B:336:0x05fb, B:343:0x0600, B:345:0x0606, B:348:0x060b, B:350:0x0611, B:352:0x0619, B:354:0x061f, B:356:0x0625, B:360:0x0633, B:361:0x063a, B:363:0x063d, B:369:0x04e1, B:370:0x0776, B:375:0x0782, B:377:0x078a, B:378:0x078f, B:380:0x079b, B:381:0x07b5, B:383:0x07bb, B:385:0x07c3, B:387:0x07cc, B:390:0x07d5, B:394:0x07e4, B:399:0x07f1, B:401:0x07f7, B:408:0x0809, B:410:0x080c, B:419:0x0816, B:421:0x081c, B:425:0x0829, B:427:0x0831, B:429:0x0835, B:430:0x0840, B:432:0x0846, B:433:0x0957, B:436:0x095f, B:438:0x0964, B:440:0x096c, B:442:0x097a, B:444:0x0981, B:448:0x0985, B:450:0x098b, B:452:0x0994, B:454:0x099a, B:456:0x09a5, B:457:0x09c9, B:459:0x09cf, B:462:0x09d9, B:465:0x09f1, B:471:0x09ea, B:473:0x09ee, B:475:0x09ac, B:478:0x09ba, B:479:0x09c1, B:480:0x09c2, B:481:0x084e, B:483:0x0855, B:485:0x0859, B:488:0x08f6, B:490:0x0902, B:493:0x0866, B:495:0x086a, B:497:0x087e, B:498:0x088c, B:500:0x0898, B:503:0x08a1, B:505:0x08ab, B:510:0x08b6, B:516:0x090f, B:518:0x0916, B:520:0x091a, B:523:0x0923, B:525:0x0933, B:527:0x093b, B:529:0x0945, B:531:0x094a, B:533:0x094f, B:534:0x0954, B:536:0x080f, B:537:0x09f6, B:540:0x09fd, B:565:0x02ef, B:567:0x02f3, B:568:0x02f6, B:572:0x02fd, B:577:0x0301), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0746 A[Catch: RuntimeException -> 0x0049, IOException -> 0x004d, zzty -> 0x0051, zzgh -> 0x0055, zzbo -> 0x0059, zzro -> 0x005d, zzij -> 0x0061, TryCatch #8 {zzbo -> 0x0059, zzgh -> 0x0055, zzij -> 0x0061, zzro -> 0x005d, zzty -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049, blocks: (B:3:0x0006, B:4:0x0013, B:7:0x0017, B:10:0x0033, B:15:0x0065, B:16:0x0075, B:17:0x008c, B:18:0x0090, B:19:0x0094, B:22:0x009b, B:24:0x00a4, B:26:0x00b2, B:28:0x00b9, B:29:0x00c3, B:30:0x00d7, B:31:0x00ef, B:32:0x0105, B:34:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0138, B:39:0x0154, B:40:0x0167, B:41:0x0170, B:43:0x0182, B:44:0x018e, B:45:0x019e, B:47:0x01aa, B:50:0x01b5, B:51:0x01bc, B:52:0x01c7, B:55:0x01ce, B:57:0x01d6, B:59:0x01da, B:61:0x01e0, B:63:0x01e8, B:65:0x01f0, B:67:0x01f3, B:72:0x01f8, B:81:0x0205, B:83:0x0206, B:86:0x020d, B:88:0x021b, B:89:0x021e, B:91:0x0223, B:93:0x0233, B:94:0x0236, B:95:0x023b, B:96:0x0240, B:98:0x024c, B:99:0x0258, B:101:0x0264, B:103:0x0290, B:104:0x02b0, B:549:0x02dc, B:551:0x02e0, B:552:0x02e3, B:561:0x02ee, B:105:0x0302, B:106:0x0307, B:107:0x030f, B:108:0x0321, B:110:0x0348, B:117:0x0460, B:118:0x042c, B:142:0x0428, B:157:0x046c, B:158:0x047a, B:166:0x036a, B:169:0x037d, B:171:0x038d, B:173:0x03a4, B:175:0x03ad, B:182:0x047b, B:184:0x0490, B:187:0x049a, B:189:0x04a9, B:191:0x04b5, B:193:0x04ca, B:194:0x04cf, B:195:0x04d3, B:197:0x04d7, B:198:0x04e4, B:201:0x0640, B:203:0x0648, B:205:0x0650, B:208:0x0655, B:209:0x0661, B:211:0x0667, B:213:0x066f, B:218:0x067f, B:220:0x0685, B:222:0x06a5, B:224:0x06ab, B:217:0x06b0, B:231:0x06b5, B:233:0x06b9, B:276:0x0772, B:235:0x06c2, B:237:0x06c6, B:239:0x06ce, B:241:0x06d4, B:243:0x06de, B:246:0x06e4, B:247:0x06e7, B:249:0x06f0, B:251:0x0702, B:253:0x070b, B:255:0x0713, B:258:0x071f, B:260:0x0746, B:261:0x0749, B:262:0x0754, B:264:0x075a, B:266:0x0760, B:268:0x0767, B:282:0x04f3, B:284:0x04f9, B:286:0x0504, B:289:0x050f, B:291:0x0514, B:294:0x0522, B:297:0x0528, B:299:0x0530, B:303:0x0533, B:305:0x053b, B:307:0x0549, B:309:0x0585, B:311:0x058f, B:314:0x059a, B:316:0x05a2, B:318:0x05a5, B:321:0x05a8, B:323:0x05ae, B:325:0x05bd, B:327:0x05c3, B:329:0x05cf, B:331:0x05d9, B:333:0x05ea, B:337:0x05f0, B:336:0x05fb, B:343:0x0600, B:345:0x0606, B:348:0x060b, B:350:0x0611, B:352:0x0619, B:354:0x061f, B:356:0x0625, B:360:0x0633, B:361:0x063a, B:363:0x063d, B:369:0x04e1, B:370:0x0776, B:375:0x0782, B:377:0x078a, B:378:0x078f, B:380:0x079b, B:381:0x07b5, B:383:0x07bb, B:385:0x07c3, B:387:0x07cc, B:390:0x07d5, B:394:0x07e4, B:399:0x07f1, B:401:0x07f7, B:408:0x0809, B:410:0x080c, B:419:0x0816, B:421:0x081c, B:425:0x0829, B:427:0x0831, B:429:0x0835, B:430:0x0840, B:432:0x0846, B:433:0x0957, B:436:0x095f, B:438:0x0964, B:440:0x096c, B:442:0x097a, B:444:0x0981, B:448:0x0985, B:450:0x098b, B:452:0x0994, B:454:0x099a, B:456:0x09a5, B:457:0x09c9, B:459:0x09cf, B:462:0x09d9, B:465:0x09f1, B:471:0x09ea, B:473:0x09ee, B:475:0x09ac, B:478:0x09ba, B:479:0x09c1, B:480:0x09c2, B:481:0x084e, B:483:0x0855, B:485:0x0859, B:488:0x08f6, B:490:0x0902, B:493:0x0866, B:495:0x086a, B:497:0x087e, B:498:0x088c, B:500:0x0898, B:503:0x08a1, B:505:0x08ab, B:510:0x08b6, B:516:0x090f, B:518:0x0916, B:520:0x091a, B:523:0x0923, B:525:0x0933, B:527:0x093b, B:529:0x0945, B:531:0x094a, B:533:0x094f, B:534:0x0954, B:536:0x080f, B:537:0x09f6, B:540:0x09fd, B:565:0x02ef, B:567:0x02f3, B:568:0x02f6, B:572:0x02fd, B:577:0x0301), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x075a A[Catch: RuntimeException -> 0x0049, IOException -> 0x004d, zzty -> 0x0051, zzgh -> 0x0055, zzbo -> 0x0059, zzro -> 0x005d, zzij -> 0x0061, TryCatch #8 {zzbo -> 0x0059, zzgh -> 0x0055, zzij -> 0x0061, zzro -> 0x005d, zzty -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049, blocks: (B:3:0x0006, B:4:0x0013, B:7:0x0017, B:10:0x0033, B:15:0x0065, B:16:0x0075, B:17:0x008c, B:18:0x0090, B:19:0x0094, B:22:0x009b, B:24:0x00a4, B:26:0x00b2, B:28:0x00b9, B:29:0x00c3, B:30:0x00d7, B:31:0x00ef, B:32:0x0105, B:34:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0138, B:39:0x0154, B:40:0x0167, B:41:0x0170, B:43:0x0182, B:44:0x018e, B:45:0x019e, B:47:0x01aa, B:50:0x01b5, B:51:0x01bc, B:52:0x01c7, B:55:0x01ce, B:57:0x01d6, B:59:0x01da, B:61:0x01e0, B:63:0x01e8, B:65:0x01f0, B:67:0x01f3, B:72:0x01f8, B:81:0x0205, B:83:0x0206, B:86:0x020d, B:88:0x021b, B:89:0x021e, B:91:0x0223, B:93:0x0233, B:94:0x0236, B:95:0x023b, B:96:0x0240, B:98:0x024c, B:99:0x0258, B:101:0x0264, B:103:0x0290, B:104:0x02b0, B:549:0x02dc, B:551:0x02e0, B:552:0x02e3, B:561:0x02ee, B:105:0x0302, B:106:0x0307, B:107:0x030f, B:108:0x0321, B:110:0x0348, B:117:0x0460, B:118:0x042c, B:142:0x0428, B:157:0x046c, B:158:0x047a, B:166:0x036a, B:169:0x037d, B:171:0x038d, B:173:0x03a4, B:175:0x03ad, B:182:0x047b, B:184:0x0490, B:187:0x049a, B:189:0x04a9, B:191:0x04b5, B:193:0x04ca, B:194:0x04cf, B:195:0x04d3, B:197:0x04d7, B:198:0x04e4, B:201:0x0640, B:203:0x0648, B:205:0x0650, B:208:0x0655, B:209:0x0661, B:211:0x0667, B:213:0x066f, B:218:0x067f, B:220:0x0685, B:222:0x06a5, B:224:0x06ab, B:217:0x06b0, B:231:0x06b5, B:233:0x06b9, B:276:0x0772, B:235:0x06c2, B:237:0x06c6, B:239:0x06ce, B:241:0x06d4, B:243:0x06de, B:246:0x06e4, B:247:0x06e7, B:249:0x06f0, B:251:0x0702, B:253:0x070b, B:255:0x0713, B:258:0x071f, B:260:0x0746, B:261:0x0749, B:262:0x0754, B:264:0x075a, B:266:0x0760, B:268:0x0767, B:282:0x04f3, B:284:0x04f9, B:286:0x0504, B:289:0x050f, B:291:0x0514, B:294:0x0522, B:297:0x0528, B:299:0x0530, B:303:0x0533, B:305:0x053b, B:307:0x0549, B:309:0x0585, B:311:0x058f, B:314:0x059a, B:316:0x05a2, B:318:0x05a5, B:321:0x05a8, B:323:0x05ae, B:325:0x05bd, B:327:0x05c3, B:329:0x05cf, B:331:0x05d9, B:333:0x05ea, B:337:0x05f0, B:336:0x05fb, B:343:0x0600, B:345:0x0606, B:348:0x060b, B:350:0x0611, B:352:0x0619, B:354:0x061f, B:356:0x0625, B:360:0x0633, B:361:0x063a, B:363:0x063d, B:369:0x04e1, B:370:0x0776, B:375:0x0782, B:377:0x078a, B:378:0x078f, B:380:0x079b, B:381:0x07b5, B:383:0x07bb, B:385:0x07c3, B:387:0x07cc, B:390:0x07d5, B:394:0x07e4, B:399:0x07f1, B:401:0x07f7, B:408:0x0809, B:410:0x080c, B:419:0x0816, B:421:0x081c, B:425:0x0829, B:427:0x0831, B:429:0x0835, B:430:0x0840, B:432:0x0846, B:433:0x0957, B:436:0x095f, B:438:0x0964, B:440:0x096c, B:442:0x097a, B:444:0x0981, B:448:0x0985, B:450:0x098b, B:452:0x0994, B:454:0x099a, B:456:0x09a5, B:457:0x09c9, B:459:0x09cf, B:462:0x09d9, B:465:0x09f1, B:471:0x09ea, B:473:0x09ee, B:475:0x09ac, B:478:0x09ba, B:479:0x09c1, B:480:0x09c2, B:481:0x084e, B:483:0x0855, B:485:0x0859, B:488:0x08f6, B:490:0x0902, B:493:0x0866, B:495:0x086a, B:497:0x087e, B:498:0x088c, B:500:0x0898, B:503:0x08a1, B:505:0x08ab, B:510:0x08b6, B:516:0x090f, B:518:0x0916, B:520:0x091a, B:523:0x0923, B:525:0x0933, B:527:0x093b, B:529:0x0945, B:531:0x094a, B:533:0x094f, B:534:0x0954, B:536:0x080f, B:537:0x09f6, B:540:0x09fd, B:565:0x02ef, B:567:0x02f3, B:568:0x02f6, B:572:0x02fd, B:577:0x0301), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x09cf A[Catch: RuntimeException -> 0x0049, IOException -> 0x004d, zzty -> 0x0051, zzgh -> 0x0055, zzbo -> 0x0059, zzro -> 0x005d, zzij -> 0x0061, TryCatch #8 {zzbo -> 0x0059, zzgh -> 0x0055, zzij -> 0x0061, zzro -> 0x005d, zzty -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049, blocks: (B:3:0x0006, B:4:0x0013, B:7:0x0017, B:10:0x0033, B:15:0x0065, B:16:0x0075, B:17:0x008c, B:18:0x0090, B:19:0x0094, B:22:0x009b, B:24:0x00a4, B:26:0x00b2, B:28:0x00b9, B:29:0x00c3, B:30:0x00d7, B:31:0x00ef, B:32:0x0105, B:34:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0138, B:39:0x0154, B:40:0x0167, B:41:0x0170, B:43:0x0182, B:44:0x018e, B:45:0x019e, B:47:0x01aa, B:50:0x01b5, B:51:0x01bc, B:52:0x01c7, B:55:0x01ce, B:57:0x01d6, B:59:0x01da, B:61:0x01e0, B:63:0x01e8, B:65:0x01f0, B:67:0x01f3, B:72:0x01f8, B:81:0x0205, B:83:0x0206, B:86:0x020d, B:88:0x021b, B:89:0x021e, B:91:0x0223, B:93:0x0233, B:94:0x0236, B:95:0x023b, B:96:0x0240, B:98:0x024c, B:99:0x0258, B:101:0x0264, B:103:0x0290, B:104:0x02b0, B:549:0x02dc, B:551:0x02e0, B:552:0x02e3, B:561:0x02ee, B:105:0x0302, B:106:0x0307, B:107:0x030f, B:108:0x0321, B:110:0x0348, B:117:0x0460, B:118:0x042c, B:142:0x0428, B:157:0x046c, B:158:0x047a, B:166:0x036a, B:169:0x037d, B:171:0x038d, B:173:0x03a4, B:175:0x03ad, B:182:0x047b, B:184:0x0490, B:187:0x049a, B:189:0x04a9, B:191:0x04b5, B:193:0x04ca, B:194:0x04cf, B:195:0x04d3, B:197:0x04d7, B:198:0x04e4, B:201:0x0640, B:203:0x0648, B:205:0x0650, B:208:0x0655, B:209:0x0661, B:211:0x0667, B:213:0x066f, B:218:0x067f, B:220:0x0685, B:222:0x06a5, B:224:0x06ab, B:217:0x06b0, B:231:0x06b5, B:233:0x06b9, B:276:0x0772, B:235:0x06c2, B:237:0x06c6, B:239:0x06ce, B:241:0x06d4, B:243:0x06de, B:246:0x06e4, B:247:0x06e7, B:249:0x06f0, B:251:0x0702, B:253:0x070b, B:255:0x0713, B:258:0x071f, B:260:0x0746, B:261:0x0749, B:262:0x0754, B:264:0x075a, B:266:0x0760, B:268:0x0767, B:282:0x04f3, B:284:0x04f9, B:286:0x0504, B:289:0x050f, B:291:0x0514, B:294:0x0522, B:297:0x0528, B:299:0x0530, B:303:0x0533, B:305:0x053b, B:307:0x0549, B:309:0x0585, B:311:0x058f, B:314:0x059a, B:316:0x05a2, B:318:0x05a5, B:321:0x05a8, B:323:0x05ae, B:325:0x05bd, B:327:0x05c3, B:329:0x05cf, B:331:0x05d9, B:333:0x05ea, B:337:0x05f0, B:336:0x05fb, B:343:0x0600, B:345:0x0606, B:348:0x060b, B:350:0x0611, B:352:0x0619, B:354:0x061f, B:356:0x0625, B:360:0x0633, B:361:0x063a, B:363:0x063d, B:369:0x04e1, B:370:0x0776, B:375:0x0782, B:377:0x078a, B:378:0x078f, B:380:0x079b, B:381:0x07b5, B:383:0x07bb, B:385:0x07c3, B:387:0x07cc, B:390:0x07d5, B:394:0x07e4, B:399:0x07f1, B:401:0x07f7, B:408:0x0809, B:410:0x080c, B:419:0x0816, B:421:0x081c, B:425:0x0829, B:427:0x0831, B:429:0x0835, B:430:0x0840, B:432:0x0846, B:433:0x0957, B:436:0x095f, B:438:0x0964, B:440:0x096c, B:442:0x097a, B:444:0x0981, B:448:0x0985, B:450:0x098b, B:452:0x0994, B:454:0x099a, B:456:0x09a5, B:457:0x09c9, B:459:0x09cf, B:462:0x09d9, B:465:0x09f1, B:471:0x09ea, B:473:0x09ee, B:475:0x09ac, B:478:0x09ba, B:479:0x09c1, B:480:0x09c2, B:481:0x084e, B:483:0x0855, B:485:0x0859, B:488:0x08f6, B:490:0x0902, B:493:0x0866, B:495:0x086a, B:497:0x087e, B:498:0x088c, B:500:0x0898, B:503:0x08a1, B:505:0x08ab, B:510:0x08b6, B:516:0x090f, B:518:0x0916, B:520:0x091a, B:523:0x0923, B:525:0x0933, B:527:0x093b, B:529:0x0945, B:531:0x094a, B:533:0x094f, B:534:0x0954, B:536:0x080f, B:537:0x09f6, B:540:0x09fd, B:565:0x02ef, B:567:0x02f3, B:568:0x02f6, B:572:0x02fd, B:577:0x0301), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x09e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0902 A[Catch: RuntimeException -> 0x0049, IOException -> 0x004d, zzty -> 0x0051, zzgh -> 0x0055, zzbo -> 0x0059, zzro -> 0x005d, zzij -> 0x0061, TryCatch #8 {zzbo -> 0x0059, zzgh -> 0x0055, zzij -> 0x0061, zzro -> 0x005d, zzty -> 0x0051, IOException -> 0x004d, RuntimeException -> 0x0049, blocks: (B:3:0x0006, B:4:0x0013, B:7:0x0017, B:10:0x0033, B:15:0x0065, B:16:0x0075, B:17:0x008c, B:18:0x0090, B:19:0x0094, B:22:0x009b, B:24:0x00a4, B:26:0x00b2, B:28:0x00b9, B:29:0x00c3, B:30:0x00d7, B:31:0x00ef, B:32:0x0105, B:34:0x0114, B:35:0x0118, B:36:0x0129, B:38:0x0138, B:39:0x0154, B:40:0x0167, B:41:0x0170, B:43:0x0182, B:44:0x018e, B:45:0x019e, B:47:0x01aa, B:50:0x01b5, B:51:0x01bc, B:52:0x01c7, B:55:0x01ce, B:57:0x01d6, B:59:0x01da, B:61:0x01e0, B:63:0x01e8, B:65:0x01f0, B:67:0x01f3, B:72:0x01f8, B:81:0x0205, B:83:0x0206, B:86:0x020d, B:88:0x021b, B:89:0x021e, B:91:0x0223, B:93:0x0233, B:94:0x0236, B:95:0x023b, B:96:0x0240, B:98:0x024c, B:99:0x0258, B:101:0x0264, B:103:0x0290, B:104:0x02b0, B:549:0x02dc, B:551:0x02e0, B:552:0x02e3, B:561:0x02ee, B:105:0x0302, B:106:0x0307, B:107:0x030f, B:108:0x0321, B:110:0x0348, B:117:0x0460, B:118:0x042c, B:142:0x0428, B:157:0x046c, B:158:0x047a, B:166:0x036a, B:169:0x037d, B:171:0x038d, B:173:0x03a4, B:175:0x03ad, B:182:0x047b, B:184:0x0490, B:187:0x049a, B:189:0x04a9, B:191:0x04b5, B:193:0x04ca, B:194:0x04cf, B:195:0x04d3, B:197:0x04d7, B:198:0x04e4, B:201:0x0640, B:203:0x0648, B:205:0x0650, B:208:0x0655, B:209:0x0661, B:211:0x0667, B:213:0x066f, B:218:0x067f, B:220:0x0685, B:222:0x06a5, B:224:0x06ab, B:217:0x06b0, B:231:0x06b5, B:233:0x06b9, B:276:0x0772, B:235:0x06c2, B:237:0x06c6, B:239:0x06ce, B:241:0x06d4, B:243:0x06de, B:246:0x06e4, B:247:0x06e7, B:249:0x06f0, B:251:0x0702, B:253:0x070b, B:255:0x0713, B:258:0x071f, B:260:0x0746, B:261:0x0749, B:262:0x0754, B:264:0x075a, B:266:0x0760, B:268:0x0767, B:282:0x04f3, B:284:0x04f9, B:286:0x0504, B:289:0x050f, B:291:0x0514, B:294:0x0522, B:297:0x0528, B:299:0x0530, B:303:0x0533, B:305:0x053b, B:307:0x0549, B:309:0x0585, B:311:0x058f, B:314:0x059a, B:316:0x05a2, B:318:0x05a5, B:321:0x05a8, B:323:0x05ae, B:325:0x05bd, B:327:0x05c3, B:329:0x05cf, B:331:0x05d9, B:333:0x05ea, B:337:0x05f0, B:336:0x05fb, B:343:0x0600, B:345:0x0606, B:348:0x060b, B:350:0x0611, B:352:0x0619, B:354:0x061f, B:356:0x0625, B:360:0x0633, B:361:0x063a, B:363:0x063d, B:369:0x04e1, B:370:0x0776, B:375:0x0782, B:377:0x078a, B:378:0x078f, B:380:0x079b, B:381:0x07b5, B:383:0x07bb, B:385:0x07c3, B:387:0x07cc, B:390:0x07d5, B:394:0x07e4, B:399:0x07f1, B:401:0x07f7, B:408:0x0809, B:410:0x080c, B:419:0x0816, B:421:0x081c, B:425:0x0829, B:427:0x0831, B:429:0x0835, B:430:0x0840, B:432:0x0846, B:433:0x0957, B:436:0x095f, B:438:0x0964, B:440:0x096c, B:442:0x097a, B:444:0x0981, B:448:0x0985, B:450:0x098b, B:452:0x0994, B:454:0x099a, B:456:0x09a5, B:457:0x09c9, B:459:0x09cf, B:462:0x09d9, B:465:0x09f1, B:471:0x09ea, B:473:0x09ee, B:475:0x09ac, B:478:0x09ba, B:479:0x09c1, B:480:0x09c2, B:481:0x084e, B:483:0x0855, B:485:0x0859, B:488:0x08f6, B:490:0x0902, B:493:0x0866, B:495:0x086a, B:497:0x087e, B:498:0x088c, B:500:0x0898, B:503:0x08a1, B:505:0x08ab, B:510:0x08b6, B:516:0x090f, B:518:0x0916, B:520:0x091a, B:523:0x0923, B:525:0x0933, B:527:0x093b, B:529:0x0945, B:531:0x094a, B:533:0x094f, B:534:0x0954, B:536:0x080f, B:537:0x09f6, B:540:0x09fd, B:565:0x02ef, B:567:0x02f3, B:568:0x02f6, B:572:0x02fd, B:577:0x0301), top: B:2:0x0006 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r39) {
        /*
            Method dump skipped, instructions count: 2894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkk.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zza(zzbq zzbqVar) {
        this.zzi.zzc(16, zzbqVar).zza();
    }

    public final Looper zzc() {
        return this.zzk;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzf(zzwp zzwpVar) {
        this.zzi.zzc(9, (zzuw) zzwpVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final void zzg() {
        this.zzi.zzf(2);
        this.zzi.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final void zzh(zzuw zzuwVar) {
        this.zzi.zzc(8, zzuwVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final void zzi() {
        this.zzi.zzi(10);
    }

    public final void zzj() {
        this.zzi.zzb(29).zza();
    }

    public final void zzk(zzcc zzccVar, int i2, long j2) {
        this.zzi.zzc(3, new zzkj(zzccVar, i2, j2)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final synchronized void zzl(zzln zzlnVar) {
        if (!this.zzy && this.zzk.getThread().isAlive()) {
            this.zzi.zzc(14, zzlnVar).zza();
            return;
        }
        zzea.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlnVar.zzh(false);
    }

    public final void zzm(boolean z2, int i2, int i3) {
        this.zzi.zzd(1, z2 ? 1 : 0, i2 | (i3 << 4)).zza();
    }

    public final void zzn() {
        this.zzi.zzb(6).zza();
    }

    public final synchronized boolean zzo() {
        if (!this.zzy && this.zzk.getThread().isAlive()) {
            this.zzi.zzi(7);
            zzac(new zzka(this), this.zzt);
            return this.zzy;
        }
        return true;
    }

    public final void zzp(List list, int i2, long j2, zzwq zzwqVar) {
        this.zzi.zzc(17, new zzkf(list, zzwqVar, i2, j2, null)).zza();
    }
}
