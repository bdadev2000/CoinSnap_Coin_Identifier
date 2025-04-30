package p;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import q.AbstractViewOnTouchListenerC2627u0;
import q.C2597f;
import q.C2599g;
import q.C2603i;
import q.C2605j;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2523b extends AbstractViewOnTouchListenerC2627u0 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ View m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2523b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.m = actionMenuItemView;
    }

    @Override // q.AbstractViewOnTouchListenerC2627u0
    public final InterfaceC2519B b() {
        C2597f c2597f;
        switch (this.l) {
            case 0:
                AbstractC2524c abstractC2524c = ((ActionMenuItemView) this.m).f4123h;
                if (abstractC2524c == null || (c2597f = ((C2599g) abstractC2524c).f22656a.f22676v) == null) {
                    return null;
                }
                return c2597f.a();
            default:
                C2597f c2597f2 = ((C2603i) this.m).b.f22675u;
                if (c2597f2 == null) {
                    return null;
                }
                return c2597f2.a();
        }
    }

    @Override // q.AbstractViewOnTouchListenerC2627u0
    public final boolean c() {
        InterfaceC2519B b;
        switch (this.l) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.m;
                InterfaceC2532k interfaceC2532k = actionMenuItemView.f4121f;
                if (interfaceC2532k == null || !interfaceC2532k.a(actionMenuItemView.b) || (b = b()) == null || !b.a()) {
                    return false;
                }
                return true;
            default:
                ((C2603i) this.m).b.l();
                return true;
        }
    }

    @Override // q.AbstractViewOnTouchListenerC2627u0
    public boolean d() {
        switch (this.l) {
            case 1:
                C2605j c2605j = ((C2603i) this.m).b;
                if (c2605j.f22677w != null) {
                    return false;
                }
                c2605j.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2523b(C2603i c2603i, View view) {
        super(view);
        this.m = c2603i;
    }
}
