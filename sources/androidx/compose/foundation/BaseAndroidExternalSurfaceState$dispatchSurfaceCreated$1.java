package androidx.compose.foundation;

import android.view.Surface;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", l = {Opcodes.IINC, Opcodes.L2F}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseAndroidExternalSurfaceState f2506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Surface f2507c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, Surface surface, int i2, int i3, g gVar) {
        super(2, gVar);
        this.f2506b = baseAndroidExternalSurfaceState;
        this.f2507c = surface;
        this.d = i2;
        this.f2508f = i3;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.f2506b, this.f2507c, this.d, this.f2508f, gVar);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.f2505a = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = (BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState = this.f2506b;
        baseAndroidExternalSurfaceState.getClass();
        baseAndroidExternalSurfaceState.getClass();
        return b0.f30125a;
    }
}
