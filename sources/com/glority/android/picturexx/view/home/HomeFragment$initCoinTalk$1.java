package com.glority.android.picturexx.view.home;

import android.view.View;
import com.glority.android.picturexx.adapter.ExpertPicksAdapter;
import com.glority.android.picturexx.business.databinding.ItemCoinTalkRvBinding;
import com.glority.android.picturexx.vm.HomeViewModel;
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
/* compiled from: HomeFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.home.HomeFragment$initCoinTalk$1", f = "HomeFragment.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class HomeFragment$initCoinTalk$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$initCoinTalk$1(HomeFragment homeFragment, Continuation<? super HomeFragment$initCoinTalk$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$initCoinTalk$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFragment$initCoinTalk$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeViewModel vm;
        ItemCoinTalkRvBinding coinTalkSection;
        ExpertPicksAdapter expertPicksAdapter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            vm = this.this$0.getVm();
            this.label = 1;
            obj = vm.getCoinTalkListSync(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        coinTalkSection = this.this$0.getCoinTalkSection(CollectionsKt.shuffled((Iterable) obj));
        expertPicksAdapter = this.this$0.adapter;
        if (expertPicksAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            expertPicksAdapter = null;
        }
        View root = coinTalkSection.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        expertPicksAdapter.setHeaderView(root, 4);
        return Unit.INSTANCE;
    }
}
