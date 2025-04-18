package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$8 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f10657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f10658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10659c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10663i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$8(float f2, Modifier modifier, long j2, float f3, long j3, int i2, int i3, int i4) {
        super(2);
        this.f10657a = f2;
        this.f10658b = modifier;
        this.f10659c = j2;
        this.d = f3;
        this.f10660f = j3;
        this.f10661g = i2;
        this.f10662h = i3;
        this.f10663i = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ProgressIndicatorKt.a(this.f10657a, this.f10658b, this.f10659c, this.d, this.f10660f, this.f10661g, (Composer) obj, RecomposeScopeImplKt.a(this.f10662h | 1), this.f10663i);
        return b0.f30125a;
    }
}
