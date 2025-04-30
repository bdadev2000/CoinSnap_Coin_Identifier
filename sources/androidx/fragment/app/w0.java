package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.AppLovinMediationProvider;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Iterator;
import o0.C2491c;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final V f4796a;
    public final x0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f4797c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4798d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4799e = -1;

    public w0(V v6, x0 x0Var, Fragment fragment) {
        this.f4796a = v6;
        this.b = x0Var;
        this.f4797c = fragment;
    }

    public final void a() {
        Bundle bundle;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f4797c;
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
        this.f4796a.a(fragment, false);
    }

    public final void b() {
        View view;
        View view2;
        int i9 = -1;
        Fragment fragment = this.f4797c;
        Fragment findViewFragment = FragmentManager.findViewFragment(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (findViewFragment != null && !findViewFragment.equals(parentFragment)) {
            int i10 = fragment.mContainerId;
            C2491c c2491c = o0.d.f21935a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(findViewFragment);
            sb.append(" via container with ID ");
            o0.d.b(new o0.i(fragment, AbstractC2914a.g(sb, i10, " without using parent's childFragmentManager")));
            o0.d.a(fragment).getClass();
        }
        x0 x0Var = this.b;
        x0Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = x0Var.f4801a;
            int indexOf = arrayList.indexOf(fragment);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i9 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i11);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i9 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i9);
    }

    public final void c() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f4797c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        w0 w0Var = null;
        x0 x0Var = this.b;
        if (fragment2 != null) {
            w0 w0Var2 = (w0) x0Var.b.get(fragment2.mWho);
            if (w0Var2 != null) {
                fragment.mTargetWho = fragment.mTarget.mWho;
                fragment.mTarget = null;
                w0Var = w0Var2;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (w0Var = (w0) x0Var.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC2914a.h(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (w0Var != null) {
            w0Var.k();
        }
        fragment.mHost = fragment.mFragmentManager.getHost();
        fragment.mParentFragment = fragment.mFragmentManager.getParent();
        V v6 = this.f4796a;
        v6.g(fragment, false);
        fragment.performAttach();
        v6.b(fragment, false);
    }

    public final int d() {
        int i9;
        int i10;
        Fragment fragment = this.f4797c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i11 = this.f4799e;
        int ordinal = fragment.mMaxState.ordinal();
        int i12 = 0;
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
                i11 = Math.max(this.f4799e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f4799e < 4 ? Math.min(i11, fragment.mState) : Math.min(i11, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            i11 = Math.min(i11, 4);
        }
        if (!fragment.mAdded) {
            i11 = Math.min(i11, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            r n2 = r.n(viewGroup, fragment.getParentFragmentManager());
            n2.getClass();
            L0 k6 = n2.k(fragment);
            if (k6 != null) {
                i9 = k6.b;
            } else {
                i9 = 0;
            }
            L0 l = n2.l(fragment);
            if (l != null) {
                i12 = l.b;
            }
            if (i9 == 0) {
                i10 = -1;
            } else {
                i10 = M0.f4680a[AbstractC2965e.d(i9)];
            }
            if (i10 != -1 && i10 != 1) {
                i12 = i9;
            }
        }
        if (i12 == 2) {
            i11 = Math.min(i11, 6);
        } else if (i12 == 3) {
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
        if (fragment.mTransitioning) {
            i11 = Math.max(i11, 3);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "computeExpectedState() of " + i11 + " for " + fragment);
        }
        return i11;
    }

    public final void e() {
        Bundle bundle;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f4797c;
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
            V v6 = this.f4796a;
            v6.h(fragment, false);
            fragment.performCreate(bundle);
            v6.c(fragment, false);
            return;
        }
        fragment.mState = 1;
        fragment.restoreChildFragmentState();
    }

    public final void f() {
        Bundle bundle;
        String str;
        Fragment fragment = this.f4797c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle2 = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i9 = fragment.mContainerId;
            if (i9 != 0) {
                if (i9 != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.getContainer().b(fragment.mContainerId);
                    if (viewGroup == null) {
                        if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                            try {
                                str = fragment.getResources().getResourceName(fragment.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = AppLovinMediationProvider.UNKNOWN;
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C2491c c2491c = o0.d.f21935a;
                        o0.d.b(new o0.e(fragment, viewGroup, 1));
                        o0.d.a(fragment).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(Q7.n0.i("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (fragment.mView != null) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                ViewCompat.requestApplyInsets(fragment.mView);
            } else {
                View view = fragment.mView;
                view.addOnAttachStateChangeListener(new v0(view));
            }
            fragment.performViewCreated();
            this.f4796a.m(fragment, fragment.mView, bundle, false);
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

    public final void g() {
        boolean z8;
        boolean z9;
        Fragment b;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f4797c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "movefrom CREATED: " + fragment);
        }
        boolean z10 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z8 = true;
        } else {
            z8 = false;
        }
        x0 x0Var = this.b;
        if (z8 && !fragment.mBeingSaved) {
            x0Var.i(null, fragment.mWho);
        }
        if (!z8) {
            r0 r0Var = x0Var.f4803d;
            if (!r0Var.b.containsKey(fragment.mWho)) {
                z9 = true;
            } else if (r0Var.f4778e) {
                z9 = r0Var.f4779f;
            } else {
                z9 = !r0Var.f4780g;
            }
            if (!z9) {
                String str = fragment.mTargetWho;
                if (str != null && (b = x0Var.b(str)) != null && b.mRetainInstance) {
                    fragment.mTarget = b;
                }
                fragment.mState = 0;
                return;
            }
        }
        Q q9 = fragment.mHost;
        if (q9 instanceof androidx.lifecycle.g0) {
            z10 = x0Var.f4803d.f4779f;
        } else {
            Context context = q9.f4683c;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z8 && !fragment.mBeingSaved) || z10) {
            x0Var.f4803d.f(fragment, false);
        }
        fragment.performDestroy();
        this.f4796a.d(fragment, false);
        Iterator it = x0Var.d().iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (w0Var != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = w0Var.f4797c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = x0Var.b(str3);
        }
        x0Var.h(this);
    }

    public final void h() {
        View view;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f4797c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f4796a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.d(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f4797c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f4796a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            r0 r0Var = this.b.f4803d;
            boolean z8 = true;
            if (r0Var.b.containsKey(fragment.mWho)) {
                if (r0Var.f4778e) {
                    z8 = r0Var.f4779f;
                } else {
                    z8 = true ^ r0Var.f4780g;
                }
            }
            if (!z8) {
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
        Fragment fragment = this.f4797c;
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
                this.f4796a.m(fragment, fragment.mView, bundle, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x017b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w0.k():void");
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f4797c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            u0 u0Var = (u0) fragment.mSavedFragmentState.getParcelable("state");
            if (u0Var != null) {
                fragment.mTargetWho = u0Var.f4792o;
                fragment.mTargetRequestCode = u0Var.f4793p;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = u0Var.f4794q;
                }
            }
            if (!fragment.mUserVisibleHint) {
                fragment.mDeferStart = true;
            }
        } catch (BadParcelableException e4) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e4);
        }
    }

    public final void m() {
        String str;
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f4797c;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fragment.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(fragment);
                sb.append(" resulting in focused view ");
                sb.append(fragment.mView.findFocus());
                Log.v(FragmentManager.TAG, sb.toString());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f4796a.i(fragment, false);
        this.b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f4797c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new u0(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f4796a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle lambda$attachController$5 = fragment.mChildFragmentManager.lambda$attachController$5();
            if (!lambda$attachController$5.isEmpty()) {
                bundle2.putBundle("childFragmentManager", lambda$attachController$5);
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
        Fragment fragment = this.f4797c;
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
        fragment.mViewLifecycleOwner.f4657g.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.mSavedViewRegistryState = bundle;
        }
    }

    public w0(V v6, x0 x0Var, ClassLoader classLoader, P p2, Bundle bundle) {
        this.f4796a = v6;
        this.b = x0Var;
        Fragment a6 = ((u0) bundle.getParcelable("state")).a(p2, classLoader);
        this.f4797c = a6;
        a6.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a6.setArguments(bundle2);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Instantiated fragment " + a6);
        }
    }

    public w0(V v6, x0 x0Var, Fragment fragment, Bundle bundle) {
        this.f4796a = v6;
        this.b = x0Var;
        this.f4797c = fragment;
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
