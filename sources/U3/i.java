package U3;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnTouchListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3153c;

    public /* synthetic */ i(Object obj, int i9) {
        this.b = i9;
        this.f3153c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z8;
        switch (this.b) {
            case 0:
                k kVar = (k) this.f3153c;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f3163o;
                    if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z8) {
                        kVar.m = false;
                    }
                    kVar.u();
                    kVar.m = true;
                    kVar.f3163o = System.currentTimeMillis();
                }
                return false;
            default:
                return i7.f.a((i7.d) this.f3153c, view, motionEvent);
        }
    }
}
