package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AlternativeBillingOnlyReportingDetails {
    private final String zza;

    public AlternativeBillingOnlyReportingDetails(String str) throws JSONException {
        this.zza = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.zza;
    }
}
