package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzg {

    @Nullable
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzg(@Nullable QueryInfo queryInfo, String str, long j7, int i9) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j7;
        this.zzd = i9;
    }

    public final int zza() {
        return this.zzd;
    }

    @Nullable
    public final QueryInfo zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zze.set(true);
    }

    public final boolean zze() {
        if (this.zzc <= com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final boolean zzf() {
        return this.zze.get();
    }
}
