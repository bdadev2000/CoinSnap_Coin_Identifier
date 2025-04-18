package androidx.compose.foundation.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class ToggleableNode$_onClick$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToggleableNode f5380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableNode$_onClick$1(ToggleableNode toggleableNode) {
        super(0);
        this.f5380a = toggleableNode;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f5380a.J.invoke(Boolean.valueOf(!r0.I));
        return b0.f30125a;
    }
}
