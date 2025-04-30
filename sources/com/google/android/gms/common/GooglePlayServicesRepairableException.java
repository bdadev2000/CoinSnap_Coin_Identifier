package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i9, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.zza = i9;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
