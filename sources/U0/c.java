package U0;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f3104c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f3105a;
    public final String b;

    public c(String str, String str2) {
        this.f3105a = str;
        this.b = str2;
        f3104c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3102a;
        String str = this.b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
