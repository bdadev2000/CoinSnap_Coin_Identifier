package com.glority.abtest.utils;

import com.glority.android.core.route.share.SharePlatform;
import kotlin.Metadata;

/* compiled from: ABTesting.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/abtest/utils/ABTesting;", "", "()V", "ABTESTING_CONFIG_LOCAL", "", "ABTESTING_LOG_EVENT_LOCAL", "ABTESTING_MORE_DATA", "ABTESTING_VARIABLE_ALLOCATION", "ABTESTING_VARIABLE_ALLOCATION_DEBUG", "EQUAL", "", "LESS", SharePlatform.MORE, "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class ABTesting {
    public static final String ABTESTING_CONFIG_LOCAL = "abtesting_config";
    public static final String ABTESTING_LOG_EVENT_LOCAL = "abtesting_log_event_local";
    public static final String ABTESTING_MORE_DATA = "abtesting_more_data";
    public static final String ABTESTING_VARIABLE_ALLOCATION = "abtesting_variable_allocation";
    public static final String ABTESTING_VARIABLE_ALLOCATION_DEBUG = "abtesting_variable_allocation_debug";
    public static final int EQUAL = 0;
    public static final ABTesting INSTANCE = new ABTesting();
    public static final int LESS = -1;
    public static final int MORE = 1;

    private ABTesting() {
    }
}
