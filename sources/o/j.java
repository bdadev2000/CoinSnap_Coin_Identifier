package o;

import android.os.LocaleList;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class j {
    @Nullable
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
