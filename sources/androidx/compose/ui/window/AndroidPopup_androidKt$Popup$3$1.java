package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$Popup$3$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f17629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PopupProperties f17630c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f17631f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$3$1(PopupLayout popupLayout, q0.a aVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(0);
        this.f17628a = popupLayout;
        this.f17629b = aVar;
        this.f17630c = popupProperties;
        this.d = str;
        this.f17631f = layoutDirection;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f17628a.k(this.f17629b, this.f17630c, this.d, this.f17631f);
        return b0.f30125a;
    }
}
