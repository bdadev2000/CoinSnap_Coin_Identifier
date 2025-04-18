package androidx.compose.foundation.layout;

import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class FlowLayoutKt$intrinsicCrossAxisSize$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f3932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$intrinsicCrossAxisSize$1(int[] iArr) {
        super(3);
        this.f3932a = iArr;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        return Integer.valueOf(this.f3932a[intValue]);
    }
}
