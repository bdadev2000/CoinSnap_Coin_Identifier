package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.PredictiveBack_androidKt;
import androidx.compose.ui.util.MathHelpersKt;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.android.kt", l = {Opcodes.V16, Opcodes.SASTORE, Opcodes.SASTORE, Opcodes.SASTORE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10210a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f10212c;
    public final /* synthetic */ d0 d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10214g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f10215h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f10216i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f10217j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.android.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f10222a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DrawerPredictiveBackState f10223b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DrawerPredictiveBackState f10224a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DrawerPredictiveBackState drawerPredictiveBackState) {
                super(2);
                this.f10224a = drawerPredictiveBackState;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                this.f10224a.f9245b.n(floatValue);
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DrawerPredictiveBackState drawerPredictiveBackState, g gVar) {
            super(2, gVar);
            this.f10223b = drawerPredictiveBackState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f10223b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f10222a;
            DrawerPredictiveBackState drawerPredictiveBackState = this.f10223b;
            if (i2 == 0) {
                q.m(obj);
                float c2 = drawerPredictiveBackState.f9245b.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(drawerPredictiveBackState);
                this.f10222a = 1;
                if (SuspendAnimationKt.c(c2, 0.0f, null, anonymousClass1, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            drawerPredictiveBackState.f9244a.setValue(Boolean.TRUE);
            drawerPredictiveBackState.f9245b.n(0.0f);
            drawerPredictiveBackState.f9246c.n(0.0f);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, d0 d0Var, DrawerState drawerState, boolean z2, c0 c0Var, c0 c0Var2, c0 c0Var3, g gVar) {
        super(2, gVar);
        this.f10212c = drawerPredictiveBackState;
        this.d = d0Var;
        this.f10213f = drawerState;
        this.f10214g = z2;
        this.f10215h = c0Var;
        this.f10216i = c0Var2;
        this.f10217j = c0Var3;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(this.f10212c, this.d, this.f10213f, this.f10214g, this.f10215h, this.f10216i, this.f10217j, gVar);
        navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.f10211b = obj;
        return navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1) create((h) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f10210a;
        d0 d0Var = this.d;
        DrawerState drawerState = this.f10213f;
        DrawerPredictiveBackState drawerPredictiveBackState = this.f10212c;
        try {
            try {
            } catch (CancellationException unused) {
                drawerPredictiveBackState.f9244a.setValue(Boolean.TRUE);
                drawerPredictiveBackState.f9245b.n(0.0f);
                drawerPredictiveBackState.f9246c.n(0.0f);
                if (drawerPredictiveBackState.a()) {
                    kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(drawerPredictiveBackState, null), 3);
                }
                this.f10210a = 3;
                if (drawerState.a(this) == aVar) {
                    return aVar;
                }
            }
            if (i2 == 0) {
                q.m(obj);
                h hVar = (h) this.f10211b;
                final DrawerPredictiveBackState drawerPredictiveBackState2 = this.f10212c;
                final boolean z2 = this.f10214g;
                final c0 c0Var = this.f10215h;
                final c0 c0Var2 = this.f10216i;
                final c0 c0Var3 = this.f10217j;
                e1.i iVar = new e1.i() { // from class: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.1
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        BackEventCompat backEventCompat = (BackEventCompat) obj2;
                        float b2 = PredictiveBack_androidKt.f13030a.b(backEventCompat.f135c);
                        boolean z3 = backEventCompat.d == 0;
                        float f2 = c0Var.f30922a;
                        float f3 = c0Var2.f30922a;
                        float f4 = c0Var3.f30922a;
                        DrawerPredictiveBackState drawerPredictiveBackState3 = DrawerPredictiveBackState.this;
                        drawerPredictiveBackState3.getClass();
                        drawerPredictiveBackState3.f9244a.setValue(Boolean.valueOf(z3 != z2));
                        if (!drawerPredictiveBackState3.a()) {
                            f2 = f3;
                        }
                        drawerPredictiveBackState3.f9245b.n(MathHelpersKt.b(0.0f, f2, b2));
                        drawerPredictiveBackState3.f9246c.n(MathHelpersKt.b(0.0f, f4, b2));
                        return b0.f30125a;
                    }
                };
                this.f10210a = 1;
                if (hVar.collect(iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        q.m(obj);
                        return b0.f30125a;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.f10211b;
                    q.m(obj);
                    throw th;
                }
                q.m(obj);
            }
            if (drawerPredictiveBackState.a()) {
                kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(drawerPredictiveBackState, null), 3);
            }
            this.f10210a = 2;
            if (drawerState.a(this) == aVar) {
                return aVar;
            }
            return b0.f30125a;
        } catch (Throwable th2) {
            if (drawerPredictiveBackState.a()) {
                kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(drawerPredictiveBackState, null), 3);
            }
            this.f10211b = th2;
            this.f10210a = 4;
            if (drawerState.a(this) == aVar) {
                return aVar;
            }
            throw th2;
        }
    }
}
