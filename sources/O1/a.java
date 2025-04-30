package O1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f2147c = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f2148d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2149a;
    public final ContentResolver b;

    public /* synthetic */ a(ContentResolver contentResolver, int i9) {
        this.f2149a = i9;
        this.b = contentResolver;
    }

    @Override // O1.c
    public final Cursor a(Uri uri) {
        switch (this.f2149a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f2147c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f2148d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
