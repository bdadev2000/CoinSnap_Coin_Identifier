package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyAnimateScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {174, 272}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ int $index;
    final /* synthetic */ int $numOfItemsForTeleport;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(int i, Density density, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3, Continuation<? super LazyAnimateScrollKt$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$density = density;
        this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
        this.$scrollOffset = i2;
        this.$numOfItemsForTeleport = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, continuation);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca A[Catch: ItemFoundInScroll -> 0x01c6, TryCatch #0 {ItemFoundInScroll -> 0x01c6, blocks: (B:20:0x00c6, B:22:0x00ca, B:24:0x00d2, B:31:0x00fb, B:34:0x013b, B:37:0x0148), top: B:19:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: ItemFoundInScroll -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ItemFoundInScroll -> 0x01bc, blocks: (B:17:0x01b3, B:27:0x00e6), top: B:16:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Type inference failed for: r8v19, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01ae -> B:16:0x01b3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i, int i2) {
        if (z) {
            if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() >= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
