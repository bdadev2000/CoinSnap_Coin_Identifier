package com.facebook.internal.instrument.threadcheck;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.input.a;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

@RestrictTo
/* loaded from: classes4.dex */
public final class ThreadCheckHandler {

    @NotNull
    public static final ThreadCheckHandler INSTANCE = new ThreadCheckHandler();
    private static final String TAG = ThreadCheckHandler.class.getCanonicalName();
    private static boolean enabled;

    private ThreadCheckHandler() {
    }

    public static final void enable() {
        enabled = true;
    }

    private final void log(String str, Class<?> cls, String str2, String str3) {
        if (enabled) {
            String p2 = a.p(new Object[]{str, cls.getName(), str2, str3, Looper.myLooper(), Looper.getMainLooper()}, 6, Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", "java.lang.String.format(locale, format, *args)");
            Exception exc = new Exception();
            Log.e(TAG, p2, exc);
            InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
            InstrumentData.Builder.build(exc, InstrumentData.Type.ThreadCheck).save();
        }
    }

    public static final void uiThreadViolationDetected(@NotNull Class<?> cls, @NotNull String str, @NotNull String str2) {
        p0.a.s(cls, "clazz");
        p0.a.s(str, "methodName");
        p0.a.s(str2, "methodDesc");
        INSTANCE.log("@UiThread", cls, str, str2);
    }

    public static final void workerThreadViolationDetected(@NotNull Class<?> cls, @NotNull String str, @NotNull String str2) {
        p0.a.s(cls, "clazz");
        p0.a.s(str, "methodName");
        p0.a.s(str2, "methodDesc");
        INSTANCE.log("@WorkerThread", cls, str, str2);
    }
}
