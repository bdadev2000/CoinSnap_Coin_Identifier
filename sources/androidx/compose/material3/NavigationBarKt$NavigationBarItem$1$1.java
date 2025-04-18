package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavigationBarKt$NavigationBarItem$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9982a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$1$1(MutableIntState mutableIntState) {
        super(1);
        this.f9982a = mutableIntState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2 = (int) (((IntSize) obj).f17493a >> 32);
        float f2 = NavigationBarKt.f9969a;
        this.f9982a.b(i2);
        return b0.f30125a;
    }
}
