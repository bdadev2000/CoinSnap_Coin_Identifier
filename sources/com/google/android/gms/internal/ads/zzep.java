package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzep implements zzdt {

    @GuardedBy
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzep(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzeo zzeoVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzeoVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzeo zzm() {
        zzeo zzeoVar;
        List list = zza;
        synchronized (list) {
            try {
                zzeoVar = list.isEmpty() ? new zzeo(null) : (zzeo) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzb(int i2) {
        Handler handler = this.zzb;
        zzeo zzm = zzm();
        zzm.zzb(handler.obtainMessage(i2), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzc(int i2, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzeo zzm = zzm();
        zzm.zzb(handler.obtainMessage(i2, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzd(int i2, int i3, int i4) {
        Handler handler = this.zzb;
        zzeo zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i3, i4), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf(int i2) {
        this.zzb.removeMessages(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzg(int i2) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzi(int i2) {
        return this.zzb.sendEmptyMessage(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzj(int i2, long j2) {
        return this.zzb.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzk(zzds zzdsVar) {
        return ((zzeo) zzdsVar).zzc(this.zzb);
    }
}
