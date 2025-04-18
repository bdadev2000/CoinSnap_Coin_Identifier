package he;

import android.hardware.Camera;

/* loaded from: classes4.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f19043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f19044d;

    public /* synthetic */ f(v vVar, float f10, int i10) {
        this.f19042b = i10;
        this.f19044d = vVar;
        this.f19043c = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19042b;
        float f10 = this.f19043c;
        v vVar = this.f19044d;
        switch (i10) {
            case 0:
                g gVar = (g) vVar;
                Camera.Parameters parameters = gVar.V.getParameters();
                if (gVar.c0(parameters, f10)) {
                    gVar.V.setParameters(parameters);
                    return;
                }
                return;
            default:
                s sVar = (s) vVar;
                if (sVar.c0(sVar.Z, f10)) {
                    sVar.d0();
                    return;
                }
                return;
        }
    }
}
