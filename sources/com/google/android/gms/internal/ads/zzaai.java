package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.n;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaai extends zzsy implements zzaao {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private zzci zzD;

    @Nullable
    private zzci zzE;
    private int zzF;
    private int zzG;

    @Nullable
    private zzaam zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final Context zze;
    private final boolean zzf;
    private final zzabf zzg;
    private final boolean zzh;
    private final zzaap zzi;
    private final zzaan zzj;
    private zzaah zzk;
    private boolean zzl;
    private boolean zzm;
    private zzabl zzn;
    private boolean zzo;
    private List zzp;

    @Nullable
    private Surface zzq;

    @Nullable
    private zzaal zzr;
    private zzee zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    public zzaai(Context context, zzsl zzslVar, zzta zztaVar, long j3, boolean z10, @Nullable Handler handler, @Nullable zzabg zzabgVar, int i10, float f10) {
        super(2, zzslVar, zztaVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzn = null;
        this.zzg = new zzabf(handler, zzabgVar);
        this.zzf = true;
        this.zzi = new zzaap(applicationContext, this, 0L);
        this.zzj = new zzaan();
        this.zzh = "NVIDIA".equals(zzen.zzc);
        this.zzs = zzee.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = zzci.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = -1000;
        this.zzI = C.TIME_UNSET;
        this.zzJ = C.TIME_UNSET;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04bf, code lost:
    
        if (r0.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x079d, code lost:
    
        if (r10 != 0) goto L515;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzaU(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaai.zzaU(java.lang.String):boolean");
    }

    public static final boolean zzaV(zzsq zzsqVar) {
        return zzen.zza >= 35 && zzsqVar.zzh;
    }

    @Nullable
    private final Surface zzaW(zzsq zzsqVar) {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            return zzablVar.zzd();
        }
        Surface surface = this.zzq;
        if (surface != null) {
            return surface;
        }
        if (zzaV(zzsqVar)) {
            return null;
        }
        zzdb.zzf(zzbc(zzsqVar));
        zzaal zzaalVar = this.zzr;
        if (zzaalVar != null) {
            if (zzaalVar.zza != zzsqVar.zzf) {
                zzba();
            }
        }
        if (this.zzr == null) {
            this.zzr = zzaal.zza(this.zze, zzsqVar.zzf);
        }
        return this.zzr;
    }

    private static List zzaX(Context context, zzta zztaVar, zzad zzadVar, boolean z10, boolean z11) throws zztf {
        String str = zzadVar.zzo;
        if (str == null) {
            return zzfzo.zzn();
        }
        if (zzen.zza >= 26 && "video/dolby-vision".equals(str) && !zzaag.zza(context)) {
            List zzc2 = zztl.zzc(zztaVar, zzadVar, z10, z11);
            if (!zzc2.isEmpty()) {
                return zzc2;
            }
        }
        return zztl.zze(zztaVar, zzadVar, z10, z11);
    }

    private final void zzaY() {
        zzci zzciVar = this.zzE;
        if (zzciVar != null) {
            this.zzg.zzt(zzciVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaZ() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0077, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0085. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzad(com.google.android.gms.internal.ads.zzsq r10, com.google.android.gms.internal.ads.zzad r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaai.zzad(com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzad):int");
    }

    public static int zzae(zzsq zzsqVar, zzad zzadVar) {
        if (zzadVar.zzp != -1) {
            int size = zzadVar.zzr.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) zzadVar.zzr.get(i11)).length;
            }
            return zzadVar.zzp + i10;
        }
        return zzad(zzsqVar, zzadVar);
    }

    private final void zzba() {
        zzaal zzaalVar = this.zzr;
        if (zzaalVar != null) {
            zzaalVar.release();
            this.zzr = null;
        }
    }

    private final boolean zzbb(zzsq zzsqVar) {
        if (this.zzq == null && !zzaV(zzsqVar) && !zzbc(zzsqVar)) {
            return false;
        }
        return true;
    }

    private final boolean zzbc(zzsq zzsqVar) {
        if (zzen.zza < 23 || zzaU(zzsqVar.zza)) {
            return false;
        }
        if (zzsqVar.zzf && !zzaal.zzb(this.zze)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzA() {
        zzabl zzablVar = this.zzn;
        if (zzablVar == null || !this.zzf) {
            return;
        }
        zzablVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzo = false;
            this.zzI = C.TIME_UNSET;
            zzba();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzD() {
        this.zzx = 0;
        this.zzw = zzi().zzb();
        this.zzA = 0L;
        this.zzB = 0;
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzm();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzE() {
        if (this.zzx > 0) {
            long zzb2 = zzi().zzb();
            this.zzg.zzd(this.zzx, zzb2 - this.zzw);
            this.zzx = 0;
            this.zzw = zzb2;
        }
        int i10 = this.zzB;
        if (i10 != 0) {
            this.zzg.zzr(this.zzA, i10);
            this.zzA = 0L;
            this.zzB = 0;
        }
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzn();
        } else {
            this.zzi.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzF(zzad[] zzadVarArr, long j3, long j10, zzur zzurVar) throws zzig {
        super.zzF(zzadVarArr, j3, j10, zzurVar);
        if (this.zzI == C.TIME_UNSET) {
            this.zzI = j3;
        }
        zzbv zzh = zzh();
        if (zzh.zzo()) {
            this.zzJ = C.TIME_UNSET;
        } else {
            this.zzJ = zzh.zzn(zzurVar.zza, new zzbt()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    public final void zzM(float f10, float f11) throws zzig {
        super.zzM(f10, f11);
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzt(f10);
        } else {
            this.zzi.zzn(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlq
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    @CallSuper
    public final void zzV(long j3, long j10) throws zzig {
        super.zzV(j3, j10);
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            try {
                zzablVar.zzp(j3, j10);
            } catch (zzabk e2) {
                throw zzcY(e2, e2.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzW() {
        return super.zzW() && this.zzn == null;
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzX() {
        boolean zzX = super.zzX();
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            return zzablVar.zzy(zzX);
        }
        if (zzX && (zzaz() == null || this.zzq == null)) {
            return true;
        }
        return this.zzi.zzo(zzX);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final float zzZ(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        float f11 = -1.0f;
        for (zzad zzadVar2 : zzadVarArr) {
            float f12 = zzadVar2.zzw;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsp zzaA(Throwable th2, @Nullable zzsq zzsqVar) {
        return new zzaad(th2, zzsqVar, this.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    @CallSuper
    public final void zzaD(long j3) {
        super.zzaD(j3);
        this.zzz--;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    @CallSuper
    public final void zzaE(zzhm zzhmVar) throws zzig {
        this.zzz++;
        int i10 = zzen.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    @CallSuper
    public final void zzaF(zzad zzadVar) throws zzig {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            try {
                zzablVar.zzh(zzadVar);
            } catch (zzabk e2) {
                throw zzcY(e2, zzadVar, false, 7000);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    @CallSuper
    public final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaN(zzsq zzsqVar) {
        return zzbb(zzsqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaO(zzhm zzhmVar) {
        if (zzhmVar.zzi() && !zzQ() && !zzhmVar.zzh() && this.zzJ != C.TIME_UNSET) {
            if (this.zzJ - (zzhmVar.zze - zzav()) > 100000 && !zzhmVar.zzl() && zzhmVar.zze < zzf()) {
                return true;
            }
        }
        return false;
    }

    public final void zzaQ(zzsn zzsnVar, int i10, long j3) {
        Trace.beginSection("skipVideoBuffer");
        zzsnVar.zzo(i10, false);
        Trace.endSection();
        ((zzsy) this).zza.zzf++;
    }

    public final void zzaR(int i10, int i11) {
        zzhx zzhxVar = ((zzsy) this).zza;
        zzhxVar.zzh += i10;
        int i12 = i10 + i11;
        zzhxVar.zzg += i12;
        this.zzx += i12;
        int i13 = this.zzy + i12;
        this.zzy = i13;
        zzhxVar.zzi = Math.max(i13, zzhxVar.zzi);
    }

    public final void zzaS(long j3) {
        zzhx zzhxVar = ((zzsy) this).zza;
        zzhxVar.zzk += j3;
        zzhxVar.zzl++;
        this.zzA += j3;
        this.zzB++;
    }

    public final boolean zzaT(long j3, boolean z10) throws zzig {
        int zzd2 = zzd(j3);
        if (zzd2 == 0) {
            return false;
        }
        if (z10) {
            zzhx zzhxVar = ((zzsy) this).zza;
            zzhxVar.zzd += zzd2;
            zzhxVar.zzf += this.zzz;
        } else {
            ((zzsy) this).zza.zzj++;
            zzaR(zzd2, this.zzz);
        }
        zzaJ();
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzaa(zzta zztaVar, zzad zzadVar) throws zztf {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13 = 128;
        if (!zzbg.zzi(zzadVar.zzo)) {
            return 128;
        }
        int i14 = 1;
        int i15 = 0;
        if (zzadVar.zzs != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        List zzaX = zzaX(this.zze, zztaVar, zzadVar, z10, false);
        if (z10 && zzaX.isEmpty()) {
            zzaX = zzaX(this.zze, zztaVar, zzadVar, false, false);
        }
        if (!zzaX.isEmpty()) {
            if (!zzsy.zzaP(zzadVar)) {
                i14 = 2;
            } else {
                zzsq zzsqVar = (zzsq) zzaX.get(0);
                boolean zze = zzsqVar.zze(zzadVar);
                if (!zze) {
                    for (int i16 = 1; i16 < zzaX.size(); i16++) {
                        zzsq zzsqVar2 = (zzsq) zzaX.get(i16);
                        if (zzsqVar2.zze(zzadVar)) {
                            zze = true;
                            z11 = false;
                            zzsqVar = zzsqVar2;
                            break;
                        }
                    }
                }
                z11 = true;
                if (true != zze) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
                if (true != zzsqVar.zzf(zzadVar)) {
                    i11 = 8;
                } else {
                    i11 = 16;
                }
                if (true != zzsqVar.zzg) {
                    i12 = 0;
                } else {
                    i12 = 64;
                }
                if (true != z11) {
                    i13 = 0;
                }
                if (zzen.zza >= 26 && "video/dolby-vision".equals(zzadVar.zzo) && !zzaag.zza(this.zze)) {
                    i13 = NotificationCompat.FLAG_LOCAL_ONLY;
                }
                if (zze) {
                    List zzaX2 = zzaX(this.zze, zztaVar, zzadVar, z10, true);
                    if (!zzaX2.isEmpty()) {
                        zzsq zzsqVar3 = (zzsq) zztl.zzf(zzaX2, zzadVar).get(0);
                        if (zzsqVar3.zze(zzadVar) && zzsqVar3.zzf(zzadVar)) {
                            i15 = 32;
                        }
                    }
                }
                return i10 | i11 | i15 | i12 | i13;
            }
        }
        return i14 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhy zzab(zzsq zzsqVar, zzad zzadVar, zzad zzadVar2) {
        int i10;
        int i11;
        zzhy zzb2 = zzsqVar.zzb(zzadVar, zzadVar2);
        int i12 = zzb2.zze;
        zzaah zzaahVar = this.zzk;
        zzaahVar.getClass();
        if (zzadVar2.zzu > zzaahVar.zza || zzadVar2.zzv > zzaahVar.zzb) {
            i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zzae(zzsqVar, zzadVar2) > zzaahVar.zzc) {
            i12 |= 64;
        }
        String str = zzsqVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb2.zzd;
            i11 = 0;
        }
        return new zzhy(str, zzadVar, zzadVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    @Nullable
    public final zzhy zzac(zzkj zzkjVar) throws zzig {
        zzhy zzac = super.zzac(zzkjVar);
        zzad zzadVar = zzkjVar.zza;
        zzadVar.getClass();
        this.zzg.zzf(zzadVar, zzac);
        return zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsk zzaf(zzsq zzsqVar, zzad zzadVar, @Nullable MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        int i10;
        Point point;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        int zzad;
        zzad[] zzT = zzT();
        int length = zzT.length;
        int zzae = zzae(zzsqVar, zzadVar);
        int i15 = zzadVar.zzu;
        int i16 = zzadVar.zzv;
        if (length == 1) {
            if (zzae != -1 && (zzad = zzad(zzsqVar, zzadVar)) != -1) {
                zzae = Math.min((int) (zzae * 1.5f), zzad);
            }
        } else {
            boolean z13 = false;
            for (int i17 = 0; i17 < length; i17++) {
                zzad zzadVar2 = zzT[i17];
                if (zzadVar.zzB != null && zzadVar2.zzB == null) {
                    zzab zzb2 = zzadVar2.zzb();
                    zzb2.zzB(zzadVar.zzB);
                    zzadVar2 = zzb2.zzaf();
                }
                if (zzsqVar.zzb(zzadVar, zzadVar2).zzd != 0) {
                    int i18 = zzadVar2.zzu;
                    if (i18 != -1 && zzadVar2.zzv != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    z13 |= z12;
                    i15 = Math.max(i15, i18);
                    i16 = Math.max(i16, zzadVar2.zzv);
                    zzae = Math.max(zzae, zzae(zzsqVar, zzadVar2));
                }
            }
            if (z13) {
                zzdt.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i15 + "x" + i16);
                int i19 = zzadVar.zzv;
                int i20 = zzadVar.zzu;
                if (i19 > i20) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = i19;
                } else {
                    i10 = i20;
                }
                if (true == z10) {
                    i19 = i20;
                }
                int[] iArr = zzb;
                int i21 = 0;
                while (i21 < 9) {
                    float f11 = i19;
                    float f12 = i10;
                    int i22 = iArr[i21];
                    int[] iArr2 = iArr;
                    float f13 = i22;
                    if (i22 <= i10 || (i11 = (int) ((f11 / f12) * f13)) <= i19) {
                        break;
                    }
                    if (true != z10) {
                        i12 = i22;
                    } else {
                        i12 = i11;
                    }
                    if (true != z10) {
                        i22 = i11;
                    }
                    point = zzsqVar.zza(i12, i22);
                    float f14 = zzadVar.zzw;
                    if (point != null) {
                        z11 = z10;
                        i13 = i19;
                        if (zzsqVar.zzg(point.x, point.y, f14)) {
                            break;
                        }
                    } else {
                        i13 = i19;
                        z11 = z10;
                    }
                    i21++;
                    z10 = z11;
                    iArr = iArr2;
                    i19 = i13;
                }
                point = null;
                if (point != null) {
                    i15 = Math.max(i15, point.x);
                    i16 = Math.max(i16, point.y);
                    zzab zzb3 = zzadVar.zzb();
                    zzb3.zzae(i15);
                    zzb3.zzJ(i16);
                    zzae = Math.max(zzae, zzad(zzsqVar, zzb3.zzaf()));
                    zzdt.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i15 + "x" + i16);
                }
            }
        }
        String str = zzsqVar.zzc;
        zzaah zzaahVar = new zzaah(i15, i16, zzae);
        this.zzk = zzaahVar;
        boolean z14 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzadVar.zzu);
        mediaFormat.setInteger("height", zzadVar.zzv);
        zzdw.zzb(mediaFormat, zzadVar.zzr);
        float f15 = zzadVar.zzw;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzdw.zza(mediaFormat, "rotation-degrees", zzadVar.zzx);
        zzm zzmVar = zzadVar.zzB;
        if (zzmVar != null) {
            zzdw.zza(mediaFormat, "color-transfer", zzmVar.zzd);
            zzdw.zza(mediaFormat, "color-standard", zzmVar.zzb);
            zzdw.zza(mediaFormat, "color-range", zzmVar.zzc);
            byte[] bArr = zzmVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzadVar.zzo)) {
            int i23 = zztl.zza;
            Pair zza = zzdd.zza(zzadVar);
            if (zza != null) {
                zzdw.zza(mediaFormat, Scopes.PROFILE, ((Integer) zza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaahVar.zza);
        mediaFormat.setInteger("max-height", zzaahVar.zzb);
        zzdw.zza(mediaFormat, "max-input-size", zzaahVar.zzc);
        int i24 = zzen.zza;
        if (i24 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z14) {
            mediaFormat.setInteger("no-post-process", 1);
            i14 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i14 = 0;
        }
        if (i24 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i14, -this.zzF));
        }
        Surface zzaW = zzaW(zzsqVar);
        if (this.zzn != null && !zzen.zzK(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsk.zzb(zzsqVar, mediaFormat, zzadVar, zzaW, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final List zzag(zzta zztaVar, zzad zzadVar, boolean z10) throws zztf {
        return zztl.zzf(zzaX(this.zze, zztaVar, zzadVar, false, false), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    @TargetApi(n.NOTIFICATION_REDIRECT_VALUE)
    public final void zzaj(zzhm zzhmVar) throws zzig {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzhmVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b3 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b3 == -75 && s5 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsn zzaz = zzaz();
                        zzaz.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzak(Exception exc) {
        zzdt.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzal(String str, zzsk zzskVar, long j3, long j10) {
        this.zzg.zza(str, j3, j10);
        this.zzl = zzaU(str);
        zzsq zzaB = zzaB();
        zzaB.getClass();
        boolean z10 = false;
        if (zzen.zza >= 29 && MimeTypes.VIDEO_VP9.equals(zzaB.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaB.zzh();
            int length = zzh.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (zzh[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.zzm = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzan(zzad zzadVar, @Nullable MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        zzsn zzaz = zzaz();
        if (zzaz != null) {
            zzaz.zzr(this.zzu);
        }
        mediaFormat.getClass();
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f10 = zzadVar.zzy;
        if (zzen.zza >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f10 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i10 = zzadVar.zzx;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzD = new zzci(integer, integer2, f10);
        zzabl zzablVar = this.zzn;
        if (zzablVar != null && this.zzK) {
            zzab zzb2 = zzadVar.zzb();
            zzb2.zzae(integer);
            zzb2.zzJ(integer2);
            zzb2.zzV(f10);
            zzablVar.zzj(1, zzb2.zzaf());
        } else {
            this.zzi.zzl(zzadVar.zzw);
        }
        this.zzK = false;
    }

    public final void zzao(zzsn zzsnVar, int i10, long j3, long j10) {
        Trace.beginSection("releaseOutputBuffer");
        zzsnVar.zzn(i10, j10);
        Trace.endSection();
        ((zzsy) this).zza.zze++;
        this.zzy = 0;
        if (this.zzn == null) {
            zzci zzciVar = this.zzD;
            if (!zzciVar.equals(zzci.zza) && !zzciVar.equals(this.zzE)) {
                this.zzE = zzciVar;
                this.zzg.zzt(zzciVar);
            }
            if (this.zzi.zzp() && this.zzq != null) {
                zzaZ();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzap() {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzu(zzaw(), zzav(), -this.zzI, zzf());
        } else {
            this.zzi.zzf();
        }
        this.zzK = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzar(long j3, long j10, @Nullable zzsn zzsnVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, zzad zzadVar) throws zzig {
        boolean z12;
        zzsnVar.getClass();
        long zzav = j11 - zzav();
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            try {
                z12 = false;
            } catch (zzabk e2) {
                e = e2;
                z12 = false;
            }
            try {
                return zzablVar.zzx(j11 + (-this.zzI), z11, j3, j10, new zzaaf(this, zzsnVar, i10, zzav));
            } catch (zzabk e10) {
                e = e10;
                throw zzcY(e, e.zza, z12, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        int zza = this.zzi.zza(j11, j3, j10, zzaw(), z11, this.zzj);
        if (zza == 4) {
            return false;
        }
        if (z10 && !z11) {
            zzaQ(zzsnVar, i10, zzav);
            return true;
        }
        if (this.zzq == null) {
            if (this.zzj.zzc() >= 30000) {
                return false;
            }
            zzaQ(zzsnVar, i10, zzav);
            zzaS(this.zzj.zzc());
            return true;
        }
        if (zza != 0) {
            if (zza != 1) {
                if (zza != 2) {
                    if (zza != 3) {
                        if (zza == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(zza));
                    }
                    zzaQ(zzsnVar, i10, zzav);
                    zzaS(this.zzj.zzc());
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                zzsnVar.zzo(i10, false);
                Trace.endSection();
                zzaR(0, 1);
                zzaS(this.zzj.zzc());
                return true;
            }
            zzaan zzaanVar = this.zzj;
            long zzd2 = zzaanVar.zzd();
            long zzc2 = zzaanVar.zzc();
            if (zzd2 == this.zzC) {
                zzaQ(zzsnVar, i10, zzav);
            } else {
                zzao(zzsnVar, i10, zzav, zzd2);
            }
            zzaS(zzc2);
            this.zzC = zzd2;
            return true;
        }
        zzao(zzsnVar, i10, zzav, zzi().zzc());
        zzaS(this.zzj.zzc());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzau(zzhm zzhmVar) {
        int i10 = zzen.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    public final void zzt() {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzf();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzli
    public final void zzu(int i10, @Nullable Object obj) throws zzig {
        Surface surface;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 16) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 13) {
                                    if (i10 != 14) {
                                        super.zzu(i10, obj);
                                        return;
                                    }
                                    obj.getClass();
                                    zzee zzeeVar = (zzee) obj;
                                    if (zzeeVar.zzb() != 0 && zzeeVar.zza() != 0) {
                                        this.zzs = zzeeVar;
                                        zzabl zzablVar = this.zzn;
                                        if (zzablVar != null) {
                                            Surface surface2 = this.zzq;
                                            zzdb.zzb(surface2);
                                            zzablVar.zzs(surface2, zzeeVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                List list = (List) obj;
                                this.zzp = list;
                                zzabl zzablVar2 = this.zzn;
                                if (zzablVar2 != null) {
                                    zzablVar2.zzv(list);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            int intValue = ((Integer) obj).intValue();
                            this.zzv = intValue;
                            zzabl zzablVar3 = this.zzn;
                            if (zzablVar3 != null) {
                                zzablVar3.zzq(intValue);
                                return;
                            } else {
                                this.zzi.zzj(intValue);
                                return;
                            }
                        }
                        obj.getClass();
                        int intValue2 = ((Integer) obj).intValue();
                        this.zzu = intValue2;
                        zzsn zzaz = zzaz();
                        if (zzaz != null) {
                            zzaz.zzr(intValue2);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    this.zzF = ((Integer) obj).intValue();
                    zzsn zzaz2 = zzaz();
                    if (zzaz2 != null && zzen.zza >= 35) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("importance", Math.max(0, -this.zzF));
                        zzaz2.zzq(bundle);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.zzG != intValue3) {
                    this.zzG = intValue3;
                    return;
                }
                return;
            }
            obj.getClass();
            zzaam zzaamVar = (zzaam) obj;
            this.zzH = zzaamVar;
            zzabl zzablVar4 = this.zzn;
            if (zzablVar4 != null) {
                zzablVar4.zzw(zzaamVar);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        if (this.zzq != surface) {
            this.zzq = surface;
            if (this.zzn == null) {
                this.zzi.zzm(surface);
            }
            this.zzt = false;
            int zzcV = zzcV();
            zzsn zzaz3 = zzaz();
            if (zzaz3 != null && this.zzn == null) {
                zzsq zzaB = zzaB();
                zzaB.getClass();
                boolean zzbb = zzbb(zzaB);
                int i11 = zzen.zza;
                if (i11 >= 23 && zzbb && !this.zzl) {
                    Surface zzaW = zzaW(zzaB);
                    if (i11 >= 23 && zzaW != null) {
                        zzaz3.zzp(zzaW);
                    } else if (i11 >= 35) {
                        zzaz3.zzi();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    zzaG();
                    zzaC();
                }
            }
            if (surface != null) {
                zzaY();
                if (zzcV == 2) {
                    zzabl zzablVar5 = this.zzn;
                    if (zzablVar5 != null) {
                        zzablVar5.zzi(true);
                        return;
                    } else {
                        this.zzi.zzc(true);
                        return;
                    }
                }
                return;
            }
            this.zzE = null;
            zzabl zzablVar6 = this.zzn;
            if (zzablVar6 != null) {
                zzablVar6.zze();
                return;
            }
            return;
        }
        if (surface != null) {
            zzaY();
            Surface surface3 = this.zzq;
            if (surface3 != null && this.zzt) {
                this.zzg.zzq(surface3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzx() {
        this.zzE = null;
        this.zzJ = C.TIME_UNSET;
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzk();
        } else {
            this.zzi.zzd();
        }
        this.zzt = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzc(((zzsy) this).zza);
            this.zzg.zzt(zzci.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzy(boolean z10, boolean z11) throws zzig {
        super.zzy(z10, z11);
        zzn();
        this.zzg.zze(((zzsy) this).zza);
        if (!this.zzo) {
            if (this.zzp != null && this.zzn == null) {
                zzzp zzzpVar = new zzzp(this.zze, this.zzi);
                zzzpVar.zzd(zzi());
                this.zzn = zzzpVar.zze().zzh();
            }
            this.zzo = true;
        }
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzr(new zzaae(this), zzgey.zzb());
            zzaam zzaamVar = this.zzH;
            if (zzaamVar != null) {
                this.zzn.zzw(zzaamVar);
            }
            if (this.zzq != null && !this.zzs.equals(zzee.zza)) {
                this.zzn.zzs(this.zzq, this.zzs);
            }
            this.zzn.zzq(this.zzv);
            this.zzn.zzt(zzat());
            List list = this.zzp;
            if (list != null) {
                this.zzn.zzv(list);
            }
            this.zzn.zzl(z11);
            return;
        }
        this.zzi.zzk(zzi());
        this.zzi.zze(z11);
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzz(long j3, boolean z10) throws zzig {
        zzabl zzablVar = this.zzn;
        if (zzablVar != null) {
            zzablVar.zzg(true);
            this.zzn.zzu(zzaw(), zzav(), -this.zzI, zzf());
            this.zzK = true;
        }
        super.zzz(j3, z10);
        if (this.zzn == null) {
            this.zzi.zzi();
        }
        if (z10) {
            zzabl zzablVar2 = this.zzn;
            if (zzablVar2 != null) {
                zzablVar2.zzi(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzy = 0;
    }
}
