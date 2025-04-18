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
public final class ButtonKt$Button$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f8058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f8059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8060c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ButtonColors f8061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ButtonElevation f8062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8063h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8064i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8065j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f8066k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonKt$Button$3(q0.a aVar, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3) {
        super(2);
        this.f8058a = aVar;
        this.f8059b = modifier;
        this.f8060c = z2;
        this.d = shape;
        this.f8061f = buttonColors;
        this.f8062g = buttonElevation;
        this.f8063h = borderStroke;
        this.f8064i = paddingValues;
        this.f8065j = mutableInteractionSource;
        this.f8066k = qVar;
        this.f8067l = i2;
        this.f8068m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ButtonKt.a(this.f8058a, this.f8059b, this.f8060c, this.d, this.f8061f, this.f8062g, this.f8063h, this.f8064i, this.f8065j, this.f8066k, (Composer) obj, RecomposeScopeImplKt.a(this.f8067l | 1), this.f8068m);
        return b0.f30125a;
    }
}
