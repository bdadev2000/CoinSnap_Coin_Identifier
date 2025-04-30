package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzxj extends zzdc {
    private static final Object zzc = new Object();
    private static final zzbu zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;

    @Nullable
    private final zzbu zzh;

    @Nullable
    private final zzbk zzi;

    static {
        zzaw zzawVar = new zzaw();
        zzawVar.zza("SinglePeriodTimeline");
        zzawVar.zzb(Uri.EMPTY);
        zzd = zzawVar.zzc();
    }

    public zzxj(long j7, long j9, long j10, long j11, long j12, long j13, long j14, boolean z8, boolean z9, boolean z10, @Nullable Object obj, zzbu zzbuVar, @Nullable zzbk zzbkVar) {
        this.zze = j11;
        this.zzf = j12;
        this.zzg = z8;
        zzbuVar.getClass();
        this.zzh = zzbuVar;
        this.zzi = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        if (zzc.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i9, zzcz zzczVar, boolean z8) {
        Object obj;
        zzeq.zza(i9, 0, 1);
        if (z8) {
            obj = zzc;
        } else {
            obj = null;
        }
        zzczVar.zzl(null, obj, 0, this.zze, 0L, zzd.zza, false);
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i9, zzdb zzdbVar, long j7) {
        zzeq.zza(i9, 0, 1);
        Object obj = zzdb.zza;
        zzbu zzbuVar = this.zzh;
        long j9 = this.zzf;
        zzdbVar.zza(obj, zzbuVar, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.zzg, false, this.zzi, 0L, j9, 0, 0, 0L);
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i9) {
        zzeq.zza(i9, 0, 1);
        return zzc;
    }
}
