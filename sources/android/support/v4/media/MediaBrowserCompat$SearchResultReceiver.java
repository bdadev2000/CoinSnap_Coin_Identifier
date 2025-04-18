package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import d.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends e {
    @Override // d.e
    public final void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = com.bumptech.glide.d.I(bundle);
        }
        if (i10 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    parcelableArray.getClass();
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
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
