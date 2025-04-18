package he;

import android.graphics.PointF;
import android.hardware.Camera;
import com.google.common.collect.c1;

/* loaded from: classes4.dex */
public final class b implements Camera.AutoFocusCallback {
    public final /* synthetic */ k.g a;

    public b(k.g gVar) {
        this.a = gVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z10, Camera camera) {
        k.g gVar = this.a;
        boolean z11 = false;
        ((g) gVar.f20065g).f19029d.c(0, "focus end");
        Object obj = gVar.f20065g;
        ((g) obj).f19029d.c(0, "focus reset");
        ((c1) ((g) obj).f19028c).i((se.a) gVar.f20063d, z10, (PointF) gVar.f20064f);
        long j3 = ((g) obj).N;
        int i10 = 1;
        if (j3 > 0 && j3 != Long.MAX_VALUE) {
            z11 = true;
        }
        if (z11) {
            g gVar2 = (g) obj;
            pe.j jVar = gVar2.f19029d;
            pe.f fVar = pe.f.ENGINE;
            long j10 = gVar2.N;
            androidx.activity.i iVar = new androidx.activity.i(this, 28);
            jVar.getClass();
            jVar.b(j10, "focus reset", new o(1, jVar, new pe.i(jVar, fVar, iVar, i10)), true);
        }
    }
}
