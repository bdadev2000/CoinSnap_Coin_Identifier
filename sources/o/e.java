package o;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22917b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22919d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Parcelable f22920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22921g;

    public e(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f22921g = systemForegroundService;
        this.f22918c = i10;
        this.f22920f = notification;
        this.f22919d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22917b;
        int i11 = this.f22919d;
        int i12 = this.f22918c;
        Parcelable parcelable = this.f22920f;
        Object obj = this.f22921g;
        switch (i10) {
            case 0:
                ((g) obj).f22930c.onActivityResized(i12, i11, (Bundle) parcelable);
                return;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    ((SystemForegroundService) obj).startForeground(i12, (Notification) parcelable, i11);
                    return;
                } else {
                    ((SystemForegroundService) obj).startForeground(i12, (Notification) parcelable);
                    return;
                }
        }
    }

    public e(g gVar, int i10, int i11, Bundle bundle) {
        this.f22921g = gVar;
        this.f22918c = i10;
        this.f22919d = i11;
        this.f22920f = bundle;
    }
}
