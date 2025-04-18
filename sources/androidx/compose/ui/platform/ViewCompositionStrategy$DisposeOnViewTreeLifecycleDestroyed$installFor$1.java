package androidx.compose.ui.platform;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f16613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 f16614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1) {
        super(0);
        this.f16613a = abstractComposeView;
        this.f16614b = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f16613a.removeOnAttachStateChangeListener(this.f16614b);
        return b0.f30125a;
    }
}
