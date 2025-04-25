package com.glority.android.picturexx.utils;

import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingPageOpenUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/utils/BillingPageOpenUtils;", "", "<init>", "()V", "keyShowedFromRecognizeOrCollection", "", "oneDay", "", "showedFromRecognizeOrCollection", "", "from", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class BillingPageOpenUtils {
    public static final int $stable = 0;
    public static final BillingPageOpenUtils INSTANCE = new BillingPageOpenUtils();
    public static final String keyShowedFromRecognizeOrCollection = "ShowedFromRecognizeOrCollection";
    public static final int oneDay = 86400000;

    private BillingPageOpenUtils() {
    }

    public final void showedFromRecognizeOrCollection(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (AppViewModel.INSTANCE.isVip()) {
            return;
        }
        if (System.currentTimeMillis() - ((Number) PersistData.INSTANCE.get(keyShowedFromRecognizeOrCollection, 0L)).longValue() > 86400000) {
            new LogEventRequest(LogEvents.daily_afterrecognizebilling_open, null, 2, null).post();
            new OpenBillingActivityRequest(from, String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()), 20).post();
            PersistData.INSTANCE.set(keyShowedFromRecognizeOrCollection, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
