package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidUriHandler f16342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.p f16343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(AndroidComposeView androidComposeView, AndroidUriHandler androidUriHandler, q0.p pVar) {
        super(2);
        this.f16341a = androidComposeView;
        this.f16342b = androidUriHandler;
        this.f16343c = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            CompositionLocalsKt.a(this.f16341a, this.f16342b, this.f16343c, composer, 0);
        }
        return b0.f30125a;
    }
}
