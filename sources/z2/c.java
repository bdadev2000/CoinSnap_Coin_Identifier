package z2;

import android.os.Bundle;
import android.view.View;
import com.facebook.r;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24507a = new Object();

    public static Bundle b(A2.c cVar, View view, View view2) {
        ArrayList j7;
        Bundle bundle = new Bundle();
        if (cVar == null) {
            return bundle;
        }
        List<A2.d> unmodifiableList = Collections.unmodifiableList(cVar.f27c);
        G7.j.d(unmodifiableList, "unmodifiableList(parameters)");
        for (A2.d dVar : unmodifiableList) {
            String str = dVar.b;
            String str2 = dVar.f29a;
            if (str != null && str.length() > 0) {
                bundle.putString(str2, dVar.b);
            } else {
                ArrayList arrayList = dVar.f30c;
                if (arrayList.size() > 0) {
                    if (G7.j.a(dVar.f31d, "relative")) {
                        j7 = com.facebook.appevents.g.j(view2, arrayList, 0, -1, view2.getClass().getSimpleName());
                    } else {
                        j7 = com.facebook.appevents.g.j(view, arrayList, 0, -1, view.getClass().getSimpleName());
                    }
                    Iterator it = j7.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            e eVar = (e) it.next();
                            if (eVar.a() != null) {
                                A2.g gVar = A2.g.f40a;
                                String i9 = A2.g.i(eVar.a());
                                if (i9.length() > 0) {
                                    bundle.putString(str2, i9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static final void c(A2.c cVar, View view, View view2) {
        if (O2.a.b(c.class)) {
            return;
        }
        try {
            G7.j.e(cVar, "mapping");
            String str = cVar.f26a;
            Bundle b = b(cVar, view, view2);
            f24507a.d(b);
            r.c().execute(new com.facebook.appevents.k(24, str, b));
        } catch (Throwable th) {
            O2.a.a(c.class, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #2 {all -> 0x002c, blocks: (B:3:0x0001, B:8:0x0016, B:14:0x0028, B:15:0x002e, B:28:0x003b, B:21:0x0042, B:22:0x0049, B:33:0x0010, B:11:0x0024, B:25:0x0037, B:30:0x000c), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #2 {all -> 0x002c, blocks: (B:3:0x0001, B:8:0x0016, B:14:0x0028, B:15:0x002e, B:28:0x003b, B:21:0x0042, B:22:0x0049, B:33:0x0010, B:11:0x0024, B:25:0x0037, B:30:0x000c), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized z2.g a() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.Class<z2.g> r0 = z2.g.class
            boolean r1 = O2.a.b(r0)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            if (r1 == 0) goto Lc
        La:
            r0 = r2
            goto L14
        Lc:
            z2.g r0 = z2.g.f24520g     // Catch: java.lang.Throwable -> Lf
            goto L14
        Lf:
            r1 = move-exception
            O2.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto La
        L14:
            if (r0 != 0) goto L2e
            z2.g r0 = new z2.g     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<z2.g> r1 = z2.g.class
            boolean r3 = O2.a.b(r1)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L24
            goto L2e
        L24:
            z2.g.f24520g = r0     // Catch: java.lang.Throwable -> L27
            goto L2e
        L27:
            r0 = move-exception
            O2.a.a(r1, r0)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L4a
        L2e:
            java.lang.Class<z2.g> r0 = z2.g.class
            boolean r1 = O2.a.b(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L37
            goto L3e
        L37:
            z2.g r2 = z2.g.f24520g     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r1 = move-exception
            O2.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2c
        L3e:
            if (r2 == 0) goto L42
            monitor-exit(r4)
            return r2
        L42:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L4a:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.a():z2.g");
    }

    public void d(Bundle bundle) {
        Locale locale;
        if (O2.a.b(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double d2 = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        try {
                            locale = r.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            G7.j.d(locale, "getDefault()");
                        }
                        d2 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", d2);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
