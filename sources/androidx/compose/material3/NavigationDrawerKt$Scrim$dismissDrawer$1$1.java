package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1", f = "NavigationDrawer.kt", l = {1140}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NavigationDrawerKt$Scrim$dismissDrawer$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10193a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f10195c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.a f10196a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q0.a aVar) {
            super(1);
            this.f10196a = aVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((Offset) obj).f14913a;
            this.f10196a.invoke();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$dismissDrawer$1$1(q0.a aVar, g gVar) {
        super(2, gVar);
        this.f10195c = aVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        NavigationDrawerKt$Scrim$dismissDrawer$1$1 navigationDrawerKt$Scrim$dismissDrawer$1$1 = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(this.f10195c, gVar);
        navigationDrawerKt$Scrim$dismissDrawer$1$1.f10194b = obj;
        return navigationDrawerKt$Scrim$dismissDrawer$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationDrawerKt$Scrim$dismissDrawer$1$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f10193a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f10194b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10195c);
            this.f10193a = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, null, anonymousClass1, this, 7) == aVar) {
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
