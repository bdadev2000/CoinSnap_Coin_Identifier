package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ForEachGesture.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {LocationRequestCompat.QUALITY_LOW_POWER, 107, StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ CoroutineContext $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForEachGestureKt$awaitEachGesture$2(CoroutineContext coroutineContext, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ForEachGestureKt$awaitEachGesture$2> continuation) {
        super(2, continuation);
        this.$currentContext = coroutineContext;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, continuation);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:8:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0077 -> B:8:0x0029). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L22
            if (r1 != r2) goto L19
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L29
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L33
        L29:
            r8 = r1
            goto L3c
        L2b:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L33
            goto L52
        L33:
            r8 = move-exception
            goto L64
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
        L3c:
            kotlin.coroutines.CoroutineContext r1 = r7.$currentContext
            boolean r1 = kotlinx.coroutines.JobKt.isActive(r1)
            if (r1 == 0) goto L7b
            kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.$block     // Catch: java.util.concurrent.CancellationException -> L60
            r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L60
            r7.label = r4     // Catch: java.util.concurrent.CancellationException -> L60
            java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L60
            if (r1 != r0) goto L51
            return r0
        L51:
            r1 = r8
        L52:
            r8 = r7
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch: java.util.concurrent.CancellationException -> L33
            r7.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L33
            r7.label = r3     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r8 != r0) goto L29
            return r0
        L60:
            r1 = move-exception
            r6 = r1
            r1 = r8
            r8 = r6
        L64:
            kotlin.coroutines.CoroutineContext r5 = r7.$currentContext
            boolean r5 = kotlinx.coroutines.JobKt.isActive(r5)
            if (r5 == 0) goto L7a
            r8 = r7
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r8)
            if (r8 != r0) goto L29
            return r0
        L7a:
            throw r8
        L7b:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
