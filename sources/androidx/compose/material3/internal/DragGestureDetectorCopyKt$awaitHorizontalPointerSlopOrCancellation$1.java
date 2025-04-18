package androidx.compose.material3.internal;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.internal.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", l = {Opcodes.I2B, Opcodes.INVOKESPECIAL}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* loaded from: classes2.dex */
public final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public p f12956a;

    /* renamed from: b, reason: collision with root package name */
    public AwaitPointerEventScope f12957b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f12958c;
    public PointerInputChange d;

    /* renamed from: f, reason: collision with root package name */
    public float f12959f;

    /* renamed from: g, reason: collision with root package name */
    public float f12960g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12961h;

    /* renamed from: i, reason: collision with root package name */
    public int f12962i;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f12961h = obj;
        this.f12962i |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.a(null, 0L, 0, null, this);
    }
}
