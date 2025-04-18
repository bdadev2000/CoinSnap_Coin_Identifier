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

    public ReferrerDetails(String str, long j3, long j10) {
        this(str, j3, j10, -1L, -1L, null, null);
    }

    public ReferrerDetails(String str, long j3, long j10, long j11, long j12, String str2, Boolean bool) {
        this.installReferrer = str;
        this.referrerClickTimestampSeconds = j3;
        this.installBeginTimestampSeconds = j10;
        this.referrerClickTimestampServerSeconds = j11;
        this.installBeginTimestampServerSeconds = j12;
        this.installVersion = str2;
        this.googlePlayInstant = bool;
    }
}
