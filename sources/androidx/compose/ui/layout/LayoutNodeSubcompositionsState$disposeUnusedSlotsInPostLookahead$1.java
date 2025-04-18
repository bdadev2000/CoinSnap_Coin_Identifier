package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeLayoutState;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState f15788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        super(1);
        this.f15788a = layoutNodeSubcompositionsState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean z2;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) entry.getValue();
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f15788a;
        int k2 = layoutNodeSubcompositionsState.f15762n.k(key);
        if (k2 < 0 || k2 >= layoutNodeSubcompositionsState.f15754f) {
            precomposedSlotHandle.dispose();
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
