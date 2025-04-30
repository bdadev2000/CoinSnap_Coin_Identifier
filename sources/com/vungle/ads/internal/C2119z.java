package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: com.vungle.ads.internal.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2119z {
    private final Context context;
    private final DisplayMetrics dm;

    public C2119z(Context context) {
        G7.j.e(context, "context");
        this.context = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.dm = displayMetrics;
        Object systemService = context.getSystemService("window");
        G7.j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public static /* synthetic */ C2119z copy$default(C2119z c2119z, Context context, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            context = c2119z.context;
        }
        return c2119z.copy(context);
    }

    public final Context component1() {
        return this.context;
    }

    public final C2119z copy(Context context) {
        G7.j.e(context, "context");
        return new C2119z(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2119z) && G7.j.a(this.context, ((C2119z) obj).context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getDeviceHeight() {
        return this.dm.heightPixels;
    }

    public final int getDeviceWidth() {
        return this.dm.widthPixels;
    }

    public int hashCode() {
        return this.context.hashCode();
    }

    public String toString() {
        return "DeviceScreenInfo(context=" + this.context + ')';
    }
}
