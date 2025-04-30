package com.applovin.sdk;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface AppLovinTermsFlowSettings {
    @Nullable
    Uri getPrivacyPolicyUri();

    @Nullable
    Uri getTermsOfServiceUri();

    boolean isEnabled();

    void setEnabled(boolean z8);

    void setPrivacyPolicyUri(Uri uri);

    void setTermsOfServiceUri(Uri uri);
}
