package androidx.compose.ui.window;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 f17693a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        PopupLayout popupLayout = (PopupLayout) obj;
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.n();
        }
        return b0.f30125a;
    }
}
