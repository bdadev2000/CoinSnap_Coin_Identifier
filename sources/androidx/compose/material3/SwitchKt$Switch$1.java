package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SwitchKt$Switch$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11695c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwitchColors f11697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11698h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11699i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11700j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$1(boolean z2, l lVar, Modifier modifier, p pVar, boolean z3, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        super(2);
        this.f11693a = z2;
        this.f11694b = lVar;
        this.f11695c = modifier;
        this.d = pVar;
        this.f11696f = z3;
        this.f11697g = switchColors;
        this.f11698h = mutableInteractionSource;
        this.f11699i = i2;
        this.f11700j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SwitchKt.a(this.f11693a, this.f11694b, this.f11695c, this.d, this.f11696f, this.f11697g, this.f11698h, (Composer) obj, RecomposeScopeImplKt.a(this.f11699i | 1), this.f11700j);
        return b0.f30125a;
    }
}
