package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DividerKt$HorizontalDivider$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f9231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f9232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9233c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividerKt$HorizontalDivider$2(float f2, int i2, int i3, long j2, Modifier modifier) {
        super(2);
        this.f9231a = modifier;
        this.f9232b = f2;
        this.f9233c = j2;
        this.d = i2;
        this.f9234f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Modifier modifier = this.f9231a;
        float f2 = this.f9232b;
        long j2 = this.f9233c;
        DividerKt.a(f2, RecomposeScopeImplKt.a(this.d | 1), this.f9234f, j2, (Composer) obj, modifier);
        return b0.f30125a;
    }
}
