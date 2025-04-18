package androidx.compose.foundation;

import android.content.Context;
import android.view.SurfaceView;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidExternalSurfaceState f2477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1(l lVar, AndroidExternalSurfaceState androidExternalSurfaceState) {
        super(1);
        this.f2476a = lVar;
        this.f2477b = androidExternalSurfaceState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SurfaceView surfaceView = new SurfaceView((Context) obj);
        l lVar = this.f2476a;
        AndroidExternalSurfaceState androidExternalSurfaceState = this.f2477b;
        lVar.invoke(androidExternalSurfaceState);
        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
        return surfaceView;
    }
}
