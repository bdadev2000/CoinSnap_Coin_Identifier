package com.glority.android.picturexx.utils;

import com.glority.android.core.utils.data.PersistData;
import com.glority.android.xx.constants.Constants;
import kotlin.Metadata;

/* compiled from: PersistDataUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/utils/PersistDataUtils;", "", "<init>", "()V", "saveDefaultCustomSeriesId", "", "id", "", "(Ljava/lang/Integer;)V", "getDefaultCustomSeriesId", "()Ljava/lang/Integer;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class PersistDataUtils {
    public static final int $stable = 0;
    public static final PersistDataUtils INSTANCE = new PersistDataUtils();

    private PersistDataUtils() {
    }

    public final void saveDefaultCustomSeriesId(Integer id) {
        PersistData.INSTANCE.set(Constants.default_custom_series_id, id);
    }

    public final Integer getDefaultCustomSeriesId() {
        return (Integer) PersistData.INSTANCE.get(Constants.default_custom_series_id);
    }
}
