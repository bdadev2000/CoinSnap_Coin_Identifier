package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.HistoryItemDao;
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.item.GetItemDetailMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HistoryRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/repository/HistoryRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getHistoryItemList", "Landroidx/lifecycle/LiveData;", "", "Lcom/glority/android/database/entities/HistoryItem;", "getItemDetailMessage", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/item/GetItemDetailMessage;", "itemId", "", "getItemDetailMessageSync", "deleteItem", "Lcom/glority/network/model/Status;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class HistoryRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final HistoryRepository INSTANCE = new HistoryRepository();

    private HistoryRepository() {
    }

    public final LiveData<List<HistoryItem>> getHistoryItemList() {
        HistoryItemDao historyItemDao = DBManager.INSTANCE.getHistoryItemDao();
        User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
        LiveData<List<HistoryItem>> all = historyItemDao.getAll(value != null ? value.getUserId() : 0L);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HistoryRepository$getHistoryItemList$1(null), 3, null);
        return all;
    }

    public final LiveData<Resource<GetItemDetailMessage>> getItemDetailMessage(long itemId) {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetItemDetailMessage(itemId, AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode()));
    }

    public final Resource<GetItemDetailMessage> getItemDetailMessageSync(long itemId) {
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetItemDetailMessage(itemId, AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode()));
    }

    public final LiveData<Status> deleteItem(long itemId) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HistoryRepository$deleteItem$1(itemId, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }
}
