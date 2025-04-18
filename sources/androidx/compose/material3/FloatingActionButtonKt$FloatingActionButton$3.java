package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FloatingActionButtonKt$FloatingActionButton$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f9484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f9485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Shape f9486c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f9487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButtonElevation f9488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f9489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f9490i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9491j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9492k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$3(q0.a aVar, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, p pVar, int i2, int i3) {
        super(2);
        this.f9484a = aVar;
        this.f9485b = modifier;
        this.f9486c = shape;
        this.d = j2;
        this.f9487f = j3;
        this.f9488g = floatingActionButtonElevation;
        this.f9489h = mutableInteractionSource;
        this.f9490i = pVar;
        this.f9491j = i2;
        this.f9492k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        FloatingActionButtonKt.a(this.f9484a, this.f9485b, this.f9486c, this.d, this.f9487f, this.f9488g, this.f9489h, this.f9490i, (Composer) obj, RecomposeScopeImplKt.a(this.f9491j | 1), this.f9492k);
        return b0.f30125a;
    }
}
