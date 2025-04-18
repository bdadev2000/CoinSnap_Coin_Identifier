package com.applovin.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class AppLovinUserSegment {
    private String a;

    @Deprecated
    public AppLovinUserSegment() {
    }

    public AppLovinUserSegment(String str) {
        this.a = str;
    }

    @Nullable
    public String getName() {
        return this.a;
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
        this.a = str;
    }

    @NonNull
    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + AbstractJsonLexerKt.END_OBJ;
    }
}
