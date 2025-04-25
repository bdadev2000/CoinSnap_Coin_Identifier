package com.glority.android.picturexx.repository;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.WishItemDao;
import com.glority.android.database.entities.WishItem;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.picturecoin.generatedAPI.kotlinAPI.wish.GetWishListMessage;
import com.picturecoin.generatedAPI.kotlinAPI.wish.Wishes;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WishRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.WishRepository$getWishItemList$1", f = "WishRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class WishRepository$getWishItemList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $userId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WishRepository$getWishItemList$1(long j, Continuation<? super WishRepository$getWishItemList$1> continuation) {
        super(2, continuation);
        this.$userId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WishRepository$getWishItemList$1(this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WishRepository$getWishItemList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List<Wishes> wishes;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long j = this.$userId;
        try {
            Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetWishListMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode()));
            if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
                GetWishListMessage getWishListMessage = (GetWishListMessage) sendMessageBlocking.getData();
                if (getWishListMessage == null || (wishes = getWishListMessage.getWishes()) == null) {
                    arrayList = null;
                } else {
                    List<Wishes> list = wishes;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (Wishes wishes2 : list) {
                        Integer wishId = wishes2.getWishId();
                        arrayList2.add(new WishItem(wishId != null ? wishId.intValue() : 0, j, wishes2.getUid(), wishes2.getPrice(), wishes2.getName(), wishes2.getOriginalImageUrl(), wishes2.getCreatedAt()));
                    }
                    arrayList = arrayList2;
                }
                if (arrayList != null) {
                    WishItemDao wishItemDao = DBManager.INSTANCE.getWishItemDao();
                    WishItem[] wishItemArr = (WishItem[]) arrayList.toArray(new WishItem[0]);
                    wishItemDao.insert((WishItem[]) Arrays.copyOf(wishItemArr, wishItemArr.length));
                }
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
