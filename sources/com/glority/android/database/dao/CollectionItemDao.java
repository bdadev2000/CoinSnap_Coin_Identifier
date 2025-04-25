package com.glority.android.database.dao;

import androidx.lifecycle.LiveData;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.SimpleCollectionItem;
import com.glority.android.xx.constants.Args;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CollectionItemDao.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\rH'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\rH'J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H'J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\n\u001a\u00020\u000bH'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u001b\u001a\u00020\u0016H'J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r2\u0006\u0010\u001b\u001a\u00020\u0016H'J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H'J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000bH'J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000bH'J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0016H'J\u001a\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H'J \u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H'¨\u0006'"}, d2 = {"Lcom/glority/android/database/dao/CollectionItemDao;", "", "insert", "", "collectionItem", "", "Lcom/glority/android/database/entities/CollectionItem;", "([Lcom/glority/android/database/entities/CollectionItem;)V", "deleteAll", "delete", "collectionId", "", "getAll", "Landroidx/lifecycle/LiveData;", "", "getAllNoOrder", "userId", "", "getAllSimpleItems", "Lcom/glority/android/database/entities/SimpleCollectionItem;", "getAllByIndexListUid", Args.indexListUid, "", "getAllByIndexListUidSync", "getAllSync", "getItem", "getItemsSync", Args.uid, "getItems", "getItemSync", "getCountSync", "queryByCustomSeriesId", Args.customSeriesId, "queryByCustomSeriesIdSync", "queryByCountryCode", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "queryByItemIdSync", "itemId", "queryByItemId", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public interface CollectionItemDao {
    void delete(int collectionId);

    void deleteAll();

    LiveData<List<CollectionItem>> getAll();

    LiveData<List<CollectionItem>> getAllByIndexListUid(long userId, String indexListUid);

    List<CollectionItem> getAllByIndexListUidSync(long userId, String indexListUid);

    LiveData<List<CollectionItem>> getAllNoOrder(long userId);

    LiveData<List<SimpleCollectionItem>> getAllSimpleItems();

    List<CollectionItem> getAllSync(long userId);

    int getCountSync(long userId);

    LiveData<CollectionItem> getItem(int collectionId);

    CollectionItem getItemSync(int collectionId);

    LiveData<List<CollectionItem>> getItems(String uid);

    List<CollectionItem> getItemsSync(String uid);

    void insert(CollectionItem... collectionItem);

    List<CollectionItem> queryByCountryCode(long userId, String countryCode);

    LiveData<List<CollectionItem>> queryByCustomSeriesId(long userId, int customSeriesId);

    List<CollectionItem> queryByCustomSeriesIdSync(long userId, int customSeriesId);

    LiveData<CollectionItem> queryByItemId(long userId, long itemId);

    CollectionItem queryByItemIdSync(long userId, long itemId);
}
