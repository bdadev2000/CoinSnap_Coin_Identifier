package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public abstract class u3 {
    @Nullable
    public static OnBackInvokedDispatcher a(@NonNull View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        return findOnBackInvokedDispatcher;
    }

    @NonNull
    public static OnBackInvokedCallback b(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new androidx.activity.t(runnable, 1);
    }

    public static void c(@NonNull Object obj, @NonNull Object obj2) {
        androidx.activity.j.m(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, androidx.activity.j.j(obj2));
    }

    public static void d(@NonNull Object obj, @NonNull Object obj2) {
        androidx.activity.j.m(obj).unregisterOnBackInvokedCallback(androidx.activity.j.j(obj2));
    }
}
