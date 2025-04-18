package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class zzaav extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaat zzd;
    private boolean zze;

    public /* synthetic */ zzaav(zzaat zzaatVar, SurfaceTexture surfaceTexture, boolean z2, zzaau zzaauVar) {
        super(surfaceTexture);
        this.zzd = zzaatVar;
        this.zza = z2;
    }

    public static zzaav zza(Context context, boolean z2) {
        boolean z3 = true;
        if (z2 && !zzb(context)) {
            z3 = false;
        }
        zzdi.zzf(z3);
        return new zzaat().zza(z2 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i2;
        synchronized (zzaav.class) {
            try {
                if (!zzc) {
                    zzb = zzdr.zzb(context) ? zzdr.zzc() ? 1 : 2 : 0;
                    zzc = true;
                }
                i2 = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2 != 0;
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
