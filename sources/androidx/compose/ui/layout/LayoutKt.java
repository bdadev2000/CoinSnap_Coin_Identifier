package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;

/* loaded from: classes2.dex */
public final class LayoutKt {
    public static final ComposableLambdaImpl a(List list) {
        LayoutKt$combineAsVirtualLayouts$1 layoutKt$combineAsVirtualLayouts$1 = new LayoutKt$combineAsVirtualLayouts$1(list);
        Object obj = ComposableLambdaKt.f14482a;
        return new ComposableLambdaImpl(-1953651383, layoutKt$combineAsVirtualLayouts$1, true);
    }

    public static final ComposableLambdaImpl b(Modifier modifier) {
        LayoutKt$materializerOfWithCompositionLocalInjection$1 layoutKt$materializerOfWithCompositionLocalInjection$1 = new LayoutKt$materializerOfWithCompositionLocalInjection$1(modifier);
        Object obj = ComposableLambdaKt.f14482a;
        return new ComposableLambdaImpl(-55743822, layoutKt$materializerOfWithCompositionLocalInjection$1, true);
    }
}
