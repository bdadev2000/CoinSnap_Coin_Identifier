package com.glority.android.picturexx.vm;

import androidx.core.os.BundleKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.HomeCoinItemDao;
import com.glority.android.database.entities.HomeCoinItem;
import com.glority.android.picturexx.constants.BusinessDebugLogEvents;
import com.glority.android.picturexx.repository.HomeRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer.CoinHomeGetMessage;
import com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer.CoinInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.vm.HomeViewModel$getCoinList$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class HomeViewModel$getCoinList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $indexListUid;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getCoinList$1(String str, Continuation<? super HomeViewModel$getCoinList$1> continuation) {
        super(2, continuation);
        this.$indexListUid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$getCoinList$1(this.$indexListUid, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$getCoinList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoinHomeGetMessage data;
        List<CoinInfo> coinInfoList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long currentTimeMillis = System.currentTimeMillis();
        Resource<CoinHomeGetMessage> coinListBlocking = HomeRepository.INSTANCE.getCoinListBlocking(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), this.$indexListUid);
        new LogEventRequest(BusinessDebugLogEvents.time_coinhomeapi_debug, BundleKt.bundleOf(TuplesKt.to("time", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis)), TuplesKt.to("type", coinListBlocking.getStatus().toString()))).post();
        if (coinListBlocking.getStatus() == Status.SUCCESS && (data = coinListBlocking.getData()) != null && (coinInfoList = data.getCoinInfoList()) != null) {
            DBManager.INSTANCE.getHomeCoinItemDao().deleteAll();
            HomeCoinItemDao homeCoinItemDao = DBManager.INSTANCE.getHomeCoinItemDao();
            List<CoinInfo> list = coinInfoList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CoinInfo coinInfo : list) {
                String indexListUid = coinInfo.getIndexListUid();
                if (indexListUid == null) {
                    indexListUid = "";
                }
                arrayList.add(new HomeCoinItem(indexListUid, coinInfo.getCommonName(), coinInfo.getMainImageUrl(), coinInfo.getIndexListUid()));
            }
            homeCoinItemDao.insert(arrayList);
        }
        return Unit.INSTANCE;
    }
}
