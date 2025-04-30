package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f15275a;
    private com.mbridge.msdk.dycreator.a.b b;

    private f(Context context) {
        this.b = null;
        com.mbridge.msdk.dycreator.a.b a6 = com.mbridge.msdk.dycreator.a.b.a();
        this.b = a6;
        a6.a(context, "");
    }

    public static f a(Context context) {
        if (f15275a == null) {
            synchronized (f.class) {
                try {
                    if (f15275a == null) {
                        f15275a = new f(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f15275a;
    }

    public final View a(String str) {
        if (new File(str).exists()) {
            return this.b.f(str);
        }
        return null;
    }

    public final View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
