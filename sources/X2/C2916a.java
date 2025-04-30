package x2;

import E2.e;
import G7.j;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashMap;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2916a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2916a f24217a = new Object();
    public static boolean b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r6.equals("r5") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r0 = java.util.regex.Pattern.compile("[^a-z]+");
        G7.j.d(r0, "compile(...)");
        r7 = r0.matcher(r7).replaceAll("");
        G7.j.d(r7, "replaceAll(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r6.equals("r4") == false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.util.HashMap r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.util.HashMap r0 = x2.ViewTreeObserverOnGlobalFocusChangeListenerC2919d.f24222g
            int r0 = r6.hashCode()
            java.lang.String r1 = "compile(...)"
            r2 = 0
            switch(r0) {
                case 3585: goto Lb0;
                case 3586: goto L8e;
                case 3587: goto L85;
                case 3588: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Ld6
        Le:
            java.lang.String r0 = "r6"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L18
            goto Ld6
        L18:
            java.lang.String r0 = "-"
            boolean r3 = O7.g.E(r0, r7)
            if (r3 == 0) goto Ld6
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            G7.j.d(r0, r1)
            O7.g.S(r2)
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r1 = r0.find()
            if (r1 != 0) goto L3d
            java.lang.String r7 = r7.toString()
            java.util.List r7 = android.support.v4.media.session.a.w(r7)
            goto L6e
        L3d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            r1.<init>(r3)
            r3 = r2
        L45:
            int r4 = r0.start()
            java.lang.CharSequence r3 = r7.subSequence(r3, r4)
            java.lang.String r3 = r3.toString()
            r1.add(r3)
            int r3 = r0.end()
            boolean r4 = r0.find()
            if (r4 != 0) goto L45
            int r0 = r7.length()
            java.lang.CharSequence r7 = r7.subSequence(r3, r0)
            java.lang.String r7 = r7.toString()
            r1.add(r7)
            r7 = r1
        L6e:
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r7 = r7.toArray(r0)
            if (r7 == 0) goto L7d
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7 = r7[r2]
            goto Ld6
        L7d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5.<init>(r6)
            throw r5
        L85:
            java.lang.String r0 = "r5"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L97
            goto Ld6
        L8e:
            java.lang.String r0 = "r4"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L97
            goto Ld6
        L97:
            java.lang.String r0 = "[^a-z]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            G7.j.d(r0, r1)
            java.util.regex.Matcher r7 = r0.matcher(r7)
            java.lang.String r0 = ""
            java.lang.String r7 = r7.replaceAll(r0)
            java.lang.String r0 = "replaceAll(...)"
            G7.j.d(r7, r0)
            goto Ld6
        Lb0:
            java.lang.String r0 = "r3"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lb9
            goto Ld6
        Lb9:
            java.lang.String r0 = "m"
            boolean r1 = O7.o.C(r7, r0, r2)
            if (r1 != 0) goto Ld5
            java.lang.String r1 = "b"
            boolean r1 = O7.o.C(r7, r1, r2)
            if (r1 != 0) goto Ld5
            java.lang.String r1 = "ge"
            boolean r7 = O7.o.C(r7, r1, r2)
            if (r7 == 0) goto Ld2
            goto Ld5
        Ld2:
            java.lang.String r7 = "f"
            goto Ld6
        Ld5:
            r7 = r0
        Ld6:
            r5.put(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2916a.a(java.util.HashMap, java.lang.String, java.lang.String):void");
    }

    public static void b(Activity activity) {
        View b8;
        j.e(activity, "activity");
        int hashCode = activity.hashCode();
        HashMap hashMap = null;
        if (!O2.a.b(ViewTreeObserverOnGlobalFocusChangeListenerC2919d.class)) {
            try {
                hashMap = ViewTreeObserverOnGlobalFocusChangeListenerC2919d.f24222g;
            } catch (Throwable th) {
                O2.a.a(ViewTreeObserverOnGlobalFocusChangeListenerC2919d.class, th);
            }
        }
        Integer valueOf = Integer.valueOf(hashCode);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new ViewTreeObserverOnGlobalFocusChangeListenerC2919d(activity);
            hashMap.put(valueOf, obj);
        }
        ViewTreeObserverOnGlobalFocusChangeListenerC2919d viewTreeObserverOnGlobalFocusChangeListenerC2919d = (ViewTreeObserverOnGlobalFocusChangeListenerC2919d) obj;
        if (!O2.a.b(ViewTreeObserverOnGlobalFocusChangeListenerC2919d.class)) {
            try {
                if (!O2.a.b(viewTreeObserverOnGlobalFocusChangeListenerC2919d)) {
                    try {
                        if (!viewTreeObserverOnGlobalFocusChangeListenerC2919d.f24225f.getAndSet(true) && (b8 = e.b((Activity) viewTreeObserverOnGlobalFocusChangeListenerC2919d.f24224d.get())) != null) {
                            ViewTreeObserver viewTreeObserver = b8.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC2919d);
                            }
                        }
                    } catch (Throwable th2) {
                        O2.a.a(viewTreeObserverOnGlobalFocusChangeListenerC2919d, th2);
                    }
                }
            } catch (Throwable th3) {
                O2.a.a(ViewTreeObserverOnGlobalFocusChangeListenerC2919d.class, th3);
            }
        }
    }
}
