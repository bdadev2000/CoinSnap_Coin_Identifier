package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.EnumC0504n;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {
    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SET_MAX_LIFECYCLE = 10;
    static final int OP_SET_PRIMARY_NAV = 8;
    static final int OP_SHOW = 5;
    static final int OP_UNSET_PRIMARY_NAV = 9;
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE = 8197;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN = 4100;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    private final ClassLoader mClassLoader;
    ArrayList<Runnable> mCommitRunnables;
    int mEnterAnim;
    int mExitAnim;
    private final P mFragmentFactory;

    @Nullable
    String mName;
    ArrayList<y0> mOps;
    int mPopEnterAnim;
    int mPopExitAnim;
    boolean mReorderingAllowed;
    ArrayList<String> mSharedElementSourceNames;
    ArrayList<String> mSharedElementTargetNames;
    int mTransition;

    @Deprecated
    public FragmentTransaction() {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = null;
        this.mClassLoader = null;
    }

    @NonNull
    private Fragment createFragment(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        P p2 = this.mFragmentFactory;
        if (p2 != null) {
            if (this.mClassLoader != null) {
                Fragment a6 = p2.a(cls.getName());
                if (bundle != null) {
                    a6.setArguments(bundle);
                }
                return a6;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @NonNull
    public final FragmentTransaction add(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(createFragment(cls, bundle), str);
    }

    public void addOp(y0 y0Var) {
        this.mOps.add(y0Var);
        y0Var.f4807d = this.mEnterAnim;
        y0Var.f4808e = this.mExitAnim;
        y0Var.f4809f = this.mPopEnterAnim;
        y0Var.f4810g = this.mPopExitAnim;
    }

    @NonNull
    public FragmentTransaction addSharedElement(@NonNull View view, @NonNull String str) {
        E0 e02 = z0.f4814a;
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (this.mSharedElementSourceNames == null) {
                this.mSharedElementSourceNames = new ArrayList<>();
                this.mSharedElementTargetNames = new ArrayList<>();
            } else if (!this.mSharedElementTargetNames.contains(str)) {
                if (this.mSharedElementSourceNames.contains(transitionName)) {
                    throw new IllegalArgumentException(AbstractC2914a.e("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
                }
            } else {
                throw new IllegalArgumentException(AbstractC2914a.e("A shared element with the target name '", str, "' has already been added to the transaction."));
            }
            this.mSharedElementSourceNames.add(transitionName);
            this.mSharedElementTargetNames.add(str);
            return this;
        }
        throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
    }

    @NonNull
    public FragmentTransaction addToBackStack(@Nullable String str) {
        if (this.mAllowAddToBackStack) {
            this.mAddToBackStack = true;
            this.mName = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @NonNull
    public FragmentTransaction attach(@NonNull Fragment fragment) {
        addOp(new y0(7, fragment));
        return this;
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        addOp(new y0(6, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction disallowAddToBackStack() {
        if (!this.mAddToBackStack) {
            this.mAllowAddToBackStack = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void doAddOp(int i9, Fragment fragment, @Nullable String str, int i10) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            o0.d.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(fragment);
                    sb.append(": was ");
                    throw new IllegalStateException(Q7.n0.l(sb, fragment.mTag, " now ", str));
                }
                fragment.mTag = str;
            }
            if (i9 != 0) {
                if (i9 != -1) {
                    int i11 = fragment.mFragmentId;
                    if (i11 != 0 && i11 != i9) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i9);
                    }
                    fragment.mFragmentId = i9;
                    fragment.mContainerId = i9;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            addOp(new y0(i10, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        addOp(new y0(4, fragment));
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment) {
        addOp(new y0(3, fragment));
        return this;
    }

    @NonNull
    public final FragmentTransaction replace(int i9, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return replace(i9, cls, bundle, null);
    }

    @NonNull
    public FragmentTransaction runOnCommit(@NonNull Runnable runnable) {
        return runOnCommitInternal(false, runnable);
    }

    @NonNull
    public FragmentTransaction runOnCommitInternal(boolean z8, @NonNull Runnable runnable) {
        if (!z8) {
            disallowAddToBackStack();
        }
        if (this.mCommitRunnables == null) {
            this.mCommitRunnables = new ArrayList<>();
        }
        this.mCommitRunnables.add(runnable);
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setAllowOptimization(boolean z8) {
        return setReorderingAllowed(z8);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@StringRes int i9) {
        this.mBreadCrumbShortTitleRes = i9;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@StringRes int i9) {
        this.mBreadCrumbTitleRes = i9;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(int i9, int i10) {
        return setCustomAnimations(i9, i10, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.y0, java.lang.Object] */
    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull EnumC0504n enumC0504n) {
        ?? obj = new Object();
        obj.f4805a = 10;
        obj.b = fragment;
        obj.f4806c = false;
        obj.f4811h = fragment.mMaxState;
        obj.f4812i = enumC0504n;
        addOp(obj);
        return this;
    }

    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        addOp(new y0(8, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction setReorderingAllowed(boolean z8) {
        this.mReorderingAllowed = z8;
        return this;
    }

    @NonNull
    public FragmentTransaction setTransition(int i9) {
        this.mTransition = i9;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setTransitionStyle(int i9) {
        return this;
    }

    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        addOp(new y0(5, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction add(@NonNull Fragment fragment, @Nullable String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(int i9, @NonNull Fragment fragment) {
        return replace(i9, fragment, (String) null);
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(int i9, int i10, int i11, int i12) {
        this.mEnterAnim = i9;
        this.mExitAnim = i10;
        this.mPopEnterAnim = i11;
        this.mPopExitAnim = i12;
        return this;
    }

    @NonNull
    public final FragmentTransaction add(int i9, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return add(i9, createFragment(cls, bundle));
    }

    @NonNull
    public final FragmentTransaction replace(int i9, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return replace(i9, createFragment(cls, bundle), str);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@Nullable CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@Nullable CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    @NonNull
    public FragmentTransaction add(int i9, @NonNull Fragment fragment) {
        doAddOp(i9, fragment, null, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(int i9, @NonNull Fragment fragment, @Nullable String str) {
        if (i9 != 0) {
            doAddOp(i9, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @NonNull
    public final FragmentTransaction add(int i9, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(i9, createFragment(cls, bundle), str);
    }

    @NonNull
    public FragmentTransaction add(int i9, @NonNull Fragment fragment, @Nullable String str) {
        doAddOp(i9, fragment, str, 1);
        return this;
    }

    public FragmentTransaction(@NonNull P p2, @Nullable ClassLoader classLoader) {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = p2;
        this.mClassLoader = classLoader;
    }

    @NonNull
    public final FragmentTransaction add(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, @Nullable String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return add(viewGroup.getId(), fragment, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.y0, java.lang.Object] */
    public FragmentTransaction(@NonNull P p2, @Nullable ClassLoader classLoader, @NonNull FragmentTransaction fragmentTransaction) {
        this(p2, classLoader);
        Iterator<y0> it = fragmentTransaction.mOps.iterator();
        while (it.hasNext()) {
            y0 next = it.next();
            ArrayList<y0> arrayList = this.mOps;
            ?? obj = new Object();
            obj.f4805a = next.f4805a;
            obj.b = next.b;
            obj.f4806c = next.f4806c;
            obj.f4807d = next.f4807d;
            obj.f4808e = next.f4808e;
            obj.f4809f = next.f4809f;
            obj.f4810g = next.f4810g;
            obj.f4811h = next.f4811h;
            obj.f4812i = next.f4812i;
            arrayList.add(obj);
        }
        this.mEnterAnim = fragmentTransaction.mEnterAnim;
        this.mExitAnim = fragmentTransaction.mExitAnim;
        this.mPopEnterAnim = fragmentTransaction.mPopEnterAnim;
        this.mPopExitAnim = fragmentTransaction.mPopExitAnim;
        this.mTransition = fragmentTransaction.mTransition;
        this.mAddToBackStack = fragmentTransaction.mAddToBackStack;
        this.mAllowAddToBackStack = fragmentTransaction.mAllowAddToBackStack;
        this.mName = fragmentTransaction.mName;
        this.mBreadCrumbShortTitleRes = fragmentTransaction.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = fragmentTransaction.mBreadCrumbShortTitleText;
        this.mBreadCrumbTitleRes = fragmentTransaction.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = fragmentTransaction.mBreadCrumbTitleText;
        if (fragmentTransaction.mSharedElementSourceNames != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.mSharedElementSourceNames = arrayList2;
            arrayList2.addAll(fragmentTransaction.mSharedElementSourceNames);
        }
        if (fragmentTransaction.mSharedElementTargetNames != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.mSharedElementTargetNames = arrayList3;
            arrayList3.addAll(fragmentTransaction.mSharedElementTargetNames);
        }
        this.mReorderingAllowed = fragmentTransaction.mReorderingAllowed;
    }
}
