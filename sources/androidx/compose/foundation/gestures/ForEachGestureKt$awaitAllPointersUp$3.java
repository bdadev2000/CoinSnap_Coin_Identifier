package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {Opcodes.SASTORE}, m = "awaitAllPointersUp")
/* loaded from: classes2.dex */
public final class ForEachGestureKt$awaitAllPointersUp$3 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f3383a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3384b;

    /* renamed from: c, reason: collision with root package name */
    public int f3385c;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3384b = obj;
        this.f3385c |= Integer.MIN_VALUE;
        return ForEachGestureKt.a(null, this);
    }
}
