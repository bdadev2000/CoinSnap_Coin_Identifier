package U3;

import android.view.View;

/* renamed from: U3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0303a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3138a;
    public final /* synthetic */ p b;

    public /* synthetic */ ViewOnFocusChangeListenerC0303a(p pVar, int i9) {
        this.f3138a = i9;
        this.b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        switch (this.f3138a) {
            case 0:
                d dVar = (d) this.b;
                dVar.t(dVar.u());
                return;
            default:
                k kVar = (k) this.b;
                kVar.l = z8;
                kVar.q();
                if (!z8) {
                    kVar.t(false);
                    kVar.m = false;
                    return;
                }
                return;
        }
    }
}
