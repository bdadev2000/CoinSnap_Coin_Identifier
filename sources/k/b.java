package k;

import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.b2;

/* loaded from: classes.dex */
public final class b extends b2 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f20053l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f20053l = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.b2
    public final g0 b() {
        androidx.appcompat.widget.h hVar;
        c cVar = this.f20053l.f638h;
        if (cVar == null || (hVar = ((androidx.appcompat.widget.i) cVar).a.f934v) == null) {
            return null;
        }
        return hVar.a();
    }

    @Override // androidx.appcompat.widget.b2
    public final boolean c() {
        g0 b3;
        ActionMenuItemView actionMenuItemView = this.f20053l;
        n nVar = actionMenuItemView.f636f;
        if (nVar == null || !nVar.a(actionMenuItemView.f633b) || (b3 = b()) == null || !b3.a()) {
            return false;
        }
        return true;
    }
}
