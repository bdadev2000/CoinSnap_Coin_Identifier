package na;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22618c;

    public /* synthetic */ h(Object obj, int i10) {
        this.f22617b = i10;
        this.f22618c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        int i10 = this.f22617b;
        Object obj = this.f22618c;
        switch (i10) {
            case 0:
                j jVar = (j) obj;
                jVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - jVar.f22629o;
                    if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        jVar.f22627m = false;
                    }
                    jVar.u();
                    jVar.f22627m = true;
                    jVar.f22629o = System.currentTimeMillis();
                }
                return false;
            default:
                return hh.f.a((hh.d) obj, view, motionEvent);
        }
    }
}
