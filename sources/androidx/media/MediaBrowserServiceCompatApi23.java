package androidx.media;

import android.service.media.MediaBrowserService;
import androidx.annotation.RequiresApi;
import androidx.media.MediaBrowserServiceCompatApi21;

@RequiresApi
/* loaded from: classes3.dex */
class MediaBrowserServiceCompatApi23 {

    /* loaded from: classes3.dex */
    public static class MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi21.MediaBrowserServiceAdaptor {
        @Override // android.service.media.MediaBrowserService
        public final void onLoadItem(String str, MediaBrowserService.Result result) {
            ((ServiceCompatProxy) this.f20302a).a(str, new MediaBrowserServiceCompatApi21.ResultWrapper(result));
        }
    }

    /* loaded from: classes3.dex */
    public interface ServiceCompatProxy extends MediaBrowserServiceCompatApi21.ServiceCompatProxy {
        void a(String str, MediaBrowserServiceCompatApi21.ResultWrapper resultWrapper);
    }
}
