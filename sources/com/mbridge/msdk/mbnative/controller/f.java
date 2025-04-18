package com.mbridge.msdk.mbnative.controller;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public final class f {
    private static View a(View view) {
        if (view == null) {
            return null;
        }
        try {
            ViewCompat.isAttachedToWindow(view);
        } catch (Throwable unused) {
        }
        try {
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            View findViewById = rootView.findViewById(R.id.content);
            return findViewById != null ? findViewById : rootView;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static View a(Context context, View view) {
        View view2 = null;
        if (context != null && (context instanceof Activity)) {
            view2 = ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return view2 != null ? view2 : a(view);
    }
}
