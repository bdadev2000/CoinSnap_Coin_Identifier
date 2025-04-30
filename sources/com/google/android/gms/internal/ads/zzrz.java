package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzrz implements zzqv {
    private static final Object zza = new Object();

    @Nullable
    private static ExecutorService zzb;
    private static int zzc;
    private zzrp zzA;
    private zzcl zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;

    @Nullable
    private ByteBuffer zzM;
    private int zzN;

    @Nullable
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private zzl zzU;

    @Nullable
    private zzpx zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;

    @Nullable
    private Looper zzZ;
    private long zzaa;
    private long zzab;
    private Handler zzac;
    private final zzrn zzad;
    private final zzrd zzae;

    @Nullable
    private final Context zzd;
    private final zzra zze;
    private final zzsj zzf;
    private final zzgbc zzg;
    private final zzgbc zzh;
    private final zzeu zzi;
    private final zzqz zzj;
    private final ArrayDeque zzk;
    private zzrx zzl;
    private final zzrs zzm;
    private final zzrs zzn;
    private final zzrk zzo;

    @Nullable
    private zzpj zzp;

    @Nullable
    private zzqs zzq;

    @Nullable
    private zzrm zzr;
    private zzrm zzs;
    private zzdw zzt;

    @Nullable
    private AudioTrack zzu;
    private zzpp zzv;
    private zzpw zzw;

    @Nullable
    private zzrr zzx;
    private zzk zzy;

    @Nullable
    private zzrp zzz;

    public /* synthetic */ zzrz(zzrl zzrlVar, zzry zzryVar) {
        zzpp zzb2;
        Context zza2 = zzrl.zza(zzrlVar);
        this.zzd = zza2;
        zzk zzkVar = zzk.zza;
        this.zzy = zzkVar;
        if (zza2 != null) {
            zzpp zzppVar = zzpp.zza;
            int i9 = zzgd.zza;
            zzb2 = zzpp.zzc(zza2, zzkVar, null);
        } else {
            zzb2 = zzrl.zzb(zzrlVar);
        }
        this.zzv = zzb2;
        this.zzad = zzrl.zze(zzrlVar);
        int i10 = zzgd.zza;
        this.zzo = zzrl.zzc(zzrlVar);
        zzrd zzf = zzrl.zzf(zzrlVar);
        zzf.getClass();
        this.zzae = zzf;
        zzeu zzeuVar = new zzeu(zzer.zza);
        this.zzi = zzeuVar;
        zzeuVar.zze();
        this.zzj = new zzqz(new zzru(this, null));
        zzra zzraVar = new zzra();
        this.zze = zzraVar;
        zzsj zzsjVar = new zzsj();
        this.zzf = zzsjVar;
        this.zzg = zzgbc.zzp(new zzed(), zzraVar, zzsjVar);
        this.zzh = zzgbc.zzn(new zzsi());
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzU = new zzl(0, 0.0f);
        zzcl zzclVar = zzcl.zza;
        this.zzA = new zzrp(zzclVar, 0L, 0L, null);
        this.zzB = zzclVar;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzrs(100L);
        this.zzn = new zzrs(100L);
    }

    public static /* synthetic */ void zzG(zzrz zzrzVar) {
        if (zzrzVar.zzab >= 300000) {
            zzsf.zzah(((zzse) zzrzVar.zzq).zza, true);
            zzrzVar.zzab = 0L;
        }
    }

    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzqs zzqsVar, Handler handler, final zzqp zzqpVar, zzeu zzeuVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqsVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqn zzqnVar;
                        zzqnVar = ((zzse) zzqs.this).zza.zzc;
                        zzqnVar.zzd(zzqpVar);
                    }
                });
            }
            zzeuVar.zze();
            synchronized (zza) {
                try {
                    int i9 = zzc - 1;
                    zzc = i9;
                    if (i9 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (zzqsVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqn zzqnVar;
                        zzqnVar = ((zzse) zzqs.this).zza.zzc;
                        zzqnVar.zzd(zzqpVar);
                    }
                });
            }
            zzeuVar.zze();
            synchronized (zza) {
                try {
                    int i10 = zzc - 1;
                    zzc = i10;
                    if (i10 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        if (this.zzs.zzc == 0) {
            return this.zzD / r0.zzb;
        }
        return this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzrm zzrmVar = this.zzs;
        if (zzrmVar.zzc == 0) {
            long j7 = this.zzF;
            long j9 = zzrmVar.zzd;
            int i9 = zzgd.zza;
            return ((j7 + j9) - 1) / j9;
        }
        return this.zzG;
    }

    private final AudioTrack zzN(zzrm zzrmVar) throws zzqr {
        try {
            return zzrmVar.zza(this.zzy, this.zzT);
        } catch (zzqr e4) {
            zzqs zzqsVar = this.zzq;
            if (zzqsVar != null) {
                zzqsVar.zza(e4);
            }
            throw e4;
        }
    }

    private final void zzO(long j7) {
        zzcl zzclVar;
        boolean z8;
        if (zzaa()) {
            zzrn zzrnVar = this.zzad;
            zzclVar = this.zzB;
            zzrnVar.zzc(zzclVar);
        } else {
            zzclVar = zzcl.zza;
        }
        zzcl zzclVar2 = zzclVar;
        this.zzB = zzclVar2;
        if (zzaa()) {
            zzrn zzrnVar2 = this.zzad;
            z8 = this.zzC;
            zzrnVar2.zzd(z8);
        } else {
            z8 = false;
        }
        this.zzC = z8;
        this.zzk.add(new zzrp(zzclVar2, Math.max(0L, j7), zzgd.zzs(zzM(), this.zzs.zze), null));
        zzV();
        zzqs zzqsVar = this.zzq;
        if (zzqsVar != null) {
            zzsf.zzae(((zzse) zzqsVar).zza).zzw(this.zzC);
        }
    }

    private final void zzP() {
        if (!this.zzs.zzc()) {
            return;
        }
        this.zzX = true;
    }

    private final void zzQ() {
        if (this.zzw == null && this.zzd != null) {
            this.zzZ = Looper.myLooper();
            zzpw zzpwVar = new zzpw(this.zzd, new zzrh(this), this.zzy, this.zzV);
            this.zzw = zzpwVar;
            this.zzv = zzpwVar.zzc();
        }
    }

    private final void zzR() {
        if (!this.zzQ) {
            this.zzQ = true;
            this.zzj.zzb(zzM());
            this.zzu.stop();
        }
    }

    private final void zzS(long j7) throws zzqu {
        ByteBuffer zzb2;
        if (this.zzt.zzh()) {
            while (!this.zzt.zzg()) {
                do {
                    zzb2 = this.zzt.zzb();
                    if (zzb2.hasRemaining()) {
                        zzW(zzb2, j7);
                    } else {
                        ByteBuffer byteBuffer = this.zzM;
                        if (byteBuffer != null && byteBuffer.hasRemaining()) {
                            this.zzt.zze(this.zzM);
                        } else {
                            return;
                        }
                    }
                } while (!zzb2.hasRemaining());
                return;
            }
            return;
        }
        ByteBuffer byteBuffer2 = this.zzM;
        if (byteBuffer2 == null) {
            byteBuffer2 = zzdz.zza;
        }
        zzW(byteBuffer2, j7);
    }

    private final void zzT(zzcl zzclVar) {
        zzrp zzrpVar = new zzrp(zzclVar, C.TIME_UNSET, C.TIME_UNSET, null);
        if (zzY()) {
            this.zzz = zzrpVar;
        } else {
            this.zzA = zzrpVar;
        }
    }

    private final void zzU() {
        if (!zzY()) {
            return;
        }
        int i9 = zzgd.zza;
        this.zzu.setVolume(this.zzL);
    }

    private final void zzV() {
        zzdw zzdwVar = this.zzs.zzi;
        this.zzt = zzdwVar;
        zzdwVar.zzc();
    }

    private final void zzW(ByteBuffer byteBuffer, long j7) throws zzqu {
        zzqs zzqsVar;
        boolean z8;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzO;
            boolean z9 = false;
            if (byteBuffer2 != null) {
                if (byteBuffer2 == byteBuffer) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzeq.zzd(z8);
            } else {
                this.zzO = byteBuffer;
                int i9 = zzgd.zza;
            }
            int remaining = byteBuffer.remaining();
            int i10 = zzgd.zza;
            int write = this.zzu.write(byteBuffer, remaining, 1);
            this.zzW = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzgd.zza >= 24 && write == -6) || write == -32) {
                    if (zzM() <= 0) {
                        if (zzZ(this.zzu)) {
                            zzP();
                        }
                    }
                    z9 = true;
                }
                zzqu zzquVar = new zzqu(write, this.zzs.zza, z9);
                zzqs zzqsVar2 = this.zzq;
                if (zzqsVar2 != null) {
                    zzqsVar2.zza(zzquVar);
                }
                if (!zzquVar.zzb) {
                    this.zzn.zzb(zzquVar);
                    return;
                } else {
                    this.zzv = zzpp.zza;
                    throw zzquVar;
                }
            }
            this.zzn.zza();
            if (zzZ(this.zzu)) {
                if (this.zzG > 0) {
                    this.zzY = false;
                }
                if (this.zzS && (zzqsVar = this.zzq) != null && write < remaining) {
                    zzsf zzsfVar = ((zzse) zzqsVar).zza;
                    if (zzsf.zzad(zzsfVar) != null) {
                        zzsf.zzad(zzsfVar).zza();
                    }
                }
            }
            int i11 = this.zzs.zzc;
            if (i11 == 0) {
                this.zzF += write;
            }
            if (write == remaining) {
                if (i11 != 0) {
                    if (byteBuffer == this.zzM) {
                        z9 = true;
                    }
                    zzeq.zzf(z9);
                    this.zzG = (this.zzH * this.zzN) + this.zzG;
                }
                this.zzO = null;
            }
        }
    }

    private final boolean zzX() throws zzqu {
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzO;
            if (byteBuffer == null) {
                return true;
            }
            zzW(byteBuffer, Long.MIN_VALUE);
            if (this.zzO != null) {
                return false;
            }
            return true;
        }
        this.zzt.zzd();
        zzS(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzO;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    private final boolean zzY() {
        return this.zzu != null;
    }

    private static boolean zzZ(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzgd.zza >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean zzaa() {
        zzrm zzrmVar = this.zzs;
        if (zzrmVar.zzc == 0) {
            int i9 = zzrmVar.zza.zzC;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzA(zzan zzanVar) {
        if (zza(zzanVar) != 0) {
            return true;
        }
        return false;
    }

    public final void zzJ(zzpp zzppVar) {
        boolean z8;
        if (this.zzZ == Looper.myLooper()) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        if (!zzppVar.equals(this.zzv)) {
            this.zzv = zzppVar;
            zzqs zzqsVar = this.zzq;
            if (zzqsVar != null) {
                zzsf.zzai(((zzse) zzqsVar).zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final int zza(zzan zzanVar) {
        zzQ();
        if (MimeTypes.AUDIO_RAW.equals(zzanVar.zzn)) {
            if (!zzgd.zzK(zzanVar.zzC)) {
                L.z(zzanVar.zzC, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (zzanVar.zzC == 2) {
                return 2;
            }
            return 1;
        }
        if (this.zzv.zzb(zzanVar, this.zzy) == null) {
            return 0;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final long zzb(boolean z8) {
        long zzp;
        if (zzY() && !this.zzJ) {
            long min = Math.min(this.zzj.zza(z8), zzgd.zzs(zzM(), this.zzs.zze));
            while (!this.zzk.isEmpty() && min >= ((zzrp) this.zzk.getFirst()).zzc) {
                this.zzA = (zzrp) this.zzk.remove();
            }
            zzrp zzrpVar = this.zzA;
            long j7 = min - zzrpVar.zzc;
            if (zzrpVar.zza.equals(zzcl.zza)) {
                zzp = this.zzA.zzb + j7;
            } else if (this.zzk.isEmpty()) {
                zzp = this.zzad.zza(j7) + this.zzA.zzb;
            } else {
                zzrp zzrpVar2 = (zzrp) this.zzk.getFirst();
                zzp = zzrpVar2.zzb - zzgd.zzp(zzrpVar2.zzc - min, this.zzA.zza.zzc);
            }
            long zzb2 = this.zzad.zzb();
            long zzs = zzgd.zzs(zzb2, this.zzs.zze) + zzp;
            long j9 = this.zzaa;
            if (zzb2 > j9) {
                long zzs2 = zzgd.zzs(zzb2 - j9, this.zzs.zze);
                this.zzaa = zzb2;
                this.zzab += zzs2;
                if (this.zzac == null) {
                    this.zzac = new Handler(Looper.myLooper());
                }
                this.zzac.removeCallbacksAndMessages(null);
                this.zzac.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrz.zzG(zzrz.this);
                    }
                }, 100L);
            }
            return zzs;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final zzcl zzc() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final zzqa zzd(zzan zzanVar) {
        if (this.zzX) {
            return zzqa.zza;
        }
        return this.zzae.zza(zzanVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zze(zzan zzanVar, int i9, @Nullable int[] iArr) throws zzqq {
        int intValue;
        zzdw zzdwVar;
        int i10;
        int intValue2;
        int i11;
        int i12;
        int i13;
        boolean z8;
        int i14;
        int i15;
        int max;
        int zzb2;
        zzQ();
        if (MimeTypes.AUDIO_RAW.equals(zzanVar.zzn)) {
            zzeq.zzd(zzgd.zzK(zzanVar.zzC));
            i10 = zzgd.zzm(zzanVar.zzC, zzanVar.zzA);
            zzgaz zzgazVar = new zzgaz();
            zzgazVar.zzh(this.zzg);
            zzgazVar.zzg(this.zzad.zze());
            zzdw zzdwVar2 = new zzdw(zzgazVar.zzi());
            if (zzdwVar2.equals(this.zzt)) {
                zzdwVar2 = this.zzt;
            }
            this.zzf.zzq(zzanVar.zzD, zzanVar.zzE);
            this.zze.zzo(iArr);
            try {
                zzdx zza2 = zzdwVar2.zza(new zzdx(zzanVar.zzB, zzanVar.zzA, zzanVar.zzC));
                intValue = zza2.zzd;
                i12 = zza2.zzb;
                int i16 = zza2.zzc;
                intValue2 = zzgd.zzh(i16);
                zzdwVar = zzdwVar2;
                i11 = zzgd.zzm(intValue, i16);
                i13 = 0;
            } catch (zzdy e4) {
                throw new zzqq(e4, zzanVar);
            }
        } else {
            zzdw zzdwVar3 = new zzdw(zzgbc.zzm());
            int i17 = zzanVar.zzB;
            zzqa zzqaVar = zzqa.zza;
            Pair zzb3 = this.zzv.zzb(zzanVar, this.zzy);
            if (zzb3 != null) {
                intValue = ((Integer) zzb3.first).intValue();
                zzdwVar = zzdwVar3;
                i10 = -1;
                intValue2 = ((Integer) zzb3.second).intValue();
                i11 = -1;
                i12 = i17;
                i13 = 2;
            } else {
                throw new zzqq("Unable to configure passthrough for: ".concat(String.valueOf(zzanVar)), zzanVar);
            }
        }
        if (intValue != 0) {
            if (intValue2 != 0) {
                int i18 = zzanVar.zzj;
                if (MimeTypes.AUDIO_DTS_EXPRESS.equals(zzanVar.zzn) && i18 == -1) {
                    i18 = 768000;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i12, intValue2, intValue);
                if (minBufferSize != -2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzeq.zzf(z8);
                if (i11 != -1) {
                    i14 = i11;
                } else {
                    i14 = 1;
                }
                int i19 = 250000;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (intValue == 5) {
                            i19 = 500000;
                        } else if (intValue == 8) {
                            i19 = 1000000;
                            intValue = 8;
                        }
                        if (i18 != -1) {
                            zzb2 = zzgds.zza(i18, 8, RoundingMode.CEILING);
                        } else {
                            zzb2 = zzsb.zzb(intValue);
                        }
                        i15 = i13;
                        max = zzgea.zzb((i19 * zzb2) / 1000000);
                    } else {
                        i15 = i13;
                        max = zzgea.zzb((zzsb.zzb(intValue) * 50000000) / 1000000);
                    }
                } else {
                    i15 = i13;
                    max = Math.max(zzsb.zza(250000, i12, i14), Math.min(minBufferSize * 4, zzsb.zza(750000, i12, i14)));
                }
                int i20 = intValue;
                this.zzX = false;
                zzrm zzrmVar = new zzrm(zzanVar, i10, i15, i11, i12, intValue2, i20, (((Math.max(minBufferSize, max) + i14) - 1) / i14) * i14, zzdwVar, false, false, false);
                if (zzY()) {
                    this.zzr = zzrmVar;
                    return;
                } else {
                    this.zzs = zzrmVar;
                    return;
                }
            }
            throw new zzqq("Invalid output channel config (mode=" + i13 + ") for: " + String.valueOf(zzanVar), zzanVar);
        }
        throw new zzqq("Invalid output encoding (mode=" + i13 + ") for: " + String.valueOf(zzanVar), zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzf() {
        zzrr zzrrVar;
        if (zzY()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzY = false;
            this.zzH = 0;
            this.zzA = new zzrp(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzp();
            zzV();
            if (this.zzj.zzh()) {
                this.zzu.pause();
            }
            if (zzZ(this.zzu)) {
                zzrx zzrxVar = this.zzl;
                zzrxVar.getClass();
                zzrxVar.zzb(this.zzu);
            }
            int i9 = zzgd.zza;
            final zzqp zzb2 = this.zzs.zzb();
            zzrm zzrmVar = this.zzr;
            if (zzrmVar != null) {
                this.zzs = zzrmVar;
                this.zzr = null;
            }
            this.zzj.zzc();
            if (zzgd.zza >= 24 && (zzrrVar = this.zzx) != null) {
                zzrrVar.zzb();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzeu zzeuVar = this.zzi;
            final zzqs zzqsVar = this.zzq;
            zzeuVar.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        zzb = zzgd.zzE("ExoPlayer:AudioTrackReleaseThread");
                    }
                    zzc++;
                    zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzre
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzrz.zzI(audioTrack, zzqsVar, handler, zzb2, zzeuVar);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzaa = 0L;
        this.zzab = 0L;
        Handler handler2 = this.zzac;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzg() {
        this.zzI = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzh() {
        this.zzS = false;
        if (zzY()) {
            if (this.zzj.zzk() || zzZ(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzi() {
        this.zzS = true;
        if (zzY()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzj() throws zzqu {
        if (!this.zzP && zzY() && zzX()) {
            zzR();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzk() {
        zzpw zzpwVar = this.zzw;
        if (zzpwVar != null) {
            zzpwVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzl() {
        zzf();
        zzgbc zzgbcVar = this.zzg;
        int size = zzgbcVar.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((zzdz) zzgbcVar.get(i9)).zzf();
        }
        zzgbc zzgbcVar2 = this.zzh;
        int size2 = zzgbcVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((zzdz) zzgbcVar2.get(i10)).zzf();
        }
        zzdw zzdwVar = this.zzt;
        if (zzdwVar != null) {
            zzdwVar.zzf();
        }
        this.zzS = false;
        this.zzX = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzm(zzk zzkVar) {
        if (this.zzy.equals(zzkVar)) {
            return;
        }
        this.zzy = zzkVar;
        zzpw zzpwVar = this.zzw;
        if (zzpwVar != null) {
            zzpwVar.zzg(zzkVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzn(int i9) {
        if (this.zzT != i9) {
            this.zzT = i9;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzo(zzl zzlVar) {
        if (this.zzU.equals(zzlVar)) {
            return;
        }
        if (this.zzu != null) {
            int i9 = this.zzU.zza;
        }
        this.zzU = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzp(zzer zzerVar) {
        this.zzj.zze(zzerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzq(zzqs zzqsVar) {
        this.zzq = zzqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    @RequiresApi(29)
    public final void zzr(int i9, int i10) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzZ(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzs(zzcl zzclVar) {
        this.zzB = new zzcl(Math.max(0.1f, Math.min(zzclVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzclVar.zzd, 8.0f)));
        zzT(zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzt(@Nullable zzpj zzpjVar) {
        this.zzp = zzpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    @RequiresApi(23)
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        zzpx zzpxVar;
        if (audioDeviceInfo == null) {
            zzpxVar = null;
        } else {
            zzpxVar = new zzpx(audioDeviceInfo);
        }
        this.zzV = zzpxVar;
        zzpw zzpwVar = this.zzw;
        if (zzpwVar != null) {
            zzpwVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzri.zza(audioTrack, this.zzV);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzv(boolean z8) {
        this.zzC = z8;
        zzT(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzw(float f9) {
        if (this.zzL != f9) {
            this.zzL = f9;
            zzU();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x01b1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02db A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzx(java.nio.ByteBuffer r28, long r29, int r31) throws com.google.android.gms.internal.ads.zzqr, com.google.android.gms.internal.ads.zzqu {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrz.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzy() {
        boolean isOffloadedPlayback;
        if (zzY()) {
            if (zzgd.zza >= 29) {
                isOffloadedPlayback = this.zzu.isOffloadedPlayback();
                if (isOffloadedPlayback && this.zzR) {
                    return false;
                }
            }
            if (this.zzj.zzg(zzM())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzz() {
        if (!zzY()) {
            return true;
        }
        if (this.zzP && !zzy()) {
            return true;
        }
        return false;
    }
}
