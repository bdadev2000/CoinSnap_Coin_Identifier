package he;

import android.graphics.PointF;
import com.google.common.collect.c1;

/* loaded from: classes4.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f19049d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PointF[] f19050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f19051g;

    public i(s sVar, float f10, boolean z10, float f11, PointF[] pointFArr) {
        this.f19051g = sVar;
        this.f19047b = f10;
        this.f19048c = z10;
        this.f19049d = f11;
        this.f19050f = pointFArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f19051g;
        if (sVar.g0(sVar.Z, this.f19047b)) {
            sVar.d0();
            if (this.f19048c) {
                y yVar = sVar.f19028c;
                ((c1) yVar).k(this.f19049d, this.f19050f);
            }
        }
    }
}
