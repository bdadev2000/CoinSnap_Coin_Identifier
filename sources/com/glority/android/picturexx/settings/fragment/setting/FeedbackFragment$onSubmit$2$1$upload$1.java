package com.glority.android.picturexx.settings.fragment.setting;

import com.glority.android.picturexx.settings.vm.FeedbackViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.SupportType;
import java.util.Collection;
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
/* compiled from: FeedbackFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.settings.fragment.setting.FeedbackFragment$onSubmit$2$1$upload$1", f = "FeedbackFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class FeedbackFragment$onSubmit$2$1$upload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contact;
    final /* synthetic */ String $content;
    final /* synthetic */ List<String> $urls;
    int label;
    final /* synthetic */ FeedbackFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackFragment$onSubmit$2$1$upload$1(FeedbackFragment feedbackFragment, String str, String str2, List<String> list, Continuation<? super FeedbackFragment$onSubmit$2$1$upload$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackFragment;
        this.$contact = str;
        this.$content = str2;
        this.$urls = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackFragment$onSubmit$2$1$upload$1(this.this$0, this.$contact, this.$content, this.$urls, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeedbackFragment$onSubmit$2$1$upload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeedbackViewModel feedbackViewModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            feedbackViewModel = this.this$0.vm;
            if (feedbackViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                feedbackViewModel = null;
            }
            FeedbackViewModel feedbackViewModel2 = feedbackViewModel;
            String str = this.$contact;
            SupportType supportType = SupportType.NORMAL_SUPPORT;
            String str2 = this.$content;
            List<String> mutableList = CollectionsKt.toMutableList((Collection) this.$urls);
            String[] strArr = new String[1];
            strArr[0] = this.this$0.getTitle().length() > 0 ? "suggestion" : "issues";
            feedbackViewModel2.submitSupportTicket(str, supportType, str2, mutableList, CollectionsKt.arrayListOf(strArr));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
