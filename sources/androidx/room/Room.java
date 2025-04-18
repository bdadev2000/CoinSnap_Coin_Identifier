package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import z0.m;

/* loaded from: classes3.dex */
public final class Room {
    public static final RoomDatabase.Builder a(Context context, Class cls, String str) {
        p0.a.s(context, "context");
        if (!m.Z0(str)) {
            return new RoomDatabase.Builder(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }
}
