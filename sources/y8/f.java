package y8;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m9.p0;
import s7.x1;

/* loaded from: classes3.dex */
public final class f implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f28058b = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // m9.p0
    public final Object d(Uri uri, m9.n nVar) {
        long j3;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(nVar, ra.f.f24049c)).readLine();
        try {
            Matcher matcher = f28058b.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j3 = 1;
                    } else {
                        j3 = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(group2);
                    }
                    time -= ((((parseLong2 * 60) + parseLong) * 60) * 1000) * j3;
                }
                return Long.valueOf(time);
            }
            throw x1.b("Couldn't parse timestamp: " + readLine, null);
        } catch (ParseException e2) {
            throw x1.b(null, e2);
        }
    }
}
