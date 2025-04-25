package com.glority.widget.uitls;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextSizeUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.widget.uitls.TextSizeUtils$smartTextListSize$1", f = "TextSizeUtils.kt", i = {0}, l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class TextSizeUtils$smartTextListSize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List $textViews;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSizeUtils$smartTextListSize$1(List list, Continuation continuation) {
        super(2, continuation);
        this.$textViews = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        TextSizeUtils$smartTextListSize$1 textSizeUtils$smartTextListSize$1 = new TextSizeUtils$smartTextListSize$1(this.$textViews, completion);
        textSizeUtils$smartTextListSize$1.L$0 = obj;
        return textSizeUtils$smartTextListSize$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextSizeUtils$smartTextListSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0092 -> B:5:0x0093). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.uitls.TextSizeUtils$smartTextListSize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
