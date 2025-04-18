package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import b1.f0;
import e0.n;
import e0.t;
import e0.u;
import e0.w;
import e1.i1;
import e1.n0;
import e1.o0;
import e1.s0;
import e1.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.e;
import q0.l;
import y0.r;

/* loaded from: classes3.dex */
public class NavController {
    public final LinkedHashMap A;
    public int B;
    public final ArrayList C;
    public final s0 D;
    public final n0 E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20345a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f20346b;

    /* renamed from: c, reason: collision with root package name */
    public NavGraph f20347c;
    public Bundle d;
    public Parcelable[] e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20348f;

    /* renamed from: g, reason: collision with root package name */
    public final n f20349g;

    /* renamed from: h, reason: collision with root package name */
    public final i1 f20350h;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f20351i;

    /* renamed from: j, reason: collision with root package name */
    public final i1 f20352j;

    /* renamed from: k, reason: collision with root package name */
    public final o0 f20353k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f20354l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f20355m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f20356n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f20357o;

    /* renamed from: p, reason: collision with root package name */
    public LifecycleOwner f20358p;

    /* renamed from: q, reason: collision with root package name */
    public NavControllerViewModel f20359q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f20360r;

    /* renamed from: s, reason: collision with root package name */
    public Lifecycle.State f20361s;

    /* renamed from: t, reason: collision with root package name */
    public final a f20362t;

    /* renamed from: u, reason: collision with root package name */
    public final NavController$onBackPressedCallback$1 f20363u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f20364v;
    public final NavigatorProvider w;
    public final LinkedHashMap x;

    /* renamed from: y, reason: collision with root package name */
    public l f20365y;

    /* renamed from: z, reason: collision with root package name */
    public l f20366z;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* loaded from: classes3.dex */
    public final class NavControllerNavigatorState extends NavigatorState {

        /* renamed from: g, reason: collision with root package name */
        public final Navigator f20367g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ NavController f20368h;

        public NavControllerNavigatorState(NavHostController navHostController, Navigator navigator) {
            p0.a.s(navigator, "navigator");
            this.f20368h = navHostController;
            this.f20367g = navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public final NavBackStackEntry a(NavDestination navDestination, Bundle bundle) {
            NavController navController = this.f20368h;
            return NavBackStackEntry.Companion.a(navController.f20345a, navDestination, bundle, navController.h(), navController.f20359q);
        }

        @Override // androidx.navigation.NavigatorState
        public final void b(NavBackStackEntry navBackStackEntry) {
            NavControllerViewModel navControllerViewModel;
            p0.a.s(navBackStackEntry, "entry");
            NavController navController = this.f20368h;
            boolean g2 = p0.a.g(navController.A.get(navBackStackEntry), Boolean.TRUE);
            super.b(navBackStackEntry);
            navController.A.remove(navBackStackEntry);
            n nVar = navController.f20349g;
            boolean contains = nVar.contains(navBackStackEntry);
            i1 i1Var = navController.f20352j;
            if (contains) {
                if (this.d) {
                    return;
                }
                navController.w();
                navController.f20350h.h(u.b1(nVar));
                i1Var.h(navController.s());
                return;
            }
            navController.v(navBackStackEntry);
            if (navBackStackEntry.f20333i.d.compareTo(Lifecycle.State.f19989c) >= 0) {
                navBackStackEntry.c(Lifecycle.State.f19987a);
            }
            boolean z2 = nVar instanceof Collection;
            String str = navBackStackEntry.f20331g;
            if (!z2 || !nVar.isEmpty()) {
                Iterator it = nVar.iterator();
                while (it.hasNext()) {
                    if (p0.a.g(((NavBackStackEntry) it.next()).f20331g, str)) {
                        break;
                    }
                }
            }
            if (!g2 && (navControllerViewModel = navController.f20359q) != null) {
                p0.a.s(str, "backStackEntryId");
                ViewModelStore viewModelStore = (ViewModelStore) navControllerViewModel.f20397b.remove(str);
                if (viewModelStore != null) {
                    viewModelStore.a();
                }
            }
            navController.w();
            i1Var.h(navController.s());
        }

        @Override // androidx.navigation.NavigatorState
        public final void c(NavBackStackEntry navBackStackEntry, boolean z2) {
            p0.a.s(navBackStackEntry, "popUpTo");
            NavController navController = this.f20368h;
            Navigator b2 = navController.w.b(navBackStackEntry.f20328b.f20431a);
            navController.A.put(navBackStackEntry, Boolean.valueOf(z2));
            if (!p0.a.g(b2, this.f20367g)) {
                Object obj = navController.x.get(b2);
                p0.a.p(obj);
                ((NavControllerNavigatorState) obj).c(navBackStackEntry, z2);
                return;
            }
            l lVar = navController.f20366z;
            if (lVar != null) {
                lVar.invoke(navBackStackEntry);
                super.c(navBackStackEntry, z2);
                return;
            }
            NavController$NavControllerNavigatorState$pop$1 navController$NavControllerNavigatorState$pop$1 = new NavController$NavControllerNavigatorState$pop$1(this, navBackStackEntry, z2);
            n nVar = navController.f20349g;
            int indexOf = nVar.indexOf(navBackStackEntry);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
                return;
            }
            int i2 = indexOf + 1;
            if (i2 != nVar.f30212c) {
                navController.o(((NavBackStackEntry) nVar.get(i2)).f20328b.f20436h, true, false);
            }
            NavController.r(navController, navBackStackEntry);
            navController$NavControllerNavigatorState$pop$1.invoke();
            navController.x();
            navController.b();
        }

