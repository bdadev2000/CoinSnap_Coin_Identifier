package com.glority.android.picturexx.vm;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.database.entities.WishItem;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.repository.CollectionRepository;
import com.glority.android.picturexx.repository.HistoryRepository;
import com.glority.android.picturexx.repository.WishRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.component.generatedAPI.kotlinAPI.item.GetItemDetailMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.picturecoin.generatedAPI.kotlinAPI.wish.GetWishByIdMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeViewModel.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000bJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u000b2\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\f0\u000bJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u001e\u001a\u00020\u0013J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\u000b2\u0006\u0010\u001e\u001a\u00020\u0013J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00180\u000b2\u0006\u0010#\u001a\u00020$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006%"}, d2 = {"Lcom/glority/android/picturexx/vm/MeViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "clickItemDrawable", "Landroid/graphics/drawable/Drawable;", "getClickItemDrawable", "()Landroid/graphics/drawable/Drawable;", "setClickItemDrawable", "(Landroid/graphics/drawable/Drawable;)V", "getHistoryItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/glority/android/database/entities/HistoryItem;", "getCollectionItems", "Lcom/glority/android/database/entities/CollectionItem;", "deleteCollectionItem", "Lcom/glority/network/model/Status;", "collectionId", "", "deleteHistoryItem", "itemId", "", "getItemDetailMessage", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/item/GetItemDetailMessage;", "getItemDetailMessageSync", "getWishItems", "Lcom/glority/android/database/entities/WishItem;", "deleteWish", Args.wishId, "getWishDetailMessage", "Lcom/picturecoin/generatedAPI/kotlinAPI/wish/GetWishByIdMessage;", "getCmsName", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/GetCmsNameMessage;", Args.uid, "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private Drawable clickItemDrawable;

    public final Drawable getClickItemDrawable() {
        return this.clickItemDrawable;
    }

    public final void setClickItemDrawable(Drawable drawable) {
        this.clickItemDrawable = drawable;
    }

    public final LiveData<List<HistoryItem>> getHistoryItems() {
        return HistoryRepository.INSTANCE.getHistoryItemList();
    }

    public final LiveData<List<CollectionItem>> getCollectionItems() {
        return DBManager.INSTANCE.getCollectionItemDao().getAll();
    }

    public final LiveData<Status> deleteCollectionItem(int collectionId) {
        return CollectionRepository.INSTANCE.deleteCollectionByIdMessage(collectionId);
    }

    public final LiveData<Status> deleteHistoryItem(long itemId) {
        return HistoryRepository.INSTANCE.deleteItem(itemId);
    }

    public final LiveData<Resource<GetItemDetailMessage>> getItemDetailMessage(long itemId) {
        return HistoryRepository.INSTANCE.getItemDetailMessage(itemId);
    }

    public final Resource<GetItemDetailMessage> getItemDetailMessageSync(long itemId) {
        return HistoryRepository.INSTANCE.getItemDetailMessageSync(itemId);
    }

    public final LiveData<List<WishItem>> getWishItems() {
        return WishRepository.INSTANCE.getWishItemList();
    }

    public final LiveData<Status> deleteWish(int wishId) {
        return WishRepository.INSTANCE.deleteItem(wishId);
    }

    public final LiveData<Resource<GetWishByIdMessage>> getWishDetailMessage(int wishId) {
        return WishRepository.INSTANCE.getItemDetailMessage(wishId);
    }

    public final LiveData<Resource<GetCmsNameMessage>> getCmsName(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return CmsRepository.INSTANCE.getCmsName(uid, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode());
    }
}
