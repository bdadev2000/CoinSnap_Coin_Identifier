package a;

import D0.l;
import G7.e;
import G7.j;
import G7.s;
import G7.x;
import L.i;
import M7.b;
import M7.d;
import O7.o;
import Q7.AbstractC0255x;
import Q7.X;
import a5.C0398b;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.TypedValue;
import android.view.View;
import c8.g;
import com.bumptech.glide.f;
import com.facebook.internal.C1838g;
import e8.C2228c;
import e8.F;
import e8.S;
import e8.W;
import e8.e0;
import e8.f0;
import e8.m0;
import g0.C2279a;
import g0.C2280b;
import i8.A;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import t7.C2720i;
import t7.C2725n;
import u7.AbstractC2818i;
import w7.c;
import w7.k;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0325a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3907a = false;
    public static Method b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3908c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f3909d;

    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static float[] b(float[] fArr, int i9) {
        if (i9 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i9, length);
                float[] fArr2 = new float[i9];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static L.i[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0325a.c(java.lang.String):L.i[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (r7 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r8 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress d(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0325a.d(java.lang.String, int, int):java.net.InetAddress");
    }

    public static i[] e(i[] iVarArr) {
        i[] iVarArr2 = new i[iVarArr.length];
        for (int i9 = 0; i9 < iVarArr.length; i9++) {
            iVarArr2[i9] = new i(iVarArr[i9]);
        }
        return iVarArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(T.InterfaceC0276j r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r6 = r6.superDispatchKeyEvent(r9)
            return r6
        Lf:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L64
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r7 == 0) goto L64
            boolean r1 = a.AbstractC0325a.f3907a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            a.AbstractC0325a.b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            a.AbstractC0325a.f3907a = r3
        L4c:
            java.lang.reflect.Method r1 = a.AbstractC0325a.b
            if (r1 == 0) goto L61
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L61
            if (r7 != 0) goto L5b
            goto L61
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L61
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r0 == 0) goto L64
            goto L80
        L64:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r6, r9)
            if (r7 == 0) goto L76
            goto L80
        L76:
            if (r6 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7c:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L80:
            return r3
        L81:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = a.AbstractC0325a.f3908c
            if (r6 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L98
            a.AbstractC0325a.f3909d = r6     // Catch: java.lang.NoSuchFieldException -> L98
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            a.AbstractC0325a.f3908c = r3
        L9a:
            java.lang.reflect.Field r6 = a.AbstractC0325a.f3909d
            if (r6 == 0) goto La5
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r6 = r2
        La6:
            if (r6 == 0) goto Lb3
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r6, r9)
            if (r7 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r6 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Lcf:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld3:
            return r3
        Ld4:
            if (r7 == 0) goto Ldc
            boolean r7 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r7, r9)
            if (r7 != 0) goto Le2
        Ldc:
            boolean r6 = r6.superDispatchKeyEvent(r9)
            if (r6 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0325a.f(T.j, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static final b g(g gVar) {
        j.e(gVar, "<this>");
        if (gVar instanceof c8.b) {
            return ((c8.b) gVar).b;
        }
        if (gVar instanceof f0) {
            return g(((f0) gVar).f20163a);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.internal.g, java.lang.Object] */
    public static C1838g h(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            ?? obj = new Object();
            obj.b = declaredField;
            declaredField.setAccessible(true);
            return obj;
        } catch (NoSuchFieldException e4) {
            throw new AssertionError(e4);
        }
    }

    public static final boolean i(Activity activity) {
        j.e(activity, "activity");
        Object systemService = activity.getSystemService("connectivity");
        j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetworkInfo() != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            j.b(activeNetworkInfo);
            if (activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public static final a8.b k(b bVar, List list, ArrayList arrayList) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        boolean equals7;
        a8.b bVar2;
        a8.b e0Var;
        j.e(bVar, "<this>");
        j.e(list, "types");
        if (bVar.equals(s.a(Collection.class))) {
            equals = true;
        } else {
            equals = bVar.equals(s.a(List.class));
        }
        if (equals) {
            equals2 = true;
        } else {
            equals2 = bVar.equals(s.a(List.class));
        }
        if (equals2) {
            equals3 = true;
        } else {
            equals3 = bVar.equals(s.a(ArrayList.class));
        }
        if (equals3) {
            bVar2 = new C2228c((a8.b) arrayList.get(0), 0);
        } else if (bVar.equals(s.a(HashSet.class))) {
            bVar2 = new C2228c((a8.b) arrayList.get(0), 1);
        } else {
            if (bVar.equals(s.a(Set.class))) {
                equals4 = true;
            } else {
                equals4 = bVar.equals(s.a(Set.class));
            }
            if (equals4) {
                equals5 = true;
            } else {
                equals5 = bVar.equals(s.a(LinkedHashSet.class));
            }
            if (equals5) {
                bVar2 = new C2228c((a8.b) arrayList.get(0), 2);
            } else if (bVar.equals(s.a(HashMap.class))) {
                bVar2 = new F((a8.b) arrayList.get(0), (a8.b) arrayList.get(1), 0);
            } else {
                if (bVar.equals(s.a(Map.class))) {
                    equals6 = true;
                } else {
                    equals6 = bVar.equals(s.a(Map.class));
                }
                if (equals6) {
                    equals7 = true;
                } else {
                    equals7 = bVar.equals(s.a(LinkedHashMap.class));
                }
                if (equals7) {
                    bVar2 = new F((a8.b) arrayList.get(0), (a8.b) arrayList.get(1), 1);
                } else {
                    if (bVar.equals(s.a(Map.Entry.class))) {
                        a8.b bVar3 = (a8.b) arrayList.get(0);
                        a8.b bVar4 = (a8.b) arrayList.get(1);
                        j.e(bVar3, "keySerializer");
                        j.e(bVar4, "valueSerializer");
                        e0Var = new S(bVar3, bVar4, 0);
                    } else if (bVar.equals(s.a(C2720i.class))) {
                        a8.b bVar5 = (a8.b) arrayList.get(0);
                        a8.b bVar6 = (a8.b) arrayList.get(1);
                        j.e(bVar5, "keySerializer");
                        j.e(bVar6, "valueSerializer");
                        e0Var = new S(bVar5, bVar6, 1);
                    } else if (bVar.equals(s.a(C2725n.class))) {
                        a8.b bVar7 = (a8.b) arrayList.get(0);
                        a8.b bVar8 = (a8.b) arrayList.get(1);
                        a8.b bVar9 = (a8.b) arrayList.get(2);
                        j.e(bVar7, "aSerializer");
                        j.e(bVar8, "bSerializer");
                        j.e(bVar9, "cSerializer");
                        bVar2 = new m0(bVar7, bVar8, bVar9);
                    } else if (com.facebook.appevents.g.n(bVar).isArray()) {
                        b bVar10 = ((x) ((d) list.get(0))).f1337a;
                        j.c(bVar10, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        a8.b bVar11 = (a8.b) arrayList.get(0);
                        j.e(bVar11, "elementSerializer");
                        e0Var = new e0((e) bVar10, bVar11);
                    } else {
                        bVar2 = null;
                    }
                    bVar2 = e0Var;
                }
            }
        }
        if (bVar2 == null) {
            Object[] array = arrayList.toArray(new a8.b[0]);
            j.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            a8.b[] bVarArr = (a8.b[]) array;
            return W.d(bVar, (a8.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }
        return bVar2;
    }

    public static l l(String str) {
        int i9;
        String str2;
        j.e(str, "statusLine");
        boolean C8 = o.C(str, "HTTP/1.", false);
        A a6 = A.HTTP_1_0;
        if (C8) {
            i9 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        a6 = A.HTTP_1_1;
                    } else {
                        throw new ProtocolException(j.j(str, "Unexpected status line: "));
                    }
                }
            } else {
                throw new ProtocolException(j.j(str, "Unexpected status line: "));
            }
        } else if (o.C(str, "ICY ", false)) {
            i9 = 4;
        } else {
            throw new ProtocolException(j.j(str, "Unexpected status line: "));
        }
        int i10 = i9 + 3;
        if (str.length() >= i10) {
            try {
                String substring = str.substring(i9, i10);
                j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i10) {
                    if (str.charAt(i10) == ' ') {
                        str2 = str.substring(i9 + 4);
                        j.d(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(j.j(str, "Unexpected status line: "));
                    }
                } else {
                    str2 = "";
                }
                return new l(a6, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(j.j(str, "Unexpected status line: "));
            }
        }
        throw new ProtocolException(j.j(str, "Unexpected status line: "));
    }

    public static C2280b m(String str, f fVar) {
        C2279a c2279a = C2279a.b;
        k kVar = Q7.F.b;
        X x9 = new X(null);
        kVar.getClass();
        if (x9 != w7.l.b) {
            kVar = (k) x9.b(kVar, c.f23996d);
        }
        V7.e a6 = AbstractC0255x.a(kVar);
        j.e(str, "name");
        return new C2280b(str, fVar, c2279a, a6);
    }

    public static TypedValue n(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean o(Context context, int i9, boolean z8) {
        TypedValue n2 = n(context, i9);
        if (n2 != null && n2.type == 18) {
            if (n2.data != 0) {
                return true;
            }
            return false;
        }
        return z8;
    }

    public static TypedValue p(Context context, int i9, String str) {
        TypedValue n2 = n(context, i9);
        if (n2 != null) {
            return n2;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i9)));
    }

    public static final a8.b q(C0398b c0398b, d dVar) {
        j.e(c0398b, "<this>");
        j.e(dVar, "type");
        a8.b x9 = android.support.v4.media.session.a.x(c0398b, dVar, true);
        if (x9 != null) {
            return x9;
        }
        b f9 = W.f(dVar);
        j.e(f9, "<this>");
        W.g(f9);
        throw null;
    }

    public static final ArrayList r(C0398b c0398b, List list, boolean z8) {
        ArrayList arrayList;
        j.e(c0398b, "<this>");
        j.e(list, "typeArguments");
        if (z8) {
            List list2 = list;
            arrayList = new ArrayList(AbstractC2818i.E(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(q(c0398b, (d) it.next()));
            }
        } else {
            List<d> list3 = list;
            arrayList = new ArrayList(AbstractC2818i.E(list3, 10));
            for (d dVar : list3) {
                j.e(dVar, "type");
                a8.b x9 = android.support.v4.media.session.a.x(c0398b, dVar, false);
                if (x9 == null) {
                    return null;
                }
                arrayList.add(x9);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, w8.f] */
    public static final String s(String str) {
        InetAddress d2;
        j.e(str, "<this>");
        int i9 = 0;
        int i10 = -1;
        if (O7.g.E(":", str)) {
            if (o.C(str, "[", false) && str.endsWith("]")) {
                d2 = d(str, 1, str.length() - 1);
            } else {
                d2 = d(str, 0, str.length());
            }
            if (d2 == null) {
                return null;
            }
            byte[] address = d2.getAddress();
            if (address.length == 16) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < address.length) {
                    int i13 = i11;
                    while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                        i13 += 2;
                    }
                    int i14 = i13 - i11;
                    if (i14 > i12 && i14 >= 4) {
                        i10 = i11;
                        i12 = i14;
                    }
                    i11 = i13 + 2;
                }
                ?? obj = new Object();
                while (i9 < address.length) {
                    if (i9 == i10) {
                        obj.n(58);
                        i9 += i12;
                        if (i9 == 16) {
                            obj.n(58);
                        }
                    } else {
                        if (i9 > 0) {
                            obj.n(58);
                        }
                        byte b8 = address[i9];
                        byte[] bArr = j8.b.f21214a;
                        obj.p(((b8 & 255) << 8) | (address[i9 + 1] & 255));
                        i9 += 2;
                    }
                }
                return obj.readUtf8();
            }
            if (address.length == 4) {
                return d2.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            j.d(ascii, "toASCII(host)");
            Locale locale = Locale.US;
            j.d(locale, "US");
            String lowerCase = ascii.toLowerCase(locale);
            j.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                return null;
            }
            int length = lowerCase.length();
            int i15 = 0;
            while (i15 < length) {
                int i16 = i15 + 1;
                char charAt = lowerCase.charAt(i15);
                if (j.f(charAt, 31) <= 0 || j.f(charAt, 127) >= 0 || O7.g.I(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                    return null;
                }
                i15 = i16;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public abstract void j(Set set);
}
