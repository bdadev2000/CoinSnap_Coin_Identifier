package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class CustomTabColorSchemeParams {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1329a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1330b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1331c;
    public final Integer d;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Integer f1332a;
    }

    public CustomTabColorSchemeParams(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1329a = num;
        this.f1330b = num2;
        this.f1331c = num3;
        this.d = num4;
    }

    public static CustomTabColorSchemeParams a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new CustomTabColorSchemeParams((Integer) bundle.get(CustomTabsIntent.EXTRA_TOOLBAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR), (Integer) bundle.get(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR));
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f1329a;
        if (num != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_TOOLBAR_COLOR, num.intValue());
        }
        Integer num2 = this.f1330b;
        if (num2 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_COLOR, num2.intValue());
        }
        Integer num3 = this.f1331c;
        if (num3 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_COLOR, num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt(CustomTabsIntent.EXTRA_NAVIGATION_BAR_DIVIDER_COLOR, num4.intValue());
        }
        return bundle;
    }
}
