package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import org.objectweb.asm.TypeReference;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", l = {TypeReference.EXCEPTION_PARAMETER}, m = "awaitFirstRightClickDown")
/* loaded from: classes2.dex */
public final class ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f2924a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2925b;

    /* renamed from: c, reason: collision with root package name */
    public int f2926c;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f2925b = obj;
        this.f2926c |= Integer.MIN_VALUE;
        return ContextMenuGestures_androidKt.a(null, this);
    }
}
