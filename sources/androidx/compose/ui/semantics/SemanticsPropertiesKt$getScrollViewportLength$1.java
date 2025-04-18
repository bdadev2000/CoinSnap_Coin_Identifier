package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes2.dex */
final class SemanticsPropertiesKt$getScrollViewportLength$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f16867a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsPropertiesKt$getScrollViewportLength$1(a aVar) {
        super(1);
        this.f16867a = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean z2;
        List list = (List) obj;
        Float f2 = (Float) this.f16867a.invoke();
        if (f2 == null) {
            z2 = false;
        } else {
            list.add(f2);
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
