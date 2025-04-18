package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import b1.f0;

@RequiresApi
/* loaded from: classes3.dex */
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public final void c(View view, int i2, int i3) {
        view.setSystemGestureExclusionRects(f0.w(new Rect(0, 0, i2, i3)));
    }
}
