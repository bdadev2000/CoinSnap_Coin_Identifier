package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes2.dex */
public final class ViewLayer$Companion$OutlineProvider$1 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        p0.a.q(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        Outline b2 = ((ViewLayer) view).f16629f.b();
        p0.a.p(b2);
        outline.set(b2);
    }
}
