package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16546b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16547c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16548d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f16549e;

    /* renamed from: f, reason: collision with root package name */
    private String f16550f;

    /* renamed from: g, reason: collision with root package name */
    private String f16551g;

    /* loaded from: classes4.dex */
    public static class Builder {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private int f16552b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f16553c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f16554d;

        public PglSSConfig build() {
            if (!TextUtils.isEmpty(this.a)) {
                int i10 = this.f16552b;
                if (i10 == 2 || i10 == 1 || i10 == 0) {
                    int i11 = this.f16553c;
                    if (i11 == 0 || i11 == 1) {
                        return new PglSSConfig(this.a, i10, i11, this.f16554d);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }

        public Builder setAdsdkVersionCode(int i10) {
            this.f16554d = i10;
            return this;
        }

        public Builder setAppId(String str) {
            this.a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f16553c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f16552b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getAdSdkVersionCode() {
        return this.f16548d;
    }

    public String getAppId() {
        return this.a;
    }

    public String getCnReportUrl() {
        return this.f16550f;
    }

    public String getCnTokenUrl() {
        return this.f16551g;
    }

    public int getCollectMode() {
        return this.f16547c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f16549e;
    }

    public int getOVRegionType() {
        return this.f16546b;
    }

    public void setCnReportUrl(String str) {
        this.f16550f = str;
    }

    public void setCnTokenUrl(String str) {
        this.f16551g = str;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f16549e = map;
    }

    private PglSSConfig(String str, int i10, int i11, int i12) {
        this.a = str;
        this.f16546b = i10;
        this.f16547c = i11;
        this.f16548d = i12;
    }
}
