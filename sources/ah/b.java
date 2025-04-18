package ah;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements a {
    @Override // ah.a
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    @Override // ah.a
    public String getTimeZoneId() {
        String id2 = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id2, "getDefault().id");
        return id2;
    }
}
