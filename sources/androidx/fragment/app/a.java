package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends FragmentTransaction implements t0, a1 {
    public final FragmentManager a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1562b;

    /* renamed from: c, reason: collision with root package name */
    public int f1563c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1564d;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().f1648c.getClassLoader() : null);
        this.f1563c = -1;
        this.f1564d = false;
        this.a = fragmentManager;
    }

    @Override // androidx.fragment.app.a1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.mAddToBackStack) {
            this.a.addBackStackState(this);
            return true;
        }
        return true;
    }

    public final void b(int i10) {
        if (!this.mAddToBackStack) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Bump nesting in " + this + " by " + i10);
        }
        int size = this.mOps.size();
        for (int i11 = 0; i11 < size; i11++) {
            m1 m1Var = this.mOps.get(i11);
            Fragment fragment = m1Var.f1687b;
            if (fragment != null) {
                fragment.mBackStackNesting += i10;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Bump nesting of " + m1Var.f1687b + " to " + m1Var.f1687b.mBackStackNesting);
                }
            }
        }
    }

    public final int c(boolean z10) {
        if (!this.f1562b) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new x1());
                d("  ", printWriter, true);
                printWriter.close();
            }
            this.f1562b = true;
            boolean z11 = this.mAddToBackStack;
            FragmentManager fragmentManager = this.a;
            if (z11) {
                this.f1563c = fragmentManager.allocBackStackIndex();
            } else {
                this.f1563c = -1;
            }
            fragmentManager.enqueueAction(this, z10);
            return this.f1563c;
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
        this.a.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.a.execSingleAction(this, true);
    }

    public final void d(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1563c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1562b);
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
            for (int i10 = 0; i10 < size; i10++) {
                m1 m1Var = this.mOps.get(i10);
                switch (m1Var.a) {
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
                        str2 = "cmd=" + m1Var.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(m1Var.f1687b);
                if (z10) {
                    if (m1Var.f1689d != 0 || m1Var.f1690e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(m1Var.f1689d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(m1Var.f1690e));
                    }
                    if (m1Var.f1691f != 0 || m1Var.f1692g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(m1Var.f1691f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(m1Var.f1692g));
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction detach(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void doAddOp(int i10, Fragment fragment, String str, int i11) {
        super.doAddOp(i10, fragment, str, i11);
        fragment.mFragmentManager = this.a;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction hide(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.a) {
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
        if (fragmentManager != null && fragmentManager != this.a) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setMaxLifecycle(Fragment fragment, androidx.lifecycle.o oVar) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.a;
        if (fragmentManager == fragmentManager2) {
            if (oVar == androidx.lifecycle.o.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + oVar + " after the Fragment has been created");
            }
            if (oVar != androidx.lifecycle.o.DESTROYED) {
                return super.setMaxLifecycle(fragment, oVar);
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + oVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.a) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction show(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.a) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1563c >= 0) {
            sb2.append(" #");
            sb2.append(this.f1563c);
        }
        if (this.mName != null) {
            sb2.append(" ");
            sb2.append(this.mName);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public a(a aVar) {
        super(aVar.a.getFragmentFactory(), aVar.a.getHost() != null ? aVar.a.getHost().f1648c.getClassLoader() : null, aVar);
        this.f1563c = -1;
        this.f1564d = false;
        this.a = aVar.a;
        this.f1562b = aVar.f1562b;
        this.f1563c = aVar.f1563c;
        this.f1564d = aVar.f1564d;
    }
}
