package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface ConsumeResponseListener {
    void onConsumeResponse(@NonNull BillingResult billingResult, @NonNull String str);
}
