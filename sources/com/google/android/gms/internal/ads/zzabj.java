package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzabj extends zztv implements zzabp {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;

    @Nullable
    private zzdv zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;

    @Nullable
    private zzabn zzE;

    @Nullable
    private zzacm zzF;
    private final Context zze;
    private final zzacn zzf;
    private final zzach zzg;
    private final boolean zzh;
    private final zzabq zzi;
    private final zzabo zzj;
    private zzabi zzk;
    private boolean zzl;
    private boolean zzm;

    @Nullable
    private Surface zzn;

    @Nullable
    private zzfv zzo;

    @Nullable
    private zzabm zzp;
    private boolean zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private zzdv zzz;

    public zzabj(Context context, zztl zztlVar, zztx zztxVar, long j7, boolean z8, @Nullable Handler handler, @Nullable zzaci zzaciVar, int i9, float f9) {
        super(2, zztlVar, zztxVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzach(handler, zzaciVar);
        zzabc zzc2 = new zzaar(applicationContext).zzc();
        if (zzc2.zzc() == null) {
            zzc2.zzs(new zzabq(applicationContext, this, 0L));
        }
        this.zzf = zzc2;
        zzabq zzc3 = zzc2.zzc();
        zzeq.zzb(zzc3);
        this.zzi = zzc3;
        this.zzj = new zzabo();
        this.zzh = "NVIDIA".equals(zzgd.zzc);
        this.zzr = 1;
        this.zzz = zzdv.zza;
        this.zzD = 0;
        this.zzA = null;
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
    public static final boolean zzaQ(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabj.zzaQ(java.lang.String):boolean");
    }

    private static List zzaR(Context context, zztx zztxVar, zzan zzanVar, boolean z8, boolean z9) throws zzud {
        String str = zzanVar.zzn;
        if (str == null) {
            return zzgbc.zzm();
        }
        if (zzgd.zza >= 26 && "video/dolby-vision".equals(str) && !zzabh.zza(context)) {
            List zzd2 = zzuj.zzd(zztxVar, zzanVar, z8, z9);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zzuj.zzf(zztxVar, zzanVar, z8, z9);
    }

    private final void zzaS() {
        zzdv zzdvVar = this.zzA;
        if (zzdvVar != null) {
            this.zzg.zzt(zzdvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaT() {
        this.zzg.zzq(this.zzn);
        this.zzq = true;
    }

    private final void zzaU() {
        Surface surface = this.zzn;
        zzabm zzabmVar = this.zzp;
        if (surface == zzabmVar) {
            this.zzn = null;
        }
        if (zzabmVar != null) {
            zzabmVar.release();
            this.zzp = null;
        }
    }

    private final boolean zzaV(zztp zztpVar) {
        if (zzgd.zza < 23 || zzaQ(zztpVar.zza)) {
            return false;
        }
        if (zztpVar.zzf && !zzabm.zzb(this.zze)) {
            return false;
        }
        return true;
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
    public static int zzad(com.google.android.gms.internal.ads.zztp r10, com.google.android.gms.internal.ads.zzan r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabj.zzad(com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzan):int");
    }

    public static int zzae(zztp zztpVar, zzan zzanVar) {
        if (zzanVar.zzo != -1) {
            int size = zzanVar.zzp.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                i9 += ((byte[]) zzanVar.zzp.get(i10)).length;
            }
            return zzanVar.zzo + i9;
        }
        return zzad(zztpVar, zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzA() {
        if (this.zzF != null) {
            this.zzf.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzC() {
        try {
            super.zzC();
            this.zzC = false;
            if (this.zzp != null) {
                zzaU();
            }
        } catch (Throwable th) {
            this.zzC = false;
            if (this.zzp != null) {
                zzaU();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzD() {
        this.zzt = 0;
        zzh();
        this.zzs = SystemClock.elapsedRealtime();
        this.zzw = 0L;
        this.zzx = 0;
        this.zzi.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzE() {
        if (this.zzt > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzt, elapsedRealtime - this.zzs);
            this.zzt = 0;
            this.zzs = elapsedRealtime;
        }
        int i9 = this.zzx;
        if (i9 != 0) {
            this.zzg.zzr(this.zzw, i9);
            this.zzw = 0L;
            this.zzx = 0;
        }
        this.zzi.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    public final void zzM(float f9, float f10) throws zzjh {
        super.zzM(f9, f10);
        this.zzi.zzn(f9);
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            zzabc.zzi(((zzaba) zzacmVar).zza, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn, com.google.android.gms.internal.ads.zzmp
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    @CallSuper
    public final void zzV(long j7, long j9) throws zzjh {
        super.zzV(j7, j9);
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            try {
                zzacmVar.zzh(j7, j9);
            } catch (zzacl e4) {
                throw zzi(e4, e4.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzW() {
        return super.zzW() && this.zzF == null;
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzX() {
        zzabm zzabmVar;
        boolean z8 = false;
        if (super.zzX() && this.zzF == null) {
            z8 = true;
        }
        if (z8 && (((zzabmVar = this.zzp) != null && this.zzn == zzabmVar) || zzaw() == null)) {
            return true;
        }
        return this.zzi.zzo(z8);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final float zzZ(float f9, zzan zzanVar, zzan[] zzanVarArr) {
        float f10 = -1.0f;
        for (zzan zzanVar2 : zzanVarArr) {
            float f11 = zzanVar2.zzu;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f9;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    @CallSuper
    public final void zzaA(long j7) {
        super.zzaA(j7);
        this.zzv--;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    @CallSuper
    public final void zzaB(zzin zzinVar) throws zzjh {
        this.zzv++;
        int i9 = zzgd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    @CallSuper
    public final void zzaC(zzan zzanVar) throws zzjh {
        zzfv zzfvVar;
        if (this.zzB && !this.zzC) {
            zzacm zzd2 = this.zzf.zzd();
            this.zzF = zzd2;
            try {
                zzd2.zzf(zzanVar, zzh());
                this.zzF.zzi(new zzabg(this), zzggk.zzb());
                zzabn zzabnVar = this.zzE;
                if (zzabnVar != null) {
                    zzabc.zzj(((zzaba) this.zzF).zza, zzabnVar);
                }
                this.zzF.zzj(zzau());
                Surface surface = this.zzn;
                if (surface != null && (zzfvVar = this.zzo) != null) {
                    this.zzf.zzq(surface, zzfvVar);
                }
            } catch (zzacl e4) {
                throw zzi(e4, zzanVar, false, 7000);
            }
        }
        this.zzC = true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    @CallSuper
    public final void zzaE() {
        super.zzaE();
        this.zzv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final boolean zzaK(zztp zztpVar) {
        if (this.zzn == null && !zzaV(zztpVar)) {
            return false;
        }
        return true;
    }

    public final void zzaM(zztm zztmVar, int i9, long j7) {
        Trace.beginSection("skipVideoBuffer");
        zztmVar.zzn(i9, false);
        Trace.endSection();
        ((zztv) this).zza.zzf++;
    }

    public final void zzaN(int i9, int i10) {
        zzix zzixVar = ((zztv) this).zza;
        zzixVar.zzh += i9;
        int i11 = i9 + i10;
        zzixVar.zzg += i11;
        this.zzt += i11;
        int i12 = this.zzu + i11;
        this.zzu = i12;
        zzixVar.zzi = Math.max(i12, zzixVar.zzi);
    }

    public final void zzaO(long j7) {
        zzix zzixVar = ((zztv) this).zza;
        zzixVar.zzk += j7;
        zzixVar.zzl++;
        this.zzw += j7;
        this.zzx++;
    }

    public final boolean zzaP(long j7, boolean z8) throws zzjh {
        int zzd2 = zzd(j7);
        if (zzd2 == 0) {
            return false;
        }
        if (z8) {
            zzix zzixVar = ((zztv) this).zza;
            zzixVar.zzd += zzd2;
            zzixVar.zzf += this.zzv;
        } else {
            ((zztv) this).zza.zzj++;
            zzaN(zzd2, this.zzv);
        }
        zzaG();
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            zzacmVar.zze();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final int zzaa(zztx zztxVar, zzan zzanVar) throws zzud {
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12 = 128;
        if (!zzcg.zzh(zzanVar.zzn)) {
            return 128;
        }
        int i13 = 1;
        int i14 = 0;
        if (zzanVar.zzq != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        List zzaR = zzaR(this.zze, zztxVar, zzanVar, z8, false);
        if (z8 && zzaR.isEmpty()) {
            zzaR = zzaR(this.zze, zztxVar, zzanVar, false, false);
        }
        if (!zzaR.isEmpty()) {
            if (!zztv.zzaL(zzanVar)) {
                i13 = 2;
            } else {
                zztp zztpVar = (zztp) zzaR.get(0);
                boolean zze = zztpVar.zze(zzanVar);
                if (!zze) {
                    for (int i15 = 1; i15 < zzaR.size(); i15++) {
                        zztp zztpVar2 = (zztp) zzaR.get(i15);
                        if (zztpVar2.zze(zzanVar)) {
                            zze = true;
                            z9 = false;
                            zztpVar = zztpVar2;
                            break;
                        }
                    }
                }
                z9 = true;
                if (true != zze) {
                    i9 = 3;
                } else {
                    i9 = 4;
                }
                if (true != zztpVar.zzf(zzanVar)) {
                    i10 = 8;
                } else {
                    i10 = 16;
                }
                if (true != zztpVar.zzg) {
                    i11 = 0;
                } else {
                    i11 = 64;
                }
                if (true != z9) {
                    i12 = 0;
                }
                if (zzgd.zza >= 26 && "video/dolby-vision".equals(zzanVar.zzn) && !zzabh.zza(this.zze)) {
                    i12 = NotificationCompat.FLAG_LOCAL_ONLY;
                }
                if (zze) {
                    List zzaR2 = zzaR(this.zze, zztxVar, zzanVar, z8, true);
                    if (!zzaR2.isEmpty()) {
                        zztp zztpVar3 = (zztp) zzuj.zzg(zzaR2, zzanVar).get(0);
                        if (zztpVar3.zze(zzanVar) && zztpVar3.zzf(zzanVar)) {
                            i14 = 32;
                        }
                    }
                }
                return i9 | i10 | i14 | i11 | i12;
            }
        }
        return i13 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final zziy zzab(zztp zztpVar, zzan zzanVar, zzan zzanVar2) {
        int i9;
        int i10;
        zziy zzb2 = zztpVar.zzb(zzanVar, zzanVar2);
        int i11 = zzb2.zze;
        zzabi zzabiVar = this.zzk;
        zzabiVar.getClass();
        if (zzanVar2.zzs > zzabiVar.zza || zzanVar2.zzt > zzabiVar.zzb) {
            i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zzae(zztpVar, zzanVar2) > zzabiVar.zzc) {
            i11 |= 64;
        }
        String str = zztpVar.zza;
        if (i11 != 0) {
            i10 = i11;
            i9 = 0;
        } else {
            i9 = zzb2.zzd;
            i10 = 0;
        }
        return new zziy(str, zzanVar, zzanVar2, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    @Nullable
    public final zziy zzac(zzlj zzljVar) throws zzjh {
        zziy zzac = super.zzac(zzljVar);
        zzan zzanVar = zzljVar.zza;
        zzanVar.getClass();
        this.zzg.zzf(zzanVar, zzac);
        return zzac;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0237  */
    @Override // com.google.android.gms.internal.ads.zztv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zztk zzaf(com.google.android.gms.internal.ads.zztp r20, com.google.android.gms.internal.ads.zzan r21, @androidx.annotation.Nullable android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabj.zzaf(com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzan, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zztk");
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final List zzag(zztx zztxVar, zzan zzanVar, boolean z8) throws zzud {
        return zzuj.zzg(zzaR(this.zze, zztxVar, zzanVar, false, false), zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    @TargetApi(29)
    public final void zzaj(zzin zzinVar) throws zzjh {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzinVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s5 == 60 && s9 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztm zzaw = zzaw();
                        zzaw.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaw.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzak(Exception exc) {
        zzfk.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzal(String str, zztk zztkVar, long j7, long j9) {
        this.zzg.zza(str, j7, j9);
        this.zzl = zzaQ(str);
        zztp zzay = zzay();
        zzay.getClass();
        boolean z8 = false;
        if (zzgd.zza >= 29 && MimeTypes.VIDEO_VP9.equals(zzay.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzay.zzh();
            int length = zzh.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (zzh[i9].profile == 16384) {
                    z8 = true;
                    break;
                }
                i9++;
            }
        }
        this.zzm = z8;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzan(zzan zzanVar, @Nullable MediaFormat mediaFormat) {
        boolean z8;
        int integer;
        int integer2;
        zztm zzaw = zzaw();
        if (zzaw != null) {
            zzaw.zzq(this.zzr);
        }
        mediaFormat.getClass();
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z8) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f9 = zzanVar.zzw;
        int i9 = zzgd.zza;
        int i10 = zzanVar.zzv;
        if (i10 == 90 || i10 == 270) {
            f9 = 1.0f / f9;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzz = new zzdv(integer, integer2, 0, f9);
        this.zzi.zzl(zzanVar.zzu);
        zzacm zzacmVar = this.zzF;
        if (zzacmVar != null) {
            zzal zzb2 = zzanVar.zzb();
            zzb2.zzac(integer);
            zzb2.zzI(integer2);
            zzb2.zzW(0);
            zzb2.zzT(f9);
            zzacmVar.zzg(1, zzb2.zzad());
        }
    }

    @RequiresApi(21)
    public final void zzao(zztm zztmVar, int i9, long j7, long j9) {
        Trace.beginSection("releaseOutputBuffer");
        zztmVar.zzm(i9, j9);
        Trace.endSection();
        ((zztv) this).zza.zze++;
        this.zzu = 0;
        if (this.zzF == null) {
            zzdv zzdvVar = this.zzz;
            if (!zzdvVar.equals(zzdv.zza) && !zzdvVar.equals(this.zzA)) {
                this.zzA = zzdvVar;
                this.zzg.zzt(zzdvVar);
            }
            if (this.zzi.zzp() && this.zzn != null) {
                zzaT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzap() {
        this.zzi.zzf();
        this.zzf.zzd().zzj(zzau());
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final boolean zzar(long j7, long j9, @Nullable zztm zztmVar, @Nullable ByteBuffer byteBuffer, int i9, int i10, int i11, long j10, boolean z8, boolean z9, zzan zzanVar) throws zzjh {
        zztmVar.getClass();
        long zzau = j10 - zzau();
        int zza = this.zzi.zza(j10, j7, j9, zzav(), z9, this.zzj);
        if (z8 && !z9) {
            zzaM(zztmVar, i9, zzau);
            return true;
        }
        if (this.zzn == this.zzp && this.zzF == null) {
            if (this.zzj.zzc() < 30000) {
                zzaM(zztmVar, i9, zzau);
                zzaO(this.zzj.zzc());
                return true;
            }
        } else {
            zzacm zzacmVar = this.zzF;
            if (zzacmVar != null) {
                try {
                    zzacmVar.zzh(j7, j9);
                    long zzd2 = this.zzF.zzd(zzau, z9);
                    if (zzd2 != C.TIME_UNSET) {
                        int i12 = zzgd.zza;
                        zzao(zztmVar, i9, zzau, zzd2);
                        return true;
                    }
                } catch (zzacl e4) {
                    throw zzi(e4, e4.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
                }
            } else if (zza != 0) {
                if (zza != 1) {
                    if (zza != 2) {
                        if (zza == 3) {
                            zzaM(zztmVar, i9, zzau);
                            zzaO(this.zzj.zzc());
                            return true;
                        }
                    } else {
                        Trace.beginSection("dropVideoBuffer");
                        zztmVar.zzn(i9, false);
                        Trace.endSection();
                        zzaN(0, 1);
                        zzaO(this.zzj.zzc());
                        return true;
                    }
                } else {
                    zzabo zzaboVar = this.zzj;
                    long zzd3 = zzaboVar.zzd();
                    long zzc2 = zzaboVar.zzc();
                    int i13 = zzgd.zza;
                    if (zzd3 == this.zzy) {
                        zzaM(zztmVar, i9, zzau);
                    } else {
                        zzao(zztmVar, i9, zzau, zzd3);
                    }
                    zzaO(zzc2);
                    this.zzy = zzd3;
                    return true;
                }
            } else {
                zzh();
                long nanoTime = System.nanoTime();
                int i14 = zzgd.zza;
                zzao(zztmVar, i9, zzau, nanoTime);
                zzaO(this.zzj.zzc());
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final int zzat(zzin zzinVar) {
        int i9 = zzgd.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final zzto zzax(Throwable th, @Nullable zztp zztpVar) {
        return new zzabf(th, zztpVar, this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    public final void zzs() {
        this.zzi.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmi
    public final void zzt(int i9, @Nullable Object obj) throws zzjh {
        zzabm zzabmVar;
        Surface surface;
        if (i9 != 1) {
            if (i9 != 7) {
                if (i9 != 10) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            if (i9 != 13) {
                                if (i9 == 14) {
                                    obj.getClass();
                                    zzfv zzfvVar = (zzfv) obj;
                                    this.zzo = zzfvVar;
                                    if (this.zzF != null && zzfvVar.zzb() != 0 && zzfvVar.zza() != 0 && (surface = this.zzn) != null) {
                                        this.zzf.zzq(surface, zzfvVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            this.zzf.zzr((List) obj);
                            this.zzB = true;
                            return;
                        }
                        zzabq zzabqVar = this.zzi;
                        obj.getClass();
                        zzabqVar.zzj(((Integer) obj).intValue());
                        return;
                    }
                    obj.getClass();
                    int intValue = ((Integer) obj).intValue();
                    this.zzr = intValue;
                    zztm zzaw = zzaw();
                    if (zzaw != null) {
                        zzaw.zzq(intValue);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                if (this.zzD != intValue2) {
                    this.zzD = intValue2;
                    return;
                }
                return;
            }
            obj.getClass();
            zzabn zzabnVar = (zzabn) obj;
            this.zzE = zzabnVar;
            zzacm zzacmVar = this.zzF;
            if (zzacmVar != null) {
                zzabc.zzj(((zzaba) zzacmVar).zza, zzabnVar);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            zzabmVar = (Surface) obj;
        } else {
            zzabmVar = null;
        }
        if (zzabmVar == null) {
            zzabm zzabmVar2 = this.zzp;
            if (zzabmVar2 != null) {
                zzabmVar = zzabmVar2;
            } else {
                zztp zzay = zzay();
                if (zzay != null && zzaV(zzay)) {
                    zzabmVar = zzabm.zza(this.zze, zzay.zzf);
                    this.zzp = zzabmVar;
                }
            }
        }
        if (this.zzn != zzabmVar) {
            this.zzn = zzabmVar;
            this.zzi.zzm(zzabmVar);
            this.zzq = false;
            int zzcU = zzcU();
            zztm zzaw2 = zzaw();
            zzabm zzabmVar3 = zzabmVar;
            if (zzaw2 != null) {
                zzabmVar3 = zzabmVar;
                if (this.zzF == null) {
                    zzabm zzabmVar4 = zzabmVar;
                    if (zzgd.zza >= 23) {
                        if (zzabmVar != null) {
                            zzabmVar4 = zzabmVar;
                            if (!this.zzl) {
                                zzaw2.zzo(zzabmVar);
                                zzabmVar3 = zzabmVar;
                            }
                        } else {
                            zzabmVar4 = null;
                        }
                    }
                    zzaD();
                    zzaz();
                    zzabmVar3 = zzabmVar4;
                }
            }
            if (zzabmVar3 != null && zzabmVar3 != this.zzp) {
                zzaS();
                if (zzcU == 2) {
                    this.zzi.zzc(true);
                }
                if (this.zzF != null) {
                    this.zzf.zzq(zzabmVar3, zzfv.zza);
                    return;
                }
                return;
            }
            this.zzA = null;
            if (this.zzF != null) {
                this.zzf.zzk();
                return;
            }
            return;
        }
        if (zzabmVar != null && zzabmVar != this.zzp) {
            zzaS();
            Surface surface2 = this.zzn;
            if (surface2 != null && this.zzq) {
                this.zzg.zzq(surface2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzw() {
        this.zzA = null;
        this.zzi.zzd();
        this.zzq = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(((zztv) this).zza);
            this.zzg.zzt(zzdv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzx(boolean z8, boolean z9) throws zzjh {
        super.zzx(z8, z9);
        zzm();
        this.zzg.zze(((zztv) this).zza);
        this.zzi.zze(z9);
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzy() {
        this.zzi.zzk(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzz(long j7, boolean z8) throws zzjh {
        this.zzf.zzd().zze();
        super.zzz(j7, z8);
        this.zzi.zzi();
        if (z8) {
            this.zzi.zzc(false);
        }
        this.zzu = 0;
    }
}
