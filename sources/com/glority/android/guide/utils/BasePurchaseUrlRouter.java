package com.glority.android.guide.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasePurchaseUrlRouter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/guide/utils/BasePurchaseUrlRouter;", "", "()V", "MODULE", "", "URL_GET_DEVICE_LEVEL", "getURL_GET_DEVICE_LEVEL", "()Ljava/lang/String;", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BasePurchaseUrlRouter {
    public static final BasePurchaseUrlRouter INSTANCE = new BasePurchaseUrlRouter();
    private static final String MODULE;
    private static final String URL_GET_DEVICE_LEVEL;

    private BasePurchaseUrlRouter() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "base_purchase");
        MODULE = stringPlus;
        URL_GET_DEVICE_LEVEL = Intrinsics.stringPlus(stringPlus, "/get_device_level");
    }

    public final String getURL_GET_DEVICE_LEVEL() {
        return URL_GET_DEVICE_LEVEL;
    }
}
