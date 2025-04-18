package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntSize;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17651a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1(PopupLayout popupLayout) {
        super(1);
        this.f17651a = popupLayout;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        IntSize intSize = new IntSize(((IntSize) obj).f17493a);
        PopupLayout popupLayout = this.f17651a;
        popupLayout.m6setPopupContentSizefhxjrPA(intSize);
        popupLayout.n();
        return b0.f30125a;
    }
}
