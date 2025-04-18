package androidx.compose.ui.text.platform;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class AndroidTextPaint$setBrush$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Brush f17423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextPaint$setBrush$1(Brush brush, long j2) {
        super(0);
        this.f17423a = brush;
        this.f17424b = j2;
    }

    @Override // q0.a
    public final Object invoke() {
        return ((ShaderBrush) this.f17423a).b(this.f17424b);
    }
}
