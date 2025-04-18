package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class SelectionManager_androidKt$selectionMagnifier$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f7267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$selectionMagnifier$1$1$1(SelectionManager selectionManager, MutableState mutableState) {
        super(0);
        this.f7266a = selectionManager;
        this.f7267b = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        long b2;
        long j2 = ((IntSize) this.f7267b.getValue()).f17493a;
        SelectionManager selectionManager = this.f7266a;
        Selection e = selectionManager.e();
        long j3 = 9205357640488583168L;
        if (e != null) {
            Handle c2 = selectionManager.c();
            int i2 = c2 == null ? -1 : SelectionManagerKt.WhenMappings.f7258a[c2.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    b2 = SelectionManagerKt.b(selectionManager, j2, e.f7083a);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new RuntimeException();
                        }
                        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
                    }
                    b2 = SelectionManagerKt.b(selectionManager, j2, e.f7084b);
                }
                j3 = b2;
            }
        }
        return new Offset(j3);
    }
}
