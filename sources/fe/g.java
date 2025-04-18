package fe;

import android.graphics.PointF;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f17842b;

    public g(c1 c1Var, float f10, PointF[] pointFArr) {
        this.f17842b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = ((CameraView) this.f17842b.f11925d).f16492t.iterator();
        while (it.hasNext()) {
            float[] bounds = {0.0f, 1.0f};
            ((ng.c) it.next()).getClass();
            Intrinsics.checkNotNullParameter(bounds, "bounds");
        }
    }
}
