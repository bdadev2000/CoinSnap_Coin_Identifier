package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class OneDimensionalFocusSearchKt$generateAndSearchChildren$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14904c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, l lVar) {
        super(1);
        this.f14902a = focusTargetNode;
        this.f14903b = focusTargetNode2;
        this.f14904c = i2;
        this.d = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope = (BeyondBoundsLayout.BeyondBoundsScope) obj;
        Boolean valueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.f(this.f14902a, this.f14903b, this.f14904c, this.d));
        if (valueOf.booleanValue() || !beyondBoundsScope.a()) {
            return valueOf;
        }
        return null;
    }
}
