package androidx.compose.material3;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawerState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f9250a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$Companion$Saver$2(l lVar) {
        super(1);
        this.f9250a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new DrawerState((DrawerValue) obj, this.f9250a);
    }
}
