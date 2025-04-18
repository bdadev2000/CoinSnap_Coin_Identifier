package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.l;
import android.support.v4.media.session.j;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.media.MediaBrowserServiceCompatApi21;
import androidx.media.MediaBrowserServiceCompatApi23;
import androidx.media.MediaBrowserServiceCompatApi26;
import androidx.media.MediaSessionManagerImplApi28;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a, reason: collision with root package name */
    public MediaBrowserServiceImplApi26 f20290a;

    /* renamed from: androidx.media.MediaBrowserServiceCompat$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends Result<List<MediaBrowserCompat$MediaItem>> {
        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public final void a() {
            throw null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 extends Result<MediaBrowserCompat$MediaItem> {
        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public final void a() {
            if ((this.f20299c & 2) != 0) {
                throw null;
            }
            new Bundle().putParcelable("media_item", null);
            throw null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass3 extends Result<List<MediaBrowserCompat$MediaItem>> {
        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public final void a() {
            throw null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass4 extends Result<Bundle> {
        @Override // androidx.media.MediaBrowserServiceCompat.Result
        public final void a() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class BrowserRoot {
    }

    /* loaded from: classes.dex */
    public class ConnectionRecord implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final ServiceCallbacks f20291a;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase, java.lang.Object, androidx.media.MediaSessionManager$RemoteUserInfoImpl] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.media.MediaSessionManager$RemoteUserInfo, java.lang.Object] */
        public ConnectionRecord(String str, int i2) {
            new HashMap();
            ?? obj = new Object();
            if (Build.VERSION.SDK_INT >= 28) {
                obj.f20307a = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i2);
                return;
            }
            ?? obj2 = new Object();
            obj2.f20309a = str;
            obj2.f20310b = -1;
            obj2.f20311c = i2;
            obj.f20307a = obj2;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.getClass();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface MediaBrowserServiceImpl {
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl, MediaBrowserServiceCompatApi21.ServiceCompatProxy {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20293a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public Object f20294b;

        /* renamed from: c, reason: collision with root package name */
        public Messenger f20295c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass2 extends Result<List<MediaBrowserCompat$MediaItem>> {
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public final void a() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4, reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public final MediaBrowserServiceCompatApi21.BrowserRoot c(String str, int i2, Bundle bundle) {
            Bundle bundle2;
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                mediaBrowserServiceCompat.getClass();
                this.f20295c = new Messenger((Handler) null);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                bundle2.putBinder("extra_messenger", this.f20295c.getBinder());
                this.f20293a.add(bundle2);
            }
            new ConnectionRecord(str, i2);
            mediaBrowserServiceCompat.getClass();
            if (mediaBrowserServiceCompat.a() == null) {
                return null;
            }
            return new MediaBrowserServiceCompatApi21.BrowserRoot(bundle2 != null ? bundle2 : null);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public final void d(String str, MediaBrowserServiceCompatApi21.ResultWrapper resultWrapper) {
            MediaBrowserServiceCompat.this.b();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        public MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy
        public final void a(String str, final MediaBrowserServiceCompatApi21.ResultWrapper resultWrapper) {
            Result<MediaBrowserCompat$MediaItem> result = new Result<MediaBrowserCompat$MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public final void a() {
                    resultWrapper.a(null);
                }
            };
            MediaBrowserServiceCompat.this.getClass();
            result.f20299c = 2;
            result.b();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 implements MediaBrowserServiceCompatApi26.ServiceCompatProxy {
        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy
        public final void b(String str, final MediaBrowserServiceCompatApi26.ResultWrapper resultWrapper) {
            Result<List<MediaBrowserCompat$MediaItem>> result = new Result<List<MediaBrowserCompat$MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public final void a() {
                    int i2 = this.f20299c;
                    MediaBrowserService.Result result2 = resultWrapper.f20305a;
                    try {
                        MediaBrowserServiceCompatApi26.f20304a.setInt(result2, i2);
                    } catch (IllegalAccessException e) {
                        Log.w("MBSCompatApi26", e);
                    }
                    result2.sendResult(null);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.getClass();
            result.f20299c = 1;
            mediaBrowserServiceCompat.b();
        }

        public final void e() {
            Field field = MediaBrowserServiceCompatApi26.f20304a;
            MediaBrowserServiceCompatApi21.MediaBrowserServiceAdaptor mediaBrowserServiceAdaptor = new MediaBrowserServiceCompatApi21.MediaBrowserServiceAdaptor(MediaBrowserServiceCompat.this, this);
            this.f20294b = mediaBrowserServiceAdaptor;
            mediaBrowserServiceAdaptor.onCreate();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
    }

    /* loaded from: classes.dex */
    public class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Result<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f20297a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20298b;

        /* renamed from: c, reason: collision with root package name */
        public int f20299c;

        public Result(Object obj) {
            this.f20297a = obj;
        }

        public void a() {
        }

        public final void b() {
            if (this.f20298b) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f20297a);
            }
            this.f20298b = true;
            a();
        }
    }

    /* loaded from: classes.dex */
    public class ServiceBinderImpl {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass5 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass6 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass7 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass8 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass9 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface ServiceCallbacks {
    }

    /* loaded from: classes.dex */
    public static class ServiceCallbacksCompat implements ServiceCallbacks {
    }

    /* loaded from: classes.dex */
    public final class ServiceHandler extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    j.a(data.getBundle("data_root_hints"));
                    data.getString("data_package_name");
                    data.getInt("data_calling_pid");
                    data.getInt("data_calling_uid");
                    throw null;
                case 2:
                    throw null;
                case 3:
                    j.a(data.getBundle("data_options"));
                    data.getString("data_media_item_id");
                    data.getBinder("data_callback_token");
                    throw null;
                case 4:
                    data.getString("data_media_item_id");
                    data.getBinder("data_callback_token");
                    throw null;
                case 5:
                    data.getString("data_media_item_id");
                    throw null;
                case 6:
                    j.a(data.getBundle("data_root_hints"));
                    data.getString("data_package_name");
                    data.getInt("data_calling_pid");
                    data.getInt("data_calling_uid");
                    throw null;
                case 7:
                    throw null;
                case 8:
                    j.a(data.getBundle("data_search_extras"));
                    data.getString("data_search_query");
                    throw null;
                case 9:
                    j.a(data.getBundle("data_custom_action_extras"));
                    data.getString("data_custom_action");
                    throw null;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j2) {
            Bundle data = message.getData();
            data.setClassLoader(l.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j2);
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public abstract BrowserRoot a();

    public abstract void b();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((MediaBrowserService) this.f20290a.f20294b).onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f20290a = new MediaBrowserServiceImplApi26();
        } else {
            this.f20290a = new MediaBrowserServiceImplApi26();
        }
        this.f20290a.e();
    }
}
