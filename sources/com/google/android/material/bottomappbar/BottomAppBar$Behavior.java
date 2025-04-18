package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.z2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes3.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new z2(this, 1);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, b0.a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a.u(view);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, b0.a
    public final boolean t(View view, int i10, int i11) {
        a.u(view);
        throw null;
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new z2(this, 1);
        new Rect();
    }
}
