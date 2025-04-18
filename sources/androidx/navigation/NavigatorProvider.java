package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes3.dex */
public class NavigatorProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f20517b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20518a = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = NavigatorProvider.f20517b;
            String str = (String) linkedHashMap.get(cls);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
                str = name != null ? name.value() : null;
                if (str == null || str.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, str);
            }
            p0.a.p(str);
            return str;
        }
    }

    public final void a(Navigator navigator) {
        p0.a.s(navigator, "navigator");
        String a2 = Companion.a(navigator.getClass());
        if (a2.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.f20518a;
        Navigator navigator2 = (Navigator) linkedHashMap.get(a2);
        if (p0.a.g(navigator2, navigator)) {
            return;
        }
        boolean z2 = false;
        if (navigator2 != null && navigator2.f20512b) {
            z2 = true;
        }
        if (!(!z2)) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.f20512b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public Navigator b(String str) {
        p0.a.s(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator navigator = (Navigator) this.f20518a.get(str);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException(androidx.compose.foundation.text.input.a.A("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
