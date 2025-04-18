package fe;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static int f17817b;

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArraySet f17818c;
    public final String a;

    static {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        f17818c = copyOnWriteArraySet;
        b bVar = new b();
        f17817b = 3;
        copyOnWriteArraySet.add(bVar);
    }

    public c(String str) {
        this.a = str;
    }

    public final String a(int i10, Object... objArr) {
        boolean z10;
        int i11 = f17817b;
        CopyOnWriteArraySet copyOnWriteArraySet = f17818c;
        if (i11 <= i10 && copyOnWriteArraySet.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Throwable th2 = null;
        if (!z10) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj instanceof Throwable) {
                th2 = (Throwable) obj;
            }
            sb2.append(String.valueOf(obj));
            sb2.append(" ");
        }
        String trim = sb2.toString().trim();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).getClass();
            String str = this.a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            Log.e(str, trim, th2);
                        }
                    } else {
                        Log.w(str, trim, th2);
                    }
                } else {
                    Log.i(str, trim, th2);
                }
            } else {
                Log.v(str, trim, th2);
            }
        }
        return trim;
    }
}
