package com.glority.android.picturexx.view.form;

import com.glority.android.picturexx.adapter.ImageEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConsultFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.form.ConsultFragment$uploadImage$1", f = "ConsultFragment.kt", i = {0, 1}, l = {277, 277}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
public final class ConsultFragment$uploadImage$1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ImageEntity> $list;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ConsultFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultFragment$uploadImage$1(List<ImageEntity> list, ConsultFragment consultFragment, Continuation<? super ConsultFragment$uploadImage$1> continuation) {
        super(2, continuation);
        this.$list = list;
        this.this$0 = consultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConsultFragment$uploadImage$1 consultFragment$uploadImage$1 = new ConsultFragment$uploadImage$1(this.$list, this.this$0, continuation);
        consultFragment$uploadImage$1.L$0 = obj;
        return consultFragment$uploadImage$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
        return ((ConsultFragment$uploadImage$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007b -> B:6:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r8.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r4
            goto L40
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.L$2
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r4 = r8.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L68
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            java.util.List<com.glority.android.picturexx.adapter.ImageEntity> r1 = r8.$list
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r1.next()
            com.glority.android.picturexx.adapter.ImageEntity r4 = (com.glority.android.picturexx.adapter.ImageEntity) r4
            com.glority.android.picturexx.view.form.ConsultFragment r5 = r8.this$0
            android.net.Uri r4 = r4.getUrl()
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r8.L$0 = r9
            r8.L$1 = r1
            r8.L$2 = r9
            r8.label = r3
            java.lang.Object r4 = com.glority.android.picturexx.view.form.ConsultFragment.access$uploadImageFile(r5, r4, r6)
            if (r4 != r0) goto L64
            return r0
        L64:
            r5 = r9
            r9 = r4
            r4 = r1
            r1 = r5
        L68:
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r8.L$0 = r5
            r8.L$1 = r4
            r7 = 0
            r8.L$2 = r7
            r8.label = r2
            java.lang.Object r9 = r1.emit(r9, r6)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            r1 = r4
            r9 = r5
            goto L40
        L7e:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.form.ConsultFragment$uploadImage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
