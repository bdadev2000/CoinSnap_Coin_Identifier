package androidx.compose.material3;

import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ScaffoldKt$Scaffold$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f10797c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f10799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f10800h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$2(int i2, p pVar, q qVar, p pVar2, p pVar3, MutableWindowInsets mutableWindowInsets, p pVar4) {
        super(2);
        this.f10795a = i2;
        this.f10796b = pVar;
        this.f10797c = qVar;
        this.d = pVar2;
        this.f10798f = pVar3;
        this.f10799g = mutableWindowInsets;
        this.f10800h = pVar4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ScaffoldKt.b(this.f10795a, this.f10796b, this.f10797c, this.d, this.f10798f, this.f10799g, this.f10800h, composer, 0);
        }
        return b0.f30125a;
    }
}
