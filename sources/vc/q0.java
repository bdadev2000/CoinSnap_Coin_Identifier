package vc;

import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public final class q0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        String str;
        String str2;
        String str3 = null;
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.Z(), "_");
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        } else {
            str = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str3 = stringTokenizer.nextToken();
        }
        if (str2 == null && str3 == null) {
            return new Locale(str);
        }
        if (str3 == null) {
            return new Locale(str, str2);
        }
        return new Locale(str, str2, str3);
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        bVar.X(locale);
    }
}
