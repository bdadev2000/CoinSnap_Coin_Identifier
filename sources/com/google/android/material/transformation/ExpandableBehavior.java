package com.google.android.material.transformation;

import G.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    @Override // G.b
    public abstract void f(View view);

    @Override // G.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        o.v(view2);
        throw null;
    }

    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        if (!ViewCompat.isLaidOut(view)) {
            ArrayList j7 = coordinatorLayout.j(view);
            int size = j7.size();
            for (int i10 = 0; i10 < size; i10++) {
                f(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
