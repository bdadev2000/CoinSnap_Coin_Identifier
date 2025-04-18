package ac;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j0.o;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d implements f, g {
    public final cc.c a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f429b;

    /* renamed from: c, reason: collision with root package name */
    public final cc.c f430c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f431d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f432e;

    public d(Context context, String str, Set set, cc.c cVar, Executor executor) {
        this.a = new va.c(context, str);
        this.f431d = set;
        this.f432e = executor;
        this.f430c = cVar;
        this.f429b = context;
    }

    public final Task a() {
        if (!o.a(this.f429b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f432e, new c(this, 0));
    }

    public final void b() {
        if (this.f431d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        int i10 = 1;
        if (!o.a(this.f429b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f432e, new c(this, i10));
        }
    }
}
