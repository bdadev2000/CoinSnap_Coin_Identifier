package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f10652c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10654g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10655h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$6(float f2, int i2, int i3, int i4, long j2, long j3, Modifier modifier) {
        super(2);
        this.f10650a = modifier;
        this.f10651b = j2;
        this.f10652c = f2;
        this.d = j3;
        this.f10653f = i2;
        this.f10654g = i3;
        this.f10655h = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Modifier modifier = this.f10650a;
        long j2 = this.f10651b;
        float f2 = this.f10652c;
        long j3 = this.d;
        ProgressIndicatorKt.c(f2, this.f10653f, RecomposeScopeImplKt.a(this.f10654g | 1), this.f10655h, j2, j3, (Composer) obj, modifier);
        return b0.f30125a;
    }
}
