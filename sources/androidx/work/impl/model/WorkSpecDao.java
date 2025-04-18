package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.room.Dao;
import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.ArrayList;

@Dao
@SuppressLint({"UnknownNullness"})
/* loaded from: classes2.dex */
public interface WorkSpecDao {
    void a(String str);

    int b(WorkInfo.State state, String... strArr);

    int c(long j2, String str);

    ArrayList d(long j2);

    void e(WorkSpec workSpec);

    void f(long j2, String str);

    ArrayList g();

    ArrayList h(String str);

    WorkInfo.State i(String str);

    WorkSpec j(String str);

    ArrayList k(String str);

    ArrayList l(String str);

    int m();

    ArrayList n();

    ArrayList o(String str);

    ArrayList p(int i2);

    void q(String str, Data data);

    ArrayList r();

    boolean s();

    int t(String str);

    int u(String str);
}
