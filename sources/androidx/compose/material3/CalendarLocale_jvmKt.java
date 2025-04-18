package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class CalendarLocale_jvmKt {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f8113a = new WeakHashMap();

    public static String a(int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i3 = 1;
        }
        int i5 = (i4 & 2) != 0 ? 40 : 0;
        String str = i3 + '.' + i5 + ".false." + Locale.getDefault().toLanguageTag();
        WeakHashMap weakHashMap = f8113a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i3);
            integerInstance.setMaximumIntegerDigits(i5);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i2));
    }
}
