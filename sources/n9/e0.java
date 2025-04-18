package n9;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e0 implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f22535b = new ArrayList(50);
    public final Handler a;

    public e0(Handler handler) {
        this.a = handler;
    }

    public static d0 b() {
        d0 d0Var;
        ArrayList arrayList = f22535b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                d0Var = new d0();
            } else {
                d0Var = (d0) arrayList.remove(arrayList.size() - 1);
            }
        }
        return d0Var;
    }

    public final d0 a(int i10, Object obj) {
        d0 b3 = b();
        b3.a = this.a.obtainMessage(i10, obj);
        return b3;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final boolean d(int i10) {
        return this.a.sendEmptyMessage(i10);
    }
}
