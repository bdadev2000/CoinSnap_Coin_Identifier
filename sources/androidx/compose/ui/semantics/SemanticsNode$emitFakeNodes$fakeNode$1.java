package androidx.compose.ui.semantics;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SemanticsNode$emitFakeNodes$fakeNode$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Role f16824a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsNode$emitFakeNodes$fakeNode$1(Role role) {
        super(1);
        this.f16824a = role;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.r((SemanticsPropertyReceiver) obj, this.f16824a.f16789a);
        return b0.f30125a;
    }
}
