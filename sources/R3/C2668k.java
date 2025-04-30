package r3;

import Q7.n0;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: r3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2668k extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    public static final String f22833d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: f, reason: collision with root package name */
    public static final int f22834f = 7;

    /* renamed from: g, reason: collision with root package name */
    public static final List f22835g = Arrays.asList(new C2667j(0), new C2667j(1), new C2667j(2), new C2667j(3), new C2667j(4), new C2667j(5), new C2667j(6));
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22836c;

    public C2668k(Context context, String str, int i9) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i9);
        this.f22836c = false;
        this.b = i9;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        List list = f22835g;
        if (i10 <= list.size()) {
            while (i9 < i10) {
                ((C2667j) list.get(i9)).a(sQLiteDatabase);
                i9++;
            }
        } else {
            StringBuilder o3 = n0.o(i9, i10, "Migration from ", " to ", " was requested, but cannot be performed. Only ");
            o3.append(list.size());
            o3.append(" migrations are provided");
            throw new IllegalArgumentException(o3.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f22836c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f22836c) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f22836c) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f22836c) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (!this.f22836c) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i9, i10);
    }
}
