package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import e0.u;
import h0.g;
import j0.e;
import j0.h;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7168a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7170c;
    public final /* synthetic */ e0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j2, e0 e0Var, g gVar) {
        super(gVar);
        this.f7170c = j2;
        this.d = e0Var;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.f7170c, this.d, gVar);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.f7169b = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7168a;
        e0 e0Var = this.d;
        if (i2 == 0) {
            q.m(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.f7169b;
            SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1(e0Var);
            this.f7169b = awaitPointerEventScope2;
            this.f7168a = 1;
            Object d = DragGestureDetectorKt.d(awaitPointerEventScope2, this.f7170c, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1, this);
            if (d == aVar) {
                return aVar;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = d;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.f7169b;
            q.m(obj);
        }
        if (((PointerInputChange) obj) != null && OffsetKt.c(e0Var.f30927a)) {
            return DownResolution.f7060b;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) u.E0(awaitPointerEventScope.S0().f15569a);
        if (!PointerEventKt.c(pointerInputChange)) {
            return DownResolution.d;
        }
        pointerInputChange.a();
        return DownResolution.f7059a;
    }
}
