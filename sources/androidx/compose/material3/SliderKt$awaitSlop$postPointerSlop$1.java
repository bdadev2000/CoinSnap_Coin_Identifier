package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SliderKt$awaitSlop$postPointerSlop$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f11443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$awaitSlop$postPointerSlop$1(c0 c0Var) {
        super(2);
        this.f11443a = c0Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj2).floatValue();
        ((PointerInputChange) obj).a();
        this.f11443a.f30922a = floatValue;
        return b0.f30125a;
    }
}
