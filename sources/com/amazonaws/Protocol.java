package com.amazonaws;

import androidx.webkit.ProxyConfig;

/* loaded from: classes7.dex */
public enum Protocol {
    HTTP(ProxyConfig.MATCH_HTTP),
    HTTPS("https");

    private final String protocol;

    Protocol(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
