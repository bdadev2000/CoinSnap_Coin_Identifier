package androidx.compose.material3;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$2$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f10128c;

    @e(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", l = {350}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f10129a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DrawerState drawerState, g gVar) {
            super(2, gVar);
            this.f10130b = drawerState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f10130b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f10129a;
            if (i2 == 0) {
                q.m(obj);
                this.f10129a = 1;
                if (this.f10130b.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$2$1(boolean z2, DrawerState drawerState, d0 d0Var) {
        super(0);
        this.f10126a = z2;
        this.f10127b = drawerState;
        this.f10128c = d0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        if (this.f10126a) {
            DrawerState drawerState = this.f10127b;
            if (((Boolean) drawerState.f9247a.d.invoke(DrawerValue.f9261a)).booleanValue()) {
                kotlin.jvm.internal.e.v(this.f10128c, null, 0, new AnonymousClass1(drawerState, null), 3);
            }
        }
        return b0.f30125a;
    }
}
