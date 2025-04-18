package androidx.core.graphics.drawable;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    public final void a(Rect rect) {
        Gravity.apply(0, 0, 0, rect, null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f18564a) {
            a(getBounds());
            throw null;
        }
        outline.setRoundRect(null, 0.0f);
    }
}
