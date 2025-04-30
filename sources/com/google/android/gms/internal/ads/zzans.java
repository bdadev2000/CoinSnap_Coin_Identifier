package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
public final class zzans implements zzaoc {
    private final zzft zza;
    private final zzfu zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzafa zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzan zzk;
    private int zzl;
    private long zzm;

    public zzans() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        boolean z8;
        boolean z9;
        zzeq.zzb(this.zzf);
        while (zzfuVar.zzb() > 0) {
            int i9 = this.zzg;
            boolean z10 = true;
            if (i9 == 0) {
                while (true) {
                    if (zzfuVar.zzb() <= 0) {
                        break;
                    }
                    if (!this.zzi) {
                        if (zzfuVar.zzm() == 11) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.zzi = z8;
                    } else {
                        int zzm = zzfuVar.zzm();
                        if (zzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzfu zzfuVar2 = this.zzb;
                            zzfuVar2.zzM()[0] = Ascii.VT;
                            zzfuVar2.zzM()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        if (zzm == 11) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.zzi = z9;
                    }
                }
            } else if (i9 != 1) {
                int min = Math.min(zzfuVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzq(zzfuVar, min);
                int i10 = this.zzh + min;
                this.zzh = i10;
                if (i10 == this.zzl) {
                    if (this.zzm == C.TIME_UNSET) {
                        z10 = false;
                    }
                    zzeq.zzf(z10);
                    this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] zzM = this.zzb.zzM();
                int min2 = Math.min(zzfuVar.zzb(), 128 - this.zzh);
                zzfuVar.zzG(zzM, this.zzh, min2);
                int i11 = this.zzh + min2;
                this.zzh = i11;
                if (i11 == 128) {
                    this.zza.zzk(0);
                    zzacs zze = zzact.zze(this.zza);
                    zzan zzanVar = this.zzk;
                    if (zzanVar == null || zze.zzc != zzanVar.zzA || zze.zzb != zzanVar.zzB || !zzgd.zzG(zze.zza, zzanVar.zzn)) {
                        zzal zzalVar = new zzal();
                        zzalVar.zzK(this.zze);
                        zzalVar.zzX(zze.zza);
                        zzalVar.zzy(zze.zzc);
                        zzalVar.zzY(zze.zzb);
                        zzalVar.zzO(this.zzc);
                        zzalVar.zzV(this.zzd);
                        zzalVar.zzS(zze.zzf);
                        if (MimeTypes.AUDIO_AC3.equals(zze.zza)) {
                            zzalVar.zzx(zze.zzf);
                        }
                        zzan zzad = zzalVar.zzad();
                        this.zzk = zzad;
                        this.zzf.zzl(zzad);
                    }
                    this.zzl = zze.zzd;
                    this.zzj = (zze.zze * 1000000) / this.zzk.zzB;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 128);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zze = zzapoVar.zzb();
        this.zzf = zzadxVar.zzw(zzapoVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzm = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = C.TIME_UNSET;
    }

    public zzans(@Nullable String str, int i9) {
        zzft zzftVar = new zzft(new byte[128], 128);
        this.zza = zzftVar;
        this.zzb = new zzfu(zzftVar.zza);
        this.zzg = 0;
        this.zzm = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i9;
    }
}
