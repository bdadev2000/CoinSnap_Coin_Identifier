package com.mbridge.msdk.newreward.function.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.o;
import com.vungle.ads.internal.signals.j;

/* loaded from: classes3.dex */
public class MBridgeDailyPlayModel {
    private final int mAdType;
    private final String mCountKey;
    private int mMaxDailyCap = 0;
    private final String mPlacementID;
    private final String mTimeKey;
    private final String mUnitID;

    public MBridgeDailyPlayModel(int i9, String str, String str2) {
        this.mAdType = i9;
        str = TextUtils.isEmpty(str) ? "null" : str;
        this.mPlacementID = str;
        str2 = TextUtils.isEmpty(str2) ? "null" : str2;
        this.mUnitID = str2;
        String str3 = i9 + "_" + str + "_" + str2;
        this.mCountKey = o.j(str3, "_count");
        this.mTimeKey = o.j(str3, "_time");
    }

    public void insertDailyCap() {
        long j7 = MBridgeSharedPreferenceModel.getInstance().getLong(this.mTimeKey, 0L);
        int integer = MBridgeSharedPreferenceModel.getInstance().getInteger(this.mCountKey, 0) + 1;
        if (j7 != 0 && System.currentTimeMillis() - j7 <= j.TWENTY_FOUR_HOURS_MILLIS) {
            MBridgeSharedPreferenceModel.getInstance().putInteger(this.mCountKey, integer);
        } else {
            MBridgeSharedPreferenceModel.getInstance().putLong(this.mTimeKey, System.currentTimeMillis());
            MBridgeSharedPreferenceModel.getInstance().putInteger(this.mCountKey, integer);
        }
    }

    public boolean isOverDailyCap() {
        if (this.mMaxDailyCap <= 0) {
            return false;
        }
        long j7 = MBridgeSharedPreferenceModel.getInstance().getLong(this.mTimeKey, 0L);
        if (j7 == 0) {
            return false;
        }
        if (System.currentTimeMillis() - j7 > j.TWENTY_FOUR_HOURS_MILLIS) {
            MBridgeSharedPreferenceModel.getInstance().putLong(this.mTimeKey, 0L);
            MBridgeSharedPreferenceModel.getInstance().putInteger(this.mCountKey, 0);
            return false;
        }
        if (MBridgeSharedPreferenceModel.getInstance().getInteger(this.mCountKey, 0) < this.mMaxDailyCap) {
            return false;
        }
        return true;
    }

    public void setMaxPlayCount(int i9) {
        this.mMaxDailyCap = i9;
    }
}
