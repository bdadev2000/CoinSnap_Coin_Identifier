package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ButtonKt$OutlinedButton$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f8091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f8092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8093c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ButtonColors f8094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ButtonElevation f8095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8096h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8097i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8098j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f8099k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8101m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonKt$OutlinedButton$1(q0.a aVar, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3) {
        super(2);
        this.f8091a = aVar;
        this.f8092b = modifier;
        this.f8093c = z2;
        this.d = shape;
        this.f8094f = buttonColors;
        this.f8095g = buttonElevation;
        this.f8096h = borderStroke;
        this.f8097i = paddingValues;
        this.f8098j = mutableInteractionSource;
        this.f8099k = qVar;
        this.f8100l = i2;
        this.f8101m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ButtonKt.b(this.f8091a, this.f8092b, this.f8093c, this.d, this.f8094f, this.f8095g, this.f8096h, this.f8097i, this.f8098j, this.f8099k, (Composer) obj, RecomposeScopeImplKt.a(this.f8100l | 1), this.f8101m);
        return b0.f30125a;
    }
}
