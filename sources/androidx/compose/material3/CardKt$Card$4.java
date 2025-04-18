package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
public final class CardKt$Card$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f8139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f8140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8141c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CardColors f8142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CardElevation f8143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8144h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8145i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f8146j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8147k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8148l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardKt$Card$4(q0.a aVar, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3) {
        super(2);
        this.f8139a = aVar;
        this.f8140b = modifier;
        this.f8141c = z2;
        this.d = shape;
        this.f8142f = cardColors;
        this.f8143g = cardElevation;
        this.f8144h = borderStroke;
        this.f8145i = mutableInteractionSource;
        this.f8146j = qVar;
        this.f8147k = i2;
        this.f8148l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CardKt.b(this.f8139a, this.f8140b, this.f8141c, this.d, this.f8142f, this.f8143g, this.f8144h, this.f8145i, this.f8146j, (Composer) obj, RecomposeScopeImplKt.a(this.f8147k | 1), this.f8148l);
        return b0.f30125a;
    }
}
