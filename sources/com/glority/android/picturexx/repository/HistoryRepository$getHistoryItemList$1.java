package com.glority.android.picturexx.repository;

import android.util.Log;
import androidx.core.os.BundleKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.HistoryItemDao;
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.picturexx.constants.BusinessDebugLogEvents;
import com.glority.android.picturexx.utils.PropertiesItemUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.item.ListMyCollectionsMessage;
import com.glority.component.generatedAPI.kotlinAPI.item.SimpleItem;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HistoryRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.HistoryRepository$getHistoryItemList$1", f = "HistoryRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class HistoryRepository$getHistoryItemList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HistoryRepository$getHistoryItemList$1(Continuation<? super HistoryRepository$getHistoryItemList$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryRepository$getHistoryItemList$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryRepository$getHistoryItemList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List<SimpleItem> items;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Resource sendMessageBlocking = BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new ListMyCollectionsMessage(Boxing.boxBoolean(true), Boxing.boxBoolean(false)));
            new LogEventRequest(BusinessDebugLogEvents.time_historylistapi_debug, BundleKt.bundleOf(TuplesKt.to("time", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis)), TuplesKt.to("type", sendMessageBlocking.getStatus().toString()))).post();
            if (sendMessageBlocking.getStatus() == Status.SUCCESS) {
                ListMyCollectionsMessage listMyCollectionsMessage = (ListMyCollectionsMessage) sendMessageBlocking.getData();
                if (listMyCollectionsMessage == null || (items = listMyCollectionsMessage.getItems()) == null) {
                    arrayList = null;
                } else {
                    List<SimpleItem> list = items;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (SimpleItem simpleItem : list) {
                        PropertiesItemUtils propertiesItemUtils = PropertiesItemUtils.INSTANCE;
                        String properties = simpleItem.getProperties();
                        if (properties == null) {
                            properties = "";
                        }
                        String originalUrl = simpleItem.getItemImage().getOriginalUrl();
                        if (originalUrl == null) {
                            originalUrl = "";
                        }
                        String str = (String) CollectionsKt.firstOrNull((List) propertiesItemUtils.getDisplayImages(properties, originalUrl));
                        String str2 = str == null ? "" : str;
                        long itemId = simpleItem.getItemId();
                        String cmsNameUid = simpleItem.getCmsNameUid();
                        String str3 = cmsNameUid == null ? "" : cmsNameUid;
                        String name = simpleItem.getName();
                        User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
                        arrayList2.add(new HistoryItem(itemId, str3, name, value != null ? value.getUserId() : 0L, str2, simpleItem.getShootAt()));
                    }
                    arrayList = arrayList2;
                }
                if (arrayList != null) {
                    HistoryItemDao historyItemDao = DBManager.INSTANCE.getHistoryItemDao();
                    HistoryItem[] historyItemArr = (HistoryItem[]) arrayList.toArray(new HistoryItem[0]);
                    historyItemDao.insert((HistoryItem[]) Arrays.copyOf(historyItemArr, historyItemArr.length));
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
