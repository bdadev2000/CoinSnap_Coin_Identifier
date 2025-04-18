package androidx.media;

import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.j;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.media.MediaBrowserServiceCompatApi23;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public class MediaBrowserServiceCompatApi26 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f20304a;

    /* loaded from: classes3.dex */
    public static class MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi23.MediaBrowserServiceAdaptor {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.media.MediaBrowserServiceCompatApi26$ResultWrapper] */
        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
            j.a(bundle);
            ServiceCompatProxy serviceCompatProxy = (ServiceCompatProxy) this.f20302a;
            ?? obj = new Object();
            obj.f20305a = result;
            serviceCompatProxy.b(str, obj);
        }
    }

    /* loaded from: classes3.dex */
    public static class ResultWrapper {

        /* renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f20305a;
    }

    /* loaded from: classes3.dex */
    public interface ServiceCompatProxy extends MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void b(String str, ResultWrapper resultWrapper);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f20304a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi26", e);
        }
    }
}
