package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class c {
    @Nullable
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, @Nullable Uri uri) {
        builder.setMediaUri(uri);
    }
}
