package com.glority.android.picturexx.view.grading;

import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradingDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$1", f = "GradingDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class GradingDetailFragment$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CmsName $cmsName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GradingDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradingDetailFragment$initData$1(CmsName cmsName, GradingDetailFragment gradingDetailFragment, Continuation<? super GradingDetailFragment$initData$1> continuation) {
        super(2, continuation);
        this.$cmsName = cmsName;
        this.this$0 = gradingDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GradingDetailFragment$initData$1 gradingDetailFragment$initData$1 = new GradingDetailFragment$initData$1(this.$cmsName, this.this$0, continuation);
        gradingDetailFragment$initData$1.L$0 = obj;
        return gradingDetailFragment$initData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GradingDetailFragment$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CmsStaticUrl staticUrlCmsMessageByNet = CmsRepository.INSTANCE.getStaticUrlCmsMessageByNet(this.$cmsName.getUid(), "name_h5_grade");
        if (staticUrlCmsMessageByNet == null) {
            staticUrlCmsMessageByNet = CmsRepository.INSTANCE.getStaticUrlMessageByCache(this.$cmsName.getUid(), "name_h5_grade");
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(staticUrlCmsMessageByNet, this.this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradingDetailFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$1$1", f = "GradingDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CmsStaticUrl $url;
        int label;
        final /* synthetic */ GradingDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CmsStaticUrl cmsStaticUrl, GradingDetailFragment gradingDetailFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$url = cmsStaticUrl;
            this.this$0 = gradingDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$url, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CmsStaticUrl cmsStaticUrl = this.$url;
            if (cmsStaticUrl != null) {
                this.this$0.initH5(cmsStaticUrl.getLightUrl());
            }
            return Unit.INSTANCE;
        }
    }
}
