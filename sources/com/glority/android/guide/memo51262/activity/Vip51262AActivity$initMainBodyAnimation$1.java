package com.glority.android.guide.memo51262.activity;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Vip51262AActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.guide.memo51262.activity.Vip51262AActivity$initMainBodyAnimation$1", f = "Vip51262AActivity.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Vip51262AActivity$initMainBodyAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Collection<View> $views;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Vip51262AActivity$initMainBodyAnimation$1(Collection<? extends View> collection, Continuation<? super Vip51262AActivity$initMainBodyAnimation$1> continuation) {
        super(2, continuation);
        this.$views = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Vip51262AActivity$initMainBodyAnimation$1(this.$views, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Vip51262AActivity$initMainBodyAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:7:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r5.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L13
            goto L54
        L13:
            r6 = move-exception
            goto L57
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.ResultKt.throwOnFailure(r6)
            java.util.Collection<android.view.View> r6 = r5.$views
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
        L29:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r1.next()
            android.view.View r6 = (android.view.View) r6
            java.lang.String r3 = "alpha"
            r4 = 2
            float[] r4 = new float[r4]     // Catch: java.lang.Exception -> L13
            r4 = {x0070: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array     // Catch: java.lang.Exception -> L13
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r3, r4)     // Catch: java.lang.Exception -> L13
            r3 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r3)     // Catch: java.lang.Exception -> L13
            r6.start()     // Catch: java.lang.Exception -> L13
            r5.L$0 = r1     // Catch: java.lang.Exception -> L13
            r5.label = r2     // Catch: java.lang.Exception -> L13
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)     // Catch: java.lang.Exception -> L13
            if (r6 != r0) goto L54
            return r0
        L54:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L13
            goto L29
        L57:
            com.glority.android.core.app.AppContext r3 = com.glority.android.core.app.AppContext.INSTANCE
            boolean r3 = r3.isDebugMode()
            if (r3 == 0) goto L29
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.glority.utils.stability.LogUtils.e(r6)
            goto L29
        L6d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.guide.memo51262.activity.Vip51262AActivity$initMainBodyAnimation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
