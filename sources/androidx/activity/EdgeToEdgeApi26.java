package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class EdgeToEdgeApi26 implements EdgeToEdgeImpl {
    @DoNotInline
    public void a(@NotNull SystemBarStyle systemBarStyle, @NotNull SystemBarStyle systemBarStyle2, @NotNull Window window, @NotNull View view, boolean z2, boolean z3) {
        p0.a.s(systemBarStyle, "statusBarStyle");
        p0.a.s(systemBarStyle2, "navigationBarStyle");
        p0.a.s(window, "window");
        p0.a.s(view, ViewHierarchyConstants.VIEW_KEY);
        WindowCompat.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(view, window);
        windowInsetsControllerCompat.f(!z2);
        windowInsetsControllerCompat.e(!z3);
    }
}
