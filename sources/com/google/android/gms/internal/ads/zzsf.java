package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzsf extends zztv implements zzlp {
    private final Context zzb;
    private final zzqn zzc;
    private final zzqv zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;

    @Nullable
    private zzan zzh;

    @Nullable
    private zzan zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    @Nullable
    private zzmm zzm;
    private boolean zzn;

    public zzsf(Context context, zztl zztlVar, zztx zztxVar, boolean z8, @Nullable Handler handler, @Nullable zzqo zzqoVar, zzqv zzqvVar) {
        super(1, zztlVar, zztxVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzqvVar;
        this.zzc = new zzqn(handler, zzqoVar);
        zzqvVar.zzq(new zzse(this, null));
    }

    private final int zzaM(zztp zztpVar, zzan zzanVar) {
        int i9;
        if ("OMX.google.raw.decoder".equals(zztpVar.zza) && (i9 = zzgd.zza) < 24 && (i9 != 23 || !zzgd.zzN(this.zzb))) {
            return -1;
        }
        return zzanVar.zzo;
    }

    private static List zzaN(zztx zztxVar, zzan zzanVar, boolean z8, zzqv zzqvVar) throws zzud {
        zztp zzb;
        if (zzanVar.zzn == null) {
            return zzgbc.zzm();
        }
        if (zzqvVar.zzA(zzanVar) && (zzb = zzuj.zzb()) != null) {
            return zzgbc.zzn(zzb);
        }
        return zzuj.zzf(zztxVar, zzanVar, false, false);
    }

    private final void zzaO() {
        long zzb = this.zzd.zzb(zzW());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                zzb = Math.max(this.zzj, zzb);
            }
            this.zzj = zzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzA() {
        this.zzd.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzE() {
        zzaO();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmn, com.google.android.gms.internal.ads.zzmp
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzW() {
        if (super.zzW() && this.zzd.zzz()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zzmn
    public final boolean zzX() {
        if (!this.zzd.zzy() && !super.zzX()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final float zzZ(float f9, zzan zzanVar, zzan[] zzanVarArr) {
        int i9 = -1;
        for (zzan zzanVar2 : zzanVarArr) {
            int i10 = zzanVar2.zzB;
            if (i10 != -1) {
                i9 = Math.max(i9, i10);
            }
        }
        if (i9 == -1) {
            return -1.0f;
        }
        return i9 * f9;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final long zza() {
        if (zzcU() == 2) {
            zzaO();
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final int zzaa(zztx zztxVar, zzan zzanVar) throws zzud {
        int i9;
        boolean z8;
        int i10;
        int i11;
        int i12 = 1;
        int i13 = 128;
        if (!zzcg.zzg(zzanVar.zzn)) {
            return 128;
        }
        int i14 = zzgd.zza;
        int i15 = zzanVar.zzH;
        boolean zzaL = zztv.zzaL(zzanVar);
        if (!zzaL || (i15 != 0 && zzuj.zzb() == null)) {
            i9 = 0;
        } else {
            zzqa zzd = this.zzd.zzd(zzanVar);
            if (!zzd.zzb) {
                i9 = 0;
            } else {
                if (true != zzd.zzc) {
                    i9 = 512;
                } else {
                    i9 = 1536;
                }
                if (zzd.zzd) {
                    i9 |= 2048;
                }
            }
            if (this.zzd.zzA(zzanVar)) {
                return i9 | 172;
            }
        }
        if ((!MimeTypes.AUDIO_RAW.equals(zzanVar.zzn) || this.zzd.zzA(zzanVar)) && this.zzd.zzA(zzgd.zzz(2, zzanVar.zzA, zzanVar.zzB))) {
            List zzaN = zzaN(zztxVar, zzanVar, false, this.zzd);
            if (!zzaN.isEmpty()) {
                if (!zzaL) {
                    i12 = 2;
                } else {
                    zztp zztpVar = (zztp) zzaN.get(0);
                    boolean zze = zztpVar.zze(zzanVar);
                    if (!zze) {
                        for (int i16 = 1; i16 < zzaN.size(); i16++) {
                            zztp zztpVar2 = (zztp) zzaN.get(i16);
                            if (zztpVar2.zze(zzanVar)) {
                                zze = true;
                                z8 = false;
                                zztpVar = zztpVar2;
                                break;
                            }
                        }
                    }
                    z8 = true;
                    if (true != zze) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                    int i17 = 8;
                    if (zze && zztpVar.zzf(zzanVar)) {
                        i17 = 16;
                    }
                    if (true != zztpVar.zzg) {
                        i11 = 0;
                    } else {
                        i11 = 64;
                    }
                    if (true != z8) {
                        i13 = 0;
                    }
                    return i10 | i17 | 32 | i11 | i13 | i9;
                }
            }
        }
        return i12 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final zziy zzab(zztp zztpVar, zzan zzanVar, zzan zzanVar2) {
        int i9;
        int i10;
        zziy zzb = zztpVar.zzb(zzanVar, zzanVar2);
        int i11 = zzb.zze;
        if (zzaJ(zzanVar2)) {
            i11 |= 32768;
        }
        if (zzaM(zztpVar, zzanVar2) > this.zze) {
            i11 |= 64;
        }
        String str = zztpVar.zza;
        if (i11 != 0) {
            i10 = i11;
            i9 = 0;
        } else {
            i9 = zzb.zzd;
            i10 = 0;
        }
        return new zziy(str, zzanVar, zzanVar2, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    @Nullable
    public final zziy zzac(zzlj zzljVar) throws zzjh {
        zzan zzanVar = zzljVar.zza;
        zzanVar.getClass();
        this.zzh = zzanVar;
        zziy zzac = super.zzac(zzljVar);
        this.zzc.zzi(zzanVar, zzac);
        return zzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    @Override // com.google.android.gms.internal.ads.zztv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zztk zzaf(com.google.android.gms.internal.ads.zztp r8, com.google.android.gms.internal.ads.zzan r9, @androidx.annotation.Nullable android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsf.zzaf(com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzan, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zztk");
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final List zzag(zztx zztxVar, zzan zzanVar, boolean z8) throws zzud {
        return zzuj.zzg(zzaN(zztxVar, zzanVar, false, this.zzd), zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaj(zzin zzinVar) {
        zzan zzanVar;
        if (zzgd.zza >= 29 && (zzanVar = zzinVar.zza) != null && Objects.equals(zzanVar.zzn, MimeTypes.AUDIO_OPUS) && zzaI()) {
            ByteBuffer byteBuffer = zzinVar.zzf;
            byteBuffer.getClass();
            zzan zzanVar2 = zzinVar.zza;
            zzanVar2.getClass();
            if (byteBuffer.remaining() == 8) {
                this.zzd.zzr(zzanVar2.zzD, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzak(Exception exc) {
        zzfk.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzal(String str, zztk zztkVar, long j7, long j9) {
        this.zzc.zze(str, j7, j9);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzan(zzan zzanVar, @Nullable MediaFormat mediaFormat) throws zzjh {
        int i9;
        int i10;
        zzan zzanVar2 = this.zzi;
        int[] iArr = null;
        boolean z8 = true;
        if (zzanVar2 != null) {
            zzanVar = zzanVar2;
        } else if (zzaw() != null) {
            mediaFormat.getClass();
            if (MimeTypes.AUDIO_RAW.equals(zzanVar.zzn)) {
                i9 = zzanVar.zzC;
            } else if (zzgd.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i9 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i9 = zzgd.zzl(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i9 = 2;
            }
            zzal zzalVar = new zzal();
            zzalVar.zzX(MimeTypes.AUDIO_RAW);
            zzalVar.zzR(i9);
            zzalVar.zzF(zzanVar.zzD);
            zzalVar.zzG(zzanVar.zzE);
            zzalVar.zzQ(zzanVar.zzl);
            zzalVar.zzK(zzanVar.zzb);
            zzalVar.zzM(zzanVar.zzc);
            zzalVar.zzN(zzanVar.zzd);
            zzalVar.zzO(zzanVar.zze);
            zzalVar.zzZ(zzanVar.zzf);
            zzalVar.zzV(zzanVar.zzg);
            zzalVar.zzy(mediaFormat.getInteger("channel-count"));
            zzalVar.zzY(mediaFormat.getInteger("sample-rate"));
            zzan zzad = zzalVar.zzad();
            if (this.zzf && zzad.zzA == 6 && (i10 = zzanVar.zzA) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < zzanVar.zzA; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.zzg) {
                int i12 = zzad.zzA;
                if (i12 != 3) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                if (i12 == 8) {
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
            }
            zzanVar = zzad;
        }
        try {
            int i13 = zzgd.zza;
            if (i13 >= 29) {
                if (zzaI()) {
                    zzm();
                }
                if (i13 < 29) {
                    z8 = false;
                }
                zzeq.zzf(z8);
            }
            this.zzd.zze(zzanVar, 0, iArr);
        } catch (zzqq e4) {
            throw zzi(e4, e4.zza, false, 5001);
        }
    }

    @CallSuper
    public final void zzao() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final void zzaq() throws zzjh {
        int i9;
        try {
            this.zzd.zzj();
        } catch (zzqu e4) {
            if (true != zzaI()) {
                i9 = 5002;
            } else {
                i9 = 5003;
            }
            throw zzi(e4, e4.zzc, e4.zzb, i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final boolean zzar(long j7, long j9, @Nullable zztm zztmVar, @Nullable ByteBuffer byteBuffer, int i9, int i10, int i11, long j10, boolean z8, boolean z9, zzan zzanVar) throws zzjh {
        byteBuffer.getClass();
        if (this.zzi != null && (i10 & 2) != 0) {
            zztmVar.getClass();
            zztmVar.zzn(i9, false);
            return true;
        }
        if (z8) {
            if (zztmVar != null) {
                zztmVar.zzn(i9, false);
            }
            ((zztv) this).zza.zzf += i11;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j10, i11)) {
                return false;
            }
            if (zztmVar != null) {
                zztmVar.zzn(i9, false);
            }
            ((zztv) this).zza.zze += i11;
            return true;
        } catch (zzqr e4) {
            zzan zzanVar2 = this.zzh;
            if (zzaI()) {
                zzm();
            }
            throw zzi(e4, zzanVar2, e4.zzb, 5001);
        } catch (zzqu e9) {
            if (zzaI()) {
                zzm();
            }
            throw zzi(e9, zzanVar, e9.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv
    public final boolean zzas(zzan zzanVar) {
        zzm();
        return this.zzd.zzA(zzanVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final zzcl zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzg(zzcl zzclVar) {
        this.zzd.zzs(zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final boolean zzj() {
        boolean z8 = this.zzn;
        this.zzn = false;
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    @Nullable
    public final zzlp zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmi
    public final void zzt(int i9, @Nullable Object obj) throws zzjh {
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 6) {
                    switch (i9) {
                        case 9:
                            zzqv zzqvVar = this.zzd;
                            obj.getClass();
                            zzqvVar.zzv(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            zzqv zzqvVar2 = this.zzd;
                            obj.getClass();
                            zzqvVar2.zzn(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.zzm = (zzmm) obj;
                            return;
                        case 12:
                            if (zzgd.zza >= 23) {
                                zzsc.zza(this.zzd, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                zzl zzlVar = (zzl) obj;
                zzqv zzqvVar3 = this.zzd;
                zzlVar.getClass();
                zzqvVar3.zzo(zzlVar);
                return;
            }
            zzk zzkVar = (zzk) obj;
            zzqv zzqvVar4 = this.zzd;
            zzkVar.getClass();
            zzqvVar4.zzm(zzkVar);
            return;
        }
        zzqv zzqvVar5 = this.zzd;
        obj.getClass();
        zzqvVar5.zzw(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzw() {
        this.zzl = true;
        this.zzh = null;
        try {
            this.zzd.zzf();
            super.zzw();
        } catch (Throwable th) {
            super.zzw();
            throw th;
        } finally {
            this.zzc.zzg(((zztv) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzx(boolean z8, boolean z9) throws zzjh {
        super.zzx(z8, z9);
        this.zzc.zzh(((zztv) this).zza);
        zzm();
        this.zzd.zzt(zzn());
        this.zzd.zzp(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zziw
    public final void zzz(long j7, boolean z8) throws zzjh {
        super.zzz(j7, z8);
        this.zzd.zzf();
        this.zzj = j7;
        this.zzn = false;
        this.zzk = true;
    }
}
