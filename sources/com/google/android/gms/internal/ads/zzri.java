package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class zzri extends zzte implements zzkt {
    private final Context zzb;
    private final zzpq zzc;
    private final zzpy zzd;

    @Nullable
    private final zzsp zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzaf zzi;

    @Nullable
    private zzaf zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzri(Context context, zzsr zzsrVar, zztg zztgVar, boolean z2, @Nullable Handler handler, @Nullable zzpr zzprVar, zzpy zzpyVar) {
        super(1, zzsrVar, zztgVar, false, 44100.0f);
        zzsp zzspVar = zzeu.zza >= 35 ? new zzsp(zzso.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzpyVar;
        this.zze = zzspVar;
        this.zzo = -1000;
        this.zzc = new zzpq(handler, zzprVar);
        zzpyVar.zzq(new zzrh(this, null));
    }

    private final int zzaQ(zzsw zzswVar, zzaf zzafVar) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(zzswVar.zza) || (i2 = zzeu.zza) >= 24 || (i2 == 23 && zzeu.zzL(this.zzb))) {
            return zzafVar.zzo;
        }
        return -1;
    }

    private static List zzaR(zztg zztgVar, zzaf zzafVar, boolean z2, zzpy zzpyVar) throws zztm {
        zzsw zzc;
        return zzafVar.zzn == null ? zzgax.zzn() : (!zzpyVar.zzA(zzafVar) || (zzc = zzts.zzc()) == null) ? zzts.zzg(zztgVar, zzafVar, false, false) : zzgax.zzo(zzc);
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

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzA() {
        zzsp zzspVar;
        this.zzd.zzk();
        if (zzeu.zza < 35 || (zzspVar = this.zze) == null) {
            return;
        }
        zzspVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzE() {
        zzaS();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlu
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzlr
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final float zzZ(float f2, zzaf zzafVar, zzaf[] zzafVarArr) {
        int i2 = -1;
        for (zzaf zzafVar2 : zzafVarArr) {
            int i3 = zzafVar2.zzC;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return i2 * f2;
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
        if (zzcV() == 2) {
            zzaS();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final int zzaa(zztg zztgVar, zzaf zzafVar) throws zztm {
        int i2;
        boolean z2;
        if (!zzbn.zzg(zzafVar.zzn)) {
            return 128;
        }
        int i3 = zzafVar.zzI;
        boolean zzaP = zzte.zzaP(zzafVar);
        int i4 = 1;
        if (!zzaP || (i3 != 0 && zzts.zzc() == null)) {
            i2 = 0;
        } else {
            zzpd zzd = this.zzd.zzd(zzafVar);
            if (zzd.zzb) {
                i2 = true != zzd.zzc ? 512 : 1536;
                if (zzd.zzd) {
                    i2 |= Opcodes.ACC_STRICT;
                }
            } else {
                i2 = 0;
            }
            if (this.zzd.zzA(zzafVar)) {
                return i2 | Opcodes.IRETURN;
            }
        }
        if ((!"audio/raw".equals(zzafVar.zzn) || this.zzd.zzA(zzafVar)) && this.zzd.zzA(zzeu.zzz(2, zzafVar.zzB, zzafVar.zzC))) {
            List zzaR = zzaR(zztgVar, zzafVar, false, this.zzd);
            if (!zzaR.isEmpty()) {
                if (zzaP) {
                    zzsw zzswVar = (zzsw) zzaR.get(0);
                    boolean zze = zzswVar.zze(zzafVar);
                    if (!zze) {
                        for (int i5 = 1; i5 < zzaR.size(); i5++) {
                            zzsw zzswVar2 = (zzsw) zzaR.get(i5);
                            if (zzswVar2.zze(zzafVar)) {
                                z2 = false;
                                zze = true;
                                zzswVar = zzswVar2;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    int i6 = true != zze ? 3 : 4;
                    int i7 = 8;
                    if (zze && zzswVar.zzf(zzafVar)) {
                        i7 = 16;
                    }
                    return i6 | i7 | 32 | (true != zzswVar.zzg ? 0 : 64) | (true != z2 ? 0 : 128) | i2;
                }
                i4 = 2;
            }
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzib zzab(zzsw zzswVar, zzaf zzafVar, zzaf zzafVar2) {
        int i2;
        int i3;
        zzib zzb = zzswVar.zzb(zzafVar, zzafVar2);
        int i4 = zzb.zze;
        if (zzaM(zzafVar2)) {
            i4 |= 32768;
        }
        if (zzaQ(zzswVar, zzafVar2) > this.zzf) {
            i4 |= 64;
        }
        String str = zzswVar.zza;
        if (i4 != 0) {
            i3 = i4;
            i2 = 0;
        } else {
            i2 = zzb.zzd;
            i3 = 0;
        }
        return new zzib(str, zzafVar, zzafVar2, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    @Nullable
    public final zzib zzac(zzkm zzkmVar) throws zzij {
        zzaf zzafVar = zzkmVar.zza;
        zzafVar.getClass();
        this.zzi = zzafVar;
        zzib zzac = super.zzac(zzkmVar);
        this.zzc.zzi(zzafVar, zzac);
        return zzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    @Override // com.google.android.gms.internal.ads.zzte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzsq zzaf(com.google.android.gms.internal.ads.zzsw r8, com.google.android.gms.internal.ads.zzaf r9, @androidx.annotation.Nullable android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzri.zzaf(com.google.android.gms.internal.ads.zzsw, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzsq");
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final List zzag(zztg zztgVar, zzaf zzafVar, boolean z2) throws zztm {
        return zzts.zzh(zzaR(zztgVar, zzafVar, false, this.zzd), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzaj(zzhq zzhqVar) {
        zzaf zzafVar;
        if (zzeu.zza < 29 || (zzafVar = zzhqVar.zza) == null || !Objects.equals(zzafVar.zzn, "audio/opus") || !zzaL()) {
            return;
        }
        ByteBuffer byteBuffer = zzhqVar.zzf;
        byteBuffer.getClass();
        zzaf zzafVar2 = zzhqVar.zza;
        zzafVar2.getClass();
        int i2 = zzafVar2.zzE;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i2, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzak(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzal(String str, zzsq zzsqVar, long j2, long j3) {
        this.zzc.zze(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzan(zzaf zzafVar, @Nullable MediaFormat mediaFormat) throws zzij {
        int i2;
        zzaf zzafVar2 = this.zzj;
        boolean z2 = true;
        int[] iArr = null;
        if (zzafVar2 != null) {
            zzafVar = zzafVar2;
        } else if (zzaz() != null) {
            mediaFormat.getClass();
            int zzm = "audio/raw".equals(zzafVar.zzn) ? zzafVar.zzD : (zzeu.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzeu.zzm(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzad zzadVar = new zzad();
            zzadVar.zzZ("audio/raw");
            zzadVar.zzT(zzm);
            zzadVar.zzG(zzafVar.zzE);
            zzadVar.zzH(zzafVar.zzF);
            zzadVar.zzS(zzafVar.zzk);
            zzadVar.zzL(zzafVar.zza);
            zzadVar.zzN(zzafVar.zzb);
            zzadVar.zzO(zzafVar.zzc);
            zzadVar.zzP(zzafVar.zzd);
            zzadVar.zzab(zzafVar.zze);
            zzadVar.zzX(zzafVar.zzf);
            zzadVar.zzz(mediaFormat.getInteger("channel-count"));
            zzadVar.zzaa(mediaFormat.getInteger("sample-rate"));
            zzaf zzaf = zzadVar.zzaf();
            if (this.zzg && zzaf.zzB == 6 && (i2 = zzafVar.zzB) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzafVar.zzB; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.zzh) {
                int i4 = zzaf.zzB;
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzafVar = zzaf;
        }
        try {
            int i5 = zzeu.zza;
            if (i5 >= 29) {
                if (zzaL()) {
                    zzn();
                }
                if (i5 < 29) {
                    z2 = false;
                }
                zzdi.zzf(z2);
            }
            this.zzd.zze(zzafVar, 0, iArr);
        } catch (zzpt e) {
            throw zzcY(e, e.zza, false, 5001);
        }
    }

    @CallSuper
    public final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzaq() throws zzij {
        try {
            this.zzd.zzj();
        } catch (zzpx e) {
            throw zzcY(e, e.zzc, e.zzb, true != zzaL() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzar(long j2, long j3, @Nullable zzst zzstVar, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, zzaf zzafVar) throws zzij {
        byteBuffer.getClass();
        if (this.zzj != null && (i3 & 2) != 0) {
            zzstVar.getClass();
            zzstVar.zzo(i2, false);
            return true;
        }
        if (z2) {
            if (zzstVar != null) {
                zzstVar.zzo(i2, false);
            }
            ((zzte) this).zza.zzf += i4;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j4, i4)) {
                return false;
            }
            if (zzstVar != null) {
                zzstVar.zzo(i2, false);
            }
            ((zzte) this).zza.zze += i4;
            return true;
        } catch (zzpu e) {
            zzaf zzafVar2 = this.zzi;
            if (zzaL()) {
                zzn();
            }
            throw zzcY(e, zzafVar2, e.zzb, 5001);
        } catch (zzpx e2) {
            if (zzaL()) {
                zzn();
            }
            throw zzcY(e2, zzafVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzas(zzaf zzafVar) {
        zzn();
        return this.zzd.zzA(zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final zzbq zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(zzbq zzbqVar) {
        this.zzd.zzs(zzbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final boolean zzj() {
        boolean z2 = this.zzn;
        this.zzn = false;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlr
    @Nullable
    public final zzkt zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlm
    public final void zzu(int i2, @Nullable Object obj) throws zzij {
        zzsp zzspVar;
        if (i2 == 2) {
            zzpy zzpyVar = this.zzd;
            obj.getClass();
            zzpyVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            zzh zzhVar = (zzh) obj;
            zzpy zzpyVar2 = this.zzd;
            zzhVar.getClass();
            zzpyVar2.zzm(zzhVar);
            return;
        }
        if (i2 == 6) {
            zzi zziVar = (zzi) obj;
            zzpy zzpyVar3 = this.zzd;
            zziVar.getClass();
            zzpyVar3.zzo(zziVar);
            return;
        }
        if (i2 == 12) {
            if (zzeu.zza >= 23) {
                zzrf.zza(this.zzd, obj);
                return;
            }
            return;
        }
        if (i2 == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzst zzaz = zzaz();
            if (zzaz == null || zzeu.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzaz.zzq(bundle);
            return;
        }
        if (i2 == 9) {
            zzpy zzpyVar4 = this.zzd;
            obj.getClass();
            zzpyVar4.zzv(((Boolean) obj).booleanValue());
        } else {
            if (i2 != 10) {
                super.zzu(i2, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzn(intValue);
            if (zzeu.zza < 35 || (zzspVar = this.zze) == null) {
                return;
            }
            zzspVar.zzd(intValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th) {
            super.zzx();
            throw th;
        } finally {
            this.zzc.zzg(((zzte) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzy(boolean z2, boolean z3) throws zzij {
        super.zzy(z2, z3);
        this.zzc.zzh(((zzte) this).zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhz
    public final void zzz(long j2, boolean z2) throws zzij {
        super.zzz(j2, z2);
        this.zzd.zzf();
        this.zzk = j2;
        this.zzn = false;
        this.zzl = true;
    }
}
