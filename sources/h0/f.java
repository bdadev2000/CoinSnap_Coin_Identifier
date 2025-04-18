package h0;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class f {
    public static Icon a(Uri uri) {
        Icon createWithAdaptiveBitmapContentUri;
        createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
        return createWithAdaptiveBitmapContentUri;
    }
}
