package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;

/* loaded from: classes.dex */
public class Sg {

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl();

        void YFl(Throwable th2);
    }

    public static boolean YFl(Context context, Intent intent, YFl yFl) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (yFl == null) {
                    return true;
                }
                yFl.YFl();
                return true;
            } catch (Throwable th2) {
                if (yFl != null) {
                    yFl.YFl(th2);
                }
            }
        }
        return false;
    }

    public static Activity YFl(View view) {
        View findViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(R.id.content)) == null || (context = findViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
