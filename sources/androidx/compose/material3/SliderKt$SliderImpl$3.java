package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SliderKt$SliderImpl$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderState f11434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11435c;
    public final /* synthetic */ MutableInteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f11436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f11437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$3(Modifier modifier, SliderState sliderState, boolean z2, MutableInteractionSource mutableInteractionSource, q qVar, q qVar2, int i2) {
        super(2);
        this.f11433a = modifier;
        this.f11434b = sliderState;
        this.f11435c = z2;
        this.d = mutableInteractionSource;
        this.f11436f = qVar;
        this.f11437g = qVar2;
        this.f11438h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SliderKt.f(this.f11433a, this.f11434b, this.f11435c, this.d, this.f11436f, this.f11437g, (Composer) obj, RecomposeScopeImplKt.a(this.f11438h | 1));
        return b0.f30125a;
    }
}
