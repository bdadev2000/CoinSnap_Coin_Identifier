package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes3.dex */
public class LifecycleService extends Service implements LifecycleOwner {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceLifecycleDispatcher f20023a = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f20023a.f20111a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        p0.a.s(intent, SDKConstants.PARAM_INTENT);
        this.f20023a.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f20023a.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Lifecycle.Event event = Lifecycle.Event.ON_STOP;
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.f20023a;
        serviceLifecycleDispatcher.a(event);
        serviceLifecycleDispatcher.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i2) {
        this.f20023a.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
