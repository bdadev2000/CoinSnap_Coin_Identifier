package androidx.core.app;

import T.InterfaceC0276j;
import a.AbstractC0325a;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0511v;

/* renamed from: androidx.core.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0412m extends Activity implements InterfaceC0511v, InterfaceC0276j {
    private final x.l extraDataMap = new x.l();
    private final C0513x lifecycleRegistry = new C0513x(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        G7.j.e(keyEvent, NotificationCompat.CATEGORY_EVENT);
        View decorView = getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        if (ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0325a.f(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        G7.j.e(keyEvent, NotificationCompat.CATEGORY_EVENT);
        View decorView = getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        if (ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends AbstractC0411l> T getExtraData(Class<T> cls) {
        G7.j.e(cls, "extraDataClass");
        com.mbridge.msdk.foundation.entity.o.v(this.extraDataMap.getOrDefault(cls, null));
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0511v
    public AbstractC0505o getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i9 = androidx.lifecycle.Q.f4860c;
        androidx.lifecycle.V.i(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        G7.j.e(bundle, "outState");
        this.lifecycleRegistry.g(EnumC0504n.f4893d);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(AbstractC0411l abstractC0411l) {
        G7.j.e(abstractC0411l, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L5c
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L5c
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L4c;
                case 100470631: goto L3c;
                case 472614934: goto L33;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5c
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L5c
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L5c
        L21:
            r1 = r0
            goto L5c
        L23:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L2c
            goto L5c
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L5c
            goto L21
        L33:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L3c:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L45:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L5c
            goto L21
        L4c:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L55
            goto L5c
        L55:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L5c
            goto L21
        L5c:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AbstractActivityC0412m.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // T.InterfaceC0276j
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        G7.j.e(keyEvent, NotificationCompat.CATEGORY_EVENT);
        return super.dispatchKeyEvent(keyEvent);
    }
}
