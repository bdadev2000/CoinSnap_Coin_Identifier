package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;

/* loaded from: classes2.dex */
final class zzax extends zzaj {
    private BaseImplementation.ResultHolder<Status> zza;

    public zzax(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zza = resultHolder;
    }

    private final void zze(int i9) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(LocationStatusCodes.zzb(LocationStatusCodes.zza(i9)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i9, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i9, String[] strArr) {
        zze(i9);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i9, PendingIntent pendingIntent) {
        zze(i9);
    }
}
