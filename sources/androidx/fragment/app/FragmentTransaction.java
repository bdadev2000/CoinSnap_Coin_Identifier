package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

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
    private final h0 mFragmentFactory;

    @Nullable
    String mName;
    ArrayList<m1> mOps;
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
        h0 h0Var = this.mFragmentFactory;
        if (h0Var != null) {
            if (this.mClassLoader != null) {
                Fragment a = h0Var.a(cls.getName());
                if (bundle != null) {
                    a.setArguments(bundle);
                }
                return a;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @NonNull
    public final FragmentTransaction add(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(createFragment(cls, bundle), str);
    }

    public void addOp(m1 m1Var) {
        this.mOps.add(m1Var);
        m1Var.f1689d = this.mEnterAnim;
        m1Var.f1690e = this.mExitAnim;
        m1Var.f1691f = this.mPopEnterAnim;
        m1Var.f1692g = this.mPopExitAnim;
    }

    @NonNull
    public FragmentTransaction addSharedElement(@NonNull View view, @NonNull String str) {
        s1 s1Var = n1.a;
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (this.mSharedElementSourceNames == null) {
                this.mSharedElementSourceNames = new ArrayList<>();
                this.mSharedElementTargetNames = new ArrayList<>();
            } else if (!this.mSharedElementTargetNames.contains(str)) {
                if (this.mSharedElementSourceNames.contains(transitionName)) {
                    throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
                }
            } else {
                throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("A shared element with the target name '", str, "' has already been added to the transaction."));
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
        addOp(new m1(7, fragment));
        return this;
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        addOp(new m1(6, fragment));
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

    public void doAddOp(int i10, Fragment fragment, @Nullable String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            h1.c.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                    sb2.append(fragment);
                    sb2.append(": was ");
                    throw new IllegalStateException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(sb2, fragment.mTag, " now ", str));
                }
                fragment.mTag = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.mFragmentId;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
                    }
                    fragment.mFragmentId = i10;
                    fragment.mContainerId = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            addOp(new m1(i11, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        addOp(new m1(4, fragment));
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
        addOp(new m1(3, fragment));
        return this;
    }

    @NonNull
    public final FragmentTransaction replace(int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return replace(i10, cls, bundle, null);
    }

    @NonNull
    public FragmentTransaction runOnCommit(@NonNull Runnable runnable) {
        disallowAddToBackStack();
        if (this.mCommitRunnables == null) {
            this.mCommitRunnables = new ArrayList<>();
        }
        this.mCommitRunnables.add(runnable);
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setAllowOptimization(boolean z10) {
        return setReorderingAllowed(z10);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@StringRes int i10) {
        this.mBreadCrumbShortTitleRes = i10;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@StringRes int i10) {
        this.mBreadCrumbTitleRes = i10;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(int i10, int i11) {
        return setCustomAnimations(i10, i11, 0, 0);
    }

    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull androidx.lifecycle.o oVar) {
        addOp(new m1(fragment, oVar));
        return this;
    }

    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        addOp(new m1(8, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction setReorderingAllowed(boolean z10) {
        this.mReorderingAllowed = z10;
        return this;
    }

    @NonNull
    public FragmentTransaction setTransition(int i10) {
        this.mTransition = i10;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setTransitionStyle(int i10) {
        return this;
    }

    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        addOp(new m1(5, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction add(@NonNull Fragment fragment, @Nullable String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(int i10, @NonNull Fragment fragment) {
        return replace(i10, fragment, (String) null);
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(int i10, int i11, int i12, int i13) {
        this.mEnterAnim = i10;
        this.mExitAnim = i11;
        this.mPopEnterAnim = i12;
        this.mPopExitAnim = i13;
        return this;
    }

    @NonNull
    public final FragmentTransaction add(int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return add(i10, createFragment(cls, bundle));
    }

    @NonNull
    public final FragmentTransaction replace(int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return replace(i10, createFragment(cls, bundle), str);
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
    public FragmentTransaction add(int i10, @NonNull Fragment fragment) {
        doAddOp(i10, fragment, null, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction replace(int i10, @NonNull Fragment fragment, @Nullable String str) {
        if (i10 != 0) {
            doAddOp(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @NonNull
    public final FragmentTransaction add(int i10, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(i10, createFragment(cls, bundle), str);
    }

    @NonNull
    public FragmentTransaction add(int i10, @NonNull Fragment fragment, @Nullable String str) {
        doAddOp(i10, fragment, str, 1);
        return this;
    }

    public FragmentTransaction(@NonNull h0 h0Var, @Nullable ClassLoader classLoader) {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = h0Var;
        this.mClassLoader = classLoader;
    }

    public FragmentTransaction add(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, @Nullable String str) {
        fragment.mContainer = viewGroup;
        return add(viewGroup.getId(), fragment, str);
    }

    public FragmentTransaction(@NonNull h0 h0Var, @Nullable ClassLoader classLoader, @NonNull FragmentTransaction fragmentTransaction) {
        this(h0Var, classLoader);
        Iterator<m1> it = fragmentTransaction.mOps.iterator();
        while (it.hasNext()) {
            this.mOps.add(new m1(it.next()));
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
            ArrayList<String> arrayList = new ArrayList<>();
            this.mSharedElementSourceNames = arrayList;
            arrayList.addAll(fragmentTransaction.mSharedElementSourceNames);
        }
        if (fragmentTransaction.mSharedElementTargetNames != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.mSharedElementTargetNames = arrayList2;
            arrayList2.addAll(fragmentTransaction.mSharedElementTargetNames);
        }
        this.mReorderingAllowed = fragmentTransaction.mReorderingAllowed;
    }
}
