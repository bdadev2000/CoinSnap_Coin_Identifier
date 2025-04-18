package g9;

import a9.g;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f18370o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f18371p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    public final StringBuilder f18372m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f18373n = new ArrayList();

    public static long e(Matcher matcher, int i10) {
        long j3;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j3 = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j3 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60 * 1000) + j3;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0262, code lost:
    
        return new f9.e(1, (a9.b[]) r2.toArray(new a9.b[0]), java.util.Arrays.copyOf((long[]) r3.f2032c, r3.f2031b));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0175. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    @Override // a9.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a9.h b(byte[] r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.a.b(byte[], int, boolean):a9.h");
    }
}
