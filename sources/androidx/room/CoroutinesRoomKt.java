package androidx.room;

import b1.a1;
import b1.z;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CoroutinesRoomKt {
    public static final z a(RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = new a1(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        return (z) obj;
    }
}
