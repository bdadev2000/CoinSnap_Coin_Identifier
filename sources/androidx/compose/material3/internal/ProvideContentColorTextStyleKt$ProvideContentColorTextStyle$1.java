package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProvideContentColorTextStyleKt$ProvideContentColorTextStyle$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextStyle f13032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f13033c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvideContentColorTextStyleKt$ProvideContentColorTextStyle$1(long j2, TextStyle textStyle, p pVar, int i2) {
        super(2);
        this.f13031a = j2;
        this.f13032b = textStyle;
        this.f13033c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ProvideContentColorTextStyleKt.a(this.f13031a, this.f13032b, this.f13033c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1));
        return b0.f30125a;
    }
}
