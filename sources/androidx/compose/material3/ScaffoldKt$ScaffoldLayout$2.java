package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ScaffoldKt$ScaffoldLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f10840c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f10843h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10844i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$2(int i2, p pVar, q qVar, p pVar2, p pVar3, WindowInsets windowInsets, p pVar4, int i3) {
        super(2);
        this.f10838a = i2;
        this.f10839b = pVar;
        this.f10840c = qVar;
        this.d = pVar2;
        this.f10841f = pVar3;
        this.f10842g = windowInsets;
        this.f10843h = pVar4;
        this.f10844i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ScaffoldKt.b(this.f10838a, this.f10839b, this.f10840c, this.d, this.f10841f, this.f10842g, this.f10843h, (Composer) obj, RecomposeScopeImplKt.a(this.f10844i | 1));
        return b0.f30125a;
    }
}
