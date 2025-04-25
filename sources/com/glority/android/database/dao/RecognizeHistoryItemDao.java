package com.glority.android.database.dao;

import androidx.lifecycle.LiveData;
import com.glority.android.database.entities.RecognizeHistoryItem;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RecognizeHistoryItemDao.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\t2\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\r"}, d2 = {"Lcom/glority/android/database/dao/RecognizeHistoryItemDao;", "", "insert", "", "historyItem", "", "Lcom/glority/android/database/entities/RecognizeHistoryItem;", "([Lcom/glority/android/database/entities/RecognizeHistoryItem;)V", "getAllByUid", "Landroidx/lifecycle/LiveData;", "", Args.uid, "", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public interface RecognizeHistoryItemDao {
    LiveData<List<RecognizeHistoryItem>> getAllByUid(String uid);

    void insert(RecognizeHistoryItem... historyItem);
}
