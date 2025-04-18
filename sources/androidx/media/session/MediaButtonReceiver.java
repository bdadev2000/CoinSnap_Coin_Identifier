package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.c;
import android.support.v4.media.d;
import android.support.v4.media.g;
import android.support.v4.media.k;
import android.support.v4.media.l;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.f;
import android.util.Log;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* loaded from: classes.dex */
    public static class MediaButtonConnectionCallback extends c {

        /* renamed from: c, reason: collision with root package name */
        public final Context f20312c;
        public final Intent d;
        public final BroadcastReceiver.PendingResult e;

        /* renamed from: f, reason: collision with root package name */
        public l f20313f;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f20312c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        @Override // android.support.v4.media.c
        public final void a() {
            Context context;
            MediaSessionCompat$Token mediaSessionCompat$Token;
            try {
                context = this.f20312c;
                g gVar = this.f20313f.f100a;
                if (gVar.f92h == null) {
                    MediaSession.Token sessionToken = gVar.f88b.getSessionToken();
                    gVar.f92h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
                }
                mediaSessionCompat$Token = gVar.f92h;
                new HashSet();
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            if (mediaSessionCompat$Token == null) {
                throw new IllegalArgumentException("sessionToken must not be null");
            }
            f fVar = new f(context, mediaSessionCompat$Token);
            KeyEvent keyEvent = (KeyEvent) this.d.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            fVar.f127a.dispatchMediaButtonEvent(keyEvent);
            d();
        }

        @Override // android.support.v4.media.c
        public final void b() {
            d();
        }

        @Override // android.support.v4.media.c
        public final void c() {
            d();
        }

        public final void d() {
            Messenger messenger;
            g gVar = this.f20313f.f100a;
            k kVar = gVar.f90f;
            if (kVar != null && (messenger = gVar.f91g) != null) {
                try {
                    kVar.a(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            gVar.f88b.disconnect();
            this.e.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder v2 = d.v("Expected 1 service that handles ", str, ", found ");
        v2.append(queryIntentServices.size());
        throw new IllegalStateException(v2.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName a2 = a(context, "android.intent.action.MEDIA_BUTTON");
        if (a2 != null) {
            intent.setComponent(a2);
            context.startForegroundService(intent);
            return;
        }
        ComponentName a3 = a(context, "android.media.browse.MediaBrowserService");
        if (a3 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, goAsync);
        l lVar = new l(applicationContext, a3, mediaButtonConnectionCallback);
        mediaButtonConnectionCallback.f20313f = lVar;
        lVar.f100a.f88b.connect();
    }
}
