package q;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class S0 {
    @Nullable
    public static OnBackInvokedDispatcher a(@NonNull View view) {
        return view.findOnBackInvokedDispatcher();
    }

    @NonNull
    public static OnBackInvokedCallback b(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new M3.d(runnable, 3);
    }

    public static void c(@NonNull Object obj, @NonNull Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void d(@NonNull Object obj, @NonNull Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
