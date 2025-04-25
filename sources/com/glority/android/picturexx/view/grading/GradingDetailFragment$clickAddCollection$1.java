package com.glority.android.picturexx.view.grading;

import com.glority.android.database.DBManager;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradingDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.grading.GradingDetailFragment$clickAddCollection$1", f = "GradingDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class GradingDetailFragment$clickAddCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GradingDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradingDetailFragment$clickAddCollection$1(GradingDetailFragment gradingDetailFragment, Continuation<? super GradingDetailFragment$clickAddCollection$1> continuation) {
        super(2, continuation);
        this.this$0 = gradingDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GradingDetailFragment$clickAddCollection$1 gradingDetailFragment$clickAddCollection$1 = new GradingDetailFragment$clickAddCollection$1(this.this$0, continuation);
        gradingDetailFragment$clickAddCollection$1.L$0 = obj;
        return gradingDetailFragment$clickAddCollection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GradingDetailFragment$clickAddCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getMain(), null, new AnonymousClass1(DBManager.INSTANCE.getCollectionItemDao().getCountSync(AppViewModel.INSTANCE.getUserId()), this.this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradingDetailFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.grading.GradingDetailFragment$clickAddCollection$1$1", f = "GradingDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.grading.GradingDetailFragment$clickAddCollection$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $count;
        int label;
        final /* synthetic */ GradingDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, GradingDetailFragment gradingDetailFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$count = i;
            this.this$0 = gradingDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$count, this.this$0, continuation);
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
            if (AppViewModel.INSTANCE.isVip() || this.$count < CoinAbTestUtils.INSTANCE.getCollectionPayCount()) {
                this.this$0.addCollection();
            } else {
                GradingDetailFragment gradingDetailFragment = this.this$0;
                final GradingDetailFragment gradingDetailFragment2 = this.this$0;
                gradingDetailFragment.addCollectionMethod = new Function0<Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment.clickAddCollection.1.1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        GradingDetailFragment.this.addCollection();
                    }
                };
                new OpenBillingActivityRequest(this.this$0.getPageName(), "100011", Boxing.boxInt(20)).post();
            }
            return Unit.INSTANCE;
        }
    }
}
