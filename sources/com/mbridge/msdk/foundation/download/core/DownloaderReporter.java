package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.d.c;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DownloaderReporter {
    private static final String KEY = "key=";
    private static final String TAG = "DownloaderReporter";
    private final Map<String, String> _params;
    private final String _reportKey;

    /* loaded from: classes4.dex */
    public static class Builder {
        private final Map<String, String> _params;
        private final String _reportKey;

        public Builder(String str) {
            if (!TextUtils.isEmpty(str)) {
                this._reportKey = str;
                this._params = new HashMap();
                return;
            }
            throw new IllegalArgumentException("reportKey can not be empty");
        }

        public Builder add(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    this._params.put(str, str2);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public DownloaderReporter build() {
            return new DownloaderReporter(this);
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    String encodeValue = encodeValue(map.get(str));
                    sb2.append("&");
                    sb2.append(str);
                    sb2.append("=");
                    sb2.append(encodeValue);
                }
                return sb2.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private String encodeValue(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public final void report() {
        c.a().d(KEY + this._reportKey + asUrlParams(this._params));
    }

    private DownloaderReporter(Builder builder) {
        this._reportKey = builder._reportKey;
        this._params = builder._params;
    }
}
