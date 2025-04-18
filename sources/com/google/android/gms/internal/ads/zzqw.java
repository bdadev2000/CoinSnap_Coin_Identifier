package com.google.android.gms.internal.ads;

import a4.j;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.n;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzqw implements zzpu {
    private static final Object zza = new Object();

    @Nullable
    private static ScheduledExecutorService zzb;
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
    private zzh zzS;

    @Nullable
    private zzow zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;

    @Nullable
    private Looper zzX;
    private long zzY;
    private long zzZ;
    private Handler zzaa;
    private final zzqm zzab;
    private final zzqc zzac;

    @Nullable
    private final Context zzd;
    private final zzpz zze;
    private final zzrg zzf;
    private final zzfzo zzg;
    private final zzfzo zzh;
    private final zzpy zzi;
    private final ArrayDeque zzj;
    private zzqu zzk;
    private final zzqq zzl;
    private final zzqq zzm;

    @Nullable
    private zzoj zzn;

    @Nullable
    private zzpr zzo;

    @Nullable
    private zzql zzp;
    private zzql zzq;
    private zzcj zzr;

    @Nullable
    private AudioTrack zzs;
    private zzop zzt;
    private zzov zzu;

    @Nullable
    private zzqp zzv;
    private zzg zzw;

    @Nullable
    private zzqn zzx;
    private zzqn zzy;
    private zzbj zzz;

    public /* synthetic */ zzqw(zzqk zzqkVar, zzqv zzqvVar) {
        Context context;
        zzop zzopVar;
        zzqm zzqmVar;
        zzqc zzqcVar;
        context = zzqkVar.zza;
        this.zzd = context;
        zzg zzgVar = zzg.zza;
        this.zzw = zzgVar;
        zzqv zzqvVar2 = null;
        if (context != null) {
            zzop zzopVar2 = zzop.zza;
            int i10 = zzen.zza;
            zzopVar = zzop.zzc(context, zzgVar, null);
        } else {
            zzopVar = zzqkVar.zzb;
        }
        this.zzt = zzopVar;
        zzqmVar = zzqkVar.zze;
        this.zzab = zzqmVar;
        int i11 = zzen.zza;
        zzqcVar = zzqkVar.zzf;
        zzqcVar.getClass();
        this.zzac = zzqcVar;
        this.zzi = new zzpy(new zzqr(this, zzqvVar2));
        zzpz zzpzVar = new zzpz();
        this.zze = zzpzVar;
        zzrg zzrgVar = new zzrg();
        this.zzf = zzrgVar;
        this.zzg = zzfzo.zzq(new zzcq(), zzpzVar, zzrgVar);
        this.zzh = zzfzo.zzo(new zzrf());
        this.zzJ = 1.0f;
        this.zzR = 0;
        this.zzS = new zzh(0, 0.0f);
        zzbj zzbjVar = zzbj.zza;
        this.zzy = new zzqn(zzbjVar, 0L, 0L, null);
        this.zzz = zzbjVar;
        this.zzA = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqq();
        this.zzm = new zzqq();
    }

    public static /* synthetic */ void zzG(zzqw zzqwVar) {
        if (zzqwVar.zzZ >= 300000) {
            zzrc.zzah(((zzra) zzqwVar.zzo).zza, true);
            zzqwVar.zzZ = 0L;
        }
    }

    public static /* synthetic */ void zzI(AudioTrack audioTrack, final zzpr zzprVar, Handler handler, final zzpo zzpoVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzprVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpm zzpmVar;
                        zzpmVar = ((zzra) zzpr.this).zza.zzc;
                        zzpmVar.zzd(zzpoVar);
                    }
                });
            }
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th2) {
            if (zzprVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpm zzpmVar;
                        zzpmVar = ((zzra) zzpr.this).zza.zzc;
                        zzpmVar.zzd(zzpoVar);
                    }
                });
            }
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z10;
        synchronized (zza) {
            if (zzc > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        if (this.zzq.zzc == 0) {
            return this.zzB / r0.zzb;
        }
        return this.zzC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzql zzqlVar = this.zzq;
        if (zzqlVar.zzc == 0) {
            long j3 = this.zzD;
            long j10 = zzqlVar.zzd;
            int i10 = zzen.zza;
            return ((j3 + j10) - 1) / j10;
        }
        return this.zzE;
    }

    private final AudioTrack zzN(zzql zzqlVar) throws zzpq {
        try {
            return zzqlVar.zza(this.zzw, this.zzR);
        } catch (zzpq e2) {
            zzpr zzprVar = this.zzo;
            if (zzprVar != null) {
                zzprVar.zza(e2);
            }
            throw e2;
        }
    }

    private final void zzO(long j3) {
        zzbj zzbjVar;
        boolean z10;
        if (zzab()) {
            zzqm zzqmVar = this.zzab;
            zzbjVar = this.zzz;
            zzqmVar.zzc(zzbjVar);
        } else {
            zzbjVar = zzbj.zza;
        }
        zzbj zzbjVar2 = zzbjVar;
        this.zzz = zzbjVar2;
        if (zzab()) {
            zzqm zzqmVar2 = this.zzab;
            z10 = this.zzA;
            zzqmVar2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzA = z10;
        this.zzj.add(new zzqn(zzbjVar2, Math.max(0L, j3), zzen.zzt(zzM(), this.zzq.zze), null));
        zzX();
        zzpr zzprVar = this.zzo;
        if (zzprVar != null) {
            zzrc.zzae(((zzra) zzprVar).zza).zzw(this.zzA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzP(long r8) throws com.google.android.gms.internal.ads.zzpt {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzM
            if (r8 != 0) goto L6
            goto Lb5
        L6:
            com.google.android.gms.internal.ads.zzqq r8 = r7.zzm
            boolean r8 = r8.zzc()
            if (r8 != 0) goto Lb5
            java.nio.ByteBuffer r8 = r7.zzM
            int r8 = r8.remaining()
            android.media.AudioTrack r9 = r7.zzs
            java.nio.ByteBuffer r0 = r7.zzM
            r1 = 1
            int r9 = r9.write(r0, r8, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.zzU = r2
            r2 = 0
            r0 = 0
            if (r9 >= 0) goto L6a
            int r8 = com.google.android.gms.internal.ads.zzen.zza
            r4 = 24
            if (r8 < r4) goto L31
            r8 = -6
            if (r9 == r8) goto L35
        L31:
            r8 = -32
            if (r9 != r8) goto L4a
        L35:
            long r4 = r7.zzM()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L3e
            goto L4b
        L3e:
            android.media.AudioTrack r8 = r7.zzs
            boolean r8 = zzaa(r8)
            if (r8 == 0) goto L4a
            r7.zzQ()
            goto L4b
        L4a:
            r1 = r0
        L4b:
            com.google.android.gms.internal.ads.zzpt r8 = new com.google.android.gms.internal.ads.zzpt
            com.google.android.gms.internal.ads.zzql r0 = r7.zzq
            com.google.android.gms.internal.ads.zzad r0 = r0.zza
            r8.<init>(r9, r0, r1)
            com.google.android.gms.internal.ads.zzpr r9 = r7.zzo
            if (r9 == 0) goto L5b
            r9.zza(r8)
        L5b:
            boolean r9 = r8.zzb
            if (r9 != 0) goto L65
            com.google.android.gms.internal.ads.zzqq r9 = r7.zzm
            r9.zzb(r8)
            return
        L65:
            com.google.android.gms.internal.ads.zzop r9 = com.google.android.gms.internal.ads.zzop.zza
            r7.zzt = r9
            throw r8
        L6a:
            com.google.android.gms.internal.ads.zzqq r4 = r7.zzm
            r4.zza()
            android.media.AudioTrack r4 = r7.zzs
            boolean r4 = zzaa(r4)
            if (r4 == 0) goto L8b
            long r4 = r7.zzE
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L7f
            r7.zzW = r0
        L7f:
            boolean r2 = r7.zzQ
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.zzpr r2 = r7.zzo
            if (r2 == 0) goto L8b
            if (r9 >= r8) goto L8b
            com.google.android.gms.internal.ads.zzra r2 = (com.google.android.gms.internal.ads.zzra) r2
        L8b:
            com.google.android.gms.internal.ads.zzql r2 = r7.zzq
            int r2 = r2.zzc
            if (r2 != 0) goto L97
            long r3 = r7.zzD
            long r5 = (long) r9
            long r3 = r3 + r5
            r7.zzD = r3
        L97:
            if (r9 != r8) goto Lb5
            if (r2 == 0) goto Lb2
            java.nio.ByteBuffer r8 = r7.zzM
            java.nio.ByteBuffer r9 = r7.zzK
            if (r8 != r9) goto La2
            goto La3
        La2:
            r1 = r0
        La3:
            com.google.android.gms.internal.ads.zzdb.zzf(r1)
            long r8 = r7.zzE
            int r0 = r7.zzF
            long r0 = (long) r0
            int r2 = r7.zzL
            long r2 = (long) r2
            long r0 = r0 * r2
            long r0 = r0 + r8
            r7.zzE = r0
        Lb2:
            r8 = 0
            r7.zzM = r8
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqw.zzP(long):void");
    }

    private final void zzQ() {
        if (this.zzq.zzc()) {
            this.zzV = true;
        }
    }

    private final void zzR() {
        if (this.zzu == null && this.zzd != null) {
            this.zzX = Looper.myLooper();
            zzov zzovVar = new zzov(this.zzd, new zzqf(this), this.zzw, this.zzT);
            this.zzu = zzovVar;
            this.zzt = zzovVar.zzc();
        }
    }

    private final void zzS() {
        if (!this.zzO) {
            this.zzO = true;
            this.zzi.zzb(zzM());
            if (zzaa(this.zzs)) {
                this.zzP = false;
            }
            this.zzs.stop();
        }
    }

    private final void zzT(long j3) throws zzpt {
        zzP(j3);
        if (this.zzM == null) {
            if (this.zzr.zzh()) {
                while (!this.zzr.zzg()) {
                    do {
                        ByteBuffer zzb2 = this.zzr.zzb();
                        if (zzb2.hasRemaining()) {
                            zzV(zzb2);
                            zzP(j3);
                        } else {
                            ByteBuffer byteBuffer = this.zzK;
                            if (byteBuffer != null && byteBuffer.hasRemaining()) {
                                this.zzr.zze(this.zzK);
                            } else {
                                return;
                            }
                        }
                    } while (this.zzM == null);
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer2 = this.zzK;
            if (byteBuffer2 != null) {
                zzV(byteBuffer2);
                zzP(j3);
            }
        }
    }

    private final void zzU(zzbj zzbjVar) {
        long j3 = C.TIME_UNSET;
        zzqn zzqnVar = new zzqn(zzbjVar, j3, j3, null);
        if (zzZ()) {
            this.zzx = zzqnVar;
        } else {
            this.zzy = zzqnVar;
        }
    }

    private final void zzV(ByteBuffer byteBuffer) {
        boolean z10;
        if (this.zzM == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        this.zzM = byteBuffer;
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzs.setVolume(this.zzJ);
        }
    }

    private final void zzX() {
        zzcj zzcjVar = this.zzq.zzi;
        this.zzr = zzcjVar;
        zzcjVar.zzc();
    }

    private final boolean zzY() throws zzpt {
        ByteBuffer byteBuffer;
        if (!this.zzr.zzh()) {
            zzP(Long.MIN_VALUE);
            if (this.zzM == null) {
                return true;
            }
            return false;
        }
        this.zzr.zzd();
        zzT(Long.MIN_VALUE);
        if (this.zzr.zzg() && ((byteBuffer = this.zzM) == null || !byteBuffer.hasRemaining())) {
            return true;
        }
        return false;
    }

    private final boolean zzZ() {
        return this.zzs != null;
    }

    private static boolean zzaa(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzen.zza < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private final boolean zzab() {
        zzql zzqlVar = this.zzq;
        if (zzqlVar.zzc != 0) {
            return false;
        }
        int i10 = zzqlVar.zza.zzE;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final boolean zzA(zzad zzadVar) {
        return zza(zzadVar) != 0;
    }

    public final void zzJ(zzop zzopVar) {
        String name;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzX;
        if (looper != myLooper) {
            String str = AbstractJsonLexerKt.NULL;
            if (looper == null) {
                name = AbstractJsonLexerKt.NULL;
            } else {
                name = looper.getThread().getName();
            }
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            }
            throw new IllegalStateException(j.h("Current looper (", str, ") is not the playback looper (", name, ")"));
        }
        if (!zzopVar.equals(this.zzt)) {
            this.zzt = zzopVar;
            zzpr zzprVar = this.zzo;
            if (zzprVar != null) {
                zzrc.zzai(((zzra) zzprVar).zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final int zza(zzad zzadVar) {
        zzR();
        if (MimeTypes.AUDIO_RAW.equals(zzadVar.zzo)) {
            if (!zzen.zzJ(zzadVar.zzE)) {
                e.r("Invalid PCM encoding: ", zzadVar.zzE, "DefaultAudioSink");
                return 0;
            }
            if (zzadVar.zzE == 2) {
                return 2;
            }
            return 1;
        }
        if (this.zzt.zzb(zzadVar, this.zzw) == null) {
            return 0;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final long zzb(boolean z10) {
        long zzq;
        if (zzZ() && !this.zzH) {
            long min = Math.min(this.zzi.zza(z10), zzen.zzt(zzM(), this.zzq.zze));
            while (!this.zzj.isEmpty() && min >= ((zzqn) this.zzj.getFirst()).zzc) {
                this.zzy = (zzqn) this.zzj.remove();
            }
            long j3 = min - this.zzy.zzc;
            if (this.zzj.isEmpty()) {
                zzq = this.zzy.zzb + this.zzab.zza(j3);
            } else {
                zzqn zzqnVar = (zzqn) this.zzj.getFirst();
                zzq = zzqnVar.zzb - zzen.zzq(zzqnVar.zzc - min, this.zzy.zza.zzb);
            }
            long zzb2 = this.zzab.zzb();
            long zzt = zzen.zzt(zzb2, this.zzq.zze) + zzq;
            long j10 = this.zzY;
            if (zzb2 > j10) {
                long zzt2 = zzen.zzt(zzb2 - j10, this.zzq.zze);
                this.zzY = zzb2;
                this.zzZ += zzt2;
                if (this.zzaa == null) {
                    this.zzaa = new Handler(Looper.myLooper());
                }
                this.zzaa.removeCallbacksAndMessages(null);
                this.zzaa.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqw.zzG(zzqw.this);
                    }
                }, 100L);
            }
            return zzt;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final zzbj zzc() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final zzoz zzd(zzad zzadVar) {
        if (this.zzV) {
            return zzoz.zza;
        }
        return this.zzac.zza(zzadVar, this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zze(zzad zzadVar, int i10, @Nullable int[] iArr) throws zzpp {
        int intValue;
        zzcj zzcjVar;
        int i11;
        int intValue2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int max;
        int zzb2;
        zzR();
        if (MimeTypes.AUDIO_RAW.equals(zzadVar.zzo)) {
            zzdb.zzd(zzen.zzJ(zzadVar.zzE));
            i11 = zzen.zzk(zzadVar.zzE) * zzadVar.zzC;
            zzfzl zzfzlVar = new zzfzl();
            zzfzlVar.zzh(this.zzg);
            zzfzlVar.zzg(this.zzab.zze());
            zzcj zzcjVar2 = new zzcj(zzfzlVar.zzi());
            if (zzcjVar2.equals(this.zzr)) {
                zzcjVar2 = this.zzr;
            }
            this.zzf.zzq(zzadVar.zzF, zzadVar.zzG);
            this.zze.zzo(iArr);
            try {
                zzck zza2 = zzcjVar2.zza(new zzck(zzadVar.zzD, zzadVar.zzC, zzadVar.zzE));
                intValue = zza2.zzd;
                i13 = zza2.zzb;
                int i17 = zza2.zzc;
                intValue2 = zzen.zzi(i17);
                zzcjVar = zzcjVar2;
                i12 = zzen.zzk(intValue) * i17;
                i14 = 0;
            } catch (zzcl e2) {
                throw new zzpp(e2, zzadVar);
            }
        } else {
            zzcj zzcjVar3 = new zzcj(zzfzo.zzn());
            int i18 = zzadVar.zzD;
            zzoz zzozVar = zzoz.zza;
            Pair zzb3 = this.zzt.zzb(zzadVar, this.zzw);
            if (zzb3 != null) {
                intValue = ((Integer) zzb3.first).intValue();
                zzcjVar = zzcjVar3;
                i11 = -1;
                intValue2 = ((Integer) zzb3.second).intValue();
                i12 = -1;
                i13 = i18;
                i14 = 2;
            } else {
                throw new zzpp("Unable to configure passthrough for: ".concat(String.valueOf(zzadVar)), zzadVar);
            }
        }
        if (intValue != 0) {
            if (intValue2 != 0) {
                int i19 = zzadVar.zzj;
                if (MimeTypes.AUDIO_DTS_EXPRESS.equals(zzadVar.zzo) && i19 == -1) {
                    i19 = 768000;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i13, intValue2, intValue);
                if (minBufferSize != -2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdb.zzf(z10);
                if (i12 != -1) {
                    i15 = i12;
                } else {
                    i15 = 1;
                }
                int i20 = 250000;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (intValue == 5) {
                            i20 = 500000;
                        } else if (intValue == 8) {
                            i20 = DurationKt.NANOS_IN_MILLIS;
                            intValue = 8;
                        }
                        if (i19 != -1) {
                            zzb2 = zzgck.zzb(i19, 8, RoundingMode.CEILING);
                        } else {
                            zzb2 = zzqy.zzb(intValue);
                        }
                        i16 = i14;
                        max = zzgcr.zzb((i20 * zzb2) / 1000000);
                    } else {
                        i16 = i14;
                        max = zzgcr.zzb((zzqy.zzb(intValue) * 50000000) / 1000000);
                    }
                } else {
                    i16 = i14;
                    max = Math.max(zzqy.zza(250000, i13, i15), Math.min(minBufferSize * 4, zzqy.zza(750000, i13, i15)));
                }
                this.zzV = false;
                zzql zzqlVar = new zzql(zzadVar, i11, i16, i12, i13, intValue2, intValue, (((Math.max(minBufferSize, max) + i15) - 1) / i15) * i15, zzcjVar, false, false, false);
                if (zzZ()) {
                    this.zzp = zzqlVar;
                    return;
                } else {
                    this.zzq = zzqlVar;
                    return;
                }
            }
            throw new zzpp("Invalid output channel config (mode=" + i14 + ") for: " + String.valueOf(zzadVar), zzadVar);
        }
        throw new zzpp("Invalid output encoding (mode=" + i14 + ") for: " + String.valueOf(zzadVar), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzf() {
        zzqp zzqpVar;
        if (zzZ()) {
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzW = false;
            this.zzF = 0;
            this.zzy = new zzqn(this.zzz, 0L, 0L, null);
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
            zzX();
            if (this.zzi.zzh()) {
                this.zzs.pause();
            }
            if (zzaa(this.zzs)) {
                zzqu zzquVar = this.zzk;
                zzquVar.getClass();
                zzquVar.zzb(this.zzs);
            }
            final zzpo zzb2 = this.zzq.zzb();
            zzql zzqlVar = this.zzp;
            if (zzqlVar != null) {
                this.zzq = zzqlVar;
                this.zzp = null;
            }
            this.zzi.zzc();
            if (zzen.zza >= 24 && (zzqpVar = this.zzv) != null) {
                zzqpVar.zzb();
                this.zzv = null;
            }
            final AudioTrack audioTrack = this.zzs;
            final zzpr zzprVar = this.zzo;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    final String str = "ExoPlayer:AudioTrackReleaseThread";
                    zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.zzem
                        public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new Thread(runnable, this.zza);
                        }
                    });
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqw.zzI(audioTrack, zzprVar, handler, zzb2);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
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

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzg() {
        this.zzG = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzh() {
        this.zzQ = false;
        if (zzZ()) {
            if (this.zzi.zzk() || zzaa(this.zzs)) {
                this.zzs.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzi() {
        this.zzQ = true;
        if (zzZ()) {
            this.zzi.zzf();
            this.zzs.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzj() throws zzpt {
        if (!this.zzN && zzZ() && zzY()) {
            zzS();
            this.zzN = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzk() {
        zzov zzovVar = this.zzu;
        if (zzovVar != null) {
            zzovVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzl() {
        zzf();
        zzfzo zzfzoVar = this.zzg;
        int size = zzfzoVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzcm) zzfzoVar.get(i10)).zzf();
        }
        zzfzo zzfzoVar2 = this.zzh;
        int size2 = zzfzoVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzcm) zzfzoVar2.get(i11)).zzf();
        }
        zzcj zzcjVar = this.zzr;
        if (zzcjVar != null) {
            zzcjVar.zzf();
        }
        this.zzQ = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzm(zzg zzgVar) {
        if (this.zzw.equals(zzgVar)) {
            return;
        }
        this.zzw = zzgVar;
        zzov zzovVar = this.zzu;
        if (zzovVar != null) {
            zzovVar.zzg(zzgVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzn(int i10) {
        if (this.zzR != i10) {
            this.zzR = i10;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzo(zzh zzhVar) {
        if (this.zzS.equals(zzhVar)) {
            return;
        }
        if (this.zzs != null) {
            int i10 = this.zzS.zza;
        }
        this.zzS = zzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzp(zzdc zzdcVar) {
        this.zzi.zze(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzq(zzpr zzprVar) {
        this.zzo = zzprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    @RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
    public final void zzr(int i10, int i11) {
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzs(zzbj zzbjVar) {
        this.zzz = new zzbj(Math.max(0.1f, Math.min(zzbjVar.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbjVar.zzc, 8.0f)));
        zzU(zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzt(@Nullable zzoj zzojVar) {
        this.zzn = zzojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    @RequiresApi(23)
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        zzow zzowVar;
        if (audioDeviceInfo == null) {
            zzowVar = null;
        } else {
            zzowVar = new zzow(audioDeviceInfo);
        }
        this.zzT = zzowVar;
        zzov zzovVar = this.zzu;
        if (zzovVar != null) {
            zzovVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzs;
        if (audioTrack != null) {
            zzqh.zza(audioTrack, this.zzT);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzv(boolean z10) {
        this.zzA = z10;
        zzU(this.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzw(float f10) {
        if (this.zzJ != f10) {
            this.zzJ = f10;
            zzW();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x01ac. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x01b1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d4 A[PHI: r11
      0x02d4: PHI (r11v7 int) = (r11v5 int), (r11v5 int), (r11v8 int), (r11v5 int), (r11v5 int) binds: [B:92:0x024f, B:94:0x0258, B:63:0x01dc, B:57:0x01ac, B:59:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40, types: [int] */
    /* JADX WARN: Type inference failed for: r6v45 */
    @Override // com.google.android.gms.internal.ads.zzpu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzx(java.nio.ByteBuffer r25, long r26, int r28) throws com.google.android.gms.internal.ads.zzpq, com.google.android.gms.internal.ads.zzpt {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqw.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final boolean zzy() {
        boolean isOffloadedPlayback;
        if (zzZ()) {
            if (zzen.zza >= 29) {
                isOffloadedPlayback = this.zzs.isOffloadedPlayback();
                if (isOffloadedPlayback && this.zzP) {
                    return false;
                }
            }
            if (this.zzi.zzg(zzM())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final boolean zzz() {
        if (zzZ()) {
            return this.zzN && !zzy();
        }
        return true;
    }
}
