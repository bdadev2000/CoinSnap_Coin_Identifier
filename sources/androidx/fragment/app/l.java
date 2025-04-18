package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends e2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public static void m(c2 c2Var) {
        View view = c2Var.f1596c.mView;
        b2 b2Var = c2Var.a;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        b2Var.a(view);
    }

    public static void n(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (n0.j1.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    n(arrayList, child);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void o(r.b bVar, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            bVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    o(bVar, child);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v11, types: [r.k] */
    @Override // androidx.fragment.app.e2
    public final void f(List operations, boolean z10) {
        b2 b2Var;
        String str;
        Object obj;
        c2 c2Var;
        String str2;
        ArrayList arrayList;
        List list;
        b2 b2Var2;
        LinkedHashMap linkedHashMap;
        c2 c2Var2;
        String str3;
        c2 c2Var3;
        c2 c2Var4;
        r.b bVar;
        c2 c2Var5;
        boolean z11;
        String str4;
        r.b bVar2;
        boolean z12;
        View view;
        View view2;
        Object j3;
        boolean z13;
        ArrayList arrayList2;
        u1 u1Var;
        String str5;
        Rect rect;
        String str6;
        LinkedHashMap linkedHashMap2;
        Pair pair;
        Object obj2;
        View view3;
        l lVar;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b2Var = b2.VISIBLE;
            str = "operation.fragment.mView";
            if (hasNext) {
                obj = it.next();
                c2 c2Var6 = (c2) obj;
                View view4 = c2Var6.f1596c.mView;
                Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                if (ac.e.a(view4) == b2Var && c2Var6.a != b2Var) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (z19) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        c2 c2Var7 = (c2) obj;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c2Var = listIterator.previous();
                c2 c2Var8 = (c2) c2Var;
                View view5 = c2Var8.f1596c.mView;
                Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
                if (ac.e.a(view5) != b2Var && c2Var8.a == b2Var) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    break;
                }
            } else {
                c2Var = 0;
                break;
            }
        }
        c2 c2Var9 = c2Var;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(2);
        String str7 = FragmentManager.TAG;
        if (isLoggingEnabled) {
            Log.v(FragmentManager.TAG, "Executing operations from " + c2Var7 + " to " + c2Var9);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List mutableList = CollectionsKt.toMutableList((Collection) operations);
        Fragment fragment = ((c2) CollectionsKt.last(operations)).f1596c;
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            y yVar = ((c2) it2.next()).f1596c.mAnimationInfo;
            y yVar2 = fragment.mAnimationInfo;
            yVar.f1744b = yVar2.f1744b;
            yVar.f1745c = yVar2.f1745c;
            yVar.f1746d = yVar2.f1746d;
            yVar.f1747e = yVar2.f1747e;
        }
        Iterator it3 = operations.iterator();
        while (it3.hasNext()) {
            c2 c2Var10 = (c2) it3.next();
            j0.e signal = new j0.e();
            c2Var10.getClass();
            Intrinsics.checkNotNullParameter(signal, "signal");
            c2Var10.d();
            c2Var10.f1598e.add(signal);
            arrayList3.add(new g(c2Var10, signal, z10));
            j0.e signal2 = new j0.e();
            Intrinsics.checkNotNullParameter(signal2, "signal");
            c2Var10.d();
            c2Var10.f1598e.add(signal2);
            if (!z10 ? c2Var10 == c2Var9 : c2Var10 == c2Var7) {
                z17 = true;
            } else {
                z17 = false;
            }
            arrayList4.add(new i(c2Var10, signal2, z10, z17));
            androidx.emoji2.text.n listener = new androidx.emoji2.text.n(1, mutableList, c2Var10, this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            c2Var10.f1597d.add(listener);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((i) next).b()) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (((i) next2).c() != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                arrayList6.add(next2);
            }
        }
        Iterator it6 = arrayList6.iterator();
        u1 u1Var2 = null;
        while (it6.hasNext()) {
            i iVar = (i) it6.next();
            u1 c10 = iVar.c();
            if (u1Var2 != null && c10 != u1Var2) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (z15) {
                u1Var2 = c10;
            } else {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + iVar.a.f1596c + " returned Transition " + iVar.f1644c + " which uses a different Transition type than other Fragments.").toString());
            }
        }
        b2 b2Var3 = b2.GONE;
        ViewGroup viewGroup = this.a;
        if (u1Var2 != null) {
            str2 = " to ";
            View view6 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList7 = new ArrayList();
            arrayList = arrayList3;
            ArrayList arrayList8 = new ArrayList();
            b2 b2Var4 = b2Var;
            r.b bVar3 = new r.b();
            Iterator it7 = arrayList4.iterator();
            list = mutableList;
            Object obj3 = null;
            boolean z20 = false;
            View view7 = null;
            while (it7.hasNext()) {
                b2 b2Var5 = b2Var3;
                Object obj4 = ((i) it7.next()).f1646e;
                if (obj4 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && c2Var7 != null && c2Var9 != null) {
                    Object r6 = u1Var2.r(u1Var2.f(obj4));
                    Fragment inFragment = c2Var9.f1596c;
                    str5 = str;
                    ArrayList<String> sharedElementSourceNames = inFragment.getSharedElementSourceNames();
                    arrayList2 = arrayList4;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    Fragment outFragment = c2Var7.f1596c;
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    ArrayList<String> sharedElementSourceNames2 = outFragment.getSharedElementSourceNames();
                    View view8 = view6;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = outFragment.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    u1 u1Var3 = u1Var2;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                        }
                        i10++;
                        size = i11;
                    }
                    ArrayList<String> sharedElementTargetNames2 = inFragment.getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    if (!z10) {
                        outFragment.getExitTransitionCallback();
                        inFragment.getEnterTransitionCallback();
                        pair = TuplesKt.to(null, null);
                    } else {
                        outFragment.getEnterTransitionCallback();
                        inFragment.getExitTransitionCallback();
                        pair = TuplesKt.to(null, null);
                    }
                    a4.j.t(pair.component1());
                    a4.j.t(pair.component2());
                    int size2 = sharedElementSourceNames.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        bVar3.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(str7, ">>> entering view names <<<");
                        Iterator<String> it8 = sharedElementTargetNames2.iterator();
                        while (it8.hasNext()) {
                            Log.v(str7, "Name: " + it8.next());
                        }
                        Log.v(str7, ">>> exiting view names <<<");
                        Iterator<String> it9 = sharedElementSourceNames.iterator();
                        while (it9.hasNext()) {
                            Log.v(str7, "Name: " + it9.next());
                        }
                    }
                    r.b sharedElements = new r.b();
                    View view9 = outFragment.mView;
                    Intrinsics.checkNotNullExpressionValue(view9, "firstOut.fragment.mView");
                    o(sharedElements, view9);
                    k.d.p(sharedElements, sharedElementSourceNames);
                    k.d.p(bVar3, sharedElements.keySet());
                    r.b namedViews = new r.b();
                    View view10 = inFragment.mView;
                    Intrinsics.checkNotNullExpressionValue(view10, "lastIn.fragment.mView");
                    o(namedViews, view10);
                    k.d.p(namedViews, sharedElementTargetNames2);
                    k.d.p(namedViews, bVar3.values());
                    s1 s1Var = n1.a;
                    Intrinsics.checkNotNullParameter(bVar3, "<this>");
                    Intrinsics.checkNotNullParameter(namedViews, "namedViews");
                    int i13 = bVar3.f23955d - 1;
                    for (int i14 = -1; i14 < i13; i14 = -1) {
                        if (!namedViews.containsKey((String) bVar3.l(i13))) {
                            bVar3.j(i13);
                        }
                        i13--;
                    }
                    Set keySet = bVar3.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                    Set entries = sharedElements.entrySet();
                    str6 = str7;
                    Intrinsics.checkNotNullExpressionValue(entries, "entries");
                    int i15 = 1;
                    CollectionsKt__MutableCollectionsKt.retainAll(entries, new y0.p0(keySet, i15));
                    Collection values = bVar3.values();
                    Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                    Set entries2 = namedViews.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries2, "entries");
                    CollectionsKt__MutableCollectionsKt.retainAll(entries2, new y0.p0(values, i15));
                    if (bVar3.isEmpty()) {
                        arrayList7.clear();
                        arrayList8.clear();
                        b2Var3 = b2Var5;
                        str = str5;
                        arrayList4 = arrayList2;
                        linkedHashMap3 = linkedHashMap4;
                        view6 = view8;
                        rect2 = rect3;
                        u1Var2 = u1Var3;
                        str7 = str6;
                        obj3 = null;
                    } else {
                        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                        if (z10) {
                            outFragment.getEnterTransitionCallback();
                        } else {
                            inFragment.getEnterTransitionCallback();
                        }
                        n0.c0.a(viewGroup, new d(c2Var9, c2Var7, z10, namedViews));
                        arrayList7.addAll(sharedElements.values());
                        if (!sharedElementSourceNames.isEmpty()) {
                            View view11 = (View) sharedElements.getOrDefault(sharedElementSourceNames.get(0), null);
                            u1Var = u1Var3;
                            obj2 = r6;
                            u1Var.m(view11, obj2);
                            view7 = view11;
                        } else {
                            u1Var = u1Var3;
                            obj2 = r6;
                        }
                        arrayList8.addAll(namedViews.values());
                        if ((!sharedElementTargetNames2.isEmpty()) && (view3 = (View) namedViews.getOrDefault(sharedElementTargetNames2.get(0), null)) != null) {
                            rect = rect3;
                            n0.c0.a(viewGroup, new androidx.emoji2.text.n(2, u1Var, view3, rect));
                            z20 = true;
                        } else {
                            rect = rect3;
                        }
                        view6 = view8;
                        u1Var.p(obj2, view6, arrayList7);
                        u1Var.l(obj2, null, null, obj2, arrayList8);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(c2Var7, bool);
                        linkedHashMap2.put(c2Var9, bool);
                        obj3 = obj2;
                    }
                } else {
                    arrayList2 = arrayList4;
                    u1Var = u1Var2;
                    str5 = str;
                    rect = rect2;
                    str6 = str7;
                    linkedHashMap2 = linkedHashMap3;
                }
                b2Var3 = b2Var5;
                u1Var2 = u1Var;
                linkedHashMap3 = linkedHashMap2;
                arrayList4 = arrayList2;
                str7 = str6;
                rect2 = rect;
                str = str5;
            }
            ArrayList arrayList9 = arrayList4;
            u1 u1Var4 = u1Var2;
            b2Var2 = b2Var3;
            String str8 = str;
            Rect rect4 = rect2;
            String str9 = str7;
            linkedHashMap = linkedHashMap3;
            ArrayList arrayList10 = new ArrayList();
            Iterator it10 = arrayList9.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it10.hasNext()) {
                i iVar2 = (i) it10.next();
                boolean b3 = iVar2.b();
                Iterator it11 = it10;
                c2 c2Var11 = iVar2.a;
                if (b3) {
                    bVar2 = bVar3;
                    linkedHashMap.put(c2Var11, Boolean.FALSE);
                    iVar2.a();
                } else {
                    bVar2 = bVar3;
                    Object f10 = u1Var4.f(iVar2.f1644c);
                    if (obj3 != null && (c2Var11 == c2Var7 || c2Var11 == c2Var9)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (f10 == null) {
                        if (!z12) {
                            linkedHashMap.put(c2Var11, Boolean.FALSE);
                            iVar2.a();
                        }
                    } else {
                        c2 c2Var12 = c2Var9;
                        ArrayList arrayList11 = new ArrayList();
                        Object obj7 = obj3;
                        View view12 = c2Var11.f1596c.mView;
                        Object obj8 = obj6;
                        String str10 = str8;
                        Intrinsics.checkNotNullExpressionValue(view12, str10);
                        n(arrayList11, view12);
                        if (z12) {
                            if (c2Var11 == c2Var7) {
                                arrayList11.removeAll(CollectionsKt.toSet(arrayList7));
                            } else {
                                arrayList11.removeAll(CollectionsKt.toSet(arrayList8));
                            }
                        }
                        if (arrayList11.isEmpty()) {
                            u1Var4.a(view6, f10);
                            view = view6;
                            str8 = str10;
                        } else {
                            u1Var4.b(f10, arrayList11);
                            u1Var4.l(f10, f10, arrayList11, null, null);
                            str8 = str10;
                            b2 b2Var6 = b2Var2;
                            if (c2Var11.a == b2Var6) {
                                list.remove(c2Var11);
                                view = view6;
                                ArrayList arrayList12 = new ArrayList(arrayList11);
                                Fragment fragment2 = c2Var11.f1596c;
                                b2Var2 = b2Var6;
                                arrayList12.remove(fragment2.mView);
                                u1Var4.k(f10, fragment2.mView, arrayList12);
                                n0.c0.a(viewGroup, new androidx.activity.d(arrayList11, 6));
                            } else {
                                view = view6;
                                b2Var2 = b2Var6;
                            }
                        }
                        b2 b2Var7 = b2Var4;
                        if (c2Var11.a == b2Var7) {
                            arrayList10.addAll(arrayList11);
                            if (z20) {
                                u1Var4.n(f10, rect4);
                            }
                            view2 = view7;
                        } else {
                            view2 = view7;
                            u1Var4.m(view2, f10);
                        }
                        linkedHashMap.put(c2Var11, Boolean.TRUE);
                        if (iVar2.f1645d) {
                            obj5 = u1Var4.j(obj5, f10);
                            j3 = obj8;
                        } else {
                            j3 = u1Var4.j(obj8, f10);
                        }
                        it10 = it11;
                        view7 = view2;
                        b2Var4 = b2Var7;
                        view6 = view;
                        c2Var9 = c2Var12;
                        obj3 = obj7;
                        obj6 = j3;
                        bVar3 = bVar2;
                    }
                }
                it10 = it11;
                bVar3 = bVar2;
            }
            r.b bVar4 = bVar3;
            c2Var2 = c2Var9;
            Object i16 = u1Var4.i(obj5, obj6, obj3);
            if (i16 == null) {
                c2Var3 = c2Var7;
                str3 = str9;
            } else {
                ArrayList arrayList13 = new ArrayList();
                Iterator it12 = arrayList9.iterator();
                while (it12.hasNext()) {
                    Object next3 = it12.next();
                    if (!((i) next3).b()) {
                        arrayList13.add(next3);
                    }
                }
                Iterator it13 = arrayList13.iterator();
                while (it13.hasNext()) {
                    i iVar3 = (i) it13.next();
                    Object obj9 = iVar3.f1644c;
                    c2 c2Var13 = iVar3.a;
                    c2 c2Var14 = c2Var2;
                    if (obj3 != null && (c2Var13 == c2Var7 || c2Var13 == c2Var14)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (obj9 != null || z11) {
                        if (!ViewCompat.isLaidOut(viewGroup)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                str4 = str9;
                                Log.v(str4, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + c2Var13);
                            } else {
                                str4 = str9;
                            }
                            iVar3.a();
                            c2Var2 = c2Var14;
                            str9 = str4;
                        } else {
                            Fragment fragment3 = c2Var13.f1596c;
                            u1Var4.o(i16, iVar3.f1643b, new h.o0(2, iVar3, c2Var13));
                        }
                    }
                    c2Var2 = c2Var14;
                }
                c2 c2Var15 = c2Var2;
                str3 = str9;
                if (!ViewCompat.isLaidOut(viewGroup)) {
                    c2Var2 = c2Var15;
                    c2Var3 = c2Var7;
                } else {
                    n1.a(4, arrayList10);
                    ArrayList arrayList14 = new ArrayList();
                    int size3 = arrayList8.size();
                    for (int i17 = 0; i17 < size3; i17++) {
                        View view13 = (View) arrayList8.get(i17);
                        arrayList14.add(ViewCompat.getTransitionName(view13));
                        ViewCompat.setTransitionName(view13, null);
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(str3, ">>>>> Beginning transition <<<<<");
                        Log.v(str3, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator it14 = arrayList7.iterator(); it14.hasNext(); it14 = it14) {
                            Object sharedElementFirstOutViews = it14.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view14 = (View) sharedElementFirstOutViews;
                            Log.v(str3, "View: " + view14 + " Name: " + ViewCompat.getTransitionName(view14));
                        }
                        Log.v(str3, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator it15 = arrayList8.iterator(); it15.hasNext(); it15 = it15) {
                            Object sharedElementLastInViews = it15.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                            View view15 = (View) sharedElementLastInViews;
                            Log.v(str3, "View: " + view15 + " Name: " + ViewCompat.getTransitionName(view15));
                        }
                    }
                    u1Var4.c(viewGroup, i16);
                    int size4 = arrayList8.size();
                    ArrayList arrayList15 = new ArrayList();
                    int i18 = 0;
                    while (i18 < size4) {
                        View view16 = (View) arrayList7.get(i18);
                        String transitionName = ViewCompat.getTransitionName(view16);
                        arrayList15.add(transitionName);
                        if (transitionName == null) {
                            c2Var4 = c2Var15;
                            c2Var5 = c2Var7;
                            bVar = bVar4;
                        } else {
                            c2Var4 = c2Var15;
                            ViewCompat.setTransitionName(view16, null);
                            ?? r82 = bVar4;
                            String str11 = (String) r82.getOrDefault(transitionName, null);
                            bVar = r82;
                            int i19 = 0;
                            while (true) {
                                c2Var5 = c2Var7;
                                if (i19 >= size4) {
                                    break;
                                }
                                if (str11.equals(arrayList14.get(i19))) {
                                    ViewCompat.setTransitionName((View) arrayList8.get(i19), transitionName);
                                    break;
                                } else {
                                    i19++;
                                    c2Var7 = c2Var5;
                                }
                            }
                        }
                        i18++;
                        bVar4 = bVar;
                        c2Var7 = c2Var5;
                        c2Var15 = c2Var4;
                    }
                    c2Var2 = c2Var15;
                    c2Var3 = c2Var7;
                    n0.c0.a(viewGroup, new t1(size4, arrayList8, arrayList14, arrayList7, arrayList15));
                    n1.a(0, arrayList10);
                    u1Var4.q(obj3, arrayList7, arrayList8);
                }
            }
        } else {
            Iterator it16 = arrayList4.iterator();
            while (it16.hasNext()) {
                i iVar4 = (i) it16.next();
                linkedHashMap3.put(iVar4.a, Boolean.FALSE);
                iVar4.a();
            }
            arrayList = arrayList3;
            b2Var2 = b2Var3;
            c2Var3 = c2Var7;
            c2Var2 = c2Var9;
            str2 = " to ";
            str3 = FragmentManager.TAG;
            list = mutableList;
            linkedHashMap = linkedHashMap3;
        }
        boolean containsValue = linkedHashMap.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList arrayList16 = new ArrayList();
        Iterator it17 = arrayList.iterator();
        boolean z21 = false;
        while (it17.hasNext()) {
            g gVar = (g) it17.next();
            if (gVar.b()) {
                gVar.a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                w c11 = gVar.c(context);
                if (c11 == null) {
                    gVar.a();
                } else {
                    Animator animator = (Animator) c11.f1732c;
                    if (animator == null) {
                        arrayList16.add(gVar);
                    } else {
                        c2 c2Var16 = gVar.a;
                        Fragment fragment4 = c2Var16.f1596c;
                        if (Intrinsics.areEqual(linkedHashMap.get(c2Var16), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(str3, "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                            }
                            gVar.a();
                        } else {
                            b2 b2Var8 = b2Var2;
                            if (c2Var16.a == b2Var8) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            List list2 = list;
                            if (z14) {
                                list2.remove(c2Var16);
                            }
                            View view17 = fragment4.mView;
                            viewGroup.startViewTransition(view17);
                            Iterator it18 = it17;
                            animator.addListener(new j(this, view17, z14, c2Var16, gVar));
                            animator.setTarget(view17);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(str3, "Animator from operation " + c2Var16 + " has started.");
                            }
                            gVar.f1643b.a(new e(0, animator, c2Var16));
                            list = list2;
                            b2Var2 = b2Var8;
                            it17 = it18;
                            z21 = true;
                        }
                    }
                }
            }
        }
        List list3 = list;
        Iterator it19 = arrayList16.iterator();
        while (it19.hasNext()) {
            g gVar2 = (g) it19.next();
            c2 c2Var17 = gVar2.a;
            Fragment fragment5 = c2Var17.f1596c;
            if (containsValue) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
                }
                gVar2.a();
            } else if (z21) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                }
                gVar2.a();
            } else {
                View view18 = fragment5.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                w c12 = gVar2.c(context);
                if (c12 != null) {
                    Animation animation = (Animation) c12.f1731b;
                    if (animation != null) {
                        if (c2Var17.a != b2.REMOVED) {
                            view18.startAnimation(animation);
                            gVar2.a();
                            lVar = this;
                        } else {
                            viewGroup.startViewTransition(view18);
                            e0 e0Var = new e0(animation, viewGroup, view18);
                            lVar = this;
                            e0Var.setAnimationListener(new k(view18, gVar2, lVar, c2Var17));
                            view18.startAnimation(e0Var);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(str3, "Animation from operation " + c2Var17 + " has started.");
                            }
                        }
                        gVar2.f1643b.a(new f(view18, lVar, gVar2, c2Var17));
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
        Iterator it20 = list3.iterator();
        while (it20.hasNext()) {
            m((c2) it20.next());
        }
        list3.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(str3, "Completed executing operations from " + c2Var3 + str2 + c2Var2);
        }
    }
}
