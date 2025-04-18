package m1;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class a {
    public final IntentFilter a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f21423b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21424c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21425d;

    public a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.a = intentFilter;
        this.f21423b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f21423b);
        sb2.append(" filter=");
        sb2.append(this.a);
        if (this.f21425d) {
            sb2.append(" DEAD");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
