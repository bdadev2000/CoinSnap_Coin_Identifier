package com.glority.android.picturexx.view.form;

import androidx.lifecycle.LiveData;
import com.glority.android.picturexx.business.R;
import com.glority.base.repository.UserRepository;
import com.glority.component.generatedAPI.kotlinAPI.enums.SupportType;
import com.glority.component.generatedAPI.kotlinAPI.support.SendSupportTicketMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.ui.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConsultFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.form.ConsultFragment$submit$1", f = "ConsultFragment.kt", i = {0}, l = {209}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
public final class ConsultFragment$submit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConsultFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultFragment$submit$1(ConsultFragment consultFragment, Continuation<? super ConsultFragment$submit$1> continuation) {
        super(2, continuation);
        this.this$0 = consultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConsultFragment$submit$1 consultFragment$submit$1 = new ConsultFragment$submit$1(this.this$0, continuation);
        consultFragment$submit$1.L$0 = obj;
        return consultFragment$submit$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConsultFragment$submit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Flow uploadImage;
        Object list$default;
        CoroutineScope coroutineScope;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ConsultFragment consultFragment = this.this$0;
            list = consultFragment.imageList;
            uploadImage = consultFragment.uploadImage(list);
            this.L$0 = coroutineScope2;
            this.label = 1;
            list$default = FlowKt__CollectionKt.toList$default(uploadImage, null, this, 1, null);
            if (list$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = list$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope3;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            String str2 = (String) obj2;
            if (!(str2 == null || str2.length() == 0)) {
                arrayList.add(obj2);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.filterNotNull(arrayList));
        str = this.this$0.headerImageUrl;
        if (str != null) {
            Boxing.boxBoolean(mutableList.add(str));
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.this$0, mutableList, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsultFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.form.ConsultFragment$submit$1$2", f = "ConsultFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.form.ConsultFragment$submit$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $urls;
        int label;
        final /* synthetic */ ConsultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ConsultFragment consultFragment, List<String> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = consultFragment;
            this.$urls = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$urls, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LiveData<Resource<SendSupportTicketMessage>> submitSupportTicketMethod = UserRepository.INSTANCE.getInstance().submitSupportTicketMethod(ConsultFragment.access$getBinding(this.this$0).emailEt.getText().toString(), SupportType.NORMAL_SUPPORT, ConsultFragment.access$getBinding(this.this$0).noteEt.getText().toString(), this.$urls, CollectionsKt.mutableListOf("errorcoin"));
            ConsultFragment consultFragment = this.this$0;
            final ConsultFragment consultFragment2 = this.this$0;
            submitSupportTicketMethod.observe(consultFragment, new ConsultFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends SendSupportTicketMessage>, Unit>() { // from class: com.glority.android.picturexx.view.form.ConsultFragment.submit.1.2.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends SendSupportTicketMessage> resource) {
                    invoke2((Resource<SendSupportTicketMessage>) resource);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Resource<SendSupportTicketMessage> resource) {
                    if (resource.getStatus() == Status.SUCCESS) {
                        ConsultFragment.this.hideProgress();
                        ConsultFragment.this.showSubmitSuccessDialog();
                    } else if (resource.getStatus() == Status.ERROR) {
                        ConsultFragment.this.hideProgress();
                        ToastUtils.showError(R.string.text_failed, new Object[0]);
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }
}
