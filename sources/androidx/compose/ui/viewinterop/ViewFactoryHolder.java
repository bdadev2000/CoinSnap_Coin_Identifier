package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public final SaveableStateRegistry A;
    public SaveableStateRegistry.Entry B;
    public l C;
    public l D;
    public l E;

    /* renamed from: y, reason: collision with root package name */
    public final View f17587y;

    /* renamed from: z, reason: collision with root package name */
    public final NestedScrollDispatcher f17588z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewFactoryHolder(android.content.Context r9, q0.l r10, androidx.compose.runtime.CompositionContext r11, androidx.compose.runtime.saveable.SaveableStateRegistry r12, int r13, androidx.compose.ui.node.Owner r14) {
        /*
            r8 = this;
            java.lang.Object r10 = r10.invoke(r9)
            android.view.View r10 = (android.view.View) r10
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r7 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f17587y = r10
            r8.f17588z = r7
            r8.A = r12
            r9 = 0
            r8.setClipChildren(r9)
            java.lang.String r9 = java.lang.String.valueOf(r13)
            r11 = 0
            if (r12 == 0) goto L2b
            java.lang.Object r13 = r12.e(r9)
            goto L2c
        L2b:
            r13 = r11
        L2c:
            boolean r14 = r13 instanceof android.util.SparseArray
            if (r14 == 0) goto L33
            r11 = r13
            android.util.SparseArray r11 = (android.util.SparseArray) r11
        L33:
            if (r11 == 0) goto L38
            r10.restoreHierarchyState(r11)
        L38:
            if (r12 == 0) goto L46
            androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1 r10 = new androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
            r10.<init>(r8)
            androidx.compose.runtime.saveable.SaveableStateRegistry$Entry r9 = r12.b(r9, r10)
            r8.setSavableRegistryEntry(r9)
        L46:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1 r9 = androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1.f17573a
            r8.C = r9
            r8.D = r9
            r8.E = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.ViewFactoryHolder.<init>(android.content.Context, q0.l, androidx.compose.runtime.CompositionContext, androidx.compose.runtime.saveable.SaveableStateRegistry, int, androidx.compose.ui.node.Owner):void");
    }

    public static final void e(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.B;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.B = entry;
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.f17588z;
    }

    @NotNull
    public final l getReleaseBlock() {
        return this.E;
    }

    @NotNull
    public final l getResetBlock() {
        return this.D;
    }

    @Nullable
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    @NotNull
    public final l getUpdateBlock() {
        return this.C;
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@NotNull l lVar) {
        this.E = lVar;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(@NotNull l lVar) {
        this.D = lVar;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(@NotNull l lVar) {
        this.C = lVar;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }
}
