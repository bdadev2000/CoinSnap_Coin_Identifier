package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidPopup_androidKt$Popup$7$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$7$1(PopupLayout popupLayout) {
        super(1);
        this.f17638a = popupLayout;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutCoordinates a02 = ((LayoutCoordinates) obj).a0();
        p0.a.p(a02);
        this.f17638a.m(a02);
        return b0.f30125a;
    }
}
