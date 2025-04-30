package androidx.fragment.app;

import T.InterfaceC0278k;
import T.InterfaceC0286q;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C0416q;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n1.C2475f;
import o0.C2491c;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean DEBUG = false;
    private static final String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private static final String FRAGMENT_KEY_PREFIX = "fragment_";
    private static final String FRAGMENT_MANAGER_STATE_KEY = "state";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private static final String RESULT_KEY_PREFIX = "result_";
    private static final String SAVED_STATE_KEY = "android:support:fragments";
    public static final String TAG = "FragmentManager";
    static boolean USE_PREDICTIVE_BACK = true;
    private N mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    private boolean mDestroyed;
    private boolean mExecutingActions;
    private boolean mHavePendingDeferredStart;
    private Q mHost;
    private boolean mNeedMenuInvalidate;
    private r0 mNonConfig;
    private f.x mOnBackPressedDispatcher;
    private final S.a mOnConfigurationChangedListener;
    private final S.a mOnMultiWindowModeChangedListener;
    private final S.a mOnPictureInPictureModeChangedListener;
    private final S.a mOnTrimMemoryListener;
    private Fragment mParent;

    @Nullable
    Fragment mPrimaryNav;
    private h.c mRequestPermissions;
    private h.c mStartActivityForResult;
    private h.c mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private C2491c mStrictModePolicy;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<C0451a> mTmpRecords;
    private final ArrayList<InterfaceC0472k0> mPendingActions = new ArrayList<>();
    private final x0 mFragmentStore = new x0();
    ArrayList<C0451a> mBackStack = new ArrayList<>();
    private final T mLayoutInflaterFactory = new T(this);
    C0451a mTransitioningOp = null;
    boolean mBackStarted = false;
    private final f.o mOnBackPressedCallback = new Y(this);
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    private final Map<String, C0455c> mBackStackStates = Q7.n0.q();
    private final Map<String, Bundle> mResults = Q7.n0.q();
    private final Map<String, C0468i0> mResultListeners = Q7.n0.q();
    ArrayList<InterfaceC0470j0> mBackStackChangeListeners = new ArrayList<>();
    private final V mLifecycleCallbacksDispatcher = new V(this);
    private final CopyOnWriteArrayList<s0> mOnAttachListeners = new CopyOnWriteArrayList<>();
    private final InterfaceC0286q mMenuProvider = new Z(this);
    int mCurState = -1;
    private P mFragmentFactory = null;
    private P mHostFragmentFactory = new C0452a0(this);
    private N0 mSpecialEffectsControllerFactory = null;
    private N0 mDefaultSpecialEffectsControllerFactory = new Object();
    ArrayDeque<C0466h0> mLaunchedFragments = new ArrayDeque<>();
    private Runnable mExecCommit = new RunnableC0483s(this, 2);

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.N0, java.lang.Object] */
    public FragmentManager() {
        final int i9 = 0;
        this.mOnConfigurationChangedListener = new S.a(this) { // from class: androidx.fragment.app.W
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // S.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        this.b.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.b.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.b.lambda$new$2((C0416q) obj);
                        return;
                    default:
                        this.b.lambda$new$3((androidx.core.app.n0) obj);
                        return;
                }
            }
        };
        final int i10 = 1;
        this.mOnTrimMemoryListener = new S.a(this) { // from class: androidx.fragment.app.W
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // S.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.b.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.b.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.b.lambda$new$2((C0416q) obj);
                        return;
                    default:
                        this.b.lambda$new$3((androidx.core.app.n0) obj);
                        return;
                }
            }
        };
        final int i11 = 2;
        this.mOnMultiWindowModeChangedListener = new S.a(this) { // from class: androidx.fragment.app.W
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // S.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.b.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.b.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.b.lambda$new$2((C0416q) obj);
                        return;
                    default:
                        this.b.lambda$new$3((androidx.core.app.n0) obj);
                        return;
                }
            }
        };
        final int i12 = 3;
        this.mOnPictureInPictureModeChangedListener = new S.a(this) { // from class: androidx.fragment.app.W
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // S.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.b.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.b.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.b.lambda$new$2((C0416q) obj);
                        return;
                    default:
                        this.b.lambda$new$3((androidx.core.app.n0) obj);
                        return;
                }
            }
        };
    }

    private void checkStateLoss() {
        if (!isStateSaved()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private void clearBackStackStateViewModels() {
        boolean z8;
        Q q9 = this.mHost;
        if (q9 instanceof androidx.lifecycle.g0) {
            z8 = this.mFragmentStore.f4803d.f4779f;
        } else {
            Context context = q9.f4683c;
            if (context instanceof Activity) {
                z8 = !((Activity) context).isChangingConfigurations();
            } else {
                z8 = true;
            }
        }
        if (z8) {
            Iterator<C0455c> it = this.mBackStackStates.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().b.iterator();
                while (it2.hasNext()) {
                    this.mFragmentStore.f4803d.g((String) it2.next(), false);
                }
            }
        }
    }

    private Set<r> collectAllSpecialEffectsController() {
        r rVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.mFragmentStore.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((w0) it.next()).f4797c.mContainer;
            if (viewGroup != null) {
                G7.j.e(getSpecialEffectsControllerFactory(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof r) {
                    rVar = (r) tag;
                } else {
                    rVar = new r(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, rVar);
                }
                hashSet.add(rVar);
            }
        }
        return hashSet;
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(@Nullable Fragment fragment) {
        if (fragment != null && fragment.equals(findActiveFragment(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private void dispatchStateChange(int i9) {
        try {
            this.mExecutingActions = true;
            for (w0 w0Var : this.mFragmentStore.b.values()) {
                if (w0Var != null) {
                    w0Var.f4799e = i9;
                }
            }
            moveToState(i9, false);
            Iterator<r> it = collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                it.next().m();
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    @Deprecated
    public static void enableDebugLogging(boolean z8) {
        DEBUG = z8;
    }

    public static void enablePredictiveBack(boolean z8) {
        USE_PREDICTIVE_BACK = z8;
    }

    public void endAnimatingAwayFragments() {
        Iterator<r> it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            it.next().m();
        }
    }

    private void ensureExecReady(boolean z8) {
        if (!this.mExecutingActions) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.mHost.f4684d.getLooper()) {
                if (!z8) {
                    checkStateLoss();
                }
                if (this.mTmpRecords == null) {
                    this.mTmpRecords = new ArrayList<>();
                    this.mTmpIsPop = new ArrayList<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private static void executeOps(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i9, int i10) {
        while (i9 < i10) {
            C0451a c0451a = arrayList.get(i9);
            if (arrayList2.get(i9).booleanValue()) {
                c0451a.b(-1);
                for (int size = c0451a.mOps.size() - 1; size >= 0; size--) {
                    y0 y0Var = c0451a.mOps.get(size);
                    Fragment fragment = y0Var.b;
                    if (fragment != null) {
                        fragment.mBeingSaved = c0451a.f4695d;
                        fragment.setPopDirection(true);
                        fragment.setNextTransition(reverseTransit(c0451a.mTransition));
                        fragment.setSharedElementNames(c0451a.mSharedElementTargetNames, c0451a.mSharedElementSourceNames);
                    }
                    int i11 = y0Var.f4805a;
                    FragmentManager fragmentManager = c0451a.f4693a;
                    switch (i11) {
                        case 1:
                            fragment.setAnimations(y0Var.f4807d, y0Var.f4808e, y0Var.f4809f, y0Var.f4810g);
                            fragmentManager.setExitAnimationOrder(fragment, true);
                            fragmentManager.removeFragment(fragment);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + y0Var.f4805a);
                        case 3:
                            fragment.setAnimations(y0Var.f4807d, y0Var.f4808e, y0Var.f4809f, y0Var.f4810g);
                            fragmentManager.addFragment(fragment);
                            break;
                        case 4:
                            fragment.setAnimations(y0Var.f4807d, y0Var.f4808e, y0Var.f4809f, y0Var.f4810g);
                            fragmentManager.showFragment(fragment);
                            break;
                        case 5:
                            fragment.setAnimations(y0Var.f4807d, y0Var.f4808e, y0Var.f4809f, y0Var.f4810g);
                            fragmentManager.setExitAnimationOrder(fragment, true);
                            fragmentManager.hideFragment(fragment);
                            break;
                        case 6:
                            fragment.setAnimations(y0Var.f4807d, y0Var.f4808e, y0Var.f4809f, y0Var.f4810g);
                            fragmentManager.attachFragment(fragment);
                            break;
                        case 7:
                            fragment.setAnimations(y0Var.f4807d, y0Var.f4808e, y0Var.f4809f, y0Var.f4810g);
                            fragmentManager.setExitAnimationOrder(fragment, true);
                            fragmentManager.detachFragment(fragment);
                            break;
                        case 8:
                            fragmentManager.setPrimaryNavigationFragment(null);
                            break;
                        case 9:
                            fragmentManager.setPrimaryNavigationFragment(fragment);
                            break;
                        case 10:
                            fragmentManager.setMaxLifecycle(fragment, y0Var.f4811h);
                            break;
                    }
                }
            } else {
                c0451a.b(1);
                int size2 = c0451a.mOps.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    y0 y0Var2 = c0451a.mOps.get(i12);
                    Fragment fragment2 = y0Var2.b;
                    if (fragment2 != null) {
                        fragment2.mBeingSaved = c0451a.f4695d;
                        fragment2.setPopDirection(false);
                        fragment2.setNextTransition(c0451a.mTransition);
                        fragment2.setSharedElementNames(c0451a.mSharedElementSourceNames, c0451a.mSharedElementTargetNames);
                    }
                    int i13 = y0Var2.f4805a;
                    FragmentManager fragmentManager2 = c0451a.f4693a;
                    switch (i13) {
                        case 1:
                            fragment2.setAnimations(y0Var2.f4807d, y0Var2.f4808e, y0Var2.f4809f, y0Var2.f4810g);
                            fragmentManager2.setExitAnimationOrder(fragment2, false);
                            fragmentManager2.addFragment(fragment2);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + y0Var2.f4805a);
                        case 3:
                            fragment2.setAnimations(y0Var2.f4807d, y0Var2.f4808e, y0Var2.f4809f, y0Var2.f4810g);
                            fragmentManager2.removeFragment(fragment2);
                            break;
                        case 4:
                            fragment2.setAnimations(y0Var2.f4807d, y0Var2.f4808e, y0Var2.f4809f, y0Var2.f4810g);
                            fragmentManager2.hideFragment(fragment2);
                            break;
                        case 5:
                            fragment2.setAnimations(y0Var2.f4807d, y0Var2.f4808e, y0Var2.f4809f, y0Var2.f4810g);
                            fragmentManager2.setExitAnimationOrder(fragment2, false);
                            fragmentManager2.showFragment(fragment2);
                            break;
                        case 6:
                            fragment2.setAnimations(y0Var2.f4807d, y0Var2.f4808e, y0Var2.f4809f, y0Var2.f4810g);
                            fragmentManager2.detachFragment(fragment2);
                            break;
                        case 7:
                            fragment2.setAnimations(y0Var2.f4807d, y0Var2.f4808e, y0Var2.f4809f, y0Var2.f4810g);
                            fragmentManager2.setExitAnimationOrder(fragment2, false);
                            fragmentManager2.attachFragment(fragment2);
                            break;
                        case 8:
                            fragmentManager2.setPrimaryNavigationFragment(fragment2);
                            break;
                        case 9:
                            fragmentManager2.setPrimaryNavigationFragment(null);
                            break;
                        case 10:
                            fragmentManager2.setMaxLifecycle(fragment2, y0Var2.f4812i);
                            break;
                    }
                }
            }
            i9++;
        }
    }

    private void executeOpsTogether(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i9, int i10) {
        boolean z8;
        int i11;
        int i12;
        int i13;
        ArrayList<C0451a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z9 = arrayList3.get(i9).mReorderingAllowed;
        ArrayList<Fragment> arrayList5 = this.mTmpAddedFragments;
        if (arrayList5 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.f());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        int i14 = i9;
        boolean z10 = false;
        while (true) {
            int i15 = 1;
            if (i14 < i10) {
                C0451a c0451a = arrayList3.get(i14);
                int i16 = 3;
                if (!arrayList4.get(i14).booleanValue()) {
                    ArrayList<Fragment> arrayList6 = this.mTmpAddedFragments;
                    int i17 = 0;
                    while (i17 < c0451a.mOps.size()) {
                        y0 y0Var = c0451a.mOps.get(i17);
                        int i18 = y0Var.f4805a;
                        if (i18 != i15) {
                            if (i18 != 2) {
                                if (i18 != i16 && i18 != 6) {
                                    if (i18 != 7) {
                                        if (i18 == 8) {
                                            c0451a.mOps.add(i17, new y0(primaryNavigationFragment, 9, 0));
                                            y0Var.f4806c = true;
                                            i17++;
                                            primaryNavigationFragment = y0Var.b;
                                        }
                                    } else {
                                        i11 = 1;
                                    }
                                } else {
                                    arrayList6.remove(y0Var.b);
                                    Fragment fragment = y0Var.b;
                                    if (fragment == primaryNavigationFragment) {
                                        c0451a.mOps.add(i17, new y0(9, fragment));
                                        i17++;
                                        i11 = 1;
                                        primaryNavigationFragment = null;
                                    }
                                }
                                i11 = 1;
                            } else {
                                Fragment fragment2 = y0Var.b;
                                int i19 = fragment2.mContainerId;
                                int size = arrayList6.size() - 1;
                                boolean z11 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList6.get(size);
                                    if (fragment3.mContainerId == i19) {
                                        if (fragment3 == fragment2) {
                                            i12 = i19;
                                            z11 = true;
                                        } else {
                                            if (fragment3 == primaryNavigationFragment) {
                                                i12 = i19;
                                                i13 = 0;
                                                c0451a.mOps.add(i17, new y0(fragment3, 9, 0));
                                                i17++;
                                                primaryNavigationFragment = null;
                                            } else {
                                                i12 = i19;
                                                i13 = 0;
                                            }
                                            y0 y0Var2 = new y0(fragment3, 3, i13);
                                            y0Var2.f4807d = y0Var.f4807d;
                                            y0Var2.f4809f = y0Var.f4809f;
                                            y0Var2.f4808e = y0Var.f4808e;
                                            y0Var2.f4810g = y0Var.f4810g;
                                            c0451a.mOps.add(i17, y0Var2);
                                            arrayList6.remove(fragment3);
                                            i17++;
                                        }
                                    } else {
                                        i12 = i19;
                                    }
                                    size--;
                                    i19 = i12;
                                }
                                if (z11) {
                                    c0451a.mOps.remove(i17);
                                    i17--;
                                    i11 = 1;
                                } else {
                                    i11 = 1;
                                    y0Var.f4805a = 1;
                                    y0Var.f4806c = true;
                                    arrayList6.add(fragment2);
                                }
                            }
                            i17 += i11;
                            i15 = i11;
                            i16 = 3;
                        } else {
                            i11 = i15;
                        }
                        arrayList6.add(y0Var.b);
                        i17 += i11;
                        i15 = i11;
                        i16 = 3;
                    }
                    z8 = false;
                } else {
                    int i20 = 1;
                    z8 = false;
                    ArrayList<Fragment> arrayList7 = this.mTmpAddedFragments;
                    int size2 = c0451a.mOps.size() - 1;
                    while (size2 >= 0) {
                        y0 y0Var3 = c0451a.mOps.get(size2);
                        int i21 = y0Var3.f4805a;
                        if (i21 != i20) {
                            if (i21 != 3) {
                                switch (i21) {
                                    case 8:
                                        primaryNavigationFragment = null;
                                        break;
                                    case 9:
                                        primaryNavigationFragment = y0Var3.b;
                                        break;
                                    case 10:
                                        y0Var3.f4812i = y0Var3.f4811h;
                                        break;
                                }
                                size2--;
                                i20 = 1;
                            }
                            arrayList7.add(y0Var3.b);
                            size2--;
                            i20 = 1;
                        }
                        arrayList7.remove(y0Var3.b);
                        size2--;
                        i20 = 1;
                    }
                }
                if (!z10 && !c0451a.mAddToBackStack) {
                    z10 = z8;
                } else {
                    z10 = true;
                }
                i14++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
            } else {
                this.mTmpAddedFragments.clear();
                if (!z9 && this.mCurState >= 1) {
                    for (int i22 = i9; i22 < i10; i22++) {
                        Iterator<y0> it = arrayList.get(i22).mOps.iterator();
                        while (it.hasNext()) {
                            Fragment fragment4 = it.next().b;
                            if (fragment4 != null && fragment4.mFragmentManager != null) {
                                this.mFragmentStore.g(createOrGetFragmentStateManager(fragment4));
                            }
                        }
                    }
                }
                executeOps(arrayList, arrayList2, i9, i10);
                boolean booleanValue = arrayList2.get(i10 - 1).booleanValue();
                if (z10 && !this.mBackStackChangeListeners.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<C0451a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(fragmentsFromRecord(it2.next()));
                    }
                    if (this.mTransitioningOp == null) {
                        Iterator<InterfaceC0470j0> it3 = this.mBackStackChangeListeners.iterator();
                        while (it3.hasNext()) {
                            com.mbridge.msdk.foundation.entity.o.v(it3.next());
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw null;
                            }
                        }
                        Iterator<InterfaceC0470j0> it5 = this.mBackStackChangeListeners.iterator();
                        while (it5.hasNext()) {
                            com.mbridge.msdk.foundation.entity.o.v(it5.next());
                            Iterator it6 = linkedHashSet.iterator();
                            if (it6.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i23 = i9; i23 < i10; i23++) {
                    C0451a c0451a2 = arrayList.get(i23);
                    if (booleanValue) {
                        for (int size3 = c0451a2.mOps.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = c0451a2.mOps.get(size3).b;
                            if (fragment5 != null) {
                                createOrGetFragmentStateManager(fragment5).k();
                            }
                        }
                    } else {
                        Iterator<y0> it7 = c0451a2.mOps.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = it7.next().b;
                            if (fragment6 != null) {
                                createOrGetFragmentStateManager(fragment6).k();
                            }
                        }
                    }
                }
                moveToState(this.mCurState, true);
                int i24 = i9;
                for (r rVar : collectChangedControllers(arrayList, i24, i10)) {
                    rVar.f4773d = booleanValue;
                    rVar.o();
                    rVar.i();
                }
                while (i24 < i10) {
                    C0451a c0451a3 = arrayList.get(i24);
                    if (arrayList2.get(i24).booleanValue() && c0451a3.f4694c >= 0) {
                        c0451a3.f4694c = -1;
                    }
                    if (c0451a3.mCommitRunnables != null) {
                        for (int i25 = 0; i25 < c0451a3.mCommitRunnables.size(); i25++) {
                            c0451a3.mCommitRunnables.get(i25).run();
                        }
                        c0451a3.mCommitRunnables = null;
                    }
                    i24++;
                }
                if (z10) {
                    reportBackStackChanged();
                    return;
                }
                return;
            }
        }
    }

    private int findBackStackIndex(@Nullable String str, int i9, boolean z8) {
        if (this.mBackStack.isEmpty()) {
            return -1;
        }
        if (str == null && i9 < 0) {
            if (z8) {
                return 0;
            }
            return this.mBackStack.size() - 1;
        }
        int size = this.mBackStack.size() - 1;
        while (size >= 0) {
            C0451a c0451a = this.mBackStack.get(size);
            if ((str != null && str.equals(c0451a.mName)) || (i9 >= 0 && i9 == c0451a.f4694c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z8) {
            while (size > 0) {
                C0451a c0451a2 = this.mBackStack.get(size - 1);
                if ((str != null && str.equals(c0451a2.mName)) || (i9 >= 0 && i9 == c0451a2.f4694c)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        }
        if (size == this.mBackStack.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    @NonNull
    public static <F extends Fragment> F findFragment(@NonNull View view) {
        F f9 = (F) findViewFragment(view);
        if (f9 != null) {
            return f9;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @NonNull
    public static FragmentManager findFragmentManager(@NonNull View view) {
        FragmentActivity fragmentActivity;
        Fragment findViewFragment = findViewFragment(view);
        if (findViewFragment != null) {
            if (findViewFragment.isAdded()) {
                return findViewFragment.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + findViewFragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                fragmentActivity = null;
                break;
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @Nullable
    public static Fragment findViewFragment(@NonNull View view) {
        while (view != null) {
            Fragment viewFragment = getViewFragment(view);
            if (viewFragment != null) {
                return viewFragment;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void forcePostponedTransactions() {
        for (r rVar : collectAllSpecialEffectsController()) {
            if (rVar.f4774e) {
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "SpecialEffectsController: Forcing postponed operations");
                }
                rVar.f4774e = false;
                rVar.i();
            }
        }
    }

    private boolean generateOpsForPendingActions(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            try {
                int size = this.mPendingActions.size();
                boolean z8 = false;
                for (int i9 = 0; i9 < size; i9++) {
                    z8 |= this.mPendingActions.get(i9).a(arrayList, arrayList2);
                }
                return z8;
            } finally {
                this.mPendingActions.clear();
                this.mHost.f4684d.removeCallbacks(this.mExecCommit);
            }
        }
    }

    @NonNull
    private r0 getChildNonConfig(@NonNull Fragment fragment) {
        r0 r0Var = this.mNonConfig;
        HashMap hashMap = r0Var.f4776c;
        r0 r0Var2 = (r0) hashMap.get(fragment.mWho);
        if (r0Var2 == null) {
            r0 r0Var3 = new r0(r0Var.f4778e);
            hashMap.put(fragment.mWho, r0Var3);
            return r0Var3;
        }
        return r0Var2;
    }

    private ViewGroup getFragmentContainer(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.c()) {
            View b = this.mContainer.b(fragment.mContainerId);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    @Nullable
    public static Fragment getViewFragment(@NonNull View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean isLoggingEnabled(int i9) {
        if (!DEBUG && !Log.isLoggable(TAG, i9)) {
            return false;
        }
        return true;
    }

    private boolean isMenuAvailable(@NonNull Fragment fragment) {
        if ((fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus()) {
            return true;
        }
        return false;
    }

    private boolean isParentAdded() {
        Fragment fragment = this.mParent;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.mParent.getParentFragmentManager().isParentAdded()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$cancelBackStackTransition$4() {
        Iterator<InterfaceC0470j0> it = this.mBackStackChangeListeners.iterator();
        if (!it.hasNext()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.o.v(it.next());
        throw null;
    }

    public /* synthetic */ void lambda$new$0(Configuration configuration) {
        if (isParentAdded()) {
            dispatchConfigurationChanged(configuration, false);
        }
    }

    public /* synthetic */ void lambda$new$1(Integer num) {
        if (isParentAdded() && num.intValue() == 80) {
            dispatchLowMemory(false);
        }
    }

    public void lambda$new$2(C0416q c0416q) {
        if (isParentAdded()) {
            dispatchMultiWindowModeChanged(c0416q.f4423a, false);
        }
    }

    public void lambda$new$3(androidx.core.app.n0 n0Var) {
        if (isParentAdded()) {
            dispatchPictureInPictureModeChanged(n0Var.f4417a, false);
        }
    }

    private void removeRedundantOperationsAndExecute(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i9 = 0;
            int i10 = 0;
            while (i9 < size) {
                if (!arrayList.get(i9).mReorderingAllowed) {
                    if (i10 != i9) {
                        executeOpsTogether(arrayList, arrayList2, i10, i9);
                    }
                    i10 = i9 + 1;
                    if (arrayList2.get(i9).booleanValue()) {
                        while (i10 < size && arrayList2.get(i10).booleanValue() && !arrayList.get(i10).mReorderingAllowed) {
                            i10++;
                        }
                    }
                    executeOpsTogether(arrayList, arrayList2, i9, i10);
                    i9 = i10 - 1;
                }
                i9++;
            }
            if (i10 != size) {
                executeOpsTogether(arrayList, arrayList2, i10, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void reportBackStackChanged() {
        if (this.mBackStackChangeListeners.size() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.entity.o.v(this.mBackStackChangeListeners.get(0));
        throw null;
    }

    public static int reverseTransit(int i9) {
        int i10 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        if (i9 == 4097) {
            return FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
        }
        if (i9 != 8194) {
            i10 = FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
            if (i9 == 8197) {
                return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN;
            }
            if (i9 == 4099) {
                return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
            }
            if (i9 != 4100) {
                return 0;
            }
        }
        return i10;
    }

    private void setVisibleRemovingFragment(@NonNull Fragment fragment) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    fragmentContainer.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    private void startPendingDeferredFragments() {
        Iterator it = this.mFragmentStore.d().iterator();
        while (it.hasNext()) {
            performPendingDeferredStart((w0) it.next());
        }
    }

    private void throwException(RuntimeException runtimeException) {
        Log.e(TAG, runtimeException.getMessage());
        Log.e(TAG, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new I0());
        Q q9 = this.mHost;
        if (q9 != null) {
            try {
                ((K) q9).f4663g.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e4) {
                Log.e(TAG, "Failed dumping state", e4);
                throw runtimeException;
            }
        }
        try {
            dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e9) {
            Log.e(TAG, "Failed dumping state", e9);
            throw runtimeException;
        }
    }

    private void updateOnBackPressedCallbackEnabled() {
        synchronized (this.mPendingActions) {
            try {
                boolean z8 = true;
                if (!this.mPendingActions.isEmpty()) {
                    f.o oVar = this.mOnBackPressedCallback;
                    oVar.f20226a = true;
                    F7.a aVar = oVar.f20227c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    if (isLoggingEnabled(3)) {
                        Log.d(TAG, "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                if (getBackStackEntryCount() <= 0 || !isPrimaryNavigation(this.mParent)) {
                    z8 = false;
                }
                if (isLoggingEnabled(3)) {
                    Log.d(TAG, "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z8);
                }
                f.o oVar2 = this.mOnBackPressedCallback;
                oVar2.f20226a = z8;
                F7.a aVar2 = oVar2.f20227c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addBackStackState(C0451a c0451a) {
        this.mBackStack.add(c0451a);
    }

    public w0 addFragment(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            o0.d.c(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "add: " + fragment);
        }
        w0 createOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.g(createOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return createOrGetFragmentStateManager;
    }

    public void addFragmentOnAttachListener(@NonNull s0 s0Var) {
        this.mOnAttachListeners.add(s0Var);
    }

    public void addOnBackStackChangedListener(@NonNull InterfaceC0470j0 interfaceC0470j0) {
        this.mBackStackChangeListeners.add(interfaceC0470j0);
    }

    public void addRetainedFragment(@NonNull Fragment fragment) {
        this.mNonConfig.e(fragment);
    }

    public int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void attachController(@NonNull Q q9, @NonNull N n2, @Nullable Fragment fragment) {
        String str;
        if (this.mHost == null) {
            this.mHost = q9;
            this.mContainer = n2;
            this.mParent = fragment;
            if (fragment != null) {
                addFragmentOnAttachListener(new C0456c0(fragment));
            } else if (q9 instanceof s0) {
                addFragmentOnAttachListener((s0) q9);
            }
            if (this.mParent != null) {
                updateOnBackPressedCallbackEnabled();
            }
            if (q9 instanceof f.y) {
                f.y yVar = (f.y) q9;
                f.x onBackPressedDispatcher = yVar.getOnBackPressedDispatcher();
                this.mOnBackPressedDispatcher = onBackPressedDispatcher;
                InterfaceC0511v interfaceC0511v = yVar;
                if (fragment != null) {
                    interfaceC0511v = fragment;
                }
                onBackPressedDispatcher.a(interfaceC0511v, this.mOnBackPressedCallback);
            }
            if (fragment != null) {
                this.mNonConfig = fragment.mFragmentManager.getChildNonConfig(fragment);
            } else if (q9 instanceof androidx.lifecycle.g0) {
                this.mNonConfig = (r0) new C2475f(((androidx.lifecycle.g0) q9).getViewModelStore(), r0.f4775i).o(G7.s.a(r0.class));
            } else {
                this.mNonConfig = new r0(false);
            }
            this.mNonConfig.f4781h = isStateSaved();
            this.mFragmentStore.f4803d = this.mNonConfig;
            Object obj = this.mHost;
            if ((obj instanceof G0.g) && fragment == null) {
                G0.e savedStateRegistry = ((G0.g) obj).getSavedStateRegistry();
                savedStateRegistry.c(SAVED_STATE_KEY, new H(this, 1));
                Bundle a6 = savedStateRegistry.a(SAVED_STATE_KEY);
                if (a6 != null) {
                    restoreSaveStateInternal(a6);
                }
            }
            Object obj2 = this.mHost;
            if (obj2 instanceof h.j) {
                h.i activityResultRegistry = ((h.j) obj2).getActivityResultRegistry();
                if (fragment != null) {
                    str = AbstractC2914a.h(new StringBuilder(), fragment.mWho, ":");
                } else {
                    str = "";
                }
                String d2 = AbstractC2914a.d("FragmentManager:", str);
                this.mStartActivityForResult = activityResultRegistry.d(com.mbridge.msdk.foundation.entity.o.j(d2, "StartActivityForResult"), new C0462f0(3), new X(this, 1));
                this.mStartIntentSenderForResult = activityResultRegistry.d(com.mbridge.msdk.foundation.entity.o.j(d2, "StartIntentSenderForResult"), new C0462f0(0), new X(this, 2));
                this.mRequestPermissions = activityResultRegistry.d(com.mbridge.msdk.foundation.entity.o.j(d2, "RequestPermissions"), new C0462f0(1), new X(this, 0));
            }
            Object obj3 = this.mHost;
            if (obj3 instanceof I.n) {
                ((I.n) obj3).addOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
            }
            Object obj4 = this.mHost;
            if (obj4 instanceof I.o) {
                ((I.o) obj4).addOnTrimMemoryListener(this.mOnTrimMemoryListener);
            }
            Object obj5 = this.mHost;
            if (obj5 instanceof androidx.core.app.j0) {
                ((androidx.core.app.j0) obj5).addOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
            }
            Object obj6 = this.mHost;
            if (obj6 instanceof androidx.core.app.k0) {
                ((androidx.core.app.k0) obj6).addOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
            }
            Object obj7 = this.mHost;
            if ((obj7 instanceof InterfaceC0278k) && fragment == null) {
                ((InterfaceC0278k) obj7).addMenuProvider(this.mMenuProvider);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void attachFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.a(fragment);
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "add from attach: " + fragment);
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    @NonNull
    public FragmentTransaction beginTransaction() {
        return new C0451a(this);
    }

    public void cancelBackStackTransition() {
        C0451a c0451a = this.mTransitioningOp;
        if (c0451a != null) {
            c0451a.b = false;
            c0451a.runOnCommitInternal(true, new D3.b(this, 16));
            this.mTransitioningOp.c(false);
            executePendingTransactions();
        }
    }

    public boolean checkForMenus() {
        Iterator it = this.mFragmentStore.e().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                z8 = isMenuAvailable(fragment);
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public void clearBackStack(@NonNull String str) {
        enqueueAction(new C0460e0(this, str, 0), false);
    }

    public boolean clearBackStackState(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        if (!restoreBackStackState(arrayList, arrayList2, str)) {
            return false;
        }
        return popBackStackState(arrayList, arrayList2, str, -1, 1);
    }

    public final void clearFragmentResult(@NonNull String str) {
        this.mResults.remove(str);
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Clearing fragment result with key " + str);
        }
    }

    public final void clearFragmentResultListener(@NonNull String str) {
        C0468i0 remove = this.mResultListeners.remove(str);
        if (remove != null) {
            remove.f4728a.b(remove.f4729c);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Clearing FragmentResultListener for key " + str);
        }
    }

    public Set<r> collectChangedControllers(@NonNull ArrayList<C0451a> arrayList, int i9, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i9 < i10) {
            Iterator<y0> it = arrayList.get(i9).mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(r.n(viewGroup, this));
                }
            }
            i9++;
        }
        return hashSet;
    }

    @NonNull
    public w0 createOrGetFragmentStateManager(@NonNull Fragment fragment) {
        x0 x0Var = this.mFragmentStore;
        w0 w0Var = (w0) x0Var.b.get(fragment.mWho);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        w0Var2.l(this.mHost.f4683c.getClassLoader());
        w0Var2.f4799e = this.mCurState;
        return w0Var2;
    }

    public void detachFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "remove from detach: " + fragment);
                }
                x0 x0Var = this.mFragmentStore;
                synchronized (x0Var.f4801a) {
                    x0Var.f4801a.remove(fragment);
                }
                fragment.mAdded = false;
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                setVisibleRemovingFragment(fragment);
            }
        }
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f4781h = false;
        dispatchStateChange(4);
    }

    public void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f4781h = false;
        dispatchStateChange(0);
    }

    public void dispatchConfigurationChanged(@NonNull Configuration configuration, boolean z8) {
        if (z8 && (this.mHost instanceof I.n)) {
            throwException(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z8) {
                    fragment.mChildFragmentManager.dispatchConfigurationChanged(configuration, true);
                }
            }
        }
    }

    public boolean dispatchContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f4781h = false;
        dispatchStateChange(1);
    }

    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z8 = false;
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z8 = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i9 = 0; i9 < this.mCreatedMenus.size(); i9++) {
                Fragment fragment2 = this.mCreatedMenus.get(i9);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z8;
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        clearBackStackStateViewModels();
        dispatchStateChange(-1);
        Object obj = this.mHost;
        if (obj instanceof I.o) {
            ((I.o) obj).removeOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        Object obj2 = this.mHost;
        if (obj2 instanceof I.n) {
            ((I.n) obj2).removeOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        Object obj3 = this.mHost;
        if (obj3 instanceof androidx.core.app.j0) {
            ((androidx.core.app.j0) obj3).removeOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        Object obj4 = this.mHost;
        if (obj4 instanceof androidx.core.app.k0) {
            ((androidx.core.app.k0) obj4).removeOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        Object obj5 = this.mHost;
        if ((obj5 instanceof InterfaceC0278k) && this.mParent == null) {
            ((InterfaceC0278k) obj5).removeMenuProvider(this.mMenuProvider);
        }
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            Iterator it = this.mOnBackPressedCallback.b.iterator();
            while (it.hasNext()) {
                ((f.c) it.next()).cancel();
            }
            this.mOnBackPressedDispatcher = null;
        }
        h.c cVar = this.mStartActivityForResult;
        if (cVar != null) {
            cVar.b();
            this.mStartIntentSenderForResult.b();
            this.mRequestPermissions.b();
        }
    }

    public void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public void dispatchLowMemory(boolean z8) {
        if (z8 && (this.mHost instanceof I.o)) {
            throwException(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z8) {
                    fragment.mChildFragmentManager.dispatchLowMemory(true);
                }
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z8, boolean z9) {
        if (z9 && (this.mHost instanceof androidx.core.app.j0)) {
            throwException(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z8);
                if (z9) {
                    fragment.mChildFragmentManager.dispatchMultiWindowModeChanged(z8, true);
                }
            }
        }
    }

    public void dispatchOnAttachFragment(@NonNull Fragment fragment) {
        Iterator<s0> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().a(fragment);
        }
    }

    public void dispatchOnHiddenChanged() {
        Iterator it = this.mFragmentStore.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.dispatchOnHiddenChanged();
            }
        }
    }

    public boolean dispatchOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mCurState < 1) {
            return;
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public void dispatchPause() {
        dispatchStateChange(5);
    }

    public void dispatchPictureInPictureModeChanged(boolean z8, boolean z9) {
        if (z9 && (this.mHost instanceof androidx.core.app.k0)) {
            throwException(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z8);
                if (z9) {
                    fragment.mChildFragmentManager.dispatchPictureInPictureModeChanged(z8, true);
                }
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z8 = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z8 = true;
            }
        }
        return z8;
    }

    public void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f4781h = false;
        dispatchStateChange(7);
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f4781h = false;
        dispatchStateChange(5);
    }

    public void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.f4781h = true;
        dispatchStateChange(4);
    }

    public void dispatchViewCreated() {
        dispatchStateChange(2);
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        String j7 = com.mbridge.msdk.foundation.entity.o.j(str, "    ");
        x0 x0Var = this.mFragmentStore;
        x0Var.getClass();
        String str2 = str + "    ";
        HashMap hashMap = x0Var.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w0 w0Var : hashMap.values()) {
                printWriter.print(str);
                if (w0Var != null) {
                    Fragment fragment = w0Var.f4797c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = x0Var.f4801a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i9 = 0; i9 < size2; i9++) {
                Fragment fragment2 = (Fragment) arrayList.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.mCreatedMenus;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment3 = this.mCreatedMenus.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.mBackStack.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                C0451a c0451a = this.mBackStack.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0451a.toString());
                c0451a.d(j7, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            try {
                int size4 = this.mPendingActions.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (InterfaceC0472k0) this.mPendingActions.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public void enqueueAction(@NonNull InterfaceC0472k0 interfaceC0472k0, boolean z8) {
        if (!z8) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            checkStateLoss();
        }
        synchronized (this.mPendingActions) {
            try {
                if (this.mHost == null) {
                    if (z8) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.mPendingActions.add(interfaceC0472k0);
                    scheduleCommit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean execPendingActions(boolean z8) {
        ensureExecReady(z8);
        boolean z9 = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            z9 = true;
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.b.values().removeAll(Collections.singleton(null));
        return z9;
    }

    public void execSingleAction(@NonNull InterfaceC0472k0 interfaceC0472k0, boolean z8) {
        if (z8 && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        ensureExecReady(z8);
        if (interfaceC0472k0.a(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.b.values().removeAll(Collections.singleton(null));
    }

    public boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions(true);
        forcePostponedTransactions();
        return execPendingActions;
    }

    @Nullable
    public Fragment findActiveFragment(@NonNull String str) {
        return this.mFragmentStore.b(str);
    }

    @Nullable
    public Fragment findFragmentById(int i9) {
        x0 x0Var = this.mFragmentStore;
        ArrayList arrayList = x0Var.f4801a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i9) {
                return fragment;
            }
        }
        for (w0 w0Var : x0Var.b.values()) {
            if (w0Var != null) {
                Fragment fragment2 = w0Var.f4797c;
                if (fragment2.mFragmentId == i9) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        x0 x0Var = this.mFragmentStore;
        if (str != null) {
            ArrayList arrayList = x0Var.f4801a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (w0 w0Var : x0Var.b.values()) {
                if (w0Var != null) {
                    Fragment fragment2 = w0Var.f4797c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            x0Var.getClass();
        }
        return null;
    }

    public Fragment findFragmentByWho(@NonNull String str) {
        return this.mFragmentStore.c(str);
    }

    public Set<Fragment> fragmentsFromRecord(@NonNull C0451a c0451a) {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < c0451a.mOps.size(); i9++) {
            Fragment fragment = c0451a.mOps.get(i9).b;
            if (fragment != null && c0451a.mAddToBackStack) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public int getActiveFragmentCount() {
        return this.mFragmentStore.b.size();
    }

    @NonNull
    public List<Fragment> getActiveFragments() {
        return this.mFragmentStore.e();
    }

    @NonNull
    public InterfaceC0458d0 getBackStackEntryAt(int i9) {
        if (i9 == this.mBackStack.size()) {
            C0451a c0451a = this.mTransitioningOp;
            if (c0451a != null) {
                return c0451a;
            }
            throw new IndexOutOfBoundsException();
        }
        return this.mBackStack.get(i9);
    }

    public int getBackStackEntryCount() {
        int i9;
        int size = this.mBackStack.size();
        if (this.mTransitioningOp != null) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        return size + i9;
    }

    @NonNull
    public N getContainer() {
        return this.mContainer;
    }

    @Nullable
    public Fragment getFragment(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment findActiveFragment = findActiveFragment(string);
        if (findActiveFragment == null) {
            throwException(new IllegalStateException(AbstractC2914a.k("Fragment no longer exists for key ", str, ": unique id ", string)));
        }
        return findActiveFragment;
    }

    @NonNull
    public P getFragmentFactory() {
        P p2 = this.mFragmentFactory;
        if (p2 != null) {
            return p2;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this.mHostFragmentFactory;
    }

    @NonNull
    public x0 getFragmentStore() {
        return this.mFragmentStore;
    }

    @NonNull
    public List<Fragment> getFragments() {
        return this.mFragmentStore.f();
    }

    @NonNull
    public Q getHost() {
        return this.mHost;
    }

    @NonNull
    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    @NonNull
    public V getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    @Nullable
    public Fragment getParent() {
        return this.mParent;
    }

    @Nullable
    public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    @NonNull
    public N0 getSpecialEffectsControllerFactory() {
        N0 n02 = this.mSpecialEffectsControllerFactory;
        if (n02 != null) {
            return n02;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getSpecialEffectsControllerFactory();
        }
        return this.mDefaultSpecialEffectsControllerFactory;
    }

    @Nullable
    public C2491c getStrictModePolicy() {
        return this.mStrictModePolicy;
    }

    @NonNull
    public androidx.lifecycle.f0 getViewModelStore(@NonNull Fragment fragment) {
        HashMap hashMap = this.mNonConfig.f4777d;
        androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) hashMap.get(fragment.mWho);
        if (f0Var == null) {
            androidx.lifecycle.f0 f0Var2 = new androidx.lifecycle.f0();
            hashMap.put(fragment.mWho, f0Var2);
            return f0Var2;
        }
        return f0Var;
    }

    public void handleOnBackPressed() {
        execPendingActions(true);
        if (USE_PREDICTIVE_BACK && this.mTransitioningOp != null) {
            if (!this.mBackStackChangeListeners.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(fragmentsFromRecord(this.mTransitioningOp));
                Iterator<InterfaceC0470j0> it = this.mBackStackChangeListeners.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.foundation.entity.o.v(it.next());
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
            Iterator<y0> it3 = this.mTransitioningOp.mOps.iterator();
            while (it3.hasNext()) {
                Fragment fragment = it3.next().b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            for (r rVar : collectChangedControllers(new ArrayList<>(Collections.singletonList(this.mTransitioningOp)), 0, 1)) {
                rVar.getClass();
                if (isLoggingEnabled(3)) {
                    Log.d(TAG, "SpecialEffectsController: Completing Back ");
                }
                ArrayList arrayList = rVar.f4772c;
                rVar.p(arrayList);
                rVar.c(arrayList);
            }
            Iterator<y0> it4 = this.mTransitioningOp.mOps.iterator();
            while (it4.hasNext()) {
                Fragment fragment2 = it4.next().b;
                if (fragment2 != null && fragment2.mContainer == null) {
                    createOrGetFragmentStateManager(fragment2).k();
                }
            }
            this.mTransitioningOp = null;
            updateOnBackPressedCallbackEnabled();
            if (isLoggingEnabled(3)) {
                Log.d(TAG, "Op is being set to null");
                Log.d(TAG, "OnBackPressedCallback enabled=" + this.mOnBackPressedCallback.f20226a + " for  FragmentManager " + this);
                return;
            }
            return;
        }
        if (this.mOnBackPressedCallback.f20226a) {
            if (isLoggingEnabled(3)) {
                Log.d(TAG, "Calling popBackStackImmediate via onBackPressed callback");
            }
            popBackStackImmediate();
        } else {
            if (isLoggingEnabled(3)) {
                Log.d(TAG, "Calling onBackPressed via onBackPressed callback");
            }
            this.mOnBackPressedDispatcher.d();
        }
    }

    public void hideFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            setVisibleRemovingFragment(fragment);
        }
    }

    public void invalidateMenuForFragment(@NonNull Fragment fragment) {
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public boolean isParentHidden(@Nullable Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public boolean isParentMenuVisible(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean isPrimaryNavigation(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && isPrimaryNavigation(fragmentManager.mParent)) {
            return true;
        }
        return false;
    }

    public boolean isStateAtLeast(int i9) {
        if (this.mCurState >= i9) {
            return true;
        }
        return false;
    }

    public boolean isStateSaved() {
        if (!this.mStateSaved && !this.mStopped) {
            return false;
        }
        return true;
    }

    public void launchRequestPermissions(@NonNull Fragment fragment, @NonNull String[] strArr, int i9) {
        if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new C0466h0(fragment.mWho, i9));
            this.mRequestPermissions.a(strArr);
        } else {
            this.mHost.getClass();
            G7.j.e(fragment, "fragment");
            G7.j.e(strArr, "permissions");
        }
    }

    public void launchStartActivityForResult(@NonNull Fragment fragment, @NonNull Intent intent, int i9, @Nullable Bundle bundle) {
        if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new C0466h0(fragment.mWho, i9));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.mStartActivityForResult.a(intent);
            return;
        }
        this.mHost.d(fragment, intent, i9, bundle);
    }

    public void launchStartIntentSenderForResult(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i9, @Nullable Intent intent, int i10, int i11, int i12, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mStartIntentSenderForResult != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
                } else {
                    intent2 = intent;
                }
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            G7.j.e(intentSender, "intentSender");
            h.k kVar = new h.k(intentSender, intent2, i10, i11);
            this.mLaunchedFragments.addLast(new C0466h0(fragment.mWho, i9));
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.mStartIntentSenderForResult.a(kVar);
            return;
        }
        Q q9 = this.mHost;
        q9.getClass();
        G7.j.e(fragment, "fragment");
        G7.j.e(intentSender, "intent");
        if (i9 == -1) {
            Activity activity = q9.b;
            if (activity != null) {
                activity.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
    }

    public void moveToState(int i9, boolean z8) {
        HashMap hashMap;
        Q q9;
        if (this.mHost == null && i9 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z8 && i9 == this.mCurState) {
            return;
        }
        this.mCurState = i9;
        x0 x0Var = this.mFragmentStore;
        Iterator it = x0Var.f4801a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = x0Var.b;
            if (!hasNext) {
                break;
            }
            w0 w0Var = (w0) hashMap.get(((Fragment) it.next()).mWho);
            if (w0Var != null) {
                w0Var.k();
            }
        }
        for (w0 w0Var2 : hashMap.values()) {
            if (w0Var2 != null) {
                w0Var2.k();
                Fragment fragment = w0Var2.f4797c;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    if (fragment.mBeingSaved && !x0Var.f4802c.containsKey(fragment.mWho)) {
                        x0Var.i(w0Var2.n(), fragment.mWho);
                    }
                    x0Var.h(w0Var2);
                }
            }
        }
        startPendingDeferredFragments();
        if (this.mNeedMenuInvalidate && (q9 = this.mHost) != null && this.mCurState == 7) {
            ((K) q9).f4663g.invalidateMenu();
            this.mNeedMenuInvalidate = false;
        }
    }

    public void noteStateNotSaved() {
        if (this.mHost == null) {
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f4781h = false;
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void onContainerAvailable(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        Iterator it = this.mFragmentStore.d().iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            Fragment fragment = w0Var.f4797c;
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                w0Var.b();
                w0Var.k();
            }
        }
    }

    @NonNull
    @Deprecated
    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public void performPendingDeferredStart(@NonNull w0 w0Var) {
        Fragment fragment = w0Var.f4797c;
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
            } else {
                fragment.mDeferStart = false;
                w0Var.k();
            }
        }
    }

    public void popBackStack() {
        enqueueAction(new C0474l0(this, null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return popBackStackImmediate(null, -1, 0);
    }

    public boolean popBackStackState(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i9, int i10) {
        boolean z8;
        if ((i10 & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int findBackStackIndex = findBackStackIndex(str, i9, z8);
        if (findBackStackIndex < 0) {
            return false;
        }
        for (int size = this.mBackStack.size() - 1; size >= findBackStackIndex; size--) {
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean prepareBackStackState(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        C0451a c0451a = (C0451a) com.mbridge.msdk.foundation.entity.o.g(this.mBackStack, 1);
        this.mTransitioningOp = c0451a;
        Iterator<y0> it = c0451a.mOps.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().b;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return popBackStackState(arrayList, arrayList2, null, -1, 0);
    }

    public void prepareBackStackTransition() {
        enqueueAction(new C0476m0(this), false);
    }

    public void putFragment(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException(Q7.n0.i("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void registerFragmentLifecycleCallbacks(@NonNull AbstractC0464g0 abstractC0464g0, boolean z8) {
        V v6 = this.mLifecycleCallbacksDispatcher;
        v6.getClass();
        G7.j.e(abstractC0464g0, "cb");
        v6.b.add(new U(abstractC0464g0, z8));
    }

    public void removeFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z8 = !fragment.isInBackStack();
        if (!fragment.mDetached || z8) {
            x0 x0Var = this.mFragmentStore;
            synchronized (x0Var.f4801a) {
                x0Var.f4801a.remove(fragment);
            }
            fragment.mAdded = false;
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            setVisibleRemovingFragment(fragment);
        }
    }

    public void removeFragmentOnAttachListener(@NonNull s0 s0Var) {
        this.mOnAttachListeners.remove(s0Var);
    }

    public void removeOnBackStackChangedListener(@NonNull InterfaceC0470j0 interfaceC0470j0) {
        this.mBackStackChangeListeners.remove(interfaceC0470j0);
    }

    public void removeRetainedFragment(@NonNull Fragment fragment) {
        this.mNonConfig.j(fragment);
    }

    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable C0480o0 c0480o0) {
        if (this.mHost instanceof androidx.lifecycle.g0) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.k(c0480o0);
        restoreSaveStateInternal(parcelable);
    }

    public void restoreBackStack(@NonNull String str) {
        enqueueAction(new C0460e0(this, str, 1), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0117, code lost:
    
        r1.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean restoreBackStackState(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.C0451a> r11, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r12, @androidx.annotation.NonNull java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.restoreBackStackState(java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    public void restoreSaveState(@Nullable Parcelable parcelable) {
        if (this.mHost instanceof G0.g) {
            throwException(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        restoreSaveStateInternal(parcelable);
    }

    public void restoreSaveStateInternal(@Nullable Parcelable parcelable) {
        w0 w0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(RESULT_KEY_PREFIX) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.mHost.f4683c.getClassLoader());
                this.mResults.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(FRAGMENT_KEY_PREFIX) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.mHost.f4683c.getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        HashMap hashMap2 = this.mFragmentStore.f4802c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        p0 p0Var = (p0) bundle3.getParcelable(FRAGMENT_MANAGER_STATE_KEY);
        if (p0Var == null) {
            return;
        }
        this.mFragmentStore.b.clear();
        Iterator it = p0Var.b.iterator();
        while (it.hasNext()) {
            Bundle i9 = this.mFragmentStore.i(null, (String) it.next());
            if (i9 != null) {
                Fragment fragment = (Fragment) this.mNonConfig.b.get(((u0) i9.getParcelable(FRAGMENT_MANAGER_STATE_KEY)).f4783c);
                if (fragment != null) {
                    if (isLoggingEnabled(2)) {
                        Log.v(TAG, "restoreSaveState: re-attaching retained " + fragment);
                    }
                    w0Var = new w0(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment, i9);
                } else {
                    w0Var = new w0(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.f4683c.getClassLoader(), getFragmentFactory(), i9);
                }
                Fragment fragment2 = w0Var.f4797c;
                fragment2.mSavedFragmentState = i9;
                fragment2.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                w0Var.l(this.mHost.f4683c.getClassLoader());
                this.mFragmentStore.g(w0Var);
                w0Var.f4799e = this.mCurState;
            }
        }
        r0 r0Var = this.mNonConfig;
        r0Var.getClass();
        Iterator it2 = new ArrayList(r0Var.b.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (this.mFragmentStore.b.get(fragment3.mWho) == null) {
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + p0Var.b);
                }
                this.mNonConfig.j(fragment3);
                fragment3.mFragmentManager = this;
                w0 w0Var2 = new w0(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment3);
                w0Var2.f4799e = 1;
                w0Var2.k();
                fragment3.mRemoving = true;
                w0Var2.k();
            }
        }
        x0 x0Var = this.mFragmentStore;
        ArrayList<String> arrayList = p0Var.f4761c;
        x0Var.f4801a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b = x0Var.b(str3);
                if (b != null) {
                    if (isLoggingEnabled(2)) {
                        Log.v(TAG, "restoreSaveState: added (" + str3 + "): " + b);
                    }
                    x0Var.a(b);
                } else {
                    throw new IllegalStateException(AbstractC2914a.e("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (p0Var.f4762d != null) {
            this.mBackStack = new ArrayList<>(p0Var.f4762d.length);
            int i10 = 0;
            while (true) {
                C0453b[] c0453bArr = p0Var.f4762d;
                if (i10 >= c0453bArr.length) {
                    break;
                }
                C0453b c0453b = c0453bArr[i10];
                c0453b.getClass();
                C0451a c0451a = new C0451a(this);
                c0453b.a(c0451a);
                c0451a.f4694c = c0453b.f4701i;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = c0453b.f4696c;
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i11);
                    if (str4 != null) {
                        c0451a.mOps.get(i11).b = findActiveFragment(str4);
                    }
                    i11++;
                }
                c0451a.b(1);
                if (isLoggingEnabled(2)) {
                    StringBuilder p2 = Q7.n0.p(i10, "restoreAllState: back stack #", " (index ");
                    p2.append(c0451a.f4694c);
                    p2.append("): ");
                    p2.append(c0451a);
                    Log.v(TAG, p2.toString());
                    PrintWriter printWriter = new PrintWriter(new I0());
                    c0451a.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(c0451a);
                i10++;
            }
        } else {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStackIndex.set(p0Var.f4763f);
        String str5 = p0Var.f4764g;
        if (str5 != null) {
            Fragment findActiveFragment = findActiveFragment(str5);
            this.mPrimaryNav = findActiveFragment;
            dispatchParentPrimaryNavigationFragmentChanged(findActiveFragment);
        }
        ArrayList arrayList3 = p0Var.f4765h;
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                this.mBackStackStates.put((String) arrayList3.get(i12), (C0455c) p0Var.f4766i.get(i12));
            }
        }
        this.mLaunchedFragments = new ArrayDeque<>(p0Var.f4767j);
    }

    @Deprecated
    public C0480o0 retainNonConfig() {
        if (this.mHost instanceof androidx.lifecycle.g0) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.i();
    }

    public Parcelable saveAllState() {
        if (this.mHost instanceof G0.g) {
            throwException(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle lambda$attachController$5 = lambda$attachController$5();
        if (lambda$attachController$5.isEmpty()) {
            return null;
        }
        return lambda$attachController$5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.os.Parcelable, java.lang.Object, androidx.fragment.app.p0] */
    @NonNull
    /* renamed from: saveAllStateInternal */
    public Bundle lambda$attachController$5() {
        ArrayList arrayList;
        C0453b[] c0453bArr;
        Bundle bundle = new Bundle();
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.f4781h = true;
        x0 x0Var = this.mFragmentStore;
        x0Var.getClass();
        HashMap hashMap = x0Var.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (w0 w0Var : hashMap.values()) {
            if (w0Var != null) {
                Fragment fragment = w0Var.f4797c;
                x0Var.i(w0Var.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.mFragmentStore.f4802c;
        if (hashMap2.isEmpty()) {
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "saveAllState: no fragments!");
            }
        } else {
            x0 x0Var2 = this.mFragmentStore;
            synchronized (x0Var2.f4801a) {
                try {
                    if (x0Var2.f4801a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(x0Var2.f4801a.size());
                        Iterator it = x0Var2.f4801a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = (Fragment) it.next();
                            arrayList.add(fragment2.mWho);
                            if (isLoggingEnabled(2)) {
                                Log.v(TAG, "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.mBackStack.size();
            if (size > 0) {
                c0453bArr = new C0453b[size];
                for (int i9 = 0; i9 < size; i9++) {
                    c0453bArr[i9] = new C0453b(this.mBackStack.get(i9));
                    if (isLoggingEnabled(2)) {
                        StringBuilder p2 = Q7.n0.p(i9, "saveAllState: adding back stack #", ": ");
                        p2.append(this.mBackStack.get(i9));
                        Log.v(TAG, p2.toString());
                    }
                }
            } else {
                c0453bArr = null;
            }
            ?? obj = new Object();
            obj.f4764g = null;
            ArrayList arrayList3 = new ArrayList();
            obj.f4765h = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.f4766i = arrayList4;
            obj.b = arrayList2;
            obj.f4761c = arrayList;
            obj.f4762d = c0453bArr;
            obj.f4763f = this.mBackStackIndex.get();
            Fragment fragment3 = this.mPrimaryNav;
            if (fragment3 != null) {
                obj.f4764g = fragment3.mWho;
            }
            arrayList3.addAll(this.mBackStackStates.keySet());
            arrayList4.addAll(this.mBackStackStates.values());
            obj.f4767j = new ArrayList(this.mLaunchedFragments);
            bundle.putParcelable(FRAGMENT_MANAGER_STATE_KEY, obj);
            for (String str : this.mResults.keySet()) {
                bundle.putBundle(AbstractC2914a.d(RESULT_KEY_PREFIX, str), this.mResults.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(AbstractC2914a.d(FRAGMENT_KEY_PREFIX, str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public void saveBackStack(@NonNull String str) {
        enqueueAction(new C0460e0(this, str, 2), false);
    }

    public boolean saveBackStackState(@NonNull ArrayList<C0451a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        int i9;
        int i10;
        String str2;
        String str3;
        int i11;
        int findBackStackIndex = findBackStackIndex(str, -1, true);
        if (findBackStackIndex < 0) {
            return false;
        }
        for (int i12 = findBackStackIndex; i12 < this.mBackStack.size(); i12++) {
            C0451a c0451a = this.mBackStack.get(i12);
            if (!c0451a.mReorderingAllowed) {
                throwException(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0451a + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        int i13 = findBackStackIndex;
        while (true) {
            i9 = 8;
            if (i13 >= this.mBackStack.size()) {
                break;
            }
            C0451a c0451a2 = this.mBackStack.get(i13);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<y0> it = c0451a2.mOps.iterator();
            while (it.hasNext()) {
                y0 next = it.next();
                Fragment fragment = next.b;
                if (fragment != null) {
                    if (!next.f4806c || (i11 = next.f4805a) == 1 || i11 == 2 || i11 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i14 = next.f4805a;
                    if (i14 == 1 || i14 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = " " + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                n2.append(str3);
                n2.append(" in ");
                n2.append(c0451a2);
                n2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                throwException(new IllegalArgumentException(n2.toString()));
            }
            i13++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder n9 = com.mbridge.msdk.foundation.entity.o.n("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                n9.append(str2);
                n9.append("fragment ");
                n9.append(fragment2);
                throwException(new IllegalArgumentException(n9.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.getActiveFragments()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.mBackStack.size() - findBackStackIndex);
        for (int i15 = findBackStackIndex; i15 < this.mBackStack.size(); i15++) {
            arrayList4.add(null);
        }
        C0455c c0455c = new C0455c(arrayList3, arrayList4);
        int size = this.mBackStack.size() - 1;
        while (size >= findBackStackIndex) {
            C0451a remove = this.mBackStack.remove(size);
            C0451a c0451a3 = new C0451a(remove);
            int size2 = c0451a3.mOps.size() - 1;
            while (size2 >= 0) {
                y0 y0Var = c0451a3.mOps.get(size2);
                if (!y0Var.f4806c) {
                    i10 = -1;
                } else {
                    if (y0Var.f4805a == i9) {
                        y0Var.f4806c = false;
                        c0451a3.mOps.remove(size2 - 1);
                        size2--;
                    } else {
                        int i16 = y0Var.b.mContainerId;
                        y0Var.f4805a = 2;
                        y0Var.f4806c = false;
                        for (int i17 = size2 - 1; i17 >= 0; i17--) {
                            y0 y0Var2 = c0451a3.mOps.get(i17);
                            if (y0Var2.f4806c && y0Var2.b.mContainerId == i16) {
                                c0451a3.mOps.remove(i17);
                                size2--;
                            }
                        }
                    }
                    i10 = -1;
                }
                size2 += i10;
                i9 = 8;
            }
            arrayList4.set(size - findBackStackIndex, new C0453b(c0451a3));
            remove.f4695d = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
            size--;
            i9 = 8;
        }
        this.mBackStackStates.put(str, c0455c);
        return true;
    }

    @Nullable
    public G saveFragmentInstanceState(@NonNull Fragment fragment) {
        x0 x0Var = this.mFragmentStore;
        w0 w0Var = (w0) x0Var.b.get(fragment.mWho);
        if (w0Var == null || !w0Var.f4797c.equals(fragment)) {
            throwException(new IllegalStateException(Q7.n0.i("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        if (w0Var.f4797c.mState > -1) {
            return new G(w0Var.n());
        }
        return null;
    }

    public void scheduleCommit() {
        synchronized (this.mPendingActions) {
            try {
                if (this.mPendingActions.size() == 1) {
                    this.mHost.f4684d.removeCallbacks(this.mExecCommit);
                    this.mHost.f4684d.post(this.mExecCommit);
                    updateOnBackPressedCallbackEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setExitAnimationOrder(@NonNull Fragment fragment, boolean z8) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && (fragmentContainer instanceof FragmentContainerView)) {
            ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z8);
        }
    }

    public void setFragmentFactory(@NonNull P p2) {
        this.mFragmentFactory = p2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setFragmentResult(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.i0> r0 = r3.mResultListeners
            java.lang.Object r0 = r0.get(r4)
            androidx.fragment.app.i0 r0 = (androidx.fragment.app.C0468i0) r0
            if (r0 == 0) goto L1c
            androidx.lifecycle.n r1 = androidx.lifecycle.EnumC0504n.f4894f
            androidx.lifecycle.o r2 = r0.f4728a
            androidx.lifecycle.x r2 = (androidx.lifecycle.C0513x) r2
            androidx.lifecycle.n r2 = r2.f4904d
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L1c
            r0.a(r5, r4)
            goto L21
        L1c:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r3.mResults
            r0.put(r4, r5)
        L21:
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Setting fragment result with key "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " and result "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.setFragmentResult(java.lang.String, android.os.Bundle):void");
    }

    public final void setFragmentResultListener(@NonNull String str, @NonNull InterfaceC0511v interfaceC0511v, @NonNull t0 t0Var) {
        AbstractC0505o lifecycle = interfaceC0511v.getLifecycle();
        if (((C0513x) lifecycle).f4904d == EnumC0504n.b) {
            return;
        }
        C0454b0 c0454b0 = new C0454b0(this, str, t0Var, lifecycle);
        C0468i0 put = this.mResultListeners.put(str, new C0468i0(lifecycle, t0Var, c0454b0));
        if (put != null) {
            put.f4728a.b(put.f4729c);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + t0Var);
        }
        lifecycle.a(c0454b0);
    }

    public void setMaxLifecycle(@NonNull Fragment fragment, @NonNull EnumC0504n enumC0504n) {
        if (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = enumC0504n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        if (fragment != null && (!fragment.equals(findActiveFragment(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.mPrimaryNav;
        this.mPrimaryNav = fragment;
        dispatchParentPrimaryNavigationFragmentChanged(fragment2);
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void setSpecialEffectsControllerFactory(@NonNull N0 n02) {
        this.mSpecialEffectsControllerFactory = n02;
    }

    public void setStrictModePolicy(@Nullable C2491c c2491c) {
        this.mStrictModePolicy = c2491c;
    }

    public void showFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            Q q9 = this.mHost;
            if (q9 != null) {
                sb.append(q9.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0.b.remove(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void unregisterFragmentLifecycleCallbacks(@androidx.annotation.NonNull androidx.fragment.app.AbstractC0464g0 r6) {
        /*
            r5 = this;
            androidx.fragment.app.V r0 = r5.mLifecycleCallbacksDispatcher
            r0.getClass()
            java.lang.String r1 = "cb"
            G7.j.e(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.b
            monitor-enter(r1)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.b     // Catch: java.lang.Throwable -> L28
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L28
            r3 = 0
        L14:
            if (r3 >= r2) goto L2d
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L28
            androidx.fragment.app.U r4 = (androidx.fragment.app.U) r4     // Catch: java.lang.Throwable -> L28
            androidx.fragment.app.g0 r4 = r4.f4687a     // Catch: java.lang.Throwable -> L28
            if (r4 != r6) goto L2a
            java.util.concurrent.CopyOnWriteArrayList r6 = r0.b     // Catch: java.lang.Throwable -> L28
            r6.remove(r3)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r6 = move-exception
            goto L2f
        L2a:
            int r3 = r3 + 1
            goto L14
        L2d:
            monitor-exit(r1)
            return
        L2f:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.unregisterFragmentLifecycleCallbacks(androidx.fragment.app.g0):void");
    }

    public void popBackStack(@Nullable String str, int i9) {
        enqueueAction(new C0474l0(this, str, -1, i9), false);
    }

    public boolean popBackStackImmediate(@Nullable String str, int i9) {
        return popBackStackImmediate(str, -1, i9);
    }

    public void popBackStack(int i9, int i10) {
        popBackStack(i9, i10, false);
    }

    public boolean popBackStackImmediate(int i9, int i10) {
        if (i9 >= 0) {
            return popBackStackImmediate(null, i9, i10);
        }
        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Bad id: "));
    }

    public void popBackStack(int i9, int i10, boolean z8) {
        if (i9 >= 0) {
            enqueueAction(new C0474l0(this, null, i9, i10), z8);
            return;
        }
        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Bad id: "));
    }

    private boolean popBackStackImmediate(@Nullable String str, int i9, int i10) {
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i9 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i9, i10);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.b.values().removeAll(Collections.singleton(null));
        return popBackStackState;
    }
}
