package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;

@ExperimentalRoomApi
/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f21310a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f21311b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final MultiInstanceInvalidationService$callbackList$1 f21312c = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, Object obj) {
            p0.a.s(iMultiInstanceInvalidationCallback, "callback");
            p0.a.s(obj, "cookie");
            MultiInstanceInvalidationService.this.f21311b.remove((Integer) obj);
        }
    };
    public final MultiInstanceInvalidationService$binder$1 d = new MultiInstanceInvalidationService$binder$1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        p0.a.s(intent, SDKConstants.PARAM_INTENT);
        return this.d;
    }
}
