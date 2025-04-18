package com.facebook.internal;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ k0(int i10) {
        this.a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.a) {
            case 0:
                return Pattern.matches("cpu[0-9]+", name);
            case 1:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return new Regex(com.applovin.impl.mediation.ads.e.h(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3, "^(%s|%s|%s)[0-9]+.json$", "java.lang.String.format(format, *args)")).matches(name);
            case 2:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                return new Regex(com.applovin.impl.mediation.ads.e.h(new Object[]{"analysis_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).matches(name);
            case 3:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                return new Regex(com.applovin.impl.mediation.ads.e.h(new Object[]{"anr_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).matches(name);
            case 4:
                Intrinsics.checkNotNullExpressionValue(name, "name");
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                return new Regex(com.applovin.impl.mediation.ads.e.h(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).matches(name);
            case 5:
                return name.startsWith("aqs.");
            case 6:
                return name.startsWith(".ae");
            case 7:
                Charset charset = ob.a.f23284e;
                return name.startsWith(NotificationCompat.CATEGORY_EVENT);
            default:
                Charset charset2 = ob.a.f23284e;
                if (name.startsWith(NotificationCompat.CATEGORY_EVENT) && !name.endsWith("_")) {
                    return true;
                }
                return false;
        }
    }
}
