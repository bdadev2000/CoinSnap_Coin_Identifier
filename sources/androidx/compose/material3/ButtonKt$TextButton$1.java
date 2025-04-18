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
/* loaded from: classes4.dex */
public final class ButtonKt$TextButton$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f8102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f8103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8104c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ButtonColors f8105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ButtonElevation f8106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8107h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8108i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8109j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f8110k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8111l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8112m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonKt$TextButton$1(q0.a aVar, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3) {
        super(2);
        this.f8102a = aVar;
        this.f8103b = modifier;
        this.f8104c = z2;
        this.d = shape;
        this.f8105f = buttonColors;
        this.f8106g = buttonElevation;
        this.f8107h = borderStroke;
        this.f8108i = paddingValues;
        this.f8109j = mutableInteractionSource;
        this.f8110k = qVar;
        this.f8111l = i2;
        this.f8112m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ButtonKt.c(this.f8102a, this.f8103b, this.f8104c, this.d, this.f8105f, this.f8106g, this.f8107h, this.f8108i, this.f8109j, this.f8110k, (Composer) obj, RecomposeScopeImplKt.a(this.f8111l | 1), this.f8112m);
        return b0.f30125a;
    }
}
