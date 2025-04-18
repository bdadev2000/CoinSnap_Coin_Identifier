package com.vungle.ads.internal.util;

import android.util.Log;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class u {
    private u() {
    }

    public /* synthetic */ u(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public final int d(String tag, String message) {
        boolean z10;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z10 = v.enabled;
        if (!z10) {
            return -1;
        }
        return Log.d(tag, eraseSensitiveData(message));
    }

    @JvmStatic
    public final int e(String tag, String message) {
        boolean z10;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z10 = v.enabled;
        if (z10) {
            return Log.e(tag, eraseSensitiveData(message));
        }
        return -1;
    }

    public final void enable(boolean z10) {
        v.enabled = z10;
    }

    public final String eraseSensitiveData(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Pattern compile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
        return new Regex(compile).replace(str, "xxx.xxx.xxx.xxx");
    }

    @JvmStatic
    public final int w(String tag, String message) {
        boolean z10;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z10 = v.enabled;
        if (z10) {
            return Log.w(tag, eraseSensitiveData(message));
        }
        return -1;
    }

    @JvmStatic
    public final int e(String tag, String message, Throwable throwable) {
        boolean z10;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z10 = v.enabled;
        if (!z10) {
            return -1;
        }
        return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
    }

    @JvmStatic
    public final int w(String tag, String message, Throwable throwable) {
        boolean z10;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z10 = v.enabled;
        if (!z10) {
            return -1;
        }
        return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
    }
}
