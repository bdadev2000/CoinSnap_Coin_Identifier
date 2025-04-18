package f4;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f17668b = {"_data"};
    public final ContentResolver a;

    public a(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // f4.d
    public final Cursor a(Uri uri) {
        return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f17668b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
