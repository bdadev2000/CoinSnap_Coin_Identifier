package L4;

import P.o;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class e implements g, h {

    /* renamed from: a, reason: collision with root package name */
    public final N4.b f1811a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final N4.b f1812c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1813d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1814e;

    public e(Context context, String str, Set set, N4.b bVar, Executor executor) {
        this.f1811a = new c(0, context, str);
        this.f1813d = set;
        this.f1814e = executor;
        this.f1812c = bVar;
        this.b = context;
    }

    public final Task a() {
        if (!o.a(this.b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f1814e, new d(this, 0));
    }

    public final void b() {
        if (this.f1813d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!o.a(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f1814e, new d(this, 1));
        }
    }
}
