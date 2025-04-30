package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzaoh implements zzaoc {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzapr zzb;

    @Nullable
    private final zzfu zzc;
    private final boolean[] zzd;
    private final zzaof zze;

    @Nullable
    private final zzaor zzf;
    private zzaog zzg;
    private long zzh;
    private String zzi;
    private zzafa zzj;
    private boolean zzk;
    private long zzl;

    public zzaoh() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(zzfu zzfuVar) {
        int i9;
        int i10;
        int i11 = 3;
        zzeq.zzb(this.zzg);
        zzeq.zzb(this.zzj);
        int zzd = zzfuVar.zzd();
        int zze = zzfuVar.zze();
        byte[] zzM = zzfuVar.zzM();
        this.zzh += zzfuVar.zzb();
        this.zzj.zzq(zzfuVar, zzfuVar.zzb());
        while (true) {
            int zza2 = zzgr.zza(zzM, zzd, zze, this.zzd);
            if (zza2 == zze) {
                break;
            }
            int i12 = zza2 + 3;
            int i13 = zzfuVar.zzM()[i12] & 255;
            int i14 = zza2 - zzd;
            if (!this.zzk) {
                if (i14 > 0) {
                    this.zze.zza(zzM, zzd, zza2);
                }
                if (i14 < 0) {
                    i10 = -i14;
                } else {
                    i10 = 0;
                }
                if (this.zze.zzc(i13, i10)) {
                    zzafa zzafaVar = this.zzj;
                    zzaof zzaofVar = this.zze;
                    int i15 = zzaofVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzaofVar.zzc, zzaofVar.zza);
                    zzft zzftVar = new zzft(copyOf, copyOf.length);
                    zzftVar.zzn(i15);
                    zzftVar.zzn(4);
                    zzftVar.zzl();
                    zzftVar.zzm(8);
                    if (zzftVar.zzo()) {
                        zzftVar.zzm(4);
                        zzftVar.zzm(i11);
                    }
                    int zzd2 = zzftVar.zzd(4);
                    float f9 = 1.0f;
                    if (zzd2 == 15) {
                        int zzd3 = zzftVar.zzd(8);
                        int zzd4 = zzftVar.zzd(8);
                        if (zzd4 == 0) {
                            zzfk.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f9 = zzd3 / zzd4;
                        }
                    } else if (zzd2 < 7) {
                        f9 = zza[zzd2];
                    } else {
                        zzfk.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f10 = f9;
                    if (zzftVar.zzo()) {
                        zzftVar.zzm(2);
                        zzftVar.zzm(1);
                        if (zzftVar.zzo()) {
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                            zzftVar.zzm(3);
                            zzftVar.zzm(11);
                            zzftVar.zzl();
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                        }
                    }
                    if (zzftVar.zzd(2) != 0) {
                        zzfk.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzftVar.zzl();
                    int zzd5 = zzftVar.zzd(16);
                    zzftVar.zzl();
                    if (zzftVar.zzo()) {
                        if (zzd5 == 0) {
                            zzfk.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i16 = zzd5 - 1;
                            int i17 = 0;
                            while (i16 > 0) {
                                i16 >>= 1;
                                i17++;
                            }
                            zzftVar.zzm(i17);
                        }
                    }
                    zzftVar.zzl();
                    int zzd6 = zzftVar.zzd(13);
                    zzftVar.zzl();
                    int zzd7 = zzftVar.zzd(13);
                    zzftVar.zzl();
                    zzftVar.zzl();
                    zzal zzalVar = new zzal();
                    zzalVar.zzK(str);
                    zzalVar.zzX(MimeTypes.VIDEO_MP4V);
                    zzalVar.zzac(zzd6);
                    zzalVar.zzI(zzd7);
                    zzalVar.zzT(f10);
                    zzalVar.zzL(Collections.singletonList(copyOf));
                    zzafaVar.zzl(zzalVar.zzad());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzM, zzd, zza2);
            zzaor zzaorVar = this.zzf;
            if (zzaorVar != null) {
                if (i14 > 0) {
                    zzaorVar.zza(zzM, zzd, zza2);
                    i9 = 0;
                } else {
                    i9 = -i14;
                }
                if (this.zzf.zzd(i9)) {
                    zzaor zzaorVar2 = this.zzf;
                    int zzb = zzgr.zzb(zzaorVar2.zza, zzaorVar2.zzb);
                    zzfu zzfuVar2 = this.zzc;
                    int i18 = zzgd.zza;
                    zzfuVar2.zzI(this.zzf.zza, zzb);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if (i13 == 178) {
                    if (zzfuVar.zzM()[zza2 + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i13 = 178;
                    int i19 = zze - zza2;
                    this.zzg.zzb(this.zzh - i19, i19, this.zzk);
                    this.zzg.zzc(i13, this.zzl);
                    zzd = i12;
                    i11 = 3;
                }
            }
            int i192 = zze - zza2;
            this.zzg.zzb(this.zzh - i192, i192, this.zzk);
            this.zzg.zzc(i13, this.zzl);
            zzd = i12;
            i11 = 3;
        }
        if (!this.zzk) {
            this.zze.zza(zzM, zzd, zze);
        }
        this.zzg.zza(zzM, zzd, zze);
        zzaor zzaorVar3 = this.zzf;
        if (zzaorVar3 != null) {
            zzaorVar3.zza(zzM, zzd, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzi = zzapoVar.zzb();
        zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzaog(zzw);
        zzapr zzaprVar = this.zzb;
        if (zzaprVar != null) {
            zzaprVar.zzb(zzadxVar, zzapoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzl = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        zzgr.zzf(this.zzd);
        this.zze.zzb();
        zzaog zzaogVar = this.zzg;
        if (zzaogVar != null) {
            zzaogVar.zzd();
        }
        zzaor zzaorVar = this.zzf;
        if (zzaorVar != null) {
            zzaorVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = C.TIME_UNSET;
    }

    public zzaoh(@Nullable zzapr zzaprVar) {
        zzfu zzfuVar;
        this.zzb = zzaprVar;
        this.zzd = new boolean[4];
        this.zze = new zzaof(128);
        this.zzl = C.TIME_UNSET;
        if (zzaprVar != null) {
            this.zzf = new zzaor(178, 128);
            zzfuVar = new zzfu();
        } else {
            zzfuVar = null;
            this.zzf = null;
        }
        this.zzc = zzfuVar;
    }
}
