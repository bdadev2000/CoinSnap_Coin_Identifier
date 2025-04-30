package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import x.b;
import x.i;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
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
        Preconditions.checkArgument(orDefault != null, AbstractC2914a.e("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((i) this.zaa.keySet()).iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
            z8 &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z8) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        b bVar = this.zaa;
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        Object orDefault = bVar.getOrDefault(apiKey, null);
        Preconditions.checkArgument(orDefault != null, AbstractC2914a.e("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }
}
