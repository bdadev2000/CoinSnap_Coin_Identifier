package com.safedk.android.analytics.brandsafety.creatives;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class VastAdTagUri implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final String f29499b = "VastAdTagUri";
    private static final long serialVersionUID = 2423634386629424135L;

    /* renamed from: a, reason: collision with root package name */
    protected final String f29500a;

    public VastAdTagUri(String uri) {
        this.f29500a = uri;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrefetchVastAdTagUri) {
            return obj.equals(this.f29500a);
        }
        return (this.f29500a == null || obj == null || !this.f29500a.equals(obj.toString())) ? false : true;
    }

    public int hashCode() {
        int indexOf;
        if (this.f29500a == null || (indexOf = this.f29500a.indexOf("//")) < 0) {
            return 0;
        }
        int indexOf2 = this.f29500a.indexOf(RemoteSettings.FORWARD_SLASH_STRING, indexOf + 2);
        if (indexOf2 < 0) {
            indexOf2 = this.f29500a.length();
        }
        return this.f29500a.substring(indexOf + 2, indexOf2).hashCode();
    }

    public String toString() {
        return this.f29500a;
    }
}
