package androidx.compose.ui.platform;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$keyInputModifier$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16250a;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q0.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FocusDirection f16251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FocusDirection focusDirection) {
            super(1);
            this.f16251a = focusDirection;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Boolean h2 = FocusTransactionsKt.h((FocusTargetNode) obj, this.f16251a.f14833a);
            return Boolean.valueOf(h2 != null ? h2.booleanValue() : true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f16250a = androidComposeView;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).f15514a;
        AndroidComposeView androidComposeView = this.f16250a;
        androidComposeView.getClass();
        long a2 = Key_androidKt.a(keyEvent.getKeyCode());
        FocusDirection focusDirection = Key.a(a2, Key.f15506h) ? new FocusDirection(keyEvent.isShiftPressed() ? 2 : 1) : Key.a(a2, Key.f15504f) ? new FocusDirection(4) : Key.a(a2, Key.e) ? new FocusDirection(3) : (Key.a(a2, Key.f15503c) || Key.a(a2, Key.f15509k)) ? new FocusDirection(5) : (Key.a(a2, Key.d) || Key.a(a2, Key.f15510l)) ? new FocusDirection(6) : (Key.a(a2, Key.f15505g) || Key.a(a2, Key.f15507i) || Key.a(a2, Key.f15511m)) ? new FocusDirection(7) : (Key.a(a2, Key.f15502b) || Key.a(a2, Key.f15508j)) ? new FocusDirection(8) : null;
        if (focusDirection == null || !KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 2)) {
            return Boolean.FALSE;
        }
        Rect K = androidComposeView.K();
        FocusOwner focusOwner = androidComposeView.getFocusOwner();
        AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1 androidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1 = new AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1(focusDirection);
        int i2 = focusDirection.f14833a;
        Boolean a3 = focusOwner.a(i2, K, androidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1);
        if (a3 == null || a3.booleanValue()) {
            return Boolean.TRUE;
        }
        if (!FocusDirection.a(i2, 1) && !FocusDirection.a(i2, 2)) {
            return Boolean.FALSE;
        }
        Integer c2 = FocusInteropUtils_androidKt.c(i2);
        if (c2 == null) {
            throw new IllegalStateException("Invalid focus direction".toString());
        }
        int intValue = c2.intValue();
        android.graphics.Rect a4 = K != null ? RectHelper_androidKt.a(K) : null;
        if (a4 == null) {
            throw new IllegalStateException("Invalid rect".toString());
        }
        View view = androidComposeView;
        loop0: while (true) {
            if (view == null) {
                view = null;
                break;
            }
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = androidComposeView.getRootView();
            p0.a.q(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
            if (view != null) {
                if (!p0.a.g(view, androidComposeView)) {
                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                        if (parent == androidComposeView) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        if (!(!p0.a.g(view, androidComposeView))) {
            view = null;
        }
        if ((view == null || !FocusInteropUtils_androidKt.b(view, Integer.valueOf(intValue), a4)) && androidComposeView.getFocusOwner().o(i2, false, false)) {
            Boolean a5 = androidComposeView.getFocusOwner().a(i2, null, new AnonymousClass1(focusDirection));
            return Boolean.valueOf(a5 != null ? a5.booleanValue() : true);
        }
        return Boolean.TRUE;
    }
}
