package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$8 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10727c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f10728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10730h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$8(float f2, int i2, int i3, int i4, long j2, long j3, Modifier modifier) {
        super(2);
        this.f10725a = modifier;
        this.f10726b = j2;
        this.f10727c = j3;
        this.d = i2;
        this.f10728f = f2;
        this.f10729g = i3;
        this.f10730h = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Modifier modifier = this.f10725a;
        long j2 = this.f10726b;
        long j3 = this.f10727c;
        int i2 = this.d;
        ProgressIndicatorKt.f(this.f10728f, i2, RecomposeScopeImplKt.a(this.f10729g | 1), this.f10730h, j2, j3, (Composer) obj, modifier);
        return b0.f30125a;
    }
}
