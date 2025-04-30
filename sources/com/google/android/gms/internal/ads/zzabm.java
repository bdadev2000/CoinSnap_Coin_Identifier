package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class zzabm extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabk zzd;
    private boolean zze;

    public /* synthetic */ zzabm(zzabk zzabkVar, SurfaceTexture surfaceTexture, boolean z8, zzabl zzablVar) {
        super(surfaceTexture);
        this.zzd = zzabkVar;
        this.zza = z8;
    }

    public static zzabm zza(Context context, boolean z8) {
        int i9 = 0;
        boolean z9 = true;
        if (z8 && !zzb(context)) {
            z9 = false;
        }
        zzeq.zzf(z9);
        zzabk zzabkVar = new zzabk();
        if (z8) {
            i9 = zzb;
        }
        return zzabkVar.zza(i9);
    }

    public static synchronized boolean zzb(Context context) {
        int i9;
        int i10;
        synchronized (zzabm.class) {
            try {
                if (!zzc) {
                    if (zzez.zzb(context)) {
                        if (zzez.zzc()) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 0;
                    }
                    zzb = i10;
                    zzc = true;
                }
                i9 = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i9 == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            try {
                if (!this.zze) {
                    this.zzd.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
