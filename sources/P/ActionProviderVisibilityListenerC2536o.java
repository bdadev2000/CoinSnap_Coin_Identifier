package p;

import android.content.Context;
import android.view.ActionProvider;
import com.facebook.internal.C1838g;

/* renamed from: p.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC2536o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22151a;
    public C1838g b;

    /* renamed from: c, reason: collision with root package name */
    public final ActionProvider f22152c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f22153d;

    public ActionProviderVisibilityListenerC2536o(s sVar, Context context, ActionProvider actionProvider) {
        this.f22153d = sVar;
        this.f22151a = context;
        this.f22152c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z8) {
        C1838g c1838g = this.b;
        if (c1838g != null) {
            MenuC2533l menuC2533l = ((C2535n) c1838g.b).f22140p;
            menuC2533l.f22108j = true;
            menuC2533l.p(true);
        }
    }
}
