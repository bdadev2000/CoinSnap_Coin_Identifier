package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SearchBar_androidKt$SearchBarImpl$surface$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Shape f11028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f11029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f11030c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBarImpl$surface$1(Shape shape, SearchBarColors searchBarColors, float f2, float f3) {
        super(2);
        this.f11028a = shape;
        this.f11029b = searchBarColors;
        this.f11030c = f2;
        this.d = f3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Shape shape = this.f11028a;
            long j2 = this.f11029b.f10856a;
            SurfaceKt.a(null, shape, j2, ColorSchemeKt.c(j2, composer), this.f11030c, this.d, null, ComposableSingletons$SearchBar_androidKt.f8629b, composer, 12582912, 65);
        }
        return b0.f30125a;
    }
}
