package c2;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0510u;
import androidx.lifecycle.InterfaceC0511v;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: c2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597h implements InterfaceC0596g, InterfaceC0510u {
    public final HashSet b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0505o f5392c;

    public C0597h(AbstractC0505o abstractC0505o) {
        this.f5392c = abstractC0505o;
        abstractC0505o.a(this);
    }

    @Override // c2.InterfaceC0596g
    public final void d(InterfaceC0598i interfaceC0598i) {
        this.b.remove(interfaceC0598i);
    }

    @Override // c2.InterfaceC0596g
    public final void g(InterfaceC0598i interfaceC0598i) {
        this.b.add(interfaceC0598i);
        EnumC0504n enumC0504n = ((C0513x) this.f5392c).f4904d;
        if (enumC0504n == EnumC0504n.b) {
            interfaceC0598i.onDestroy();
        } else if (enumC0504n.compareTo(EnumC0504n.f4894f) >= 0) {
            interfaceC0598i.onStart();
        } else {
            interfaceC0598i.onStop();
        }
    }

    @E(EnumC0503m.ON_DESTROY)
    public void onDestroy(@NonNull InterfaceC0511v interfaceC0511v) {
        Iterator it = j2.n.e(this.b).iterator();
        while (it.hasNext()) {
            ((InterfaceC0598i) it.next()).onDestroy();
        }
        interfaceC0511v.getLifecycle().b(this);
    }

    @E(EnumC0503m.ON_START)
    public void onStart(@NonNull InterfaceC0511v interfaceC0511v) {
        Iterator it = j2.n.e(this.b).iterator();
        while (it.hasNext()) {
            ((InterfaceC0598i) it.next()).onStart();
        }
    }

    @E(EnumC0503m.ON_STOP)
    public void onStop(@NonNull InterfaceC0511v interfaceC0511v) {
        Iterator it = j2.n.e(this.b).iterator();
        while (it.hasNext()) {
            ((InterfaceC0598i) it.next()).onStop();
        }
    }
}
