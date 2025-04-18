package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.unit.IntSize;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidEmbeddedExternalSurfaceState f2468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2469c;
    public final /* synthetic */ float[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1(long j2, AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, boolean z2, float[] fArr) {
        super(1);
        this.f2467a = j2;
        this.f2468b = androidEmbeddedExternalSurfaceState;
        this.f2469c = z2;
        this.d = fArr;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Matrix matrix;
        SurfaceTexture surfaceTexture;
        TextureView textureView = (TextureView) obj;
        long j2 = this.f2467a;
        if (!IntSize.b(j2, 0L) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize((int) (j2 >> 32), (int) (4294967295L & j2));
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = this.f2468b;
        androidEmbeddedExternalSurfaceState.f2459b = j2;
        textureView.setOpaque(this.f2469c);
        float[] fArr = this.d;
        if (fArr != null) {
            matrix = androidEmbeddedExternalSurfaceState.f2460c;
            AndroidMatrixConversions_androidKt.a(matrix, fArr);
        } else {
            matrix = null;
        }
        textureView.setTransform(matrix);
        return b0.f30125a;
    }
}
