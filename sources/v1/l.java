package v1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l extends n0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f0 database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void bind(z1.j jVar, Object obj);

    public final void insert(Object obj) {
        z1.j acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.M();
        } finally {
            release(acquire);
        }
    }
}
