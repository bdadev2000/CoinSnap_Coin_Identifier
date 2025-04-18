package wa;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f26954g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f26955h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26956b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26957c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f26958d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26959e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26960f;

    public b(String str, String str2, String str3, Date date, long j3, long j10) {
        this.a = str;
        this.f26956b = str2;
        this.f26957c = str3;
        this.f26958d = date;
        this.f26959e = j3;
        this.f26960f = j10;
    }

    public final za.a a(String str) {
        za.a aVar = new za.a();
        aVar.a = str;
        aVar.f28710m = this.f26958d.getTime();
        aVar.f28699b = this.a;
        aVar.f28700c = this.f26956b;
        String str2 = this.f26957c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        aVar.f28701d = str2;
        aVar.f28702e = this.f26959e;
        aVar.f28707j = this.f26960f;
        return aVar;
    }
}
