package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.j;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi
/* loaded from: classes.dex */
class MediaBrowserServiceCompatApi21 {

    /* loaded from: classes.dex */
    public static class BrowserRoot {

        /* renamed from: a, reason: collision with root package name */
        public final String f20300a = null;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f20301b;

        public BrowserRoot(Bundle bundle) {
            this.f20301b = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class MediaBrowserServiceAdaptor extends MediaBrowserService {

        /* renamed from: a, reason: collision with root package name */
        public final ServiceCompatProxy f20302a;

        public MediaBrowserServiceAdaptor(MediaBrowserServiceCompat mediaBrowserServiceCompat, ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(mediaBrowserServiceCompat);
            this.f20302a = serviceCompatProxy;
        }

        @Override // android.service.media.MediaBrowserService
        public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i2, Bundle bundle) {
            j.a(bundle);
            BrowserRoot c2 = this.f20302a.c(str, i2, bundle == null ? null : new Bundle(bundle));
            if (c2 == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(c2.f20300a, c2.f20301b);
        }

        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result result) {
            this.f20302a.d(str, new ResultWrapper(result));
        }
    }

    /* loaded from: classes.dex */
    public static class ResultWrapper<T> {

        /* renamed from: a, reason: collision with root package name */
        public final MediaBrowserService.Result f20303a;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.f20303a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object obj) {
            boolean z2 = obj instanceof List;
            ArrayList arrayList = null;
            MediaBrowserService.Result result = this.f20303a;
            if (!z2) {
                if (!(obj instanceof Parcel)) {
                    result.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) obj;
                parcel.setDataPosition(0);
                result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            List<Parcel> list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel2 : list) {
                    parcel2.setDataPosition(0);
                    arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                    parcel2.recycle();
                }
            }
            result.sendResult(arrayList);
        }
    }

    /* loaded from: classes.dex */
    public interface ServiceCompatProxy {
        BrowserRoot c(String str, int i2, Bundle bundle);

        void d(String str, ResultWrapper resultWrapper);
    }
}
