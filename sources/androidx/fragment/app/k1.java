package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.AppLovinMediationProvider;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k1 {
    public final m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f1677c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1678d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1679e = -1;

    public k1(m0 m0Var, l1 l1Var, Fragment fragment) {
        this.a = m0Var;
        this.f1676b = l1Var;
        this.f1677c = fragment;
    }

    public final void a() {
        Bundle bundle;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f1677c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle2 = fragment.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        fragment.performActivityCreated(bundle);
        this.a.a(false);
    }

    public final void b() {
        int i10;
        View view;
        View view2;
        Fragment fragment = this.f1677c;
        Fragment expectedParentFragment = FragmentManager.findViewFragment(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i11 = fragment.mContainerId;
            h1.b bVar = h1.c.a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            h1.k kVar = new h1.k(fragment, expectedParentFragment, i11);
            h1.c.c(kVar);
            h1.b a = h1.c.a(fragment);
            if (a.a.contains(h1.a.DETECT_WRONG_NESTED_HIERARCHY) && h1.c.e(a, fragment.getClass(), h1.k.class)) {
                h1.c.b(a, kVar);
            }
        }
        l1 l1Var = this.f1676b;
        l1Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = l1Var.a;
            int indexOf = arrayList.indexOf(fragment);
            int i12 = indexOf - 1;
            while (true) {
                if (i12 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i12);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i12--;
                }
            }
        }
        i10 = -1;
        fragment.mContainer.addView(fragment.mView, i10);
    }

    public final void c() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f1677c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        k1 k1Var = null;
        l1 l1Var = this.f1676b;
        if (fragment2 != null) {
            k1 k1Var2 = (k1) l1Var.f1681b.get(fragment2.mWho);
            if (k1Var2 != null) {
                fragment.mTargetWho = fragment.mTarget.mWho;
                fragment.mTarget = null;
                k1Var = k1Var2;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (k1Var = (k1) l1Var.f1681b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(vd.e.h(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (k1Var != null) {
            k1Var.k();
        }
        fragment.mHost = fragment.mFragmentManager.getHost();
        fragment.mParentFragment = fragment.mFragmentManager.getParent();
        m0 m0Var = this.a;
        m0Var.g(false);
        fragment.performAttach();
        m0Var.b(false);
    }

    public final int d() {
        a2 a2Var;
        Object obj;
        int i10;
        boolean z10;
        Fragment fragment = this.f1677c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i11 = this.f1679e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i11 = Math.min(i11, -1);
                    }
                } else {
                    i11 = Math.min(i11, 5);
                }
            } else {
                i11 = Math.min(i11, 1);
            }
        } else {
            i11 = Math.min(i11, 0);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i11 = Math.max(this.f1679e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f1679e < 4 ? Math.min(i11, fragment.mState) : Math.min(i11, 1);
            }
        }
        if (!fragment.mAdded) {
            i11 = Math.min(i11, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        a2 a2Var2 = null;
        if (viewGroup != null) {
            e2 j3 = e2.j(viewGroup, fragment.getParentFragmentManager());
            j3.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            c2 h10 = j3.h(fragment);
            if (h10 != null) {
                a2Var = h10.f1595b;
            } else {
                a2Var = null;
            }
            Iterator it = j3.f1626c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    c2 c2Var = (c2) obj;
                    if (Intrinsics.areEqual(c2Var.f1596c, fragment) && !c2Var.f1599f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c2 c2Var2 = (c2) obj;
            if (c2Var2 != null) {
                a2Var2 = c2Var2.f1595b;
            }
            if (a2Var == null) {
                i10 = -1;
            } else {
                i10 = d2.a[a2Var.ordinal()];
            }
            if (i10 != -1 && i10 != 1) {
                a2Var2 = a2Var;
            }
        }
        if (a2Var2 == a2.ADDING) {
            i11 = Math.min(i11, 6);
        } else if (a2Var2 == a2.REMOVING) {
            i11 = Math.max(i11, 3);
        } else if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i11 = Math.min(i11, 1);
            } else {
                i11 = Math.min(i11, -1);
            }
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i11 = Math.min(i11, 4);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "computeExpectedState() of " + i11 + " for " + fragment);
        }
        return i11;
    }

    public final void e() {
        Bundle bundle;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f1677c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "moveto CREATED: " + fragment);
        }
        Bundle bundle2 = fragment.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!fragment.mIsCreated) {
            m0 m0Var = this.a;
            m0Var.h(false);
            fragment.performCreate(bundle);
            m0Var.c(false);
            return;
        }
        fragment.mState = 1;
        fragment.restoreChildFragmentState();
    }

    public final void f() {
        Bundle bundle;
        String str;
        Fragment fragment = this.f1677c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle2 = fragment.mSavedFragmentState;
        ViewGroup container = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 != -1) {
                    container = (ViewGroup) fragment.mFragmentManager.getContainer().b(fragment.mContainerId);
                    if (container == null) {
                        if (!fragment.mRestored) {
                            try {
                                str = fragment.getResources().getResourceName(fragment.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = AppLovinMediationProvider.UNKNOWN;
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                        }
                    } else if (!(container instanceof FragmentContainerView)) {
                        h1.b bVar = h1.c.a;
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        Intrinsics.checkNotNullParameter(container, "container");
                        h1.d dVar = new h1.d(fragment, container, 1);
                        h1.c.c(dVar);
                        h1.b a = h1.c.a(fragment);
                        if (a.a.contains(h1.a.DETECT_WRONG_FRAGMENT_CONTAINER) && h1.c.e(a, fragment.getClass(), h1.d.class)) {
                            h1.c.b(a, dVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(a4.j.g("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(performGetLayoutInflater, container, bundle);
        if (fragment.mView != null) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (container != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (ViewCompat.isAttachedToWindow(fragment.mView)) {
                ViewCompat.requestApplyInsets(fragment.mView);
            } else {
                View view = fragment.mView;
                view.addOnAttachStateChangeListener(new j0(this, view));
            }
            fragment.performViewCreated();
            this.a.m(fragment, fragment.mView, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r9 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            androidx.fragment.app.Fragment r1 = r9.f1677c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            boolean r0 = r1.mRemoving
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r1.isInBackStack()
            if (r0 != 0) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r3
        L2b:
            r4 = 0
            androidx.fragment.app.l1 r5 = r9.f1676b
            if (r0 == 0) goto L39
            boolean r6 = r1.mBeingSaved
            if (r6 != 0) goto L39
            java.lang.String r6 = r1.mWho
            r5.i(r4, r6)
        L39:
            if (r0 != 0) goto L58
            androidx.fragment.app.g1 r6 = r5.f1683d
            java.util.HashMap r7 = r6.a
            java.lang.String r8 = r1.mWho
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L49
            r6 = r2
            goto L53
        L49:
            boolean r7 = r6.f1639d
            if (r7 == 0) goto L50
            boolean r6 = r6.f1640e
            goto L53
        L50:
            boolean r6 = r6.f1641f
            r6 = r6 ^ r2
        L53:
            if (r6 == 0) goto L56
            goto L58
        L56:
            r6 = r3
            goto L59
        L58:
            r6 = r2
        L59:
            if (r6 == 0) goto Lbd
            androidx.fragment.app.i0 r6 = r1.mHost
            boolean r7 = r6 instanceof androidx.lifecycle.e1
            if (r7 == 0) goto L66
            androidx.fragment.app.g1 r2 = r5.f1683d
            boolean r2 = r2.f1640e
            goto L73
        L66:
            android.content.Context r6 = r6.f1648c
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L73
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r6 = r6.isChangingConfigurations()
            r2 = r2 ^ r6
        L73:
            if (r0 == 0) goto L79
            boolean r0 = r1.mBeingSaved
            if (r0 == 0) goto L7b
        L79:
            if (r2 == 0) goto L80
        L7b:
            androidx.fragment.app.g1 r0 = r5.f1683d
            r0.b(r1)
        L80:
            r1.performDestroy()
            androidx.fragment.app.m0 r0 = r9.a
            r0.d(r3)
            java.util.ArrayList r0 = r5.d()
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.k1 r2 = (androidx.fragment.app.k1) r2
            if (r2 == 0) goto L90
            java.lang.String r3 = r1.mWho
            androidx.fragment.app.Fragment r2 = r2.f1677c
            java.lang.String r6 = r2.mTargetWho
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L90
            r2.mTarget = r1
            r2.mTargetWho = r4
            goto L90
        Laf:
            java.lang.String r0 = r1.mTargetWho
            if (r0 == 0) goto Lb9
            androidx.fragment.app.Fragment r0 = r5.b(r0)
            r1.mTarget = r0
        Lb9:
            r5.h(r9)
            goto Lcf
        Lbd:
            java.lang.String r0 = r1.mTargetWho
            if (r0 == 0) goto Lcd
            androidx.fragment.app.Fragment r0 = r5.b(r0)
            if (r0 == 0) goto Lcd
            boolean r2 = r0.mRetainInstance
            if (r2 == 0) goto Lcd
            r1.mTarget = r0
        Lcd:
            r1.mState = r3
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k1.g():void");
    }

    public final void h() {
        View view;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f1677c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.n(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f1677c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        boolean z10 = false;
        this.a.e(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z11 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (!z10) {
            g1 g1Var = this.f1676b.f1683d;
            if (g1Var.a.containsKey(fragment.mWho)) {
                if (g1Var.f1639d) {
                    z11 = g1Var.f1640e;
                } else {
                    z11 = true ^ g1Var.f1641f;
                }
            }
            if (!z11) {
                return;
            }
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Bundle bundle;
        Fragment fragment = this.f1677c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle2 = fragment.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle), null, bundle);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.m(fragment, fragment.mView, false);
                fragment.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f1678d;
        Fragment fragment = this.f1677c;
        if (z10) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f1678d = true;
            boolean z11 = false;
            while (true) {
                int d10 = d();
                int i10 = fragment.mState;
                l1 l1Var = this.f1676b;
                if (d10 != i10) {
                    m0 m0Var = this.a;
                    if (d10 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                break;
                            case 1:
                                e();
                                break;
                            case 2:
                                j();
                                f();
                                break;
                            case 3:
                                a();
                                break;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    e2.j(viewGroup3, fragment.getParentFragmentManager()).b(ac.e.c(fragment.mView.getVisibility()), this);
                                }
                                fragment.mState = 4;
                                break;
                            case 5:
                                if (FragmentManager.isLoggingEnabled(3)) {
                                    Log.d(FragmentManager.TAG, "moveto STARTED: " + fragment);
                                }
                                fragment.performStart();
                                m0Var.k(false);
                                break;
                            case 6:
                                fragment.mState = 6;
                                break;
                            case 7:
                                m();
                                break;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                break;
                            case 0:
                                if (fragment.mBeingSaved) {
                                    if (((Bundle) l1Var.f1682c.get(fragment.mWho)) == null) {
                                        l1Var.i(n(), fragment.mWho);
                                    }
                                }
                                g();
                                break;
                            case 1:
                                h();
                                fragment.mState = 1;
                                break;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                break;
                            case 3:
                                if (FragmentManager.isLoggingEnabled(3)) {
                                    Log.d(FragmentManager.TAG, "movefrom ACTIVITY_CREATED: " + fragment);
                                }
                                if (fragment.mBeingSaved) {
                                    l1Var.i(n(), fragment.mWho);
                                } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                    o();
                                }
                                if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                    e2.j(viewGroup2, fragment.getParentFragmentManager()).d(this);
                                }
                                fragment.mState = 3;
                                break;
                            case 4:
                                if (FragmentManager.isLoggingEnabled(3)) {
                                    Log.d(FragmentManager.TAG, "movefrom STARTED: " + fragment);
                                }
                                fragment.performStop();
                                m0Var.l(false);
                                break;
                            case 5:
                                fragment.mState = 5;
                                break;
                            case 6:
                                if (FragmentManager.isLoggingEnabled(3)) {
                                    Log.d(FragmentManager.TAG, "movefrom RESUMED: " + fragment);
                                }
                                fragment.performPause();
                                m0Var.f(false);
                                break;
                        }
                    }
                    z11 = true;
                } else {
                    if (!z11 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d(FragmentManager.TAG, "Cleaning up state of never attached fragment: " + fragment);
                        }
                        l1Var.f1683d.b(fragment);
                        l1Var.h(this);
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d(FragmentManager.TAG, "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            e2 j3 = e2.j(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                j3.c(this);
                            } else {
                                j3.e(this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.invalidateMenuForFragment(fragment);
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.dispatchOnHiddenChanged();
                    }
                    return;
                }
            }
        } finally {
            this.f1678d = false;
        }
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f1677c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        j1 j1Var = (j1) fragment.mSavedFragmentState.getParcelable("state");
        if (j1Var != null) {
            fragment.mTargetWho = j1Var.f1669n;
            fragment.mTargetRequestCode = j1Var.f1670o;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = j1Var.f1671p;
            }
        }
        if (!fragment.mUserVisibleHint) {
            fragment.mDeferStart = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.Fragment r2 = r7.f1677c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            r3 = 0
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.mView
            if (r0 != r4) goto L28
            goto L32
        L28:
            android.view.ViewParent r4 = r0.getParent()
        L2c:
            if (r4 == 0) goto L39
            android.view.View r5 = r2.mView
            if (r4 != r5) goto L34
        L32:
            r4 = 1
            goto L3a
        L34:
            android.view.ViewParent r4 = r4.getParent()
            goto L2c
        L39:
            r4 = r3
        L3a:
            if (r4 == 0) goto L7d
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L5b
            java.lang.String r0 = "succeeded"
            goto L5d
        L5b:
            java.lang.String r0 = "failed"
        L5d:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
        L7d:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.m0 r1 = r7.a
            r1.i(r3)
            androidx.fragment.app.l1 r1 = r7.f1676b
            java.lang.String r3 = r2.mWho
            r1.i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k1.m():void");
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f1677c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new j1(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle lambda$attachController$4 = fragment.mChildFragmentManager.lambda$attachController$4();
            if (!lambda$attachController$4.isEmpty()) {
                bundle2.putBundle("childFragmentManager", lambda$attachController$4);
            }
            if (fragment.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        Fragment fragment = this.f1677c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f1730h.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.mSavedViewRegistryState = bundle;
        }
    }

    public k1(m0 m0Var, l1 l1Var, ClassLoader classLoader, h0 h0Var, Bundle bundle) {
        this.a = m0Var;
        this.f1676b = l1Var;
        Fragment a = ((j1) bundle.getParcelable("state")).a(h0Var, classLoader);
        this.f1677c = a;
        a.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.setArguments(bundle2);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Instantiated fragment " + a);
        }
    }

    public k1(m0 m0Var, l1 l1Var, Fragment fragment, Bundle bundle) {
        this.a = m0Var;
        this.f1676b = l1Var;
        this.f1677c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
