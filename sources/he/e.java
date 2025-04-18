package he;

import android.graphics.PointF;
import android.hardware.Camera;
import com.google.common.collect.c1;

/* loaded from: classes4.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float[] f19039d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PointF[] f19040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f19041g;

    public e(g gVar, float f10, boolean z10, float[] fArr, PointF[] pointFArr) {
        this.f19041g = gVar;
        this.f19037b = f10;
        this.f19038c = z10;
        this.f19039d = fArr;
        this.f19040f = pointFArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f19041g;
        Camera.Parameters parameters = gVar.V.getParameters();
        if (gVar.X(parameters, this.f19037b)) {
            gVar.V.setParameters(parameters);
            if (this.f19038c) {
                y yVar = gVar.f19028c;
                ((c1) yVar).h(gVar.f19101v, this.f19039d, this.f19040f);
            }
        }
    }
}
