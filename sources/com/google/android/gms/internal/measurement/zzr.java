package com.google.android.gms.internal.measurement;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzr extends zzal {
    private final zzv zzk;

    public zzr(zzv zzvVar) {
        super("internal.logger");
        this.zzk = zzvVar;
        this.zzb.put(CreativeInfo.an, new zzu(this, false, true));
        this.zzb.put("silent", new zzq(this, "silent"));
        ((zzal) this.zzb.get("silent")).zza(CreativeInfo.an, new zzu(this, true, true));
        this.zzb.put("unmonitored", new zzt(this, "unmonitored"));
        ((zzal) this.zzb.get("unmonitored")).zza(CreativeInfo.an, new zzu(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        return zzaq.zzc;
    }
}
