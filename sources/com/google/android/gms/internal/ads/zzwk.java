package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzwk extends zzbv {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;

    @Nullable
    private final zzaw zzf;

    @Nullable
    private final zzaq zzg;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zza("SinglePeriodTimeline");
        zzakVar.zzb(Uri.EMPTY);
        zzakVar.zzc();
    }

    public zzwk(long j3, long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, @Nullable Object obj, zzaw zzawVar, @Nullable zzaq zzaqVar) {
        this.zzc = j12;
        this.zzd = j13;
        this.zze = z10;
        zzawVar.getClass();
        this.zzf = zzawVar;
        this.zzg = zzaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i10, zzbt zzbtVar, boolean z10) {
        Object obj;
        zzdb.zza(i10, 0, 1);
        if (z10) {
            obj = zzb;
        } else {
            obj = null;
        }
        zzbtVar.zzi(null, obj, 0, this.zzc, 0L, zzb.zza, false);
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i10, zzbu zzbuVar, long j3) {
        zzdb.zza(i10, 0, 1);
        Object obj = zzbu.zza;
        zzaw zzawVar = this.zzf;
        long j10 = this.zzd;
        zzbuVar.zza(obj, zzawVar, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.zze, false, this.zzg, 0L, j10, 0, 0, 0L);
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i10) {
        zzdb.zza(i10, 0, 1);
        return zzb;
    }
}
