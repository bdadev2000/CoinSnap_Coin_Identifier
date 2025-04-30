package S0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f2773a;
    public l b;

    public d(j jVar) {
        this.f2773a = jVar;
    }

    @Override // S0.k
    public final void b(int i9, float f9, int i10) {
        if (this.b == null) {
            return;
        }
        float f10 = -f9;
        int i11 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f2773a;
            if (i11 < linearLayoutManager.getChildCount()) {
                View childAt = linearLayoutManager.getChildAt(i11);
                if (childAt != null) {
                    this.b.a(childAt, (linearLayoutManager.getPosition(childAt) - i9) + f10);
                    i11++;
                } else {
                    Locale locale = Locale.US;
                    throw new IllegalStateException(AbstractC2914a.c(i11, linearLayoutManager.getChildCount(), "LayoutManager returned a null child at pos ", "/", " while transforming pages"));
                }
            } else {
                return;
            }
        }
    }

    @Override // S0.k
    public final void a(int i9) {
    }

    @Override // S0.k
    public final void c(int i9) {
    }
}
