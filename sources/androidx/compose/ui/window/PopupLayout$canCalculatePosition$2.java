package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PopupLayout$canCalculatePosition$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17696a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.f17696a = popupLayout;
    }

    @Override // q0.a
    public final Object invoke() {
        LayoutCoordinates parentLayoutCoordinates;
        PopupLayout popupLayout = this.f17696a;
        parentLayoutCoordinates = popupLayout.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.B()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || popupLayout.m5getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
