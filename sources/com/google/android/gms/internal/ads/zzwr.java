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
/* loaded from: classes2.dex */
public final class zzwr implements zzvm, zzadx, zzaaa, zzaaf, zzxd {
    private static final Map zzb;
    private static final zzan zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzzz zzN;
    private final zzzv zzO;
    private final Uri zzd;
    private final zzhb zze;
    private final zzst zzf;
    private final zzvx zzg;
    private final zzso zzh;
    private final zzwn zzi;
    private final long zzj;
    private final zzaai zzk = new zzaai("ProgressiveMediaPeriod");
    private final zzwg zzl;
    private final zzeu zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;

    @Nullable
    private zzvl zzr;

    @Nullable
    private zzaha zzs;
    private zzxe[] zzt;
    private zzwp[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzwq zzy;
    private zzaet zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzal zzalVar = new zzal();
        zzalVar.zzK("icy");
        zzalVar.zzX("application/x-icy");
        zzc = zzalVar.zzad();
    }

    public zzwr(Uri uri, zzhb zzhbVar, zzwg zzwgVar, zzst zzstVar, zzso zzsoVar, zzzz zzzzVar, zzvx zzvxVar, zzwn zzwnVar, zzzv zzzvVar, @Nullable String str, int i9, long j7) {
        boolean z8;
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zzstVar;
        this.zzh = zzsoVar;
        this.zzN = zzzzVar;
        this.zzg = zzvxVar;
        this.zzi = zzwnVar;
        this.zzO = zzzvVar;
        this.zzj = i9;
        this.zzl = zzwgVar;
        this.zzA = j7;
        if (j7 != C.TIME_UNSET) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.zzq = z8;
        this.zzm = new zzeu(zzer.zza);
        this.zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // java.lang.Runnable
            public final void run() {
                zzwr.this.zzU();
            }
        };
        this.zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                zzwr.this.zzE();
            }
        };
        this.zzp = zzgd.zzx(null);
        this.zzu = new zzwp[0];
        this.zzt = new zzxe[0];
        this.zzI = C.TIME_UNSET;
        this.zzC = 1;
    }

    private final int zzQ() {
        int i9 = 0;
        for (zzxe zzxeVar : this.zzt) {
            i9 += zzxeVar.zzd();
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzR(boolean z8) {
        int i9 = 0;
        long j7 = Long.MIN_VALUE;
        while (true) {
            zzxe[] zzxeVarArr = this.zzt;
            if (i9 < zzxeVarArr.length) {
                if (!z8) {
                    zzwq zzwqVar = this.zzy;
                    zzwqVar.getClass();
                    if (!zzwqVar.zzc[i9]) {
                        i9++;
                    }
                }
                j7 = Math.max(j7, zzxeVarArr[i9].zzh());
                i9++;
            } else {
                return j7;
            }
        }
    }

    private final zzafa zzS(zzwp zzwpVar) {
        int length = this.zzt.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (zzwpVar.equals(this.zzu[i9])) {
                return this.zzt[i9];
            }
        }
        zzxe zzxeVar = new zzxe(this.zzO, this.zzf, this.zzh);
        zzxeVar.zzu(this);
        int i10 = length + 1;
        zzwp[] zzwpVarArr = (zzwp[]) Arrays.copyOf(this.zzu, i10);
        zzwpVarArr[length] = zzwpVar;
        int i11 = zzgd.zza;
        this.zzu = zzwpVarArr;
        zzxe[] zzxeVarArr = (zzxe[]) Arrays.copyOf(this.zzt, i10);
        zzxeVarArr[length] = zzxeVar;
        this.zzt = zzxeVarArr;
        return zzxeVar;
    }

    private final void zzT() {
        zzeq.zzf(this.zzw);
        this.zzy.getClass();
        this.zzz.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        boolean z8;
        zzcd zzc2;
        int i9;
        if (!this.zzM && !this.zzw && this.zzv && this.zzz != null) {
            for (zzxe zzxeVar : this.zzt) {
                if (zzxeVar.zzi() == null) {
                    return;
                }
            }
            this.zzm.zzc();
            int length = this.zzt.length;
            zzde[] zzdeVarArr = new zzde[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                zzan zzi = this.zzt[i10].zzi();
                zzi.getClass();
                String str = zzi.zzn;
                boolean zzg = zzcg.zzg(str);
                if (zzg || zzcg.zzh(str)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zArr[i10] = z8;
                this.zzx = z8 | this.zzx;
                zzaha zzahaVar = this.zzs;
                if (zzahaVar != null) {
                    if (zzg || this.zzu[i10].zzb) {
                        zzcd zzcdVar = zzi.zzl;
                        if (zzcdVar == null) {
                            zzc2 = new zzcd(C.TIME_UNSET, zzahaVar);
                        } else {
                            zzc2 = zzcdVar.zzc(zzahaVar);
                        }
                        zzal zzb2 = zzi.zzb();
                        zzb2.zzQ(zzc2);
                        zzi = zzb2.zzad();
                    }
                    if (zzg && zzi.zzh == -1 && zzi.zzi == -1 && (i9 = zzahaVar.zza) != -1) {
                        zzal zzb3 = zzi.zzb();
                        zzb3.zzx(i9);
                        zzi = zzb3.zzad();
                    }
                }
                zzdeVarArr[i10] = new zzde(Integer.toString(i10), zzi.zzc(this.zzf.zza(zzi)));
            }
            this.zzy = new zzwq(new zzxr(zzdeVarArr), zArr);
            this.zzw = true;
            zzvl zzvlVar = this.zzr;
            zzvlVar.getClass();
            zzvlVar.zzi(this);
        }
    }

    private final void zzV(int i9) {
        zzT();
        zzwq zzwqVar = this.zzy;
        boolean[] zArr = zzwqVar.zzd;
        if (!zArr[i9]) {
            zzan zzb2 = zzwqVar.zza.zzb(i9).zzb(0);
            this.zzg.zzc(new zzvk(1, zzcg.zzb(zzb2.zzn), zzb2, 0, null, zzgd.zzu(this.zzH), C.TIME_UNSET));
            zArr[i9] = true;
        }
    }

    private final void zzW(int i9) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i9] && !this.zzt[i9].zzx(false)) {
            this.zzI = 0L;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0L;
            this.zzK = 0;
            for (zzxe zzxeVar : this.zzt) {
                zzxeVar.zzp(false);
            }
            zzvl zzvlVar = this.zzr;
            zzvlVar.getClass();
            zzvlVar.zzg(this);
        }
    }

    private final void zzX() {
        zzwm zzwmVar = new zzwm(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzeq.zzf(zzY());
            long j7 = this.zzA;
            if (j7 != C.TIME_UNSET && this.zzI > j7) {
                this.zzL = true;
                this.zzI = C.TIME_UNSET;
                return;
            }
            zzaet zzaetVar = this.zzz;
            zzaetVar.getClass();
            zzwm.zzf(zzwmVar, zzaetVar.zzg(this.zzI).zza.zzc, this.zzI);
            for (zzxe zzxeVar : this.zzt) {
                zzxeVar.zzt(this.zzI);
            }
            this.zzI = C.TIME_UNSET;
        }
        this.zzK = zzQ();
        long zza = this.zzk.zza(zzwmVar, this, zzzz.zza(this.zzC));
        zzhh zzd = zzwm.zzd(zzwmVar);
        this.zzg.zzg(new zzvf(zzwm.zzb(zzwmVar), zzd, zzd.zza, Collections.emptyMap(), zza, 0L, 0L), new zzvk(1, -1, null, 0, null, zzgd.zzu(zzwm.zzc(zzwmVar)), zzgd.zzu(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != C.TIME_UNSET;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzE() {
        if (!this.zzM) {
            zzvl zzvlVar = this.zzr;
            zzvlVar.getClass();
            zzvlVar.zzg(this);
        }
    }

    public final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    public final /* synthetic */ void zzG(zzaet zzaetVar) {
        zzaet zzaesVar;
        if (this.zzs == null) {
            zzaesVar = zzaetVar;
        } else {
            zzaesVar = new zzaes(C.TIME_UNSET, 0L);
        }
        this.zzz = zzaesVar;
        if (zzaetVar.zza() == C.TIME_UNSET && this.zzA != C.TIME_UNSET) {
            this.zzz = new zzwl(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z8 = false;
        int i9 = 1;
        if (!this.zzG && zzaetVar.zza() == C.TIME_UNSET) {
            z8 = true;
        }
        this.zzB = z8;
        if (true == z8) {
            i9 = 7;
        }
        this.zzC = i9;
        this.zzi.zza(this.zzA, zzaetVar.zzh(), this.zzB);
        if (!this.zzw) {
            zzU();
        }
    }

    public final void zzH() throws IOException {
        this.zzk.zzi(zzzz.zza(this.zzC));
    }

    public final void zzI(int i9) throws IOException {
        this.zzt[i9].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final /* bridge */ /* synthetic */ void zzJ(zzaae zzaaeVar, long j7, long j9, boolean z8) {
        zzwm zzwmVar = (zzwm) zzaaeVar;
        zzid zze = zzwm.zze(zzwmVar);
        zzvf zzvfVar = new zzvf(zzwm.zzb(zzwmVar), zzwm.zzd(zzwmVar), zze.zzh(), zze.zzi(), j7, j9, zze.zzg());
        zzwm.zzb(zzwmVar);
        this.zzg.zzd(zzvfVar, new zzvk(1, -1, null, 0, null, zzgd.zzu(zzwm.zzc(zzwmVar)), zzgd.zzu(this.zzA)));
        if (!z8) {
            for (zzxe zzxeVar : this.zzt) {
                zzxeVar.zzp(false);
            }
            if (this.zzF > 0) {
                zzvl zzvlVar = this.zzr;
                zzvlVar.getClass();
                zzvlVar.zzg(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final /* bridge */ /* synthetic */ void zzK(zzaae zzaaeVar, long j7, long j9) {
        zzaet zzaetVar;
        long j10;
        if (this.zzA == C.TIME_UNSET && (zzaetVar = this.zzz) != null) {
            boolean zzh = zzaetVar.zzh();
            long zzR = zzR(true);
            if (zzR == Long.MIN_VALUE) {
                j10 = 0;
            } else {
                j10 = zzR + 10000;
            }
            this.zzA = j10;
            this.zzi.zza(j10, zzh, this.zzB);
        }
        zzwm zzwmVar = (zzwm) zzaaeVar;
        zzid zze = zzwm.zze(zzwmVar);
        zzvf zzvfVar = new zzvf(zzwm.zzb(zzwmVar), zzwm.zzd(zzwmVar), zze.zzh(), zze.zzi(), j7, j9, zze.zzg());
        zzwm.zzb(zzwmVar);
        this.zzg.zze(zzvfVar, new zzvk(1, -1, null, 0, null, zzgd.zzu(zzwm.zzc(zzwmVar)), zzgd.zzu(this.zzA)));
        this.zzL = true;
        zzvl zzvlVar = this.zzr;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaaf
    public final void zzL() {
        for (zzxe zzxeVar : this.zzt) {
            zzxeVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzM(zzan zzanVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzxe zzxeVar : this.zzt) {
                zzxeVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzO(final zzaet zzaetVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwk
            @Override // java.lang.Runnable
            public final void run() {
                zzwr.this.zzG(zzaetVar);
            }
        });
    }

    public final boolean zzP(int i9) {
        if (!zzZ() && this.zzt[i9].zzx(this.zzL)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j7, zzmr zzmrVar) {
        boolean z8;
        zzT();
        if (!this.zzz.zzh()) {
            return 0L;
        }
        zzaer zzg = this.zzz.zzg(j7);
        zzaeu zzaeuVar = zzg.zza;
        zzaeu zzaeuVar2 = zzg.zzb;
        long j9 = zzmrVar.zzf;
        if (j9 == 0) {
            if (zzmrVar.zzg == 0) {
                return j7;
            }
            j9 = 0;
        }
        long j10 = zzaeuVar.zzb;
        int i9 = zzgd.zza;
        long j11 = j7 - j9;
        long j12 = zzmrVar.zzg;
        long j13 = j7 + j12;
        long j14 = j7 ^ j13;
        long j15 = j12 ^ j13;
        if (((j7 ^ j9) & (j7 ^ j11)) < 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((j14 & j15) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z9 = true;
        if (j11 <= j10 && j10 <= j13) {
            z8 = true;
        } else {
            z8 = false;
        }
        long j16 = zzaeuVar2.zzb;
        if (j11 > j16 || j16 > j13) {
            z9 = false;
        }
        if (z8 && z9) {
            if (Math.abs(j10 - j7) > Math.abs(j16 - j7)) {
                return j16;
            }
        } else if (!z8) {
            if (z9) {
                return j16;
            }
            return j11;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long j7;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j7 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                zzwq zzwqVar = this.zzy;
                if (zzwqVar.zzb[i9] && zzwqVar.zzc[i9] && !this.zzt[i9].zzw()) {
                    j7 = Math.min(j7, this.zzt[i9].zzh());
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = zzR(false);
        }
        if (j7 == Long.MIN_VALUE) {
            return this.zzH;
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        if (this.zzE) {
            if (this.zzL || zzQ() > this.zzK) {
                this.zzE = false;
                return this.zzH;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zze(long j7) {
        boolean zzz;
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (true != this.zzz.zzh()) {
            j7 = 0;
        }
        this.zzE = false;
        this.zzH = j7;
        if (zzY()) {
            this.zzI = j7;
            return j7;
        }
        if (this.zzC != 7) {
            int length = this.zzt.length;
            for (int i9 = 0; i9 < length; i9++) {
                zzxe zzxeVar = this.zzt[i9];
                if (this.zzq) {
                    zzz = zzxeVar.zzy(zzxeVar.zza());
                } else {
                    zzz = zzxeVar.zzz(j7, false);
                }
                if (zzz || (!zArr[i9] && this.zzx)) {
                }
            }
            return j7;
        }
        this.zzJ = false;
        this.zzI = j7;
        this.zzL = false;
        zzaai zzaaiVar = this.zzk;
        if (zzaaiVar.zzl()) {
            for (zzxe zzxeVar2 : this.zzt) {
                zzxeVar2.zzk();
            }
            this.zzk.zzg();
        } else {
            zzaaiVar.zzh();
            for (zzxe zzxeVar3 : this.zzt) {
                zzxeVar3.zzp(false);
            }
        }
        return j7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r2 == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzzg[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzxf[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwr.zzf(com.google.android.gms.internal.ads.zzzg[], boolean[], com.google.android.gms.internal.ads.zzxf[], boolean[], long):long");
    }

    public final int zzg(int i9, zzlj zzljVar, zzin zzinVar, int i10) {
        if (zzZ()) {
            return -3;
        }
        zzV(i9);
        int zze = this.zzt[i9].zze(zzljVar, zzinVar, i10, this.zzL);
        if (zze == -3) {
            zzW(i9);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        zzT();
        return this.zzy.zza;
    }

    public final int zzi(int i9, long j7) {
        if (zzZ()) {
            return 0;
        }
        zzV(i9);
        zzxe zzxeVar = this.zzt[i9];
        int zzc2 = zzxeVar.zzc(j7, this.zzL);
        zzxeVar.zzv(zzc2);
        if (zzc2 == 0) {
            zzW(i9);
            return 0;
        }
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j7, boolean z8) {
        if (!this.zzq) {
            zzT();
            if (!zzY()) {
                boolean[] zArr = this.zzy.zzc;
                int length = this.zzt.length;
                for (int i9 = 0; i9 < length; i9++) {
                    this.zzt[i9].zzj(j7, false, zArr[i9]);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzch.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j7) {
        this.zzr = zzvlVar;
        this.zzm.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j7) {
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        if (!this.zzL) {
            zzaai zzaaiVar = this.zzk;
            if (!zzaaiVar.zzk() && !this.zzJ) {
                if (!this.zzw || this.zzF != 0) {
                    boolean zze = this.zzm.zze();
                    if (!zzaaiVar.zzl()) {
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

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzaaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaac zzu(com.google.android.gms.internal.ads.zzaae r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwr.zzu(com.google.android.gms.internal.ads.zzaae, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzaac");
    }

    public final zzafa zzv() {
        return zzS(new zzwp(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final zzafa zzw(int i9, int i10) {
        return zzS(new zzwp(i9, false));
    }
}
