package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class m0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1209e;

    @Override // androidx.core.app.t0
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // androidx.core.app.t0
    public final void b(c1 c1Var) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(c1Var.f1185b).setBigContentTitle((CharSequence) this.f1250c).bigText(this.f1209e);
        if (this.a) {
            bigText.setSummaryText((CharSequence) this.f1251d);
        }
    }

    @Override // androidx.core.app.t0
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
