package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class SegmentedButtonDefaults$Icon$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonDefaults$Icon$2(p pVar, p pVar2) {
        super(3);
        this.f11089a = pVar;
        this.f11090b = pVar2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.a(booleanValue) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            if (booleanValue) {
                composer.J(94251810);
                pVar = this.f11089a;
            } else {
                composer.J(94252484);
                pVar = this.f11090b;
            }
            pVar.invoke(composer, 0);
            composer.D();
        }
        return b0.f30125a;
    }
}
