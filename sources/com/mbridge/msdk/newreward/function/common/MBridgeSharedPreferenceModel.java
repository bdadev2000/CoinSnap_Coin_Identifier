package com.mbridge.msdk.newreward.function.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.b.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class MBridgeSharedPreferenceModel {
    private static final String DEFAULT_NAME = "mbridge_new_config";
    private volatile FastKV mFastKV;
    private final String mName;
    private static final ConcurrentHashMap<String, String> mStringCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Integer> mIntegerCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Long> mLongCache = new ConcurrentHashMap<>();
    private static final Map<String, MBridgeSharedPreferenceModel> mInstanceMap = new HashMap();
    private static final String mPath = e.a(c.MBRIDGE_700_CONFIG) + File.separator;

    private MBridgeSharedPreferenceModel(String str) {
        this.mName = str;
        initFastKV();
    }

    public static MBridgeSharedPreferenceModel getInstance() {
        return getInstance("");
    }

    private int getIntegerValue(String str, int i9) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            int i10 = this.mFastKV.getInt(str, i9);
            mIntegerCache.put(str, Integer.valueOf(i10));
            return i10;
        } catch (Exception unused) {
            return i9;
        }
    }

    private long getLongValue(String str, long j7) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            long j9 = this.mFastKV.getLong(str, j7);
            mLongCache.put(str, Long.valueOf(j9));
            return j9;
        } catch (Exception unused) {
            return j7;
        }
    }

    private String getStringValue(String str, String str2) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        String string = this.mFastKV.getString(str, str2);
        if (string != null) {
            mStringCache.put(str, string);
        }
        return string;
    }

    private void initFastKV() {
        if (this.mFastKV == null) {
            try {
                this.mFastKV = new FastKV.Builder(mPath, this.mName).build();
            } catch (Exception unused) {
            }
        }
    }

    private void putIntegerValue(String str, int i9) {
        try {
            mIntegerCache.put(str, Integer.valueOf(i9));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putInt(str, i9);
        } catch (Exception unused2) {
        }
    }

    private void putLongValue(String str, long j7) {
        try {
            mLongCache.put(str, Long.valueOf(j7));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putLong(str, j7);
        } catch (Exception unused2) {
        }
    }

    private void putStringValue(String str, String str2) {
        try {
            mStringCache.put(str, str2);
            this.mFastKV.putString(str, str2);
        } catch (Exception unused) {
        }
    }

    public final void clear() {
        mStringCache.clear();
        mIntegerCache.clear();
        mLongCache.clear();
        if (this.mFastKV != null) {
            this.mFastKV.clear();
        }
    }

    public final int getInteger(String str, int i9) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return i9;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = mIntegerCache;
        if (concurrentHashMap.containsKey(str) && (num = concurrentHashMap.get(str)) != null) {
            return num.intValue();
        }
        return getIntegerValue(str, i9);
    }

    public final long getLong(String str, long j7) {
        Long l;
        if (TextUtils.isEmpty(str)) {
            return j7;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = mLongCache;
        if (concurrentHashMap.containsKey(str) && (l = concurrentHashMap.get(str)) != null) {
            return l.longValue();
        }
        return getLongValue(str, j7);
    }

    public final String getString(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = mStringCache;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        return getStringValue(str, str2);
    }

    public final void init() {
    }

    public final void putInteger(String str, int i9) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = mIntegerCache;
        if (concurrentHashMap.containsKey(str)) {
            Integer num = concurrentHashMap.get(str);
            if (num == null || num.intValue() != i9) {
                putIntegerValue(str, i9);
                return;
            }
            return;
        }
        putIntegerValue(str, i9);
    }

    public final void putLong(String str, long j7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = mLongCache;
        if (concurrentHashMap.containsKey(str)) {
            Long l = concurrentHashMap.get(str);
            if (l == null || l.longValue() != j7) {
                putLongValue(str, j7);
                return;
            }
            return;
        }
        putLongValue(str, j7);
    }

    public final void putString(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            ConcurrentHashMap<String, String> concurrentHashMap = mStringCache;
            if (concurrentHashMap.containsKey(str)) {
                if (!TextUtils.equals(concurrentHashMap.get(str), str2)) {
                    putStringValue(str, str2);
                    return;
                }
                return;
            }
            putStringValue(str, str2);
        }
    }

    public static MBridgeSharedPreferenceModel getInstance(String str) {
        MBridgeSharedPreferenceModel mBridgeSharedPreferenceModel;
        Map<String, MBridgeSharedPreferenceModel> map = mInstanceMap;
        synchronized (map) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str = DEFAULT_NAME;
                }
                mBridgeSharedPreferenceModel = map.get(str);
                if (mBridgeSharedPreferenceModel == null) {
                    mBridgeSharedPreferenceModel = new MBridgeSharedPreferenceModel(str);
                    map.put(str, mBridgeSharedPreferenceModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mBridgeSharedPreferenceModel;
    }
}