        @Override // androidx.navigation.NavigatorState
        public final void d(NavBackStackEntry navBackStackEntry, boolean z2) {
            p0.a.s(navBackStackEntry, "popUpTo");
            super.d(navBackStackEntry, z2);
        }

        @Override // androidx.navigation.NavigatorState
        public final void e(NavBackStackEntry navBackStackEntry) {
            p0.a.s(navBackStackEntry, "entry");
            super.e(navBackStackEntry);
            if (!this.f20368h.f20349g.contains(navBackStackEntry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            navBackStackEntry.c(Lifecycle.State.d);
        }

        @Override // androidx.navigation.NavigatorState
        public final void f(NavBackStackEntry navBackStackEntry) {
            p0.a.s(navBackStackEntry, "backStackEntry");
            NavController navController = this.f20368h;
            Navigator b2 = navController.w.b(navBackStackEntry.f20328b.f20431a);
            if (!p0.a.g(b2, this.f20367g)) {
                Object obj = navController.x.get(b2);
                if (obj == null) {
                    throw new IllegalStateException(d.r(new StringBuilder("NavigatorBackStack for "), navBackStackEntry.f20328b.f20431a, " should already be created").toString());
                }
                ((NavControllerNavigatorState) obj).f(navBackStackEntry);
                return;
            }
            l lVar = navController.f20365y;
            if (lVar != null) {
                lVar.invoke(navBackStackEntry);
                super.f(navBackStackEntry);
            } else {
                Log.i("NavController", "Ignoring add of destination " + navBackStackEntry.f20328b + " outside of the call to navigate(). ");
            }
        }

        public final void h(NavBackStackEntry navBackStackEntry) {
            super.f(navBackStackEntry);
        }
    }

    /* loaded from: classes3.dex */
    public interface OnDestinationChangedListener {
        void a();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.navigation.NavController$onBackPressedCallback$1] */
    public NavController(Context context) {
        Object obj;
        p0.a.s(context, "context");
        this.f20345a = context;
        Iterator it = y0.n.J(context, NavController$activity$1.f20372a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f20346b = (Activity) obj;
        this.f20349g = new n();
        w wVar = w.f30218a;
        i1 c2 = t0.c(wVar);
        this.f20350h = c2;
        this.f20351i = new o0(c2);
        i1 c3 = t0.c(wVar);
        this.f20352j = c3;
        this.f20353k = new o0(c3);
        this.f20354l = new LinkedHashMap();
        this.f20355m = new LinkedHashMap();
        this.f20356n = new LinkedHashMap();
        this.f20357o = new LinkedHashMap();
        this.f20360r = new CopyOnWriteArrayList();
        this.f20361s = Lifecycle.State.f19988b;
        this.f20362t = new a(this, 0);
        this.f20363u = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void b() {
                NavController.this.n();
            }
        };
        this.f20364v = true;
        NavigatorProvider navigatorProvider = new NavigatorProvider();
        this.w = navigatorProvider;
        this.x = new LinkedHashMap();
        this.A = new LinkedHashMap();
        navigatorProvider.a(new NavGraphNavigator(navigatorProvider));
        navigatorProvider.a(new ActivityNavigator(this.f20345a));
        this.C = new ArrayList();
        f0.t(new NavController$navInflater$2(this));
        s0 b2 = t0.b(1, 0, 2, 2);
        this.D = b2;
        this.E = new n0(b2);
    }

    public static NavDestination e(int i2, NavDestination navDestination, boolean z2) {
        NavGraph navGraph;
        if (navDestination.f20436h == i2) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            NavGraph navGraph2 = navDestination.f20432b;
            p0.a.p(navGraph2);
            navGraph = navGraph2;
        }
        return navGraph.f(i2, navGraph, z2);
    }

