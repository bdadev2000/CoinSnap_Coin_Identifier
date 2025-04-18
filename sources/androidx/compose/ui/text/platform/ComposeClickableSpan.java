package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;

/* loaded from: classes4.dex */
final class ComposeClickableSpan extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final LinkAnnotation f17425a;

    public ComposeClickableSpan(LinkAnnotation linkAnnotation) {
        this.f17425a = linkAnnotation;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        LinkInteractionListener a2 = this.f17425a.a();
        if (a2 != null) {
            a2.a();
        }
    }
}
