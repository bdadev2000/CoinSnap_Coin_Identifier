package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Class<?> cls = th2.getClass();
        while (!Intrinsics.areEqual(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException rethrow(Throwable e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        throw e2;
    }
}
