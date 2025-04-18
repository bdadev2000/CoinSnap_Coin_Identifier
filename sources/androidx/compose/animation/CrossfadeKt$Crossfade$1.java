package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CrossfadeKt$Crossfade$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f1783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f1784c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f1785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1787h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$1(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, String str, q qVar, int i2, int i3) {
        super(2);
        this.f1782a = obj;
        this.f1783b = modifier;
        this.f1784c = finiteAnimationSpec;
        this.d = str;
        this.f1785f = qVar;
        this.f1786g = i2;
        this.f1787h = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CrossfadeKt.b(this.f1782a, this.f1783b, this.f1784c, this.d, this.f1785f, (Composer) obj, RecomposeScopeImplKt.a(this.f1786g | 1), this.f1787h);
        return b0.f30125a;
    }
}
