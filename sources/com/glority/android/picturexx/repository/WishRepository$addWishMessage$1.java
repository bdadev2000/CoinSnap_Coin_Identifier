package com.glority.android.picturexx.repository;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.core.app.AppContext;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.WishItem;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.picturecoin.generatedAPI.kotlinAPI.wish.AddWishMessage;
import com.picturecoin.generatedAPI.kotlinAPI.wish.Wishes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WishRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.WishRepository$addWishMessage$1", f = "WishRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class WishRepository$addWishMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<WishItem> $liveData;
    final /* synthetic */ Wishes $wishes;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WishRepository$addWishMessage$1(Wishes wishes, MutableLiveData<WishItem> mutableLiveData, Continuation<? super WishRepository$addWishMessage$1> continuation) {
        super(2, continuation);
        this.$wishes = wishes;
        this.$liveData = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WishRepository$addWishMessage$1(this.$wishes, this.$liveData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WishRepository$addWishMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Wishes wishes = this.$wishes;
        MutableLiveData<WishItem> mutableLiveData = this.$liveData;
        try {
            Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new AddWishMessage(wishes));
            if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
                AddWishMessage addWishMessage = (AddWishMessage) sendMessageBlocking.getData();
                if (addWishMessage == null) {
                    return Unit.INSTANCE;
                }
                wishes.setWishId(Boxing.boxInt(addWishMessage.getWishId()));
                WishItem fromWishes = WishItem.INSTANCE.fromWishes(wishes, AppViewModel.INSTANCE.getUserId());
                DBManager.INSTANCE.getWishItemDao().insert(fromWishes);
                mutableLiveData.postValue(fromWishes);
            } else {
                mutableLiveData.postValue(null);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
