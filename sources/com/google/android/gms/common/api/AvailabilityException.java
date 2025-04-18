package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import r.b;
import r.h;

/* loaded from: classes3.dex */
public class AvailabilityException extends Exception {
    private final b zaa;

    public AvailabilityException(@NonNull b bVar) {
        this.zaa = bVar;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        b bVar = this.zaa;
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        Object orDefault = bVar.getOrDefault(apiKey, null);
        Preconditions.checkArgument(orDefault != null, e.f("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((h) this.zaa.keySet()).iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
            z10 &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        b bVar = this.zaa;
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        Object orDefault = bVar.getOrDefault(apiKey, null);
        Preconditions.checkArgument(orDefault != null, e.f("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }
}
