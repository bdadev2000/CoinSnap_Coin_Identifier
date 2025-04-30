package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfz implements zzfb {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfz(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzfy zzfyVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfyVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzfy zzm() {
        zzfy zzfyVar;
        List list = zza;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    zzfyVar = new zzfy(null);
                } else {
                    zzfyVar = (zzfy) list.remove(list.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final zzfa zzb(int i9) {
        Handler handler = this.zzb;
        zzfy zzm = zzm();
        zzm.zzb(handler.obtainMessage(i9), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final zzfa zzc(int i9, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfy zzm = zzm();
        zzm.zzb(handler.obtainMessage(i9, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final zzfa zzd(int i9, int i10, int i11) {
        Handler handler = this.zzb;
        zzfy zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i10, i11), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final void zze(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final void zzf(int i9) {
        this.zzb.removeMessages(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzg(int i9) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzi(int i9) {
        return this.zzb.sendEmptyMessage(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzj(int i9, long j7) {
        return this.zzb.sendEmptyMessageAtTime(2, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzfb
    public final boolean zzk(zzfa zzfaVar) {
        return ((zzfy) zzfaVar).zzc(this.zzb);
    }
}
