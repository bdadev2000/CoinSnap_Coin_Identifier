package com.adjust.sdk;

/* loaded from: classes.dex */
public class ReferrerDetails {
    public Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public String installReferrer;
    public String installVersion;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public ReferrerDetails(String str, long j7, long j9) {
        this(str, j7, j9, -1L, -1L, null, null);
    }

    public ReferrerDetails(String str, long j7, long j9, long j10, long j11, String str2, Boolean bool) {
        this.installReferrer = str;
        this.referrerClickTimestampSeconds = j7;
        this.installBeginTimestampSeconds = j9;
        this.referrerClickTimestampServerSeconds = j10;
        this.installBeginTimestampServerSeconds = j11;
        this.installVersion = str2;
        this.googlePlayInstant = bool;
    }
}
