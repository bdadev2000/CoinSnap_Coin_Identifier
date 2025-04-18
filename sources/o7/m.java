package o7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class m extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    public static final String f23156d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: f, reason: collision with root package name */
    public static final int f23157f = 7;

    /* renamed from: g, reason: collision with root package name */
    public static final List f23158g = Arrays.asList(new k(0), new k(1), new k(2), new k(3), new k(4), new k(5), new k(6));

    /* renamed from: b, reason: collision with root package name */
    public final int f23159b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23160c;

    public m(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f23160c = false;
        this.f23159b = i10;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f23158g;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                switch (((k) ((l) list.get(i10))).a) {
                    case 0:
                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        break;
                    case 1:
                        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                        break;
                    case 4:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sQLiteDatabase.execSQL(f23156d);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
                        break;
                }
                i10++;
            }
            return;
        }
        StringBuilder n10 = a4.j.n("Migration from ", i10, " to ", i11, " was requested, but cannot be performed. Only ");
        n10.append(list.size());
        n10.append(" migrations are provided");
        throw new IllegalArgumentException(n10.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f23160c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f23160c) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, 0, this.f23159b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f23160c) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, 0, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f23160c) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f23160c) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, i10, i11);
    }
}
