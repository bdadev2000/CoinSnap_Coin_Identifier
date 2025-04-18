package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f82a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f83b;

    public a(i iVar) {
        this.f82a = new WeakReference(iVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f83b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f82a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        android.support.v4.media.session.j.a(data);
        i iVar = (i) weakReference2.get();
        Messenger messenger = (Messenger) this.f83b.get();
        try {
            int i2 = message.what;
            if (i2 == 1) {
                android.support.v4.media.session.j.a(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                iVar.getClass();
            } else if (i2 == 2) {
                iVar.getClass();
            } else if (i2 != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            } else {
                android.support.v4.media.session.j.a(data.getBundle("data_options"));
                android.support.v4.media.session.j.a(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                e eVar = (e) iVar;
                if (eVar.f91g == messenger) {
                    d.C(eVar.e.get(string));
                    if (l.f99b) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                    }
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                iVar.getClass();
            }
        }
    }
}
