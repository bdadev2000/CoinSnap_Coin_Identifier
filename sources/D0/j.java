package D0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public volatile I0.b f615a;
    public Executor b;

    /* renamed from: c, reason: collision with root package name */
    public H0.d f616c;

    /* renamed from: d, reason: collision with root package name */
    public final e f617d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f618e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f619f;

    /* renamed from: g, reason: collision with root package name */
    public List f620g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f621h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f622i = new ThreadLocal();

    public j() {
        new ConcurrentHashMap();
        this.f617d = d();
    }

    public final void a() {
        if (this.f618e || Looper.getMainLooper().getThread() != Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f616c.getWritableDatabase().f1397c).inTransaction() && this.f622i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        I0.b writableDatabase = this.f616c.getWritableDatabase();
        this.f617d.c(writableDatabase);
        writableDatabase.a();
    }

    public abstract e d();

    public abstract H0.d e(a aVar);

    public final void f() {
        this.f616c.getWritableDatabase().k();
        if (!((SQLiteDatabase) this.f616c.getWritableDatabase().f1397c).inTransaction()) {
            e eVar = this.f617d;
            if (eVar.f597d.compareAndSet(false, true)) {
                eVar.f596c.b.execute(eVar.f602i);
            }
        }
    }

    public final Cursor g(H0.e eVar) {
        a();
        b();
        return this.f616c.getWritableDatabase().m(eVar);
    }

    public final void h() {
        this.f616c.getWritableDatabase().o();
    }
}
