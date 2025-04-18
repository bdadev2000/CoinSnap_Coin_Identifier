package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntRect;
import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PopupLayout$updatePosition$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f17698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntRect f17700c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$updatePosition$1(e0 e0Var, PopupLayout popupLayout, IntRect intRect, long j2, long j3) {
        super(0);
        this.f17698a = e0Var;
        this.f17699b = popupLayout;
        this.f17700c = intRect;
        this.d = j2;
        this.f17701f = j3;
    }

    @Override // q0.a
    public final Object invoke() {
        PopupLayout popupLayout = this.f17699b;
        this.f17698a.f30927a = popupLayout.getPositionProvider().a(this.f17700c, this.d, popupLayout.getParentLayoutDirection(), this.f17701f);
        return b0.f30125a;
    }
}
