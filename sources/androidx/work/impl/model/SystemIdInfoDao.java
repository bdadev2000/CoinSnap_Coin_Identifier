package androidx.work.impl.model;

import androidx.room.Dao;
import java.util.ArrayList;

@Dao
/* loaded from: classes.dex */
public interface SystemIdInfoDao {
    SystemIdInfo a(String str);

    ArrayList b();

    void c(SystemIdInfo systemIdInfo);

    void d(String str);
}
