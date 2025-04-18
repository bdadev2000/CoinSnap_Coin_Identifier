package he;

import android.graphics.PointF;
import com.google.common.collect.c1;

/* loaded from: classes4.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f19054d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float[] f19055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PointF[] f19056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f19057h;

    public j(s sVar, float f10, boolean z10, float f11, float[] fArr, PointF[] pointFArr) {
        this.f19057h = sVar;
        this.f19052b = f10;
        this.f19053c = z10;
        this.f19054d = f11;
        this.f19055f = fArr;
        this.f19056g = pointFArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f19057h;
        if (sVar.Z(sVar.Z, this.f19052b)) {
            sVar.d0();
            if (this.f19053c) {
                y yVar = sVar.f19028c;
                ((c1) yVar).h(this.f19054d, this.f19055f, this.f19056g);
            }
        }
    }
}
