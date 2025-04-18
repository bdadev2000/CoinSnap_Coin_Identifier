package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface AlternativeBillingOnlyReportingDetailsListener {
    void onAlternativeBillingOnlyTokenResponse(@NonNull BillingResult billingResult, @Nullable AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails);
}
