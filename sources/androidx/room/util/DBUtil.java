package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import b1.f0;
import com.facebook.appevents.UserDataStore;
import f0.b;
import f0.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ListIterator;
import kotlin.jvm.internal.q;
import p0.a;
import z0.m;

@RestrictTo
/* loaded from: classes2.dex */
public final class DBUtil {
    public static final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
        a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        c cVar = new c();
        Cursor W = supportSQLiteDatabase.W("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (W.moveToNext()) {
            try {
                cVar.add(W.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    q.b(W, th);
                    throw th2;
                }
            }
        }
        q.b(W, null);
        ListIterator listIterator = f0.e(cVar).listIterator(0);
        while (true) {
            b bVar = (b) listIterator;
            if (!bVar.hasNext()) {
                return;
            }
            String str = (String) bVar.next();
            a.r(str, "triggerName");
            if (m.q1(str, "room_fts_content_sync_", false)) {
                supportSQLiteDatabase.g("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final Cursor b(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z2) {
        a.s(roomDatabase, UserDataStore.DATE_OF_BIRTH);
        a.s(roomSQLiteQuery, "sqLiteQuery");
        Cursor query = roomDatabase.query(roomSQLiteQuery, (CancellationSignal) null);
        if (z2 && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                a.s(query, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(query.getColumnNames(), query.getCount());
                    while (query.moveToNext()) {
                        Object[] objArr = new Object[query.getColumnCount()];
                        int columnCount = query.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = query.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(query.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(query.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = query.getString(i2);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i2] = query.getBlob(i2);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    q.b(query, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return query;
    }

    public static final int c(File file) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i2 = allocate.getInt();
            q.b(channel, null);
            return i2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.b(channel, th);
                throw th2;
            }
        }
    }
}
