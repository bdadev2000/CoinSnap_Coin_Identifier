package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidDialog_androidKt$Dialog$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f17602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogProperties f17603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f17604c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$3(q0.a aVar, DialogProperties dialogProperties, p pVar, int i2, int i3) {
        super(2);
        this.f17602a = aVar;
        this.f17603b = dialogProperties;
        this.f17604c = pVar;
        this.d = i2;
        this.f17605f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidDialog_androidKt.a(this.f17602a, this.f17603b, this.f17604c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f17605f);
        return b0.f30125a;
    }
}
