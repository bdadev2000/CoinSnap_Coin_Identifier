package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes2.dex */
public interface ConsentForm {

    /* loaded from: classes2.dex */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(@Nullable FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
