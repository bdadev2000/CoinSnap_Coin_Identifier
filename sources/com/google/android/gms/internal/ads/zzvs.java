package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzvs implements zzup, zzacu, zzyy, zzzc, zzwd {
    private static final Map zzb;
    private static final zzad zzc;
    private zzadq zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private boolean zzH;
    private long zzI;
    private boolean zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private final zzys zzO;
    private final Uri zzd;
    private final zzgd zze;
    private final zzrp zzf;
    private final zzva zzg;
    private final zzrk zzh;
    private final zzvo zzi;
    private final long zzj;
    private final long zzk;
    private final zzvh zzm;

    @Nullable
    private zzuo zzr;

    @Nullable
    private zzafv zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvr zzz;
    private final zzzg zzl = new zzzg("ProgressiveMediaPeriod");
    private final zzdf zzn = new zzdf(zzdc.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvj
        @Override // java.lang.Runnable
        public final void run() {
            zzvs.this.zzU();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvk
        @Override // java.lang.Runnable
        public final void run() {
            zzvs.this.zzE();
        }
    };
    private final Handler zzq = zzen.zzy(null);
    private zzvq[] zzu = new zzvq[0];
    private zzwf[] zzt = new zzwf[0];
    private long zzJ = C.TIME_UNSET;
    private int zzD = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzab zzabVar = new zzab();
        zzabVar.zzL("icy");
        zzabVar.zzZ("application/x-icy");
        zzc = zzabVar.zzaf();
    }

    public zzvs(Uri uri, zzgd zzgdVar, zzvh zzvhVar, zzrp zzrpVar, zzrk zzrkVar, zzyw zzywVar, zzva zzvaVar, zzvo zzvoVar, zzys zzysVar, @Nullable String str, int i10, long j3) {
        this.zzd = uri;
        this.zze = zzgdVar;
        this.zzf = zzrpVar;
        this.zzh = zzrkVar;
        this.zzg = zzvaVar;
        this.zzi = zzvoVar;
        this.zzO = zzysVar;
        this.zzj = i10;
        this.zzm = zzvhVar;
        this.zzk = j3;
    }

    private final int zzQ() {
        int i10 = 0;
        for (zzwf zzwfVar : this.zzt) {
            i10 += zzwfVar.zzd();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzR(boolean z10) {
        int i10 = 0;
        long j3 = Long.MIN_VALUE;
        while (true) {
            zzwf[] zzwfVarArr = this.zzt;
            if (i10 < zzwfVarArr.length) {
                if (!z10) {
                    zzvr zzvrVar = this.zzz;
                    zzvrVar.getClass();
                    if (!zzvrVar.zzc[i10]) {
                        i10++;
                    }
                }
                j3 = Math.max(j3, zzwfVarArr[i10].zzh());
                i10++;
            } else {
                return j3;
            }
        }
    }

    private final zzadx zzS(zzvq zzvqVar) {
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzvqVar.equals(this.zzu[i10])) {
                return this.zzt[i10];
            }
        }
        if (this.zzv) {
            zzdt.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + zzvqVar.zza + ") after finishing tracks.");
            return new zzacm();
        }
        zzwf zzwfVar = new zzwf(this.zzO, this.zzf, this.zzh);
        zzwfVar.zzu(this);
        int i11 = length + 1;
        zzvq[] zzvqVarArr = (zzvq[]) Arrays.copyOf(this.zzu, i11);
        zzvqVarArr[length] = zzvqVar;
        int i12 = zzen.zza;
        this.zzu = zzvqVarArr;
        zzwf[] zzwfVarArr = (zzwf[]) Arrays.copyOf(this.zzt, i11);
        zzwfVarArr[length] = zzwfVar;
        this.zzt = zzwfVarArr;
        return zzwfVar;
    }

    private final void zzT() {
        zzdb.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        boolean z10;
        boolean z11;
        zzbd zzc2;
        int i10;
        if (!this.zzN && !this.zzw && this.zzv && this.zzA != null) {
            for (zzwf zzwfVar : this.zzt) {
                if (zzwfVar.zzi() == null) {
                    return;
                }
            }
            this.zzn.zzc();
            int length = this.zzt.length;
            zzbw[] zzbwVarArr = new zzbw[length];
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                zzad zzi = this.zzt[i11].zzi();
                zzi.getClass();
                String str = zzi.zzo;
                boolean zzg = zzbg.zzg(str);
                if (!zzg && !zzbg.zzi(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i11] = z10;
                this.zzx = z10 | this.zzx;
                boolean zzh = zzbg.zzh(str);
                if (this.zzk != C.TIME_UNSET && length == 1 && zzh) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.zzy = z11;
                zzafv zzafvVar = this.zzs;
                if (zzafvVar != null) {
                    if (zzg || this.zzu[i11].zzb) {
                        zzbd zzbdVar = zzi.zzl;
                        if (zzbdVar == null) {
                            zzc2 = new zzbd(C.TIME_UNSET, zzafvVar);
                        } else {
                            zzc2 = zzbdVar.zzc(zzafvVar);
                        }
                        zzab zzb2 = zzi.zzb();
                        zzb2.zzS(zzc2);
                        zzi = zzb2.zzaf();
                    }
                    if (zzg && zzi.zzh == -1 && zzi.zzi == -1 && (i10 = zzafvVar.zza) != -1) {
                        zzab zzb3 = zzi.zzb();
                        zzb3.zzy(i10);
                        zzi = zzb3.zzaf();
                    }
                }
                zzbwVarArr[i11] = new zzbw(Integer.toString(i11), zzi.zzc(this.zzf.zza(zzi)));
            }
            this.zzz = new zzvr(new zzwr(zzbwVarArr), zArr);
            if (this.zzy && this.zzB == C.TIME_UNSET) {
                this.zzB = this.zzk;
                this.zzA = new zzvm(this, this.zzA);
            }
            this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
            this.zzw = true;
            zzuo zzuoVar = this.zzr;
            zzuoVar.getClass();
            zzuoVar.zzi(this);
        }
    }

    private final void zzV(int i10) {
        zzT();
        zzvr zzvrVar = this.zzz;
        boolean[] zArr = zzvrVar.zzd;
        if (!zArr[i10]) {
            zzad zzb2 = zzvrVar.zza.zzb(i10).zzb(0);
            this.zzg.zzc(new zzun(1, zzbg.zzb(zzb2.zzo), zzb2, 0, null, zzen.zzv(this.zzI), C.TIME_UNSET));
            zArr[i10] = true;
        }
    }

    private final void zzW(int i10) {
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (this.zzK && zArr[i10] && !this.zzt[i10].zzx(false)) {
            this.zzJ = 0L;
            this.zzK = false;
            this.zzF = true;
            this.zzI = 0L;
            this.zzL = 0;
            for (zzwf zzwfVar : this.zzt) {
                zzwfVar.zzp(false);
            }
            zzuo zzuoVar = this.zzr;
            zzuoVar.getClass();
            zzuoVar.zzg(this);
        }
    }

    private final void zzX() {
        zzvn zzvnVar = new zzvn(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzdb.zzf(zzY());
            long j3 = this.zzB;
            if (j3 != C.TIME_UNSET && this.zzJ > j3) {
                this.zzM = true;
                this.zzJ = C.TIME_UNSET;
                return;
            }
            zzadq zzadqVar = this.zzA;
            zzadqVar.getClass();
            zzvn.zzf(zzvnVar, zzadqVar.zzg(this.zzJ).zza.zzc, this.zzJ);
            for (zzwf zzwfVar : this.zzt) {
                zzwfVar.zzt(this.zzJ);
            }
            this.zzJ = C.TIME_UNSET;
        }
        this.zzL = zzQ();
        long zza = this.zzl.zza(zzvnVar, this, zzyw.zza(this.zzD));
        this.zzg.zzg(new zzui(zzvn.zzb(zzvnVar), zzvn.zzd(zzvnVar), zza), new zzun(1, -1, null, 0, null, zzen.zzv(zzvn.zzc(zzvnVar)), zzen.zzv(this.zzB)));
    }

    private final boolean zzY() {
        return this.zzJ != C.TIME_UNSET;
    }

    private final boolean zzZ() {
        return this.zzF || zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    public final /* synthetic */ void zzE() {
        if (!this.zzN) {
            zzuo zzuoVar = this.zzr;
            zzuoVar.getClass();
            zzuoVar.zzg(this);
        }
    }

    public final /* synthetic */ void zzF() {
        this.zzH = true;
    }

    public final /* synthetic */ void zzG(zzadq zzadqVar) {
        zzadq zzadpVar;
        if (this.zzs == null) {
            zzadpVar = zzadqVar;
        } else {
            zzadpVar = new zzadp(C.TIME_UNSET, 0L);
        }
        this.zzA = zzadpVar;
        this.zzB = zzadqVar.zza();
        boolean z10 = false;
        int i10 = 1;
        if (!this.zzH && zzadqVar.zza() == C.TIME_UNSET) {
            z10 = true;
        }
        this.zzC = z10;
        if (true == z10) {
            i10 = 7;
        }
        this.zzD = i10;
        if (this.zzw) {
            this.zzi.zza(this.zzB, zzadqVar.zzh(), this.zzC);
        } else {
            zzU();
        }
    }

    public final void zzH() throws IOException {
        this.zzl.zzi(zzyw.zza(this.zzD));
    }

    public final void zzI(int i10) throws IOException {
        this.zzt[i10].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzyy
    public final /* bridge */ /* synthetic */ void zzJ(zzzb zzzbVar, long j3, long j10, boolean z10) {
        zzvn zzvnVar = (zzvn) zzzbVar;
        zzhc zze = zzvn.zze(zzvnVar);
        zzui zzuiVar = new zzui(zzvn.zzb(zzvnVar), zzvn.zzd(zzvnVar), zze.zzh(), zze.zzi(), j3, j10, zze.zzg());
        zzvn.zzb(zzvnVar);
        this.zzg.zzd(zzuiVar, new zzun(1, -1, null, 0, null, zzen.zzv(zzvn.zzc(zzvnVar)), zzen.zzv(this.zzB)));
        if (!z10) {
            for (zzwf zzwfVar : this.zzt) {
                zzwfVar.zzp(false);
            }
            if (this.zzG > 0) {
                zzuo zzuoVar = this.zzr;
                zzuoVar.getClass();
                zzuoVar.zzg(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyy
    public final /* bridge */ /* synthetic */ void zzK(zzzb zzzbVar, long j3, long j10) {
        zzadq zzadqVar;
        long j11;
        zzvn zzvnVar = (zzvn) zzzbVar;
        if (this.zzB == C.TIME_UNSET && (zzadqVar = this.zzA) != null) {
            boolean zzh = zzadqVar.zzh();
            long zzR = zzR(true);
            if (zzR == Long.MIN_VALUE) {
                j11 = 0;
            } else {
                j11 = zzR + 10000;
            }
            this.zzB = j11;
            this.zzi.zza(j11, zzh, this.zzC);
        }
        zzhc zze = zzvn.zze(zzvnVar);
        zzui zzuiVar = new zzui(zzvn.zzb(zzvnVar), zzvn.zzd(zzvnVar), zze.zzh(), zze.zzi(), j3, j10, zze.zzg());
        zzvn.zzb(zzvnVar);
        this.zzg.zze(zzuiVar, new zzun(1, -1, null, 0, null, zzen.zzv(zzvn.zzc(zzvnVar)), zzen.zzv(this.zzB)));
        this.zzM = true;
        zzuo zzuoVar = this.zzr;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzL() {
        for (zzwf zzwfVar : this.zzt) {
            zzwfVar.zzo();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzM(zzad zzadVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzwf zzwfVar : this.zzt) {
                zzwfVar.zzn();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzN = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzO(final zzadq zzadqVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvl
            @Override // java.lang.Runnable
            public final void run() {
                zzvs.this.zzG(zzadqVar);
            }
        });
    }

    public final boolean zzP(int i10) {
        return !zzZ() && this.zzt[i10].zzx(this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j3, zzls zzlsVar) {
        boolean z10;
        zzT();
        if (!this.zzA.zzh()) {
            return 0L;
        }
        zzado zzg = this.zzA.zzg(j3);
        zzadr zzadrVar = zzg.zza;
        zzadr zzadrVar2 = zzg.zzb;
        long j10 = zzlsVar.zzc;
        if (j10 == 0) {
            if (zzlsVar.zzd == 0) {
                return j3;
            }
            j10 = 0;
        }
        long j11 = zzadrVar.zzb;
        int i10 = zzen.zza;
        long j12 = j3 - j10;
        long j13 = zzlsVar.zzd;
        long j14 = j3 + j13;
        long j15 = j3 ^ j14;
        long j16 = j13 ^ j14;
        if (((j3 ^ j10) & (j3 ^ j12)) < 0) {
            j12 = Long.MIN_VALUE;
        }
        if ((j15 & j16) < 0) {
            j14 = Long.MAX_VALUE;
        }
        boolean z11 = true;
        if (j12 <= j11 && j11 <= j14) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j17 = zzadrVar2.zzb;
        if (j12 > j17 || j17 > j14) {
            z11 = false;
        }
        if (z10 && z11) {
            if (Math.abs(j11 - j3) > Math.abs(j17 - j3)) {
                return j17;
            }
        } else if (!z10) {
            if (z11) {
                return j17;
            }
            return j12;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long j3;
        zzT();
        if (this.zzM || this.zzG == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzJ;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzvr zzvrVar = this.zzz;
                if (zzvrVar.zzb[i10] && zzvrVar.zzc[i10] && !this.zzt[i10].zzw()) {
                    j3 = Math.min(j3, this.zzt[i10].zzh());
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = zzR(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.zzI;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        if (!this.zzF) {
            return C.TIME_UNSET;
        }
        if (!this.zzM && zzQ() <= this.zzL) {
            return C.TIME_UNSET;
        }
        this.zzF = false;
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j3) {
        boolean zzz;
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j3 = 0;
        }
        this.zzF = false;
        this.zzI = j3;
        if (zzY()) {
            this.zzJ = j3;
            return j3;
        }
        if (this.zzD != 7 && (this.zzM || this.zzl.zzl())) {
            int length = this.zzt.length;
            for (int i10 = 0; i10 < length; i10++) {
                zzwf zzwfVar = this.zzt[i10];
                if (this.zzy) {
                    zzz = zzwfVar.zzy(zzwfVar.zza());
                } else {
                    zzz = zzwfVar.zzz(j3, false);
                }
                if (zzz || (!zArr[i10] && this.zzx)) {
                }
            }
            return j3;
        }
        this.zzK = false;
        this.zzJ = j3;
        this.zzM = false;
        zzzg zzzgVar = this.zzl;
        if (zzzgVar.zzl()) {
            for (zzwf zzwfVar2 : this.zzt) {
                zzwfVar2.zzk();
            }
            this.zzl.zzg();
        } else {
            zzzgVar.zzh();
            for (zzwf zzwfVar3 : this.zzt) {
                zzwfVar3.zzp(false);
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j3) {
        boolean z10;
        zzyd zzydVar;
        boolean z11;
        boolean z12;
        zzT();
        zzvr zzvrVar = this.zzz;
        zzwr zzwrVar = zzvrVar.zza;
        boolean[] zArr3 = zzvrVar.zzc;
        int i10 = this.zzG;
        int i11 = 0;
        for (int i12 = 0; i12 < zzydVarArr.length; i12++) {
            zzwg zzwgVar = zzwgVarArr[i12];
            if (zzwgVar != null && (zzydVarArr[i12] == null || !zArr[i12])) {
                int zzc2 = zzvp.zzc((zzvp) zzwgVar);
                zzdb.zzf(zArr3[zzc2]);
                this.zzG--;
                zArr3[zzc2] = false;
                zzwgVarArr[i12] = null;
            }
        }
        if (!this.zzE ? !(j3 == 0 || this.zzy) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < zzydVarArr.length; i13++) {
            if (zzwgVarArr[i13] == null && (zzydVar = zzydVarArr[i13]) != null) {
                if (zzydVar.zzc() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzdb.zzf(z11);
                if (zzydVar.zza(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zzdb.zzf(z12);
                int zza = zzwrVar.zza(zzydVar.zze());
                zzdb.zzf(!zArr3[zza]);
                this.zzG++;
                zArr3[zza] = true;
                zzwgVarArr[i13] = new zzvp(this, zza);
                zArr2[i13] = true;
                if (!z10) {
                    zzwf zzwfVar = this.zzt[zza];
                    if (zzwfVar.zzb() != 0 && !zzwfVar.zzz(j3, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.zzG == 0) {
            this.zzK = false;
            this.zzF = false;
            if (this.zzl.zzl()) {
                zzwf[] zzwfVarArr = this.zzt;
                int length = zzwfVarArr.length;
                while (i11 < length) {
                    zzwfVarArr[i11].zzk();
                    i11++;
                }
                this.zzl.zzg();
            } else {
                this.zzM = false;
                for (zzwf zzwfVar2 : this.zzt) {
                    zzwfVar2.zzp(false);
                }
            }
        } else if (z10) {
            j3 = zze(j3);
            while (i11 < zzwgVarArr.length) {
                if (zzwgVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.zzE = true;
        return j3;
    }

    public final int zzg(int i10, zzkj zzkjVar, zzhm zzhmVar, int i11) {
        if (zzZ()) {
            return -3;
        }
        zzV(i10);
        int zze = this.zzt[i10].zze(zzkjVar, zzhmVar, i11, this.zzM);
        if (zze == -3) {
            zzW(i10);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        zzT();
        return this.zzz.zza;
    }

    public final int zzi(int i10, long j3) {
        if (zzZ()) {
            return 0;
        }
        zzV(i10);
        zzwf zzwfVar = this.zzt[i10];
        int zzc2 = zzwfVar.zzc(j3, this.zzM);
        zzwfVar.zzv(zzc2);
        if (zzc2 == 0) {
            zzW(i10);
            return 0;
        }
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j3, boolean z10) {
        if (!this.zzy) {
            zzT();
            if (!zzY()) {
                boolean[] zArr = this.zzz.zzc;
                int length = this.zzt.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.zzt[i10].zzj(j3, false, zArr[i10]);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        zzH();
        if (this.zzM && !this.zzw) {
            throw zzbh.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j3) {
        this.zzr = zzuoVar;
        this.zzn.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        if (!this.zzM) {
            zzzg zzzgVar = this.zzl;
            if (!zzzgVar.zzk() && !this.zzK) {
                if (!this.zzw || this.zzG != 0) {
                    boolean zze = this.zzn.zze();
                    if (!zzzgVar.zzl()) {
                        zzX();
                        return true;
                    }
                    return zze;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyz zzu(com.google.android.gms.internal.ads.zzzb r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvs.zzu(com.google.android.gms.internal.ads.zzzb, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzyz");
    }

    public final zzadx zzv() {
        return zzS(new zzvq(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final zzadx zzw(int i10, int i11) {
        return zzS(new zzvq(i10, false));
    }
}
