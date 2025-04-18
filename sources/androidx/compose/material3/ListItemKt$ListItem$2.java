package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class ListItemKt$ListItem$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f9666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9668c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f9669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$2(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, ComposableLambdaImpl composableLambdaImpl4, ComposableLambdaImpl composableLambdaImpl5) {
        super(2);
        this.f9666a = composableLambdaImpl;
        this.f9667b = composableLambdaImpl2;
        this.f9668c = composableLambdaImpl3;
        this.d = composableLambdaImpl4;
        this.f9669f = composableLambdaImpl5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ListItemKt.a(this.f9666a, this.f9667b, this.f9668c, this.d, this.f9669f, composer, 384);
        }
        return b0.f30125a;
    }
}
