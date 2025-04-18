package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzaat {
    private final zzaac zza = new zzaac();

    @Nullable
    private final zzaar zzb;

    @Nullable
    private final zzaas zzc;
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

    public zzaat(@Nullable Context context) {
        DisplayManager displayManager;
        zzaar zzaarVar;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            zzaarVar = null;
        } else {
            zzaarVar = new zzaar(this, displayManager);
        }
        this.zzb = zzaarVar;
        this.zzc = zzaarVar != null ? zzaas.zza() : null;
        this.zzk = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaat zzaatVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzaatVar.zzk = refreshRate;
            zzaatVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzdt.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzaatVar.zzk = C.TIME_UNSET;
            zzaatVar.zzl = C.TIME_UNSET;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzen.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE && this.zzh != 0.0f) {
            this.zzh = 0.0f;
            zzaaq.zza(surface, 0.0f);
        }
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (java.lang.Math.abs(r0 - r9.zzg) >= r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r9.zza.zzb() >= 30) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzm() {
        /*
            r9 = this;
            int r0 = com.google.android.gms.internal.ads.zzen.zza
            r1 = 30
            if (r0 < r1) goto L6a
            android.view.Surface r0 = r9.zze
            if (r0 != 0) goto Lb
            goto L6a
        Lb:
            com.google.android.gms.internal.ads.zzaac r0 = r9.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzaac r0 = r9.zza
            float r0 = r0.zza()
            goto L1c
        L1a:
            float r0 = r9.zzf
        L1c:
            float r2 = r9.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 == 0) goto L6a
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L57
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.zzaac r1 = r9.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4a
            com.google.android.gms.internal.ads.zzaac r1 = r9.zza
            long r3 = r1.zzd()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L4a
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4a:
            float r1 = r9.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L62
            goto L63
        L57:
            if (r4 != 0) goto L65
            com.google.android.gms.internal.ads.zzaac r2 = r9.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L62
            goto L63
        L62:
            r5 = r6
        L63:
            if (r5 == 0) goto L6a
        L65:
            r9.zzg = r0
            r9.zzn(r6)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaat.zzm():void");
    }

    private final void zzn(boolean z10) {
        Surface surface;
        if (zzen.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE) {
            float f10 = 0.0f;
            if (this.zzd) {
                float f11 = this.zzg;
                if (f11 != -1.0f) {
                    f10 = this.zzi * f11;
                }
            }
            if (z10 || this.zzh != f10) {
                this.zzh = f10;
                zzaaq.zza(surface, f10);
            }
        }
    }

    public final long zza(long j3) {
        long j10;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j11 = this.zzq + (((float) ((this.zzm - this.zzp) * zzc)) / this.zzi);
            if (Math.abs(j3 - j11) > 20000000) {
                zzl();
            } else {
                j3 = j11;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j3;
        zzaas zzaasVar = this.zzc;
        if (zzaasVar != null && this.zzk != C.TIME_UNSET) {
            long j12 = zzaasVar.zza;
            if (j12 != C.TIME_UNSET) {
                long j13 = this.zzk;
                long j14 = (((j3 - j12) / j13) * j13) + j12;
                if (j3 <= j14) {
                    j10 = j14 - j13;
                } else {
                    j10 = j14;
                    j14 = j13 + j14;
                }
                long j15 = this.zzl;
                if (j14 - j3 >= j3 - j10) {
                    j14 = j10;
                }
                return j14 - j15;
            }
        }
        return j3;
    }

    public final void zzc(float f10) {
        this.zzf = f10;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j3) {
        long j10 = this.zzn;
        if (j10 != -1) {
            this.zzp = j10;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j3 * 1000);
        zzm();
    }

    public final void zze(float f10) {
        this.zzi = f10;
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
            zzaas zzaasVar = this.zzc;
            zzaasVar.getClass();
            zzaasVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzaar zzaarVar = this.zzb;
        if (zzaarVar != null) {
            zzaarVar.zzb();
            zzaas zzaasVar = this.zzc;
            zzaasVar.getClass();
            zzaasVar.zzc();
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

    public final void zzj(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzn(true);
    }
}
