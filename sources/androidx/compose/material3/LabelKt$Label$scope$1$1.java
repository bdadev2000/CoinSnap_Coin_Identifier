package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class LabelKt$Label$scope$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f9647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$Label$scope$1$1(f0 f0Var) {
        super(0);
        this.f9647a = f0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        return (LayoutCoordinates) ((MutableState) this.f9647a.f30930a).getValue();
    }
}
