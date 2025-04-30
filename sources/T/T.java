package T;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class T {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(@NonNull View view, @NonNull Y y4) {
        x.l lVar = (x.l) view.getTag(R.id.tag_unhandled_key_listeners);
        x.l lVar2 = lVar;
        if (lVar == null) {
            x.l lVar3 = new x.l();
            view.setTag(R.id.tag_unhandled_key_listeners, lVar3);
            lVar2 = lVar3;
        }
        Objects.requireNonNull(y4);
        ?? obj = new Object();
        lVar2.put(y4, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(@NonNull View view, @NonNull Y y4) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        x.l lVar = (x.l) view.getTag(R.id.tag_unhandled_key_listeners);
        if (lVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) lVar.getOrDefault(y4, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i9) {
        return (T) view.requireViewById(i9);
    }

    public static void g(View view, boolean z8) {
        view.setAccessibilityHeading(z8);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, W.a aVar) {
        AutofillId autofillId;
        if (aVar == null) {
            autofillId = null;
        } else {
            autofillId = (AutofillId) aVar.f3548a;
        }
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z8) {
        view.setScreenReaderFocusable(z8);
    }
}
