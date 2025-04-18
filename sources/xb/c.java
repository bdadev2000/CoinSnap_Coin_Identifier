package xb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import vb.g;

/* loaded from: classes3.dex */
public final class c implements vb.f {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).f(a.format((Date) obj));
    }
}
