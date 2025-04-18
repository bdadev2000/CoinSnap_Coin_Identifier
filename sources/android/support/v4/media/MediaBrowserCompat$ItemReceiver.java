package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import d.e;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends e {
    @Override // d.e
    public final void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = com.bumptech.glide.d.I(bundle);
        }
        if (i10 == 0) {
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
