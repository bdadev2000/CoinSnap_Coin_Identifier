package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* loaded from: classes4.dex */
public class f {
    private static volatile f a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.a.b f12919b;

    private f(Context context) {
        this.f12919b = null;
        com.mbridge.msdk.dycreator.a.b a10 = com.mbridge.msdk.dycreator.a.b.a();
        this.f12919b = a10;
        a10.a(context, "");
    }

    public static f a(Context context) {
        if (a == null) {
            synchronized (f.class) {
                if (a == null) {
                    a = new f(context.getApplicationContext());
                }
            }
        }
        return a;
    }

    public final View a(String str) {
        if (new File(str).exists()) {
            return this.f12919b.f(str);
        }
        return null;
    }

    public final View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
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
