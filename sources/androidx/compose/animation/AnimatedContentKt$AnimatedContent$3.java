package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AnimatedContentKt$AnimatedContent$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f1630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1631c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f1633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q0.r f1634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1635i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1636j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$3(Object obj, Modifier modifier, l lVar, Alignment alignment, String str, l lVar2, q0.r rVar, int i2, int i3) {
        super(2);
        this.f1629a = obj;
        this.f1630b = modifier;
        this.f1631c = lVar;
        this.d = alignment;
        this.f1632f = str;
        this.f1633g = lVar2;
        this.f1634h = rVar;
        this.f1635i = i2;
        this.f1636j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AnimatedContentKt.b(this.f1629a, this.f1630b, this.f1631c, this.d, this.f1632f, this.f1633g, this.f1634h, (Composer) obj, RecomposeScopeImplKt.a(this.f1635i | 1), this.f1636j);
        return b0.f30125a;
    }
}
