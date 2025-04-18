package androidx.core.view;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import e0.p;
import y0.n;

/* loaded from: classes3.dex */
public final class ViewKt {
    public static final p a(View view) {
        return new p(new ViewKt$allViews$1(view, null), 3);
    }

    public static final y0.j b(AbstractComposeView abstractComposeView) {
        return n.J(abstractComposeView.getParent(), ViewKt$ancestors$1.f18763a);
    }
}
