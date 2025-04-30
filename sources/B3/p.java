package B3;

import android.view.View;
import p1.DialogC2540d;

/* loaded from: classes2.dex */
public final class p extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC2540d f301a;

    public p(DialogC2540d dialogC2540d) {
        this.f301a = dialogC2540d;
    }

    @Override // B3.h
    public final void c(View view, int i9) {
        if (i9 == 5) {
            this.f301a.cancel();
        }
    }

    @Override // B3.h
    public final void b(View view) {
    }
}
