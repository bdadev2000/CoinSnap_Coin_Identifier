package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class a0 {
    public final UUID a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.j f2176b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2177c;

    public a0(UUID uuid, u2.j jVar, HashSet hashSet) {
        this.a = uuid;
        this.f2176b = jVar;
        this.f2177c = hashSet;
    }
}
