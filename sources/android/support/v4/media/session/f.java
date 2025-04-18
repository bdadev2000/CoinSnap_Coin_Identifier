package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final MediaController f127a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f128b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f129c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public f(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f106a);
        this.f127a = mediaController;
        if (mediaSessionCompat$Token.f107b == null) {
            ?? resultReceiver = new ResultReceiver(null);
            resultReceiver.f102a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
        }
    }

    public final void a() {
        if (this.e.f107b == null) {
            return;
        }
        ArrayList arrayList = this.f129c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
            return;
        }
        android.support.v4.media.d.C(it.next());
        this.d.put(null, new d());
        throw null;
    }
}
