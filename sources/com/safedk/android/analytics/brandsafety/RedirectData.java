package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class RedirectData implements Serializable {
    private static final long serialVersionUID = -2180364199406342143L;

    /* renamed from: a, reason: collision with root package name */
    public boolean f29328a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29329b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29330c = false;
    public String d = null;
    public String e = null;

    /* renamed from: f, reason: collision with root package name */
    public String f29331f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f29332g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f29333h = null;

    /* renamed from: i, reason: collision with root package name */
    public String f29334i;

    /* renamed from: j, reason: collision with root package name */
    public long f29335j;

    /* renamed from: k, reason: collision with root package name */
    public BrandSafetyEvent.AdFormatType f29336k;

    public RedirectData(String sdkPackageName, BrandSafetyEvent.AdFormatType adFormatType) {
        this.f29334i = sdkPackageName;
        this.f29336k = adFormatType;
    }

    public void a(String str, String str2, String str3) {
        this.f29328a = true;
        this.d = str2;
        this.e = str;
        this.f29331f = str3;
        this.f29335j = System.currentTimeMillis();
    }

    public void b(String str, String str2, String str3) {
        this.f29329b = true;
        this.e = str;
        if (str2 == null) {
            str2 = str;
        }
        this.d = str2;
        this.f29332g = str3;
        this.f29335j = System.currentTimeMillis();
    }

    public synchronized void a(String str) {
        if (str != null) {
            if (this.f29333h == null) {
                this.f29333h = str;
            } else if (!this.f29333h.contains(str)) {
                this.f29333h += ImpressionLog.P + str;
            }
        }
    }
}
