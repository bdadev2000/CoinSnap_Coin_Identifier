package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes3.dex */
final class zzcr extends zzr {
    final /* synthetic */ BaseImplementation.ResultHolder zza;

    public zzcr(BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}
