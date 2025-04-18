package androidx.compose.ui.window;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$Popup$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f17633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$4$1(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider) {
        super(1);
        this.f17632a = popupLayout;
        this.f17633b = popupPositionProvider;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PopupLayout popupLayout = this.f17632a;
        popupLayout.setPositionProvider(this.f17633b);
        popupLayout.n();
        return new Object();
    }
}
