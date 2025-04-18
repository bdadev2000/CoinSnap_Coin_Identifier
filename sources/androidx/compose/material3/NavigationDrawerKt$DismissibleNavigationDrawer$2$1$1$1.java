package androidx.compose.material3;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f10072c;

    /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10073a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f10074b;

        @e(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", l = {467}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C00391 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f10075a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrawerState f10076b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00391(DrawerState drawerState, g gVar) {
                super(2, gVar);
                this.f10076b = drawerState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00391(this.f10076b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00391) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f10075a;
                if (i2 == 0) {
                    q.m(obj);
                    this.f10075a = 1;
                    if (this.f10076b.a(this) == aVar) {
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
        public AnonymousClass1(DrawerState drawerState, d0 d0Var) {
            super(0);
            this.f10073a = drawerState;
            this.f10074b = d0Var;
        }

        @Override // q0.a
        public final Object invoke() {
            DrawerState drawerState = this.f10073a;
            if (((Boolean) drawerState.f9247a.d.invoke(DrawerValue.f9261a)).booleanValue()) {
                kotlin.jvm.internal.e.v(this.f10074b, null, 0, new C00391(drawerState, null), 3);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1(String str, DrawerState drawerState, d0 d0Var) {
        super(1);
        this.f10070a = str;
        this.f10071b = drawerState;
        this.f10072c = d0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.o(semanticsPropertyReceiver, this.f10070a);
        DrawerState drawerState = this.f10071b;
        if (((DrawerValue) drawerState.f9247a.f12824g.getValue()) == DrawerValue.f9262b) {
            semanticsPropertyReceiver.b(SemanticsActions.f16810t, new AccessibilityAction(null, new AnonymousClass1(drawerState, this.f10072c)));
        }
        return b0.f30125a;
    }
}
