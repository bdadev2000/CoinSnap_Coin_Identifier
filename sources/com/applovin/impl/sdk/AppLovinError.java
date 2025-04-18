package com.applovin.impl.sdk;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7533b;

    public AppLovinError(int i10, @Nullable String str) {
        this.a = i10;
        this.f7533b = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public int getCode() {
        return this.a;
    }

    @Nullable
    public String getMessage() {
        return this.f7533b;
    }

    public int hashCode() {
        int code = getCode() + 59;
        String message = getMessage();
        return (code * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
