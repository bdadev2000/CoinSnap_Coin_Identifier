package k;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class s extends r implements ActionProvider.VisibilityListener {

    /* renamed from: d, reason: collision with root package name */
    public fb.c f20176d;

    public s(w wVar, Context context, ActionProvider actionProvider) {
        super(wVar, context, actionProvider);
    }

    @Override // k.r
    public final boolean a() {
        return this.f20174b.isVisible();
    }

    @Override // k.r
    public final View b(MenuItem menuItem) {
        return this.f20174b.onCreateActionView(menuItem);
    }

    @Override // k.r
    public final boolean c() {
        return this.f20174b.overridesItemVisibility();
    }

    @Override // k.r
    public final void d(fb.c cVar) {
        this.f20176d = cVar;
        this.f20174b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        fb.c cVar = this.f20176d;
        if (cVar != null) {
            o oVar = ((q) cVar.f17773c).f20162n;
            oVar.f20131h = true;
            oVar.p(true);
        }
    }
}
