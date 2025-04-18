package androidx.compose.ui.node;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$performLookaheadMeasure$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f16050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$performLookaheadMeasure$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j2) {
        super(0);
        this.f16050a = layoutNodeLayoutDelegate;
        this.f16051b = j2;
    }

    @Override // q0.a
    public final Object invoke() {
        LookaheadDelegate h12 = this.f16050a.a().h1();
        p0.a.p(h12);
        h12.V(this.f16051b);
        return b0.f30125a;
    }
}
