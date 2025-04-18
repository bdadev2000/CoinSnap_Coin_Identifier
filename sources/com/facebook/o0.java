package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 {
    public final SharedPreferences a;

    public o0() {
        SharedPreferences sharedPreferences = x.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }
}
