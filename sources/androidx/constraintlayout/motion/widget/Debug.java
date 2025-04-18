package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.support.v4.media.d;
import android.view.View;

/* loaded from: classes3.dex */
public class Debug {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String a(int i2, Context context) {
        if (i2 == -1) {
            return "UNKNOWN";
        }
        try {
            i2 = context.getResources().getResourceEntryName(i2);
            return i2;
        } catch (Exception unused) {
            return d.i("?", i2);
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
