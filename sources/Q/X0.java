package q;

import android.view.View;
import android.view.Window;
import p.C2522a;

/* loaded from: classes.dex */
public final class X0 implements View.OnClickListener {
    public final C2522a b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y0 f22609c;

    public X0(Y0 y02) {
        this.f22609c = y02;
        this.b = new C2522a(y02.f22611a.getContext(), y02.f22617h);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y0 y02 = this.f22609c;
        Window.Callback callback = y02.f22620k;
        if (callback != null && y02.l) {
            callback.onMenuItemSelected(0, this.b);
        }
    }
}
