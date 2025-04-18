package he;

import android.graphics.PointF;
import android.hardware.Camera;
import com.google.common.collect.c1;

/* loaded from: classes4.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PointF[] f19035d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f19036f;

    public d(g gVar, float f10, boolean z10, PointF[] pointFArr) {
        this.f19036f = gVar;
        this.f19033b = f10;
        this.f19034c = z10;
        this.f19035d = pointFArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f19036f;
        Camera.Parameters parameters = gVar.V.getParameters();
        if (gVar.e0(parameters, this.f19033b)) {
            gVar.V.setParameters(parameters);
            if (this.f19034c) {
                ((c1) gVar.f19028c).k(gVar.u, this.f19035d);
            }
        }
    }
}
