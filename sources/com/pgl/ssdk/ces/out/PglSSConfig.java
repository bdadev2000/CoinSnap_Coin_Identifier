package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f19568a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19569c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19570d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f19571e;

    /* renamed from: f, reason: collision with root package name */
    private String f19572f;

    /* renamed from: g, reason: collision with root package name */
    private String f19573g;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f19574a;
        private int b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f19575c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f19576d;

        public PglSSConfig build() {
            if (!TextUtils.isEmpty(this.f19574a)) {
                int i9 = this.b;
                if (i9 == 2 || i9 == 1 || i9 == 0) {
                    int i10 = this.f19575c;
                    if (i10 == 0 || i10 == 1) {
                        return new PglSSConfig(this.f19574a, i9, i10, this.f19576d);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }

        public Builder setAdsdkVersionCode(int i9) {
            this.f19576d = i9;
            return this;
        }

        public Builder setAppId(String str) {
            this.f19574a = str;
            return this;
        }

        public Builder setCollectMode(int i9) {
            this.f19575c = i9;
            return this;
        }

        public Builder setOVRegionType(int i9) {
            this.b = i9;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getAdSdkVersionCode() {
        return this.f19570d;
    }

    public String getAppId() {
        return this.f19568a;
    }

    public String getCnReportUrl() {
        return this.f19572f;
    }

    public String getCnTokenUrl() {
        return this.f19573g;
    }

    public int getCollectMode() {
        return this.f19569c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f19571e;
    }

    public int getOVRegionType() {
        return this.b;
    }

    public void setCnReportUrl(String str) {
        this.f19572f = str;
    }

    public void setCnTokenUrl(String str) {
        this.f19573g = str;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f19571e = map;
    }

    private PglSSConfig(String str, int i9, int i10, int i11) {
        this.f19568a = str;
        this.b = i9;
        this.f19569c = i10;
        this.f19570d = i11;
    }
}
