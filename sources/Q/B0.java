package q;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class B0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f22511a;

    public B0(C0 c02) {
        this.f22511a = c02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i9) {
        if (i9 == 1) {
            C0 c02 = this.f22511a;
            if (c02.f22515B.getInputMethodMode() != 2 && c02.f22515B.getContentView() != null) {
                Handler handler = c02.f22534x;
                RunnableC2637z0 runnableC2637z0 = c02.f22530t;
                handler.removeCallbacks(runnableC2637z0);
                runnableC2637z0.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i9, int i10, int i11) {
    }
}
