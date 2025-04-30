package com.facebook.login;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.login.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1850a {
    public static final /* synthetic */ EnumC1850a[] b = {new Enum("S256", 0), new Enum("PLAIN", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1850a EF5;

    public static EnumC1850a valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (EnumC1850a) Enum.valueOf(EnumC1850a.class, str);
    }

    public static EnumC1850a[] values() {
        return (EnumC1850a[]) Arrays.copyOf(b, 2);
    }
}
