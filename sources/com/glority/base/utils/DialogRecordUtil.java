package com.glority.base.utils;

import com.glority.android.core.utils.data.PersistData;
import kotlin.Metadata;

/* compiled from: DialogRecordUtil.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/base/utils/DialogRecordUtil;", "", "<init>", "()V", "KEY_SHOW_DIALOG_TIME", "", "todayHasShown", "", "setTodayHasShown", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class DialogRecordUtil {
    public static final int $stable = 0;
    public static final DialogRecordUtil INSTANCE = new DialogRecordUtil();
    private static final String KEY_SHOW_DIALOG_TIME = "key_show_dialog_time";

    private DialogRecordUtil() {
    }

    public final boolean todayHasShown() {
        return android.text.format.DateUtils.isToday(((Number) PersistData.INSTANCE.get(KEY_SHOW_DIALOG_TIME, 0L)).longValue());
    }

    public final void setTodayHasShown() {
        PersistData.INSTANCE.set(KEY_SHOW_DIALOG_TIME, Long.valueOf(System.currentTimeMillis()));
    }
}
