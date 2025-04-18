package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class WindowCompat {

    /* loaded from: classes2.dex */
    public static class Api16Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        @DoNotInline
        public static <T> T a(Window window, int i2) {
            return (T) window.requireViewById(i2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api30Impl {
        @DoNotInline
        public static void a(@NonNull Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }
    }

    public static void a(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
