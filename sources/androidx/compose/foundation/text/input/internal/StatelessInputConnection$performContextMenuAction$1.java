package androidx.compose.foundation.text.input.internal;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class StatelessInputConnection$performContextMenuAction$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatelessInputConnection f6495a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$performContextMenuAction$1(StatelessInputConnection statelessInputConnection) {
        super(1);
        this.f6495a = statelessInputConnection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((EditingBuffer) obj).h(0, this.f6495a.f6483a.a().f6297a.length());
        return b0.f30125a;
    }
}
