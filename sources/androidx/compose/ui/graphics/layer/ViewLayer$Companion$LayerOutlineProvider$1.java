package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes3.dex */
public final class ViewLayer$Companion$LayerOutlineProvider$1 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).f15259f) == null) {
            return;
        }
        outline.set(outline2);
    }
}
