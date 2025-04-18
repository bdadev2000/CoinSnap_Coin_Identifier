package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.lifecycle.LiveData;
import com.plantcare.ai.identifier.plantid.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.v, androidx.lifecycle.e1, androidx.lifecycle.j, y1.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    y mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.a1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    i0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.x mLifecycleRegistry;
    androidx.lifecycle.o mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<a0> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @Nullable
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final a0 mSavedStateAttachListener;
    y1.e mSavedStateRegistryController;

    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @Nullable
    v1 mViewLifecycleOwner;
    androidx.lifecycle.e0 mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    /* renamed from: androidx.fragment.app.Fragment$6 */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements androidx.lifecycle.t {
        public AnonymousClass6() {
        }

        @Override // androidx.lifecycle.t
        public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
            View view;
            if (nVar == androidx.lifecycle.n.ON_STOP && (view = Fragment.this.mView) != null) {
                view.cancelPendingInputEvents();
            }
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new c1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new s(0, this);
        this.mMaxState = androidx.lifecycle.o.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.e0();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new t(this);
        initLifecycle();
    }

    public static /* synthetic */ void a(Fragment fragment) {
        fragment.lambda$performCreateView$0();
    }

    private y ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new y();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        androidx.lifecycle.o oVar = this.mMaxState;
        if (oVar != androidx.lifecycle.o.INITIALIZED && this.mParentFragment != null) {
            return Math.min(oVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return oVar.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mSavedStateRegistryController = ka.e.g(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    public void lambda$performCreateView$0() {
        v1 v1Var = this.mViewLifecycleOwner;
        v1Var.f1730h.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> androidx.activity.result.c prepareCallInternal(@NonNull f.b bVar, @NonNull n.a aVar, @NonNull androidx.activity.result.b bVar2) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new x(this, aVar, atomicReference, bVar, bVar2));
            return new androidx.activity.result.d(this, atomicReference, bVar, 2);
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(@NonNull a0 a0Var) {
        if (this.mState >= 0) {
            a0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(a0Var);
        }
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        y yVar = this.mAnimationInfo;
        if (yVar != null) {
            yVar.f1761s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            e2 j3 = e2.j(viewGroup, fragmentManager);
            j3.k();
            if (z10) {
                this.mHost.f1649d.post(new u(j3));
            } else {
                j3.g();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    @NonNull
    public f0 createFragmentContainer() {
        return new v(this);
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            l1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(eb.j.k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.findFragmentByWho(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        i0 i0Var = this.mHost;
        if (i0Var == null) {
            return null;
        }
        return (FragmentActivity) i0Var.f1647b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        y yVar = this.mAnimationInfo;
        if (yVar != null && (bool = yVar.f1758p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        y yVar = this.mAnimationInfo;
        if (yVar != null && (bool = yVar.f1757o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        i0 i0Var = this.mHost;
        if (i0Var == null) {
            return null;
        }
        return i0Var.f1648c;
    }

    @Override // androidx.lifecycle.j
    @NonNull
    @CallSuper
    public k1.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        k1.e eVar = new k1.e();
        if (application != null) {
            eVar.b(b6.b.f2295g, application);
        }
        eVar.b(jb.g.f19884b, this);
        eVar.b(jb.g.f19885c, this);
        if (getArguments() != null) {
            eVar.b(jb.g.f19886d, getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.j
    @NonNull
    public androidx.lifecycle.a1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && FragmentManager.isLoggingEnabled(3)) {
                    Log.d(FragmentManager.TAG, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new androidx.lifecycle.u0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f1744b;
    }

    @Nullable
    public Object getEnterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f1751i;
    }

    public androidx.core.app.y1 getEnterTransitionCallback() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public int getExitAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f1745c;
    }

    @Nullable
    public Object getExitTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f1753k;
    }

    public androidx.core.app.y1 getExitTransitionCallback() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public View getFocusedView() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f1760r;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        i0 i0Var = this.mHost;
        if (i0Var == null) {
            return null;
        }
        return ((d0) i0Var).f1606g;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.v
    @NonNull
    public androidx.lifecycle.p getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public l1.a getLoaderManager() {
        return l1.a.a(this);
    }

    public int getNextTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f1748f;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return false;
        }
        return yVar.a;
    }

    public int getPopEnterAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f1746d;
    }

    public int getPopExitAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f1747e;
    }

    public float getPostOnViewCreatedAlpha() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 1.0f;
        }
        return yVar.f1759q;
    }

    @Nullable
    public Object getReenterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f1754l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        h1.b bVar = h1.c.a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        h1.e eVar = new h1.e(0, this);
        h1.c.c(eVar);
        h1.b a = h1.c.a(this);
        if (a.a.contains(h1.a.DETECT_RETAIN_INSTANCE_USAGE) && h1.c.e(a, getClass(), h1.e.class)) {
            h1.c.b(a, eVar);
        }
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f1752j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // y1.f
    @NonNull
    public final y1.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f27886b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f1755m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f1756n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        y yVar = this.mAnimationInfo;
        if (yVar != null && (arrayList = yVar.f1749g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        y yVar = this.mAnimationInfo;
        if (yVar != null && (arrayList = yVar.f1750h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @NonNull
    public final String getString(@StringRes int i10) {
        return getResources().getString(i10);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        h1.b bVar = h1.c.a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        h1.f fVar = new h1.f(0, this);
        h1.c.c(fVar);
        h1.b a = h1.c.a(this);
        if (a.a.contains(h1.a.DETECT_TARGET_FRAGMENT_USAGE) && h1.c.e(a, getClass(), h1.f.class)) {
            h1.c.b(a, fVar);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    public androidx.lifecycle.v getViewLifecycleOwner() {
        v1 v1Var = this.mViewLifecycleOwner;
        if (v1Var != null) {
            return v1Var;
        }
        throw new IllegalStateException(a4.j.g("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public LiveData<androidx.lifecycle.v> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.e1
    @NonNull
    public androidx.lifecycle.d1 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != 1) {
                return this.mFragmentManager.getViewModelStore(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new c1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        if (!this.mHidden && ((fragmentManager = this.mFragmentManager) == null || !fragmentManager.isParentHidden(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.isParentMenuVisible(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return false;
        }
        return yVar.f1761s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    @CallSuper
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @CallSuper
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        i0 i0Var = this.mHost;
        Activity activity = i0Var == null ? null : i0Var.f1647b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (!this.mChildFragmentManager.isStateAtLeast(1)) {
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    @Nullable
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    @Nullable
    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @CallSuper
    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    @CallSuper
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        i0 i0Var = this.mHost;
        Activity activity = i0Var == null ? null : i0Var.f1647b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    @CallSuper
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @CallSuper
    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @CallSuper
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @CallSuper
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.dispatchActivityCreated();
            return;
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<a0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f1648c);
        if (this.mCalled) {
            this.mFragmentManager.dispatchOnAttachFragment(this);
            this.mChildFragmentManager.dispatchAttach();
            return;
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.dispatchContextItemSelected(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.t() { // from class: androidx.fragment.app.Fragment.6
            public AnonymousClass6() {
            }

            @Override // androidx.lifecycle.t
            public final void a(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                View view;
                if (nVar == androidx.lifecycle.n.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_CREATE);
            return;
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        boolean z10 = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new v1(this, getViewModelStore(), new androidx.activity.d(this, 7));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            com.facebook.internal.i.H(this.mView, this.mViewLifecycleOwner);
            View view = this.mView;
            v1 v1Var = this.mViewLifecycleOwner;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, v1Var);
            com.facebook.appevents.o.v(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f1729g == null) {
            z10 = false;
        }
        if (!z10) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
        } else {
            throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null) {
            v1 v1Var = this.mViewLifecycleOwner;
            v1Var.b();
            if (v1Var.f1729g.f1835d.a(androidx.lifecycle.o.CREATED)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            r.l lVar = l1.a.a(this).f21112b.a;
            if (lVar.f23959d <= 0) {
                this.mPerformedCreateView = false;
                return;
            } else {
                a4.j.t(lVar.f23958c[0]);
                throw null;
            }
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.isDestroyed()) {
                this.mChildFragmentManager.dispatchDestroy();
                this.mChildFragmentManager = new c1();
                return;
            }
            return;
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onDetach()"));
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
        } else {
            throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != isPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(isPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.x xVar = this.mLifecycleRegistry;
            androidx.lifecycle.n nVar = androidx.lifecycle.n.ON_RESUME;
            xVar.e(nVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(nVar);
            }
            this.mChildFragmentManager.dispatchResume();
            return;
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            androidx.lifecycle.x xVar = this.mLifecycleRegistry;
            androidx.lifecycle.n nVar = androidx.lifecycle.n.ON_START;
            xVar.e(nVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(nVar);
            }
            this.mChildFragmentManager.dispatchStart();
            return;
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_STOP);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
        } else {
            throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        this.mChildFragmentManager.dispatchViewCreated();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f1761s = true;
    }

    @NonNull
    public final <I, O> androidx.activity.result.c registerForActivityResult(@NonNull f.b bVar, @NonNull androidx.activity.result.b bVar2) {
        return prepareCallInternal(bVar, new o0(this, 4), bVar2);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().launchRequestPermissions(this, strArr, i10);
            return;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not attached to Activity"));
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(a4.j.g("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.restoreSaveStateInternal(bundle);
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.n.ON_CREATE);
                return;
            }
            return;
        }
        throw new g2(a4.j.g("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f1758p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f1757o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f1744b = i10;
        ensureAnimationInfo().f1745c = i11;
        ensureAnimationInfo().f1746d = i12;
        ensureAnimationInfo().f1747e = i13;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable androidx.core.app.y1 y1Var) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1751i = obj;
    }

    public void setExitSharedElementCallback(@Nullable androidx.core.app.y1 y1Var) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1753k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f1760r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (isAdded() && !isHidden()) {
                ((d0) this.mHost).f1606g.invalidateMenu();
            }
        }
    }

    public void setInitialSavedState(@Nullable b0 b0Var) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (b0Var == null || (bundle = b0Var.f1583b) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((d0) this.mHost).f1606g.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f1748f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f1759q = f10;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1754l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        h1.b bVar = h1.c.a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        h1.e eVar = new h1.e(1, this);
        h1.c.c(eVar);
        h1.b a = h1.c.a(this);
        if (a.a.contains(h1.a.DETECT_RETAIN_INSTANCE_USAGE) && h1.c.e(a, getClass(), h1.e.class)) {
            h1.c.b(a, eVar);
        }
        this.mRetainInstance = z10;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z10) {
                fragmentManager.addRetainedFragment(this);
                return;
            } else {
                fragmentManager.removeRetainedFragment(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1752j = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1755m = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        y yVar = this.mAnimationInfo;
        yVar.f1749g = arrayList;
        yVar.f1750h = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1756n = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment targetFragment, int i10) {
        FragmentManager fragmentManager;
        if (targetFragment != null) {
            h1.b bVar = h1.c.a;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            h1.h hVar = new h1.h(this, targetFragment, i10);
            h1.c.c(hVar);
            h1.b a = h1.c.a(this);
            if (a.a.contains(h1.a.DETECT_TARGET_FRAGMENT_USAGE) && h1.c.e(a, getClass(), h1.h.class)) {
                h1.c.b(a, hVar);
            }
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (targetFragment != null) {
            fragmentManager = targetFragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException(a4.j.g("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment = targetFragment; fragment != null; fragment = fragment.getTargetFragment(false)) {
            if (fragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + targetFragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (targetFragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && targetFragment.mFragmentManager != null) {
            this.mTargetWho = targetFragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = targetFragment;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        boolean z11;
        h1.b bVar = h1.c.a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        h1.i iVar = new h1.i(this, z10);
        h1.c.c(iVar);
        h1.b a = h1.c.a(this);
        if (a.a.contains(h1.a.DETECT_SET_USER_VISIBLE_HINT) && h1.c.e(a, getClass(), h1.i.class)) {
            h1.c.b(a, iVar);
        }
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.performPendingDeferredStart(fragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        i0 i0Var = this.mHost;
        if (i0Var != null) {
            return androidx.core.app.i.b(((d0) i0Var).f1606g, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().launchStartIntentSenderForResult(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f1761s) {
            if (this.mHost == null) {
                ensureAnimationInfo().f1761s = false;
                return;
            }
            int i10 = 1;
            if (Looper.myLooper() != this.mHost.f1649d.getLooper()) {
                this.mHost.f1649d.postAtFrontOfQueue(new s(i10, this));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Nullable
    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            h1.b bVar = h1.c.a;
            Intrinsics.checkNotNullParameter(this, "fragment");
            h1.f fVar = new h1.f(1, this);
            h1.c.c(fVar);
            h1.b a = h1.c.a(this);
            if (a.a.contains(h1.a.DETECT_TARGET_FRAGMENT_USAGE) && h1.c.e(a, getClass(), h1.f.class)) {
                h1.c.b(a, fVar);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.findActiveFragment(str);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragment = (Fragment) h0.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e2) {
            throw new z(com.applovin.impl.mediation.ads.e.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e10) {
            throw new z(com.applovin.impl.mediation.ads.e.f("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new z(com.applovin.impl.mediation.ads.e.f("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new z(com.applovin.impl.mediation.ads.e.f("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }

    @NonNull
    public final String getString(@StringRes int i10, @Nullable Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j3, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f1761s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.getHost().f1649d;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j3));
    }

    @NonNull
    public final <I, O> androidx.activity.result.c registerForActivityResult(@NonNull f.b bVar, @NonNull androidx.activity.result.g gVar, @NonNull androidx.activity.result.b bVar2) {
        return prepareCallInternal(bVar, new w(this, gVar), bVar2);
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        i0 i0Var = this.mHost;
        if (i0Var != null) {
            d0.h.startActivity(i0Var.f1648c, intent, bundle);
            return;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().launchStartActivityForResult(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException(a4.j.g("Fragment ", this, " not attached to Activity"));
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        i0 i0Var = this.mHost;
        if (i0Var != null) {
            FragmentActivity fragmentActivity = ((d0) i0Var).f1606g;
            LayoutInflater cloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
            cloneInContext.setFactory2(this.mChildFragmentManager.getLayoutInflaterFactory());
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @CallSuper
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private void restoreViewState() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }
}
