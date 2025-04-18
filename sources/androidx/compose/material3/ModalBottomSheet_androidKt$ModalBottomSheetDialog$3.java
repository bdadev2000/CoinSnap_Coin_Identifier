package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheetDialog$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f9955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetProperties f9956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animatable f9957c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheetDialog$3(q0.a aVar, ModalBottomSheetProperties modalBottomSheetProperties, Animatable animatable, p pVar, int i2) {
        super(2);
        this.f9955a = aVar;
        this.f9956b = modalBottomSheetProperties;
        this.f9957c = animatable;
        this.d = pVar;
        this.f9958f = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ModalBottomSheet_androidKt.a(this.f9955a, this.f9956b, this.f9957c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f9958f | 1));
        return b0.f30125a;
    }
}
