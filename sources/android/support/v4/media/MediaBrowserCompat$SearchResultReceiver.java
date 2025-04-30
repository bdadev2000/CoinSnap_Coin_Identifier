package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import e.C2198d;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C2198d {
    @Override // e.C2198d
    public final void a(int i9, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a.class.getClassLoader());
        }
        if (i9 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    if (parcelableArray != null) {
                        ArrayList arrayList = new ArrayList();
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
        throw null;
    }
}
