package n0;

import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class y0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [n0.x0, java.lang.Object] */
    public static void a(@NonNull View view, @NonNull d1 d1Var) {
        r.k kVar = (r.k) view.getTag(R.id.tag_unhandled_key_listeners);
        r.k kVar2 = kVar;
        if (kVar == null) {
            r.k kVar3 = new r.k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar3);
            kVar2 = kVar3;
        }
        Objects.requireNonNull(d1Var);
        ?? r02 = new View.OnUnhandledKeyEventListener() { // from class: n0.x0
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                throw null;
            }
        };
        kVar2.put(d1Var, r02);
        view.addOnUnhandledKeyEventListener(r02);
    }

    public static CharSequence b(View view) {
        CharSequence accessibilityPaneTitle;
        accessibilityPaneTitle = view.getAccessibilityPaneTitle();
        return accessibilityPaneTitle;
    }

    public static boolean c(View view) {
        boolean isAccessibilityHeading;
        isAccessibilityHeading = view.isAccessibilityHeading();
        return isAccessibilityHeading;
    }

    public static boolean d(View view) {
        boolean isScreenReaderFocusable;
        isScreenReaderFocusable = view.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public static void e(@NonNull View view, @NonNull d1 d1Var) {
        View.OnUnhandledKeyEventListener i10;
        r.k kVar = (r.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar != null && (i10 = w0.i(kVar.getOrDefault(d1Var, null))) != null) {
            view.removeOnUnhandledKeyEventListener(i10);
        }
    }

    public static <T> T f(View view, int i10) {
        KeyEvent.Callback requireViewById;
        requireViewById = view.requireViewById(i10);
        return (T) requireViewById;
    }

    public static void g(View view, boolean z10) {
        view.setAccessibilityHeading(z10);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, q0.a aVar) {
        AutofillId g10;
        if (aVar == null) {
            g10 = null;
        } else {
            g10 = u0.g(aVar.a);
        }
        view.setAutofillId(g10);
    }

    public static void j(View view, boolean z10) {
        view.setScreenReaderFocusable(z10);
    }
}
