package com.glority.android.database.dao;

import androidx.lifecycle.LiveData;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UserSeriesListItemDao.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0010H'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\nH'J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00102\u0006\u0010\r\u001a\u00020\u000bH'J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00102\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H'¨\u0006\u0018"}, d2 = {"Lcom/glority/android/database/dao/UserSeriesListItemDao;", "", "insert", "", "userSeriesListItem", "", "Lcom/glority/android/database/entities/UserSeriesListItem;", "([Lcom/glority/android/database/entities/UserSeriesListItem;)V", "deleteAll", "seriesIds", "", "", "delete", Args.seriesId, "", "getAll", "Landroidx/lifecycle/LiveData;", "getAllSync", "getItem", "getItemByIndexListUid", Args.indexListUid, "", "getItemByIndexListUidSync", "getCount", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public interface UserSeriesListItemDao {
    void delete(int seriesId);

    void deleteAll();

    void deleteAll(List<Long> seriesIds);

    LiveData<List<UserSeriesListItem>> getAll();

    List<UserSeriesListItem> getAllSync();

    LiveData<Integer> getCount();

    LiveData<UserSeriesListItem> getItem(long seriesId);

    LiveData<UserSeriesListItem> getItemByIndexListUid(String indexListUid);

    UserSeriesListItem getItemByIndexListUidSync(String indexListUid);

    void insert(UserSeriesListItem... userSeriesListItem);
}
