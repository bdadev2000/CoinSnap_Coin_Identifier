package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class m extends MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final b f101a;

    public m(b bVar) {
        this.f101a = bVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        MediaBrowser mediaBrowser;
        Bundle extras;
        c cVar = this.f101a.f84a;
        e eVar = cVar.f86b;
        if (eVar != null && (extras = (mediaBrowser = eVar.f88b).getExtras()) != null) {
            extras.getInt("extra_service_version", 0);
            IBinder binder = extras.getBinder("extra_messenger");
            if (binder != null) {
                eVar.f90f = new k(binder, eVar.f89c);
                a aVar = eVar.d;
                Messenger messenger = new Messenger(aVar);
                eVar.f91g = messenger;
                aVar.getClass();
                aVar.f83b = new WeakReference(messenger);
                try {
                    k kVar = eVar.f90f;
                    Context context = eVar.f87a;
                    Messenger messenger2 = eVar.f91g;
                    kVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("data_package_name", context.getPackageName());
                    bundle.putBundle("data_root_hints", kVar.f98b);
                    kVar.a(6, bundle, messenger2);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.c R = android.support.v4.media.session.b.R(extras.getBinder("extra_session_binder"));
            if (R != null) {
                MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                eVar.f92h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, R) : null;
            }
        }
        cVar.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        c cVar = this.f101a.f84a;
        e eVar = cVar.f86b;
        cVar.b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        c cVar = this.f101a.f84a;
        e eVar = cVar.f86b;
        if (eVar != null) {
            eVar.f90f = null;
            eVar.f91g = null;
            eVar.f92h = null;
            a aVar = eVar.d;
            aVar.getClass();
            aVar.f83b = new WeakReference(null);
        }
        cVar.c();
    }
}
