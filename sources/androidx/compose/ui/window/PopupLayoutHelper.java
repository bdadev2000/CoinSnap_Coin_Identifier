package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public interface PopupLayoutHelper {
    void a(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams);

    void b(Rect rect, View view);

    void c(View view, int i2, int i3);
}
