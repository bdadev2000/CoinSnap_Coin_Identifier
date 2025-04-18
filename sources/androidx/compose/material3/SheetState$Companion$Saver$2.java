package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SheetState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Density f11202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11203c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$Companion$Saver$2(Density density, l lVar, boolean z2, boolean z3) {
        super(1);
        this.f11201a = z2;
        this.f11202b = density;
        this.f11203c = lVar;
        this.d = z3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new SheetState(this.f11201a, this.f11202b, (SheetValue) obj, this.f11203c, this.d);
    }
}
