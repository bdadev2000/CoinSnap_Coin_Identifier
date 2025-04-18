package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import b1.f0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class NavType$Companion$StringArrayType$1 extends CollectionNavType<String[]> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (String[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "string[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        String[] strArr = (String[]) obj;
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        Object[] copyOf = Arrays.copyOf(strArr, length + 1);
        System.arraycopy(new String[]{str}, 0, copyOf, length, 1);
        p0.a.p(copyOf);
        return (String[]) copyOf;
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        return new String[]{str};
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putStringArray(str, (String[]) obj);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        return f0.g((String[]) obj, (String[]) obj2);
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object h() {
        return new String[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List i(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null) {
            return w.f30218a;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Uri.encode(str));
        }
        return arrayList;
    }
}
