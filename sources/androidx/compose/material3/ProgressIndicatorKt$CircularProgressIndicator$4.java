package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f10636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10637c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10640h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10641i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10642j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$4(q0.a aVar, Modifier modifier, long j2, float f2, long j3, int i2, float f3, int i3, int i4) {
        super(2);
        this.f10635a = aVar;
        this.f10636b = modifier;
        this.f10637c = j2;
        this.d = f2;
        this.f10638f = j3;
        this.f10639g = i2;
        this.f10640h = f3;
        this.f10641i = i3;
        this.f10642j = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ProgressIndicatorKt.b(this.f10635a, this.f10636b, this.f10637c, this.d, this.f10638f, this.f10639g, this.f10640h, (Composer) obj, RecomposeScopeImplKt.a(this.f10641i | 1), this.f10642j);
        return b0.f30125a;
    }
}
