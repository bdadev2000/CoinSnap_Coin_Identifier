package com.glority.android.picturexx.extensions;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoordinatorLayoutExtension.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"setScrollable", "", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "scrollable", "", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CoordinatorLayoutExtensionKt {
    public static final void setScrollable(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, final boolean z) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<this>");
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
        behavior.setDragCallback(new AppBarLayout.Behavior.DragCallback() { // from class: com.glority.android.picturexx.extensions.CoordinatorLayoutExtensionKt$setScrollable$1
            @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
            public boolean canDrag(AppBarLayout appBarLayout2) {
                Intrinsics.checkNotNullParameter(appBarLayout2, "appBarLayout");
                return z;
            }
        });
        layoutParams2.setBehavior(behavior);
        appBarLayout.setLayoutParams(layoutParams2);
    }
}
