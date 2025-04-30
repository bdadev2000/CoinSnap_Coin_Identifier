package b1;

import a1.AbstractC0329c;
import android.content.Context;
import androidx.work.o;
import g1.InterfaceC2286a;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0551d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f5259f = o.g("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2286a f5260a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5261c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5262d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f5263e;

    public AbstractC0551d(Context context, InterfaceC2286a interfaceC2286a) {
        this.b = context.getApplicationContext();
        this.f5260a = interfaceC2286a;
    }

    public abstract Object a();

    public final void b(AbstractC0329c abstractC0329c) {
        synchronized (this.f5261c) {
            try {
                if (this.f5262d.remove(abstractC0329c) && this.f5262d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f5261c) {
            try {
                Object obj2 = this.f5263e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f5263e = obj;
                    ((P.h) ((C.c) this.f5260a).f349f).execute(new f4.b(14, this, new ArrayList(this.f5262d), false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
