package com.glority.widget.uitls;

import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextSizeUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1", f = "TextSizeUtils.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class TextSizeUtils$autoSizeAndUnify$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $lineCount;
    final /* synthetic */ List $list;
    final /* synthetic */ float $minSize;
    final /* synthetic */ List $textSize;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSizeUtils$autoSizeAndUnify$1(List list, List list2, int i, float f, Continuation continuation) {
        super(2, continuation);
        this.$list = list;
        this.$textSize = list2;
        this.$lineCount = i;
        this.$minSize = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new TextSizeUtils$autoSizeAndUnify$1(this.$list, this.$textSize, this.$lineCount, this.$minSize, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextSizeUtils$autoSizeAndUnify$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0049 -> B:5:0x004c). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r7.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r7.L$0
            java.util.Iterator r3 = (java.util.Iterator) r3
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4c
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.List r8 = r7.$list
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r3 = r8
        L2b:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L50
            java.lang.Object r8 = r3.next()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.util.List r1 = r7.$textSize
            com.glority.widget.uitls.TextSizeUtils r4 = com.glority.widget.uitls.TextSizeUtils.INSTANCE
            int r5 = r7.$lineCount
            float r6 = r7.$minSize
            r7.L$0 = r3
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = r4.autoSizeSync(r8, r5, r6, r7)
            if (r8 != r0) goto L4c
            return r0
        L4c:
            r1.add(r8)
            goto L2b
        L50:
            java.util.List r8 = r7.$textSize
            int r0 = r8.size()
            if (r0 <= r2) goto L62
            com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1$invokeSuspend$$inlined$sortBy$1 r0 = new com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1$invokeSuspend$$inlined$sortBy$1
            r0.<init>()
            java.util.Comparator r0 = (java.util.Comparator) r0
            kotlin.collections.CollectionsKt.sortWith(r8, r0)
        L62:
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.MainScope()
            com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1$3 r8 = new com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1$3
            r0 = 0
            r8.<init>(r0)
            r4 = r8
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextSizeUtils.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1$3", f = "TextSizeUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.widget.uitls.TextSizeUtils$autoSizeAndUnify$1$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass3(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (TextView textView : TextSizeUtils$autoSizeAndUnify$1.this.$list) {
                Float f = (Float) CollectionsKt.firstOrNull(TextSizeUtils$autoSizeAndUnify$1.this.$textSize);
                textView.setTextSize(0, f != null ? f.floatValue() : textView.getTextSize());
            }
            return Unit.INSTANCE;
        }
    }
}
