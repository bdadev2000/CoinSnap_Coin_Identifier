package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AndroidDialog_androidKt$Dialog$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogWrapper f17599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f17600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogProperties f17601c;
    public final /* synthetic */ LayoutDirection d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2$1(DialogWrapper dialogWrapper, q0.a aVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.f17599a = dialogWrapper;
        this.f17600b = aVar;
        this.f17601c = dialogProperties;
        this.d = layoutDirection;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f17599a.d(this.f17600b, this.f17601c, this.d);
        return b0.f30125a;
    }
}
