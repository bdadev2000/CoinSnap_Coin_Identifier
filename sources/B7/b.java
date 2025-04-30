package b7;

import G7.j;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class b implements InterfaceC0576a {
    @Override // b7.InterfaceC0576a
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        j.d(language, "getDefault().language");
        return language;
    }

    @Override // b7.InterfaceC0576a
    public String getTimeZoneId() {
        String id = TimeZone.getDefault().getID();
        j.d(id, "getDefault().id");
        return id;
    }
}
