package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IconKt$Icon$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageVector f9595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f9597c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9599g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$1(ImageVector imageVector, String str, Modifier modifier, long j2, int i2, int i3) {
        super(2);
        this.f9595a = imageVector;
        this.f9596b = str;
        this.f9597c = modifier;
        this.d = j2;
        this.f9598f = i2;
        this.f9599g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        IconKt.b(this.f9595a, this.f9596b, this.f9597c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f9598f | 1), this.f9599g);
        return b0.f30125a;
    }
}
