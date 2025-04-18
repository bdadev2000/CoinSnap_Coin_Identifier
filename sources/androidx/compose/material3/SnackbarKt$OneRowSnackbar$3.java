package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SnackbarKt$OneRowSnackbar$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11568c;
    public final /* synthetic */ TextStyle d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11570g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11571h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$3(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, int i2) {
        super(2);
        this.f11566a = pVar;
        this.f11567b = pVar2;
        this.f11568c = pVar3;
        this.d = textStyle;
        this.f11569f = j2;
        this.f11570g = j3;
        this.f11571h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SnackbarKt.d(this.f11566a, this.f11567b, this.f11568c, this.d, this.f11569f, this.f11570g, (Composer) obj, RecomposeScopeImplKt.a(this.f11571h | 1));
        return b0.f30125a;
    }
}
