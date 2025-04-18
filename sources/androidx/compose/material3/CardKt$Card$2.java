package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CardKt$Card$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f8132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardColors f8133c;
    public final /* synthetic */ CardElevation d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f8135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardKt$Card$2(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, q qVar, int i2, int i3) {
        super(2);
        this.f8131a = modifier;
        this.f8132b = shape;
        this.f8133c = cardColors;
        this.d = cardElevation;
        this.f8134f = borderStroke;
        this.f8135g = qVar;
        this.f8136h = i2;
        this.f8137i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CardKt.a(this.f8131a, this.f8132b, this.f8133c, this.d, this.f8134f, this.f8135g, (Composer) obj, RecomposeScopeImplKt.a(this.f8136h | 1), this.f8137i);
        return b0.f30125a;
    }
}
