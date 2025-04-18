package n0;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class v0 {
    public static void a(@NonNull View view, Collection<View> collection, int i10) {
        view.addKeyboardNavigationClusters(collection, i10);
    }

    public static AutofillId b(View view) {
        AutofillId autofillId;
        autofillId = view.getAutofillId();
        return autofillId;
    }

    public static int c(View view) {
        int importantForAutofill;
        importantForAutofill = view.getImportantForAutofill();
        return importantForAutofill;
    }

    public static int d(@NonNull View view) {
        int nextClusterForwardId;
        nextClusterForwardId = view.getNextClusterForwardId();
        return nextClusterForwardId;
    }

    public static boolean e(@NonNull View view) {
        boolean hasExplicitFocusable;
        hasExplicitFocusable = view.hasExplicitFocusable();
        return hasExplicitFocusable;
    }

    public static boolean f(@NonNull View view) {
        boolean isFocusedByDefault;
        isFocusedByDefault = view.isFocusedByDefault();
        return isFocusedByDefault;
    }

    public static boolean g(View view) {
        boolean isImportantForAutofill;
        isImportantForAutofill = view.isImportantForAutofill();
        return isImportantForAutofill;
    }

    public static boolean h(@NonNull View view) {
        boolean isKeyboardNavigationCluster;
        isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
        return isKeyboardNavigationCluster;
    }

    public static View i(@NonNull View view, View view2, int i10) {
        View keyboardNavigationClusterSearch;
        keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i10);
        return keyboardNavigationClusterSearch;
    }

    public static boolean j(@NonNull View view) {
        boolean restoreDefaultFocus;
        restoreDefaultFocus = view.restoreDefaultFocus();
        return restoreDefaultFocus;
    }

    public static void k(@NonNull View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void l(@NonNull View view, boolean z10) {
        view.setFocusedByDefault(z10);
    }

    public static void m(View view, int i10) {
        view.setImportantForAutofill(i10);
    }

    public static void n(@NonNull View view, boolean z10) {
        view.setKeyboardNavigationCluster(z10);
    }

    public static void o(View view, int i10) {
        view.setNextClusterForwardId(i10);
    }

    public static void p(@NonNull View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
