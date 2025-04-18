package v1;

import androidx.lifecycle.r0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n0 {
    private final f0 database;
    private final AtomicBoolean lock;
    private final Lazy stmt$delegate;

    public n0(f0 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = LazyKt.lazy(new r0(this, 1));
    }

    public z1.j acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (z1.j) this.stmt$delegate.getValue();
        }
        return this.database.compileStatement(createQuery());
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(z1.j statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((z1.j) this.stmt$delegate.getValue())) {
            this.lock.set(false);
        }
    }
}
