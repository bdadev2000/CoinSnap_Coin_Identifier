package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextFieldImplKt$Decoration$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$Decoration$2(long j2, p pVar, int i2) {
        super(2);
        this.f13097a = j2;
        this.f13098b = pVar;
        this.f13099c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f13099c | 1);
        TextFieldImplKt.d(this.f13097a, this.f13098b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
