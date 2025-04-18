package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1139, 1141, 1148, 1149, 1158}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2422a;

    /* renamed from: b, reason: collision with root package name */
    public int f2423b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2424c;
    public final /* synthetic */ PressGestureScope d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f2426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope pressGestureScope, long j2, MutableInteractionSource mutableInteractionSource, AbstractClickableNode abstractClickableNode, g gVar) {
        super(2, gVar);
        this.d = pressGestureScope;
        this.f2425f = j2;
        this.f2426g = mutableInteractionSource;
        this.f2427h = abstractClickableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.d, this.f2425f, this.f2426g, this.f2427h, gVar);
        abstractClickableNode$handlePressInteraction$2$1.f2424c = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
