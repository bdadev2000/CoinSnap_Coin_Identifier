package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.node.DelegatingNode;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
/* loaded from: classes3.dex */
public final class DragSourceNodeWithDefaultPainter extends DelegatingNode {

    /* renamed from: q, reason: collision with root package name */
    public p f3004q;

    /* renamed from: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            throw null;
        }
    }

    @e(c = "androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$2", f = "AndroidDragAndDropSource.android.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3005a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3006b;

        public AnonymousClass2(g gVar) {
            super(2, gVar);
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(gVar);
            anonymousClass2.f3006b = obj;
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((DragAndDropSourceScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f3005a;
            if (i2 == 0) {
                q.m(obj);
                DragAndDropSourceScope dragAndDropSourceScope = (DragAndDropSourceScope) this.f3006b;
                p pVar = DragSourceNodeWithDefaultPainter.this.f3004q;
                this.f3005a = 1;
                if (pVar.invoke(dragAndDropSourceScope, this) == aVar) {
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
}
