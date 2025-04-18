package y7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.h0;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f28005c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f28006b = -1;

    public final boolean a(String str) {
        Matcher matcher = f28005c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = h0.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.f28006b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(l8.b bVar) {
        int i10 = 0;
        while (true) {
            l8.a[] aVarArr = bVar.f21159b;
            if (i10 < aVarArr.length) {
                l8.a aVar = aVarArr[i10];
                if (aVar instanceof q8.e) {
                    q8.e eVar = (q8.e) aVar;
                    if ("iTunSMPB".equals(eVar.f23708d) && a(eVar.f23709f)) {
                        return;
                    }
                } else if (aVar instanceof q8.k) {
                    q8.k kVar = (q8.k) aVar;
                    if ("com.apple.iTunes".equals(kVar.f23719c) && "iTunSMPB".equals(kVar.f23720d) && a(kVar.f23721f)) {
                        return;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
