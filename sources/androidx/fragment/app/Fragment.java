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
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
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
import androidx.core.app.AbstractC0401b;
import androidx.core.app.AbstractC0402c;
import androidx.core.app.AbstractC0403d;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0499i;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g4.AbstractC2292b;
import i.AbstractC2330a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o0.C2491c;
import r0.AbstractC2654b;
import r0.C2655c;
import t.InterfaceC2702a;
import t0.AbstractC2703a;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0511v, androidx.lifecycle.g0, InterfaceC0499i, G0.g {
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
    E mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.d0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    Q mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0513x mLifecycleRegistry;
    EnumC0504n mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<F> mOnPreAttachedListeners;
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
    private final F mSavedStateAttachListener;
    G0.f mSavedStateRegistryController;

    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;

    @Nullable
    H0 mViewLifecycleOwner;
    androidx.lifecycle.C mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.C, androidx.lifecycle.B] */
    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManager();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0489y(0, this);
        this.mMaxState = EnumC0504n.f4895g;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.B();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C0490z(this);
        initLifecycle();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.E, java.lang.Object] */
    private E ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            ?? obj = new Object();
            obj.f4637i = null;
            Object obj2 = USE_DEFAULT_TRANSITION;
            obj.f4638j = obj2;
            obj.f4639k = null;
            obj.l = obj2;
            obj.m = null;
            obj.f4640n = obj2;
            obj.f4643q = 1.0f;
            obj.f4644r = null;
            this.mAnimationInfo = obj;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        EnumC0504n enumC0504n = this.mMaxState;
        if (enumC0504n != EnumC0504n.f4892c && this.mParentFragment != null) {
            return Math.min(enumC0504n.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return enumC0504n.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0513x(this);
        this.mSavedStateRegistryController = new G0.f(this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        H0 h02 = this.mViewLifecycleOwner;
        h02.f4657g.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> h.c prepareCallInternal(@NonNull AbstractC2330a abstractC2330a, @NonNull InterfaceC2702a interfaceC2702a, @NonNull h.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new D(this, interfaceC2702a, atomicReference, abstractC2330a, bVar));
            return new C0488x(atomicReference);
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(@NonNull F f9) {
        if (this.mState >= 0) {
            f9.a();
        } else {
            this.mOnPreAttachedListeners.add(f9);
        }
    }

    public void callStartTransitionListener(boolean z8) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        E e4 = this.mAnimationInfo;
        if (e4 != null) {
            e4.f4645s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            r n2 = r.n(viewGroup, fragmentManager);
            n2.o();
            if (z8) {
                this.mHost.f4684d.post(new RunnableC0483s(n2, 1));
            } else {
                n2.i();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    @NonNull
    public N createFragmentContainer() {
        return new A(this);
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
            AbstractC2703a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(com.mbridge.msdk.foundation.entity.o.j(str, "  "), fileDescriptor, printWriter, strArr);
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
        Q q9 = this.mHost;
        if (q9 == null) {
            return null;
        }
        return (FragmentActivity) q9.b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        E e4 = this.mAnimationInfo;
        if (e4 != null && (bool = e4.f4642p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        E e4 = this.mAnimationInfo;
        if (e4 != null && (bool = e4.f4641o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        e4.getClass();
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
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        Q q9 = this.mHost;
        if (q9 == null) {
            return null;
        }
        return q9.f4683c;
    }

    @Override // androidx.lifecycle.InterfaceC0499i
    @NonNull
    @CallSuper
    public AbstractC2654b getDefaultViewModelCreationExtras() {
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
        C2655c c2655c = new C2655c(0);
        LinkedHashMap linkedHashMap = c2655c.f22812a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.c0.f4885d, application);
        }
        linkedHashMap.put(androidx.lifecycle.V.f4868a, this);
        linkedHashMap.put(androidx.lifecycle.V.b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.V.f4869c, getArguments());
        }
        return c2655c;
    }

    @NonNull
    public androidx.lifecycle.d0 getDefaultViewModelProviderFactory() {
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
                this.mDefaultFactory = new androidx.lifecycle.Y(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return 0;
        }
        return e4.b;
    }

    @Nullable
    public Object getEnterTransition() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        return e4.f4637i;
    }

    public androidx.core.app.r0 getEnterTransitionCallback() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        e4.getClass();
        return null;
    }

    public int getExitAnim() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return 0;
        }
        return e4.f4631c;
    }

    @Nullable
    public Object getExitTransition() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        return e4.f4639k;
    }

    public androidx.core.app.r0 getExitTransitionCallback() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        e4.getClass();
        return null;
    }

    public View getFocusedView() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        return e4.f4644r;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        Q q9 = this.mHost;
        if (q9 == null) {
            return null;
        }
        return ((K) q9).f4663g;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC0511v
    @NonNull
    public AbstractC0505o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public AbstractC2703a getLoaderManager() {
        return AbstractC2703a.a(this);
    }

    public int getNextTransition() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return 0;
        }
        return e4.f4634f;
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
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return false;
        }
        return e4.f4630a;
    }

    public int getPopEnterAnim() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return 0;
        }
        return e4.f4632d;
    }

    public int getPopExitAnim() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return 0;
        }
        return e4.f4633e;
    }

    public float getPostOnViewCreatedAlpha() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return 1.0f;
        }
        return e4.f4643q;
    }

    @Nullable
    public Object getReenterTransition() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        Object obj = e4.l;
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
        C2491c c2491c = o0.d.f21935a;
        o0.d.b(new o0.i(this, "Attempting to get retain instance for fragment " + this));
        o0.d.a(this).getClass();
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        Object obj = e4.f4638j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // G0.g
    @NonNull
    public final G0.e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        return e4.m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return null;
        }
        Object obj = e4.f4640n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        E e4 = this.mAnimationInfo;
        if (e4 != null && (arrayList = e4.f4635g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        E e4 = this.mAnimationInfo;
        if (e4 != null && (arrayList = e4.f4636h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @NonNull
    public final String getString(@StringRes int i9) {
        return getResources().getString(i9);
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
        C2491c c2491c = o0.d.f21935a;
        o0.d.b(new o0.i(this, "Attempting to get target request code from fragment " + this));
        o0.d.a(this).getClass();
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i9) {
        return getResources().getText(i9);
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
    public InterfaceC0511v getViewLifecycleOwner() {
        H0 h02 = this.mViewLifecycleOwner;
        if (h02 != null) {
            return h02;
        }
        throw new IllegalStateException(Q7.n0.i("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public androidx.lifecycle.B getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.g0
    @NonNull
    public androidx.lifecycle.f0 getViewModelStore() {
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
        this.mChildFragmentManager = new FragmentManager();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
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
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
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
        E e4 = this.mAnimationInfo;
        if (e4 == null) {
            return false;
        }
        return e4.f4645s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
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
    public void onActivityResult(int i9, int i10, @Nullable Intent intent) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i9 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    @CallSuper
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        Q q9 = this.mHost;
        Activity activity = q9 == null ? null : q9.b;
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
    public Animation onCreateAnimation(int i9, boolean z8, int i10) {
        return null;
    }

    @Nullable
    public Animator onCreateAnimator(int i9, boolean z8, int i10) {
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
        int i9 = this.mContentLayoutId;
        if (i9 != 0) {
            return layoutInflater.inflate(i9, viewGroup, false);
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

    public void onHiddenChanged(boolean z8) {
    }

    @CallSuper
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        Q q9 = this.mHost;
        Activity activity = q9 == null ? null : q9.b;
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

    public void onMultiWindowModeChanged(boolean z8) {
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

    public void onPictureInPictureModeChanged(boolean z8) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z8) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i9, @NonNull String[] strArr, @NonNull int[] iArr) {
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
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<F> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f4683c);
        if (this.mCalled) {
            this.mFragmentManager.dispatchOnAttachFragment(this);
            this.mChildFragmentManager.dispatchAttach();
            return;
        }
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onAttach()"));
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
        this.mLifecycleRegistry.a(new B(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.e(EnumC0503m.ON_CREATE);
            return;
        }
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z8 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z8 = true;
        }
        return z8 | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new H0(this, getViewModelStore(), new D3.b(this, 15));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            androidx.lifecycle.V.k(this.mView, this.mViewLifecycleOwner);
            View view = this.mView;
            H0 h02 = this.mViewLifecycleOwner;
            G7.j.e(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, h02);
            AbstractC2292b.j(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.d(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f4656f == null) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.e(EnumC0503m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
        } else {
            throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null) {
            H0 h02 = this.mViewLifecycleOwner;
            h02.b();
            if (h02.f4656f.f4904d.compareTo(EnumC0504n.f4893d) >= 0) {
                this.mViewLifecycleOwner.a(EnumC0503m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            x.m mVar = AbstractC2703a.a(this).b.b;
            if (mVar.f24089d <= 0) {
                this.mPerformedCreateView = false;
                return;
            } else {
                com.mbridge.msdk.foundation.entity.o.v(mVar.f24088c[0]);
                throw null;
            }
        }
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.isDestroyed()) {
                this.mChildFragmentManager.dispatchDestroy();
                this.mChildFragmentManager = new FragmentManager();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onDetach()"));
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

    public void performMultiWindowModeChanged(boolean z8) {
        onMultiWindowModeChanged(z8);
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
            this.mViewLifecycleOwner.a(EnumC0503m.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(EnumC0503m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
        } else {
            throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z8) {
        onPictureInPictureModeChanged(z8);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z8 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z8 = true;
        }
        return z8 | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
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
            C0513x c0513x = this.mLifecycleRegistry;
            EnumC0503m enumC0503m = EnumC0503m.ON_RESUME;
            c0513x.e(enumC0503m);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(enumC0503m);
            }
            this.mChildFragmentManager.dispatchResume();
            return;
        }
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onResume()"));
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
            C0513x c0513x = this.mLifecycleRegistry;
            EnumC0503m enumC0503m = EnumC0503m.ON_START;
            c0513x.e(enumC0503m);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(enumC0503m);
            }
            this.mChildFragmentManager.dispatchStart();
            return;
        }
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC0503m.ON_STOP);
        }
        this.mLifecycleRegistry.e(EnumC0503m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
        } else {
            throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onStop()"));
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
        ensureAnimationInfo().f4645s = true;
    }

    @NonNull
    public final <I, O> h.c registerForActivityResult(@NonNull AbstractC2330a abstractC2330a, @NonNull h.b bVar) {
        return prepareCallInternal(abstractC2330a, new C(this, 0), bVar);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i9) {
        if (this.mHost != null) {
            getParentFragmentManager().launchRequestPermissions(this, strArr, i9);
            return;
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not attached to Activity"));
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not attached to a context."));
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
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(Q7.n0.i("Fragment ", this, " is not attached to any Fragment or host"));
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
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
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
                this.mViewLifecycleOwner.a(EnumC0503m.ON_CREATE);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(Q7.n0.i("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z8) {
        ensureAnimationInfo().f4642p = Boolean.valueOf(z8);
    }

    public void setAllowReturnTransitionOverlap(boolean z8) {
        ensureAnimationInfo().f4641o = Boolean.valueOf(z8);
    }

    public void setAnimations(int i9, int i10, int i11, int i12) {
        if (this.mAnimationInfo == null && i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        ensureAnimationInfo().b = i9;
        ensureAnimationInfo().f4631c = i10;
        ensureAnimationInfo().f4632d = i11;
        ensureAnimationInfo().f4633e = i12;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable androidx.core.app.r0 r0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4637i = obj;
    }

    public void setExitSharedElementCallback(@Nullable androidx.core.app.r0 r0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4639k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f4644r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z8) {
        if (this.mHasMenu != z8) {
            this.mHasMenu = z8;
            if (isAdded() && !isHidden()) {
                ((K) this.mHost).f4663g.invalidateMenu();
            }
        }
    }

    public void setInitialSavedState(@Nullable G g9) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (g9 == null || (bundle = g9.b) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z8) {
        if (this.mMenuVisible != z8) {
            this.mMenuVisible = z8;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((K) this.mHost).f4663g.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i9) {
        if (this.mAnimationInfo == null && i9 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f4634f = i9;
    }

    public void setPopDirection(boolean z8) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f4630a = z8;
    }

    public void setPostOnViewCreatedAlpha(float f9) {
        ensureAnimationInfo().f4643q = f9;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z8) {
        C2491c c2491c = o0.d.f21935a;
        o0.d.b(new o0.i(this, "Attempting to set retain instance for fragment " + this));
        o0.d.a(this).getClass();
        this.mRetainInstance = z8;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z8) {
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
        ensureAnimationInfo().f4638j = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        E e4 = this.mAnimationInfo;
        e4.f4635g = arrayList;
        e4.f4636h = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4640n = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i9) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            C2491c c2491c = o0.d.f21935a;
            o0.d.b(new o0.i(this, "Attempting to set target fragment " + fragment + " with request code " + i9 + " for fragment " + this));
            o0.d.a(this).getClass();
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException(Q7.n0.i("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i9;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z8) {
        boolean z9;
        C2491c c2491c = o0.d.f21935a;
        o0.d.b(new o0.i(this, "Attempting to set user visible hint to " + z8 + " for fragment " + this));
        o0.d.a(this).getClass();
        if (!this.mUserVisibleHint && z8 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.performPendingDeferredStart(fragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = z8;
        if (this.mState < 5 && !z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mDeferStart = z9;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z8);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        Q q9 = this.mHost;
        if (q9 == null) {
            return false;
        }
        K k6 = (K) q9;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 33) {
            k6.getClass();
            if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
        }
        FragmentActivity fragmentActivity = k6.f4663g;
        if (i9 >= 32) {
            return AbstractC0403d.a(fragmentActivity, str);
        }
        if (i9 == 31) {
            return AbstractC0402c.b(fragmentActivity, str);
        }
        return AbstractC0401b.c(fragmentActivity, str);
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i9) {
        startActivityForResult(intent, i9, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i9, @Nullable Intent intent, int i10, int i11, int i12, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i9 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().launchStartIntentSenderForResult(this, intentSender, i9, intent, i10, i11, i12, bundle);
            return;
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f4645s) {
            if (this.mHost == null) {
                ensureAnimationInfo().f4645s = false;
            } else if (Looper.myLooper() != this.mHost.f4684d.getLooper()) {
                this.mHost.f4684d.postAtFrontOfQueue(new RunnableC0489y(1, this));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Nullable
    private Fragment getTargetFragment(boolean z8) {
        String str;
        if (z8) {
            C2491c c2491c = o0.d.f21935a;
            o0.d.b(new o0.i(this, "Attempting to get target fragment from fragment " + this));
            o0.d.a(this).getClass();
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
            Fragment fragment = (Fragment) P.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(AbstractC2914a.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e9) {
            throw new RuntimeException(AbstractC2914a.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(AbstractC2914a.e("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(AbstractC2914a.e("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }

    @NonNull
    public final String getString(@StringRes int i9, @Nullable Object... objArr) {
        return getResources().getString(i9, objArr);
    }

    public final void postponeEnterTransition(long j7, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f4645s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.getHost().f4684d;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j7));
    }

    @NonNull
    public final <I, O> h.c registerForActivityResult(@NonNull AbstractC2330a abstractC2330a, @NonNull h.i iVar, @NonNull h.b bVar) {
        return prepareCallInternal(abstractC2330a, new C(iVar, 2), bVar);
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        Q q9 = this.mHost;
        if (q9 != null) {
            q9.d(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i9, @Nullable Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().launchStartActivityForResult(this, intent, i9, bundle);
            return;
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", this, " not attached to Activity"));
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        Q q9 = this.mHost;
        if (q9 != null) {
            FragmentActivity fragmentActivity = ((K) q9).f4663g;
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

    public Fragment(int i9) {
        this();
        this.mContentLayoutId = i9;
    }
}
