package androidx.compose.foundation;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ImageKt$Image$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final ImageKt$Image$1 f2741a = new Object();

    /* renamed from: androidx.compose.foundation.ImageKt$Image$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f2742a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        return measureScope.T(Constraints.k(j2), Constraints.j(j2), x.f30219a, AnonymousClass1.f2742a);
    }
}
