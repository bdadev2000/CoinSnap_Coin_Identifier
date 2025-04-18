package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes.dex */
public abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f87a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaBrowser f88b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f89c;
    public final a d = new a(this);
    public final ArrayMap e = new SimpleArrayMap(0);

    /* renamed from: f, reason: collision with root package name */
    public k f90f;

    /* renamed from: g, reason: collision with root package name */
    public Messenger f91g;

    /* renamed from: h, reason: collision with root package name */
    public MediaSessionCompat$Token f92h;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public e(Context context, ComponentName componentName, c cVar) {
        this.f87a = context;
        Bundle bundle = new Bundle();
        this.f89c = bundle;
        bundle.putInt("extra_client_version", 1);
        cVar.f86b = this;
        this.f88b = new MediaBrowser(context, componentName, cVar.f85a, bundle);
    }
}
