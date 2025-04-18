package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {Opcodes.MONITOREXIT}, m = "consumeUntilUp")
/* loaded from: classes2.dex */
public final class TapGestureDetectorKt$consumeUntilUp$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f3518a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3519b;

    /* renamed from: c, reason: collision with root package name */
    public int f3520c;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3519b = obj;
        this.f3520c |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.a(null, this);
    }
}
