package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;

/* loaded from: classes3.dex */
public final class zzabd {
    private final zzaam zza = new zzaam();

    @Nullable
    private final zzabb zzb;

    @Nullable
    private final zzabc zzc;
    private boolean zzd;

    @Nullable
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzabd(@Nullable Context context) {
        DisplayManager displayManager;
        zzabb zzabbVar = (context == null || (displayManager = (DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)) == null) ? null : new zzabb(this, displayManager);
        this.zzb = zzabbVar;
        this.zzc = zzabbVar != null ? zzabc.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzabd zzabdVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzabdVar.zzk = refreshRate;
            zzabdVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzea.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzabdVar.zzk = -9223372036854775807L;
            zzabdVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzeu.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaba.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if (zzeu.zza < 30 || this.zze == null) {
            return;
        }
        float zza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f2 = this.zzg;
        if (zza != f2) {
            if (zza != -1.0f && f2 != -1.0f) {
                float f3 = 1.0f;
                if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f3 = 0.02f;
                }
                if (Math.abs(zza - this.zzg) < f3) {
                    return;
                }
            } else if (zza == -1.0f && this.zza.zzb() < 30) {
                return;
            }
            this.zzg = zza;
            zzn(false);
        }
    }

    private final void zzn(boolean z2) {
        Surface surface;
        if (zzeu.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f2 = 0.0f;
        if (this.zzd) {
            float f3 = this.zzg;
            if (f3 != -1.0f) {
                f2 = this.zzi * f3;
            }
        }
        if (z2 || this.zzh != f2) {
            this.zzh = f2;
            zzaba.zza(surface, f2);
        }
    }

    public final long zza(long j2) {
        long j3;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j4 = this.zzq + (((float) ((this.zzm - this.zzp) * zzc)) / this.zzi);
            if (Math.abs(j2 - j4) > 20000000) {
                zzl();
            } else {
                j2 = j4;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j2;
        zzabc zzabcVar = this.zzc;
        if (zzabcVar != null && this.zzk != -9223372036854775807L) {
            long j5 = zzabcVar.zza;
            if (j5 != -9223372036854775807L) {
                long j6 = this.zzk;
                long j7 = (((j2 - j5) / j6) * j6) + j5;
                if (j2 <= j7) {
                    j3 = j7 - j6;
                } else {
                    j3 = j7;
                    j7 = j6 + j7;
                }
                long j8 = this.zzl;
                if (j7 - j2 >= j2 - j3) {
                    j7 = j3;
                }
                return j7 - j8;
            }
        }
        return j2;
    }

    public final void zzc(float f2) {
        this.zzf = f2;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j2) {
        long j3 = this.zzn;
        if (j3 != -1) {
            this.zzp = j3;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j2 * 1000);
        zzm();
    }

    public final void zze(float f2) {
        this.zzi = f2;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzabc zzabcVar = this.zzc;
            zzabcVar.getClass();
            zzabcVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzabb zzabbVar = this.zzb;
        if (zzabbVar != null) {
            zzabbVar.zzb();
            zzabc zzabcVar = this.zzc;
            zzabcVar.getClass();
            zzabcVar.zzc();
        }
        zzk();
    }

    public final void zzi(@Nullable Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i2) {
        if (this.zzj == i2) {
            return;
        }
        this.zzj = i2;
        zzn(true);
    }
}
