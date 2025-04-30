package u0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2746a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f23057a;
    public final BroadcastReceiver b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23058c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23059d;

    public C2746a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f23057a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.f23057a);
        if (this.f23059d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
