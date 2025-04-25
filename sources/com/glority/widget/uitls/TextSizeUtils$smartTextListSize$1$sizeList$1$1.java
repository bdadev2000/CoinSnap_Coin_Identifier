package com.glority.widget.uitls;

import android.widget.TextView;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextSizeUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.widget.uitls.TextSizeUtils$smartTextListSize$1$sizeList$1$1", f = "TextSizeUtils.kt", i = {}, l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class TextSizeUtils$smartTextListSize$1$sizeList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
    final /* synthetic */ TextView $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSizeUtils$smartTextListSize$1$sizeList$1$1(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.$it = textView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new TextSizeUtils$smartTextListSize$1$sizeList$1$1(this.$it, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Float> continuation) {
        return ((TextSizeUtils$smartTextListSize$1$sizeList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TextSizeUtils textSizeUtils = TextSizeUtils.INSTANCE;
            TextView textView = this.$it;
            this.label = 1;
            obj = textSizeUtils.smartTextSize(textView, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
