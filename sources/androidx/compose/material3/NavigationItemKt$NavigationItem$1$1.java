package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavigationItemKt$NavigationItem$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f10238a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$NavigationItem$1$1(MutableIntState mutableIntState) {
        super(1);
        this.f10238a = mutableIntState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2 = (int) (((IntSize) obj).f17493a >> 32);
        float f2 = NavigationItemKt.f10235a;
        this.f10238a.b(i2);
        return b0.f30125a;
    }
}
