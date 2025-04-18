package fe;

import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f17846c;

    public /* synthetic */ i(c1 c1Var, int i10) {
        this.f17845b = i10;
        this.f17846c = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17845b;
        c1 c1Var = this.f17846c;
        switch (i10) {
            case 0:
                Iterator it = ((CameraView) c1Var.f11925d).f16492t.iterator();
                while (it.hasNext()) {
                    ((ng.c) it.next()).getClass();
                }
                return;
            case 1:
                Iterator it2 = ((CameraView) c1Var.f11925d).f16492t.iterator();
                while (it2.hasNext()) {
                    ((ng.c) it2.next()).getClass();
                }
                return;
            case 2:
                Iterator it3 = ((CameraView) c1Var.f11925d).f16492t.iterator();
                while (it3.hasNext()) {
                    ((ng.c) it3.next()).getClass();
                }
                return;
            case 3:
                ((CameraView) c1Var.f11925d).requestLayout();
                return;
            default:
                Iterator it4 = ((CameraView) c1Var.f11925d).f16492t.iterator();
                while (it4.hasNext()) {
                    ((ng.c) it4.next()).getClass();
                }
                return;
        }
    }
}
