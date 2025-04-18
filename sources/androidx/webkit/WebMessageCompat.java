package androidx.webkit;

import androidx.annotation.RestrictTo;
import com.facebook.internal.AnalyticsEvents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public class WebMessageCompat {

    /* renamed from: a, reason: collision with root package name */
    public final WebMessagePortCompat[] f21798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21799b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21800c;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface Type {
    }

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.f21799b = str;
        this.f21798a = webMessagePortCompatArr;
        this.f21800c = 0;
    }

    public final void a(int i2) {
        int i3 = this.f21800c;
        if (i2 == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        sb.append(i3 != 0 ? i3 != 1 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append(i2 != 0 ? i2 != 1 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb.toString());
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.f21799b = null;
        this.f21798a = webMessagePortCompatArr;
        this.f21800c = 1;
    }
}
