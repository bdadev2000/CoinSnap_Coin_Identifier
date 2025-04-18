package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1117}, m = "emit")
/* loaded from: classes2.dex */
public final class AnchoredDraggableKt$restartable$2$1$emit$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3039a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3040b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3041c;
    public final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1 d;

    /* renamed from: f, reason: collision with root package name */
    public int f3042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt$restartable$2.AnonymousClass1 anonymousClass1, g gVar) {
        super(gVar);
        this.d = anonymousClass1;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3041c = obj;
        this.f3042f |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
