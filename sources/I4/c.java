package I4;

import G4.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class c implements G4.f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f1455a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f1455a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).f(f1455a.format((Date) obj));
    }
}
