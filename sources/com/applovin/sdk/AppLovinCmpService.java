package com.applovin.sdk;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface AppLovinCmpService {

    /* loaded from: classes.dex */
    public interface OnCompletedListener {
        void onCompleted(@Nullable AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(@NonNull Activity activity, @NonNull OnCompletedListener onCompletedListener);
}
