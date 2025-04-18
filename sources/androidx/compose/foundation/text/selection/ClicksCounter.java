package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ClicksCounter {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f7050a;

    /* renamed from: b, reason: collision with root package name */
    public int f7051b;

    /* renamed from: c, reason: collision with root package name */
    public PointerInputChange f7052c;

    public ClicksCounter(ViewConfiguration viewConfiguration) {
        this.f7050a = viewConfiguration;
    }

    public final void a(PointerEvent pointerEvent) {
        PointerInputChange pointerInputChange = this.f7052c;
        PointerInputChange pointerInputChange2 = (PointerInputChange) pointerEvent.f15569a.get(0);
        if (pointerInputChange != null) {
            long j2 = pointerInputChange2.f15590b - pointerInputChange.f15590b;
            ViewConfiguration viewConfiguration = this.f7050a;
            if (j2 < viewConfiguration.a() && SelectionGesturesKt.g(viewConfiguration, pointerInputChange, pointerInputChange2)) {
                this.f7051b++;
                this.f7052c = pointerInputChange2;
            }
        }
        this.f7051b = 1;
        this.f7052c = pointerInputChange2;
    }
}
