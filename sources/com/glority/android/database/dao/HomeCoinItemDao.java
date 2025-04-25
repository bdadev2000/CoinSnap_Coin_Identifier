package com.glority.android.database.dao;

import androidx.lifecycle.LiveData;
import com.glority.android.database.entities.HomeCoinItem;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;

/* compiled from: HomeCoinItemDao.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H'J\b\u0010\n\u001a\u00020\u0003H'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\fH'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, d2 = {"Lcom/glority/android/database/dao/HomeCoinItemDao;", "", "insert", "", "homeCoinItem", "", "Lcom/glority/android/database/entities/HomeCoinItem;", "deleteAllByUid", "uidList", "", "deleteAll", "getItems", "Landroidx/lifecycle/LiveData;", "getItemsBlocking", "getItem", Args.uid, "", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public interface HomeCoinItemDao {
    void deleteAll();

    void deleteAllByUid(List<String> uidList);

    LiveData<HomeCoinItem> getItem(long uid);

    LiveData<List<HomeCoinItem>> getItems();

    List<HomeCoinItem> getItemsBlocking();

    void insert(List<HomeCoinItem> homeCoinItem);
}
