package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class Arrangement$spacedBy$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f3788a = Alignment.Companion.f14670n;

    public Arrangement$spacedBy$2() {
        super(2);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(this.f3788a.a(0, ((Number) obj).intValue(), (LayoutDirection) obj2));
    }
}
