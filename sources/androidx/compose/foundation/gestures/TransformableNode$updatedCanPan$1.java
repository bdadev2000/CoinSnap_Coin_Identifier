package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class TransformableNode$updatedCanPan$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransformableNode f3632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableNode$updatedCanPan$1(TransformableNode transformableNode) {
        super(1);
        this.f3632a = transformableNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return (Boolean) this.f3632a.f3610r.invoke(new Offset(((Offset) obj).f14913a));
    }
}
