package db;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class o implements cc.c {

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f16963b = null;
    public volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public o(Collection collection) {
        this.a.addAll(collection);
    }

    @Override // cc.c
    public final Object get() {
        if (this.f16963b == null) {
            synchronized (this) {
                if (this.f16963b == null) {
                    this.f16963b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator it = this.a.iterator();
                        while (it.hasNext()) {
                            this.f16963b.add(((cc.c) it.next()).get());
                        }
                        this.a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f16963b);
    }
}
