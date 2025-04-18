package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {718}, m = "emit")
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$restartable$2$1$emit$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12813a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12814b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12815c;
    public final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1 d;

    /* renamed from: f, reason: collision with root package name */
    public int f12816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt$restartable$2.AnonymousClass1 anonymousClass1, g gVar) {
        super(gVar);
        this.d = anonymousClass1;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f12815c = obj;
        this.f12816f |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
