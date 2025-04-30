package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import e.C2198d;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C2198d {
    @Override // e.C2198d
    public final void a(int i9, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a.class.getClassLoader());
        }
        if (i9 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("media_item")) {
                    Parcelable parcelable = bundle.getParcelable("media_item");
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
