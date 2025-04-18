package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {276, 315}, m = "touchSelectionSubsequentPress")
/* loaded from: classes3.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f7162a;

    /* renamed from: b, reason: collision with root package name */
    public TextDragObserver f7163b;

    /* renamed from: c, reason: collision with root package name */
    public PointerInputChange f7164c;
    public e0 d;

    /* renamed from: f, reason: collision with root package name */
    public long f7165f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7166g;

    /* renamed from: h, reason: collision with root package name */
    public int f7167h;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f7166g = obj;
        this.f7167h |= Integer.MIN_VALUE;
        return SelectionGesturesKt.f(null, null, null, this);
    }
}
