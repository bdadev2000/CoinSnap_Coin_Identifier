package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IconKt$Icon$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Painter f9605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f9607c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$3(Painter painter, String str, Modifier modifier, long j2, int i2, int i3) {
        super(2);
        this.f9605a = painter;
        this.f9606b = str;
        this.f9607c = modifier;
        this.d = j2;
        this.f9608f = i2;
        this.f9609g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        IconKt.a(this.f9605a, this.f9606b, this.f9607c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f9608f | 1), this.f9609g);
        return b0.f30125a;
    }
}
