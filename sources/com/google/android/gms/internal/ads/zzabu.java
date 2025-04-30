package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzabu {
    private final zzabe zza = new zzabe();

    @Nullable
    private final zzabs zzb;

    @Nullable
    private final zzabt zzc;
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

    public zzabu(@Nullable Context context) {
        DisplayManager displayManager;
        zzabs zzabsVar;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            zzabsVar = null;
        } else {
            zzabsVar = new zzabs(this, displayManager);
        }
        this.zzb = zzabsVar;
        this.zzc = zzabsVar != null ? zzabt.zza() : null;
        this.zzk = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzabu zzabuVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzabuVar.zzk = refreshRate;
            zzabuVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzfk.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzabuVar.zzk = C.TIME_UNSET;
            zzabuVar.zzl = C.TIME_UNSET;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzgd.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE && this.zzh != 0.0f) {
            this.zzh = 0.0f;
            zzabr.zza(surface, 0.0f);
        }
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        float f9;
        if (zzgd.zza >= 30 && this.zze != null) {
            if (this.zza.zzg()) {
                f9 = this.zza.zza();
            } else {
                f9 = this.zzf;
            }
            float f10 = this.zzg;
            if (f9 != f10) {
                if (f9 != -1.0f && f10 != -1.0f) {
                    float f11 = 1.0f;
                    if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                        f11 = 0.02f;
                    }
                    if (Math.abs(f9 - this.zzg) < f11) {
                        return;
                    }
                } else if (f9 == -1.0f && this.zza.zzb() < 30) {
                    return;
                }
                this.zzg = f9;
                zzn(false);
            }
        }
    }

    private final void zzn(boolean z8) {
        Surface surface;
        if (zzgd.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE) {
            float f9 = 0.0f;
            if (this.zzd) {
                float f10 = this.zzg;
                if (f10 != -1.0f) {
                    f9 = this.zzi * f10;
                }
            }
            if (z8 || this.zzh != f9) {
                this.zzh = f9;
                zzabr.zza(surface, f9);
            }
        }
    }

    public final long zza(long j7) {
        long j9;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j10 = this.zzq + (((float) ((this.zzm - this.zzp) * zzc)) / this.zzi);
            if (Math.abs(j7 - j10) > 20000000) {
                zzl();
            } else {
                j7 = j10;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j7;
        zzabt zzabtVar = this.zzc;
        if (zzabtVar != null && this.zzk != C.TIME_UNSET) {
            long j11 = zzabtVar.zza;
            if (j11 != C.TIME_UNSET) {
                long j12 = this.zzk;
                long j13 = (((j7 - j11) / j12) * j12) + j11;
                if (j7 <= j13) {
                    j9 = j13 - j12;
                } else {
                    j9 = j13;
                    j13 = j12 + j13;
                }
                long j14 = this.zzl;
                if (j13 - j7 >= j7 - j9) {
                    j13 = j9;
                }
                return j13 - j14;
            }
        }
        return j7;
    }

    public final void zzc(float f9) {
        this.zzf = f9;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j7) {
        long j9 = this.zzn;
        if (j9 != -1) {
            this.zzp = j9;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j7 * 1000);
        zzm();
    }

    public final void zze(float f9) {
        this.zzi = f9;
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
            zzabt zzabtVar = this.zzc;
            zzabtVar.getClass();
            zzabtVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzabs zzabsVar = this.zzb;
        if (zzabsVar != null) {
            zzabsVar.zzb();
            zzabt zzabtVar = this.zzc;
            zzabtVar.getClass();
            zzabtVar.zzc();
        }
        zzk();
    }

    public final void zzi(@Nullable Surface surface) {
        if (true == (surface instanceof zzabm)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i9) {
        if (this.zzj == i9) {
            return;
        }
        this.zzj = i9;
        zzn(true);
    }
}
