package com.glority.android.netpromoterscore;

import com.glority.android.core.utils.data.PersistData;
import kotlin.Metadata;

/* compiled from: NPSPersistKey.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/android/netpromoterscore/NPSPersistKey;", "", "()V", "KEY_NPS_LAST_POP_TIME_STAMP", "", "KEY_NPS_ORIGIN_TIME_SHIFT", "KEY_NPS_POP_SHIFT_TIME", "getTimeShift", "", "setTimeShift", "", "timeShift", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class NPSPersistKey {
    public static final NPSPersistKey INSTANCE = new NPSPersistKey();
    public static final String KEY_NPS_LAST_POP_TIME_STAMP = "__key_nps_last_pop_time_stamp__";
    public static final String KEY_NPS_ORIGIN_TIME_SHIFT = "__key_nps_time_shift__";
    public static final String KEY_NPS_POP_SHIFT_TIME = "__key_nps_pop_shift_time__";

    private NPSPersistKey() {
    }

    public final void setTimeShift(long timeShift) {
        PersistData.INSTANCE.set(KEY_NPS_ORIGIN_TIME_SHIFT, Long.valueOf(timeShift));
    }

    public final long getTimeShift() {
        return ((Number) PersistData.INSTANCE.get(KEY_NPS_ORIGIN_TIME_SHIFT, 0L)).longValue();
    }
}
