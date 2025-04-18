package na;

import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f22604b;

    public /* synthetic */ b(n nVar, int i10) {
        this.a = i10;
        this.f22604b = nVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.a;
        n nVar = this.f22604b;
        switch (i10) {
            case 0:
                d dVar = (d) nVar;
                dVar.t(dVar.u());
                return;
            default:
                j jVar = (j) nVar;
                jVar.f22626l = z10;
                jVar.q();
                if (!z10) {
                    jVar.t(false);
                    jVar.f22627m = false;
                    return;
                }
                return;
        }
    }
}
