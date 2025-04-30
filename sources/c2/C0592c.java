package c2;

import android.content.Context;
import android.net.ConnectivityManager;
import b1.C0552e;
import java.util.HashSet;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592c implements InterfaceC0591b {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0590a f5389c;

    public C0592c(Context context, com.bumptech.glide.l lVar) {
        this.b = context.getApplicationContext();
        this.f5389c = lVar;
    }

    @Override // c2.InterfaceC0598i
    public final void onStart() {
        p b = p.b(this.b);
        InterfaceC0590a interfaceC0590a = this.f5389c;
        synchronized (b) {
            ((HashSet) b.f5402c).add(interfaceC0590a);
            b.c();
        }
    }

    @Override // c2.InterfaceC0598i
    public final void onStop() {
        p b = p.b(this.b);
        InterfaceC0590a interfaceC0590a = this.f5389c;
        synchronized (b) {
            ((HashSet) b.f5402c).remove(interfaceC0590a);
            if (b.f5403d && ((HashSet) b.f5402c).isEmpty()) {
                H0.b bVar = (H0.b) b.f5404f;
                ((ConnectivityManager) ((j2.h) bVar.f1346d).get()).unregisterNetworkCallback((C0552e) bVar.f1347e);
                b.f5403d = false;
            }
        }
    }

    @Override // c2.InterfaceC0598i
    public final void onDestroy() {
    }
}
