package q;

import android.view.View;
import p.InterfaceC2519B;

/* renamed from: q.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2584G extends AbstractViewOnTouchListenerC2627u0 {
    public final /* synthetic */ L l;
    public final /* synthetic */ O m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2584G(O o3, View view, L l) {
        super(view);
        this.m = o3;
        this.l = l;
    }

    @Override // q.AbstractViewOnTouchListenerC2627u0
    public final InterfaceC2519B b() {
        return this.l;
    }

    @Override // q.AbstractViewOnTouchListenerC2627u0
    public final boolean c() {
        O o3 = this.m;
        if (!o3.getInternalPopup().a()) {
            o3.f22578h.l(o3.getTextDirection(), o3.getTextAlignment());
            return true;
        }
        return true;
    }
}
