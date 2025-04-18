package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.cooldev.gba.emulator.gameboy.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class AccessibilityDelegateCompat {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* loaded from: classes3.dex */
    public static final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final AccessibilityDelegateCompat f18688a;

        public AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.f18688a = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f18688a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat accessibilityNodeProvider = this.f18688a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f18848a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f18688a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            Boolean bool = (Boolean) new ViewCompat.AccessibilityViewProperty(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(view);
            boolean z2 = (bool == null || !bool.booleanValue()) ? 0 : 1;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z2);
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                }
            }
            Boolean bool2 = (Boolean) new ViewCompat.AccessibilityViewProperty(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(view);
            boolean z3 = bool2 != null && bool2.booleanValue();
            if (i2 >= 28) {
                accessibilityNodeInfo.setHeading(z3);
            } else {
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z3 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
                }
            }
            CharSequence g2 = ViewCompat.g(view);
            if (i2 >= 28) {
                accessibilityNodeInfo.setPaneTitle(g2);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", g2);
            }
            accessibilityNodeInfoCompat.q((CharSequence) new ViewCompat.AccessibilityViewProperty(R.id.tag_state_description, CharSequence.class, 64, 30).c(view));
            this.f18688a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfo.getText();
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = AccessibilityDelegateCompat.getActionList(view);
            for (int i3 = 0; i3 < actionList.size(); i3++) {
                accessibilityNodeInfoCompat.b(actionList.get(i3));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f18688a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f18688a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f18688a.performAccessibilityAction(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i2) {
            this.f18688a.sendAccessibilityEvent(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f18688a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public AccessibilityDelegateCompat() {
        this(DEFAULT_DELEGATE);
    }

    public static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Nullable
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f18826a);
    }

    public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(@androidx.annotation.NonNull android.view.View r8, int r9, @androidx.annotation.Nullable android.os.Bundle r10) {
        /*
            r7 = this;
            java.util.List r0 = getActionList(r8)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L50
            java.lang.Object r3 = r0.get(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
            int r5 = r3.a()
            if (r5 != r9) goto L4d
            androidx.core.view.accessibility.AccessibilityViewCommand r0 = r3.d
            if (r0 == 0) goto L50
            java.lang.Class r2 = r3.f18845c
            if (r2 == 0) goto L47
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L35
            java.lang.Object r3 = r3.newInstance(r5)     // Catch: java.lang.Exception -> L35
            androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments r3 = (androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments) r3     // Catch: java.lang.Exception -> L35
            r3.getClass()     // Catch: java.lang.Exception -> L33
            goto L48
        L33:
            r5 = move-exception
            goto L37
        L35:
            r5 = move-exception
            r3 = r4
        L37:
            java.lang.String r2 = r2.getName()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r2 = r6.concat(r2)
            java.lang.String r6 = "A11yActionCompat"
            android.util.Log.e(r6, r2, r5)
            goto L48
        L47:
            r3 = r4
        L48:
            boolean r0 = r0.perform(r8, r3)
            goto L51
        L4d:
            int r2 = r2 + 1
            goto L6
        L50:
            r0 = r1
        L51:
            if (r0 != 0) goto L59
            android.view.View$AccessibilityDelegate r0 = r7.mOriginalDelegate
            boolean r0 = r0.performAccessibilityAction(r8, r9, r10)
        L59:
            if (r0 != 0) goto Lb7
            r2 = 2131361807(0x7f0a000f, float:1.8343377E38)
            if (r9 != r2) goto Lb7
            if (r10 == 0) goto Lb7
            java.lang.String r9 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r9 = r10.getInt(r9, r0)
            r10 = 2131362341(0x7f0a0225, float:1.834446E38)
            java.lang.Object r10 = r8.getTag(r10)
            android.util.SparseArray r10 = (android.util.SparseArray) r10
            if (r10 == 0) goto Lb6
            java.lang.Object r9 = r10.get(r9)
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            if (r9 == 0) goto Lb6
            java.lang.Object r9 = r9.get()
            android.text.style.ClickableSpan r9 = (android.text.style.ClickableSpan) r9
            if (r9 == 0) goto Lb6
            android.view.accessibility.AccessibilityNodeInfo r10 = r8.createAccessibilityNodeInfo()
            java.lang.CharSequence r10 = r10.getText()
            boolean r0 = r10 instanceof android.text.Spanned
            if (r0 == 0) goto La0
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r10 = r10.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r10 = r0.getSpans(r1, r10, r2)
            r4 = r10
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        La0:
            r10 = r1
        La1:
            if (r4 == 0) goto Lb6
            int r0 = r4.length
            if (r10 >= r0) goto Lb6
            r0 = r4[r10]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lb3
            r9.onClick(r8)
            r1 = 1
            goto Lb6
        Lb3:
            int r10 = r10 + 1
            goto La1
        Lb6:
            r0 = r1
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.AccessibilityDelegateCompat.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }

    public void sendAccessibilityEvent(@NonNull View view, int i2) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i2);
    }

    public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new AccessibilityDelegateAdapter(this);
    }
}
