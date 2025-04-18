package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z {
    private final Context context;
    private final DisplayMetrics dm;

    public z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.dm = displayMetrics;
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public static /* synthetic */ z copy$default(z zVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = zVar.context;
        }
        return zVar.copy(context);
    }

    public final Context component1() {
        return this.context;
    }

    public final z copy(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new z(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.context, ((z) obj).context);
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