    public static void m(NavController navController, String str, NavOptions navOptions, int i2) {
        if ((i2 & 2) != 0) {
            navOptions = null;
        }
        navController.getClass();
        p0.a.s(str, "route");
        if (navController.f20347c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + navController + '.').toString());
        }
        NavGraph j2 = navController.j(navController.f20349g);
        NavDestination.DeepLinkMatch j3 = j2.j(str, true, j2);
        if (j3 == null) {
            StringBuilder v2 = d.v("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
            v2.append(navController.f20347c);
            throw new IllegalArgumentException(v2.toString());
        }
        NavDestination navDestination = j3.f20440a;
        Bundle b2 = navDestination.b(j3.f20441b);
        if (b2 == null) {
            b2 = new Bundle();
        }
        Intent intent = new Intent();
        int i3 = NavDestination.f20430k;
        Uri parse = Uri.parse(NavDestination.Companion.a(navDestination.f20437i));
        p0.a.o(parse, "Uri.parse(this)");
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        b2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        navController.l(navDestination, b2, navOptions, null);
    }

    public static /* synthetic */ void r(NavController navController, NavBackStackEntry navBackStackEntry) {
        navController.q(navBackStackEntry, false, new n());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0173, code lost:
    
        r15 = r11.f20347c;
        p0.a.p(r15);
        r0 = r11.f20347c;
        p0.a.p(r0);
        r6 = androidx.navigation.NavBackStackEntry.Companion.a(r5, r15, r0.b(r13), h(), r11.f20359q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018b, code lost:
    
        r1.addFirst(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        r13 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0196, code lost:
    
        if (r13.hasNext() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0198, code lost:
    
        r15 = (androidx.navigation.NavBackStackEntry) r13.next();
        r0 = r11.x.get(r11.w.b(r15.f20328b.f20431a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
    
        ((androidx.navigation.NavController.NavControllerNavigatorState) r0).h(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ce, code lost:
    
        throw new java.lang.IllegalStateException(android.support.v4.media.d.r(new java.lang.StringBuilder("NavigatorBackStack for "), r12.f20431a, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cf, code lost:
    
        r3.addAll(r1);
        r3.addLast(r14);
        r12 = e0.u.Q0(r1, r14).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e1, code lost:
    
        if (r12.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e3, code lost:
    
        r13 = (androidx.navigation.NavBackStackEntry) r12.next();
        r14 = r13.f20328b.f20432b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ed, code lost:
    
        if (r14 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ef, code lost:
    
        k(r13, f(r14.f20436h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0143, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0096, code lost:
    
        r4 = ((androidx.navigation.NavBackStackEntry) r1.first()).f20328b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = new e0.n();
        r4 = r12 instanceof androidx.navigation.NavGraph;
        r5 = r11.f20345a;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        p0.a.p(r4);
        r4 = r4.f20432b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r7 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r7.hasPrevious() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (p0.a.g(((androidx.navigation.NavBackStackEntry) r8).f20328b, r4) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r8 = (androidx.navigation.NavBackStackEntry) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r8 = androidx.navigation.NavBackStackEntry.Companion.a(r5, r4, r13, h(), r11.f20359q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r1.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if ((!r3.isEmpty()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (((androidx.navigation.NavBackStackEntry) r3.last()).f20328b != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        r(r11, (androidx.navigation.NavBackStackEntry) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r4 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r4 != r12) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r1.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r4 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (d(r4.f20436h) == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        r4 = r4.f20432b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
    
        if (r4 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r3.isEmpty() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        if (r13 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        if (r13.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b7, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c3, code lost:
    
        if (r8.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d2, code lost:
    
        if (p0.a.g(((androidx.navigation.NavBackStackEntry) r9).f20328b, r4) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        r9 = (androidx.navigation.NavBackStackEntry) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
    
        r9 = androidx.navigation.NavBackStackEntry.Companion.a(r5, r4, r4.b(r7), h(), r11.f20359q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
    
        r1.addFirst(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b6, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((((androidx.navigation.NavBackStackEntry) r3.last()).f20328b instanceof androidx.navigation.FloatingWindow) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f0, code lost:
    
        if (r1.isEmpty() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f3, code lost:
    
        r0 = ((androidx.navigation.NavBackStackEntry) r1.first()).f20328b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ff, code lost:
    
        if (r3.isEmpty() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010b, code lost:
    
        if ((((androidx.navigation.NavBackStackEntry) r3.last()).f20328b instanceof androidx.navigation.NavGraph) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010d, code lost:
    
        r2 = ((androidx.navigation.NavBackStackEntry) r3.last()).f20328b;
        p0.a.q(r2, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0124, code lost:
    
        if (((androidx.navigation.NavGraph) r2).f20455l.c(r0.f20436h) != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0126, code lost:
    
        r(r11, (androidx.navigation.NavBackStackEntry) r3.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0130, code lost:
    
        r0 = (androidx.navigation.NavBackStackEntry) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0136, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0138, code lost:
    
        r0 = (androidx.navigation.NavBackStackEntry) r1.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x013e, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0140, code lost:
    
        r0 = r0.f20328b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (o(((androidx.navigation.NavBackStackEntry) r3.last()).f20328b.f20436h, true, false) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014a, code lost:
    
        if (p0.a.g(r0, r11.f20347c) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014c, code lost:
    
        r15 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        if (r15.hasPrevious() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015a, code lost:
    
        r0 = r15.previous();
        r2 = ((androidx.navigation.NavBackStackEntry) r0).f20328b;
        r4 = r11.f20347c;
        p0.a.p(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016c, code lost:
    
        if (p0.a.g(r2, r4) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016e, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016f, code lost:
    
        r6 = (androidx.navigation.NavBackStackEntry) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0171, code lost:
    
        if (r6 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.navigation.NavDestination r12, android.os.Bundle r13, androidx.navigation.NavBackStackEntry r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.a(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavBackStackEntry, java.util.List):void");
    }

    public final boolean b() {
        n nVar;
        while (true) {
            nVar = this.f20349g;
            if (nVar.isEmpty() || !(((NavBackStackEntry) nVar.last()).f20328b instanceof NavGraph)) {
                break;
            }
            r(this, (NavBackStackEntry) nVar.last());
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) nVar.j();
        ArrayList arrayList = this.C;
        if (navBackStackEntry != null) {
            arrayList.add(navBackStackEntry);
        }
        this.B++;
        w();
        int i2 = this.B - 1;
        this.B = i2;
        if (i2 == 0) {
            ArrayList b12 = u.b1(arrayList);
            arrayList.clear();
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it.next();
                Iterator it2 = this.f20360r.iterator();
                while (it2.hasNext()) {
                    OnDestinationChangedListener onDestinationChangedListener = (OnDestinationChangedListener) it2.next();
                    NavDestination navDestination = navBackStackEntry2.f20328b;
                    navBackStackEntry2.a();
                    onDestinationChangedListener.a();
                }
                this.D.b(navBackStackEntry2);
            }
            this.f20350h.h(u.b1(nVar));
            this.f20352j.h(s());
        }
        return navBackStackEntry != null;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public final boolean c(ArrayList arrayList, NavDestination navDestination, boolean z2, boolean z3) {
        String str;
        ?? obj = new Object();
        n nVar = new n();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Navigator navigator = (Navigator) it.next();
            ?? obj2 = new Object();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f20349g.last();
            this.f20366z = new NavController$executePopOperations$1(obj2, obj, this, z3, nVar);
            navigator.e(navBackStackEntry, z3);
            this.f20366z = null;
            if (!obj2.f30919a) {
                break;
            }
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.f20356n;
            if (!z2) {
                Iterator it2 = new r(y0.n.J(navDestination, NavController$executePopOperations$2.f20378a), new NavController$executePopOperations$3(this), 0).iterator();
                while (it2.hasNext()) {
                    Integer valueOf = Integer.valueOf(((NavDestination) it2.next()).f20436h);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) nVar.f();
                    linkedHashMap.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.f20342a : null);
                }
            }
            if (!nVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) nVar.first();
                Iterator it3 = new r(y0.n.J(d(navBackStackEntryState2.f20343b), NavController$executePopOperations$5.f20380a), new NavController$executePopOperations$6(this), 0).iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    str = navBackStackEntryState2.f20342a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((NavDestination) it3.next()).f20436h), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f20357o.put(str, nVar);
                }
            }
        }
        x();
        return obj.f30919a;
    }

    public final NavDestination d(int i2) {
        NavDestination navDestination;
        NavGraph navGraph = this.f20347c;
        if (navGraph == null) {
            return null;
        }
        if (navGraph.f20436h == i2) {
            return navGraph;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f20349g.j();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.f20328b) == null) {
            navDestination = this.f20347c;
            p0.a.p(navDestination);
        }
        return e(i2, navDestination, false);
    }

    public final NavBackStackEntry f(int i2) {
        Object obj;
        n nVar = this.f20349g;
        ListIterator listIterator = nVar.listIterator(nVar.b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((NavBackStackEntry) obj).f20328b.f20436h == i2) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder t2 = d.t("No destination with ID ", i2, " is on the NavController's back stack. The current destination is ");
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) nVar.j();
        t2.append(navBackStackEntry2 != null ? navBackStackEntry2.f20328b : null);
        throw new IllegalArgumentException(t2.toString().toString());
    }

    public final NavGraph g() {
        NavGraph navGraph = this.f20347c;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        p0.a.q(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    public final Lifecycle.State h() {
        return this.f20358p == null ? Lifecycle.State.f19989c : this.f20361s;
    }

    public final NavBackStackEntry i() {
        Object obj;
        Iterator it = u.R0(this.f20349g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = y0.n.I(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((NavBackStackEntry) obj).f20328b instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) obj;
    }

    public final NavGraph j(n nVar) {
        NavDestination navDestination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) nVar.j();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.f20328b) == null) {
            navDestination = this.f20347c;
            p0.a.p(navDestination);
        }
        if (navDestination instanceof NavGraph) {
            return (NavGraph) navDestination;
        }
        NavGraph navGraph = navDestination.f20432b;
        p0.a.p(navGraph);
        return navGraph;
    }

    public final void k(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f20354l.put(navBackStackEntry, navBackStackEntry2);
        LinkedHashMap linkedHashMap = this.f20355m;
        if (linkedHashMap.get(navBackStackEntry2) == null) {
            linkedHashMap.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(navBackStackEntry2);
        p0.a.p(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0207, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x010b, code lost:
    
        if (r29.f20436h == r6.f20436h) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
    
        if (p0.a.g(r15, r14) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
    
        r6 = new e0.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0116, code lost:
    
        if (b1.f0.p(r13) < r7) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        r8 = (androidx.navigation.NavBackStackEntry) e0.t.y0(r13);
        v(r8);
        r14 = new androidx.navigation.NavBackStackEntry(r8.f20327a, r8.f20328b, r8.f20328b.b(r30), r8.d, r8.f20330f, r8.f20331g, r8.f20332h);
        r14.d = r8.d;
        r14.c(r8.f20337m);
        r6.addFirst(r14);
        r7 = r7;
        r9 = r9;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0163, code lost:
    
        r27 = r4;
        r26 = r9;
        r2 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016f, code lost:
    
        if (r2.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0171, code lost:
    
        r4 = (androidx.navigation.NavBackStackEntry) r2.next();
        r7 = r4.f20328b.f20432b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017b, code lost:
    
        if (r7 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        k(r4, f(r7.f20436h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
    
        r13.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r2 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        if (r2.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
    
        r4 = (androidx.navigation.NavBackStackEntry) r2.next();
        r6 = r11.b(r4.f20328b.f20431a);
        r6.getClass();
        r7 = r4.f20328b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        if ((r7 instanceof androidx.navigation.NavDestination) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ad, code lost:
    
        if (r7 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b0, code lost:
    
        r6.c(r7, null, androidx.navigation.NavOptionsBuilderKt.a(androidx.navigation.Navigator$onLaunchSingleTop$1.f20516a), null);
        r6 = r6.b();
        r7 = r6.f20519a;
        r7.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c3, code lost:
    
        r8 = e0.u.b1((java.util.Collection) r6.e.f30313a.getValue());
        r9 = r8.listIterator(r8.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01dd, code lost:
    
        if (r9.hasPrevious() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ed, code lost:
    
        if (p0.a.g(((androidx.navigation.NavBackStackEntry) r9.previous()).f20331g, r4.f20331g) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ef, code lost:
    
        r9 = r9.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f7, code lost:
    
        r8.set(r9, r4);
        r6.f20520b.h(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ff, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f6, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0203, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0206, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0248 A[LOOP:1: B:19:0x0242->B:21:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(androidx.navigation.NavDestination r29, android.os.Bundle r30, androidx.navigation.NavOptions r31, androidx.navigation.Navigator.Extras r32) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.l(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    public final void n() {
        n nVar = this.f20349g;
        if (nVar.isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) nVar.j();
        NavDestination navDestination = navBackStackEntry != null ? navBackStackEntry.f20328b : null;
        p0.a.p(navDestination);
        if (o(navDestination.f20436h, true, false)) {
            b();
        }
    }

    public final boolean o(int i2, boolean z2, boolean z3) {
        NavDestination navDestination;
        n nVar = this.f20349g;
        if (nVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = u.R0(nVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).f20328b;
            Navigator b2 = this.w.b(navDestination.f20431a);
            if (z2 || navDestination.f20436h != i2) {
                arrayList.add(b2);
            }
            if (navDestination.f20436h == i2) {
                break;
            }
        }
        if (navDestination != null) {
            return c(arrayList, navDestination, z2, z3);
        }
        int i3 = NavDestination.f20430k;
        Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.Companion.b(i2, this.f20345a) + " as it was not found on the current back stack");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca A[EDGE_INSN: B:15:0x00ca->B:16:0x00ca BREAK  A[LOOP:0: B:6:0x001d->B:25:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:6:0x001d->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.p(java.lang.String, boolean, boolean):boolean");
    }

    public final void q(NavBackStackEntry navBackStackEntry, boolean z2, n nVar) {
        NavControllerViewModel navControllerViewModel;
        o0 o0Var;
        Set set;
        n nVar2 = this.f20349g;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) nVar2.last();
        if (!p0.a.g(navBackStackEntry2, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.f20328b + ", which is not the top of the back stack (" + navBackStackEntry2.f20328b + ')').toString());
        }
        t.y0(nVar2);
        NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.x.get(this.w.b(navBackStackEntry2.f20328b.f20431a));
        boolean z3 = true;
        if ((navControllerNavigatorState == null || (o0Var = navControllerNavigatorState.f20522f) == null || (set = (Set) o0Var.f30313a.getValue()) == null || !set.contains(navBackStackEntry2)) && !this.f20355m.containsKey(navBackStackEntry2)) {
            z3 = false;
        }
        Lifecycle.State state = navBackStackEntry2.f20333i.d;
        Lifecycle.State state2 = Lifecycle.State.f19989c;
        if (state.compareTo(state2) >= 0) {
            if (z2) {
                navBackStackEntry2.c(state2);
                nVar.addFirst(new NavBackStackEntryState(navBackStackEntry2));
            }
            if (z3) {
                navBackStackEntry2.c(state2);
            } else {
                navBackStackEntry2.c(Lifecycle.State.f19987a);
                v(navBackStackEntry2);
            }
        }
        if (z2 || z3 || (navControllerViewModel = this.f20359q) == null) {
            return;
        }
        String str = navBackStackEntry2.f20331g;
        p0.a.s(str, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) navControllerViewModel.f20397b.remove(str);
        if (viewModelStore != null) {
            viewModelStore.a();
        }
    }

    public final ArrayList s() {
        Lifecycle.State state;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.x.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            state = Lifecycle.State.d;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((NavControllerNavigatorState) it.next()).f20522f.f30313a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && navBackStackEntry.f20337m.compareTo(state) < 0) {
                    arrayList2.add(obj);
                }
            }
            t.t0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f20349g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.f20337m.compareTo(state) >= 0) {
                arrayList3.add(next);
            }
        }
        t.t0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((NavBackStackEntry) next2).f20328b instanceof NavGraph)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public final boolean t(int i2, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination g2;
        NavBackStackEntry navBackStackEntry;
        NavDestination navDestination;
        LinkedHashMap linkedHashMap = this.f20356n;
        if (!linkedHashMap.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i2));
        Collection values = linkedHashMap.values();
        NavController$restoreStateInternal$1 navController$restoreStateInternal$1 = new NavController$restoreStateInternal$1(str);
        p0.a.s(values, "<this>");
        t.v0(values, navController$restoreStateInternal$1, true);
        LinkedHashMap linkedHashMap2 = this.f20357o;
        e.e(linkedHashMap2);
        n nVar = (n) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f20349g.j();
        if (navBackStackEntry2 == null || (g2 = navBackStackEntry2.f20328b) == null) {
            g2 = g();
        }
        if (nVar != null) {
            Iterator it = nVar.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination e = e(navBackStackEntryState.f20343b, g2, true);
                Context context = this.f20345a;
                if (e == null) {
                    int i3 = NavDestination.f20430k;
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.b(navBackStackEntryState.f20343b, context) + " cannot be found from the current destination " + g2).toString());
                }
                arrayList.add(navBackStackEntryState.b(context, e, h(), this.f20359q));
                g2 = e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((NavBackStackEntry) next).f20328b instanceof NavGraph)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) it3.next();
            List list = (List) u.M0(arrayList2);
            if (list != null && (navBackStackEntry = (NavBackStackEntry) u.L0(list)) != null && (navDestination = navBackStackEntry.f20328b) != null) {
                str2 = navDestination.f20431a;
            }
            if (p0.a.g(str2, navBackStackEntry3.f20328b.f20431a)) {
                list.add(navBackStackEntry3);
            } else {
                arrayList2.add(f0.w(navBackStackEntry3));
            }
        }
        ?? obj = new Object();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            Navigator b2 = this.w.b(((NavBackStackEntry) u.E0(list2)).f20328b.f20431a);
            this.f20365y = new NavController$executeRestoreState$3(obj, arrayList, new Object(), this, bundle);
            b2.d(list2, navOptions, extras);
            this.f20365y = null;
        }
        return obj.f30919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x023c A[LOOP:14: B:224:0x0236->B:226:0x023c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01d7  */
    /* JADX WARN: Type inference failed for: r10v16, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph] */
    /* JADX WARN: Type inference failed for: r15v11, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [androidx.navigation.NavController] */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(androidx.navigation.NavGraph r19) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.u(androidx.navigation.NavGraph):void");
    }

    public final void v(NavBackStackEntry navBackStackEntry) {
        p0.a.s(navBackStackEntry, "child");
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f20354l.remove(navBackStackEntry);
        if (navBackStackEntry2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f20355m;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(navBackStackEntry2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.x.get(this.w.b(navBackStackEntry2.f20328b.f20431a));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.b(navBackStackEntry2);
            }
            linkedHashMap.remove(navBackStackEntry2);
        }
    }

    public final void w() {
        AtomicInteger atomicInteger;
        o0 o0Var;
        Set set;
        ArrayList b12 = u.b1(this.f20349g);
        if (b12.isEmpty()) {
            return;
        }
        NavDestination navDestination = ((NavBackStackEntry) u.L0(b12)).f20328b;
        ArrayList arrayList = new ArrayList();
        if (navDestination instanceof FloatingWindow) {
            Iterator it = u.R0(b12).iterator();
            while (it.hasNext()) {
                NavDestination navDestination2 = ((NavBackStackEntry) it.next()).f20328b;
                arrayList.add(navDestination2);
                if (!(navDestination2 instanceof FloatingWindow) && !(navDestination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry : u.R0(b12)) {
            Lifecycle.State state = navBackStackEntry.f20337m;
            NavDestination navDestination3 = navBackStackEntry.f20328b;
            Lifecycle.State state2 = Lifecycle.State.f19990f;
            Lifecycle.State state3 = Lifecycle.State.d;
            if (navDestination != null && navDestination3.f20436h == navDestination.f20436h) {
                if (state != state2) {
                    NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.x.get(this.w.b(navDestination3.f20431a));
                    if (p0.a.g((navControllerNavigatorState == null || (o0Var = navControllerNavigatorState.f20522f) == null || (set = (Set) o0Var.f30313a.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f20355m.get(navBackStackEntry)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(navBackStackEntry, state3);
                    } else {
                        hashMap.put(navBackStackEntry, state2);
                    }
                }
                NavDestination navDestination4 = (NavDestination) u.F0(arrayList);
                if (navDestination4 != null && navDestination4.f20436h == navDestination3.f20436h) {
                    t.x0(arrayList);
                }
                navDestination = navDestination.f20432b;
            } else if ((!arrayList.isEmpty()) && navDestination3.f20436h == ((NavDestination) u.E0(arrayList)).f20436h) {
                NavDestination navDestination5 = (NavDestination) t.x0(arrayList);
                if (state == state2) {
                    navBackStackEntry.c(state3);
                } else if (state != state3) {
                    hashMap.put(navBackStackEntry, state3);
                }
                NavGraph navGraph = navDestination5.f20432b;
                if (navGraph != null && !arrayList.contains(navGraph)) {
                    arrayList.add(navGraph);
                }
            } else {
                navBackStackEntry.c(Lifecycle.State.f19989c);
            }
        }
        Iterator it2 = b12.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it2.next();
            Lifecycle.State state4 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state4 != null) {
                navBackStackEntry2.c(state4);
            } else {
                navBackStackEntry2.d();
            }
        }
    }

    public final void x() {
        boolean z2 = false;
        if (this.f20364v) {
            n nVar = this.f20349g;
            if (!(nVar instanceof Collection) || !nVar.isEmpty()) {
                Iterator it = nVar.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if ((!(((NavBackStackEntry) it.next()).f20328b instanceof NavGraph)) && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                if (i2 > 1) {
                    z2 = true;
                }
            }
        }
        NavController$onBackPressedCallback$1 navController$onBackPressedCallback$1 = this.f20363u;
        navController$onBackPressedCallback$1.f163a = z2;
        q0.a aVar = navController$onBackPressedCallback$1.f165c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
