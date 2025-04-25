package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusRequester;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FocusGroupNode.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
/* synthetic */ class FocusGroupPropertiesNode$applyFocusProperties$1 extends FunctionReferenceImpl implements Function1<FocusDirection, FocusRequester> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FocusGroupPropertiesNode$applyFocusProperties$1(Object obj) {
        super(1, obj, FocusGroupPropertiesNode.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
        return m7249invoke3ESFkO8(focusDirection.getValue());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final FocusRequester m7249invoke3ESFkO8(int i) {
        return ((FocusGroupPropertiesNode) this.receiver).m7247onEnter3ESFkO8(i);
    }
}
