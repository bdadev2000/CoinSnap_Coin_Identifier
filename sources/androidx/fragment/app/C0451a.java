package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.EnumC0504n;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451a extends FragmentTransaction implements InterfaceC0458d0, InterfaceC0472k0 {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f4693a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public int f4694c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4695d;

    public C0451a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().f4683c.getClassLoader() : null);
        this.f4694c = -1;
        this.f4695d = false;
        this.f4693a = fragmentManager;
    }

    @Override // androidx.fragment.app.InterfaceC0472k0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.mAddToBackStack) {
            this.f4693a.addBackStackState(this);
            return true;
        }
        return true;
    }

    public final void b(int i9) {
        if (!this.mAddToBackStack) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Bump nesting in " + this + " by " + i9);
        }
        int size = this.mOps.size();
        for (int i10 = 0; i10 < size; i10++) {
            y0 y0Var = this.mOps.get(i10);
            Fragment fragment = y0Var.b;
            if (fragment != null) {
                fragment.mBackStackNesting += i9;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Bump nesting of " + y0Var.b + " to " + y0Var.b.mBackStackNesting);
                }
            }
        }
    }

    public final int c(boolean z8) {
        if (!this.b) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new I0());
                d("  ", printWriter, true);
                printWriter.close();
            }
            this.b = true;
            boolean z9 = this.mAddToBackStack;
            FragmentManager fragmentManager = this.f4693a;
            if (z9) {
                this.f4694c = fragmentManager.allocBackStackIndex();
            } else {
                this.f4694c = -1;
            }
            fragmentManager.enqueueAction(this, z8);
            return this.f4694c;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commit() {
        return c(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commitAllowingStateLoss() {
        return c(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNow() {
        disallowAddToBackStack();
        this.f4693a.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.f4693a.execSingleAction(this, true);
    }

    public final void d(String str, PrintWriter printWriter, boolean z8) {
        String str2;
        if (z8) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4694c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (!this.mOps.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.mOps.size();
            for (int i9 = 0; i9 < size; i9++) {
                y0 y0Var = this.mOps.get(i9);
                switch (y0Var.f4805a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + y0Var.f4805a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(y0Var.b);
                if (z8) {
                    if (y0Var.f4807d != 0 || y0Var.f4808e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(y0Var.f4807d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(y0Var.f4808e));
                    }
                    if (y0Var.f4809f != 0 || y0Var.f4810g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(y0Var.f4809f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(y0Var.f4810g));
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction detach(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4693a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void doAddOp(int i9, Fragment fragment, String str, int i10) {
        super.doAddOp(i9, fragment, str, i10);
        fragment.mFragmentManager = this.f4693a;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction hide(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4693a) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction remove(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4693a) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setMaxLifecycle(Fragment fragment, EnumC0504n enumC0504n) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f4693a;
        if (fragmentManager == fragmentManager2) {
            if (enumC0504n == EnumC0504n.f4892c && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0504n + " after the Fragment has been created");
            }
            if (enumC0504n != EnumC0504n.b) {
                return super.setMaxLifecycle(fragment, enumC0504n);
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0504n + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.f4693a) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction show(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f4693a) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4694c >= 0) {
            sb.append(" #");
            sb.append(this.f4694c);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    public C0451a(C0451a c0451a) {
        super(c0451a.f4693a.getFragmentFactory(), c0451a.f4693a.getHost() != null ? c0451a.f4693a.getHost().f4683c.getClassLoader() : null, c0451a);
        this.f4694c = -1;
        this.f4695d = false;
        this.f4693a = c0451a.f4693a;
        this.b = c0451a.b;
        this.f4694c = c0451a.f4694c;
        this.f4695d = c0451a.f4695d;
    }
}
