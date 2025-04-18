package te;

import android.util.Range;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class c {
    public static final fe.c a = new fe.c("FpsRangeValidator");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f25380b;

    static {
        HashMap hashMap = new HashMap();
        f25380b = hashMap;
        hashMap.put("Google Pixel 4", Arrays.asList(new Range(15, 60)));
        hashMap.put("Google Pixel 4a", Arrays.asList(new Range(15, 60)));
    }
}
