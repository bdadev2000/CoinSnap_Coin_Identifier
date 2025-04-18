package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f14906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14907c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(int i2, FocusTargetNode focusTargetNode, Rect rect, l lVar) {
        super(1);
        this.f14905a = focusTargetNode;
        this.f14906b = rect;
        this.f14907c = i2;
        this.d = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope = (BeyondBoundsLayout.BeyondBoundsScope) obj;
        Boolean valueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.i(this.f14907c, this.f14905a, this.f14906b, this.d));
        if (valueOf.booleanValue() || !beyondBoundsScope.a()) {
            return valueOf;
        }
        return null;
    }
}
