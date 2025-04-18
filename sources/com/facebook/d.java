package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {
    public final SharedPreferences a;

    public d() {
        SharedPreferences sharedPreferences = x.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        c tokenCachingStrategyFactory = new c(0);
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.a = sharedPreferences;
    }
}
