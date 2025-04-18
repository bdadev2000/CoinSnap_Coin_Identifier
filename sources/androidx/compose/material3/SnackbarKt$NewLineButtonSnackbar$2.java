package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SnackbarKt$NewLineButtonSnackbar$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11552c;
    public final /* synthetic */ TextStyle d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11555h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$NewLineButtonSnackbar$2(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, int i2) {
        super(2);
        this.f11550a = pVar;
        this.f11551b = pVar2;
        this.f11552c = pVar3;
        this.d = textStyle;
        this.f11553f = j2;
        this.f11554g = j3;
        this.f11555h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SnackbarKt.c(this.f11550a, this.f11551b, this.f11552c, this.d, this.f11553f, this.f11554g, (Composer) obj, RecomposeScopeImplKt.a(this.f11555h | 1));
        return b0.f30125a;
    }
}
