package androidx.compose.material3;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavigationDrawerKt$rememberDrawerState$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerValue f10205a = DrawerValue.f9261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$rememberDrawerState$2$1(l lVar) {
        super(0);
        this.f10206b = lVar;
    }

    @Override // q0.a
    public final Object invoke() {
        return new DrawerState(this.f10205a, this.f10206b);
    }
}
