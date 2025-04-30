package c2;

import androidx.lifecycle.AbstractC0505o;
import java.util.HashMap;

/* renamed from: c2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599j implements InterfaceC0598i {
    public final /* synthetic */ AbstractC0505o b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E1.d f5393c;

    public C0599j(E1.d dVar, AbstractC0505o abstractC0505o) {
        this.f5393c = dVar;
        this.b = abstractC0505o;
    }

    @Override // c2.InterfaceC0598i
    public final void onDestroy() {
        ((HashMap) this.f5393c.f973c).remove(this.b);
    }

    @Override // c2.InterfaceC0598i
    public final void onStart() {
    }

    @Override // c2.InterfaceC0598i
    public final void onStop() {
    }
}
