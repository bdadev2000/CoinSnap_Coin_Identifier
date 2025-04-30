package u;

import android.os.LocaleList;
import androidx.annotation.Nullable;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2737f {
    @Nullable
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
