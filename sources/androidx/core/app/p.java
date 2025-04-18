package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class p extends Activity implements androidx.lifecycle.v, n0.l {
    private final r.k extraDataMap = new r.k();
    private final androidx.lifecycle.x lifecycleRegistry = new androidx.lifecycle.x(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(decorView, event)) {
            return true;
        }
        return a6.k.o(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends o> T getExtraData(Class<T> extraDataClass) {
        Intrinsics.checkNotNullParameter(extraDataClass, "extraDataClass");
        a4.j.t(this.extraDataMap.getOrDefault(extraDataClass, null));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.o0.f1808c;
        ka.e.n(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.g(androidx.lifecycle.o.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(o extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto Lf
            int r2 = r4.length
            if (r2 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = r1
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r2 != 0) goto L66
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L56;
                case 100470631: goto L46;
                case 472614934: goto L3d;
                case 1159329357: goto L2d;
                case 1455016274: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L66
        L1c:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L25
            goto L66
        L25:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L66
        L2b:
            r1 = r0
            goto L66
        L2d:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L36
            goto L66
        L36:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L66
            goto L2b
        L3d:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4f
            goto L66
        L46:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4f
            goto L66
        L4f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L66
            goto L2b
        L56:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L5f
            goto L66
        L5f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L66
            goto L2b
        L66:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.p.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // n0.l
    public boolean superDispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
