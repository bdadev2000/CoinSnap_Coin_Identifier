package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class InvalidationLiveDataContainer {

    /* renamed from: a, reason: collision with root package name */
    public final Set f21273a;

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        p0.a.s(roomDatabase, "database");
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        p0.a.r(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f21273a = newSetFromMap;
    }
}
