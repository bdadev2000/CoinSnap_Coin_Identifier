package j0;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class f {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(@NonNull Configuration configuration, @NonNull k kVar) {
        configuration.setLocales((LocaleList) kVar.a.a());
    }
}
