package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SwitchKt$SwitchImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11703c;
    public final /* synthetic */ SwitchColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f11704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f11705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shape f11706h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2(Modifier modifier, boolean z2, boolean z3, SwitchColors switchColors, p pVar, InteractionSource interactionSource, Shape shape, int i2) {
        super(2);
        this.f11701a = modifier;
        this.f11702b = z2;
        this.f11703c = z3;
        this.d = switchColors;
        this.f11704f = pVar;
        this.f11705g = interactionSource;
        this.f11706h = shape;
        this.f11707i = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SwitchKt.b(this.f11701a, this.f11702b, this.f11703c, this.d, this.f11704f, this.f11705g, this.f11706h, (Composer) obj, RecomposeScopeImplKt.a(this.f11707i | 1));
        return b0.f30125a;
    }
}
