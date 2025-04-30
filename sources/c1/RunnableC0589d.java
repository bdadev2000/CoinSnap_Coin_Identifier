package c1;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import u.BinderC2735d;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0589d implements Runnable {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5386d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Parcelable f5387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5388g;

    public RunnableC0589d(SystemForegroundService systemForegroundService, int i9, Notification notification, int i10) {
        this.f5388g = systemForegroundService;
        this.f5385c = i9;
        this.f5387f = notification;
        this.f5386d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                int i9 = Build.VERSION.SDK_INT;
                Notification notification = (Notification) this.f5387f;
                int i10 = this.f5385c;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f5388g;
                if (i9 >= 29) {
                    systemForegroundService.startForeground(i10, notification, this.f5386d);
                    return;
                } else {
                    systemForegroundService.startForeground(i10, notification);
                    return;
                }
            default:
                ((BinderC2735d) this.f5388g).f23039c.onActivityResized(this.f5385c, this.f5386d, (Bundle) this.f5387f);
                return;
        }
    }

    public RunnableC0589d(BinderC2735d binderC2735d, int i9, int i10, Bundle bundle) {
        this.f5388g = binderC2735d;
        this.f5385c = i9;
        this.f5386d = i10;
        this.f5387f = bundle;
    }
}
