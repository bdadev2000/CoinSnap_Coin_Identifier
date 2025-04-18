package v1;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k extends n0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f0 database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void bind(z1.j jVar, Object obj);

    public final int handle(Object obj) {
        z1.j acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.D();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<Object> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        z1.j acquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i10 += acquire.D();
            }
            return i10;
        } finally {
            release(acquire);
        }
    }
}
