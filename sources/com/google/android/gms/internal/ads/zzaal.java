package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class zzaal extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaaj zzd;
    private boolean zze;

    public /* synthetic */ zzaal(zzaaj zzaajVar, SurfaceTexture surfaceTexture, boolean z10, zzaak zzaakVar) {
        super(surfaceTexture);
        this.zzd = zzaajVar;
        this.zza = z10;
    }

    public static zzaal zza(Context context, boolean z10) {
        int i10 = 0;
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzdb.zzf(z11);
        zzaaj zzaajVar = new zzaaj();
        if (z10) {
            i10 = zzb;
        }
        return zzaajVar.zza(i10);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        int i11;
        synchronized (zzaal.class) {
            if (!zzc) {
                if (zzdk.zzb(context)) {
                    if (zzdk.zzc()) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                } else {
                    i11 = 0;
                }
                zzb = i11;
                zzc = true;
            }
            i10 = zzb;
        }
        if (i10 == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
