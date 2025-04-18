package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$Popup$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f17625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PopupProperties f17626c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f17627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$2$1(PopupLayout popupLayout, q0.a aVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(1);
        this.f17624a = popupLayout;
        this.f17625b = aVar;
        this.f17626c = popupProperties;
        this.d = str;
        this.f17627f = layoutDirection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final PopupLayout popupLayout = this.f17624a;
        popupLayout.f17683o.addView(popupLayout, popupLayout.f17684p);
        popupLayout.k(this.f17625b, this.f17626c, this.d, this.f17627f);
        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                PopupLayout popupLayout2 = PopupLayout.this;
                popupLayout2.d();
                popupLayout2.getClass();
                ViewTreeLifecycleOwner.b(popupLayout2, null);
                popupLayout2.f17683o.removeViewImmediate(popupLayout2);
            }
        };
    }
}
