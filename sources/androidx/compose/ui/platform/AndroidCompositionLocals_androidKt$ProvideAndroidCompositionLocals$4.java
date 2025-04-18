package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.p f16345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(AndroidComposeView androidComposeView, q0.p pVar, int i2) {
        super(2);
        this.f16344a = androidComposeView;
        this.f16345b = pVar;
        this.f16346c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f16346c | 1);
        AndroidCompositionLocals_androidKt.a(this.f16344a, this.f16345b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
