package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes2.dex */
class MediaBrowserCompat$ItemReceiver extends c.d {
    @Override // c.d
    public final void b(int i2, Bundle bundle) {
        android.support.v4.media.session.j.a(bundle);
        if (i2 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
