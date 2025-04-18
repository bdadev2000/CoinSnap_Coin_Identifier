package c1;

import android.os.Looper;
import b1.u1;
import g1.t;
import java.util.List;

/* loaded from: classes4.dex */
public final class a implements t {
    @Override // g1.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // g1.t
    public u1 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // g1.t
    public int c() {
        return 1073741823;
    }
}
