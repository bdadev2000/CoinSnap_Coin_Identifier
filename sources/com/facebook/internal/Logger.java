package com.facebook.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* loaded from: classes2.dex */
public final class Logger {

    @NotNull
    public static final String LOG_TAG_BASE = "FacebookSDK.";

    @NotNull
    private final LoggingBehavior behavior;

    @NotNull
    private StringBuilder contents;
    private int priority;

    @NotNull
    private final String tag;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final HashMap<String, String> stringsToReplace = new HashMap<>();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String replaceStrings(String str) {
            for (Map.Entry entry : Logger.stringsToReplace.entrySet()) {
                str = m.k1(str, (String) entry.getKey(), (String) entry.getValue());
            }
            return str;
        }

        public final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2) {
            p0.a.s(loggingBehavior, "behavior");
            p0.a.s(str, "tag");
            p0.a.s(str2, "string");
            log(loggingBehavior, 3, str, str2);
        }

        public final synchronized void registerAccessToken(@NotNull String str) {
            p0.a.s(str, SDKConstants.PARAM_ACCESS_TOKEN);
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void registerStringToReplace(@NotNull String str, @NotNull String str2) {
            p0.a.s(str, "original");
            p0.a.s(str2, "replace");
            Logger.stringsToReplace.put(str, str2);
        }

        public final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            p0.a.s(loggingBehavior, "behavior");
            p0.a.s(str, "tag");
            p0.a.s(str2, "format");
            p0.a.s(objArr, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                log(loggingBehavior, 3, str, androidx.compose.foundation.text.input.a.o(copyOf, copyOf.length, str2, "java.lang.String.format(format, *args)"));
            }
        }

        public final void log(@NotNull LoggingBehavior loggingBehavior, int i2, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
            p0.a.s(loggingBehavior, "behavior");
            p0.a.s(str, "tag");
            p0.a.s(str2, "format");
            p0.a.s(objArr, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                log(loggingBehavior, i2, str, androidx.compose.foundation.text.input.a.o(copyOf, copyOf.length, str2, "java.lang.String.format(format, *args)"));
            }
        }

        public final void log(@NotNull LoggingBehavior loggingBehavior, int i2, @NotNull String str, @NotNull String str2) {
            p0.a.s(loggingBehavior, "behavior");
            p0.a.s(str, "tag");
            p0.a.s(str2, "string");
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                String replaceStrings = replaceStrings(str2);
                if (!m.q1(str, Logger.LOG_TAG_BASE, false)) {
                    str = p0.a.z0(str, Logger.LOG_TAG_BASE);
                }
                Log.println(i2, str, replaceStrings);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }
    }

    public Logger(@NotNull LoggingBehavior loggingBehavior, @NotNull String str) {
        p0.a.s(loggingBehavior, "behavior");
        p0.a.s(str, "tag");
        this.priority = 3;
        this.behavior = loggingBehavior;
        this.tag = p0.a.z0(Validate.notNullOrEmpty(str, "tag"), LOG_TAG_BASE);
        this.contents = new StringBuilder();
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, int i2, @NotNull String str, @NotNull String str2) {
        Companion.log(loggingBehavior, i2, str, str2);
    }

    public static final synchronized void registerAccessToken(@NotNull String str) {
        synchronized (Logger.class) {
            Companion.registerAccessToken(str);
        }
    }

    public static final synchronized void registerStringToReplace(@NotNull String str, @NotNull String str2) {
        synchronized (Logger.class) {
            Companion.registerStringToReplace(str, str2);
        }
    }

    private final boolean shouldLog() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    public final void append(@NotNull StringBuilder sb) {
        p0.a.s(sb, "stringBuilder");
        if (shouldLog()) {
            this.contents.append((CharSequence) sb);
        }
    }

    public final void appendKeyValue(@NotNull String str, @NotNull Object obj) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(obj, "value");
        append("  %s:\t%s\n", str, obj);
    }

    @NotNull
    public final String getContents() {
        Companion companion = Companion;
        String sb = this.contents.toString();
        p0.a.r(sb, "contents.toString()");
        return companion.replaceStrings(sb);
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void logString(@NotNull String str) {
        p0.a.s(str, "string");
        Companion.log(this.behavior, this.priority, this.tag, str);
    }

    public final void setPriority(int i2) {
        Validate validate = Validate.INSTANCE;
        Validate.oneOf(Integer.valueOf(i2), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i2);
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, int i2, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        Companion.log(loggingBehavior, i2, str, str2, objArr);
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2) {
        Companion.log(loggingBehavior, str, str2);
    }

    public final void append(@NotNull String str) {
        p0.a.s(str, "string");
        if (shouldLog()) {
            this.contents.append(str);
        }
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        Companion.log(loggingBehavior, str, str2, objArr);
    }

    public final void append(@NotNull String str, @NotNull Object... objArr) {
        p0.a.s(str, "format");
        p0.a.s(objArr, "args");
        if (shouldLog()) {
            StringBuilder sb = this.contents;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            p0.a.r(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }

    public final void log() {
        String sb = this.contents.toString();
        p0.a.r(sb, "contents.toString()");
        logString(sb);
        this.contents = new StringBuilder();
    }
}
