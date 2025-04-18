package l2;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f21114c = new HashSet();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21115b;

    public c(String str, String str2) {
        this.a = str;
        this.f21115b = str2;
        f21114c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        boolean z10;
        HashSet hashSet = a.a;
        String str = this.f21115b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (hashSet.contains(str + ":dev")) {
                return true;
            }
        }
        return false;
    }
}
