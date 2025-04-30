package com.applovin.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: classes.dex */
public class AppLovinUserSegment {

    /* renamed from: a, reason: collision with root package name */
    private String f12783a;

    @Deprecated
    public AppLovinUserSegment() {
    }

    @Nullable
    public String getName() {
        return this.f12783a;
    }

    @Deprecated
    public void setName(@Nullable String str) {
        if (str != null) {
            if (str.length() > 32) {
                t.h("AppLovinUserSegment", "Setting name greater than 32 characters: ".concat(str));
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                t.h("AppLovinUserSegment", "Setting name that is not alphanumeric: ".concat(str));
            }
        }
        this.f12783a = str;
    }

    @NonNull
    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + '}';
    }

    public AppLovinUserSegment(String str) {
        this.f12783a = str;
    }
}
