package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class zztv extends zziw {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private int zzH;

    @Nullable
    private ByteBuffer zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private long zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzix zza;
    private zztu zzaa;
    private long zzab;
    private boolean zzac;

    @Nullable
    private zzsu zzad;

    @Nullable
    private zzsu zzae;
    private final zztl zzc;
    private final zztx zzd;
    private final float zze;
    private final zzin zzf;
    private final zzin zzg;
    private final zzin zzh;
    private final zzti zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzsg zzl;

    @Nullable
    private zzan zzm;

    @Nullable
    private zzan zzn;

    @Nullable
    private MediaCrypto zzo;
    private float zzp;

    @Nullable
    private zztm zzq;

    @Nullable
    private zzan zzr;

    @Nullable
    private MediaFormat zzs;
    private boolean zzt;
    private float zzu;

    @Nullable
    private ArrayDeque zzv;

    @Nullable
    private zztt zzw;

    @Nullable
    private zztp zzx;
    private int zzy;
    private boolean zzz;

    public zztv(int i9, zztl zztlVar, zztx zztxVar, boolean z8, float f9) {
        super(i9);
        this.zzc = zztlVar;
        this.zzd = zztxVar;
        this.zze = f9;
        this.zzf = new zzin(0, 0);
        this.zzg = new zzin(0, 0);
        this.zzh = new zzin(2, 0);
        zzti zztiVar = new zzti();
        this.zzi = zztiVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzp = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzaa = zztu.zza;
        zztiVar.zzi(0);
        zztiVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzsg();
        this.zzu = -1.0f;
        this.zzy = 0;
        this.zzP = 0;
        this.zzG = -1;
        this.zzH = -1;
        this.zzF = C.TIME_UNSET;
        this.zzV = C.TIME_UNSET;
        this.zzW = C.TIME_UNSET;
        this.zzab = C.TIME_UNSET;
        this.zzQ = 0;
        this.zzR = 0;
        this.zza = new zzix();
    }

    public static boolean zzaL(zzan zzanVar) {
        if (zzanVar.zzH != 0) {
            return false;
        }
        return true;
    }

    private final void zzaM() {
        this.zzG = -1;
        this.zzg.zzc = null;
    }

    private final void zzaN() {
        this.zzH = -1;
        this.zzI = null;
    }

    private final void zzaO(zztu zztuVar) {
        this.zzaa = zztuVar;
        if (zztuVar.zzd != C.TIME_UNSET) {
            this.zzac = true;
        }
    }

    @RequiresApi(23)
    private final void zzaP() throws zzjh {
        zzsu zzsuVar = this.zzae;
        zzsuVar.getClass();
        this.zzad = zzsuVar;
        this.zzQ = 0;
        this.zzR = 0;
    }

    @TargetApi(23)
    private final boolean zzaQ() throws zzjh {
        if (this.zzS) {
            this.zzQ = 1;
            if (this.zzA) {
                this.zzR = 3;
                return false;
            }
            this.zzR = 2;
        } else {
            zzaP();
        }
        return true;
    }

    private final boolean zzaR() throws zzjh {
        zztm zztmVar = this.zzq;
        if (zztmVar == null || this.zzQ == 2 || this.zzX) {
            return false;
        }
        if (this.zzG < 0) {
            int zza = zztmVar.zza();
            this.zzG = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = zztmVar.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzQ == 1) {
            if (!this.zzE) {
                this.zzT = true;
                zztmVar.zzj(this.zzG, 0, 0, 0L, 4);
                zzaM();
            }
            this.zzQ = 2;
            return false;
        }
        if (this.zzC) {
            this.zzC = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zztmVar.zzj(this.zzG, 0, 38, 0L, 0);
            zzaM();
            this.zzS = true;
            return true;
        }
        if (this.zzP == 1) {
            int i9 = 0;
            while (true) {
                zzan zzanVar = this.zzr;
                zzanVar.getClass();
                if (i9 >= zzanVar.zzp.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.zzr.zzp.get(i9);
                ByteBuffer byteBuffer2 = this.zzg.zzc;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i9++;
            }
            this.zzP = 2;
        }
        ByteBuffer byteBuffer3 = this.zzg.zzc;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        zzlj zzcX = zzcX();
        try {
            int zzcV = zzcV(zzcX, this.zzg, 0);
            if (zzcV == -3) {
                if (zzQ()) {
                    this.zzW = this.zzV;
                }
                return false;
            }
            if (zzcV == -5) {
                if (this.zzP == 2) {
                    this.zzg.zzb();
                    this.zzP = 1;
                }
                zzac(zzcX);
                return true;
            }
            zzin zzinVar = this.zzg;
            if (zzinVar.zzf()) {
                this.zzW = this.zzV;
                if (this.zzP == 2) {
                    zzinVar.zzb();
                    this.zzP = 1;
                }
                this.zzX = true;
                if (!this.zzS) {
                    zzao();
                    return false;
                }
                try {
                    if (!this.zzE) {
                        this.zzT = true;
                        zztmVar.zzj(this.zzG, 0, 0, 0L, 4);
                        zzaM();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e4) {
                    throw zzi(e4, this.zzm, false, zzgd.zzj(e4.getErrorCode()));
                }
            }
            if (!this.zzS && !zzinVar.zzg()) {
                zzinVar.zzb();
                if (this.zzP == 2) {
                    this.zzP = 1;
                }
                return true;
            }
            boolean zzk = zzinVar.zzk();
            if (zzk) {
                zzinVar.zzb.zzb(position);
            }
            long j7 = this.zzg.zze;
            if (this.zzZ) {
                if (!this.zzk.isEmpty()) {
                    zzga zzgaVar = ((zztu) this.zzk.peekLast()).zze;
                    zzan zzanVar2 = this.zzm;
                    zzanVar2.getClass();
                    zzgaVar.zzd(j7, zzanVar2);
                } else {
                    zzga zzgaVar2 = this.zzaa.zze;
                    zzan zzanVar3 = this.zzm;
                    zzanVar3.getClass();
                    zzgaVar2.zzd(j7, zzanVar3);
                }
                this.zzZ = false;
            }
            long max = Math.max(this.zzV, j7);
            this.zzV = max;
            if (zzQ() || this.zzg.zzh()) {
                this.zzW = max;
            }
            this.zzg.zzj();
            zzin zzinVar2 = this.zzg;
            if (zzinVar2.zze()) {
                zzaj(zzinVar2);
            }
            zzaB(this.zzg);
            zzat(this.zzg);
            try {
                if (zzk) {
                    zztmVar.zzk(this.zzG, 0, this.zzg.zzb, j7, 0);
                } else {
                    int i10 = this.zzG;
                    ByteBuffer byteBuffer4 = this.zzg.zzc;
                    byteBuffer4.getClass();
                    zztmVar.zzj(i10, 0, byteBuffer4.limit(), j7, 0);
                }
                zzaM();
                this.zzS = true;
                this.zzP = 0;
                this.zza.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e9) {
                throw zzi(e9, this.zzm, false, zzgd.zzj(e9.getErrorCode()));
            }
        } catch (zzim e10) {
            zzak(e10);
            zzaU(0);
            zzah();
            return true;
        }
    }

    private final boolean zzaS() {
        return this.zzH >= 0;
    }

    private final boolean zzaT(long j7, long j9) {
        if (j9 >= j7) {
            return false;
        }
        zzan zzanVar = this.zzn;
        if (zzanVar == null || !Objects.equals(zzanVar.zzn, MimeTypes.AUDIO_OPUS)) {
            return true;
        }
        if (zzaep.zzf(j7, j9)) {
            return false;
        }
        return true;
    }

    private final boolean zzaU(int i9) throws zzjh {
        zzin zzinVar = this.zzf;
        zzlj zzcX = zzcX();
        zzinVar.zzb();
        int zzcV = zzcV(zzcX, this.zzf, i9 | 4);
        if (zzcV == -5) {
            zzac(zzcX);
            return true;
        }
        if (zzcV == -4 && this.zzf.zzf()) {
            this.zzX = true;
            zzao();
            return false;
        }
        return false;
    }

    private final boolean zzaV(@Nullable zzan zzanVar) throws zzjh {
        if (zzgd.zza >= 23 && this.zzq != null && this.zzR != 3 && zzcU() != 0) {
            float f9 = this.zzp;
            zzanVar.getClass();
            float zzZ = zzZ(f9, zzanVar, zzT());
            float f10 = this.zzu;
            if (f10 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f10 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zztm zztmVar = this.zzq;
                    zztmVar.getClass();
                    zztmVar.zzp(bundle);
                    this.zzu = zzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzN = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzM = false;
        this.zzL = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzjh {
        if (this.zzS) {
            this.zzQ = 1;
            this.zzR = 3;
        } else {
            zzaD();
            zzaz();
        }
    }

    private final void zzah() {
        try {
            zztm zztmVar = this.zzq;
            zzeq.zzb(zztmVar);
            zztmVar.zzi();
        } finally {
            zzaE();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzai(com.google.android.gms.internal.ads.zztp r18, @androidx.annotation.Nullable android.media.MediaCrypto r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzai(com.google.android.gms.internal.ads.zztp, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzao() throws zzjh {
        int i9 = this.zzR;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    this.zzY = true;
                    zzaq();
                    return;
                } else {
                    zzaD();
                    zzaz();
                    return;
                }
            }
            zzah();
            zzaP();
            return;
        }
        zzah();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public void zzC() {
        try {
            zzad();
            zzaD();
        } finally {
            this.zzae = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzF(com.google.android.gms.internal.ads.zzan[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzvo r18) throws com.google.android.gms.internal.ads.zzjh {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zztu r1 = r0.zzaa
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zztu r1 = new com.google.android.gms.internal.ads.zztu
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaO(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzV
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzab
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zztu r1 = new com.google.android.gms.internal.ads.zztu
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaO(r1)
            com.google.android.gms.internal.ads.zztu r1 = r0.zzaa
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzap()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zztu r9 = new com.google.android.gms.internal.ads.zztu
            long r3 = r0.zzV
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzF(com.google.android.gms.internal.ads.zzan[], long, long, com.google.android.gms.internal.ads.zzvo):void");
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    public void zzM(float f9, float f10) throws zzjh {
        this.zzp = f10;
        zzaV(this.zzr);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzmn
    public void zzV(long r22, long r24) throws com.google.android.gms.internal.ads.zzjh {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public boolean zzW() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaS()) {
            return true;
        }
        if (this.zzF == C.TIME_UNSET) {
            return false;
        }
        zzh();
        if (SystemClock.elapsedRealtime() >= this.zzF) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final int zzY(zzan zzanVar) throws zzjh {
        try {
            return zzaa(this.zzd, zzanVar);
        } catch (zzud e4) {
            throw zzi(e4, zzanVar, false, 4002);
        }
    }

    public float zzZ(float f9, zzan zzanVar, zzan[] zzanVarArr) {
        throw null;
    }

    @CallSuper
    public void zzaA(long j7) {
        this.zzab = j7;
        while (!this.zzk.isEmpty() && j7 >= ((zztu) this.zzk.peek()).zzb) {
            zztu zztuVar = (zztu) this.zzk.poll();
            zztuVar.getClass();
            zzaO(zztuVar);
            zzap();
        }
    }

    public void zzaB(zzin zzinVar) throws zzjh {
    }

    public void zzaC(zzan zzanVar) throws zzjh {
    }

    public final void zzaD() {
        try {
            zztm zztmVar = this.zzq;
            if (zztmVar != null) {
                zztmVar.zzl();
                this.zza.zzb++;
                zztp zztpVar = this.zzx;
                zztpVar.getClass();
                zzam(zztpVar.zza);
            }
        } finally {
            this.zzq = null;
            this.zzo = null;
            this.zzad = null;
            zzaF();
        }
    }

    @CallSuper
    public void zzaE() {
        zzaM();
        zzaN();
        this.zzF = C.TIME_UNSET;
        this.zzT = false;
        this.zzS = false;
        this.zzC = false;
        this.zzD = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzV = C.TIME_UNSET;
        this.zzW = C.TIME_UNSET;
        this.zzab = C.TIME_UNSET;
        this.zzQ = 0;
        this.zzR = 0;
        this.zzP = this.zzO ? 1 : 0;
    }

    @CallSuper
    public final void zzaF() {
        zzaE();
        this.zzv = null;
        this.zzx = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = false;
        this.zzU = false;
        this.zzu = -1.0f;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        this.zzE = false;
        this.zzO = false;
        this.zzP = 0;
    }

    public final boolean zzaG() throws zzjh {
        boolean zzaH = zzaH();
        if (zzaH) {
            zzaz();
        }
        return zzaH;
    }

    public final boolean zzaH() {
        boolean z8;
        if (this.zzq == null) {
            return false;
        }
        int i9 = this.zzR;
        if (i9 != 3 && ((!this.zzz || this.zzU) && (!this.zzA || !this.zzT))) {
            if (i9 == 2) {
                int i10 = zzgd.zza;
                if (i10 >= 23) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzeq.zzf(z8);
                if (i10 >= 23) {
                    try {
                        zzaP();
                    } catch (zzjh e4) {
                        zzfk.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
                        zzaD();
                        return true;
                    }
                }
            }
            zzah();
            return false;
        }
        zzaD();
        return true;
    }

    public final boolean zzaI() {
        return this.zzL;
    }

    public final boolean zzaJ(zzan zzanVar) {
        if (this.zzae == null && zzas(zzanVar)) {
            return true;
        }
        return false;
    }

    public boolean zzaK(zztp zztpVar) {
        return true;
    }

    public abstract int zzaa(zztx zztxVar, zzan zzanVar) throws zzud;

    public zziy zzab(zztp zztpVar, zzan zzanVar, zzan zzanVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        if (zzaQ() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
    
        if (zzaQ() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a9, code lost:
    
        if (zzaQ() == false) goto L68;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zziy zzac(com.google.android.gms.internal.ads.zzlj r12) throws com.google.android.gms.internal.ads.zzjh {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzac(com.google.android.gms.internal.ads.zzlj):com.google.android.gms.internal.ads.zziy");
    }

    public abstract zztk zzaf(zztp zztpVar, zzan zzanVar, @Nullable MediaCrypto mediaCrypto, float f9);

    public abstract List zzag(zztx zztxVar, zzan zzanVar, boolean z8) throws zzud;

    public void zzaj(zzin zzinVar) throws zzjh {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    public void zzal(String str, zztk zztkVar, long j7, long j9) {
        throw null;
    }

    public void zzam(String str) {
        throw null;
    }

    public void zzan(zzan zzanVar, @Nullable MediaFormat mediaFormat) throws zzjh {
        throw null;
    }

    public void zzap() {
    }

    public void zzaq() throws zzjh {
    }

    public abstract boolean zzar(long j7, long j9, @Nullable zztm zztmVar, @Nullable ByteBuffer byteBuffer, int i9, int i10, int i11, long j10, boolean z8, boolean z9, zzan zzanVar) throws zzjh;

    public boolean zzas(zzan zzanVar) {
        return false;
    }

    public int zzat(zzin zzinVar) {
        return 0;
    }

    public final long zzau() {
        return this.zzaa.zzd;
    }

    public final long zzav() {
        return this.zzaa.zzc;
    }

    @Nullable
    public final zztm zzaw() {
        return this.zzq;
    }

    public zzto zzax(Throwable th, @Nullable zztp zztpVar) {
        return new zzto(th, zztpVar);
    }

    @Nullable
    public final zztp zzay() {
        return this.zzx;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[Catch: zztt -> 0x005d, TryCatch #1 {zztt -> 0x005d, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x0060, B:30:0x0065, B:80:0x006a, B:82:0x0080, B:83:0x008e, B:33:0x009a, B:35:0x00a2, B:37:0x00a7, B:38:0x00ad, B:40:0x00b1, B:42:0x00ba, B:57:0x00da, B:59:0x00f4, B:60:0x00fd, B:65:0x0104, B:66:0x0106, B:67:0x00f7, B:75:0x0107, B:77:0x010a, B:78:0x0112, B:87:0x0091, B:88:0x0099, B:53:0x00c9, B:69:0x00d9, B:45:0x00c0), top: B:24:0x0053, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7 A[Catch: zztt -> 0x005d, TryCatch #1 {zztt -> 0x005d, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x0060, B:30:0x0065, B:80:0x006a, B:82:0x0080, B:83:0x008e, B:33:0x009a, B:35:0x00a2, B:37:0x00a7, B:38:0x00ad, B:40:0x00b1, B:42:0x00ba, B:57:0x00da, B:59:0x00f4, B:60:0x00fd, B:65:0x0104, B:66:0x0106, B:67:0x00f7, B:75:0x0107, B:77:0x010a, B:78:0x0112, B:87:0x0091, B:88:0x0099, B:53:0x00c9, B:69:0x00d9, B:45:0x00c0), top: B:24:0x0053, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaz() throws com.google.android.gms.internal.ads.zzjh {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzaz():void");
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmp
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public void zzw() {
        this.zzm = null;
        zzaO(zztu.zza);
        this.zzk.clear();
        zzaH();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public void zzx(boolean z8, boolean z9) throws zzjh {
        this.zza = new zzix();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public void zzz(long j7, boolean z8) throws zzjh {
        this.zzX = false;
        this.zzY = false;
        if (this.zzL) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzM = false;
            this.zzl.zzb();
        } else {
            zzaG();
        }
        zzga zzgaVar = this.zzaa.zze;
        if (zzgaVar.zza() > 0) {
            this.zzZ = true;
        }
        zzgaVar.zze();
        this.zzk.clear();
    }
}
