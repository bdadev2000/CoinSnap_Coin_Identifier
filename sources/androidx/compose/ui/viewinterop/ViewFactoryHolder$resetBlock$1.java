package androidx.compose.ui.viewinterop;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class ViewFactoryHolder$resetBlock$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f17591a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$resetBlock$1(ViewFactoryHolder viewFactoryHolder) {
        super(0);
        this.f17591a = viewFactoryHolder;
    }

    @Override // q0.a
    public final Object invoke() {
        ViewFactoryHolder viewFactoryHolder = this.f17591a;
        viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.f17587y);
        return b0.f30125a;
    }
}
