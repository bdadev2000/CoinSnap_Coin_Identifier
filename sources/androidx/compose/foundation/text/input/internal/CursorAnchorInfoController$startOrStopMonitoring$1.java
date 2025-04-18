package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.SnapshotStateKt;
import b1.d0;
import d0.b0;
import e1.j;
import e1.w;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CursorAnchorInfoController$startOrStopMonitoring$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CursorAnchorInfoController f6389b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CursorAnchorInfoController f6390a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CursorAnchorInfoController cursorAnchorInfoController) {
            super(0);
            this.f6390a = cursorAnchorInfoController;
        }

        @Override // q0.a
        public final Object invoke() {
            return this.f6390a.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoController$startOrStopMonitoring$1(CursorAnchorInfoController cursorAnchorInfoController, g gVar) {
        super(2, gVar);
        this.f6389b = cursorAnchorInfoController;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CursorAnchorInfoController$startOrStopMonitoring$1(this.f6389b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CursorAnchorInfoController$startOrStopMonitoring$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6388a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            final CursorAnchorInfoController cursorAnchorInfoController = this.f6389b;
            j l2 = SnapshotStateKt.l(new AnonymousClass1(cursorAnchorInfoController));
            e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1.2
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    CursorAnchorInfoController.this.f6380c.c((CursorAnchorInfo) obj2);
                    return b0.f30125a;
                }
            };
            this.f6388a = 1;
            Object collect = l2.collect(new w(new Object(), 1, new g.r(iVar, 2)), this);
            if (collect != i0.a.f30806a) {
                collect = b0Var;
            }
            if (collect != aVar) {
                collect = b0Var;
            }
            if (collect == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}
