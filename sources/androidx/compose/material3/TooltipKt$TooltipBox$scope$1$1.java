package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class TooltipKt$TooltipBox$scope$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f12550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$scope$1$1(MutableState mutableState) {
        super(0);
        this.f12550a = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        return (LayoutCoordinates) this.f12550a.getValue();
    }
}
