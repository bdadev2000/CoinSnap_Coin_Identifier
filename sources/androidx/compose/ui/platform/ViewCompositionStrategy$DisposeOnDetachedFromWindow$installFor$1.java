package androidx.compose.ui.platform;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f16605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 f16606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1) {
        super(0);
        this.f16605a = abstractComposeView;
        this.f16606b = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f16605a.removeOnAttachStateChangeListener(this.f16606b);
        return b0.f30125a;
    }
}
