package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i10) {
        return this.zaa.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int zab(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i10 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int zaa = zaa(context, minApkVersion);
        if (zaa == -1) {
            int i11 = 0;
            while (true) {
                if (i11 < this.zaa.size()) {
                    int keyAt = this.zaa.keyAt(i11);
                    if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                zaa = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
            } else {
                zaa = i10;
            }
            this.zaa.put(minApkVersion, zaa);
        }
        return zaa;
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
