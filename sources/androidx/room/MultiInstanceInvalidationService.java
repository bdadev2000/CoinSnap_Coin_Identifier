package androidx.room;

import D0.f;
import D0.g;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5146c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final f f5147d = new f(this);

    /* renamed from: f, reason: collision with root package name */
    public final g f5148f = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f5148f;
    }
}
