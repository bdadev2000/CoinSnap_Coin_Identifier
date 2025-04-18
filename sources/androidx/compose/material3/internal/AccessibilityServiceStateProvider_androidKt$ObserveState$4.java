package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AccessibilityServiceStateProvider_androidKt$ObserveState$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f12768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f12769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f12770c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceStateProvider_androidKt$ObserveState$4(LifecycleOwner lifecycleOwner, l lVar, q0.a aVar, int i2, int i3) {
        super(2);
        this.f12768a = lifecycleOwner;
        this.f12769b = lVar;
        this.f12770c = aVar;
        this.d = i2;
        this.f12771f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AccessibilityServiceStateProvider_androidKt.a(this.f12768a, this.f12769b, this.f12770c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f12771f);
        return b0.f30125a;
    }
}
