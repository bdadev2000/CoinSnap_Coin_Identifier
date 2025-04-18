package androidx.compose.foundation;

import android.view.SurfaceView;
import androidx.compose.ui.unit.IntSize;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2481c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1(int i2, boolean z2, boolean z3, long j2) {
        super(1);
        this.f2479a = j2;
        this.f2480b = z2;
        this.f2481c = i2;
        this.d = z3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SurfaceView surfaceView = (SurfaceView) obj;
        long j2 = this.f2479a;
        if (IntSize.b(j2, 0L)) {
            surfaceView.getHolder().setSizeFromLayout();
        } else {
            surfaceView.getHolder().setFixedSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        surfaceView.getHolder().setFormat(this.f2480b ? -1 : -3);
        int i2 = this.f2481c;
        if (i2 == 0) {
            surfaceView.setZOrderOnTop(false);
        } else if (i2 == 1) {
            surfaceView.setZOrderMediaOverlay(true);
        } else if (i2 == 2) {
            surfaceView.setZOrderOnTop(true);
        }
        surfaceView.setSecure(this.d);
        return b0.f30125a;
    }
}
