package androidx.compose.foundation;

import android.content.Context;
import android.view.TextureView;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidEmbeddedExternalSurfaceState f2463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1(AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, long j2, l lVar) {
        super(1);
        this.f2463a = androidEmbeddedExternalSurfaceState;
        this.f2464b = j2;
        this.f2465c = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextureView textureView = new TextureView((Context) obj);
        long j2 = this.f2464b;
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = this.f2463a;
        androidEmbeddedExternalSurfaceState.f2459b = j2;
        this.f2465c.invoke(androidEmbeddedExternalSurfaceState);
        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
        return textureView;
    }
}
