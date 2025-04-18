package androidx.fragment.app;

import android.annotation.SuppressLint;
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
import com.plantcare.ai.identifier.plantid.R;
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
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

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
    ArrayList<a> mBackStack;
    private ArrayList<z0> mBackStackChangeListeners;
    private f0 mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    private f2 mDefaultSpecialEffectsControllerFactory;
    private boolean mDestroyed;
    private Runnable mExecCommit;
    private boolean mExecutingActions;
    private boolean mHavePendingDeferredStart;
    private i0 mHost;
    private boolean mNeedMenuInvalidate;
    private g1 mNonConfig;
    private androidx.activity.z mOnBackPressedDispatcher;
    private final m0.a mOnConfigurationChangedListener;
    private final m0.a mOnMultiWindowModeChangedListener;
    private final m0.a mOnPictureInPictureModeChangedListener;
    private final m0.a mOnTrimMemoryListener;
    private Fragment mParent;

    @Nullable
    Fragment mPrimaryNav;
    private androidx.activity.result.c mRequestPermissions;
    private androidx.activity.result.c mStartActivityForResult;
    private androidx.activity.result.c mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private h1.b mStrictModePolicy;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<a> mTmpRecords;
    private final ArrayList<a1> mPendingActions = new ArrayList<>();
    private final l1 mFragmentStore = new l1();
    private final k0 mLayoutInflaterFactory = new k0(this);
    private final androidx.activity.q mOnBackPressedCallback = new p0(this);
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    private final Map<String, c> mBackStackStates = a4.j.r();
    private final Map<String, Bundle> mResults = a4.j.r();
    private final Map<String, y0> mResultListeners = a4.j.r();
    private final m0 mLifecycleCallbacksDispatcher = new m0(this);
    private final CopyOnWriteArrayList<h1> mOnAttachListeners = new CopyOnWriteArrayList<>();
    private final n0.s mMenuProvider = new q0(this);
    int mCurState = -1;
    private h0 mFragmentFactory = null;
    private h0 mHostFragmentFactory = new r0(this);
    private f2 mSpecialEffectsControllerFactory = null;
    ArrayDeque<x0> mLaunchedFragments = new ArrayDeque<>();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements androidx.lifecycle.t {

        /* renamed from: b */
        public final /* synthetic */ String f1558b;

        /* renamed from: c */
        public final /* synthetic */ i1 f1559c;

        /* renamed from: d */
        public final /* synthetic */ androidx.lifecycle.p f1560d;

        public AnonymousClass6(String str, i1 i1Var, androidx.lifecycle.p pVar) {
            r2 = str;
            r3 = i1Var;
            r4 = pVar;
        }

        @Override // androidx.lifecycle.t
        public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
            Bundle bundle;
            androidx.lifecycle.n nVar2 = androidx.lifecycle.n.ON_START;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = r2;
            if (nVar == nVar2 && (bundle = (Bundle) fragmentManager.mResults.get(str)) != null) {
                ((y0) r3).a(bundle, str);
                fragmentManager.clearFragmentResult(str);
            }
            if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                r4.b(this);
                fragmentManager.mResultListeners.remove(str);
            }
        }
    }

    public FragmentManager() {
        final int i10 = 0;
        this.mOnConfigurationChangedListener = new m0.a(this) { // from class: androidx.fragment.app.n0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f1696b;

            {
                this.f1696b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                int i11 = i10;
                FragmentManager fragmentManager = this.f1696b;
                switch (i11) {
                    case 0:
                        fragmentManager.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        fragmentManager.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        fragmentManager.lambda$new$2((androidx.core.app.r) obj);
                        return;
                    default:
                        fragmentManager.lambda$new$3((androidx.core.app.u1) obj);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.mOnTrimMemoryListener = new m0.a(this) { // from class: androidx.fragment.app.n0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f1696b;

            {
                this.f1696b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                int i112 = i11;
                FragmentManager fragmentManager = this.f1696b;
                switch (i112) {
                    case 0:
                        fragmentManager.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        fragmentManager.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        fragmentManager.lambda$new$2((androidx.core.app.r) obj);
                        return;
                    default:
                        fragmentManager.lambda$new$3((androidx.core.app.u1) obj);
                        return;
                }
            }
        };
        final int i12 = 2;
        this.mOnMultiWindowModeChangedListener = new m0.a(this) { // from class: androidx.fragment.app.n0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f1696b;

            {
                this.f1696b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                int i112 = i12;
                FragmentManager fragmentManager = this.f1696b;
                switch (i112) {
                    case 0:
                        fragmentManager.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        fragmentManager.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        fragmentManager.lambda$new$2((androidx.core.app.r) obj);
                        return;
                    default:
                        fragmentManager.lambda$new$3((androidx.core.app.u1) obj);
                        return;
                }
            }
        };
        final int i13 = 3;
        this.mOnPictureInPictureModeChangedListener = new m0.a(this) { // from class: androidx.fragment.app.n0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f1696b;

            {
                this.f1696b = this;
            }

            @Override // m0.a
            public final void accept(Object obj) {
                int i112 = i13;
                FragmentManager fragmentManager = this.f1696b;
                switch (i112) {
                    case 0:
                        fragmentManager.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        fragmentManager.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        fragmentManager.lambda$new$2((androidx.core.app.r) obj);
                        return;
                    default:
                        fragmentManager.lambda$new$3((androidx.core.app.u1) obj);
                        return;
                }
            }
        };
        this.mDefaultSpecialEffectsControllerFactory = new o0(this, i13);
        this.mExecCommit = new m(this, i11);
    }

    public static /* synthetic */ l1 access$200(FragmentManager fragmentManager) {
        return fragmentManager.mFragmentStore;
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
        boolean z10;
        i0 i0Var = this.mHost;
        if (i0Var instanceof androidx.lifecycle.e1) {
            z10 = this.mFragmentStore.f1683d.f1640e;
        } else {
            Context context = i0Var.f1648c;
            z10 = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
        }
        if (z10) {
            Iterator<c> it = this.mBackStackStates.values().iterator();
            while (it.hasNext()) {
                for (String str : it.next().f1592b) {
                    g1 g1Var = this.mFragmentStore.f1683d;
                    g1Var.getClass();
                    if (isLoggingEnabled(3)) {
                        Log.d(TAG, "Clearing non-config state for saved state of Fragment " + str);
                    }
                    g1Var.c(str);
                }
            }
        }
    }

    private Set<e2> collectAllSpecialEffectsController() {
        HashSet hashSet = new HashSet();
        Iterator it = this.mFragmentStore.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((k1) it.next()).f1677c.mContainer;
            if (viewGroup != null) {
                hashSet.add(ka.e.k(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    private Set<e2> collectChangedControllers(@NonNull ArrayList<a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<m1> it = arrayList.get(i10).mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f1687b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(e2.j(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(@Nullable Fragment fragment) {
        if (fragment != null && fragment.equals(findActiveFragment(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private void dispatchStateChange(int i10) {
        try {
            this.mExecutingActions = true;
            for (k1 k1Var : this.mFragmentStore.f1681b.values()) {
                if (k1Var != null) {
                    k1Var.f1679e = i10;
                }
            }
            moveToState(i10, false);
            Iterator<e2> it = collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th2) {
            this.mExecutingActions = false;
            throw th2;
        }
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    @Deprecated
    public static void enableDebugLogging(boolean z10) {
        DEBUG = z10;
    }

    private void endAnimatingAwayFragments() {
        Iterator<e2> it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    private void ensureExecReady(boolean z10) {
        if (!this.mExecutingActions) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.mHost.f1649d.getLooper()) {
                if (!z10) {
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

    private static void executeOps(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.b(-1);
                for (int size = aVar.mOps.size() - 1; size >= 0; size--) {
                    m1 m1Var = aVar.mOps.get(size);
                    Fragment fragment = m1Var.f1687b;
                    if (fragment != null) {
                        fragment.mBeingSaved = aVar.f1564d;
                        fragment.setPopDirection(true);
                        fragment.setNextTransition(reverseTransit(aVar.mTransition));
                        fragment.setSharedElementNames(aVar.mSharedElementTargetNames, aVar.mSharedElementSourceNames);
                    }
                    int i12 = m1Var.a;
                    FragmentManager fragmentManager = aVar.a;
                    switch (i12) {
                        case 1:
                            fragment.setAnimations(m1Var.f1689d, m1Var.f1690e, m1Var.f1691f, m1Var.f1692g);
                            fragmentManager.setExitAnimationOrder(fragment, true);
                            fragmentManager.removeFragment(fragment);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + m1Var.a);
                        case 3:
                            fragment.setAnimations(m1Var.f1689d, m1Var.f1690e, m1Var.f1691f, m1Var.f1692g);
                            fragmentManager.addFragment(fragment);
                            break;
                        case 4:
                            fragment.setAnimations(m1Var.f1689d, m1Var.f1690e, m1Var.f1691f, m1Var.f1692g);
                            fragmentManager.showFragment(fragment);
                            break;
                        case 5:
                            fragment.setAnimations(m1Var.f1689d, m1Var.f1690e, m1Var.f1691f, m1Var.f1692g);
                            fragmentManager.setExitAnimationOrder(fragment, true);
                            fragmentManager.hideFragment(fragment);
                            break;
                        case 6:
                            fragment.setAnimations(m1Var.f1689d, m1Var.f1690e, m1Var.f1691f, m1Var.f1692g);
                            fragmentManager.attachFragment(fragment);
                            break;
                        case 7:
                            fragment.setAnimations(m1Var.f1689d, m1Var.f1690e, m1Var.f1691f, m1Var.f1692g);
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
                            fragmentManager.setMaxLifecycle(fragment, m1Var.f1693h);
                            break;
                    }
                }
            } else {
                aVar.b(1);
                int size2 = aVar.mOps.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    m1 m1Var2 = aVar.mOps.get(i13);
                    Fragment fragment2 = m1Var2.f1687b;
                    if (fragment2 != null) {
                        fragment2.mBeingSaved = aVar.f1564d;
                        fragment2.setPopDirection(false);
                        fragment2.setNextTransition(aVar.mTransition);
                        fragment2.setSharedElementNames(aVar.mSharedElementSourceNames, aVar.mSharedElementTargetNames);
                    }
                    int i14 = m1Var2.a;
                    FragmentManager fragmentManager2 = aVar.a;
                    switch (i14) {
                        case 1:
                            fragment2.setAnimations(m1Var2.f1689d, m1Var2.f1690e, m1Var2.f1691f, m1Var2.f1692g);
                            fragmentManager2.setExitAnimationOrder(fragment2, false);
                            fragmentManager2.addFragment(fragment2);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException("Unknown cmd: " + m1Var2.a);
                        case 3:
                            fragment2.setAnimations(m1Var2.f1689d, m1Var2.f1690e, m1Var2.f1691f, m1Var2.f1692g);
                            fragmentManager2.removeFragment(fragment2);
                            break;
                        case 4:
                            fragment2.setAnimations(m1Var2.f1689d, m1Var2.f1690e, m1Var2.f1691f, m1Var2.f1692g);
                            fragmentManager2.hideFragment(fragment2);
                            break;
                        case 5:
                            fragment2.setAnimations(m1Var2.f1689d, m1Var2.f1690e, m1Var2.f1691f, m1Var2.f1692g);
                            fragmentManager2.setExitAnimationOrder(fragment2, false);
                            fragmentManager2.showFragment(fragment2);
                            break;
                        case 6:
                            fragment2.setAnimations(m1Var2.f1689d, m1Var2.f1690e, m1Var2.f1691f, m1Var2.f1692g);
                            fragmentManager2.detachFragment(fragment2);
                            break;
                        case 7:
                            fragment2.setAnimations(m1Var2.f1689d, m1Var2.f1690e, m1Var2.f1691f, m1Var2.f1692g);
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
                            fragmentManager2.setMaxLifecycle(fragment2, m1Var2.f1694i);
                            break;
                    }
                }
            }
            i10++;
        }
    }

    private void executeOpsTogether(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<z0> arrayList3;
        boolean z10;
        int i12;
        int i13;
        int i14;
        ArrayList<a> arrayList4 = arrayList;
        ArrayList<Boolean> arrayList5 = arrayList2;
        boolean z11 = arrayList4.get(i10).mReorderingAllowed;
        ArrayList<Fragment> arrayList6 = this.mTmpAddedFragments;
        if (arrayList6 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.f());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        int i15 = i10;
        boolean z12 = false;
        while (true) {
            int i16 = 1;
            if (i15 < i11) {
                a aVar = arrayList4.get(i15);
                int i17 = 3;
                if (!arrayList5.get(i15).booleanValue()) {
                    ArrayList<Fragment> arrayList7 = this.mTmpAddedFragments;
                    int i18 = 0;
                    while (i18 < aVar.mOps.size()) {
                        m1 m1Var = aVar.mOps.get(i18);
                        int i19 = m1Var.a;
                        if (i19 != i16) {
                            if (i19 != 2) {
                                if (i19 != i17 && i19 != 6) {
                                    if (i19 != 7) {
                                        if (i19 == 8) {
                                            aVar.mOps.add(i18, new m1(9, primaryNavigationFragment, 0));
                                            m1Var.f1688c = true;
                                            i18++;
                                            primaryNavigationFragment = m1Var.f1687b;
                                        }
                                    } else {
                                        i12 = 1;
                                    }
                                } else {
                                    arrayList7.remove(m1Var.f1687b);
                                    Fragment fragment = m1Var.f1687b;
                                    if (fragment == primaryNavigationFragment) {
                                        aVar.mOps.add(i18, new m1(9, fragment));
                                        i18++;
                                        i12 = 1;
                                        primaryNavigationFragment = null;
                                        i18 += i12;
                                        i16 = i12;
                                        i17 = 3;
                                    }
                                }
                                i12 = 1;
                                i18 += i12;
                                i16 = i12;
                                i17 = 3;
                            } else {
                                Fragment fragment2 = m1Var.f1687b;
                                int i20 = fragment2.mContainerId;
                                int size = arrayList7.size() - 1;
                                boolean z13 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList7.get(size);
                                    if (fragment3.mContainerId == i20) {
                                        if (fragment3 == fragment2) {
                                            i13 = i20;
                                            z13 = true;
                                        } else {
                                            if (fragment3 == primaryNavigationFragment) {
                                                i13 = i20;
                                                i14 = 0;
                                                aVar.mOps.add(i18, new m1(9, fragment3, 0));
                                                i18++;
                                                primaryNavigationFragment = null;
                                            } else {
                                                i13 = i20;
                                                i14 = 0;
                                            }
                                            m1 m1Var2 = new m1(3, fragment3, i14);
                                            m1Var2.f1689d = m1Var.f1689d;
                                            m1Var2.f1691f = m1Var.f1691f;
                                            m1Var2.f1690e = m1Var.f1690e;
                                            m1Var2.f1692g = m1Var.f1692g;
                                            aVar.mOps.add(i18, m1Var2);
                                            arrayList7.remove(fragment3);
                                            i18++;
                                        }
                                    } else {
                                        i13 = i20;
                                    }
                                    size--;
                                    i20 = i13;
                                }
                                if (z13) {
                                    aVar.mOps.remove(i18);
                                    i18--;
                                    i12 = 1;
                                    i18 += i12;
                                    i16 = i12;
                                    i17 = 3;
                                } else {
                                    i12 = 1;
                                    m1Var.a = 1;
                                    m1Var.f1688c = true;
                                    arrayList7.add(fragment2);
                                    i18 += i12;
                                    i16 = i12;
                                    i17 = 3;
                                }
                            }
                        } else {
                            i12 = i16;
                        }
                        arrayList7.add(m1Var.f1687b);
                        i18 += i12;
                        i16 = i12;
                        i17 = 3;
                    }
                    z10 = false;
                } else {
                    int i21 = 1;
                    z10 = false;
                    ArrayList<Fragment> arrayList8 = this.mTmpAddedFragments;
                    int size2 = aVar.mOps.size() - 1;
                    while (size2 >= 0) {
                        m1 m1Var3 = aVar.mOps.get(size2);
                        int i22 = m1Var3.a;
                        if (i22 != i21) {
                            if (i22 != 3) {
                                switch (i22) {
                                    case 8:
                                        primaryNavigationFragment = null;
                                        break;
                                    case 9:
                                        primaryNavigationFragment = m1Var3.f1687b;
                                        break;
                                    case 10:
                                        m1Var3.f1694i = m1Var3.f1693h;
                                        break;
                                }
                                size2--;
                                i21 = 1;
                            }
                            arrayList8.add(m1Var3.f1687b);
                            size2--;
                            i21 = 1;
                        }
                        arrayList8.remove(m1Var3.f1687b);
                        size2--;
                        i21 = 1;
                    }
                }
                if (!z12 && !aVar.mAddToBackStack) {
                    z12 = z10;
                } else {
                    z12 = true;
                }
                i15++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
            } else {
                this.mTmpAddedFragments.clear();
                if (!z11 && this.mCurState >= 1) {
                    for (int i23 = i10; i23 < i11; i23++) {
                        Iterator<m1> it = arrayList.get(i23).mOps.iterator();
                        while (it.hasNext()) {
                            Fragment fragment4 = it.next().f1687b;
                            if (fragment4 != null && fragment4.mFragmentManager != null) {
                                this.mFragmentStore.g(createOrGetFragmentStateManager(fragment4));
                            }
                        }
                    }
                }
                executeOps(arrayList, arrayList2, i10, i11);
                boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
                if (z12 && (arrayList3 = this.mBackStackChangeListeners) != null && !arrayList3.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(fragmentsFromRecord(it2.next()));
                    }
                    Iterator<z0> it3 = this.mBackStackChangeListeners.iterator();
                    while (it3.hasNext()) {
                        a4.j.t(it3.next());
                        Iterator it4 = linkedHashSet.iterator();
                        if (it4.hasNext()) {
                            throw null;
                        }
                    }
                    Iterator<z0> it5 = this.mBackStackChangeListeners.iterator();
                    while (it5.hasNext()) {
                        a4.j.t(it5.next());
                        Iterator it6 = linkedHashSet.iterator();
                        if (it6.hasNext()) {
                            throw null;
                        }
                    }
                }
                for (int i24 = i10; i24 < i11; i24++) {
                    a aVar2 = arrayList.get(i24);
                    if (booleanValue) {
                        for (int size3 = aVar2.mOps.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = aVar2.mOps.get(size3).f1687b;
                            if (fragment5 != null) {
                                createOrGetFragmentStateManager(fragment5).k();
                            }
                        }
                    } else {
                        Iterator<m1> it7 = aVar2.mOps.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = it7.next().f1687b;
                            if (fragment6 != null) {
                                createOrGetFragmentStateManager(fragment6).k();
                            }
                        }
                    }
                }
                moveToState(this.mCurState, true);
                int i25 = i10;
                for (e2 e2Var : collectChangedControllers(arrayList, i25, i11)) {
                    e2Var.f1627d = booleanValue;
                    e2Var.k();
                    e2Var.g();
                }
                while (i25 < i11) {
                    a aVar3 = arrayList.get(i25);
                    if (arrayList2.get(i25).booleanValue() && aVar3.f1563c >= 0) {
                        aVar3.f1563c = -1;
                    }
                    if (aVar3.mCommitRunnables != null) {
                        for (int i26 = 0; i26 < aVar3.mCommitRunnables.size(); i26++) {
                            aVar3.mCommitRunnables.get(i26).run();
                        }
                        aVar3.mCommitRunnables = null;
                    }
                    i25++;
                }
                if (z12) {
                    reportBackStackChanged();
                    return;
                }
                return;
            }
        }
    }

    private int findBackStackIndex(@Nullable String str, int i10, boolean z10) {
        ArrayList<a> arrayList = this.mBackStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.mBackStack.size() - 1;
        }
        int size = this.mBackStack.size() - 1;
        while (size >= 0) {
            a aVar = this.mBackStack.get(size);
            if ((str != null && str.equals(aVar.mName)) || (i10 >= 0 && i10 == aVar.f1563c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z10) {
            while (size > 0) {
                a aVar2 = this.mBackStack.get(size - 1);
                if ((str != null && str.equals(aVar2.mName)) || (i10 >= 0 && i10 == aVar2.f1563c)) {
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
        F f10 = (F) findViewFragment(view);
        if (f10 != null) {
            return f10;
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
        for (e2 e2Var : collectAllSpecialEffectsController()) {
            if (e2Var.f1628e) {
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "SpecialEffectsController: Forcing postponed operations");
                }
                e2Var.f1628e = false;
                e2Var.g();
            }
        }
    }

    private Set<Fragment> fragmentsFromRecord(@NonNull a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.mOps.size(); i10++) {
            Fragment fragment = aVar.mOps.get(i10).f1687b;
            if (fragment != null && aVar.mAddToBackStack) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    private boolean generateOpsForPendingActions(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            try {
                int size = this.mPendingActions.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= this.mPendingActions.get(i10).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.mPendingActions.clear();
                this.mHost.f1649d.removeCallbacks(this.mExecCommit);
            }
        }
    }

    @NonNull
    private g1 getChildNonConfig(@NonNull Fragment fragment) {
        g1 g1Var = this.mNonConfig;
        HashMap hashMap = g1Var.f1637b;
        g1 g1Var2 = (g1) hashMap.get(fragment.mWho);
        if (g1Var2 == null) {
            g1 g1Var3 = new g1(g1Var.f1639d);
            hashMap.put(fragment.mWho, g1Var3);
            return g1Var3;
        }
        return g1Var2;
    }

    private ViewGroup getFragmentContainer(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.c()) {
            View b3 = this.mContainer.b(fragment.mContainerId);
            if (b3 instanceof ViewGroup) {
                return (ViewGroup) b3;
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

    public static boolean isLoggingEnabled(int i10) {
        return DEBUG || Log.isLoggable(TAG, i10);
    }

    private boolean isMenuAvailable(@NonNull Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus();
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

    public void lambda$new$2(androidx.core.app.r rVar) {
        if (isParentAdded()) {
            dispatchMultiWindowModeChanged(rVar.a, false);
        }
    }

    public void lambda$new$3(androidx.core.app.u1 u1Var) {
        if (isParentAdded()) {
            dispatchPictureInPictureModeChanged(u1Var.a, false);
        }
    }

    private void removeRedundantOperationsAndExecute(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).mReorderingAllowed) {
                    if (i11 != i10) {
                        executeOpsTogether(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).mReorderingAllowed) {
                            i11++;
                        }
                    }
                    executeOpsTogether(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                executeOpsTogether(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void reportBackStackChanged() {
        ArrayList<z0> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null && arrayList.size() > 0) {
            a4.j.t(this.mBackStackChangeListeners.get(0));
            throw null;
        }
    }

    public static int reverseTransit(int i10) {
        int i11 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        if (i10 == 4097) {
            return FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
        }
        if (i10 != 8194) {
            i11 = FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
            if (i10 == 8197) {
                return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN;
            }
            if (i10 == 4099) {
                return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
            }
            if (i10 != 4100) {
                return 0;
            }
        }
        return i11;
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
            performPendingDeferredStart((k1) it.next());
        }
    }

    private void throwException(RuntimeException runtimeException) {
        Log.e(TAG, runtimeException.getMessage());
        Log.e(TAG, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new x1());
        i0 i0Var = this.mHost;
        if (i0Var != null) {
            try {
                ((d0) i0Var).f1606g.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e(TAG, "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e10) {
            Log.e(TAG, "Failed dumping state", e10);
            throw runtimeException;
        }
    }

    private void updateOnBackPressedCallbackEnabled() {
        synchronized (this.mPendingActions) {
            try {
                boolean z10 = true;
                if (!this.mPendingActions.isEmpty()) {
                    androidx.activity.q qVar = this.mOnBackPressedCallback;
                    qVar.a = true;
                    Function0 function0 = qVar.f588c;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return;
                }
                androidx.activity.q qVar2 = this.mOnBackPressedCallback;
                if (getBackStackEntryCount() <= 0 || !isPrimaryNavigation(this.mParent)) {
                    z10 = false;
                }
                qVar2.a = z10;
                Function0 function02 = qVar2.f588c;
                if (function02 != null) {
                    function02.invoke();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addBackStackState(a aVar) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(aVar);
    }

    public k1 addFragment(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            h1.c.d(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "add: " + fragment);
        }
        k1 createOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
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

    public void addFragmentOnAttachListener(@NonNull h1 h1Var) {
        this.mOnAttachListeners.add(h1Var);
    }

    public void addOnBackStackChangedListener(@NonNull z0 z0Var) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(z0Var);
    }

    public void addRetainedFragment(@NonNull Fragment fragment) {
        this.mNonConfig.a(fragment);
    }

    public int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public void attachController(@NonNull i0 i0Var, @NonNull f0 f0Var, @Nullable Fragment fragment) {
        String str;
        if (this.mHost == null) {
            this.mHost = i0Var;
            this.mContainer = f0Var;
            this.mParent = fragment;
            if (fragment != null) {
                addFragmentOnAttachListener(new s0(fragment));
            } else if (i0Var instanceof h1) {
                addFragmentOnAttachListener((h1) i0Var);
            }
            if (this.mParent != null) {
                updateOnBackPressedCallbackEnabled();
            }
            if (i0Var instanceof androidx.activity.a0) {
                androidx.activity.a0 a0Var = (androidx.activity.a0) i0Var;
                androidx.activity.z onBackPressedDispatcher = a0Var.getOnBackPressedDispatcher();
                this.mOnBackPressedDispatcher = onBackPressedDispatcher;
                androidx.lifecycle.v vVar = a0Var;
                if (fragment != null) {
                    vVar = fragment;
                }
                onBackPressedDispatcher.a(vVar, this.mOnBackPressedCallback);
            }
            int i10 = 0;
            if (fragment != null) {
                this.mNonConfig = fragment.mFragmentManager.getChildNonConfig(fragment);
            } else if (i0Var instanceof androidx.lifecycle.e1) {
                this.mNonConfig = (g1) new h.c(((androidx.lifecycle.e1) i0Var).getViewModelStore(), g1.f1636h, 0).s(g1.class);
            } else {
                this.mNonConfig = new g1(false);
            }
            this.mNonConfig.f1642g = isStateSaved();
            this.mFragmentStore.f1683d = this.mNonConfig;
            Object obj = this.mHost;
            int i11 = 2;
            if ((obj instanceof y1.f) && fragment == null) {
                y1.d savedStateRegistry = ((y1.f) obj).getSavedStateRegistry();
                savedStateRegistry.c(SAVED_STATE_KEY, new androidx.activity.f(this, i11));
                Bundle a = savedStateRegistry.a(SAVED_STATE_KEY);
                if (a != null) {
                    restoreSaveStateInternal(a);
                }
            }
            Object obj2 = this.mHost;
            if (obj2 instanceof androidx.activity.result.h) {
                androidx.activity.result.g activityResultRegistry = ((androidx.activity.result.h) obj2).getActivityResultRegistry();
                if (fragment != null) {
                    str = vd.e.h(new StringBuilder(), fragment.mWho, ":");
                } else {
                    str = "";
                }
                String e2 = vd.e.e("FragmentManager:", str);
                this.mStartActivityForResult = activityResultRegistry.d(eb.j.k(e2, "StartActivityForResult"), new f.d(), new o0(this, 1));
                this.mStartIntentSenderForResult = activityResultRegistry.d(eb.j.k(e2, "StartIntentSenderForResult"), new v0(), new o0(this, i11));
                this.mRequestPermissions = activityResultRegistry.d(eb.j.k(e2, "RequestPermissions"), new f.c(), new o0(this, i10));
            }
            Object obj3 = this.mHost;
            if (obj3 instanceof d0.m) {
                ((d0.m) obj3).addOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
            }
            Object obj4 = this.mHost;
            if (obj4 instanceof d0.n) {
                ((d0.n) obj4).addOnTrimMemoryListener(this.mOnTrimMemoryListener);
            }
            Object obj5 = this.mHost;
            if (obj5 instanceof androidx.core.app.p1) {
                ((androidx.core.app.p1) obj5).addOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
            }
            Object obj6 = this.mHost;
            if (obj6 instanceof androidx.core.app.q1) {
                ((androidx.core.app.q1) obj6).addOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
            }
            Object obj7 = this.mHost;
            if ((obj7 instanceof n0.m) && fragment == null) {
                ((n0.m) obj7).addMenuProvider(this.mMenuProvider);
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
        return new a(this);
    }

    public boolean checkForMenus() {
        Iterator it = this.mFragmentStore.e().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                z10 = isMenuAvailable(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void clearBackStack(@NonNull String str) {
        enqueueAction(new u0(this, str, 0), false);
    }

    public boolean clearBackStackState(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
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
        y0 remove = this.mResultListeners.remove(str);
        if (remove != null) {
            remove.a.b(remove.f1763c);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Clearing FragmentResultListener for key " + str);
        }
    }

    @NonNull
    public k1 createOrGetFragmentStateManager(@NonNull Fragment fragment) {
        l1 l1Var = this.mFragmentStore;
        k1 k1Var = (k1) l1Var.f1681b.get(fragment.mWho);
        if (k1Var != null) {
            return k1Var;
        }
        k1 k1Var2 = new k1(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        k1Var2.l(this.mHost.f1648c.getClassLoader());
        k1Var2.f1679e = this.mCurState;
        return k1Var2;
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
                l1 l1Var = this.mFragmentStore;
                synchronized (l1Var.a) {
                    l1Var.a.remove(fragment);
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
        this.mNonConfig.f1642g = false;
        dispatchStateChange(4);
    }

    public void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f1642g = false;
        dispatchStateChange(0);
    }

    public void dispatchConfigurationChanged(@NonNull Configuration configuration, boolean z10) {
        if (z10 && (this.mHost instanceof d0.m)) {
            throwException(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
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
        this.mNonConfig.f1642g = false;
        dispatchStateChange(1);
    }

    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i10 = 0; i10 < this.mCreatedMenus.size(); i10++) {
                Fragment fragment2 = this.mCreatedMenus.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z10;
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        clearBackStackStateViewModels();
        dispatchStateChange(-1);
        Object obj = this.mHost;
        if (obj instanceof d0.n) {
            ((d0.n) obj).removeOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        Object obj2 = this.mHost;
        if (obj2 instanceof d0.m) {
            ((d0.m) obj2).removeOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        Object obj3 = this.mHost;
        if (obj3 instanceof androidx.core.app.p1) {
            ((androidx.core.app.p1) obj3).removeOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        Object obj4 = this.mHost;
        if (obj4 instanceof androidx.core.app.q1) {
            ((androidx.core.app.q1) obj4).removeOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        Object obj5 = this.mHost;
        if ((obj5 instanceof n0.m) && this.mParent == null) {
            ((n0.m) obj5).removeMenuProvider(this.mMenuProvider);
        }
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            Iterator it = this.mOnBackPressedCallback.f587b.iterator();
            while (it.hasNext()) {
                ((androidx.activity.c) it.next()).cancel();
            }
            this.mOnBackPressedDispatcher = null;
        }
        androidx.activity.result.c cVar = this.mStartActivityForResult;
        if (cVar != null) {
            cVar.b();
            this.mStartIntentSenderForResult.b();
            this.mRequestPermissions.b();
        }
    }

    public void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public void dispatchLowMemory(boolean z10) {
        if (z10 && (this.mHost instanceof d0.n)) {
            throwException(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.dispatchLowMemory(true);
                }
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z10, boolean z11) {
        if (z11 && (this.mHost instanceof androidx.core.app.p1)) {
            throwException(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.dispatchMultiWindowModeChanged(z10, true);
                }
            }
        }
    }

    public void dispatchOnAttachFragment(@NonNull Fragment fragment) {
        Iterator<h1> it = this.mOnAttachListeners.iterator();
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

    public void dispatchPictureInPictureModeChanged(boolean z10, boolean z11) {
        if (z11 && (this.mHost instanceof androidx.core.app.q1)) {
            throwException(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.dispatchPictureInPictureModeChanged(z10, true);
                }
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f1642g = false;
        dispatchStateChange(7);
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f1642g = false;
        dispatchStateChange(5);
    }

    public void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.f1642g = true;
        dispatchStateChange(4);
    }

    public void dispatchViewCreated() {
        dispatchStateChange(2);
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String k10 = eb.j.k(str, "    ");
        l1 l1Var = this.mFragmentStore;
        l1Var.getClass();
        String str2 = str + "    ";
        HashMap hashMap = l1Var.f1681b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (k1 k1Var : hashMap.values()) {
                printWriter.print(str);
                if (k1Var != null) {
                    Fragment fragment = k1Var.f1677c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(AbstractJsonLexerKt.NULL);
                }
            }
        }
        ArrayList arrayList = l1Var.a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                Fragment fragment2 = (Fragment) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.mCreatedMenus;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                Fragment fragment3 = this.mCreatedMenus.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<a> arrayList3 = this.mBackStack;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = this.mBackStack.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.d(k10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            int size4 = this.mPendingActions.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    Object obj = (a1) this.mPendingActions.get(i13);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
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

    public void enqueueAction(@NonNull a1 a1Var, boolean z10) {
        if (!z10) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            checkStateLoss();
        }
        synchronized (this.mPendingActions) {
            if (this.mHost == null) {
                if (z10) {
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.mPendingActions.add(a1Var);
                scheduleCommit();
            }
        }
    }

    public boolean execPendingActions(boolean z10) {
        ensureExecReady(z10);
        boolean z11 = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            z11 = true;
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.f1681b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    public void execSingleAction(@NonNull a1 a1Var, boolean z10) {
        if (z10 && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        ensureExecReady(z10);
        if (a1Var.a(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.f1681b.values().removeAll(Collections.singleton(null));
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
    public Fragment findFragmentById(int i10) {
        l1 l1Var = this.mFragmentStore;
        ArrayList arrayList = l1Var.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && fragment.mFragmentId == i10) {
                    return fragment;
                }
            } else {
                for (k1 k1Var : l1Var.f1681b.values()) {
                    if (k1Var != null) {
                        Fragment fragment2 = k1Var.f1677c;
                        if (fragment2.mFragmentId == i10) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        l1 l1Var = this.mFragmentStore;
        if (str != null) {
            ArrayList arrayList = l1Var.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (k1 k1Var : l1Var.f1681b.values()) {
                if (k1Var != null) {
                    Fragment fragment2 = k1Var.f1677c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            l1Var.getClass();
        }
        return null;
    }

    public Fragment findFragmentByWho(@NonNull String str) {
        return this.mFragmentStore.c(str);
    }

    public int getActiveFragmentCount() {
        return this.mFragmentStore.f1681b.size();
    }

    @NonNull
    public List<Fragment> getActiveFragments() {
        return this.mFragmentStore.e();
    }

    @NonNull
    public t0 getBackStackEntryAt(int i10) {
        return this.mBackStack.get(i10);
    }

    public int getBackStackEntryCount() {
        ArrayList<a> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @NonNull
    public f0 getContainer() {
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
            throwException(new IllegalStateException(eb.j.l("Fragment no longer exists for key ", str, ": unique id ", string)));
        }
        return findActiveFragment;
    }

    @NonNull
    public h0 getFragmentFactory() {
        h0 h0Var = this.mFragmentFactory;
        if (h0Var != null) {
            return h0Var;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this.mHostFragmentFactory;
    }

    @NonNull
    public l1 getFragmentStore() {
        return this.mFragmentStore;
    }

    @NonNull
    public List<Fragment> getFragments() {
        return this.mFragmentStore.f();
    }

    @NonNull
    public i0 getHost() {
        return this.mHost;
    }

    @NonNull
    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    @NonNull
    public m0 getLifecycleCallbacksDispatcher() {
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
    public f2 getSpecialEffectsControllerFactory() {
        f2 f2Var = this.mSpecialEffectsControllerFactory;
        if (f2Var != null) {
            return f2Var;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getSpecialEffectsControllerFactory();
        }
        return this.mDefaultSpecialEffectsControllerFactory;
    }

    @Nullable
    public h1.b getStrictModePolicy() {
        return this.mStrictModePolicy;
    }

    @NonNull
    public androidx.lifecycle.d1 getViewModelStore(@NonNull Fragment fragment) {
        HashMap hashMap = this.mNonConfig.f1638c;
        androidx.lifecycle.d1 d1Var = (androidx.lifecycle.d1) hashMap.get(fragment.mWho);
        if (d1Var == null) {
            androidx.lifecycle.d1 d1Var2 = new androidx.lifecycle.d1();
            hashMap.put(fragment.mWho, d1Var2);
            return d1Var2;
        }
        return d1Var;
    }

    public void handleOnBackPressed() {
        execPendingActions(true);
        if (this.mOnBackPressedCallback.a) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.b();
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

    public boolean isStateAtLeast(int i10) {
        return this.mCurState >= i10;
    }

    public boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    public void launchRequestPermissions(@NonNull Fragment fragment, @NonNull String[] strArr, int i10) {
        if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new x0(fragment.mWho, i10));
            this.mRequestPermissions.a(strArr);
            return;
        }
        this.mHost.getClass();
    }

    public void launchStartActivityForResult(@NonNull Fragment fragment, @NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new x0(fragment.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.mStartActivityForResult.a(intent);
            return;
        }
        i0 i0Var = this.mHost;
        if (i10 == -1) {
            d0.h.startActivity(i0Var.f1648c, intent, bundle);
        } else {
            i0Var.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public void launchStartIntentSenderForResult(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
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
            androidx.activity.result.i iVar = new androidx.activity.result.i(intentSender);
            iVar.f611f = intent2;
            iVar.f609c = i12;
            iVar.f608b = i11;
            androidx.activity.result.j b3 = iVar.b();
            this.mLaunchedFragments.addLast(new x0(fragment.mWho, i10));
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.mStartIntentSenderForResult.a(b3);
            return;
        }
        i0 i0Var = this.mHost;
        if (i10 == -1) {
            Activity activity = i0Var.f1647b;
            int i14 = androidx.core.app.i.a;
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        i0Var.getClass();
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void moveToState(int i10, boolean z10) {
        HashMap hashMap;
        i0 i0Var;
        if (this.mHost == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i10 == this.mCurState) {
            return;
        }
        this.mCurState = i10;
        l1 l1Var = this.mFragmentStore;
        Iterator it = l1Var.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = l1Var.f1681b;
            if (!hasNext) {
                break;
            }
            k1 k1Var = (k1) hashMap.get(((Fragment) it.next()).mWho);
            if (k1Var != null) {
                k1Var.k();
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (true) {
            boolean z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            k1 k1Var2 = (k1) it2.next();
            if (k1Var2 != null) {
                k1Var2.k();
                Fragment fragment = k1Var2.f1677c;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    z11 = true;
                }
                if (z11) {
                    if (fragment.mBeingSaved && !l1Var.f1682c.containsKey(fragment.mWho)) {
                        l1Var.i(k1Var2.n(), fragment.mWho);
                    }
                    l1Var.h(k1Var2);
                }
            }
        }
        startPendingDeferredFragments();
        if (this.mNeedMenuInvalidate && (i0Var = this.mHost) != null && this.mCurState == 7) {
            ((d0) i0Var).f1606g.invalidateMenu();
            this.mNeedMenuInvalidate = false;
        }
    }

    public void noteStateNotSaved() {
        if (this.mHost == null) {
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f1642g = false;
        for (Fragment fragment : this.mFragmentStore.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void onContainerAvailable(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        Iterator it = this.mFragmentStore.d().iterator();
        while (it.hasNext()) {
            k1 k1Var = (k1) it.next();
            Fragment fragment = k1Var.f1677c;
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                k1Var.b();
            }
        }
    }

    @NonNull
    @Deprecated
    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public void performPendingDeferredStart(@NonNull k1 k1Var) {
        Fragment fragment = k1Var.f1677c;
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
            } else {
                fragment.mDeferStart = false;
                k1Var.k();
            }
        }
    }

    public void popBackStack() {
        enqueueAction(new b1(this, null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return popBackStackImmediate(null, -1, 0);
    }

    public boolean popBackStackState(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i10, int i11) {
        boolean z10;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int findBackStackIndex = findBackStackIndex(str, i10, z10);
        if (findBackStackIndex < 0) {
            return false;
        }
        for (int size = this.mBackStack.size() - 1; size >= findBackStackIndex; size--) {
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void putFragment(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException(a4.j.g("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void registerFragmentLifecycleCallbacks(@NonNull w0 w0Var, boolean z10) {
        this.mLifecycleCallbacksDispatcher.a.add(new l0(w0Var, z10));
    }

    public void removeFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            l1 l1Var = this.mFragmentStore;
            synchronized (l1Var.a) {
                l1Var.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            setVisibleRemovingFragment(fragment);
        }
    }

    public void removeFragmentOnAttachListener(@NonNull h1 h1Var) {
        this.mOnAttachListeners.remove(h1Var);
    }

    public void removeOnBackStackChangedListener(@NonNull z0 z0Var) {
        ArrayList<z0> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(z0Var);
        }
    }

    public void removeRetainedFragment(@NonNull Fragment fragment) {
        this.mNonConfig.e(fragment);
    }

    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable d1 d1Var) {
        if (this.mHost instanceof androidx.lifecycle.e1) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.f(d1Var);
        restoreSaveStateInternal(parcelable);
    }

    public void restoreBackStack(@NonNull String str) {
        enqueueAction(new u0(this, str, 1), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0117, code lost:
    
        r1.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean restoreBackStackState(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.a> r11, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r12, @androidx.annotation.NonNull java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.restoreBackStackState(java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    public void restoreSaveState(@Nullable Parcelable parcelable) {
        if (this.mHost instanceof y1.f) {
            throwException(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        restoreSaveStateInternal(parcelable);
    }

    public void restoreSaveStateInternal(@Nullable Parcelable parcelable) {
        int i10;
        k1 k1Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(RESULT_KEY_PREFIX) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.mHost.f1648c.getClassLoader());
                this.mResults.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(FRAGMENT_KEY_PREFIX) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.mHost.f1648c.getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        HashMap hashMap2 = this.mFragmentStore.f1682c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        e1 e1Var = (e1) bundle3.getParcelable(FRAGMENT_MANAGER_STATE_KEY);
        if (e1Var == null) {
            return;
        }
        this.mFragmentStore.f1681b.clear();
        Iterator it = e1Var.f1617b.iterator();
        while (it.hasNext()) {
            Bundle i11 = this.mFragmentStore.i(null, (String) it.next());
            if (i11 != null) {
                Fragment fragment = (Fragment) this.mNonConfig.a.get(((j1) i11.getParcelable(FRAGMENT_MANAGER_STATE_KEY)).f1659c);
                if (fragment != null) {
                    if (isLoggingEnabled(2)) {
                        Log.v(TAG, "restoreSaveState: re-attaching retained " + fragment);
                    }
                    k1Var = new k1(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment, i11);
                } else {
                    k1Var = new k1(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.f1648c.getClassLoader(), getFragmentFactory(), i11);
                }
                Fragment fragment2 = k1Var.f1677c;
                fragment2.mSavedFragmentState = i11;
                fragment2.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                k1Var.l(this.mHost.f1648c.getClassLoader());
                this.mFragmentStore.g(k1Var);
                k1Var.f1679e = this.mCurState;
            }
        }
        g1 g1Var = this.mNonConfig;
        g1Var.getClass();
        Iterator it2 = new ArrayList(g1Var.a.values()).iterator();
        while (true) {
            i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if (this.mFragmentStore.f1681b.get(fragment3.mWho) != null) {
                i10 = 1;
            }
            if (i10 == 0) {
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + e1Var.f1617b);
                }
                this.mNonConfig.e(fragment3);
                fragment3.mFragmentManager = this;
                k1 k1Var2 = new k1(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment3);
                k1Var2.f1679e = 1;
                k1Var2.k();
                fragment3.mRemoving = true;
                k1Var2.k();
            }
        }
        l1 l1Var = this.mFragmentStore;
        ArrayList<String> arrayList = e1Var.f1618c;
        l1Var.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b3 = l1Var.b(str3);
                if (b3 != null) {
                    if (isLoggingEnabled(2)) {
                        Log.v(TAG, "restoreSaveState: added (" + str3 + "): " + b3);
                    }
                    l1Var.a(b3);
                } else {
                    throw new IllegalStateException(com.applovin.impl.mediation.ads.e.f("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (e1Var.f1619d != null) {
            this.mBackStack = new ArrayList<>(e1Var.f1619d.length);
            int i12 = 0;
            while (true) {
                b[] bVarArr = e1Var.f1619d;
                if (i12 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i12];
                bVar.getClass();
                a aVar = new a(this);
                bVar.a(aVar);
                aVar.f1563c = bVar.f1575i;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = bVar.f1570c;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i13);
                    if (str4 != null) {
                        aVar.mOps.get(i13).f1687b = findActiveFragment(str4);
                    }
                    i13++;
                }
                aVar.b(1);
                if (isLoggingEnabled(2)) {
                    StringBuilder m10 = a4.j.m("restoreAllState: back stack #", i12, " (index ");
                    m10.append(aVar.f1563c);
                    m10.append("): ");
                    m10.append(aVar);
                    Log.v(TAG, m10.toString());
                    PrintWriter printWriter = new PrintWriter(new x1());
                    aVar.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(aVar);
                i12++;
            }
        } else {
            this.mBackStack = null;
        }
        this.mBackStackIndex.set(e1Var.f1620f);
        String str5 = e1Var.f1621g;
        if (str5 != null) {
            Fragment findActiveFragment = findActiveFragment(str5);
            this.mPrimaryNav = findActiveFragment;
            dispatchParentPrimaryNavigationFragmentChanged(findActiveFragment);
        }
        ArrayList arrayList3 = e1Var.f1622h;
        if (arrayList3 != null) {
            while (i10 < arrayList3.size()) {
                this.mBackStackStates.put((String) arrayList3.get(i10), (c) e1Var.f1623i.get(i10));
                i10++;
            }
        }
        this.mLaunchedFragments = new ArrayDeque<>(e1Var.f1624j);
    }

    @Deprecated
    public d1 retainNonConfig() {
        if (this.mHost instanceof androidx.lifecycle.e1) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.d();
    }

    public Parcelable saveAllState() {
        if (this.mHost instanceof y1.f) {
            throwException(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle lambda$attachController$4 = lambda$attachController$4();
        if (lambda$attachController$4.isEmpty()) {
            return null;
        }
        return lambda$attachController$4;
    }

    @NonNull
    /* renamed from: saveAllStateInternal */
    public Bundle lambda$attachController$4() {
        b[] bVarArr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.f1642g = true;
        l1 l1Var = this.mFragmentStore;
        l1Var.getClass();
        HashMap hashMap = l1Var.f1681b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (k1 k1Var : hashMap.values()) {
            if (k1Var != null) {
                Fragment fragment = k1Var.f1677c;
                l1Var.i(k1Var.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.mFragmentStore.f1682c;
        if (hashMap2.isEmpty()) {
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "saveAllState: no fragments!");
            }
        } else {
            l1 l1Var2 = this.mFragmentStore;
            synchronized (l1Var2.a) {
                bVarArr = null;
                if (l1Var2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(l1Var2.a.size());
                    Iterator it = l1Var2.a.iterator();
                    while (it.hasNext()) {
                        Fragment fragment2 = (Fragment) it.next();
                        arrayList.add(fragment2.mWho);
                        if (isLoggingEnabled(2)) {
                            Log.v(TAG, "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                        }
                    }
                }
            }
            ArrayList<a> arrayList3 = this.mBackStack;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                bVarArr = new b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new b(this.mBackStack.get(i10));
                    if (isLoggingEnabled(2)) {
                        StringBuilder m10 = a4.j.m("saveAllState: adding back stack #", i10, ": ");
                        m10.append(this.mBackStack.get(i10));
                        Log.v(TAG, m10.toString());
                    }
                }
            }
            e1 e1Var = new e1();
            e1Var.f1617b = arrayList2;
            e1Var.f1618c = arrayList;
            e1Var.f1619d = bVarArr;
            e1Var.f1620f = this.mBackStackIndex.get();
            Fragment fragment3 = this.mPrimaryNav;
            if (fragment3 != null) {
                e1Var.f1621g = fragment3.mWho;
            }
            e1Var.f1622h.addAll(this.mBackStackStates.keySet());
            e1Var.f1623i.addAll(this.mBackStackStates.values());
            e1Var.f1624j = new ArrayList(this.mLaunchedFragments);
            bundle.putParcelable(FRAGMENT_MANAGER_STATE_KEY, e1Var);
            for (String str : this.mResults.keySet()) {
                bundle.putBundle(vd.e.e(RESULT_KEY_PREFIX, str), this.mResults.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(vd.e.e(FRAGMENT_KEY_PREFIX, str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public void saveBackStack(@NonNull String str) {
        enqueueAction(new u0(this, str, 2), false);
    }

    public boolean saveBackStackState(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        int i10;
        String str2;
        String str3;
        int i11;
        int findBackStackIndex = findBackStackIndex(str, -1, true);
        if (findBackStackIndex < 0) {
            return false;
        }
        for (int i12 = findBackStackIndex; i12 < this.mBackStack.size(); i12++) {
            a aVar = this.mBackStack.get(i12);
            if (!aVar.mReorderingAllowed) {
                throwException(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        int i13 = findBackStackIndex;
        while (true) {
            i10 = 8;
            if (i13 >= this.mBackStack.size()) {
                break;
            }
            a aVar2 = this.mBackStack.get(i13);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<m1> it = aVar2.mOps.iterator();
            while (it.hasNext()) {
                m1 next = it.next();
                Fragment fragment = next.f1687b;
                if (fragment != null) {
                    if (!next.f1688c || (i11 = next.a) == 1 || i11 == 2 || i11 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i14 = next.a;
                    if (i14 == 1 || i14 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder o10 = a4.j.o("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = " " + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                o10.append(str3);
                o10.append(" in ");
                o10.append(aVar2);
                o10.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                throwException(new IllegalArgumentException(o10.toString()));
            }
            i13++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder o11 = a4.j.o("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                o11.append(str2);
                o11.append("fragment ");
                o11.append(fragment2);
                throwException(new IllegalArgumentException(o11.toString()));
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
        c cVar = new c(arrayList3, arrayList4);
        int size = this.mBackStack.size() - 1;
        while (size >= findBackStackIndex) {
            a remove = this.mBackStack.remove(size);
            a aVar3 = new a(remove);
            int size2 = aVar3.mOps.size() - 1;
            while (size2 >= 0) {
                m1 m1Var = aVar3.mOps.get(size2);
                if (m1Var.f1688c) {
                    if (m1Var.a == i10) {
                        m1Var.f1688c = false;
                        size2--;
                        aVar3.mOps.remove(size2);
                    } else {
                        int i16 = m1Var.f1687b.mContainerId;
                        m1Var.a = 2;
                        m1Var.f1688c = false;
                        for (int i17 = size2 - 1; i17 >= 0; i17--) {
                            m1 m1Var2 = aVar3.mOps.get(i17);
                            if (m1Var2.f1688c && m1Var2.f1687b.mContainerId == i16) {
                                aVar3.mOps.remove(i17);
                                size2--;
                            }
                        }
                    }
                }
                size2--;
                i10 = 8;
            }
            arrayList4.set(size - findBackStackIndex, new b(aVar3));
            remove.f1564d = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
            size--;
            i10 = 8;
        }
        this.mBackStackStates.put(str, cVar);
        return true;
    }

    @Nullable
    public b0 saveFragmentInstanceState(@NonNull Fragment fragment) {
        l1 l1Var = this.mFragmentStore;
        k1 k1Var = (k1) l1Var.f1681b.get(fragment.mWho);
        if (k1Var == null || !k1Var.f1677c.equals(fragment)) {
            throwException(new IllegalStateException(a4.j.g("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        if (k1Var.f1677c.mState > -1) {
            return new b0(k1Var.n());
        }
        return null;
    }

    public void scheduleCommit() {
        synchronized (this.mPendingActions) {
            boolean z10 = true;
            if (this.mPendingActions.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.mHost.f1649d.removeCallbacks(this.mExecCommit);
                this.mHost.f1649d.post(this.mExecCommit);
                updateOnBackPressedCallbackEnabled();
            }
        }
    }

    public void setExitAnimationOrder(@NonNull Fragment fragment, boolean z10) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && (fragmentContainer instanceof FragmentContainerView)) {
            ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z10);
        }
    }

    public void setFragmentFactory(@NonNull h0 h0Var) {
        this.mFragmentFactory = h0Var;
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
            java.util.Map<java.lang.String, androidx.fragment.app.y0> r0 = r3.mResultListeners
            java.lang.Object r0 = r0.get(r4)
            androidx.fragment.app.y0 r0 = (androidx.fragment.app.y0) r0
            if (r0 == 0) goto L1c
            androidx.lifecycle.o r1 = androidx.lifecycle.o.STARTED
            androidx.lifecycle.p r2 = r0.a
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2
            androidx.lifecycle.o r2 = r2.f1835d
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

    @SuppressLint({"SyntheticAccessor"})
    public final void setFragmentResultListener(@NonNull String str, @NonNull androidx.lifecycle.v vVar, @NonNull i1 i1Var) {
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        if (((androidx.lifecycle.x) lifecycle).f1835d == androidx.lifecycle.o.DESTROYED) {
            return;
        }
        AnonymousClass6 anonymousClass6 = new androidx.lifecycle.t() { // from class: androidx.fragment.app.FragmentManager.6

            /* renamed from: b */
            public final /* synthetic */ String f1558b;

            /* renamed from: c */
            public final /* synthetic */ i1 f1559c;

            /* renamed from: d */
            public final /* synthetic */ androidx.lifecycle.p f1560d;

            public AnonymousClass6(String str2, i1 i1Var2, androidx.lifecycle.p lifecycle2) {
                r2 = str2;
                r3 = i1Var2;
                r4 = lifecycle2;
            }

            @Override // androidx.lifecycle.t
            public final void a(androidx.lifecycle.v vVar2, androidx.lifecycle.n nVar) {
                Bundle bundle;
                androidx.lifecycle.n nVar2 = androidx.lifecycle.n.ON_START;
                FragmentManager fragmentManager = FragmentManager.this;
                String str2 = r2;
                if (nVar == nVar2 && (bundle = (Bundle) fragmentManager.mResults.get(str2)) != null) {
                    ((y0) r3).a(bundle, str2);
                    fragmentManager.clearFragmentResult(str2);
                }
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    r4.b(this);
                    fragmentManager.mResultListeners.remove(str2);
                }
            }
        };
        y0 put = this.mResultListeners.put(str2, new y0(lifecycle2, i1Var2, anonymousClass6));
        if (put != null) {
            put.a.b(put.f1763c);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Setting FragmentResultListener with key " + str2 + " lifecycleOwner " + lifecycle2 + " and listener " + i1Var2);
        }
        lifecycle2.a(anonymousClass6);
    }

    public void setMaxLifecycle(@NonNull Fragment fragment, @NonNull androidx.lifecycle.o oVar) {
        if (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = oVar;
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

    public void setSpecialEffectsControllerFactory(@NonNull f2 f2Var) {
        this.mSpecialEffectsControllerFactory = f2Var;
    }

    public void setStrictModePolicy(@Nullable h1.b bVar) {
        this.mStrictModePolicy = bVar;
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
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb2.append("}");
        } else {
            i0 i0Var = this.mHost;
            if (i0Var != null) {
                sb2.append(i0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb2.append("}");
            } else {
                sb2.append(AbstractJsonLexerKt.NULL);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public void unregisterFragmentLifecycleCallbacks(@NonNull w0 w0Var) {
        m0 m0Var = this.mLifecycleCallbacksDispatcher;
        synchronized (m0Var.a) {
            int size = m0Var.a.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (((l0) m0Var.a.get(i10)).a == w0Var) {
                    m0Var.a.remove(i10);
                    break;
                }
                i10++;
            }
        }
    }

    public void popBackStack(@Nullable String str, int i10) {
        enqueueAction(new b1(this, str, -1, i10), false);
    }

    public boolean popBackStackImmediate(@Nullable String str, int i10) {
        return popBackStackImmediate(str, -1, i10);
    }

    public void popBackStack(int i10, int i11) {
        popBackStack(i10, i11, false);
    }

    public boolean popBackStackImmediate(int i10, int i11) {
        if (i10 >= 0) {
            return popBackStackImmediate(null, i10, i11);
        }
        throw new IllegalArgumentException(eb.j.i("Bad id: ", i10));
    }

    public void popBackStack(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            enqueueAction(new b1(this, null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException(eb.j.i("Bad id: ", i10));
    }

    private boolean popBackStackImmediate(@Nullable String str, int i10, int i11) {
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i10, i11);
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
        this.mFragmentStore.f1681b.values().removeAll(Collections.singleton(null));
        return popBackStackState;
    }
}
