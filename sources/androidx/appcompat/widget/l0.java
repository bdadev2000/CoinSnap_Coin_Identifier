package androidx.appcompat.widget;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class l0 {
    public static int a(@NonNull View view) {
        return view.getTextAlignment();
    }

    public static int b(@NonNull View view) {
        return view.getTextDirection();
    }

    public static void c(@NonNull View view, int i10) {
        view.setTextAlignment(i10);
    }

    public static void d(@NonNull View view, int i10) {
        view.setTextDirection(i10);
    }
}
