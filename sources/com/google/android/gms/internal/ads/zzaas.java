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
import com.facebook.ads.AdError;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class zzaas extends zzte implements zzaay {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private zzcp zzD;

    @Nullable
    private zzcp zzE;
    private int zzF;
    private int zzG;

    @Nullable
    private zzaaw zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final Context zze;
    private final boolean zzf;
    private final zzabp zzg;
    private final boolean zzh;
    private final zzaaz zzi;
    private final zzaax zzj;
    private zzaar zzk;
    private boolean zzl;
    private boolean zzm;
    private zzabv zzn;
    private boolean zzo;
    private List zzp;

    @Nullable
    private Surface zzq;

    @Nullable
    private zzaav zzr;
    private zzel zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    public zzaas(Context context, zzsr zzsrVar, zztg zztgVar, long j2, boolean z2, @Nullable Handler handler, @Nullable zzabq zzabqVar, int i2, float f2) {
        super(2, zzsrVar, zztgVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzn = null;
        this.zzg = new zzabp(handler, zzabqVar);
        this.zzf = true;
        this.zzi = new zzaaz(applicationContext, this, 0L);
        this.zzj = new zzaax();
        this.zzh = "NVIDIA".equals(zzeu.zzc);
        this.zzs = zzel.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = zzcp.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = -1000;
        this.zzI = -9223372036854775807L;
        this.zzJ = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c2, code lost:
    
        if (r0.equals("deb") != false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079d, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L516;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzaU(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaas.zzaU(java.lang.String):boolean");
    }

    public static final boolean zzaV(zzsw zzswVar) {
        return zzeu.zza >= 35 && zzswVar.zzh;
    }

    @Nullable
    private final Surface zzaW(zzsw zzswVar) {
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            return zzabvVar.zzd();
        }
        Surface surface = this.zzq;
        if (surface != null) {
            return surface;
        }
        if (zzaV(zzswVar)) {
            return null;
        }
        zzdi.zzf(zzbc(zzswVar));
        zzaav zzaavVar = this.zzr;
        if (zzaavVar != null) {
            if (zzaavVar.zza != zzswVar.zzf) {
                zzba();
            }
        }
        if (this.zzr == null) {
            this.zzr = zzaav.zza(this.zze, zzswVar.zzf);
        }
        return this.zzr;
    }

    private static List zzaX(Context context, zztg zztgVar, zzaf zzafVar, boolean z2, boolean z3) throws zztm {
        String str = zzafVar.zzn;
        if (str == null) {
            return zzgax.zzn();
        }
        if (zzeu.zza >= 26 && "video/dolby-vision".equals(str) && !zzaaq.zza(context)) {
            List zze = zzts.zze(zztgVar, zzafVar, z2, z3);
            if (!zze.isEmpty()) {
                return zze;
            }
        }
        return zzts.zzg(zztgVar, zzafVar, z2, z3);
    }

    private final void zzaY() {
        zzcp zzcpVar = this.zzE;
        if (zzcpVar != null) {
            this.zzg.zzt(zzcpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public final void zzaZ() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r3.equals("video/av01") != false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0083. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzad(com.google.android.gms.internal.ads.zzsw r10, com.google.android.gms.internal.ads.zzaf r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaas.zzad(com.google.android.gms.internal.ads.zzsw, com.google.android.gms.internal.ads.zzaf):int");
    }

    public static int zzae(zzsw zzswVar, zzaf zzafVar) {
        if (zzafVar.zzo == -1) {
            return zzad(zzswVar, zzafVar);
        }
        int size = zzafVar.zzq.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) zzafVar.zzq.get(i3)).length;
        }
        return zzafVar.zzo + i2;
    }

    private final void zzba() {
        zzaav zzaavVar = this.zzr;
        if (zzaavVar != null) {
            zzaavVar.release();
            this.zzr = null;
        }
    }

    private final boolean zzbb(zzsw zzswVar) {
        return this.zzq != null || zzaV(zzswVar) || zzbc(zzswVar);
    }

    private final boolean zzbc(zzsw zzswVar) {
        if (zzeu.zza < 23 || zzaU(zzswVar.zza)) {
            return false;
        }
        return !zzswVar.zzf || zzaav.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzA() {
        zzabv zzabvVar = this.zzn;
        if (zzabvVar == null || !this.zzf) {
            return;
        }
        zzabvVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzo = false;
            this.zzI = -9223372036854775807L;
            zzba();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzD() {
        this.zzx = 0;
        this.zzw = zzi().zzb();
        this.zzA = 0L;
        this.zzB = 0;
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzm();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzE() {
        if (this.zzx > 0) {
            long zzb2 = zzi().zzb();
            this.zzg.zzd(this.zzx, zzb2 - this.zzw);
            this.zzx = 0;
            this.zzw = zzb2;
        }
        int i2 = this.zzB;
        if (i2 != 0) {
            this.zzg.zzr(this.zzA, i2);
            this.zzA = 0L;
            this.zzB = 0;
        }
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzn();
        } else {
            this.zzi.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzF(zzaf[] zzafVarArr, long j2, long j3, zzuy zzuyVar) throws zzij {
        super.zzF(zzafVarArr, j2, j3, zzuyVar);
        if (this.zzI == -9223372036854775807L) {
            this.zzI = j2;
        }
        zzcc zzh = zzh();
        if (zzh.zzo()) {
            this.zzJ = -9223372036854775807L;
        } else {
            this.zzJ = zzh.zzn(zzuyVar.zza, new zzca()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    public final void zzM(float f2, float f3) throws zzij {
        super.zzM(f2, f3);
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzt(f2);
        } else {
            this.zzi.zzn(f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlu
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    @CallSuper
    public final void zzV(long j2, long j3) throws zzij {
        super.zzV(j2, j3);
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            try {
                zzabvVar.zzp(j2, j3);
            } catch (zzabu e) {
                throw zzcY(e, e.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzW() {
        return super.zzW() && this.zzn == null;
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzX() {
        boolean zzX = super.zzX();
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            return zzabvVar.zzz(zzX);
        }
        if (zzX && (zzaz() == null || this.zzq == null)) {
            return true;
        }
        return this.zzi.zzo(zzX);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final float zzZ(float f2, zzaf zzafVar, zzaf[] zzafVarArr) {
        float f3 = -1.0f;
        for (zzaf zzafVar2 : zzafVarArr) {
            float f4 = zzafVar2.zzv;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzsv zzaA(Throwable th, @Nullable zzsw zzswVar) {
        return new zzaan(th, zzswVar, this.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @CallSuper
    public final void zzaD(long j2) {
        super.zzaD(j2);
        this.zzz--;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @CallSuper
    public final void zzaE(zzhq zzhqVar) throws zzij {
        this.zzz++;
        int i2 = zzeu.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @CallSuper
    public final void zzaF(zzaf zzafVar) throws zzij {
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            try {
                zzabvVar.zzh(zzafVar);
            } catch (zzabu e) {
                throw zzcY(e, zzafVar, false, 7000);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @CallSuper
    public final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzaN(zzsw zzswVar) {
        return zzbb(zzswVar);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzaO(zzhq zzhqVar) {
        if (zzhqVar.zzi() && !zzQ() && !zzhqVar.zzh() && this.zzJ != -9223372036854775807L) {
            if (this.zzJ - (zzhqVar.zze - zzav()) > 100000 && !zzhqVar.zzl() && zzhqVar.zze < zzf()) {
                return true;
            }
        }
        return false;
    }

    public final void zzaQ(zzst zzstVar, int i2, long j2) {
        Trace.beginSection("skipVideoBuffer");
        zzstVar.zzo(i2, false);
        Trace.endSection();
        ((zzte) this).zza.zzf++;
    }

    public final void zzaR(int i2, int i3) {
        zzia zziaVar = ((zzte) this).zza;
        zziaVar.zzh += i2;
        int i4 = i2 + i3;
        zziaVar.zzg += i4;
        this.zzx += i4;
        int i5 = this.zzy + i4;
        this.zzy = i5;
        zziaVar.zzi = Math.max(i5, zziaVar.zzi);
    }

    public final void zzaS(long j2) {
        zzia zziaVar = ((zzte) this).zza;
        zziaVar.zzk += j2;
        zziaVar.zzl++;
        this.zzA += j2;
        this.zzB++;
    }

    public final boolean zzaT(long j2, boolean z2) throws zzij {
        int zzd2 = zzd(j2);
        if (zzd2 == 0) {
            return false;
        }
        if (z2) {
            zzia zziaVar = ((zzte) this).zza;
            zziaVar.zzd += zzd2;
            zziaVar.zzf += this.zzz;
        } else {
            ((zzte) this).zza.zzj++;
            zzaR(zzd2, this.zzz);
        }
        zzaJ();
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final int zzaa(zztg zztgVar, zzaf zzafVar) throws zztm {
        boolean z2;
        if (!zzbn.zzi(zzafVar.zzn)) {
            return 128;
        }
        int i2 = 1;
        int i3 = 0;
        boolean z3 = zzafVar.zzr != null;
        List zzaX = zzaX(this.zze, zztgVar, zzafVar, z3, false);
        if (z3 && zzaX.isEmpty()) {
            zzaX = zzaX(this.zze, zztgVar, zzafVar, false, false);
        }
        if (!zzaX.isEmpty()) {
            if (zzte.zzaP(zzafVar)) {
                zzsw zzswVar = (zzsw) zzaX.get(0);
                boolean zze = zzswVar.zze(zzafVar);
                if (!zze) {
                    for (int i4 = 1; i4 < zzaX.size(); i4++) {
                        zzsw zzswVar2 = (zzsw) zzaX.get(i4);
                        if (zzswVar2.zze(zzafVar)) {
                            zze = true;
                            z2 = false;
                            zzswVar = zzswVar2;
                            break;
                        }
                    }
                }
                z2 = true;
                int i5 = true != zze ? 3 : 4;
                int i6 = true != zzswVar.zzf(zzafVar) ? 8 : 16;
                int i7 = true != zzswVar.zzg ? 0 : 64;
                int i8 = true != z2 ? 0 : 128;
                if (zzeu.zza >= 26 && "video/dolby-vision".equals(zzafVar.zzn) && !zzaaq.zza(this.zze)) {
                    i8 = 256;
                }
                if (zze) {
                    List zzaX2 = zzaX(this.zze, zztgVar, zzafVar, z3, true);
                    if (!zzaX2.isEmpty()) {
                        zzsw zzswVar3 = (zzsw) zzts.zzh(zzaX2, zzafVar).get(0);
                        if (zzswVar3.zze(zzafVar) && zzswVar3.zzf(zzafVar)) {
                            i3 = 32;
                        }
                    }
                }
                return i5 | i6 | i3 | i7 | i8;
            }
            i2 = 2;
        }
        return i2 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzib zzab(zzsw zzswVar, zzaf zzafVar, zzaf zzafVar2) {
        int i2;
        int i3;
        zzib zzb2 = zzswVar.zzb(zzafVar, zzafVar2);
        int i4 = zzb2.zze;
        zzaar zzaarVar = this.zzk;
        zzaarVar.getClass();
        if (zzafVar2.zzt > zzaarVar.zza || zzafVar2.zzu > zzaarVar.zzb) {
            i4 |= 256;
        }
        if (zzae(zzswVar, zzafVar2) > zzaarVar.zzc) {
            i4 |= 64;
        }
        String str = zzswVar.zza;
        if (i4 != 0) {
            i3 = i4;
            i2 = 0;
        } else {
            i2 = zzb2.zzd;
            i3 = 0;
        }
        return new zzib(str, zzafVar, zzafVar2, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @Nullable
    public final zzib zzac(zzkm zzkmVar) throws zzij {
        zzib zzac = super.zzac(zzkmVar);
        zzaf zzafVar = zzkmVar.zza;
        zzafVar.getClass();
        this.zzg.zzf(zzafVar, zzac);
        return zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzsq zzaf(zzsw zzswVar, zzaf zzafVar, @Nullable MediaCrypto mediaCrypto, float f2) {
        Point point;
        int i2;
        int i3;
        boolean z2;
        int i4;
        Pair zza;
        int zzad;
        zzaf[] zzT = zzT();
        int length = zzT.length;
        int zzae = zzae(zzswVar, zzafVar);
        int i5 = zzafVar.zzt;
        int i6 = zzafVar.zzu;
        if (length != 1) {
            boolean z3 = false;
            for (int i7 = 0; i7 < length; i7++) {
                zzaf zzafVar2 = zzT[i7];
                if (zzafVar.zzA != null && zzafVar2.zzA == null) {
                    zzad zzb2 = zzafVar2.zzb();
                    zzb2.zzB(zzafVar.zzA);
                    zzafVar2 = zzb2.zzaf();
                }
                if (zzswVar.zzb(zzafVar, zzafVar2).zzd != 0) {
                    int i8 = zzafVar2.zzt;
                    z3 |= i8 == -1 || zzafVar2.zzu == -1;
                    i5 = Math.max(i5, i8);
                    i6 = Math.max(i6, zzafVar2.zzu);
                    zzae = Math.max(zzae, zzae(zzswVar, zzafVar2));
                }
            }
            if (z3) {
                zzea.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i5 + "x" + i6);
                int i9 = zzafVar.zzu;
                int i10 = zzafVar.zzt;
                boolean z4 = i9 > i10;
                int i11 = z4 ? i9 : i10;
                if (true == z4) {
                    i9 = i10;
                }
                int[] iArr = zzb;
                int i12 = 0;
                while (i12 < 9) {
                    float f3 = i9;
                    float f4 = i11;
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    float f5 = i13;
                    if (i13 <= i11 || (i2 = (int) ((f3 / f4) * f5)) <= i9) {
                        break;
                    }
                    int i14 = true != z4 ? i13 : i2;
                    if (true != z4) {
                        i13 = i2;
                    }
                    point = zzswVar.zza(i14, i13);
                    float f6 = zzafVar.zzv;
                    if (point != null) {
                        z2 = z4;
                        i3 = i9;
                        if (zzswVar.zzg(point.x, point.y, f6)) {
                            break;
                        }
                    } else {
                        i3 = i9;
                        z2 = z4;
                    }
                    i12++;
                    z4 = z2;
                    iArr = iArr2;
                    i9 = i3;
                }
                point = null;
                if (point != null) {
                    i5 = Math.max(i5, point.x);
                    i6 = Math.max(i6, point.y);
                    zzad zzb3 = zzafVar.zzb();
                    zzb3.zzae(i5);
                    zzb3.zzJ(i6);
                    zzae = Math.max(zzae, zzad(zzswVar, zzb3.zzaf()));
                    zzea.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i5 + "x" + i6);
                }
            }
        } else if (zzae != -1 && (zzad = zzad(zzswVar, zzafVar)) != -1) {
            zzae = Math.min((int) (zzae * 1.5f), zzad);
        }
        String str = zzswVar.zzc;
        zzaar zzaarVar = new zzaar(i5, i6, zzae);
        this.zzk = zzaarVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzafVar.zzt);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzafVar.zzu);
        zzed.zzb(mediaFormat, zzafVar.zzq);
        float f7 = zzafVar.zzv;
        if (f7 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f7);
        }
        zzed.zza(mediaFormat, "rotation-degrees", zzafVar.zzw);
        zzo zzoVar = zzafVar.zzA;
        if (zzoVar != null) {
            zzed.zza(mediaFormat, "color-transfer", zzoVar.zzd);
            zzed.zza(mediaFormat, "color-standard", zzoVar.zzb);
            zzed.zza(mediaFormat, "color-range", zzoVar.zzc);
            byte[] bArr = zzoVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzafVar.zzn) && (zza = zzts.zza(zzafVar)) != null) {
            zzed.zza(mediaFormat, Scopes.PROFILE, ((Integer) zza.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzaarVar.zza);
        mediaFormat.setInteger("max-height", zzaarVar.zzb);
        zzed.zza(mediaFormat, "max-input-size", zzaarVar.zzc);
        int i15 = zzeu.zza;
        if (i15 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            i4 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i4 = 0;
        }
        if (i15 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i4, -this.zzF));
        }
        Surface zzaW = zzaW(zzswVar);
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null && !zzabvVar.zzy()) {
            mediaFormat.setInteger("allow-frame-drop", i4);
        }
        return zzsq.zzb(zzswVar, mediaFormat, zzafVar, zzaW, null);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final List zzag(zztg zztgVar, zzaf zzafVar, boolean z2) throws zztm {
        return zzts.zzh(zzaX(this.zze, zztgVar, zzafVar, false, false), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @TargetApi(29)
    public final void zzaj(zzhq zzhqVar) throws zzij {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzhqVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s2 == 60 && s3 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzst zzaz = zzaz();
                        zzaz.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzak(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzal(String str, zzsq zzsqVar, long j2, long j3) {
        this.zzg.zza(str, j2, j3);
        this.zzl = zzaU(str);
        zzsw zzaB = zzaB();
        zzaB.getClass();
        boolean z2 = false;
        if (zzeu.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaB.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaB.zzh();
            int length = zzh.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (zzh[i2].profile == 16384) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        this.zzm = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzan(zzaf zzafVar, @Nullable MediaFormat mediaFormat) {
        zzst zzaz = zzaz();
        if (zzaz != null) {
            zzaz.zzr(this.zzu);
        }
        mediaFormat.getClass();
        boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        int integer2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        float f2 = zzafVar.zzx;
        int i2 = zzafVar.zzw;
        if (i2 == 90 || i2 == 270) {
            f2 = 1.0f / f2;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzD = new zzcp(integer, integer2, f2);
        zzabv zzabvVar = this.zzn;
        if (zzabvVar == null || !this.zzK) {
            this.zzi.zzl(zzafVar.zzv);
        } else {
            zzad zzb2 = zzafVar.zzb();
            zzb2.zzae(integer);
            zzb2.zzJ(integer2);
            zzb2.zzV(f2);
            zzabvVar.zzj(1, zzb2.zzaf());
        }
        this.zzK = false;
    }

    public final void zzao(zzst zzstVar, int i2, long j2, long j3) {
        Trace.beginSection("releaseOutputBuffer");
        zzstVar.zzn(i2, j3);
        Trace.endSection();
        ((zzte) this).zza.zze++;
        this.zzy = 0;
        if (this.zzn == null) {
            zzcp zzcpVar = this.zzD;
            if (!zzcpVar.equals(zzcp.zza) && !zzcpVar.equals(this.zzE)) {
                this.zzE = zzcpVar;
                this.zzg.zzt(zzcpVar);
            }
            if (!this.zzi.zzp() || this.zzq == null) {
                return;
            }
            zzaZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzap() {
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzu(zzaw(), zzav(), -this.zzI, zzf());
        } else {
            this.zzi.zzf();
        }
        this.zzK = true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzar(long j2, long j3, @Nullable zzst zzstVar, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, zzaf zzafVar) throws zzij {
        boolean z4;
        zzstVar.getClass();
        long zzav = j4 - zzav();
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            try {
                z4 = false;
            } catch (zzabu e) {
                e = e;
                z4 = false;
            }
            try {
                return zzabvVar.zzx(j4 + (-this.zzI), z3, j2, j3, new zzaap(this, zzstVar, i2, zzav));
            } catch (zzabu e2) {
                e = e2;
                throw zzcY(e, e.zza, z4, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        int zza = this.zzi.zza(j4, j2, j3, zzaw(), z3, this.zzj);
        if (zza == 4) {
            return false;
        }
        if (z2 && !z3) {
            zzaQ(zzstVar, i2, zzav);
            return true;
        }
        if (this.zzq == null) {
            if (this.zzj.zzc() >= 30000) {
                return false;
            }
            zzaQ(zzstVar, i2, zzav);
            zzaS(this.zzj.zzc());
            return true;
        }
        if (zza == 0) {
            zzao(zzstVar, i2, zzav, zzi().zzc());
            zzaS(this.zzj.zzc());
            return true;
        }
        if (zza == 1) {
            zzaax zzaaxVar = this.zzj;
            long zzd2 = zzaaxVar.zzd();
            long zzc2 = zzaaxVar.zzc();
            if (zzd2 == this.zzC) {
                zzaQ(zzstVar, i2, zzav);
            } else {
                zzao(zzstVar, i2, zzav, zzd2);
            }
            zzaS(zzc2);
            this.zzC = zzd2;
            return true;
        }
        if (zza == 2) {
            Trace.beginSection("dropVideoBuffer");
            zzstVar.zzo(i2, false);
            Trace.endSection();
            zzaR(0, 1);
            zzaS(this.zzj.zzc());
            return true;
        }
        if (zza != 3) {
            if (zza == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(zza));
        }
        zzaQ(zzstVar, i2, zzav);
        zzaS(this.zzj.zzc());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final int zzau(zzhq zzhqVar) {
        int i2 = zzeu.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    public final void zzt() {
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzf();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlm
    public final void zzu(int i2, @Nullable Object obj) throws zzij {
        if (i2 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            if (this.zzq == surface) {
                if (surface != null) {
                    zzaY();
                    Surface surface2 = this.zzq;
                    if (surface2 == null || !this.zzt) {
                        return;
                    }
                    this.zzg.zzq(surface2);
                    return;
                }
                return;
            }
            this.zzq = surface;
            if (this.zzn == null) {
                this.zzi.zzm(surface);
            }
            this.zzt = false;
            int zzcV = zzcV();
            zzst zzaz = zzaz();
            if (zzaz != null && this.zzn == null) {
                zzsw zzaB = zzaB();
                zzaB.getClass();
                boolean zzbb = zzbb(zzaB);
                int i3 = zzeu.zza;
                if (i3 < 23 || !zzbb || this.zzl) {
                    zzaG();
                    zzaC();
                } else {
                    Surface zzaW = zzaW(zzaB);
                    if (i3 >= 23 && zzaW != null) {
                        zzaz.zzp(zzaW);
                    } else {
                        if (i3 < 35) {
                            throw new IllegalStateException();
                        }
                        zzaz.zzi();
                    }
                }
            }
            if (surface == null) {
                this.zzE = null;
                zzabv zzabvVar = this.zzn;
                if (zzabvVar != null) {
                    zzabvVar.zze();
                    return;
                }
                return;
            }
            zzaY();
            if (zzcV == 2) {
                zzabv zzabvVar2 = this.zzn;
                if (zzabvVar2 != null) {
                    zzabvVar2.zzi(true);
                    return;
                } else {
                    this.zzi.zzc(true);
                    return;
                }
            }
            return;
        }
        if (i2 == 7) {
            obj.getClass();
            zzaaw zzaawVar = (zzaaw) obj;
            this.zzH = zzaawVar;
            zzabv zzabvVar3 = this.zzn;
            if (zzabvVar3 != null) {
                zzabvVar3.zzw(zzaawVar);
                return;
            }
            return;
        }
        if (i2 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzG != intValue) {
                this.zzG = intValue;
                return;
            }
            return;
        }
        if (i2 == 16) {
            obj.getClass();
            this.zzF = ((Integer) obj).intValue();
            zzst zzaz2 = zzaz();
            if (zzaz2 == null || zzeu.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzF));
            zzaz2.zzq(bundle);
            return;
        }
        if (i2 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzu = intValue2;
            zzst zzaz3 = zzaz();
            if (zzaz3 != null) {
                zzaz3.zzr(intValue2);
                return;
            }
            return;
        }
        if (i2 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzv = intValue3;
            zzabv zzabvVar4 = this.zzn;
            if (zzabvVar4 != null) {
                zzabvVar4.zzq(intValue3);
                return;
            } else {
                this.zzi.zzj(intValue3);
                return;
            }
        }
        if (i2 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.zzp = list;
            zzabv zzabvVar5 = this.zzn;
            if (zzabvVar5 != null) {
                zzabvVar5.zzv(list);
                return;
            }
            return;
        }
        if (i2 != 14) {
            super.zzu(i2, obj);
            return;
        }
        obj.getClass();
        zzel zzelVar = (zzel) obj;
        if (zzelVar.zzb() == 0 || zzelVar.zza() == 0) {
            return;
        }
        this.zzs = zzelVar;
        zzabv zzabvVar6 = this.zzn;
        if (zzabvVar6 != null) {
            Surface surface3 = this.zzq;
            zzdi.zzb(surface3);
            zzabvVar6.zzs(surface3, zzelVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzx() {
        this.zzE = null;
        this.zzJ = -9223372036854775807L;
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzk();
        } else {
            this.zzi.zzd();
        }
        this.zzt = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzc(((zzte) this).zza);
            this.zzg.zzt(zzcp.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzy(boolean z2, boolean z3) throws zzij {
        super.zzy(z2, z3);
        zzn();
        this.zzg.zze(((zzte) this).zza);
        if (!this.zzo) {
            if (this.zzp != null && this.zzn == null) {
                zzzx zzzxVar = new zzzx(this.zze, this.zzi);
                zzzxVar.zzd(zzi());
                this.zzn = zzzxVar.zze().zzh();
            }
            this.zzo = true;
        }
        zzabv zzabvVar = this.zzn;
        if (zzabvVar == null) {
            this.zzi.zzk(zzi());
            this.zzi.zze(z3);
            return;
        }
        zzabvVar.zzr(new zzaao(this), zzggf.zzb());
        zzaaw zzaawVar = this.zzH;
        if (zzaawVar != null) {
            this.zzn.zzw(zzaawVar);
        }
        if (this.zzq != null && !this.zzs.equals(zzel.zza)) {
            this.zzn.zzs(this.zzq, this.zzs);
        }
        this.zzn.zzq(this.zzv);
        this.zzn.zzt(zzat());
        List list = this.zzp;
        if (list != null) {
            this.zzn.zzv(list);
        }
        this.zzn.zzl(z3);
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzz(long j2, boolean z2) throws zzij {
        zzabv zzabvVar = this.zzn;
        if (zzabvVar != null) {
            zzabvVar.zzg(true);
            this.zzn.zzu(zzaw(), zzav(), -this.zzI, zzf());
            this.zzK = true;
        }
        super.zzz(j2, z2);
        if (this.zzn == null) {
            this.zzi.zzi();
        }
        if (z2) {
            zzabv zzabvVar2 = this.zzn;
            if (zzabvVar2 != null) {
                zzabvVar2.zzi(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzy = 0;
    }
}
