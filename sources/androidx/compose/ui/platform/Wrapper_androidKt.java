package androidx.compose.ui.platform;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class Wrapper_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f16701a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.AbstractApplier, androidx.compose.ui.node.UiApplier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.Composition a(androidx.compose.ui.platform.AbstractComposeView r6, androidx.compose.runtime.CompositionContext r7, androidx.compose.runtime.internal.ComposableLambdaImpl r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.ui.platform.GlobalSnapshotManager.f16488a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            d1.b r0 = p0.a.a(r2, r1, r0)
            d0.p r2 = androidx.compose.ui.platform.AndroidUiDispatcher.f16372n
            java.lang.Object r2 = r2.getValue()
            h0.l r2 = (h0.l) r2
            g1.f r2 = p0.a.c(r2)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 r4 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1
            r4.<init>(r0, r3)
            r5 = 3
            kotlin.jvm.internal.e.v(r2, r3, r1, r4, r5)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 r2 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
            r2.<init>(r0)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.f14571b
            monitor-enter(r0)
            java.util.List r4 = androidx.compose.runtime.snapshots.SnapshotKt.f14575h     // Catch: java.lang.Throwable -> L3c
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = e0.u.Q0(r4, r2)     // Catch: java.lang.Throwable -> L3c
            androidx.compose.runtime.snapshots.SnapshotKt.f14575h = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            androidx.compose.runtime.snapshots.SnapshotKt.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L50
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r6.getContext()
            h0.l r2 = r7.i()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = androidx.compose.ui.platform.Wrapper_androidKt.f16701a
            r6.addView(r1, r2)
        L6e:
            androidx.compose.ui.node.UiApplier r6 = new androidx.compose.ui.node.UiApplier
            androidx.compose.ui.node.LayoutNode r1 = r0.getRoot()
            r6.<init>(r1)
            java.lang.Object r1 = androidx.compose.runtime.CompositionKt.f13759a
            androidx.compose.runtime.CompositionImpl r1 = new androidx.compose.runtime.CompositionImpl
            r1.<init>(r7, r6)
            android.view.View r6 = r0.getView()
            r2 = 2131362414(0x7f0a026e, float:1.8344608E38)
            java.lang.Object r6 = r6.getTag(r2)
            boolean r4 = r6 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r4 == 0) goto L90
            r3 = r6
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.ui.platform.WrappedComposition) r3
        L90:
            if (r3 != 0) goto L9e
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r1)
            android.view.View r6 = r0.getView()
            r6.setTag(r2, r3)
        L9e:
            r3.d(r8)
            h0.l r6 = r0.getCoroutineContext()
            h0.l r8 = r7.i()
            boolean r6 = p0.a.g(r6, r8)
            if (r6 != 0) goto Lb6
            h0.l r6 = r7.i()
            r0.setCoroutineContext(r6)
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Wrapper_androidKt.a(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.CompositionContext, androidx.compose.runtime.internal.ComposableLambdaImpl):androidx.compose.runtime.Composition");
    }
}
