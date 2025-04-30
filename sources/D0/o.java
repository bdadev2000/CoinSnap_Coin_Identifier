package D0;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f636a = new AtomicBoolean(false);
    public final j b;

    /* renamed from: c, reason: collision with root package name */
    public volatile I0.f f637c;

    public o(j jVar) {
        this.b = jVar;
    }

    public final I0.f a() {
        this.b.a();
        if (this.f636a.compareAndSet(false, true)) {
            if (this.f637c == null) {
                String b = b();
                j jVar = this.b;
                jVar.a();
                jVar.b();
                this.f637c = new I0.f(((SQLiteDatabase) jVar.f616c.getWritableDatabase().f1397c).compileStatement(b));
            }
            return this.f637c;
        }
        String b8 = b();
        j jVar2 = this.b;
        jVar2.a();
        jVar2.b();
        return new I0.f(((SQLiteDatabase) jVar2.f616c.getWritableDatabase().f1397c).compileStatement(b8));
    }

    public abstract String b();

    public final void c(I0.f fVar) {
        if (fVar == this.f637c) {
            this.f636a.set(false);
        }
    }
}
