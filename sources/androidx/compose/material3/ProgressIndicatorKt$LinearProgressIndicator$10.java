package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$10 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f10682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f10683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10684c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10687h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$10(float f2, int i2, int i3, int i4, long j2, long j3, Modifier modifier) {
        super(2);
        this.f10682a = f2;
        this.f10683b = modifier;
        this.f10684c = j2;
        this.d = j3;
        this.f10685f = i2;
        this.f10686g = i3;
        this.f10687h = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        float f2 = this.f10682a;
        Modifier modifier = this.f10683b;
        long j2 = this.f10684c;
        long j3 = this.d;
        ProgressIndicatorKt.e(f2, this.f10685f, RecomposeScopeImplKt.a(this.f10686g | 1), this.f10687h, j2, j3, (Composer) obj, modifier);
        return b0.f30125a;
    }
}
