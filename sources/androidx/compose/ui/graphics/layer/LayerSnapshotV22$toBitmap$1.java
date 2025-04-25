package androidx.compose.ui.graphics.layer;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LayerSnapshot.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {231}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"})
/* loaded from: classes8.dex */
public final class LayerSnapshotV22$toBitmap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LayerSnapshotV22 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerSnapshotV22$toBitmap$1(LayerSnapshotV22 layerSnapshotV22, Continuation<? super LayerSnapshotV22$toBitmap$1> continuation) {
        super(continuation);
        this.this$0 = layerSnapshotV22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toBitmap(null, this);
    }
}
