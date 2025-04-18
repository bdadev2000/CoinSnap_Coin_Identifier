package com.google.android.material.transformation;

import a4.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.a;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // b0.a
    public abstract boolean f(View view, View view2);

    @Override // b0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        j.t(view2);
        throw null;
    }

    @Override // b0.a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (!view.isLaidOut()) {
            ArrayList j3 = coordinatorLayout.j(view);
            int size = j3.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                View view2 = (View) j3.get(i11);
                if (f(view, view2)) {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.t(view2);
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
