package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum b2 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public final void a(View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }
}
