package fe;

import android.graphics.PointF;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f17843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f17844c;

    public h(c1 c1Var, float f10, float[] fArr, PointF[] pointFArr) {
        this.f17844c = c1Var;
        this.f17843b = fArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = ((CameraView) this.f17844c.f11925d).f16492t.iterator();
        while (it.hasNext()) {
            ((ng.c) it.next()).getClass();
            float[] bounds = this.f17843b;
            Intrinsics.checkNotNullParameter(bounds, "bounds");
        }
    }
}
