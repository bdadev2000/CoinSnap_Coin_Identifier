package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.WishItem;
import com.glority.android.picturexx.utils.CoinConfigUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.wish.GetWishByIdMessage;
import com.picturecoin.generatedAPI.kotlinAPI.wish.Wishes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: WishRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00052\u0006\u0010\u000b\u001a\u00020\fJ2\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/repository/WishRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getWishItemList", "Landroidx/lifecycle/LiveData;", "", "Lcom/glority/android/database/entities/WishItem;", "getItemDetailMessage", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/wish/GetWishByIdMessage;", Args.wishId, "", "addWishMessage", Args.uid, "", "price", "name", "originalImageUrl", "deleteItem", "Lcom/glority/network/model/Status;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class WishRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final WishRepository INSTANCE = new WishRepository();

    private WishRepository() {
    }

    public final LiveData<List<WishItem>> getWishItemList() {
        User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
        long userId = value != null ? value.getUserId() : 0L;
        LiveData<List<WishItem>> all = DBManager.INSTANCE.getWishItemDao().getAll(userId);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new WishRepository$getWishItemList$1(userId, null), 3, null);
        return all;
    }

    public final LiveData<Resource<GetWishByIdMessage>> getItemDetailMessage(int wishId) {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetWishByIdMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), CoinConfigUtils.INSTANCE.getCountryCode(), wishId));
    }

    public final LiveData<WishItem> addWishMessage(String uid, String price, String name, String originalImageUrl) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(originalImageUrl, "originalImageUrl");
        MutableLiveData mutableLiveData = new MutableLiveData();
        Wishes wishes = new Wishes(0, 1, null);
        wishes.setUid(uid);
        wishes.setName(name);
        wishes.setPrice(price);
        wishes.setOriginalImageUrl(originalImageUrl);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new WishRepository$addWishMessage$1(wishes, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }

    public final LiveData<Status> deleteItem(int wishId) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new WishRepository$deleteItem$1(wishId, mutableLiveData, null), 3, null);
        return mutableLiveData;
    }
}
