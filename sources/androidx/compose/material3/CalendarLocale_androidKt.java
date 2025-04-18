package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class CalendarLocale_androidKt {
    public static final Locale a(Composer composer) {
        composer.J(-1190822718);
        Locale locale = ((Configuration) composer.K(AndroidCompositionLocals_androidKt.f16324a)).getLocales().get(0);
        composer.D();
        return locale;
    }
}
