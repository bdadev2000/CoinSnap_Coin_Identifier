package s2;

import android.content.Context;
import androidx.appcompat.widget.j;
import androidx.work.p;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f24158f = p.g("ConstraintTracker");
    public final x2.a a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f24159b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24160c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f24161d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f24162e;

    public d(Context context, x2.a aVar) {
        this.f24159b = context.getApplicationContext();
        this.a = aVar;
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f24160c) {
            Object obj2 = this.f24162e;
            if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                this.f24162e = obj;
                ((Executor) ((h.c) this.a).f18525f).execute(new j(5, this, new ArrayList(this.f24161d)));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
