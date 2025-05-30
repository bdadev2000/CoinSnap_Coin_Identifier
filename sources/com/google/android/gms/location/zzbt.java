package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbt implements BaseImplementation.ResultHolder<LocationSettingsResult> {
    private final TaskCompletionSource<LocationSettingsResponse> zza;

    public zzbt(TaskCompletionSource<LocationSettingsResponse> taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zza.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(LocationSettingsResult locationSettingsResult) {
        LocationSettingsResult locationSettingsResult2 = locationSettingsResult;
        Status status = locationSettingsResult2.getStatus();
        if (status.isSuccess()) {
            this.zza.setResult(new LocationSettingsResponse(locationSettingsResult2));
        } else if (status.hasResolution()) {
            this.zza.setException(new ResolvableApiException(status));
        } else {
            this.zza.setException(new ApiException(status));
        }
    }
}
