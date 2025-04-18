package androidx.sqlite.db;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;
import p0.a;

@RestrictTo
/* loaded from: classes.dex */
public final class SupportSQLiteCompat {

    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api16Impl {
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api19Impl {
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api21Impl {
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api23Impl {
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes.dex */
    public static final class Api29Impl {
        public static final List a(Cursor cursor) {
            a.s(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            a.p(notificationUris);
            return notificationUris;
        }

        public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
            a.s(cursor, "cursor");
            a.s(contentResolver, "cr");
            a.s(list, "uris");
            cursor.setNotificationUris(contentResolver, list);
        }
    }
}
