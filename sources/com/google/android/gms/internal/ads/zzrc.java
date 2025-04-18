package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.impl.adview.t;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzrc implements zzpy {
    private static final Object zza = new Object();

    @Nullable
    @GuardedBy
    private static ScheduledExecutorService zzb;

    @GuardedBy
    private static int zzc;
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private long zzI;
    private float zzJ;

    @Nullable
    private ByteBuffer zzK;
    private int zzL;

    @Nullable
    private ByteBuffer zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private zzi zzS;

    @Nullable
    private zzpa zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;

    @Nullable
    private Looper zzX;
    private long zzY;
    private long zzZ;
    private Handler zzaa;
    private final zzqq zzab;
    private final zzqg zzac;

    @Nullable
    private final Context zzd;
    private final zzqd zze;
    private final zzrm zzf;
    private final zzgax zzg;
    private final zzgax zzh;
    private final zzqc zzi;
    private final ArrayDeque zzj;
    private zzra zzk;
    private final zzqv zzl;
    private final zzqv zzm;

    @Nullable
    private zzom zzn;

    @Nullable
    private zzpv zzo;

    @Nullable
    private zzqp zzp;
    private zzqp zzq;
    private zzcq zzr;

    @Nullable
    private AudioTrack zzs;
    private zzos zzt;
    private zzoz zzu;

    @Nullable
    private zzqu zzv;
    private zzh zzw;

    @Nullable
    private zzqs zzx;
    private zzqs zzy;
    private zzbq zzz;

    public /* synthetic */ zzrc(zzqo zzqoVar, zzrb zzrbVar) {
        Context context;
        zzos zzosVar;
        zzqq zzqqVar;
        zzqg zzqgVar;
        context = zzqoVar.zza;
        this.zzd = context;
        zzh zzhVar = zzh.zza;
        this.zzw = zzhVar;
        zzqw zzqwVar = null;
        if (context != null) {
            zzos zzosVar2 = zzos.zza;
            int i2 = zzeu.zza;
            zzosVar = zzos.zzc(context, zzhVar, null);
        } else {
            zzosVar = zzqoVar.zzb;
        }
        this.zzt = zzosVar;
        zzqqVar = zzqoVar.zze;
        this.zzab = zzqqVar;
        int i3 = zzeu.zza;
        zzqgVar = zzqoVar.zzf;
        zzqgVar.getClass();
        this.zzac = zzqgVar;
        this.zzi = new zzqc(new zzqx(this, zzqwVar));
        zzqd zzqdVar = new zzqd();
        this.zze = zzqdVar;
        zzrm zzrmVar = new zzrm();
        this.zzf = zzrmVar;
        this.zzg = zzgax.zzq(new zzcx(), zzqdVar, zzrmVar);
        this.zzh = zzgax.zzo(new zzrl());
        this.zzJ = 1.0f;
        this.zzR = 0;
        this.zzS = new zzi(0, 0.0f);
        zzbq zzbqVar = zzbq.zza;
        this.zzy = new zzqs(zzbqVar, 0L, 0L, null);
        this.zzz = zzbqVar;
        this.zzA = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqv();
        this.zzm = new zzqv();
    }

    public static /* bridge */ /* synthetic */ AudioTrack zzE(zzrc zzrcVar) {
        return zzrcVar.zzs;
    }

    public static /* synthetic */ void zzG(zzrc zzrcVar) {
        if (zzrcVar.zzZ >= 300000) {
            ((zzrh) zzrcVar.zzo).zza.zzn = true;
            zzrcVar.zzZ = 0L;
        }
    }

    public static /* bridge */ /* synthetic */ void zzH(zzrc zzrcVar, boolean z2) {
        zzrcVar.zzP = true;
    }

    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzpv zzpvVar, Handler handler, final zzps zzpsVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpvVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpq zzpqVar;
                        zzpqVar = ((zzrh) zzpv.this).zza.zzc;
                        zzpqVar.zzd(zzpsVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i2 = zzc - 1;
                    zzc = i2;
                    if (i2 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (zzpvVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpq zzpqVar;
                        zzpqVar = ((zzrh) zzpv.this).zza.zzc;
                        zzpqVar.zzd(zzpsVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i3 = zzc - 1;
                    zzc = i3;
                    if (i3 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z2;
        synchronized (zza) {
            z2 = zzc > 0;
        }
        return z2;
    }

    public final long zzL() {
        return this.zzq.zzc == 0 ? this.zzB / r0.zzb : this.zzC;
    }

    public final long zzM() {
        zzqp zzqpVar = this.zzq;
        if (zzqpVar.zzc != 0) {
            return this.zzE;
        }
        long j2 = this.zzD;
        long j3 = zzqpVar.zzd;
        int i2 = zzeu.zza;
        return ((j2 + j3) - 1) / j3;
    }

    private final AudioTrack zzN(zzqp zzqpVar) throws zzpu {
        try {
            return zzqpVar.zza(this.zzw, this.zzR);
        } catch (zzpu e) {
            zzpv zzpvVar = this.zzo;
            if (zzpvVar != null) {
                zzpvVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzO(long j2) {
        zzbq zzbqVar;
        boolean z2;
        zzpq zzpqVar;
        if (zzaa()) {
            zzqq zzqqVar = this.zzab;
            zzbqVar = this.zzz;
            zzqqVar.zzc(zzbqVar);
        } else {
            zzbqVar = zzbq.zza;
        }
        zzbq zzbqVar2 = zzbqVar;
        this.zzz = zzbqVar2;
        if (zzaa()) {
            zzqq zzqqVar2 = this.zzab;
            z2 = this.zzA;
            zzqqVar2.zzd(z2);
        } else {
            z2 = false;
        }
        this.zzA = z2;
        this.zzj.add(new zzqs(zzbqVar2, Math.max(0L, j2), zzeu.zzs(zzM(), this.zzq.zze), null));
        zzV();
        zzpv zzpvVar = this.zzo;
        if (zzpvVar != null) {
            boolean z3 = this.zzA;
            zzpqVar = ((zzrh) zzpvVar).zza.zzc;
            zzpqVar.zzw(z3);
        }
    }

    private final void zzP() {
        if (this.zzq.zzc()) {
            this.zzV = true;
        }
    }

    private final void zzQ() {
        if (this.zzu != null || this.zzd == null) {
            return;
        }
        this.zzX = Looper.myLooper();
        zzoz zzozVar = new zzoz(this.zzd, new zzqj(this), this.zzw, this.zzT);
        this.zzu = zzozVar;
        this.zzt = zzozVar.zzc();
    }

    private final void zzR() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        this.zzi.zzb(zzM());
        if (zzZ(this.zzs)) {
            this.zzP = false;
        }
        this.zzs.stop();
    }

    private final void zzS(long j2) throws zzpx {
        ByteBuffer zzb2;
        if (!this.zzr.zzh()) {
            ByteBuffer byteBuffer = this.zzK;
            if (byteBuffer == null) {
                byteBuffer = zzct.zza;
            }
            zzW(byteBuffer, j2);
            return;
        }
        while (!this.zzr.zzg()) {
            do {
                zzb2 = this.zzr.zzb();
                if (zzb2.hasRemaining()) {
                    zzW(zzb2, j2);
                } else {
                    ByteBuffer byteBuffer2 = this.zzK;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzr.zze(this.zzK);
                    }
                }
            } while (!zzb2.hasRemaining());
            return;
        }
    }

    private final void zzT(zzbq zzbqVar) {
        zzqs zzqsVar = new zzqs(zzbqVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzY()) {
            this.zzx = zzqsVar;
        } else {
            this.zzy = zzqsVar;
        }
    }

    private final void zzU() {
        if (zzY()) {
            this.zzs.setVolume(this.zzJ);
        }
    }

    private final void zzV() {
        zzcq zzcqVar = this.zzq.zzi;
        this.zzr = zzcqVar;
        zzcqVar.zzc();
    }

    private final void zzW(ByteBuffer byteBuffer, long j2) throws zzpx {
        zzpv zzpvVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzM;
            if (byteBuffer2 != null) {
                zzdi.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzM = byteBuffer;
            }
            if (this.zzm.zzc()) {
                return;
            }
            int remaining = byteBuffer.remaining();
            int write = this.zzs.write(byteBuffer, remaining, 1);
            this.zzU = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzeu.zza >= 24 && write == -6) || write == -32) {
                    if (zzM() <= 0) {
                        if (zzZ(this.zzs)) {
                            zzP();
                        }
                    }
                    r10 = true;
                }
                zzpx zzpxVar = new zzpx(write, this.zzq.zza, r10);
                zzpv zzpvVar2 = this.zzo;
                if (zzpvVar2 != null) {
                    zzpvVar2.zza(zzpxVar);
                }
                if (zzpxVar.zzb) {
                    this.zzt = zzos.zza;
                    throw zzpxVar;
                }
                this.zzm.zzb(zzpxVar);
                return;
            }
            this.zzm.zza();
            if (zzZ(this.zzs)) {
                if (this.zzE > 0) {
                    this.zzW = false;
                }
                if (this.zzQ && (zzpvVar = this.zzo) != null && write < remaining) {
                }
            }
            int i2 = this.zzq.zzc;
            if (i2 == 0) {
                this.zzD += write;
            }
            if (write == remaining) {
                if (i2 != 0) {
                    zzdi.zzf(byteBuffer == this.zzK);
                    this.zzE = (this.zzF * this.zzL) + this.zzE;
                }
                this.zzM = null;
            }
        }
    }

    private final boolean zzX() throws zzpx {
        if (!this.zzr.zzh()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer == null) {
                return true;
            }
            zzW(byteBuffer, Long.MIN_VALUE);
            return this.zzM == null;
        }
        this.zzr.zzd();
        zzS(Long.MIN_VALUE);
        if (!this.zzr.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzM;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzY() {
        return this.zzs != null;
    }

    private static boolean zzZ(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzeu.zza < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private final boolean zzaa() {
        zzqp zzqpVar = this.zzq;
        if (zzqpVar.zzc != 0) {
            return false;
        }
        int i2 = zzqpVar.zza.zzD;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final boolean zzA(zzaf zzafVar) {
        return zza(zzafVar) != 0;
    }

    public final void zzJ(zzos zzosVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzX;
        if (looper != myLooper) {
            throw new IllegalStateException(androidx.compose.foundation.text.input.a.m("Current looper (", myLooper != null ? myLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (zzosVar.equals(this.zzt)) {
            return;
        }
        this.zzt = zzosVar;
        zzpv zzpvVar = this.zzo;
        if (zzpvVar != null) {
            ((zzrh) zzpvVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final int zza(zzaf zzafVar) {
        zzQ();
        if (!"audio/raw".equals(zzafVar.zzn)) {
            return this.zzt.zzb(zzafVar, this.zzw) != null ? 2 : 0;
        }
        if (zzeu.zzI(zzafVar.zzD)) {
            return zzafVar.zzD != 2 ? 1 : 2;
        }
        t.C("Invalid PCM encoding: ", zzafVar.zzD, "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final long zzb(boolean z2) {
        long zzp;
        if (!zzY() || this.zzH) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzi.zza(z2), zzeu.zzs(zzM(), this.zzq.zze));
        while (!this.zzj.isEmpty() && min >= ((zzqs) this.zzj.getFirst()).zzc) {
            this.zzy = (zzqs) this.zzj.remove();
        }
        long j2 = min - this.zzy.zzc;
        if (this.zzj.isEmpty()) {
            zzp = this.zzy.zzb + this.zzab.zza(j2);
        } else {
            zzqs zzqsVar = (zzqs) this.zzj.getFirst();
            zzp = zzqsVar.zzb - zzeu.zzp(zzqsVar.zzc - min, this.zzy.zza.zzb);
        }
        long zzb2 = this.zzab.zzb();
        long zzs = zzeu.zzs(zzb2, this.zzq.zze) + zzp;
        long j3 = this.zzY;
        if (zzb2 > j3) {
            long zzs2 = zzeu.zzs(zzb2 - j3, this.zzq.zze);
            this.zzY = zzb2;
            this.zzZ += zzs2;
            if (this.zzaa == null) {
                this.zzaa = new Handler(Looper.myLooper());
            }
            this.zzaa.removeCallbacksAndMessages(null);
            this.zzaa.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqi
                @Override // java.lang.Runnable
                public final void run() {
                    zzrc.zzG(zzrc.this);
                }
            }, 100L);
        }
        return zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final zzbq zzc() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final zzpd zzd(zzaf zzafVar) {
        return this.zzV ? zzpd.zza : this.zzac.zza(zzafVar, this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zze(zzaf zzafVar, int i2, @Nullable int[] iArr) throws zzpt {
        int intValue;
        zzcq zzcqVar;
        int i3;
        int intValue2;
        int i4;
        int i5;
        int i6;
        int i7;
        int max;
        zzQ();
        if ("audio/raw".equals(zzafVar.zzn)) {
            zzdi.zzd(zzeu.zzI(zzafVar.zzD));
            i3 = zzeu.zzj(zzafVar.zzD) * zzafVar.zzB;
            zzgau zzgauVar = new zzgau();
            zzgauVar.zzh(this.zzg);
            zzgauVar.zzg(this.zzab.zze());
            zzcq zzcqVar2 = new zzcq(zzgauVar.zzi());
            if (zzcqVar2.equals(this.zzr)) {
                zzcqVar2 = this.zzr;
            }
            this.zzf.zzq(zzafVar.zzE, zzafVar.zzF);
            this.zze.zzo(iArr);
            try {
                zzcr zza2 = zzcqVar2.zza(new zzcr(zzafVar.zzC, zzafVar.zzB, zzafVar.zzD));
                intValue = zza2.zzd;
                i5 = zza2.zzb;
                int i8 = zza2.zzc;
                intValue2 = zzeu.zzh(i8);
                zzcqVar = zzcqVar2;
                i4 = zzeu.zzj(intValue) * i8;
                i6 = 0;
            } catch (zzcs e) {
                throw new zzpt(e, zzafVar);
            }
        } else {
            zzcq zzcqVar3 = new zzcq(zzgax.zzn());
            int i9 = zzafVar.zzC;
            zzpd zzpdVar = zzpd.zza;
            Pair zzb2 = this.zzt.zzb(zzafVar, this.zzw);
            if (zzb2 == null) {
                throw new zzpt("Unable to configure passthrough for: ".concat(String.valueOf(zzafVar)), zzafVar);
            }
            intValue = ((Integer) zzb2.first).intValue();
            zzcqVar = zzcqVar3;
            i3 = -1;
            intValue2 = ((Integer) zzb2.second).intValue();
            i4 = -1;
            i5 = i9;
            i6 = 2;
        }
        if (intValue == 0) {
            throw new zzpt("Invalid output encoding (mode=" + i6 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        if (intValue2 == 0) {
            throw new zzpt("Invalid output channel config (mode=" + i6 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        int i10 = zzafVar.zzi;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzafVar.zzn) && i10 == -1) {
            i10 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, intValue2, intValue);
        zzdi.zzf(minBufferSize != -2);
        int i11 = i4 != -1 ? i4 : 1;
        int i12 = 250000;
        if (i6 == 0) {
            i7 = i6;
            max = Math.max(zzre.zza(250000, i5, i11), Math.min(minBufferSize * 4, zzre.zza(750000, i5, i11)));
        } else if (i6 != 1) {
            if (intValue == 5) {
                i12 = 500000;
            } else if (intValue == 8) {
                i12 = 1000000;
                intValue = 8;
            }
            i7 = i6;
            max = zzgdu.zzb((i12 * (i10 != -1 ? zzgdn.zzb(i10, 8, RoundingMode.CEILING) : zzre.zzb(intValue))) / 1000000);
        } else {
            i7 = i6;
            max = zzgdu.zzb((zzre.zzb(intValue) * 50000000) / 1000000);
        }
        int i13 = intValue;
        this.zzV = false;
        zzqp zzqpVar = new zzqp(zzafVar, i3, i7, i4, i5, intValue2, i13, (((Math.max(minBufferSize, max) + i11) - 1) / i11) * i11, zzcqVar, false, false, false);
        if (zzY()) {
            this.zzp = zzqpVar;
        } else {
            this.zzq = zzqpVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzf() {
        zzqu zzquVar;
        if (zzY()) {
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzW = false;
            this.zzF = 0;
            this.zzy = new zzqs(this.zzz, 0L, 0L, null);
            this.zzI = 0L;
            this.zzx = null;
            this.zzj.clear();
            this.zzK = null;
            this.zzL = 0;
            this.zzM = null;
            this.zzO = false;
            this.zzN = false;
            this.zzP = false;
            this.zzf.zzp();
            zzV();
            if (this.zzi.zzh()) {
                this.zzs.pause();
            }
            if (zzZ(this.zzs)) {
                zzra zzraVar = this.zzk;
                zzraVar.getClass();
                zzraVar.zzb(this.zzs);
            }
            final zzps zzb2 = this.zzq.zzb();
            zzqp zzqpVar = this.zzp;
            if (zzqpVar != null) {
                this.zzq = zzqpVar;
                this.zzp = null;
            }
            this.zzi.zzc();
            if (zzeu.zza >= 24 && (zzquVar = this.zzv) != null) {
                zzquVar.zzb();
                this.zzv = null;
            }
            final AudioTrack audioTrack = this.zzs;
            final zzpv zzpvVar = this.zzo;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory("ExoPlayer:AudioTrackReleaseThread") { // from class: com.google.android.gms.internal.ads.zzet
                            public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, this.zza);
                            }
                        });
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzrc.zzI(audioTrack, zzpvVar, handler, zzb2);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzs = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzY = 0L;
        this.zzZ = 0L;
        Handler handler2 = this.zzaa;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzg() {
        this.zzG = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzh() {
        this.zzQ = false;
        if (zzY()) {
            if (this.zzi.zzk() || zzZ(this.zzs)) {
                this.zzs.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzi() {
        this.zzQ = true;
        if (zzY()) {
            this.zzi.zzf();
            this.zzs.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzj() throws zzpx {
        if (!this.zzN && zzY() && zzX()) {
            zzR();
            this.zzN = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzk() {
        zzoz zzozVar = this.zzu;
        if (zzozVar != null) {
            zzozVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzl() {
        zzf();
        zzgax zzgaxVar = this.zzg;
        int size = zzgaxVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzct) zzgaxVar.get(i2)).zzf();
        }
        zzgax zzgaxVar2 = this.zzh;
        int size2 = zzgaxVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((zzct) zzgaxVar2.get(i3)).zzf();
        }
        zzcq zzcqVar = this.zzr;
        if (zzcqVar != null) {
            zzcqVar.zzf();
        }
        this.zzQ = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzm(zzh zzhVar) {
        if (this.zzw.equals(zzhVar)) {
            return;
        }
        this.zzw = zzhVar;
        zzoz zzozVar = this.zzu;
        if (zzozVar != null) {
            zzozVar.zzg(zzhVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzn(int i2) {
        if (this.zzR != i2) {
            this.zzR = i2;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzo(zzi zziVar) {
        if (this.zzS.equals(zziVar)) {
            return;
        }
        if (this.zzs != null) {
            int i2 = this.zzS.zza;
        }
        this.zzS = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzp(zzdj zzdjVar) {
        this.zzi.zze(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzq(zzpv zzpvVar) {
        this.zzo = zzpvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    @RequiresApi
    public final void zzr(int i2, int i3) {
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzZ(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzs(zzbq zzbqVar) {
        this.zzz = new zzbq(Math.max(0.1f, Math.min(zzbqVar.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbqVar.zzc, 8.0f)));
        zzT(zzbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzt(@Nullable zzom zzomVar) {
        this.zzn = zzomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    @RequiresApi
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzT = audioDeviceInfo == null ? null : new zzpa(audioDeviceInfo);
        zzoz zzozVar = this.zzu;
        if (zzozVar != null) {
            zzozVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzql.zza(audioTrack, this.zzT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzv(boolean z2) {
        this.zzA = z2;
        zzT(this.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzw(float f2) {
        if (this.zzJ != f2) {
            this.zzJ = f2;
            zzU();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x01b7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0251  */
    @Override // com.google.android.gms.internal.ads.zzpy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzx(java.nio.ByteBuffer r28, long r29, int r31) throws com.google.android.gms.internal.ads.zzpu, com.google.android.gms.internal.ads.zzpx {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrc.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final boolean zzy() {
        boolean isOffloadedPlayback;
        if (!zzY()) {
            return false;
        }
        if (zzeu.zza >= 29) {
            isOffloadedPlayback = this.zzs.isOffloadedPlayback();
            if (isOffloadedPlayback && this.zzP) {
                return false;
            }
        }
        return this.zzi.zzg(zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final boolean zzz() {
        if (zzY()) {
            return this.zzN && !zzy();
        }
        return true;
    }
}
