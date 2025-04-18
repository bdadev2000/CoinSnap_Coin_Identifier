package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {

    /* renamed from: p, reason: collision with root package name */
    public final FragmentManager f19651p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19652q;

    /* renamed from: r, reason: collision with root package name */
    public int f19653r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f19654s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BackStackRecord(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.G()
            androidx.fragment.app.FragmentHostCallback r1 = r3.f19757u
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.f19732b
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f19653r = r0
            r0 = 0
            r2.f19654s = r0
            r2.f19651p = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackRecord.<init>(androidx.fragment.app.FragmentManager):void");
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f19812g) {
            return true;
        }
        FragmentManager fragmentManager = this.f19651p;
        if (fragmentManager.d == null) {
            fragmentManager.d = new ArrayList();
        }
        fragmentManager.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int c() {
        return i(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int d() {
        return i(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void e() {
        if (this.f19812g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f19651p.z(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void f(int i2, Fragment fragment, String str, int i3) {
        super.f(i2, fragment, str, i3);
        fragment.mFragmentManager = this.f19651p;
    }

    public final void h(int i2) {
        if (this.f19812g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f19808a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList.get(i3);
                Fragment fragment = op.f19822b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f19822b + " to " + op.f19822b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int i(boolean z2) {
        if (this.f19652q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.f19652q = true;
        boolean z3 = this.f19812g;
        FragmentManager fragmentManager = this.f19651p;
        if (z3) {
            this.f19653r = fragmentManager.f19745i.getAndIncrement();
        } else {
            this.f19653r = -1;
        }
        fragmentManager.w(this, z2);
        return this.f19653r;
    }

    public final void j() {
        if (this.f19812g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f19651p.z(this, true);
    }

    public final void k(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f19813h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f19653r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f19652q);
            if (this.f19811f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f19811f));
            }
            if (this.f19809b != 0 || this.f19810c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f19809b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f19810c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f19814i != 0 || this.f19815j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f19814i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f19815j);
            }
            if (this.f19816k != 0 || this.f19817l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f19816k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f19817l);
            }
        }
        ArrayList arrayList = this.f19808a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList.get(i2);
            switch (op.f19821a) {
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
                    str2 = "cmd=" + op.f19821a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(op.f19822b);
            if (z2) {
                if (op.d != 0 || op.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(op.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(op.e));
                }
                if (op.f19824f != 0 || op.f19825g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(op.f19824f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(op.f19825g));
                }
            }
        }
    }

    public final void l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f19651p) {
            b(new FragmentTransaction.Op(fragment, 3));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f19653r >= 0) {
            sb.append(" #");
            sb.append(this.f19653r);
        }
        if (this.f19813h != null) {
            sb.append(" ");
            sb.append(this.f19813h);
        }
        sb.append("}");
        return sb.toString();
    }
}
