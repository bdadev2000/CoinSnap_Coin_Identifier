package com.google.android.gms.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Response;

/* loaded from: classes4.dex */
public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse() {
    }

    @Nullable
    public LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }

    public LocationSettingsResponse(@NonNull LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }
}
