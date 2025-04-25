package com.glority.android.database.dao;

import androidx.lifecycle.LiveData;
import com.glority.android.database.entities.HistoryItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: HistoryItemDao.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000bH'J\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r2\u0006\u0010\n\u001a\u00020\u000bH'J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H'¨\u0006\u0013"}, d2 = {"Lcom/glority/android/database/dao/HistoryItemDao;", "", "insert", "", "historyItem", "", "Lcom/glority/android/database/entities/HistoryItem;", "([Lcom/glority/android/database/entities/HistoryItem;)V", "deleteAll", "delete", "itemId", "", "getAll", "Landroidx/lifecycle/LiveData;", "", "userId", "getItem", "getItemSync", "insertSync", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public interface HistoryItemDao {
    void delete(long itemId);

    void deleteAll();

    LiveData<List<HistoryItem>> getAll(long userId);

    LiveData<HistoryItem> getItem(long itemId);

    HistoryItem getItemSync(long itemId);

    void insert(HistoryItem... historyItem);

    void insertSync(HistoryItem historyItem);
}
