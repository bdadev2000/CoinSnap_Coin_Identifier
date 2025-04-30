package D2;

import F2.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f730a = new Object();
    public static boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f731c;

    public final boolean a(String str) {
        if (O2.a.b(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!O2.a.b(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i9 = 0; i9 < 30; i9++) {
                        fArr[i9] = 0.0f;
                    }
                    g gVar = g.f1140a;
                    String[] f9 = g.f(F2.c.b, new float[][]{fArr}, new String[]{str});
                    if (f9 != null) {
                        String str3 = f9[0];
                        if (str3 != null) {
                            str2 = str3;
                        }
                    }
                    str2 = "none";
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th2) {
            O2.a.a(this, th2);
            return false;
        }
    }
}
