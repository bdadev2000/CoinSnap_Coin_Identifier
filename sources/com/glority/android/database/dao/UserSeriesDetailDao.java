package com.glority.android.database.dao;

import androidx.lifecycle.LiveData;
import com.glority.android.database.entities.UserSeriesDetailItem;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UserSeriesDetailDao.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\rH'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH'J\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\n\u001a\u00020\u0011H'J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0011H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH'¨\u0006\u0014"}, d2 = {"Lcom/glority/android/database/dao/UserSeriesDetailDao;", "", "insert", "", "seriesChildItem", "", "Lcom/glority/android/database/entities/UserSeriesDetailItem;", "([Lcom/glority/android/database/entities/UserSeriesDetailItem;)V", "deleteAll", "delete", Args.seriesId, "", "getAll", "Landroidx/lifecycle/LiveData;", "", "getAllSync", "getItem", "", "getItemSync", "getCount", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public interface UserSeriesDetailDao {
    void delete(int seriesId);

    void deleteAll();

    LiveData<List<UserSeriesDetailItem>> getAll();

    List<UserSeriesDetailItem> getAllSync();

    LiveData<Integer> getCount();

    LiveData<UserSeriesDetailItem> getItem(long seriesId);

    UserSeriesDetailItem getItemSync(long seriesId);

    void insert(UserSeriesDetailItem... seriesChildItem);
}
