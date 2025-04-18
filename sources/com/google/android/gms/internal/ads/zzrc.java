package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzrc extends zzsy implements zzkp {
    private final Context zzb;
    private final zzpm zzc;
    private final zzpu zzd;

    @Nullable
    private final zzsj zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzad zzi;

    @Nullable
    private zzad zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrc(Context context, zzsl zzslVar, zzta zztaVar, boolean z10, @Nullable Handler handler, @Nullable zzpn zzpnVar, zzpu zzpuVar) {
        super(1, zzslVar, zztaVar, false, 44100.0f);
        zzsj zzsjVar;
        zzrb zzrbVar = null;
        if (zzen.zza >= 35) {
            zzsjVar = new zzsj(zzsi.zza);
        } else {
            zzsjVar = null;
        }
        this.zzb = context.getApplicationContext();
        this.zzd = zzpuVar;
        this.zze = zzsjVar;
        this.zzo = -1000;
        this.zzc = new zzpm(handler, zzpnVar);
        zzpuVar.zzq(new zzra(this, zzrbVar));
    }

    private final int zzaQ(zzsq zzsqVar, zzad zzadVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(zzsqVar.zza) && (i10 = zzen.zza) < 24 && (i10 != 23 || !zzen.zzM(this.zzb))) {
            return -1;
        }
        return zzadVar.zzp;
    }

    private static List zzaR(zzta zztaVar, zzad zzadVar, boolean z10, zzpu zzpuVar) throws zztf {
        zzsq zza;
        if (zzadVar.zzo == null) {
            return zzfzo.zzn();
        }
        if (zzpuVar.zzA(zzadVar) && (zza = zztl.zza()) != null) {
            return zzfzo.zzo(zza);
        }
        return zztl.zze(zztaVar, zzadVar, false, false);
    }

    private final void zzaS() {
        long zzb = this.zzd.zzb(zzW());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzb = Math.max(this.zzk, zzb);
            }
            this.zzk = zzb;
            this.zzl = false;
        }
    }

    public static /* bridge */ /* synthetic */ zzpm zzae(zzrc zzrcVar) {
        return zzrcVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzA() {
        zzsj zzsjVar;
        this.zzd.zzk();
        if (zzen.zza >= 35 && (zzsjVar = this.zze) != null) {
            zzsjVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        } catch (Throwable th2) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzE() {
        zzaS();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlq
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final float zzZ(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        int i10 = -1;
        for (zzad zzadVar2 : zzadVarArr) {
            int i11 = zzadVar2.zzD;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        if (zzcV() == 2) {
            zzaS();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzaa(zzta zztaVar, zzad zzadVar) throws zztf {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13 = 128;
        if (!zzbg.zzg(zzadVar.zzo)) {
            return 128;
        }
        int i14 = zzadVar.zzJ;
        boolean zzaP = zzsy.zzaP(zzadVar);
        int i15 = 1;
        if (zzaP && (i14 == 0 || zztl.zza() != null)) {
            zzoz zzd = this.zzd.zzd(zzadVar);
            if (!zzd.zzb) {
                i10 = 0;
            } else {
                if (true != zzd.zzc) {
                    i10 = 512;
                } else {
                    i10 = 1536;
                }
                if (zzd.zzd) {
                    i10 |= 2048;
                }
            }
            if (this.zzd.zzA(zzadVar)) {
                return i10 | 172;
            }
        } else {
            i10 = 0;
        }
        if ((!MimeTypes.AUDIO_RAW.equals(zzadVar.zzo) || this.zzd.zzA(zzadVar)) && this.zzd.zzA(zzen.zzA(2, zzadVar.zzC, zzadVar.zzD))) {
            List zzaR = zzaR(zztaVar, zzadVar, false, this.zzd);
            if (!zzaR.isEmpty()) {
                if (!zzaP) {
                    i15 = 2;
                } else {
                    zzsq zzsqVar = (zzsq) zzaR.get(0);
                    boolean zze = zzsqVar.zze(zzadVar);
                    if (!zze) {
                        for (int i16 = 1; i16 < zzaR.size(); i16++) {
                            zzsq zzsqVar2 = (zzsq) zzaR.get(i16);
                            if (zzsqVar2.zze(zzadVar)) {
                                z10 = false;
                                zze = true;
                                zzsqVar = zzsqVar2;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (true != zze) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                    int i17 = 8;
                    if (zze && zzsqVar.zzf(zzadVar)) {
                        i17 = 16;
                    }
                    if (true != zzsqVar.zzg) {
                        i12 = 0;
                    } else {
                        i12 = 64;
                    }
                    if (true != z10) {
                        i13 = 0;
                    }
                    return i11 | i17 | 32 | i12 | i13 | i10;
                }
            }
        }
        return i15 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhy zzab(zzsq zzsqVar, zzad zzadVar, zzad zzadVar2) {
        int i10;
        int i11;
        zzhy zzb = zzsqVar.zzb(zzadVar, zzadVar2);
        int i12 = zzb.zze;
        if (zzaM(zzadVar2)) {
            i12 |= 32768;
        }
        if (zzaQ(zzsqVar, zzadVar2) > this.zzf) {
            i12 |= 64;
        }
        String str = zzsqVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb.zzd;
            i11 = 0;
        }
        return new zzhy(str, zzadVar, zzadVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    @Nullable
    public final zzhy zzac(zzkj zzkjVar) throws zzig {
        zzad zzadVar = zzkjVar.zza;
        zzadVar.getClass();
        this.zzi = zzadVar;
        zzhy zzac = super.zzac(zzkjVar);
        this.zzc.zzi(zzadVar, zzac);
        return zzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    @Override // com.google.android.gms.internal.ads.zzsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzsk zzaf(com.google.android.gms.internal.ads.zzsq r8, com.google.android.gms.internal.ads.zzad r9, @androidx.annotation.Nullable android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrc.zzaf(com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzad, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzsk");
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final List zzag(zzta zztaVar, zzad zzadVar, boolean z10) throws zztf {
        return zztl.zzf(zzaR(zztaVar, zzadVar, false, this.zzd), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaj(zzhm zzhmVar) {
        zzad zzadVar;
        if (zzen.zza >= 29 && (zzadVar = zzhmVar.zza) != null && Objects.equals(zzadVar.zzo, MimeTypes.AUDIO_OPUS) && zzaL()) {
            ByteBuffer byteBuffer = zzhmVar.zzf;
            byteBuffer.getClass();
            zzad zzadVar2 = zzhmVar.zza;
            zzadVar2.getClass();
            int i10 = zzadVar2.zzF;
            if (byteBuffer.remaining() == 8) {
                this.zzd.zzr(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzak(Exception exc) {
        zzdt.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzal(String str, zzsk zzskVar, long j3, long j10) {
        this.zzc.zze(str, j3, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzan(zzad zzadVar, @Nullable MediaFormat mediaFormat) throws zzig {
        int i10;
        int[] iArr;
        int i11;
        boolean z10;
        zzad zzadVar2 = this.zzj;
        int[] iArr2 = null;
        if (zzadVar2 != null) {
            zzadVar = zzadVar2;
        } else if (zzaz() != null) {
            mediaFormat.getClass();
            if (MimeTypes.AUDIO_RAW.equals(zzadVar.zzo)) {
                i10 = zzadVar.zzE;
            } else if (zzen.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = zzen.zzn(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            zzab zzabVar = new zzab();
            zzabVar.zzZ(MimeTypes.AUDIO_RAW);
            zzabVar.zzT(i10);
            zzabVar.zzG(zzadVar.zzF);
            zzabVar.zzH(zzadVar.zzG);
            zzabVar.zzS(zzadVar.zzl);
            zzabVar.zzL(zzadVar.zza);
            zzabVar.zzN(zzadVar.zzb);
            zzabVar.zzO(zzadVar.zzc);
            zzabVar.zzP(zzadVar.zzd);
            zzabVar.zzab(zzadVar.zze);
            zzabVar.zzX(zzadVar.zzf);
            zzabVar.zzz(mediaFormat.getInteger("channel-count"));
            zzabVar.zzaa(mediaFormat.getInteger("sample-rate"));
            zzad zzaf = zzabVar.zzaf();
            if (this.zzg && zzaf.zzC == 6 && (i11 = zzadVar.zzC) < 6) {
                iArr2 = new int[i11];
                for (int i12 = 0; i12 < zzadVar.zzC; i12++) {
                    iArr2[i12] = i12;
                }
            } else if (this.zzh) {
                int i13 = zzaf.zzC;
                if (i13 != 3) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            if (i13 != 7) {
                                if (i13 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
                iArr2 = iArr;
            }
            zzadVar = zzaf;
        }
        try {
            int i14 = zzen.zza;
            if (i14 >= 29) {
                if (zzaL()) {
                    zzn();
                }
                if (i14 >= 29) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdb.zzf(z10);
            }
            this.zzd.zze(zzadVar, 0, iArr2);
        } catch (zzpp e2) {
            throw zzcY(e2, e2.zza, false, 5001);
        }
    }

    @CallSuper
    public final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaq() throws zzig {
        int i10;
        try {
            this.zzd.zzj();
        } catch (zzpt e2) {
            if (true != zzaL()) {
                i10 = 5002;
            } else {
                i10 = 5003;
            }
            throw zzcY(e2, e2.zzc, e2.zzb, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzar(long j3, long j10, @Nullable zzsn zzsnVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, zzad zzadVar) throws zzig {
        byteBuffer.getClass();
        if (this.zzj != null && (i11 & 2) != 0) {
            zzsnVar.getClass();
            zzsnVar.zzo(i10, false);
            return true;
        }
        if (z10) {
            if (zzsnVar != null) {
                zzsnVar.zzo(i10, false);
            }
            ((zzsy) this).zza.zzf += i12;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j11, i12)) {
                return false;
            }
            if (zzsnVar != null) {
                zzsnVar.zzo(i10, false);
            }
            ((zzsy) this).zza.zze += i12;
            return true;
        } catch (zzpq e2) {
            zzad zzadVar2 = this.zzi;
            if (zzaL()) {
                zzn();
            }
            throw zzcY(e2, zzadVar2, e2.zzb, 5001);
        } catch (zzpt e10) {
            if (zzaL()) {
                zzn();
            }
            throw zzcY(e10, zzadVar, e10.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzas(zzad zzadVar) {
        zzn();
        return this.zzd.zzA(zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbj zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzbj zzbjVar) {
        this.zzd.zzs(zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final boolean zzj() {
        boolean z10 = this.zzn;
        this.zzn = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    @Nullable
    public final zzkp zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzli
    public final void zzu(int i10, @Nullable Object obj) throws zzig {
        zzsj zzsjVar;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 12) {
                        if (i10 != 16) {
                            if (i10 != 9) {
                                if (i10 != 10) {
                                    super.zzu(i10, obj);
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                this.zzd.zzn(intValue);
                                if (zzen.zza >= 35 && (zzsjVar = this.zze) != null) {
                                    zzsjVar.zzd(intValue);
                                    return;
                                }
                                return;
                            }
                            zzpu zzpuVar = this.zzd;
                            obj.getClass();
                            zzpuVar.zzv(((Boolean) obj).booleanValue());
                            return;
                        }
                        obj.getClass();
                        this.zzo = ((Integer) obj).intValue();
                        zzsn zzaz = zzaz();
                        if (zzaz != null && zzen.zza >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.zzo));
                            zzaz.zzq(bundle);
                            return;
                        }
                        return;
                    }
                    if (zzen.zza >= 23) {
                        zzqz.zza(this.zzd, obj);
                        return;
                    }
                    return;
                }
                zzh zzhVar = (zzh) obj;
                zzpu zzpuVar2 = this.zzd;
                zzhVar.getClass();
                zzpuVar2.zzo(zzhVar);
                return;
            }
            zzg zzgVar = (zzg) obj;
            zzpu zzpuVar3 = this.zzd;
            zzgVar.getClass();
            zzpuVar3.zzm(zzgVar);
            return;
        }
        zzpu zzpuVar4 = this.zzd;
        obj.getClass();
        zzpuVar4.zzw(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th2) {
            super.zzx();
            throw th2;
        } finally {
            this.zzc.zzg(((zzsy) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzy(boolean z10, boolean z11) throws zzig {
        super.zzy(z10, z11);
        this.zzc.zzh(((zzsy) this).zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzz(long j3, boolean z10) throws zzig {
        super.zzz(j3, z10);
        this.zzd.zzf();
        this.zzk = j3;
        this.zzn = false;
        this.zzl = true;
    }
}
