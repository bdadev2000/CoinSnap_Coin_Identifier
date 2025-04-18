package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzby {
    public zzby(JSONObject jSONObject) throws JSONException {
        jSONObject.getInt("commitmentPaymentsCount");
        jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
