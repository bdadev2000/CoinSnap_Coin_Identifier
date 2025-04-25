package com.glority.android.core.utils;

import android.provider.Settings;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import kotlin.Metadata;

/* compiled from: DeviceInfo.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/utils/DeviceInfo;", "", "()V", "id", "", "kotlin.jvm.PlatformType", "getId", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DeviceInfo {
    public static final DeviceInfo INSTANCE = new DeviceInfo();
    private static final String id = Settings.Secure.getString(AppContext.INSTANCE.peekContext().getContentResolver(), "android_id");

    private DeviceInfo() {
    }

    public final String getId() {
        return id;
    }
}
