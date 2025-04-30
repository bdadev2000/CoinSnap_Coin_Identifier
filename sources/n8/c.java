package n8;

import G7.j;
import H1.h;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final h f21861a = new h(5);
    public static final String[] b;

    /* renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f21862c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = strArr;
        f21862c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        j.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f21861a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9 + 1;
                    DateFormat[] dateFormatArr = f21862c;
                    DateFormat dateFormat = dateFormatArr[i9];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(b[i9], Locale.US);
                        dateFormat.setTimeZone(j8.b.f21217e);
                        dateFormatArr[i9] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                    i9 = i10;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
