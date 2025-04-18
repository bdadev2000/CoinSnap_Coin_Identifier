package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzei implements zzdm {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzei(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzeg zzegVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzegVar);
            }
        }
    }

    private static zzeg zzm() {
        zzeg zzegVar;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzegVar = new zzeg(null);
            } else {
                zzegVar = (zzeg) list.remove(list.size() - 1);
            }
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdl zzb(int i10) {
        Handler handler = this.zzb;
        zzeg zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdl zzc(int i10, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzeg zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdl zzd(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzeg zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i11, i12), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final void zze(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final void zzf(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzj(int i10, long j3) {
        return this.zzb.sendEmptyMessageAtTime(2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final boolean zzk(zzdl zzdlVar) {
        return ((zzeg) zzdlVar).zzc(this.zzb);
    }
}
