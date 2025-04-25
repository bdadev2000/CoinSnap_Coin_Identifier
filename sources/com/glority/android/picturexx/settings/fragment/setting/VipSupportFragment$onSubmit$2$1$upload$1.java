package com.glority.android.picturexx.settings.fragment.setting;

import com.glority.android.picturexx.settings.vm.VipSupportViewModel;
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
/* compiled from: VipSupportFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.settings.fragment.setting.VipSupportFragment$onSubmit$2$1$upload$1", f = "VipSupportFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class VipSupportFragment$onSubmit$2$1$upload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contact;
    final /* synthetic */ String $content;
    final /* synthetic */ List<String> $urls;
    int label;
    final /* synthetic */ VipSupportFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipSupportFragment$onSubmit$2$1$upload$1(VipSupportFragment vipSupportFragment, String str, String str2, List<String> list, Continuation<? super VipSupportFragment$onSubmit$2$1$upload$1> continuation) {
        super(2, continuation);
        this.this$0 = vipSupportFragment;
        this.$contact = str;
        this.$content = str2;
        this.$urls = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipSupportFragment$onSubmit$2$1$upload$1(this.this$0, this.$contact, this.$content, this.$urls, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VipSupportFragment$onSubmit$2$1$upload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VipSupportViewModel vipSupportViewModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            vipSupportViewModel = this.this$0.vm;
            if (vipSupportViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                vipSupportViewModel = null;
            }
            vipSupportViewModel.submitSupportTicket(this.$contact, SupportType.VIP_SUPPORT, this.$content, CollectionsKt.toMutableList((Collection) this.$urls), CollectionsKt.arrayListOf(VipSupportFragment.FEEDBACK_TAG));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
