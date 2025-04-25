package com.glority.android.picturexx.view;

import com.glority.android.database.DBManager;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseCmsDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.BaseCmsDetailFragment$clickAddCollection$1", f = "BaseCmsDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class BaseCmsDetailFragment$clickAddCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<CollectionDetailEditDialogFragment, Unit> $callback;
    final /* synthetic */ String $from;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseCmsDetailFragment<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseCmsDetailFragment$clickAddCollection$1(BaseCmsDetailFragment<T> baseCmsDetailFragment, String str, Function1<? super CollectionDetailEditDialogFragment, Unit> function1, Continuation<? super BaseCmsDetailFragment$clickAddCollection$1> continuation) {
        super(2, continuation);
        this.this$0 = baseCmsDetailFragment;
        this.$from = str;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseCmsDetailFragment$clickAddCollection$1 baseCmsDetailFragment$clickAddCollection$1 = new BaseCmsDetailFragment$clickAddCollection$1(this.this$0, this.$from, this.$callback, continuation);
        baseCmsDetailFragment$clickAddCollection$1.L$0 = obj;
        return baseCmsDetailFragment$clickAddCollection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseCmsDetailFragment$clickAddCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getMain(), null, new AnonymousClass1(DBManager.INSTANCE.getCollectionItemDao().getCountSync(AppViewModel.INSTANCE.getUserId()), this.this$0, this.$from, this.$callback, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseCmsDetailFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.BaseCmsDetailFragment$clickAddCollection$1$1", f = "BaseCmsDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.BaseCmsDetailFragment$clickAddCollection$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<CollectionDetailEditDialogFragment, Unit> $callback;
        final /* synthetic */ int $count;
        final /* synthetic */ String $from;
        int label;
        final /* synthetic */ BaseCmsDetailFragment<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int i, BaseCmsDetailFragment<T> baseCmsDetailFragment, String str, Function1<? super CollectionDetailEditDialogFragment, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$count = i;
            this.this$0 = baseCmsDetailFragment;
            this.$from = str;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$count, this.this$0, this.$from, this.$callback, continuation);
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
            if (!AppViewModel.INSTANCE.isVip() && this.$count >= CoinAbTestUtils.INSTANCE.getCollectionPayCount()) {
                BaseCmsDetailFragment<T> baseCmsDetailFragment = this.this$0;
                final BaseCmsDetailFragment<T> baseCmsDetailFragment2 = this.this$0;
                final String str = this.$from;
                final Function1<CollectionDetailEditDialogFragment, Unit> function1 = this.$callback;
                ((BaseCmsDetailFragment) baseCmsDetailFragment).addCollectionMethod = new Function0<Unit>() { // from class: com.glority.android.picturexx.view.BaseCmsDetailFragment.clickAddCollection.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        CollectionDetailEditDialogFragment addCollection = baseCmsDetailFragment2.addCollection(str);
                        Function1<CollectionDetailEditDialogFragment, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(addCollection);
                        }
                    }
                };
                new OpenBillingActivityRequest(this.this$0.getPageName(), "100011", Boxing.boxInt(20)).post();
            } else {
                CollectionDetailEditDialogFragment addCollection = this.this$0.addCollection(this.$from);
                Function1<CollectionDetailEditDialogFragment, Unit> function12 = this.$callback;
                if (function12 != null) {
                    function12.invoke(addCollection);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
