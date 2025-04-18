package androidx.work.impl.model;

import androidx.room.Dao;
import java.util.ArrayList;

@Dao
/* loaded from: classes3.dex */
public interface DependencyDao {
    void a(Dependency dependency);

    ArrayList b(String str);

    boolean c(String str);

    boolean d(String str);
}
