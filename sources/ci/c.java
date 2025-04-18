package ci;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c {
    public static final y3.g a = new y3.g(4);

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2799b;

    /* renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f2800c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f2799b = strArr;
        f2800c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f2799b;
        synchronized (strArr) {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                DateFormat[] dateFormatArr = f2800c;
                DateFormat dateFormat = dateFormatArr[i10];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f2799b[i10], Locale.US);
                    dateFormat.setTimeZone(xh.b.f27680e);
                    dateFormatArr[i10] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
                i10 = i11;
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }
}
