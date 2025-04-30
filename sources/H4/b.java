package h4;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k4.C2432a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f20589g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f20590h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f20591a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20592c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f20593d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20594e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20595f;

    public b(String str, String str2, String str3, Date date, long j7, long j9) {
        this.f20591a = str;
        this.b = str2;
        this.f20592c = str3;
        this.f20593d = date;
        this.f20594e = j7;
        this.f20595f = j9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k4.a] */
    public final C2432a a(String str) {
        ?? obj = new Object();
        obj.f21459a = str;
        obj.m = this.f20593d.getTime();
        obj.b = this.f20591a;
        obj.f21460c = this.b;
        String str2 = this.f20592c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        obj.f21461d = str2;
        obj.f21462e = this.f20594e;
        obj.f21467j = this.f20595f;
        return obj;
    }
}
