package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$updateViewHolderParams$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$5 f17583a = new r(2);

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ViewFactoryHolder c2 = AndroidView_androidKt.c((LayoutNode) obj);
        int ordinal = ((LayoutDirection) obj2).ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i2 = 0;
        }
        c2.setLayoutDirection(i2);
        return b0.f30125a;
    }
}
