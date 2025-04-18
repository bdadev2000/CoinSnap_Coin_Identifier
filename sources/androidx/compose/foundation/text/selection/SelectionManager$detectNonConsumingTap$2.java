package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", l = {739}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SelectionManager$detectNonConsumingTap$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7240a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f7242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$detectNonConsumingTap$2(l lVar, g gVar) {
        super(gVar);
        this.f7242c = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SelectionManager$detectNonConsumingTap$2 selectionManager$detectNonConsumingTap$2 = new SelectionManager$detectNonConsumingTap$2(this.f7242c, gVar);
        selectionManager$detectNonConsumingTap$2.f7241b = obj;
        return selectionManager$detectNonConsumingTap$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionManager$detectNonConsumingTap$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7240a;
        if (i2 == 0) {
            q.m(obj);
            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f7241b;
            this.f7240a = 1;
            obj = TapGestureDetectorKt.g(awaitPointerEventScope, PointerEventPass.f15573b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            this.f7242c.invoke(new Offset(pointerInputChange.f15591c));
        }
        return b0.f30125a;
    }
}
